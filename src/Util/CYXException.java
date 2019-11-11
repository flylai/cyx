package Util;

import org.antlr.v4.runtime.ParserRuleContext;

public class CYXException extends RuntimeException {
    public CYXException(ParserRuleContext ctx) {
        this("ILLEGAL EXPR:" + ctx.getText(), ctx);
    }

    public CYXException(String msg, ParserRuleContext ctx) {
        super(msg + " : " + ctx.start.getLine());
    }

    public CYXException(String msg) {
        super(msg);
    }
}
