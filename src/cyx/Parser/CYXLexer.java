// Generated from /home/lkm/DEV/Dev/Java/cyx/design/CYX.g4 by ANTLR 4.7.2
package cyx.Parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CYXLexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
            SELFADD = 25, SELFSUB = 26, MUL = 27, DIV = 28, MOD = 29, ADD = 30, SUB = 31, GE = 32,
            LE = 33, GT = 34, LT = 35, EQ = 36, NEQ = 37, BAND = 38, BXOR = 39, BOR = 40, LAND = 41,
            LOR = 42, LNOT = 43, IF = 44, ELSE = 45, FOR = 46, WHILE = 47, BOOL = 48, COMMENT = 49,
            ID = 50, LETTER = 51, INT = 52, DECIMAL = 53, STRING = 54, BLANK = 55;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0175\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3" +
                    "\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7" +
                    "\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f" +
                    "\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21" +
                    "\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23" +
                    "\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27" +
                    "\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37" +
                    "\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'" +
                    "\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/" +
                    "\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3" +
                    "\61\3\61\5\61\u011f\n\61\3\62\3\62\3\62\3\62\7\62\u0125\n\62\f\62\16\62" +
                    "\u0128\13\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0130\n\62\f\62\16\62" +
                    "\u0133\13\62\3\62\3\62\7\62\u0137\n\62\f\62\16\62\u013a\13\62\5\62\u013c" +
                    "\n\62\3\62\3\62\3\63\3\63\3\63\6\63\u0143\n\63\r\63\16\63\u0144\7\63\u0147" +
                    "\n\63\f\63\16\63\u014a\13\63\3\64\3\64\3\65\6\65\u014f\n\65\r\65\16\65" +
                    "\u0150\3\66\3\66\3\66\6\66\u0156\n\66\r\66\16\66\u0157\5\66\u015a\n\66" +
                    "\3\67\3\67\3\67\3\67\7\67\u0160\n\67\f\67\16\67\u0163\13\67\3\67\3\67" +
                    "\3\67\3\67\3\67\7\67\u016a\n\67\f\67\16\67\u016d\13\67\3\67\5\67\u0170" +
                    "\n\67\38\38\38\38\3\u0126\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13" +
                    "\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61" +
                    "\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61" +
                    "a\62c\63e\64g\65i\66k\67m8o9\3\2\13\4\2\f\f\17\17\5\2C\\aac|\3\2\62;\4" +
                    "\2C\\c|\3\2$$\6\2\f\f\17\17$$^^\3\2))\6\2\f\f\17\17))^^\5\2\13\f\17\17" +
                    "\"\"\2\u0185\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2" +
                    "\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2" +
                    "\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2" +
                    "\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2" +
                    "\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3" +
                    "\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2" +
                    "\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2" +
                    "S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3" +
                    "\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2" +
                    "\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7u\3\2\2\2\ty\3\2\2\2\13" +
                    "\u0080\3\2\2\2\r\u0087\3\2\2\2\17\u008c\3\2\2\2\21\u0091\3\2\2\2\23\u0093" +
                    "\3\2\2\2\25\u0095\3\2\2\2\27\u0097\3\2\2\2\31\u009e\3\2\2\2\33\u00a0\3" +
                    "\2\2\2\35\u00a2\3\2\2\2\37\u00a5\3\2\2\2!\u00a9\3\2\2\2#\u00af\3\2\2\2" +
                    "%\u00b1\3\2\2\2\'\u00b9\3\2\2\2)\u00be\3\2\2\2+\u00c0\3\2\2\2-\u00c4\3" +
                    "\2\2\2/\u00c6\3\2\2\2\61\u00cc\3\2\2\2\63\u00d5\3\2\2\2\65\u00d8\3\2\2" +
                    "\2\67\u00db\3\2\2\29\u00dd\3\2\2\2;\u00df\3\2\2\2=\u00e1\3\2\2\2?\u00e3" +
                    "\3\2\2\2A\u00e5\3\2\2\2C\u00e8\3\2\2\2E\u00eb\3\2\2\2G\u00ed\3\2\2\2I" +
                    "\u00ef\3\2\2\2K\u00f2\3\2\2\2M\u00f5\3\2\2\2O\u00f7\3\2\2\2Q\u00f9\3\2" +
                    "\2\2S\u00fb\3\2\2\2U\u00fe\3\2\2\2W\u0101\3\2\2\2Y\u0103\3\2\2\2[\u0106" +
                    "\3\2\2\2]\u010b\3\2\2\2_\u010f\3\2\2\2a\u011e\3\2\2\2c\u013b\3\2\2\2e" +
                    "\u013f\3\2\2\2g\u014b\3\2\2\2i\u014e\3\2\2\2k\u0152\3\2\2\2m\u016f\3\2" +
                    "\2\2o\u0171\3\2\2\2qr\7}\2\2r\4\3\2\2\2st\7\177\2\2t\6\3\2\2\2uv\7k\2" +
                    "\2vw\7p\2\2wx\7v\2\2x\b\3\2\2\2yz\7f\2\2z{\7q\2\2{|\7w\2\2|}\7d\2\2}~" +
                    "\7n\2\2~\177\7g\2\2\177\n\3\2\2\2\u0080\u0081\7u\2\2\u0081\u0082\7v\2" +
                    "\2\u0082\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086" +
                    "\7i\2\2\u0086\f\3\2\2\2\u0087\u0088\7n\2\2\u0088\u0089\7k\2\2\u0089\u008a" +
                    "\7u\2\2\u008a\u008b\7v\2\2\u008b\16\3\2\2\2\u008c\u008d\7d\2\2\u008d\u008e" +
                    "\7q\2\2\u008e\u008f\7q\2\2\u008f\u0090\7n\2\2\u0090\20\3\2\2\2\u0091\u0092" +
                    "\7=\2\2\u0092\22\3\2\2\2\u0093\u0094\7*\2\2\u0094\24\3\2\2\2\u0095\u0096" +
                    "\7+\2\2\u0096\26\3\2\2\2\u0097\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099\u009a" +
                    "\7v\2\2\u009a\u009b\7w\2\2\u009b\u009c\7t\2\2\u009c\u009d\7p\2\2\u009d" +
                    "\30\3\2\2\2\u009e\u009f\7]\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7_\2\2\u00a1" +
                    "\34\3\2\2\2\u00a2\u00a3\7?\2\2\u00a3\u00a4\7@\2\2\u00a4\36\3\2\2\2\u00a5" +
                    "\u00a6\7h\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7p\2\2\u00a8 \3\2\2\2\u00a9" +
                    "\u00aa\7r\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2" +
                    "\u00ad\u00ae\7v\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7.\2\2\u00b0$\3\2\2\2" +
                    "\u00b1\u00b2\7r\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5" +
                    "\7p\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7p\2\2\u00b8" +
                    "&\3\2\2\2\u00b9\u00ba\7x\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7k\2\2\u00bc" +
                    "\u00bd\7f\2\2\u00bd(\3\2\2\2\u00be\u00bf\7?\2\2\u00bf*\3\2\2\2\u00c0\u00c1" +
                    "\7x\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7t\2\2\u00c3,\3\2\2\2\u00c4\u00c5" +
                    "\7<\2\2\u00c5.\3\2\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9" +
                    "\7g\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7m\2\2\u00cb\60\3\2\2\2\u00cc\u00cd" +
                    "\7e\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0" +
                    "\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7g\2\2" +
                    "\u00d4\62\3\2\2\2\u00d5\u00d6\7-\2\2\u00d6\u00d7\7-\2\2\u00d7\64\3\2\2" +
                    "\2\u00d8\u00d9\7/\2\2\u00d9\u00da\7/\2\2\u00da\66\3\2\2\2\u00db\u00dc" +
                    "\7,\2\2\u00dc8\3\2\2\2\u00dd\u00de\7\61\2\2\u00de:\3\2\2\2\u00df\u00e0" +
                    "\7\'\2\2\u00e0<\3\2\2\2\u00e1\u00e2\7-\2\2\u00e2>\3\2\2\2\u00e3\u00e4" +
                    "\7/\2\2\u00e4@\3\2\2\2\u00e5\u00e6\7@\2\2\u00e6\u00e7\7?\2\2\u00e7B\3" +
                    "\2\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7?\2\2\u00eaD\3\2\2\2\u00eb\u00ec" +
                    "\7@\2\2\u00ecF\3\2\2\2\u00ed\u00ee\7>\2\2\u00eeH\3\2\2\2\u00ef\u00f0\7" +
                    "?\2\2\u00f0\u00f1\7?\2\2\u00f1J\3\2\2\2\u00f2\u00f3\7#\2\2\u00f3\u00f4" +
                    "\7?\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7(\2\2\u00f6N\3\2\2\2\u00f7\u00f8\7" +
                    "`\2\2\u00f8P\3\2\2\2\u00f9\u00fa\7~\2\2\u00faR\3\2\2\2\u00fb\u00fc\7(" +
                    "\2\2\u00fc\u00fd\7(\2\2\u00fdT\3\2\2\2\u00fe\u00ff\7~\2\2\u00ff\u0100" +
                    "\7~\2\2\u0100V\3\2\2\2\u0101\u0102\7#\2\2\u0102X\3\2\2\2\u0103\u0104\7" +
                    "k\2\2\u0104\u0105\7h\2\2\u0105Z\3\2\2\2\u0106\u0107\7g\2\2\u0107\u0108" +
                    "\7n\2\2\u0108\u0109\7u\2\2\u0109\u010a\7g\2\2\u010a\\\3\2\2\2\u010b\u010c" +
                    "\7h\2\2\u010c\u010d\7q\2\2\u010d\u010e\7t\2\2\u010e^\3\2\2\2\u010f\u0110" +
                    "\7y\2\2\u0110\u0111\7j\2\2\u0111\u0112\7k\2\2\u0112\u0113\7n\2\2\u0113" +
                    "\u0114\7g\2\2\u0114`\3\2\2\2\u0115\u0116\7v\2\2\u0116\u0117\7t\2\2\u0117" +
                    "\u0118\7w\2\2\u0118\u011f\7g\2\2\u0119\u011a\7h\2\2\u011a\u011b\7c\2\2" +
                    "\u011b\u011c\7n\2\2\u011c\u011d\7u\2\2\u011d\u011f\7g\2\2\u011e\u0115" +
                    "\3\2\2\2\u011e\u0119\3\2\2\2\u011fb\3\2\2\2\u0120\u0121\7\61\2\2\u0121" +
                    "\u0122\7,\2\2\u0122\u0126\3\2\2\2\u0123\u0125\13\2\2\2\u0124\u0123\3\2" +
                    "\2\2\u0125\u0128\3\2\2\2\u0126\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127" +
                    "\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7,\2\2\u012a\u013c\7\61" +
                    "\2\2\u012b\u012c\7\61\2\2\u012c\u012d\7\61\2\2\u012d\u0131\3\2\2\2\u012e" +
                    "\u0130\n\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2" +
                    "\2\2\u0131\u0132\3\2\2\2\u0132\u013c\3\2\2\2\u0133\u0131\3\2\2\2\u0134" +
                    "\u0138\7%\2\2\u0135\u0137\n\2\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2" +
                    "\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013c\3\2\2\2\u013a" +
                    "\u0138\3\2\2\2\u013b\u0120\3\2\2\2\u013b\u012b\3\2\2\2\u013b\u0134\3\2" +
                    "\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b\62\2\2\u013ed\3\2\2\2\u013f\u0148" +
                    "\t\3\2\2\u0140\u0147\5g\64\2\u0141\u0143\t\4\2\2\u0142\u0141\3\2\2\2\u0143" +
                    "\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2" +
                    "\2\2\u0146\u0140\3\2\2\2\u0146\u0142\3\2\2\2\u0147\u014a\3\2\2\2\u0148" +
                    "\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149f\3\2\2\2\u014a\u0148\3\2\2\2" +
                    "\u014b\u014c\t\5\2\2\u014ch\3\2\2\2\u014d\u014f\t\4\2\2\u014e\u014d\3" +
                    "\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151" +
                    "j\3\2\2\2\u0152\u0159\5i\65\2\u0153\u0155\7\60\2\2\u0154\u0156\t\4\2\2" +
                    "\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158" +
                    "\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0153\3\2\2\2\u0159\u015a\3\2\2\2\u015a" +
                    "l\3\2\2\2\u015b\u0161\t\6\2\2\u015c\u0160\n\7\2\2\u015d\u015e\7^\2\2\u015e" +
                    "\u0160\n\2\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2" +
                    "\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163" +
                    "\u0161\3\2\2\2\u0164\u0170\t\6\2\2\u0165\u016b\t\b\2\2\u0166\u016a\n\t" +
                    "\2\2\u0167\u0168\7^\2\2\u0168\u016a\n\2\2\2\u0169\u0166\3\2\2\2\u0169" +
                    "\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2" +
                    "\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\t\b\2\2\u016f" +
                    "\u015b\3\2\2\2\u016f\u0165\3\2\2\2\u0170n\3\2\2\2\u0171\u0172\t\n\2\2" +
                    "\u0172\u0173\3\2\2\2\u0173\u0174\b8\2\2\u0174p\3\2\2\2\23\2\u011e\u0126" +
                    "\u0131\u0138\u013b\u0144\u0146\u0148\u0150\u0157\u0159\u015f\u0161\u0169" +
                    "\u016b\u016f\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public CYXLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
                "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16",
                "T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "SELFADD",
                "SELFSUB", "MUL", "DIV", "MOD", "ADD", "SUB", "GE", "LE", "GT", "LT",
                "EQ", "NEQ", "BAND", "BXOR", "BOR", "LAND", "LOR", "LNOT", "IF", "ELSE",
                "FOR", "WHILE", "BOOL", "COMMENT", "ID", "LETTER", "INT", "DECIMAL",
                "STRING", "BLANK"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'{'", "'}'", "'int'", "'double'", "'string'", "'list'", "'bool'",
                "';'", "'('", "')'", "'return'", "'['", "']'", "'=>'", "'fun'", "'print'",
                "','", "'println'", "'void'", "'='", "'var'", "':'", "'break'", "'continue'",
                "'++'", "'--'", "'*'", "'/'", "'%'", "'+'", "'-'", "'>='", "'<='", "'>'",
                "'<'", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'!'", "'if'",
                "'else'", "'for'", "'while'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, "SELFADD", "SELFSUB", "MUL", "DIV", "MOD", "ADD", "SUB", "GE",
                "LE", "GT", "LT", "EQ", "NEQ", "BAND", "BXOR", "BOR", "LAND", "LOR",
                "LNOT", "IF", "ELSE", "FOR", "WHILE", "BOOL", "COMMENT", "ID", "LETTER",
                "INT", "DECIMAL", "STRING", "BLANK"
        };
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "CYX.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}