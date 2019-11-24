// Generated from /home/lkm/DEV/Dev/Java/cyx/design/CYX.g4 by ANTLR 4.7.2
package cyx.Parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CYXParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
            SELFADD = 25, SELFSUB = 26, MUL = 27, DIV = 28, MOD = 29, ADD = 30, SUB = 31, GE = 32,
            LE = 33, GT = 34, LT = 35, EQ = 36, NEQ = 37, BAND = 38, BXOR = 39, BOR = 40, LAND = 41,
            LOR = 42, LNOT = 43, IF = 44, ELSE = 45, FOR = 46, WHILE = 47, BOOL = 48, COMMENT = 49,
            ID = 50, LETTER = 51, INT = 52, DECIMAL = 53, STRING = 54, BLANK = 55;
    public static final int
            RULE_program = 0, RULE_block = 1, RULE_type = 2, RULE_stmt = 3, RULE_expr = 4,
            RULE_selfAddSub = 5, RULE_returnStmt = 6, RULE_lambda = 7, RULE_anonymousFun = 8,
            RULE_funCallStmt = 9, RULE_buildInFunStmt = 10, RULE_varFunExpr = 11,
            RULE_funDeclStmt = 12, RULE_funType = 13, RULE_params = 14, RULE_param = 15,
            RULE_funCall = 16, RULE_args = 17, RULE_varNameExpr = 18, RULE_varDeclStmt = 19,
            RULE_varType = 20, RULE_varAssignStmt = 21, RULE_subScripts = 22, RULE_subScript = 23,
            RULE_ifStmts = 24, RULE_ifStmt = 25, RULE_elseifStmt = 26, RULE_elseStmt = 27,
            RULE_forStmt = 28, RULE_whileStmt = 29, RULE_number = 30, RULE_list = 31,
            RULE_subList = 32, RULE_breakStmt = 33, RULE_continueStmt = 34;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0184\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\3\3\3\7" +
                    "\3S\n\3\f\3\16\3V\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
                    "\3\5\3\5\3\5\3\5\5\5h\n\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
                    "\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6~\n\6\3\6\3\6\3\6\3\6\3\6\3\6" +
                    "\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\7\3\7\3\7\3\7\5\7\u00a4" +
                    "\n\7\3\b\3\b\5\b\u00a8\n\b\3\t\3\t\5\t\u00ac\n\t\3\t\3\t\3\t\5\t\u00b1" +
                    "\n\t\3\t\3\t\3\t\3\t\5\t\u00b7\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bf\n" +
                    "\n\3\13\3\13\5\13\u00c3\n\13\3\f\3\f\3\f\5\f\u00c8\n\f\3\f\3\f\7\f\u00cc" +
                    "\n\f\f\f\16\f\u00cf\13\f\3\f\3\f\3\f\3\f\5\f\u00d5\n\f\3\f\3\f\7\f\u00d9" +
                    "\n\f\f\f\16\f\u00dc\13\f\3\f\5\f\u00df\n\f\3\r\3\r\5\r\u00e3\n\r\3\16" +
                    "\3\16\3\16\3\16\5\16\u00e9\n\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00f1" +
                    "\n\17\3\20\3\20\3\20\7\20\u00f6\n\20\f\20\16\20\u00f9\13\20\3\21\5\21" +
                    "\u00fc\n\21\3\21\3\21\3\22\3\22\3\22\5\22\u0103\n\22\3\22\3\22\3\23\3" +
                    "\23\3\23\7\23\u010a\n\23\f\23\16\23\u010d\13\23\3\24\3\24\5\24\u0111\n" +
                    "\24\3\25\3\25\3\25\3\25\5\25\u0117\n\25\3\26\3\26\5\26\u011b\n\26\3\27" +
                    "\3\27\3\27\3\27\3\30\6\30\u0122\n\30\r\30\16\30\u0123\3\31\3\31\3\31\3" +
                    "\31\3\32\3\32\7\32\u012c\n\32\f\32\16\32\u012f\13\32\3\32\5\32\u0132\n" +
                    "\32\3\33\3\33\3\33\5\33\u0137\n\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34" +
                    "\u013f\n\34\3\34\3\34\3\35\3\35\5\35\u0145\n\35\3\35\3\35\3\36\3\36\3" +
                    "\36\3\36\3\36\5\36\u014e\n\36\3\36\3\36\5\36\u0152\n\36\3\36\3\36\3\36" +
                    "\3\36\3\36\3\36\3\36\3\36\5\36\u015c\n\36\3\36\3\36\5\36\u0160\n\36\3" +
                    "\36\3\36\3\36\5\36\u0165\n\36\3\37\3\37\3\37\5\37\u016a\n\37\3\37\3\37" +
                    "\3 \3 \3!\3!\3!\3!\7!\u0174\n!\f!\16!\u0177\13!\3!\3!\3\"\3\"\3\"\5\"" +
                    "\u017e\n\"\3#\3#\3$\3$\3$\2\3\n%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36" +
                    " \"$&(*,.\60\62\64\668:<>@BDF\2\t\3\2\5\t\3\2\35\37\3\2 !\3\2\"%\3\2&" +
                    "\'\3\2\33\34\3\2\66\67\2\u01a7\2K\3\2\2\2\4P\3\2\2\2\6Y\3\2\2\2\bg\3\2" +
                    "\2\2\n}\3\2\2\2\f\u00a3\3\2\2\2\16\u00a5\3\2\2\2\20\u00a9\3\2\2\2\22\u00b8" +
                    "\3\2\2\2\24\u00c2\3\2\2\2\26\u00de\3\2\2\2\30\u00e2\3\2\2\2\32\u00e4\3" +
                    "\2\2\2\34\u00f0\3\2\2\2\36\u00f2\3\2\2\2 \u00fb\3\2\2\2\"\u00ff\3\2\2" +
                    "\2$\u0106\3\2\2\2&\u010e\3\2\2\2(\u0112\3\2\2\2*\u011a\3\2\2\2,\u011c" +
                    "\3\2\2\2.\u0121\3\2\2\2\60\u0125\3\2\2\2\62\u0129\3\2\2\2\64\u0133\3\2" +
                    "\2\2\66\u013a\3\2\2\28\u0142\3\2\2\2:\u0164\3\2\2\2<\u0166\3\2\2\2>\u016d" +
                    "\3\2\2\2@\u016f\3\2\2\2B\u017d\3\2\2\2D\u017f\3\2\2\2F\u0181\3\2\2\2H" +
                    "J\5\b\5\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2" +
                    "NO\7\2\2\3O\3\3\2\2\2PT\7\3\2\2QS\5\b\5\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2" +
                    "\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\4\2\2X\5\3\2\2\2YZ\t\2\2\2Z\7\3\2" +
                    "\2\2[h\5\4\3\2\\h\5\32\16\2]h\5\24\13\2^h\5(\25\2_h\5,\27\2`h\5\62\32" +
                    "\2ah\5:\36\2bh\5<\37\2ch\5\16\b\2dh\5\f\7\2eh\5F$\2fh\5D#\2g[\3\2\2\2" +
                    "g\\\3\2\2\2g]\3\2\2\2g^\3\2\2\2g_\3\2\2\2g`\3\2\2\2ga\3\2\2\2gb\3\2\2" +
                    "\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2hj\3\2\2\2ik\7\n\2\2ji\3\2\2" +
                    "\2jk\3\2\2\2k\t\3\2\2\2lm\b\6\1\2m~\5\f\7\2no\7!\2\2o~\5\n\6\fpq\7-\2" +
                    "\2q~\5\n\6\13r~\5\20\t\2s~\5\22\n\2t~\5> \2u~\5\30\r\2v~\5\"\22\2w~\7" +
                    "8\2\2x~\7\62\2\2yz\7\13\2\2z{\5\n\6\2{|\7\f\2\2|~\3\2\2\2}l\3\2\2\2}n" +
                    "\3\2\2\2}p\3\2\2\2}r\3\2\2\2}s\3\2\2\2}t\3\2\2\2}u\3\2\2\2}v\3\2\2\2}" +
                    "w\3\2\2\2}x\3\2\2\2}y\3\2\2\2~\u009c\3\2\2\2\177\u0080\f\25\2\2\u0080" +
                    "\u0081\t\3\2\2\u0081\u009b\5\n\6\26\u0082\u0083\f\24\2\2\u0083\u0084\t" +
                    "\4\2\2\u0084\u009b\5\n\6\25\u0085\u0086\f\23\2\2\u0086\u0087\t\5\2\2\u0087" +
                    "\u009b\5\n\6\24\u0088\u0089\f\22\2\2\u0089\u008a\t\6\2\2\u008a\u009b\5" +
                    "\n\6\23\u008b\u008c\f\21\2\2\u008c\u008d\7(\2\2\u008d\u009b\5\n\6\22\u008e" +
                    "\u008f\f\20\2\2\u008f\u0090\7)\2\2\u0090\u009b\5\n\6\21\u0091\u0092\f" +
                    "\17\2\2\u0092\u0093\7*\2\2\u0093\u009b\5\n\6\20\u0094\u0095\f\16\2\2\u0095" +
                    "\u0096\7+\2\2\u0096\u009b\5\n\6\17\u0097\u0098\f\r\2\2\u0098\u0099\7," +
                    "\2\2\u0099\u009b\5\n\6\16\u009a\177\3\2\2\2\u009a\u0082\3\2\2\2\u009a" +
                    "\u0085\3\2\2\2\u009a\u0088\3\2\2\2\u009a\u008b\3\2\2\2\u009a\u008e\3\2" +
                    "\2\2\u009a\u0091\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0097\3\2\2\2\u009b" +
                    "\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\13\3\2\2" +
                    "\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\64\2\2\u00a0\u00a4\t\7\2\2\u00a1" +
                    "\u00a2\t\7\2\2\u00a2\u00a4\7\64\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3" +
                    "\2\2\2\u00a4\r\3\2\2\2\u00a5\u00a7\7\r\2\2\u00a6\u00a8\5\n\6\2\u00a7\u00a6" +
                    "\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\17\3\2\2\2\u00a9\u00ab\7\16\2\2\u00aa" +
                    "\u00ac\5\36\20\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3" +
                    "\2\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00b0\7\13\2\2\u00af\u00b1\5$\23\2\u00b0" +
                    "\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\7\f" +
                    "\2\2\u00b3\u00b4\7\20\2\2\u00b4\u00b7\5\n\6\2\u00b5\u00b7\5\4\3\2\u00b6" +
                    "\u00b3\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\21\3\2\2\2\u00b8\u00b9\7\21\2" +
                    "\2\u00b9\u00ba\7\13\2\2\u00ba\u00be\7\f\2\2\u00bb\u00bc\7\20\2\2\u00bc" +
                    "\u00bf\5\n\6\2\u00bd\u00bf\5\4\3\2\u00be\u00bb\3\2\2\2\u00be\u00bd\3\2" +
                    "\2\2\u00bf\23\3\2\2\2\u00c0\u00c3\5\"\22\2\u00c1\u00c3\5\26\f\2\u00c2" +
                    "\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\25\3\2\2\2\u00c4\u00c5\7\22\2" +
                    "\2\u00c5\u00c7\7\13\2\2\u00c6\u00c8\5\n\6\2\u00c7\u00c6\3\2\2\2\u00c7" +
                    "\u00c8\3\2\2\2\u00c8\u00cd\3\2\2\2\u00c9\u00ca\7\23\2\2\u00ca\u00cc\5" +
                    "\n\6\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd" +
                    "\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00df\7\f" +
                    "\2\2\u00d1\u00d2\7\24\2\2\u00d2\u00d4\7\13\2\2\u00d3\u00d5\5\n\6\2\u00d4" +
                    "\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d7\7\23" +
                    "\2\2\u00d7\u00d9\5\n\6\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da" +
                    "\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2" +
                    "\2\2\u00dd\u00df\7\f\2\2\u00de\u00c4\3\2\2\2\u00de\u00d1\3\2\2\2\u00df" +
                    "\27\3\2\2\2\u00e0\u00e3\5\"\22\2\u00e1\u00e3\5&\24\2\u00e2\u00e0\3\2\2" +
                    "\2\u00e2\u00e1\3\2\2\2\u00e3\31\3\2\2\2\u00e4\u00e5\5\34\17\2\u00e5\u00e6" +
                    "\7\64\2\2\u00e6\u00e8\7\13\2\2\u00e7\u00e9\5\36\20\2\u00e8\u00e7\3\2\2" +
                    "\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\f\2\2\u00eb\u00ec" +
                    "\5\4\3\2\u00ec\33\3\2\2\2\u00ed\u00f1\7\21\2\2\u00ee\u00f1\7\25\2\2\u00ef" +
                    "\u00f1\5\6\4\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2" +
                    "\2\2\u00f1\35\3\2\2\2\u00f2\u00f7\5 \21\2\u00f3\u00f4\7\23\2\2\u00f4\u00f6" +
                    "\5 \21\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7" +
                    "\u00f8\3\2\2\2\u00f8\37\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\5\6\4" +
                    "\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe" +
                    "\7\64\2\2\u00fe!\3\2\2\2\u00ff\u0100\7\64\2\2\u0100\u0102\7\13\2\2\u0101" +
                    "\u0103\5$\23\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2" +
                    "\2\2\u0104\u0105\7\f\2\2\u0105#\3\2\2\2\u0106\u010b\5\n\6\2\u0107\u0108" +
                    "\7\23\2\2\u0108\u010a\5\n\6\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2" +
                    "\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c%\3\2\2\2\u010d\u010b\3" +
                    "\2\2\2\u010e\u0110\7\64\2\2\u010f\u0111\5.\30\2\u0110\u010f\3\2\2\2\u0110" +
                    "\u0111\3\2\2\2\u0111\'\3\2\2\2\u0112\u0113\5*\26\2\u0113\u0116\5&\24\2" +
                    "\u0114\u0115\7\26\2\2\u0115\u0117\5B\"\2\u0116\u0114\3\2\2\2\u0116\u0117" +
                    "\3\2\2\2\u0117)\3\2\2\2\u0118\u011b\7\27\2\2\u0119\u011b\5\6\4\2\u011a" +
                    "\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b+\3\2\2\2\u011c\u011d\5&\24\2" +
                    "\u011d\u011e\7\26\2\2\u011e\u011f\5B\"\2\u011f-\3\2\2\2\u0120\u0122\5" +
                    "\60\31\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123" +
                    "\u0124\3\2\2\2\u0124/\3\2\2\2\u0125\u0126\7\16\2\2\u0126\u0127\5\n\6\2" +
                    "\u0127\u0128\7\17\2\2\u0128\61\3\2\2\2\u0129\u012d\5\64\33\2\u012a\u012c" +
                    "\5\66\34\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2" +
                    "\u012d\u012e\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132" +
                    "\58\35\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\63\3\2\2\2\u0133" +
                    "\u0134\7.\2\2\u0134\u0136\5\n\6\2\u0135\u0137\7\30\2\2\u0136\u0135\3\2" +
                    "\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\5\b\5\2\u0139" +
                    "\65\3\2\2\2\u013a\u013b\7/\2\2\u013b\u013c\7.\2\2\u013c\u013e\5\n\6\2" +
                    "\u013d\u013f\7\30\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140" +
                    "\3\2\2\2\u0140\u0141\5\b\5\2\u0141\67\3\2\2\2\u0142\u0144\7/\2\2\u0143" +
                    "\u0145\7\30\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3" +
                    "\2\2\2\u0146\u0147\5\b\5\2\u01479\3\2\2\2\u0148\u0149\7\60\2\2\u0149\u014a" +
                    "\7\13\2\2\u014a\u014b\5(\25\2\u014b\u014d\7\n\2\2\u014c\u014e\5\n\6\2" +
                    "\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151" +
                    "\7\n\2\2\u0150\u0152\5\n\6\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152" +
                    "\u0153\3\2\2\2\u0153\u0154\7\f\2\2\u0154\u0155\5\b\5\2\u0155\u0165\3\2" +
                    "\2\2\u0156\u0157\7\60\2\2\u0157\u0158\7\13\2\2\u0158\u0159\5,\27\2\u0159" +
                    "\u015b\7\n\2\2\u015a\u015c\5\n\6\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2" +
                    "\2\2\u015c\u015d\3\2\2\2\u015d\u015f\7\n\2\2\u015e\u0160\5\n\6\2\u015f" +
                    "\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7\f" +
                    "\2\2\u0162\u0163\5\b\5\2\u0163\u0165\3\2\2\2\u0164\u0148\3\2\2\2\u0164" +
                    "\u0156\3\2\2\2\u0165;\3\2\2\2\u0166\u0167\7\61\2\2\u0167\u0169\5\n\6\2" +
                    "\u0168\u016a\7\30\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b" +
                    "\3\2\2\2\u016b\u016c\5\b\5\2\u016c=\3\2\2\2\u016d\u016e\t\b\2\2\u016e" +
                    "?\3\2\2\2\u016f\u0170\7\16\2\2\u0170\u0175\5B\"\2\u0171\u0172\7\23\2\2" +
                    "\u0172\u0174\5B\"\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173" +
                    "\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178" +
                    "\u0179\7\17\2\2\u0179A\3\2\2\2\u017a\u017e\5\"\22\2\u017b\u017e\5\n\6" +
                    "\2\u017c\u017e\5@!\2\u017d\u017a\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017c" +
                    "\3\2\2\2\u017eC\3\2\2\2\u017f\u0180\7\31\2\2\u0180E\3\2\2\2\u0181\u0182" +
                    "\7\32\2\2\u0182G\3\2\2\2-KTgj}\u009a\u009c\u00a3\u00a7\u00ab\u00b0\u00b6" +
                    "\u00be\u00c2\u00c7\u00cd\u00d4\u00da\u00de\u00e2\u00e8\u00f0\u00f7\u00fb" +
                    "\u0102\u010b\u0110\u0116\u011a\u0123\u012d\u0131\u0136\u013e\u0144\u014d" +
                    "\u0151\u015b\u015f\u0164\u0169\u0175\u017d";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

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

    public CYXParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "block", "type", "stmt", "expr", "selfAddSub", "returnStmt",
                "lambda", "anonymousFun", "funCallStmt", "buildInFunStmt", "varFunExpr",
                "funDeclStmt", "funType", "params", "param", "funCall", "args", "varNameExpr",
                "varDeclStmt", "varType", "varAssignStmt", "subScripts", "subScript",
                "ifStmts", "ifStmt", "elseifStmt", "elseStmt", "forStmt", "whileStmt",
                "number", "list", "subList", "breakStmt", "continueStmt"
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
    public ATN getATN() {
        return _ATN;
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(73);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << SELFADD) | (1L << SELFSUB) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(70);
                            stmt();
                        }
                    }
                    setState(75);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(76);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(78);
                match(T__0);
                setState(82);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << SELFADD) | (1L << SELFSUB) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(79);
                            stmt();
                        }
                    }
                    setState(84);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(85);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeContext type() throws RecognitionException {
        TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_type);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(87);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StmtContext stmt() throws RecognitionException {
        StmtContext _localctx = new StmtContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_stmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(101);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                    case 1: {
                        setState(89);
                        block();
                    }
                    break;
                    case 2: {
                        setState(90);
                        funDeclStmt();
                    }
                    break;
                    case 3: {
                        setState(91);
                        funCallStmt();
                    }
                    break;
                    case 4: {
                        setState(92);
                        varDeclStmt();
                    }
                    break;
                    case 5: {
                        setState(93);
                        varAssignStmt();
                    }
                    break;
                    case 6: {
                        setState(94);
                        ifStmts();
                    }
                    break;
                    case 7: {
                        setState(95);
                        forStmt();
                    }
                    break;
                    case 8: {
                        setState(96);
                        whileStmt();
                    }
                    break;
                    case 9: {
                        setState(97);
                        returnStmt();
                    }
                    break;
                    case 10: {
                        setState(98);
                        selfAddSub();
                    }
                    break;
                    case 11: {
                        setState(99);
                        continueStmt();
                    }
                    break;
                    case 12: {
                        setState(100);
                        breakStmt();
                    }
                    break;
                }
                setState(104);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                    case 1: {
                        setState(103);
                        match(T__7);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprContext expr() throws RecognitionException {
        return expr(0);
    }

    private ExprContext expr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExprContext _localctx = new ExprContext(_ctx, _parentState);
        ExprContext _prevctx = _localctx;
        int _startState = 8;
        enterRecursionRule(_localctx, 8, RULE_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(123);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                    case 1: {
                        _localctx = new SelfAddSubExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(107);
                        selfAddSub();
                    }
                    break;
                    case 2: {
                        _localctx = new UnaryExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(108);
                        ((UnaryExprContext) _localctx).op = match(SUB);
                        setState(109);
                        expr(10);
                    }
                    break;
                    case 3: {
                        _localctx = new UnaryExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(110);
                        ((UnaryExprContext) _localctx).op = match(LNOT);
                        setState(111);
                        expr(9);
                    }
                    break;
                    case 4: {
                        _localctx = new LambdaExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(112);
                        lambda();
                    }
                    break;
                    case 5: {
                        _localctx = new AnonymousFunExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(113);
                        anonymousFun();
                    }
                    break;
                    case 6: {
                        _localctx = new NumberExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(114);
                        number();
                    }
                    break;
                    case 7: {
                        _localctx = new IdentifierExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(115);
                        varFunExpr();
                    }
                    break;
                    case 8: {
                        _localctx = new FunCallExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(116);
                        funCall();
                    }
                    break;
                    case 9: {
                        _localctx = new StringExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(117);
                        match(STRING);
                    }
                    break;
                    case 10: {
                        _localctx = new BooleanExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(118);
                        match(BOOL);
                    }
                    break;
                    case 11: {
                        _localctx = new SubExprExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(119);
                        match(T__8);
                        setState(120);
                        expr(0);
                        setState(121);
                        match(T__9);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(154);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(152);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                                case 1: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(125);
                                    if (!(precpred(_ctx, 19)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                                    setState(126);
                                    ((BinaryExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        ((BinaryExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(127);
                                    expr(20);
                                }
                                break;
                                case 2: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(128);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(129);
                                    ((BinaryExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == ADD || _la == SUB)) {
                                        ((BinaryExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(130);
                                    expr(19);
                                }
                                break;
                                case 3: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(131);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(132);
                                    ((BinaryExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GE) | (1L << LE) | (1L << GT) | (1L << LT))) != 0))) {
                                        ((BinaryExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(133);
                                    expr(18);
                                }
                                break;
                                case 4: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(134);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(135);
                                    ((BinaryExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == EQ || _la == NEQ)) {
                                        ((BinaryExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(136);
                                    expr(17);
                                }
                                break;
                                case 5: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(137);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(138);
                                    ((BinaryExprContext) _localctx).op = match(BAND);
                                    setState(139);
                                    expr(16);
                                }
                                break;
                                case 6: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(140);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(141);
                                    ((BinaryExprContext) _localctx).op = match(BXOR);
                                    setState(142);
                                    expr(15);
                                }
                                break;
                                case 7: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(143);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(144);
                                    ((BinaryExprContext) _localctx).op = match(BOR);
                                    setState(145);
                                    expr(14);
                                }
                                break;
                                case 8: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(146);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(147);
                                    ((BinaryExprContext) _localctx).op = match(LAND);
                                    setState(148);
                                    expr(13);
                                }
                                break;
                                case 9: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(149);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(150);
                                    ((BinaryExprContext) _localctx).op = match(LOR);
                                    setState(151);
                                    expr(12);
                                }
                                break;
                            }
                        }
                    }
                    setState(156);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final SelfAddSubContext selfAddSub() throws RecognitionException {
        SelfAddSubContext _localctx = new SelfAddSubContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_selfAddSub);
        int _la;
        try {
            setState(161);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ID:
                    _localctx = new PostSelfCalcContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(157);
                    match(ID);
                    setState(158);
                    ((PostSelfCalcContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == SELFADD || _la == SELFSUB)) {
                        ((PostSelfCalcContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                case SELFADD:
                case SELFSUB:
                    _localctx = new PreSelfCalcContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(159);
                    ((PreSelfCalcContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == SELFADD || _la == SELFSUB)) {
                        ((PreSelfCalcContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(160);
                    match(ID);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ReturnStmtContext returnStmt() throws RecognitionException {
        ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_returnStmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(163);
                    match(T__10);
                    setState(165);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                        case 1: {
                            setState(164);
                            expr(0);
                        }
                        break;
                    }
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LambdaContext lambda() throws RecognitionException {
        LambdaContext _localctx = new LambdaContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_lambda);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(167);
                match(T__11);
                setState(169);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0)) {
                    {
                        setState(168);
                        params();
                    }
                }

                setState(171);
                match(T__12);
                setState(172);
                match(T__8);
                setState(174);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__14) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                    {
                        setState(173);
                        args();
                    }
                }

                setState(176);
                match(T__9);
                setState(180);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__13: {
                        {
                            setState(177);
                            match(T__13);
                            setState(178);
                            expr(0);
                        }
                    }
                    break;
                    case T__0: {
                        setState(179);
                        block();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AnonymousFunContext anonymousFun() throws RecognitionException {
        AnonymousFunContext _localctx = new AnonymousFunContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_anonymousFun);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(182);
                match(T__14);
                setState(183);
                match(T__8);
                setState(184);
                match(T__9);
                setState(188);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__13: {
                        {
                            setState(185);
                            match(T__13);
                            setState(186);
                            expr(0);
                        }
                    }
                    break;
                    case T__0: {
                        setState(187);
                        block();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunCallStmtContext funCallStmt() throws RecognitionException {
        FunCallStmtContext _localctx = new FunCallStmtContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_funCallStmt);
        try {
            setState(192);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(190);
                    funCall();
                }
                break;
                case T__15:
                case T__17:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(191);
                    buildInFunStmt();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BuildInFunStmtContext buildInFunStmt() throws RecognitionException {
        BuildInFunStmtContext _localctx = new BuildInFunStmtContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_buildInFunStmt);
        int _la;
        try {
            setState(220);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__15:
                    _localctx = new PrintStmtContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(194);
                    match(T__15);
                    setState(195);
                    match(T__8);
                    setState(197);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__14) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(196);
                            expr(0);
                        }
                    }

                    setState(203);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__16) {
                        {
                            {
                                setState(199);
                                match(T__16);
                                setState(200);
                                expr(0);
                            }
                        }
                        setState(205);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(206);
                    match(T__9);
                }
                break;
                case T__17:
                    _localctx = new PrintlnStmtContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(207);
                    match(T__17);
                    setState(208);
                    match(T__8);
                    setState(210);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__14) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(209);
                            expr(0);
                        }
                    }

                    setState(216);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__16) {
                        {
                            {
                                setState(212);
                                match(T__16);
                                setState(213);
                                expr(0);
                            }
                        }
                        setState(218);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(219);
                    match(T__9);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VarFunExprContext varFunExpr() throws RecognitionException {
        VarFunExprContext _localctx = new VarFunExprContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_varFunExpr);
        try {
            setState(224);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(222);
                    funCall();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(223);
                    varNameExpr();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunDeclStmtContext funDeclStmt() throws RecognitionException {
        FunDeclStmtContext _localctx = new FunDeclStmtContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_funDeclStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(226);
                funType();
                setState(227);
                match(ID);
                setState(228);
                match(T__8);
                setState(230);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0)) {
                    {
                        setState(229);
                        params();
                    }
                }

                setState(232);
                match(T__9);
                setState(233);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunTypeContext funType() throws RecognitionException {
        FunTypeContext _localctx = new FunTypeContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_funType);
        try {
            setState(238);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__14:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(235);
                    match(T__14);
                }
                break;
                case T__18:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(236);
                    match(T__18);
                }
                break;
                case T__2:
                case T__3:
                case T__4:
                case T__5:
                case T__6:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(237);
                    type();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ParamsContext params() throws RecognitionException {
        ParamsContext _localctx = new ParamsContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_params);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(240);
                param();
                setState(245);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__16) {
                    {
                        {
                            setState(241);
                            match(T__16);
                            setState(242);
                            param();
                        }
                    }
                    setState(247);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ParamContext param() throws RecognitionException {
        ParamContext _localctx = new ParamContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_param);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(249);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) {
                    {
                        setState(248);
                        type();
                    }
                }

                setState(251);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunCallContext funCall() throws RecognitionException {
        FunCallContext _localctx = new FunCallContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_funCall);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(253);
                match(ID);
                setState(254);
                match(T__8);
                setState(256);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__14) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                    {
                        setState(255);
                        args();
                    }
                }

                setState(258);
                match(T__9);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ArgsContext args() throws RecognitionException {
        ArgsContext _localctx = new ArgsContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_args);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(260);
                expr(0);
                setState(265);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__16) {
                    {
                        {
                            setState(261);
                            match(T__16);
                            setState(262);
                            expr(0);
                        }
                    }
                    setState(267);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VarNameExprContext varNameExpr() throws RecognitionException {
        VarNameExprContext _localctx = new VarNameExprContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_varNameExpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(268);
                match(ID);
                setState(270);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
                    case 1: {
                        setState(269);
                        subScripts();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VarDeclStmtContext varDeclStmt() throws RecognitionException {
        VarDeclStmtContext _localctx = new VarDeclStmtContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_varDeclStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(272);
                varType();
                setState(273);
                varNameExpr();
                setState(276);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__19) {
                    {
                        setState(274);
                        match(T__19);
                        setState(275);
                        subList();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VarTypeContext varType() throws RecognitionException {
        VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_varType);
        try {
            setState(280);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__20:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(278);
                    match(T__20);
                }
                break;
                case T__2:
                case T__3:
                case T__4:
                case T__5:
                case T__6:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(279);
                    type();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VarAssignStmtContext varAssignStmt() throws RecognitionException {
        VarAssignStmtContext _localctx = new VarAssignStmtContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_varAssignStmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(282);
                varNameExpr();
                setState(283);
                match(T__19);
                setState(284);
                subList();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SubScriptsContext subScripts() throws RecognitionException {
        SubScriptsContext _localctx = new SubScriptsContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_subScripts);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(287);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(286);
                                subScript();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(289);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SubScriptContext subScript() throws RecognitionException {
        SubScriptContext _localctx = new SubScriptContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_subScript);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(291);
                match(T__11);
                setState(292);
                expr(0);
                setState(293);
                match(T__12);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IfStmtsContext ifStmts() throws RecognitionException {
        IfStmtsContext _localctx = new IfStmtsContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_ifStmts);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(295);
                ifStmt();
                setState(299);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(296);
                                elseifStmt();
                            }
                        }
                    }
                    setState(301);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
                }
                setState(303);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
                    case 1: {
                        setState(302);
                        elseStmt();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IfStmtContext ifStmt() throws RecognitionException {
        IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_ifStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(305);
                match(IF);
                setState(306);
                expr(0);
                setState(308);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__21) {
                    {
                        setState(307);
                        match(T__21);
                    }
                }

                setState(310);
                stmt();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ElseifStmtContext elseifStmt() throws RecognitionException {
        ElseifStmtContext _localctx = new ElseifStmtContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_elseifStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(312);
                match(ELSE);
                setState(313);
                match(IF);
                setState(314);
                expr(0);
                setState(316);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__21) {
                    {
                        setState(315);
                        match(T__21);
                    }
                }

                setState(318);
                stmt();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ElseStmtContext elseStmt() throws RecognitionException {
        ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_elseStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(320);
                match(ELSE);
                setState(322);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__21) {
                    {
                        setState(321);
                        match(T__21);
                    }
                }

                setState(324);
                stmt();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ForStmtContext forStmt() throws RecognitionException {
        ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_forStmt);
        int _la;
        try {
            setState(354);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(326);
                    match(FOR);
                    setState(327);
                    match(T__8);
                    setState(328);
                    varDeclStmt();
                    setState(329);
                    match(T__7);
                    setState(331);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__14) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(330);
                            ((ForStmtContext) _localctx).cond = expr(0);
                        }
                    }

                    setState(333);
                    match(T__7);
                    setState(335);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__14) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(334);
                            ((ForStmtContext) _localctx).step = expr(0);
                        }
                    }

                    setState(337);
                    match(T__9);
                    setState(338);
                    stmt();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(340);
                    match(FOR);
                    setState(341);
                    match(T__8);
                    setState(342);
                    varAssignStmt();
                    setState(343);
                    match(T__7);
                    setState(345);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__14) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(344);
                            ((ForStmtContext) _localctx).cond = expr(0);
                        }
                    }

                    setState(347);
                    match(T__7);
                    setState(349);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__14) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(348);
                            ((ForStmtContext) _localctx).step = expr(0);
                        }
                    }

                    setState(351);
                    match(T__9);
                    setState(352);
                    stmt();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final WhileStmtContext whileStmt() throws RecognitionException {
        WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_whileStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(356);
                match(WHILE);
                setState(357);
                expr(0);
                setState(359);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__21) {
                    {
                        setState(358);
                        match(T__21);
                    }
                }

                setState(361);
                stmt();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NumberContext number() throws RecognitionException {
        NumberContext _localctx = new NumberContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_number);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(363);
                _la = _input.LA(1);
                if (!(_la == INT || _la == DECIMAL)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ListContext list() throws RecognitionException {
        ListContext _localctx = new ListContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(365);
                match(T__11);
                setState(366);
                subList();
                setState(371);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__16) {
                    {
                        {
                            setState(367);
                            match(T__16);
                            setState(368);
                            subList();
                        }
                    }
                    setState(373);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(374);
                match(T__12);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SubListContext subList() throws RecognitionException {
        SubListContext _localctx = new SubListContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_subList);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(379);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
                    case 1: {
                        setState(376);
                        funCall();
                    }
                    break;
                    case 2: {
                        setState(377);
                        expr(0);
                    }
                    break;
                    case 3: {
                        setState(378);
                        list();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BreakStmtContext breakStmt() throws RecognitionException {
        BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_breakStmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(381);
                match(T__22);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ContinueStmtContext continueStmt() throws RecognitionException {
        ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_continueStmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(383);
                match(T__23);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 4:
                return expr_sempred((ExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expr_sempred(ExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 19);
            case 1:
                return precpred(_ctx, 18);
            case 2:
                return precpred(_ctx, 17);
            case 3:
                return precpred(_ctx, 16);
            case 4:
                return precpred(_ctx, 15);
            case 5:
                return precpred(_ctx, 14);
            case 6:
                return precpred(_ctx, 13);
            case 7:
                return precpred(_ctx, 12);
            case 8:
                return precpred(_ctx, 11);
        }
        return true;
    }

    public static class ProgramContext extends ParserRuleContext {
        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode EOF() {
            return getToken(CYXParser.EOF, 0);
        }

        public List<StmtContext> stmt() {
            return getRuleContexts(StmtContext.class);
        }

        public StmtContext stmt(int i) {
            return getRuleContext(StmtContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitProgram(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StmtContext> stmt() {
            return getRuleContexts(StmtContext.class);
        }

        public StmtContext stmt(int i) {
            return getRuleContext(StmtContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TypeContext extends ParserRuleContext {
        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitType(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StmtContext extends ParserRuleContext {
        public StmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public FunDeclStmtContext funDeclStmt() {
            return getRuleContext(FunDeclStmtContext.class, 0);
        }

        public FunCallStmtContext funCallStmt() {
            return getRuleContext(FunCallStmtContext.class, 0);
        }

        public VarDeclStmtContext varDeclStmt() {
            return getRuleContext(VarDeclStmtContext.class, 0);
        }

        public VarAssignStmtContext varAssignStmt() {
            return getRuleContext(VarAssignStmtContext.class, 0);
        }

        public IfStmtsContext ifStmts() {
            return getRuleContext(IfStmtsContext.class, 0);
        }

        public ForStmtContext forStmt() {
            return getRuleContext(ForStmtContext.class, 0);
        }

        public WhileStmtContext whileStmt() {
            return getRuleContext(WhileStmtContext.class, 0);
        }

        public ReturnStmtContext returnStmt() {
            return getRuleContext(ReturnStmtContext.class, 0);
        }

        public SelfAddSubContext selfAddSub() {
            return getRuleContext(SelfAddSubContext.class, 0);
        }

        public ContinueStmtContext continueStmt() {
            return getRuleContext(ContinueStmtContext.class, 0);
        }

        public BreakStmtContext breakStmt() {
            return getRuleContext(BreakStmtContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_stmt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExprContext extends ParserRuleContext {
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExprContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        public void copyFrom(ExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class StringExprContext extends ExprContext {
        public StringExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode STRING() {
            return getToken(CYXParser.STRING, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitStringExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class UnaryExprContext extends ExprContext {
        public Token op;

        public UnaryExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode SUB() {
            return getToken(CYXParser.SUB, 0);
        }

        public TerminalNode LNOT() {
            return getToken(CYXParser.LNOT, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitUnaryExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunCallExprContext extends ExprContext {
        public FunCallExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public FunCallContext funCall() {
            return getRuleContext(FunCallContext.class, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitFunCallExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LambdaExprContext extends ExprContext {
        public LambdaExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public LambdaContext lambda() {
            return getRuleContext(LambdaContext.class, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitLambdaExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NumberExprContext extends ExprContext {
        public NumberExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public NumberContext number() {
            return getRuleContext(NumberContext.class, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitNumberExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BooleanExprContext extends ExprContext {
        public BooleanExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode BOOL() {
            return getToken(CYXParser.BOOL, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitBooleanExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SubExprExprContext extends ExprContext {
        public SubExprExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitSubExprExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BinaryExprContext extends ExprContext {
        public Token op;

        public BinaryExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode MUL() {
            return getToken(CYXParser.MUL, 0);
        }

        public TerminalNode DIV() {
            return getToken(CYXParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(CYXParser.MOD, 0);
        }

        public TerminalNode ADD() {
            return getToken(CYXParser.ADD, 0);
        }

        public TerminalNode SUB() {
            return getToken(CYXParser.SUB, 0);
        }

        public TerminalNode GE() {
            return getToken(CYXParser.GE, 0);
        }

        public TerminalNode LE() {
            return getToken(CYXParser.LE, 0);
        }

        public TerminalNode GT() {
            return getToken(CYXParser.GT, 0);
        }

        public TerminalNode LT() {
            return getToken(CYXParser.LT, 0);
        }

        public TerminalNode EQ() {
            return getToken(CYXParser.EQ, 0);
        }

        public TerminalNode NEQ() {
            return getToken(CYXParser.NEQ, 0);
        }

        public TerminalNode BAND() {
            return getToken(CYXParser.BAND, 0);
        }

        public TerminalNode BXOR() {
            return getToken(CYXParser.BXOR, 0);
        }

        public TerminalNode BOR() {
            return getToken(CYXParser.BOR, 0);
        }

        public TerminalNode LAND() {
            return getToken(CYXParser.LAND, 0);
        }

        public TerminalNode LOR() {
            return getToken(CYXParser.LOR, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitBinaryExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AnonymousFunExprContext extends ExprContext {
        public AnonymousFunExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public AnonymousFunContext anonymousFun() {
            return getRuleContext(AnonymousFunContext.class, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitAnonymousFunExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SelfAddSubExprContext extends ExprContext {
        public SelfAddSubExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public SelfAddSubContext selfAddSub() {
            return getRuleContext(SelfAddSubContext.class, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitSelfAddSubExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierExprContext extends ExprContext {
        public IdentifierExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public VarFunExprContext varFunExpr() {
            return getRuleContext(VarFunExprContext.class, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitIdentifierExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SelfAddSubContext extends ParserRuleContext {
        public SelfAddSubContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public SelfAddSubContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_selfAddSub;
        }

        public void copyFrom(SelfAddSubContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class PostSelfCalcContext extends SelfAddSubContext {
        public Token op;

        public PostSelfCalcContext(SelfAddSubContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(CYXParser.ID, 0);
        }

        public TerminalNode SELFADD() {
            return getToken(CYXParser.SELFADD, 0);
        }

        public TerminalNode SELFSUB() {
            return getToken(CYXParser.SELFSUB, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitPostSelfCalc(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PreSelfCalcContext extends SelfAddSubContext {
        public Token op;

        public PreSelfCalcContext(SelfAddSubContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(CYXParser.ID, 0);
        }

        public TerminalNode SELFADD() {
            return getToken(CYXParser.SELFADD, 0);
        }

        public TerminalNode SELFSUB() {
            return getToken(CYXParser.SELFSUB, 0);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitPreSelfCalc(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ReturnStmtContext extends ParserRuleContext {
        public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_returnStmt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitReturnStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LambdaContext extends ParserRuleContext {
        public LambdaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public ParamsContext params() {
            return getRuleContext(ParamsContext.class, 0);
        }

        public ArgsContext args() {
            return getRuleContext(ArgsContext.class, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lambda;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitLambda(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AnonymousFunContext extends ParserRuleContext {
        public AnonymousFunContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_anonymousFun;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitAnonymousFun(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunCallStmtContext extends ParserRuleContext {
        public FunCallStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FunCallContext funCall() {
            return getRuleContext(FunCallContext.class, 0);
        }

        public BuildInFunStmtContext buildInFunStmt() {
            return getRuleContext(BuildInFunStmtContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funCallStmt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitFunCallStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BuildInFunStmtContext extends ParserRuleContext {
        public BuildInFunStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BuildInFunStmtContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_buildInFunStmt;
        }

        public void copyFrom(BuildInFunStmtContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class PrintStmtContext extends BuildInFunStmtContext {
        public PrintStmtContext(BuildInFunStmtContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitPrintStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrintlnStmtContext extends BuildInFunStmtContext {
        public PrintlnStmtContext(BuildInFunStmtContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitPrintlnStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarFunExprContext extends ParserRuleContext {
        public VarFunExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FunCallContext funCall() {
            return getRuleContext(FunCallContext.class, 0);
        }

        public VarNameExprContext varNameExpr() {
            return getRuleContext(VarNameExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varFunExpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitVarFunExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunDeclStmtContext extends ParserRuleContext {
        public FunDeclStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FunTypeContext funType() {
            return getRuleContext(FunTypeContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(CYXParser.ID, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public ParamsContext params() {
            return getRuleContext(ParamsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funDeclStmt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitFunDeclStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunTypeContext extends ParserRuleContext {
        public FunTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funType;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitFunType(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParamsContext extends ParserRuleContext {
        public ParamsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ParamContext> param() {
            return getRuleContexts(ParamContext.class);
        }

        public ParamContext param(int i) {
            return getRuleContext(ParamContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_params;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitParams(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParamContext extends ParserRuleContext {
        public ParamContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(CYXParser.ID, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_param;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitParam(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunCallContext extends ParserRuleContext {
        public FunCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(CYXParser.ID, 0);
        }

        public ArgsContext args() {
            return getRuleContext(ArgsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funCall;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitFunCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ArgsContext extends ParserRuleContext {
        public ArgsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_args;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitArgs(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarNameExprContext extends ParserRuleContext {
        public VarNameExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(CYXParser.ID, 0);
        }

        public SubScriptsContext subScripts() {
            return getRuleContext(SubScriptsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varNameExpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitVarNameExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarDeclStmtContext extends ParserRuleContext {
        public VarDeclStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public VarTypeContext varType() {
            return getRuleContext(VarTypeContext.class, 0);
        }

        public VarNameExprContext varNameExpr() {
            return getRuleContext(VarNameExprContext.class, 0);
        }

        public SubListContext subList() {
            return getRuleContext(SubListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varDeclStmt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitVarDeclStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarTypeContext extends ParserRuleContext {
        public VarTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varType;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitVarType(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarAssignStmtContext extends ParserRuleContext {
        public VarAssignStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public VarNameExprContext varNameExpr() {
            return getRuleContext(VarNameExprContext.class, 0);
        }

        public SubListContext subList() {
            return getRuleContext(SubListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varAssignStmt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitVarAssignStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SubScriptsContext extends ParserRuleContext {
        public SubScriptsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<SubScriptContext> subScript() {
            return getRuleContexts(SubScriptContext.class);
        }

        public SubScriptContext subScript(int i) {
            return getRuleContext(SubScriptContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_subScripts;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitSubScripts(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SubScriptContext extends ParserRuleContext {
        public SubScriptContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_subScript;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitSubScript(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfStmtsContext extends ParserRuleContext {
        public IfStmtsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IfStmtContext ifStmt() {
            return getRuleContext(IfStmtContext.class, 0);
        }

        public List<ElseifStmtContext> elseifStmt() {
            return getRuleContexts(ElseifStmtContext.class);
        }

        public ElseifStmtContext elseifStmt(int i) {
            return getRuleContext(ElseifStmtContext.class, i);
        }

        public ElseStmtContext elseStmt() {
            return getRuleContext(ElseStmtContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifStmts;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitIfStmts(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfStmtContext extends ParserRuleContext {
        public IfStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IF() {
            return getToken(CYXParser.IF, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public StmtContext stmt() {
            return getRuleContext(StmtContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifStmt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitIfStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ElseifStmtContext extends ParserRuleContext {
        public ElseifStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ELSE() {
            return getToken(CYXParser.ELSE, 0);
        }

        public TerminalNode IF() {
            return getToken(CYXParser.IF, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public StmtContext stmt() {
            return getRuleContext(StmtContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elseifStmt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitElseifStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ElseStmtContext extends ParserRuleContext {
        public ElseStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ELSE() {
            return getToken(CYXParser.ELSE, 0);
        }

        public StmtContext stmt() {
            return getRuleContext(StmtContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elseStmt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitElseStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ForStmtContext extends ParserRuleContext {
        public ExprContext cond;
        public ExprContext step;

        public ForStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FOR() {
            return getToken(CYXParser.FOR, 0);
        }

        public VarDeclStmtContext varDeclStmt() {
            return getRuleContext(VarDeclStmtContext.class, 0);
        }

        public StmtContext stmt() {
            return getRuleContext(StmtContext.class, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public VarAssignStmtContext varAssignStmt() {
            return getRuleContext(VarAssignStmtContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forStmt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitForStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WhileStmtContext extends ParserRuleContext {
        public WhileStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode WHILE() {
            return getToken(CYXParser.WHILE, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public StmtContext stmt() {
            return getRuleContext(StmtContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whileStmt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitWhileStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NumberContext extends ParserRuleContext {
        public NumberContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INT() {
            return getToken(CYXParser.INT, 0);
        }

        public TerminalNode DECIMAL() {
            return getToken(CYXParser.DECIMAL, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_number;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitNumber(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ListContext extends ParserRuleContext {
        public ListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<SubListContext> subList() {
            return getRuleContexts(SubListContext.class);
        }

        public SubListContext subList(int i) {
            return getRuleContext(SubListContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_list;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SubListContext extends ParserRuleContext {
        public SubListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FunCallContext funCall() {
            return getRuleContext(FunCallContext.class, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public ListContext list() {
            return getRuleContext(ListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_subList;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitSubList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BreakStmtContext extends ParserRuleContext {
        public BreakStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_breakStmt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitBreakStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ContinueStmtContext extends ParserRuleContext {
        public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_continueStmt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CYXVisitor) return ((CYXVisitor<? extends T>) visitor).visitContinueStmt(this);
            else return visitor.visitChildren(this);
        }
    }
}