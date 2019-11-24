package cyx.Util;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

public class CYXRuntimeException extends RuntimeException {
    public CYXRuntimeException(ParserRuleContext ctx) {
        this("错误的表达式:" + ctx.getText(), ctx);
    }

    public CYXRuntimeException(String msg, ParserRuleContext ctx) {
        super(msg + " 于行: " + ctx.start.getLine() + " 语句: " + ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex())));
    }

    public CYXRuntimeException(String msg) {
        super(msg);
    }
}
