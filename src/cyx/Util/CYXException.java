package cyx.Util;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

public class CYXException extends Exception {
    public CYXException(ParserRuleContext ctx) {
        this("错误的表达式:" + ctx.getText(), ctx);
    }

    public CYXException(String msg, ParserRuleContext ctx) {
        super(msg + " 于行: " + ctx.start.getLine() + " 语句: " + ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex())));
    }

    public CYXException(String msg) {
        super(msg);
    }
}
