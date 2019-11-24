package cyx.Util;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CYXGrammarErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        String errorFormat = "语法错误,位于行: %d,列: %d, 信息:\n%s";
        String errorMsg = String.format(errorFormat, line, charPositionInLine, msg);

    }

}
