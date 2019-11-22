package cyx.Interpreter.ExprVisitor;

import cyx.Domain.CYXFunctionCall;
import cyx.Domain.CYXScope;
import cyx.Domain.CYXValue;
import cyx.Parser.CYXBaseVisitor;
import cyx.Parser.CYXParser;
import cyx.Util.CYXException;

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
                            if (curVal.isList() && curVal.toList().size() > sub) {
                                curVal = curVal.toList().get(sub);
                            } else {
                                throw new CYXException("ERROR:数组越界", ctx);
                            }
                        } else { // id[] 空
                            throw new CYXException("ERROR:[]不能为空", ctx);
                        }
                    }
                    val = curVal;
                } else {
                    throw new CYXException("[]运算符仅可用于数组", ctx);
                }
            }
            if (val == null) {
                throw new CYXException("ERROR:变量 " + ctx.start.getText() + " 未声明", ctx);
            }
            return val;
        } else if (ctx.varFunExpr().funCall() != null) {
            CYXFunctionCall fun = scope.getFunCall(ctx.varFunExpr().funCall().ID().getText());
            if (fun != null) {
                return visit(ctx.varFunExpr().funCall());
            } else {
                throw new CYXException("ERROR:函数 " + ctx.start.getText() + " 未声明");
            }
        }
        throw new CYXException("ERROR:未知异常");
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
}
