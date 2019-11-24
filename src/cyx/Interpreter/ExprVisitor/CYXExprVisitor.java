package cyx.Interpreter.ExprVisitor;

import cyx.Domain.CYXFunctionCall;
import cyx.Domain.CYXScope;
import cyx.Domain.CYXValue;
import cyx.Interpreter.CYXStmtVisitor;
import cyx.Parser.CYXBaseVisitor;
import cyx.Parser.CYXParser;
import cyx.Util.CYXRuntimeException;

public class CYXExprVisitor extends CYXBaseVisitor<CYXValue> {
    private CYXScope scope;

    public CYXExprVisitor(CYXScope scope) {
        this.scope = scope;
    }

    @Override
    public CYXValue visitBinaryExpr(CYXParser.BinaryExprContext ctx) {
        return new CYXBinaryExprVisitor(scope).visit(ctx);
    }

    @Override
    public CYXValue visitNumberExpr(CYXParser.NumberExprContext ctx) {
        CYXValue val;
        String rawVal = ctx.number().getText();
        if (ctx.number().DECIMAL() != null) {
            val = new CYXValue(Double.valueOf(rawVal));
        } else if (ctx.number().INT() != null) {
            val = new CYXValue((Integer.valueOf(rawVal)));
        } else {
            val = new CYXValue(null);
        }
        return val;
    }

    @Override
    public CYXValue visitBooleanExpr(CYXParser.BooleanExprContext ctx) {
        return new CYXValue(Boolean.valueOf(ctx.BOOL().getText()));
    }


    @Override
    public CYXValue visitUnaryExpr(CYXParser.UnaryExprContext ctx) {
        CYXUnaryExprVisitor unaryExprVisitor = new CYXUnaryExprVisitor(scope);
        return unaryExprVisitor.visitExpr(ctx);
    }

    // exprexpr -> ( expr )
    @Override
    public CYXValue visitSubExprExpr(CYXParser.SubExprExprContext ctx) {
        return visit(ctx.expr());
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
                            if (curVal.isList() && curVal.toList().size() > sub && sub >= 0) {
                                curVal = curVal.toList().get(sub);
                            } else {
                                throw new CYXRuntimeException("ERROR: 数组越界", ctx);
                            }
                        } else { // id[] 空
                            throw new CYXRuntimeException("ERROR: []不能为空", ctx);
                        }
                    }
                    val = curVal;
                } else {
                    throw new CYXRuntimeException("ERROR: []运算符仅可用于数组", ctx);
                }
            }
            if (val == null) {
                throw new CYXRuntimeException("ERROR: 变量 " + ctx.start.getText() + " 未声明", ctx);
            }
            return val;
        } else if (ctx.varFunExpr().funCall() != null) {
            CYXFunctionCall fun = scope.getFunCall(ctx.varFunExpr().funCall().ID().getText());
            if (fun != null) {
                return visit(ctx.varFunExpr().funCall());
            } else {
                throw new CYXRuntimeException("ERROR: 函数 " + ctx.start.getText() + " 未声明");
            }
        }
        throw new CYXRuntimeException("ERROR: 未知异常");
    }

    @Override
    public CYXValue visitStringExpr(CYXParser.StringExprContext ctx) {
        String val = ctx.STRING().getText();
        return new CYXValue(val.substring(1, val.length() - 1));
    }

    @Override
    public CYXValue visitPreSelfCalc(CYXParser.PreSelfCalcContext ctx) {
        CYXUnaryExprVisitor unaryExprVisitor = new CYXUnaryExprVisitor(scope);
        return unaryExprVisitor.visit(ctx);
    }

    @Override
    public CYXValue visitPostSelfCalc(CYXParser.PostSelfCalcContext ctx) {
        CYXUnaryExprVisitor unaryExprVisitor = new CYXUnaryExprVisitor(scope);
        return unaryExprVisitor.visit(ctx);
    }

    @Override
    public CYXValue visitFunCall(CYXParser.FunCallContext ctx) {
        CYXStmtVisitor stmtVisitor = new CYXStmtVisitor(scope);
        return stmtVisitor.visit(ctx);
    }

    @Override
    public CYXValue visitLambdaExpr(CYXParser.LambdaExprContext ctx) {
        scope = new CYXScope(scope); // 新作用域

        CYXValue retval = CYXValue.NULL;
        if (ctx.lambda().params() != null && ctx.lambda().args() != null) {
            if (ctx.lambda().params().param().size() != ctx.lambda().args().expr().size()) {
                throw new CYXRuntimeException("ERROR: 参数长度与声明时不符", ctx);
            }
            for (int i = 0; i < ctx.lambda().params().param().size(); i++) { // 声明变量
                scope.declVar(ctx.lambda().params().param(i).getText(), visit(ctx.lambda().args().expr(i)));
            }
        }

        if (ctx.lambda().block() != null) { // [](){}
            CYXStmtVisitor stmtVisitor = new CYXStmtVisitor(scope);
            retval = stmtVisitor.visit(ctx.lambda().block());
        } else if (ctx.lambda().expr() != null) { // []() => expr
            retval = visit(ctx.lambda().expr());
        }


        scope = scope.parent(); // 恢复作用域
        return retval;
    }

    @Override
    public CYXValue visitAnonymousFunExpr(CYXParser.AnonymousFunExprContext ctx) {
        CYXValue retval = CYXValue.NULL;

        scope = new CYXScope(scope); // 新作用域

        if (ctx.anonymousFun().block() != null) {
            CYXStmtVisitor stmtVisitor = new CYXStmtVisitor(scope);
            retval = stmtVisitor.visit(ctx.anonymousFun().block());
        } else if (ctx.anonymousFun().expr() != null) {
            retval = visit(ctx.anonymousFun().expr());
        }

        scope = scope.parent(); // 恢复作用域
        return retval;
    }
}
