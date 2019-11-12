import AntlrGen.CYXBaseVisitor;
import AntlrGen.CYXParser;
import Util.CYXException;
import Util.Log;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.ArrayList;
import java.util.List;

public class CYXInterpreterVisitor extends CYXBaseVisitor<CYXValue> {
    private CYXScope scope; // 全局作用域

    public CYXInterpreterVisitor(CYXScope scope) {
        this.scope = scope;
    }

    @Override
    public CYXValue visitAddSubExpr(CYXParser.AddSubExprContext ctx) {
        if (ctx.op.getType() == CYXParser.ADD)
            return varAdd(ctx);
        else if (ctx.op.getType() == CYXParser.SUB)
            return varSub(ctx);
        else throw new CYXException("ERROR:未知的运算符:" + ctx.op.getText(), ctx);

    }

    @Override
    public CYXValue visitNumberExpr(CYXParser.NumberExprContext ctx) {
        CYXValue val;
        String rawVal = ctx.number().getText();
        if (ctx.number().DECIMAL() != null)
            val = new CYXValue(Double.valueOf(rawVal));
        else if (ctx.number().INT() != null)
            val = new CYXValue((Integer.valueOf(rawVal)));
        else
            val = new CYXValue(null);
        return val;
    }

    @Override
    public CYXValue visitBooleanExpr(CYXParser.BooleanExprContext ctx) {
        return new CYXValue(Boolean.valueOf(ctx.BOOL().getText()));
    }

    @Override
    public CYXValue visitLogANDExpr(CYXParser.LogANDExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));

        return new CYXValue(left.checkTrue() && right.checkTrue());
    }

    @Override
    public CYXValue visitLogORExpr(CYXParser.LogORExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));
        return new CYXValue(left.checkTrue() || right.checkTrue());
    }

    @Override
    public CYXValue visitMinusExpr(CYXParser.MinusExprContext ctx) {
        CYXValue val = visit(ctx.expr());
        if (val.isInt())
            return new CYXValue(0 - val.toInt());
        if (val.isDouble())
            return new CYXValue(0 - val.toDouble());
        throw new CYXException("ERROR:取负仅可用于数字", ctx);
    }

    @Override
    public CYXValue visitIfStmts(CYXParser.IfStmtsContext ctx) {
        CYXValue ifCondition = visit(ctx.ifStmt().expr());

        // if
        if (ifCondition.checkTrue())
            return visit(ctx.ifStmt().block());

        // else if
        for (CYXParser.ElseifStmtContext elseifStmtContext : ctx.elseifStmt()) {
            CYXValue elseifCondition = visit(elseifStmtContext.expr());
            if (elseifCondition.checkTrue())
                return visit(elseifStmtContext.block());
        }
        // else
        if (ctx.elseStmt() != null)// else 存在?
            return visit(ctx.elseStmt().block());
        return CYXValue.VOID;
    }

    @Override
    public CYXValue visitForStmt(CYXParser.ForStmtContext ctx) {
        scope = new CYXScope(scope);
        CYXValue val = CYXValue.NULL; // 可能的 block 返回值

        if (ctx.varDeclStmt() != null)
            visit(ctx.varDeclStmt());
        else
            visit(ctx.varAssignStmt());
        while (true) {
            if (ctx.cond != null) { // for 第二个参数真假情况
                if (!visit(ctx.cond).checkTrue())
                    break;
            }
            val = visit(ctx.block());
            if (val.getSourceType() == CYXValue.SourceType.RETURN)
                break;
            if (ctx.step != null)
                visit(ctx.step);
        }

        scope = scope.parent(); // 作用域切回去
        return val;
    }

    @Override
    public CYXValue visitReturnStmt(CYXParser.ReturnStmtContext ctx) {
        CYXValue retval = new CYXValue(null);
        if (ctx.expr() != null)
            retval = visit(ctx.expr());
        retval.setSourceType(CYXValue.SourceType.RETURN);
        return retval;
    }

    // { stmt* }
    @Override
    public CYXValue visitBlock(CYXParser.BlockContext ctx) {
        // 新变量作用域
        scope = new CYXScope(scope);
        // 返回值
        CYXValue retval = CYXValue.VOID;
        // 执行语句
        for (CYXParser.StmtContext stmtCtx : ctx.stmt()) {
            if (stmtCtx.returnStmt() != null) { // return语句
                retval = visit(stmtCtx.returnStmt());
                retval.setSourceType(CYXValue.SourceType.RETURN);
                break;
            } else
                retval = visit(stmtCtx);
        }
        scope = scope.parent(); // 执行完了，作用域切回去
        return retval;
    }

    @Override
    public CYXValue visitWhileStmt(CYXParser.WhileStmtContext ctx) {
        CYXValue retval = CYXValue.VOID;
        while (visit(ctx.expr()).checkTrue()) {
            retval = visit(ctx.block());
        }
        return retval;
    }

    // exprexpr -> ( expr )
    @Override
    public CYXValue visitSubExprExpr(CYXParser.SubExprExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public CYXValue visitMulDivModExpr(CYXParser.MulDivModExprContext ctx) {
        CYXValue val;
        switch (ctx.op.getType()) {
            case CYXParser.MUL:
                val = varMul(ctx);
                break;
            case CYXParser.DIV:
                val = varDiv(ctx);
                break;
            case CYXParser.MOD:
                val = varMod(ctx);
                break;
            default:
                val = new CYXValue(null);
                break;
        }
        return val;
    }

    @Override
    public CYXValue visitSelfAddSub(CYXParser.SelfAddSubContext ctx) {
        CYXValue val = scope.getVarVal(ctx.ID().getText());
        String varName = ctx.ID().getText();
        CYXValue oldVal = scope.getVarVal(varName);
        CYXValue newVal = oldVal;
        // 是数字?
        if (val.isNumber()) {
            if (val.isInt()) {
                // 自增?
                if (ctx.op.getType() == CYXParser.SELFADD)
                    newVal = new CYXValue(val.toInt() + 1);
                else
                    newVal = new CYXValue(val.toInt() - 1);
            } else if (val.isDouble()) {
                if (ctx.op.getType() == CYXParser.SELFADD)
                    newVal = new CYXValue(val.toDouble() + 1);
                else
                    newVal = new CYXValue(val.toDouble() - 1);
            }
            if (oldVal == null)
                return oldVal;
            else {
                scope.assignVar(ctx.ID().getText(), newVal);
                return oldVal;
            }
        }
        throw new CYXException("ERROR: '++', '--' 运算仅可用于数字", ctx);
    }

//    @Override
//    public CYXValue visitSelfAddSubExpr(CYXParser.SelfAddSubExprContext ctx) {
//        CYXValue val = scope.getVarVal(ctx.selfAddSub().ID().getText());
//        String varName = ctx.selfAddSub().ID().getText();
//        CYXValue oldVal = scope.getVarVal(varName);
//        CYXValue newVal = oldVal;
//        Log.d(newVal.toString());
//        // 是数字?
//        if (val.isNumber()) {
//            if (val.isInt()) {
//                // 自增?
//                if (ctx.selfAddSub().op.getType() == CYXParser.SELFADD)
//                    newVal = new CYXValue(val.toInt() + 1);
//                else
//                    newVal = new CYXValue(val.toInt() - 1);
//            } else if (val.isDouble()) {
//                if (ctx.selfAddSub().op.getType() == CYXParser.SELFADD)
//                    newVal = new CYXValue(val.toDouble() + 1);
//                else
//                    newVal = new CYXValue(val.toDouble() - 1);
//            }
//            Log.d(newVal.toString());
//            if (oldVal == null)
//                return oldVal;
//            else {
//                scope.assign(ctx.selfAddSub().ID().getText(), newVal);
//                return oldVal;
//            }
//        }
//        throw new CYXException("ERROR: '++', '--' 运算仅可用于数字", ctx);
//    }

    @Override
    public CYXValue visitCmpExpr(CYXParser.CmpExprContext ctx) {
        switch (ctx.op.getType()) {
            case CYXParser.GE:
                return varGE(ctx);
            case CYXParser.LE:
                return varLE(ctx);
            case CYXParser.GT:
                return varGT(ctx);
            case CYXParser.LT:
                return varLT(ctx);
        }
        throw new CYXException("ERROR: 未知比较运算符", ctx);
    }

    @Override
    public CYXValue visitBitORExpr(CYXParser.BitORExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));
        if (left.isInt() && right.isInt())
            return new CYXValue(left.toInt() | right.toInt());
        throw new CYXException("ERROR:算数或运算仅可用于两个INT间", ctx);
    }

    @Override
    public CYXValue visitEqExpr(CYXParser.EqExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));
        return new CYXValue(left.equals(right));
    }

    @Override
    public CYXValue visitBitXORExpr(CYXParser.BitXORExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));
        if (left.isInt() && right.isInt())
            return new CYXValue(left.toInt() ^ right.toInt());
        throw new CYXException("ERROR:算数异或运算仅可用于两个INT间", ctx);
    }

    @Override
    public CYXValue visitBitANDExpr(CYXParser.BitANDExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));
        if (left.isInt() && right.isInt())
            return new CYXValue(left.toInt() & right.toInt());
        throw new CYXException("ERROR:算数与运算仅可用于两个INT间", ctx);
    }

    @Override
    public CYXValue visitIdentifierExpr(CYXParser.IdentifierExprContext ctx) {
        if (ctx.varFunExpr().varNameExpr() != null) {
            CYXValue val = scope.getVarVal(ctx.varFunExpr().varNameExpr().ID().getText());
            CYXValue curVal = val;
            if (ctx.varFunExpr().varNameExpr().subScripts() != null) { // 写了下标
                if (val.isList()) { // 是数组吗
                    for (CYXParser.SubScriptContext context : ctx.varFunExpr().varNameExpr().subScripts().subScript()) { // 多维数组？
                        if (context.expr() != null) {
                            int sub = visit(context.expr()).toInt();
                            if (curVal.isList() && curVal.toList().size() > sub)
                                curVal = curVal.toList().get(sub);
                            else
                                throw new CYXException("ERROR:数组越界", ctx);
                        } else { // id[] 空
                            throw new CYXException("ERROR:[]不能为空", ctx);
                        }
                    }
                    val = curVal;
                } else
                    throw new CYXException("[]运算符仅可用于数组", ctx);
            }
            if (val == null)
                throw new CYXException("ERROR:变量 " + ctx.start.getText() + " 未声明", ctx);
            return val;
        } else if (ctx.varFunExpr().funCall() != null) {
            CYXFunctionCall fun = scope.getFunCall(ctx.varFunExpr().funCall().ID().getText());
            if (fun != null)
                return visit(ctx.varFunExpr().funCall());
            else throw new CYXException("ERROR:函数 " + ctx.start.getText() + " 未声明");
        }
        throw new CYXException("ERROR:未知异常");
    }

    @Override
    public CYXValue visitList(CYXParser.ListContext ctx) {
        CYXValue retval;
        List tmpList = new ArrayList<>();
        for (CYXParser.SubListContext subListContext : ctx.subList()) {
            if (subListContext.expr() != null)
                tmpList.add(visit(subListContext.expr()));
            else if (subListContext.list() != null)
                tmpList.add(visit(subListContext.list()));
            else
                throw new CYXException("ERROR: 未知异常", ctx);
        }
        retval = new CYXValue(tmpList);
        return retval;
    }

    @Override
    public CYXValue visitFunDeclStmt(CYXParser.FunDeclStmtContext ctx) {
        String funName = ctx.ID().getText();
        List tmpArgs = new ArrayList<>();
        int argsSize = ctx.params().param().size();
        for (CYXParser.ParamContext context : ctx.params().param()) {
            tmpArgs.add(context.ID().getText());
        }
        scope.declFun(ctx.block(), funName, argsSize, tmpArgs);
        return CYXValue.NULL;
    }

    @Override
    public CYXValue visitFunCall(CYXParser.FunCallContext ctx) {
        String fun = (ctx.ID().getText());
        List arg = new ArrayList<>();

        for (CYXParser.ExprContext exprContext : ctx.args().expr()) {
            arg.add(visit(exprContext));
        }
        CYXValue funCallRetVal = scope.getFunCall(fun).invoke(scope, arg);
        return funCallRetVal;
    }

    @Override
    public CYXValue visitVarDeclStmt(CYXParser.VarDeclStmtContext ctx) {
        String varType = ctx.varType().getText();
        Class<?> varDeclType = Object.class;
        String varName = ctx.varNameExpr().ID().getText();
        Object varVal = CYXValue.NULL;
        switch (varType) {
            case "int":
                varVal = new CYXValue(0);
                varDeclType = Integer.class;
                break;
            case "double":
                varVal = new CYXValue(0.0);
                varDeclType = Double.class;
                break;
            case "string":
                varVal = new CYXValue("");
                varDeclType = String.class;
                break;
            case "bool":
                varVal = new CYXValue(false);
                varDeclType = Boolean.class;
                break;
            case "list":
                varVal = new CYXValue(new ArrayList<>());
                varDeclType = ArrayList.class;
                break;
            default:
                varVal = CYXValue.NULL;
                break;
        }
        if (ctx.subList() != null) {
            if (ctx.subList().expr() != null)
                varVal = visit(ctx.subList().expr());
            else if (ctx.subList().list() != null) {
                varVal = visit(ctx.subList().list());
            }
        }
        if (!varType.equals("var") && varDeclType != ((CYXValue) varVal).getType()) // 类型检查
            throw new CYXException("ERROR, 声明类型与数据类型不符", ctx);
        scope.declVar(varName, (CYXValue) varVal);
        return CYXValue.VOID;
    }

    @Override
    public CYXValue visitVarAssignStmt(CYXParser.VarAssignStmtContext ctx) {
        CYXValue val;
        CYXValue oldVal = scope.getVarVal(ctx.varNameExpr().ID().getText()); // 取旧值
        if (oldVal != null) { // 取到了吗 || 是否已经声明

            // 取要赋的值
            if (ctx.subList().expr() != null)
                val = visit(ctx.subList().expr());
            else if (ctx.subList().list() != null)
                val = visit(ctx.subList().list());
            else
                throw new CYXException("ERROR:未知异常", ctx);

            if (ctx.varNameExpr().subScripts() != null) { // 数组赋值？
                val = setListIndex(ctx.varNameExpr().subScripts(), oldVal, val, 0);
            }
            scope.assignVar(ctx.varNameExpr().ID().getText(), val);
            return CYXValue.VOID;
        }
        throw new CYXException("ERROR:变量 " + ctx.start.getText() + " 未声明", ctx);
    }

    // 递归赋值
    private CYXValue setListIndex(CYXParser.SubScriptsContext ctx, CYXValue oldVal, CYXValue newVal, int idx) {
        // eg
        // oldVal = [1,2,3,[4,5]]
        // oldVal[3][1] = 2
        // idx 为数组深度
        if (idx == ctx.subScript().size() - 1) { // 递归出口 最里面的赋值
            int sub = visit(ctx.subScript(idx).expr()).toInt(); // 取到 [3][1] 的 1
            oldVal.toList().set(sub, newVal); // 原生方法
            return oldVal; // 返回修改结果
        }
        int upSub = visit(ctx.subScript(idx).expr()).toInt(); // 上一层给数组的下标 [3]
        CYXValue curVal = oldVal.toList().get(upSub); // 修改 x[3] = [4,5]
        setListIndex(ctx, curVal, newVal, idx + 1); // 下层递归
        return oldVal;
    }

    @Override
    public CYXValue visitStringExpr(CYXParser.StringExprContext ctx) {
        String val = ctx.STRING().getText();
        return new CYXValue(val.substring(1, val.length() - 1));
    }


    @Override
    public CYXValue visitPrintStmt(CYXParser.PrintStmtContext ctx) {
        if (ctx.expr().size() > 0) {
            for (CYXParser.ExprContext exprContext : ctx.expr()) {
                System.out.print(visit(exprContext));
            }
        }
        return CYXValue.VOID;
    }

    @Override
    public CYXValue visitPrintlnStmt(CYXParser.PrintlnStmtContext ctx) {
        if (ctx.expr().size() > 0) {
            for (CYXParser.ExprContext exprContext : ctx.expr()) {
                System.out.println(visit(exprContext));
            }
        } else {
            System.out.println();
        }
        return CYXValue.VOID;
    }

    // 变量相加
    private CYXValue varAdd(CYXParser.AddSubExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));

        // 两个 null 相加
        if (left == CYXValue.NULL && right == CYXValue.NULL)
            return CYXValue.NULL;

        if (left == CYXValue.NULL)
            left = new CYXValue("null");
        if (right == CYXValue.NULL)
            right = new CYXValue("null");

        // 数字相加
        if (left.isNumber() && right.isNumber()) {
            // 都是整数？
            if (left.isInt() && right.isInt())
                return new CYXValue(left.toInt() + right.toInt());
            else
                return new CYXValue(left.toDouble() + right.toDouble());
        }

        if (left.isList()) {
            ArrayList tmpList = new ArrayList<>();
            if (right.isList()) {
                tmpList.addAll(left.toList());
                tmpList.addAll(right.toList());
            } else {
                tmpList.addAll(left.toList());
                tmpList.add(right);
            }
            return new CYXValue(tmpList);
        }

        // string + 其他
        return new CYXValue(left.toStr() + right.toStr());
    }

    // 变量相减
    private CYXValue varSub(CYXParser.AddSubExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));
        // 都是数字
        if (left.isNumber() && right.isNumber()) {
            // 都是整数
            if (left.isInt() && right.isInt())
                return new CYXValue(left.toInt() - right.toInt());
            else
                return new CYXValue(left.toDouble() - right.toDouble());
        }

        if (left.isList()) {
            ArrayList tmpList = (ArrayList) left.toList();
            tmpList.remove(right);
            return new CYXValue(tmpList);
        }

        // 其他
        throw new CYXException("ERROR:变量相减仅限数字", ctx);
    }

    private CYXValue varMul(CYXParser.MulDivModExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));
        // 都是数字
        if (left.isNumber() && right.isNumber()) {
            // 都是整数
            if (left.isInt() && right.isInt())
                return new CYXValue(left.toInt() * right.toInt());
            else
                return new CYXValue(left.toDouble() * right.toDouble());
        } else if (left.isString() && right.isInt()) {
            StringBuilder retval = new StringBuilder(left.toStr());
            for (int i = 1; i < right.toInt(); i++)
                retval.append(left.toStr());
            return new CYXValue(retval.toString());
        } else if (left.isInt() && right.isString()) {
            StringBuilder retval = new StringBuilder(right.toStr());
            for (int i = 1; i < left.toInt(); i++)
                retval.append(right.toStr());
            return new CYXValue(retval.toString());
        }
        // 其他
        throw new CYXException("ERROR:变量相乘仅限数字和字符串", ctx);
    }

    private CYXValue varDiv(CYXParser.MulDivModExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));
        if (left.isNumber() && right.isNumber())
            return new CYXValue(left.toDouble() / right.toDouble());
        throw new CYXException("ERROR:变量相乘仅限数字", ctx);
    }

    private CYXValue varMod(CYXParser.MulDivModExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));
        if (left.isNumber() && right.isNumber())
            return new CYXValue(left.toDouble() % right.toDouble());
        throw new CYXException("ERROR:变量取模仅限数字", ctx);
    }

    private CYXValue varGE(CYXParser.CmpExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));
        if (left.isNumber() && right.isNumber())
            return new CYXValue(left.toDouble() >= right.toDouble());
        else if (left.isString() && right.isString())
            return new CYXValue(left.toStr().compareTo(right.toStr()) >= 0);
        throw new CYXException("ERROR:变量比较仅限于数字和字符串", ctx);
    }

    private CYXValue varLE(CYXParser.CmpExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));
        if (left.isNumber() && right.isNumber())
            return new CYXValue(left.toDouble() <= right.toDouble());
        else if (left.isString() && right.isString())
            return new CYXValue(left.toStr().compareTo(right.toStr()) <= 0);
        throw new CYXException("ERROR:变量比较仅限于数字和字符串", ctx);
    }

    private CYXValue varGT(CYXParser.CmpExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));
        if (left.isNumber() && right.isNumber())
            return new CYXValue(left.toDouble() > right.toDouble());
        else if (left.isString() && right.isString())
            return new CYXValue(left.toStr().compareTo(right.toStr()) > 0);
        throw new CYXException("ERROR:变量比较仅限于数字和字符串", ctx);
    }

    private CYXValue varLT(CYXParser.CmpExprContext ctx) {
        CYXValue left = visit(ctx.expr(0));
        CYXValue right = visit(ctx.expr(1));
        if (left.isNumber() && right.isNumber())
            return new CYXValue(left.toDouble() < right.toDouble());
        else if (left.isString() && right.isString())
            return new CYXValue(left.toStr().compareTo(right.toStr()) < 0);
        throw new CYXException("ERROR:变量比较仅限于数字和字符串", ctx);
    }
}
