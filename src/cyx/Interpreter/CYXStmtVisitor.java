package cyx.Interpreter;

import cyx.Domain.CYXScope;
import cyx.Domain.CYXValue;
import cyx.Interpreter.ExprVisitor.CYXExprVisitor;
import cyx.Parser.CYXBaseVisitor;
import cyx.Parser.CYXParser;
import cyx.Util.CYXException;

import java.util.ArrayList;
import java.util.List;

public class CYXStmtVisitor extends CYXBaseVisitor<CYXValue> {
    private CYXScope scope;

    public CYXStmtVisitor(CYXScope scope) {
        this.scope = scope;
    }

    @Override
    public CYXValue visitIfStmts(CYXParser.IfStmtsContext ctx) {
        CYXExprVisitor exprVisitor = new CYXExprVisitor(scope);
        CYXValue ifCondition = exprVisitor.visit(ctx.ifStmt().expr());

        // if
        if (ifCondition.checkTrue()) {
            return visit(ctx.ifStmt().block());
        }

        // else if
        for (CYXParser.ElseifStmtContext elseifStmtContext : ctx.elseifStmt()) {
            CYXValue elseifCondition = exprVisitor.visit(elseifStmtContext.expr());
            if (elseifCondition.checkTrue()) {
                return visit(elseifStmtContext.block());
            }
        }
        // else
        if (ctx.elseStmt() != null)// else 存在?
        {
            return visit(ctx.elseStmt().block());
        }
        return CYXValue.VOID;
    }

    @Override
    public CYXValue visitForStmt(CYXParser.ForStmtContext ctx) {
        scope = new CYXScope(scope);
        CYXExprVisitor exprVisitor = new CYXExprVisitor(scope);

        CYXValue val = CYXValue.NULL; // 可能的 block 返回值

        if (ctx.varDeclStmt() != null) {
            visit(ctx.varDeclStmt());
        } else {
            visit(ctx.varAssignStmt());
        }
        while (true) {
            if (ctx.cond != null) { // for 第二个参数真假情况
                if (!exprVisitor.visit(ctx.cond).checkTrue()) {
                    break;
                }
            }
            val = visit(ctx.block());
            if (val.getSourceType() == CYXValue.SourceType.RETURN) {
                break;
            } else if (val.getSourceType() == CYXValue.SourceType.BREAK) {
                val.setSourceType(CYXValue.SourceType.COMMON);
                break;
            } else if (val.getSourceType() == CYXValue.SourceType.CONTINUE) {
                val.setSourceType(CYXValue.SourceType.COMMON);
            }
            if (ctx.step != null) {
                exprVisitor.visit(ctx.step);
            }
        }

        scope = scope.parent(); // 作用域切回去
        return val;
    }

    @Override
    public CYXValue visitReturnStmt(CYXParser.ReturnStmtContext ctx) {
        CYXExprVisitor exprVisitor = new CYXExprVisitor(scope);
        CYXValue retval = new CYXValue(null);
        if (ctx.expr() != null) {
            retval = exprVisitor.visit(ctx.expr());
        }
        retval.setSourceType(CYXValue.SourceType.RETURN);
        return retval;
    }

    @Override
    public CYXValue visitBinaryExpr(CYXParser.BinaryExprContext ctx) {
        return new CYXExprVisitor(scope).visit(ctx);
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
            } else if (stmtCtx.BREAK() != null) { // BREAK
                retval.setSourceType(CYXValue.SourceType.BREAK);
                break;
            } else if (stmtCtx.CONTINUE() != null) { // CONTINUE
                retval.setSourceType(CYXValue.SourceType.CONTINUE);
                break;
            } else {
                retval = visit(stmtCtx);
                if (retval != null && (retval.getSourceType() == CYXValue.SourceType.CONTINUE || retval.getSourceType() == CYXValue.SourceType.BREAK)) { // 如果内层遇到了中断语句
                    break;
                }
            }
        }
        scope = scope.parent(); // 执行完了，作用域切回去
        return retval;
    }

    @Override
    public CYXValue visitWhileStmt(CYXParser.WhileStmtContext ctx) {
        CYXExprVisitor exprVisitor = new CYXExprVisitor(scope);
        CYXValue retval = CYXValue.VOID;
        while (exprVisitor.visit(ctx.expr()).checkTrue()) {
            retval = visit(ctx.block());
            if (retval.getSourceType() == CYXValue.SourceType.RETURN) {
                break;
            } else if (retval.getSourceType() == CYXValue.SourceType.BREAK) {
                retval.setSourceType(CYXValue.SourceType.COMMON);
                break;
            } else if (retval.getSourceType() == CYXValue.SourceType.CONTINUE) {
                retval.setSourceType(CYXValue.SourceType.COMMON);
            }
        }
        return retval;
    }

    @Override
    public CYXValue visitPreSelfCalc(CYXParser.PreSelfCalcContext ctx) {
        CYXExprVisitor exprVisitor = new CYXExprVisitor(scope);
        return exprVisitor.visit(ctx);
    }

    @Override
    public CYXValue visitPostSelfCalc(CYXParser.PostSelfCalcContext ctx) {
        CYXExprVisitor exprVisitor = new CYXExprVisitor(scope);
        return exprVisitor.visit(ctx);
    }

    @Override
    public CYXValue visitList(CYXParser.ListContext ctx) {
        CYXValue retval;
        CYXExprVisitor exprVisitor = new CYXExprVisitor(scope);
        List tmpList = new ArrayList<>();
        for (CYXParser.SubListContext subListContext : ctx.subList()) {
            if (subListContext.expr() != null) {
                tmpList.add(exprVisitor.visit(subListContext.expr()));
            } else if (subListContext.list() != null) {
                tmpList.add(visit(subListContext.list()));
            } else {
                throw new CYXException("ERROR: 未知异常", ctx);
            }
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
        CYXExprVisitor exprVisitor = new CYXExprVisitor(scope);
        String fun = (ctx.ID().getText());
        List arg = new ArrayList<>();

        for (CYXParser.ExprContext exprContext : ctx.args().expr()) {
            CYXValue tmp = exprVisitor.visit(exprContext); // 取值
            List<CYXValue> tmpList = new ArrayList<>(); // 新的list
            if (tmp.isList()) { // 如果值是列表
                for (CYXValue tmpVar : tmp.toList()) {
                    tmpList.add(tmpVar); // 旧值加入新列表
                }
                arg.add(new CYXValue(tmpList)); // 声明新变量 用于functionCall
            } else {
                arg.add(tmp); // 不是arraylist直接声明
            }
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
            CYXExprVisitor exprVisitor = new CYXExprVisitor(scope);
            if (ctx.subList().expr() != null) {
                varVal = exprVisitor.visit(ctx.subList().expr());
            } else if (ctx.subList().list() != null) {
                varVal = visit(ctx.subList().list());
            }
        }
        if (!varType.equals("var") && varDeclType != ((CYXValue) varVal).getType()) // 类型检查
        {
            throw new CYXException("ERROR, 声明类型与数据类型不符", ctx);
        }
        scope.declVar(varName, (CYXValue) varVal);
        return CYXValue.VOID;
    }

    @Override
    public CYXValue visitVarAssignStmt(CYXParser.VarAssignStmtContext ctx) {
        CYXValue val;
        CYXValue oldVal = scope.getVarVal(ctx.varNameExpr().ID().getText()); // 取旧值
        if (oldVal != null) { // 取到了吗 || 是否已经声明
            CYXExprVisitor exprVisitor = new CYXExprVisitor(scope);
            // 取要赋的值
            if (ctx.subList().expr() != null) {
                val = exprVisitor.visit(ctx.subList().expr());
            } else if (ctx.subList().list() != null) {
                val = visit(ctx.subList().list());
            } else {
                throw new CYXException("ERROR:未知异常", ctx);
            }

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
        CYXExprVisitor exprVisitor = new CYXExprVisitor(scope);
        // eg
        // oldVal = [1,2,3,[4,5]]
        // oldVal[3][1] = 2
        // idx 为数组深度
        if (idx == ctx.subScript().size() - 1) { // 递归出口 最里面的赋值
            int sub = exprVisitor.visit(ctx.subScript(idx).expr()).toInt(); // 取到 [3][1] 的 1
            oldVal.toList().set(sub, newVal); // 原生方法
            return oldVal; // 返回修改结果
        }
        int upSub = exprVisitor.visit(ctx.subScript(idx).expr()).toInt(); // 上一层给数组的下标 [3]
        CYXValue curVal = oldVal.toList().get(upSub); // 修改 x[3] = [4,5]
        setListIndex(ctx, curVal, newVal, idx + 1); // 下层递归
        return oldVal;
    }


    @Override
    public CYXValue visitPrintStmt(CYXParser.PrintStmtContext ctx) {
        if (ctx.expr().size() > 0) {
            CYXExprVisitor exprVisitor = new CYXExprVisitor(scope);
            for (CYXParser.ExprContext exprContext : ctx.expr()) {
                System.out.print(exprVisitor.visit(exprContext));
            }
        }
        return CYXValue.VOID;
    }

    @Override
    public CYXValue visitPrintlnStmt(CYXParser.PrintlnStmtContext ctx) {
        if (ctx.expr().size() > 0) {
            CYXExprVisitor exprVisitor = new CYXExprVisitor(scope);
            for (CYXParser.ExprContext exprContext : ctx.expr()) {
                System.out.println(exprVisitor.visit(exprContext));
            }
        } else {
            System.out.println();
        }
        return CYXValue.VOID;
    }

}
