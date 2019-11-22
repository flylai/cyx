package cyx.Interpreter.ExprVisitor;

import cyx.Domain.CYXScope;
import cyx.Domain.CYXValue;
import cyx.Parser.CYXBaseVisitor;
import cyx.Parser.CYXParser;
import cyx.Util.CYXException;

import java.util.ArrayList;

public class CYXBinaryExprVisitor extends CYXBaseVisitor<CYXValue> {
    private CYXScope scope;
    private CYXExprVisitor exprVisitor;

    public CYXBinaryExprVisitor(CYXScope scope) {
        this.scope = scope;
        exprVisitor = new CYXExprVisitor(scope);
    }

    @Override
    public CYXValue visitBinaryExpr(CYXParser.BinaryExprContext ctx) {

        int token = ctx.op.getType();
        if (token == CYXParser.MUL || token == CYXParser.DIV || token == CYXParser.MOD) {
            return mulDivModExpr(ctx);
        } else if (token == CYXParser.ADD || token == CYXParser.SUB) {
            return addSubExpr(ctx);
        } else if (token == CYXParser.GE || token == CYXParser.LE || token == CYXParser.GT || token == CYXParser.LT) {
            return cmpExpr(ctx);
        } else if (token == CYXParser.EQ || token == CYXParser.NEQ) {
            return eqExpr(ctx);
        } else if (token == CYXParser.LAND) {
            return logANDExpr(ctx);
        } else if (token == CYXParser.LOR) {
            return logORExpr(ctx);
        } else if (token == CYXParser.BXOR) {
            return bitXORExpr(ctx);
        } else if (token == CYXParser.BAND) {
            return bitANDExpr(ctx);
        } else if (token == CYXParser.BOR) {
            return bitORExpr(ctx);
        }
        throw new CYXException("ERROR: 未知双目运算符", ctx);
    }


    public CYXValue addSubExpr(CYXParser.BinaryExprContext ctx) {
        if (ctx.op.getType() == CYXParser.ADD) {
            return varAdd(ctx);
        } else if (ctx.op.getType() == CYXParser.SUB) {
            return varSub(ctx);
        } else {
            throw new CYXException("ERROR:未知的运算符:" + ctx.op.getText(), ctx);
        }

    }


    public CYXValue logANDExpr(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));

        return new CYXValue(left.checkTrue() && right.checkTrue());
    }


    public CYXValue logORExpr(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));
        return new CYXValue(left.checkTrue() || right.checkTrue());
    }

    public CYXValue mulDivModExpr(CYXParser.BinaryExprContext ctx) {
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


    public CYXValue cmpExpr(CYXParser.BinaryExprContext ctx) {
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


    public CYXValue bitORExpr(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));
        if (left.isInt() && right.isInt()) {
            return new CYXValue(left.toInt() | right.toInt());
        }
        throw new CYXException("ERROR:算数或运算仅可用于两个INT间", ctx);
    }


    public CYXValue eqExpr(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));
        return new CYXValue(left.equals(right));
    }


    public CYXValue bitXORExpr(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));
        if (left.isInt() && right.isInt()) {
            return new CYXValue(left.toInt() ^ right.toInt());
        }
        throw new CYXException("ERROR:算数异或运算仅可用于两个INT间", ctx);
    }


    public CYXValue bitANDExpr(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));
        if (left.isInt() && right.isInt()) {
            return new CYXValue(left.toInt() & right.toInt());
        }
        throw new CYXException("ERROR:算数与运算仅可用于两个INT间", ctx);
    }


    // 变量相加
    private CYXValue varAdd(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));

        // 两个 null 相加
        if (left == CYXValue.NULL && right == CYXValue.NULL) {
            return CYXValue.NULL;
        }

        if (left == CYXValue.NULL) {
            left = new CYXValue("null");
        }
        if (right == CYXValue.NULL) {
            right = new CYXValue("null");
        }

        // 数字相加
        if (left.isNumber() && right.isNumber()) {
            // 都是整数？
            if (left.isInt() && right.isInt()) {
                return new CYXValue(left.toInt() + right.toInt());
            } else {
                return new CYXValue(left.toDouble() + right.toDouble());
            }
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
    private CYXValue varSub(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));
        // 都是数字
        if (left.isNumber() && right.isNumber()) {
            // 都是整数
            if (left.isInt() && right.isInt()) {
                return new CYXValue(left.toInt() - right.toInt());
            } else {
                return new CYXValue(left.toDouble() - right.toDouble());
            }
        }

        if (left.isList()) {
            ArrayList tmpList = (ArrayList) left.toList();
            tmpList.remove(right);
            return new CYXValue(tmpList);
        }

        // 其他
        throw new CYXException("ERROR:变量相减仅限数字", ctx);
    }

    // 变量相乘
    private CYXValue varMul(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));
        // 都是数字
        if (left.isNumber() && right.isNumber()) {
            // 都是整数
            if (left.isInt() && right.isInt()) {
                return new CYXValue(left.toInt() * right.toInt());
            } else {
                return new CYXValue(left.toDouble() * right.toDouble());
            }
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

    // 变量相除
    private CYXValue varDiv(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));
        if (left.isNumber() && right.isNumber()) {
            return new CYXValue(left.toDouble() / right.toDouble());
        }
        throw new CYXException("ERROR:变量相乘仅限数字", ctx);
    }

    // 变量取模
    private CYXValue varMod(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));
        if (left.isNumber() && right.isNumber()) {
            return new CYXValue(left.toDouble() % right.toDouble());
        }
        throw new CYXException("ERROR:变量取模仅限数字", ctx);
    }

    // >=
    private CYXValue varGE(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));
        if (left.isNumber() && right.isNumber()) {
            return new CYXValue(left.toDouble() >= right.toDouble());
        } else if (left.isString() && right.isString()) {
            return new CYXValue(left.toStr().compareTo(right.toStr()) >= 0);
        }
        throw new CYXException("ERROR:变量比较仅限于数字和字符串", ctx);
    }

    // <=
    private CYXValue varLE(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));
        if (left.isNumber() && right.isNumber()) {
            return new CYXValue(left.toDouble() <= right.toDouble());
        } else if (left.isString() && right.isString()) {
            return new CYXValue(left.toStr().compareTo(right.toStr()) <= 0);
        }
        throw new CYXException("ERROR:变量比较仅限于数字和字符串", ctx);
    }

    // >
    private CYXValue varGT(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));
        if (left.isNumber() && right.isNumber()) {
            return new CYXValue(left.toDouble() > right.toDouble());
        } else if (left.isString() && right.isString()) {
            return new CYXValue(left.toStr().compareTo(right.toStr()) > 0);
        }
        throw new CYXException("ERROR:变量比较仅限于数字和字符串", ctx);
    }

    // <
    private CYXValue varLT(CYXParser.BinaryExprContext ctx) {
        CYXValue left = exprVisitor.visit(ctx.expr(0));
        CYXValue right = exprVisitor.visit(ctx.expr(1));
        if (left.isNumber() && right.isNumber()) {
            return new CYXValue(left.toDouble() < right.toDouble());
        } else if (left.isString() && right.isString()) {
            return new CYXValue(left.toStr().compareTo(right.toStr()) < 0);
        }
        throw new CYXException("ERROR:变量比较仅限于数字和字符串", ctx);
    }
}
