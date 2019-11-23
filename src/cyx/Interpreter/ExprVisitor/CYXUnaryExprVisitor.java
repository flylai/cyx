package cyx.Interpreter.ExprVisitor;

import cyx.Domain.CYXScope;
import cyx.Domain.CYXValue;
import cyx.Parser.CYXBaseVisitor;
import cyx.Parser.CYXParser;
import cyx.Util.CYXException;

public class CYXUnaryExprVisitor extends CYXBaseVisitor<CYXValue> {

    CYXExprVisitor exprVisitor;
    private CYXScope scope;

    public CYXUnaryExprVisitor(CYXScope scope) {
        this.scope = scope;
        exprVisitor = new CYXExprVisitor(scope);
    }

    public CYXValue visitExpr(CYXParser.UnaryExprContext ctx) {
        int token = ctx.op.getType();
        if (token == CYXParser.SUB) {
            return minusExpr(ctx);
        } else if (token == CYXParser.LNOT) {
            return notExpr(ctx);
        }
        throw new CYXException("ERROR:未知单目运算符", ctx);
    }

    private CYXValue minusExpr(CYXParser.UnaryExprContext ctx) {
        CYXValue val = exprVisitor.visit(ctx.expr());
        if (val.isInt()) {
            return new CYXValue(0 - val.toInt());
        }
        if (val.isDouble()) {
            return new CYXValue(0 - val.toDouble());
        }
        throw new CYXException("ERROR:取负仅可用于数字", ctx);
    }

    private CYXValue notExpr(CYXParser.UnaryExprContext ctx) {
        CYXValue val = exprVisitor.visit(ctx.expr());
        if (val.isBoolean())
            return new CYXValue(!val.toBoolean());
        throw new CYXException("ERROR:取反仅可用于bool", ctx);
    }

    // ++a
    @Override
    public CYXValue visitPreSelfCalc(CYXParser.PreSelfCalcContext ctx) {
        CYXValue val = scope.getVarVal(ctx.ID().getText());
        String varName = ctx.ID().getText();
        CYXValue oldVal = scope.getVarVal(varName);
        CYXValue newVal = oldVal;
        // 是数字?
        if (val.isNumber()) {
            if (val.isInt()) {
                // 自增?
                if (ctx.op.getType() == CYXParser.SELFADD) {
                    newVal = new CYXValue(val.toInt() + 1);
                } else {
                    newVal = new CYXValue(val.toInt() - 1);
                }
            } else if (val.isDouble()) {
                if (ctx.op.getType() == CYXParser.SELFADD) {
                    newVal = new CYXValue(val.toDouble() + 1);
                } else {
                    newVal = new CYXValue(val.toDouble() - 1);
                }
            }
            scope.assignVar(ctx.ID().getText(), newVal);
            return newVal;
        }
        throw new CYXException("ERROR: '++', '--' 运算仅可用于数字", ctx);
    }

    // a++
    @Override
    public CYXValue visitPostSelfCalc(CYXParser.PostSelfCalcContext ctx) {
        CYXValue val = scope.getVarVal(ctx.ID().getText());
        String varName = ctx.ID().getText();
        CYXValue oldVal = scope.getVarVal(varName);
        CYXValue newVal = oldVal;
        // 是数字?
        if (val.isNumber()) {
            if (val.isInt()) {
                // 自增?
                if (ctx.op.getType() == CYXParser.SELFADD) {
                    newVal = new CYXValue(val.toInt() + 1);
                } else {
                    newVal = new CYXValue(val.toInt() - 1);
                }
            } else if (val.isDouble()) {
                if (ctx.op.getType() == CYXParser.SELFADD) {
                    newVal = new CYXValue(val.toDouble() + 1);
                } else {
                    newVal = new CYXValue(val.toDouble() - 1);
                }
            }
            if (oldVal == null) {
                return oldVal;
            } else {
                scope.assignVar(ctx.ID().getText(), newVal);
                return oldVal;
            }
        }
        throw new CYXException("ERROR: '++', '--' 运算仅可用于数字", ctx);
    }

}
