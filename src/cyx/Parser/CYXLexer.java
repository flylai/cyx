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
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, SELFADD = 22, SELFSUB = 23, MUL = 24,
            DIV = 25, MOD = 26, ADD = 27, SUB = 28, GE = 29, LE = 30, GT = 31, LT = 32, EQ = 33, NEQ = 34,
            BAND = 35, BXOR = 36, BOR = 37, LAND = 38, LOR = 39, LNOT = 40, IF = 41, ELSE = 42, FOR = 43,
            WHILE = 44, BOOL = 45, BREAK = 46, CONTINUE = 47, COMMENT = 48, ID = 49, LETTER = 50,
            INT = 51, DECIMAL = 52, STRING = 53, BLANK = 54;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0170\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5" +
                    "\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3" +
                    "\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3" +
                    "\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17" +
                    "\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23" +
                    "\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30" +
                    "\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36" +
                    "\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'" +
                    "\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3" +
                    "-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u010b\n.\3/\3/\3/\3/\3/\3/\3\60" +
                    "\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0120" +
                    "\n\61\f\61\16\61\u0123\13\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u012b" +
                    "\n\61\f\61\16\61\u012e\13\61\3\61\3\61\7\61\u0132\n\61\f\61\16\61\u0135" +
                    "\13\61\5\61\u0137\n\61\3\61\3\61\3\62\3\62\3\62\6\62\u013e\n\62\r\62\16" +
                    "\62\u013f\7\62\u0142\n\62\f\62\16\62\u0145\13\62\3\63\3\63\3\64\6\64\u014a" +
                    "\n\64\r\64\16\64\u014b\3\65\3\65\3\65\6\65\u0151\n\65\r\65\16\65\u0152" +
                    "\5\65\u0155\n\65\3\66\3\66\3\66\3\66\7\66\u015b\n\66\f\66\16\66\u015e" +
                    "\13\66\3\66\3\66\3\66\3\66\3\66\7\66\u0165\n\66\f\66\16\66\u0168\13\66" +
                    "\3\66\5\66\u016b\n\66\3\67\3\67\3\67\3\67\3\u0121\28\3\3\5\4\7\5\t\6\13" +
                    "\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'" +
                    "\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'" +
                    "M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8\3\2\13\4\2\f\f\17\17" +
                    "\5\2C\\aac|\3\2\62;\4\2C\\c|\3\2$$\6\2\f\f\17\17$$^^\3\2))\6\2\f\f\17" +
                    "\17))^^\5\2\13\f\17\17\"\"\2\u0180\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2" +
                    "\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3" +
                    "\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2" +
                    "\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2" +
                    "\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2" +
                    "\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2" +
                    "\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2" +
                    "O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3" +
                    "\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2" +
                    "\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\t" +
                    "w\3\2\2\2\13~\3\2\2\2\r\u0085\3\2\2\2\17\u008a\3\2\2\2\21\u008f\3\2\2" +
                    "\2\23\u0091\3\2\2\2\25\u0093\3\2\2\2\27\u0095\3\2\2\2\31\u009c\3\2\2\2" +
                    "\33\u00a2\3\2\2\2\35\u00a4\3\2\2\2\37\u00ac\3\2\2\2!\u00b0\3\2\2\2#\u00b5" +
                    "\3\2\2\2%\u00b7\3\2\2\2\'\u00bb\3\2\2\2)\u00bd\3\2\2\2+\u00bf\3\2\2\2" +
                    "-\u00c1\3\2\2\2/\u00c4\3\2\2\2\61\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00cb" +
                    "\3\2\2\2\67\u00cd\3\2\2\29\u00cf\3\2\2\2;\u00d1\3\2\2\2=\u00d4\3\2\2\2" +
                    "?\u00d7\3\2\2\2A\u00d9\3\2\2\2C\u00db\3\2\2\2E\u00de\3\2\2\2G\u00e1\3" +
                    "\2\2\2I\u00e3\3\2\2\2K\u00e5\3\2\2\2M\u00e7\3\2\2\2O\u00ea\3\2\2\2Q\u00ed" +
                    "\3\2\2\2S\u00ef\3\2\2\2U\u00f2\3\2\2\2W\u00f7\3\2\2\2Y\u00fb\3\2\2\2[" +
                    "\u010a\3\2\2\2]\u010c\3\2\2\2_\u0112\3\2\2\2a\u0136\3\2\2\2c\u013a\3\2" +
                    "\2\2e\u0146\3\2\2\2g\u0149\3\2\2\2i\u014d\3\2\2\2k\u016a\3\2\2\2m\u016c" +
                    "\3\2\2\2op\7}\2\2p\4\3\2\2\2qr\7\177\2\2r\6\3\2\2\2st\7k\2\2tu\7p\2\2" +
                    "uv\7v\2\2v\b\3\2\2\2wx\7f\2\2xy\7q\2\2yz\7w\2\2z{\7d\2\2{|\7n\2\2|}\7" +
                    "g\2\2}\n\3\2\2\2~\177\7u\2\2\177\u0080\7v\2\2\u0080\u0081\7t\2\2\u0081" +
                    "\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083\u0084\7i\2\2\u0084\f\3\2\2\2\u0085" +
                    "\u0086\7n\2\2\u0086\u0087\7k\2\2\u0087\u0088\7u\2\2\u0088\u0089\7v\2\2" +
                    "\u0089\16\3\2\2\2\u008a\u008b\7d\2\2\u008b\u008c\7q\2\2\u008c\u008d\7" +
                    "q\2\2\u008d\u008e\7n\2\2\u008e\20\3\2\2\2\u008f\u0090\7=\2\2\u0090\22" +
                    "\3\2\2\2\u0091\u0092\7*\2\2\u0092\24\3\2\2\2\u0093\u0094\7+\2\2\u0094" +
                    "\26\3\2\2\2\u0095\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098\7v\2\2\u0098" +
                    "\u0099\7w\2\2\u0099\u009a\7t\2\2\u009a\u009b\7p\2\2\u009b\30\3\2\2\2\u009c" +
                    "\u009d\7r\2\2\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2" +
                    "\u00a0\u00a1\7v\2\2\u00a1\32\3\2\2\2\u00a2\u00a3\7.\2\2\u00a3\34\3\2\2" +
                    "\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8" +
                    "\7p\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7p\2\2\u00ab" +
                    "\36\3\2\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7p\2\2\u00af" +
                    " \3\2\2\2\u00b0\u00b1\7x\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7k\2\2\u00b3" +
                    "\u00b4\7f\2\2\u00b4\"\3\2\2\2\u00b5\u00b6\7?\2\2\u00b6$\3\2\2\2\u00b7" +
                    "\u00b8\7x\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7t\2\2\u00ba&\3\2\2\2\u00bb" +
                    "\u00bc\7]\2\2\u00bc(\3\2\2\2\u00bd\u00be\7_\2\2\u00be*\3\2\2\2\u00bf\u00c0" +
                    "\7<\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7-\2\2\u00c2\u00c3\7-\2\2\u00c3.\3" +
                    "\2\2\2\u00c4\u00c5\7/\2\2\u00c5\u00c6\7/\2\2\u00c6\60\3\2\2\2\u00c7\u00c8" +
                    "\7,\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\64\3\2\2\2\u00cb\u00cc" +
                    "\7\'\2\2\u00cc\66\3\2\2\2\u00cd\u00ce\7-\2\2\u00ce8\3\2\2\2\u00cf\u00d0" +
                    "\7/\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7@\2\2\u00d2\u00d3\7?\2\2\u00d3<\3" +
                    "\2\2\2\u00d4\u00d5\7>\2\2\u00d5\u00d6\7?\2\2\u00d6>\3\2\2\2\u00d7\u00d8" +
                    "\7@\2\2\u00d8@\3\2\2\2\u00d9\u00da\7>\2\2\u00daB\3\2\2\2\u00db\u00dc\7" +
                    "?\2\2\u00dc\u00dd\7?\2\2\u00ddD\3\2\2\2\u00de\u00df\7#\2\2\u00df\u00e0" +
                    "\7?\2\2\u00e0F\3\2\2\2\u00e1\u00e2\7(\2\2\u00e2H\3\2\2\2\u00e3\u00e4\7" +
                    "`\2\2\u00e4J\3\2\2\2\u00e5\u00e6\7~\2\2\u00e6L\3\2\2\2\u00e7\u00e8\7(" +
                    "\2\2\u00e8\u00e9\7(\2\2\u00e9N\3\2\2\2\u00ea\u00eb\7~\2\2\u00eb\u00ec" +
                    "\7~\2\2\u00ecP\3\2\2\2\u00ed\u00ee\7#\2\2\u00eeR\3\2\2\2\u00ef\u00f0\7" +
                    "k\2\2\u00f0\u00f1\7h\2\2\u00f1T\3\2\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4" +
                    "\7n\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7g\2\2\u00f6V\3\2\2\2\u00f7\u00f8" +
                    "\7h\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7t\2\2\u00faX\3\2\2\2\u00fb\u00fc" +
                    "\7y\2\2\u00fc\u00fd\7j\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7n\2\2\u00ff" +
                    "\u0100\7g\2\2\u0100Z\3\2\2\2\u0101\u0102\7v\2\2\u0102\u0103\7t\2\2\u0103" +
                    "\u0104\7w\2\2\u0104\u010b\7g\2\2\u0105\u0106\7h\2\2\u0106\u0107\7c\2\2" +
                    "\u0107\u0108\7n\2\2\u0108\u0109\7u\2\2\u0109\u010b\7g\2\2\u010a\u0101" +
                    "\3\2\2\2\u010a\u0105\3\2\2\2\u010b\\\3\2\2\2\u010c\u010d\7d\2\2\u010d" +
                    "\u010e\7t\2\2\u010e\u010f\7g\2\2\u010f\u0110\7c\2\2\u0110\u0111\7m\2\2" +
                    "\u0111^\3\2\2\2\u0112\u0113\7e\2\2\u0113\u0114\7q\2\2\u0114\u0115\7p\2" +
                    "\2\u0115\u0116\7v\2\2\u0116\u0117\7k\2\2\u0117\u0118\7p\2\2\u0118\u0119" +
                    "\7w\2\2\u0119\u011a\7g\2\2\u011a`\3\2\2\2\u011b\u011c\7\61\2\2\u011c\u011d" +
                    "\7,\2\2\u011d\u0121\3\2\2\2\u011e\u0120\13\2\2\2\u011f\u011e\3\2\2\2\u0120" +
                    "\u0123\3\2\2\2\u0121\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\3\2" +
                    "\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7,\2\2\u0125\u0137\7\61\2\2\u0126" +
                    "\u0127\7\61\2\2\u0127\u0128\7\61\2\2\u0128\u012c\3\2\2\2\u0129\u012b\n" +
                    "\2\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c" +
                    "\u012d\3\2\2\2\u012d\u0137\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0133\7%" +
                    "\2\2\u0130\u0132\n\2\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133" +
                    "\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2" +
                    "\2\2\u0136\u011b\3\2\2\2\u0136\u0126\3\2\2\2\u0136\u012f\3\2\2\2\u0137" +
                    "\u0138\3\2\2\2\u0138\u0139\b\61\2\2\u0139b\3\2\2\2\u013a\u0143\t\3\2\2" +
                    "\u013b\u0142\5e\63\2\u013c\u013e\t\4\2\2\u013d\u013c\3\2\2\2\u013e\u013f" +
                    "\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141" +
                    "\u013b\3\2\2\2\u0141\u013d\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2" +
                    "\2\2\u0143\u0144\3\2\2\2\u0144d\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147" +
                    "\t\5\2\2\u0147f\3\2\2\2\u0148\u014a\t\4\2\2\u0149\u0148\3\2\2\2\u014a" +
                    "\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014ch\3\2\2\2" +
                    "\u014d\u0154\5g\64\2\u014e\u0150\7\60\2\2\u014f\u0151\t\4\2\2\u0150\u014f" +
                    "\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153" +
                    "\u0155\3\2\2\2\u0154\u014e\3\2\2\2\u0154\u0155\3\2\2\2\u0155j\3\2\2\2" +
                    "\u0156\u015c\t\6\2\2\u0157\u015b\n\7\2\2\u0158\u0159\7^\2\2\u0159\u015b" +
                    "\n\2\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015e\3\2\2\2\u015c" +
                    "\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2" +
                    "\2\2\u015f\u016b\t\6\2\2\u0160\u0166\t\b\2\2\u0161\u0165\n\t\2\2\u0162" +
                    "\u0163\7^\2\2\u0163\u0165\n\2\2\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2" +
                    "\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167" +
                    "\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016b\t\b\2\2\u016a\u0156\3\2" +
                    "\2\2\u016a\u0160\3\2\2\2\u016bl\3\2\2\2\u016c\u016d\t\n\2\2\u016d\u016e" +
                    "\3\2\2\2\u016e\u016f\b\67\2\2\u016fn\3\2\2\2\23\2\u010a\u0121\u012c\u0133" +
                    "\u0136\u013f\u0141\u0143\u014b\u0152\u0154\u015a\u015c\u0164\u0166\u016a" +
                    "\3\b\2\2";
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
                "T__17", "T__18", "T__19", "T__20", "SELFADD", "SELFSUB", "MUL", "DIV",
                "MOD", "ADD", "SUB", "GE", "LE", "GT", "LT", "EQ", "NEQ", "BAND", "BXOR",
                "BOR", "LAND", "LOR", "LNOT", "IF", "ELSE", "FOR", "WHILE", "BOOL", "BREAK",
                "CONTINUE", "COMMENT", "ID", "LETTER", "INT", "DECIMAL", "STRING", "BLANK"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'{'", "'}'", "'int'", "'double'", "'string'", "'list'", "'bool'",
                "';'", "'('", "')'", "'return'", "'print'", "','", "'println'", "'fun'",
                "'void'", "'='", "'var'", "'['", "']'", "':'", "'++'", "'--'", "'*'",
                "'/'", "'%'", "'+'", "'-'", "'>='", "'<='", "'>'", "'<'", "'=='", "'!='",
                "'&'", "'^'", "'|'", "'&&'", "'||'", "'!'", "'if'", "'else'", "'for'",
                "'while'", null, "'break'", "'continue'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, "SELFADD",
                "SELFSUB", "MUL", "DIV", "MOD", "ADD", "SUB", "GE", "LE", "GT", "LT",
                "EQ", "NEQ", "BAND", "BXOR", "BOR", "LAND", "LOR", "LNOT", "IF", "ELSE",
                "FOR", "WHILE", "BOOL", "BREAK", "CONTINUE", "COMMENT", "ID", "LETTER",
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