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
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, SELFADD = 24,
            SELFSUB = 25, MUL = 26, DIV = 27, MOD = 28, ADD = 29, SUB = 30, GE = 31, LE = 32, GT = 33,
            LT = 34, EQ = 35, NEQ = 36, BAND = 37, BXOR = 38, BOR = 39, LAND = 40, LOR = 41, LNOT = 42,
            IF = 43, ELSE = 44, FOR = 45, WHILE = 46, BOOL = 47, COMMENT = 48, ID = 49, LETTER = 50,
            INT = 51, DECIMAL = 52, STRING = 53, BLANK = 54;
    public static final int
            RULE_program = 0, RULE_block = 1, RULE_type = 2, RULE_stmt = 3, RULE_expr = 4,
            RULE_selfAddSub = 5, RULE_returnStmt = 6, RULE_funCallStmt = 7, RULE_buildInFunStmt = 8,
            RULE_varFunExpr = 9, RULE_funDeclStmt = 10, RULE_funType = 11, RULE_params = 12,
            RULE_param = 13, RULE_funCall = 14, RULE_args = 15, RULE_varNameExpr = 16,
            RULE_varDeclStmt = 17, RULE_varType = 18, RULE_varAssignStmt = 19, RULE_subScripts = 20,
            RULE_subScript = 21, RULE_ifStmts = 22, RULE_ifStmt = 23, RULE_elseifStmt = 24,
            RULE_elseStmt = 25, RULE_forStmt = 26, RULE_whileStmt = 27, RULE_number = 28,
            RULE_list = 29, RULE_subList = 30, RULE_breakStmt = 31, RULE_continueStmt = 32;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0167\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\7\3O\n\3\f\3\16" +
                    "\3R\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3" +
                    "\5\5\5d\n\5\3\5\5\5g\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\6\5\6x\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0095" +
                    "\n\6\f\6\16\6\u0098\13\6\3\7\3\7\3\7\3\7\5\7\u009e\n\7\3\b\3\b\5\b\u00a2" +
                    "\n\b\3\t\3\t\5\t\u00a6\n\t\3\n\3\n\3\n\5\n\u00ab\n\n\3\n\3\n\7\n\u00af" +
                    "\n\n\f\n\16\n\u00b2\13\n\3\n\3\n\3\n\3\n\5\n\u00b8\n\n\3\n\3\n\7\n\u00bc" +
                    "\n\n\f\n\16\n\u00bf\13\n\3\n\5\n\u00c2\n\n\3\13\3\13\5\13\u00c6\n\13\3" +
                    "\f\3\f\3\f\3\f\5\f\u00cc\n\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00d4\n\r\3\16" +
                    "\3\16\3\16\7\16\u00d9\n\16\f\16\16\16\u00dc\13\16\3\17\5\17\u00df\n\17" +
                    "\3\17\3\17\3\20\3\20\3\20\5\20\u00e6\n\20\3\20\3\20\3\21\3\21\3\21\7\21" +
                    "\u00ed\n\21\f\21\16\21\u00f0\13\21\3\22\3\22\5\22\u00f4\n\22\3\23\3\23" +
                    "\3\23\3\23\5\23\u00fa\n\23\3\24\3\24\5\24\u00fe\n\24\3\25\3\25\3\25\3" +
                    "\25\3\26\6\26\u0105\n\26\r\26\16\26\u0106\3\27\3\27\3\27\3\27\3\30\3\30" +
                    "\7\30\u010f\n\30\f\30\16\30\u0112\13\30\3\30\5\30\u0115\n\30\3\31\3\31" +
                    "\3\31\5\31\u011a\n\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0122\n\32\3" +
                    "\32\3\32\3\33\3\33\5\33\u0128\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34" +
                    "\5\34\u0131\n\34\3\34\3\34\5\34\u0135\n\34\3\34\3\34\3\34\3\34\3\34\3" +
                    "\34\3\34\3\34\5\34\u013f\n\34\3\34\3\34\5\34\u0143\n\34\3\34\3\34\3\34" +
                    "\5\34\u0148\n\34\3\35\3\35\3\35\5\35\u014d\n\35\3\35\3\35\3\36\3\36\3" +
                    "\37\3\37\3\37\3\37\7\37\u0157\n\37\f\37\16\37\u015a\13\37\3\37\3\37\3" +
                    " \3 \3 \5 \u0161\n \3!\3!\3\"\3\"\3\"\2\3\n#\2\4\6\b\n\f\16\20\22\24\26" +
                    "\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\t\3\2\5\t\3\2\34\36\3\2\37 " +
                    "\3\2!$\3\2%&\3\2\32\33\3\2\65\66\2\u0186\2G\3\2\2\2\4L\3\2\2\2\6U\3\2" +
                    "\2\2\bc\3\2\2\2\nw\3\2\2\2\f\u009d\3\2\2\2\16\u009f\3\2\2\2\20\u00a5\3" +
                    "\2\2\2\22\u00c1\3\2\2\2\24\u00c5\3\2\2\2\26\u00c7\3\2\2\2\30\u00d3\3\2" +
                    "\2\2\32\u00d5\3\2\2\2\34\u00de\3\2\2\2\36\u00e2\3\2\2\2 \u00e9\3\2\2\2" +
                    "\"\u00f1\3\2\2\2$\u00f5\3\2\2\2&\u00fd\3\2\2\2(\u00ff\3\2\2\2*\u0104\3" +
                    "\2\2\2,\u0108\3\2\2\2.\u010c\3\2\2\2\60\u0116\3\2\2\2\62\u011d\3\2\2\2" +
                    "\64\u0125\3\2\2\2\66\u0147\3\2\2\28\u0149\3\2\2\2:\u0150\3\2\2\2<\u0152" +
                    "\3\2\2\2>\u0160\3\2\2\2@\u0162\3\2\2\2B\u0164\3\2\2\2DF\5\b\5\2ED\3\2" +
                    "\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\2\2\3K\3\3" +
                    "\2\2\2LP\7\3\2\2MO\5\b\5\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3" +
                    "\2\2\2RP\3\2\2\2ST\7\4\2\2T\5\3\2\2\2UV\t\2\2\2V\7\3\2\2\2Wd\5\4\3\2X" +
                    "d\5\26\f\2Yd\5\20\t\2Zd\5$\23\2[d\5(\25\2\\d\5.\30\2]d\5\66\34\2^d\58" +
                    "\35\2_d\5\16\b\2`d\5\f\7\2ad\5B\"\2bd\5@!\2cW\3\2\2\2cX\3\2\2\2cY\3\2" +
                    "\2\2cZ\3\2\2\2c[\3\2\2\2c\\\3\2\2\2c]\3\2\2\2c^\3\2\2\2c_\3\2\2\2c`\3" +
                    "\2\2\2ca\3\2\2\2cb\3\2\2\2df\3\2\2\2eg\7\n\2\2fe\3\2\2\2fg\3\2\2\2g\t" +
                    "\3\2\2\2hi\b\6\1\2ix\5\f\7\2jk\7 \2\2kx\5\n\6\nlm\7,\2\2mx\5\n\6\tnx\5" +
                    ":\36\2ox\5\24\13\2px\5\36\20\2qx\7\67\2\2rx\7\61\2\2st\7\13\2\2tu\5\n" +
                    "\6\2uv\7\f\2\2vx\3\2\2\2wh\3\2\2\2wj\3\2\2\2wl\3\2\2\2wn\3\2\2\2wo\3\2" +
                    "\2\2wp\3\2\2\2wq\3\2\2\2wr\3\2\2\2ws\3\2\2\2x\u0096\3\2\2\2yz\f\23\2\2" +
                    "z{\t\3\2\2{\u0095\5\n\6\24|}\f\22\2\2}~\t\4\2\2~\u0095\5\n\6\23\177\u0080" +
                    "\f\21\2\2\u0080\u0081\t\5\2\2\u0081\u0095\5\n\6\22\u0082\u0083\f\20\2" +
                    "\2\u0083\u0084\t\6\2\2\u0084\u0095\5\n\6\21\u0085\u0086\f\17\2\2\u0086" +
                    "\u0087\7\'\2\2\u0087\u0095\5\n\6\20\u0088\u0089\f\16\2\2\u0089\u008a\7" +
                    "(\2\2\u008a\u0095\5\n\6\17\u008b\u008c\f\r\2\2\u008c\u008d\7)\2\2\u008d" +
                    "\u0095\5\n\6\16\u008e\u008f\f\f\2\2\u008f\u0090\7*\2\2\u0090\u0095\5\n" +
                    "\6\r\u0091\u0092\f\13\2\2\u0092\u0093\7+\2\2\u0093\u0095\5\n\6\f\u0094" +
                    "y\3\2\2\2\u0094|\3\2\2\2\u0094\177\3\2\2\2\u0094\u0082\3\2\2\2\u0094\u0085" +
                    "\3\2\2\2\u0094\u0088\3\2\2\2\u0094\u008b\3\2\2\2\u0094\u008e\3\2\2\2\u0094" +
                    "\u0091\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2" +
                    "\2\2\u0097\13\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\63\2\2\u009a\u009e" +
                    "\t\7\2\2\u009b\u009c\t\7\2\2\u009c\u009e\7\63\2\2\u009d\u0099\3\2\2\2" +
                    "\u009d\u009b\3\2\2\2\u009e\r\3\2\2\2\u009f\u00a1\7\r\2\2\u00a0\u00a2\5" +
                    "\n\6\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\17\3\2\2\2\u00a3" +
                    "\u00a6\5\36\20\2\u00a4\u00a6\5\22\n\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4" +
                    "\3\2\2\2\u00a6\21\3\2\2\2\u00a7\u00a8\7\16\2\2\u00a8\u00aa\7\13\2\2\u00a9" +
                    "\u00ab\5\n\6\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b0\3\2" +
                    "\2\2\u00ac\u00ad\7\17\2\2\u00ad\u00af\5\n\6\2\u00ae\u00ac\3\2\2\2\u00af" +
                    "\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2" +
                    "\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00c2\7\f\2\2\u00b4\u00b5\7\20\2\2\u00b5" +
                    "\u00b7\7\13\2\2\u00b6\u00b8\5\n\6\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3" +
                    "\2\2\2\u00b8\u00bd\3\2\2\2\u00b9\u00ba\7\17\2\2\u00ba\u00bc\5\n\6\2\u00bb" +
                    "\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2" +
                    "\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\7\f\2\2\u00c1" +
                    "\u00a7\3\2\2\2\u00c1\u00b4\3\2\2\2\u00c2\23\3\2\2\2\u00c3\u00c6\5\36\20" +
                    "\2\u00c4\u00c6\5\"\22\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6" +
                    "\25\3\2\2\2\u00c7\u00c8\5\30\r\2\u00c8\u00c9\7\63\2\2\u00c9\u00cb\7\13" +
                    "\2\2\u00ca\u00cc\5\32\16\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc" +
                    "\u00cd\3\2\2\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\5\4\3\2\u00cf\27\3\2\2" +
                    "\2\u00d0\u00d4\7\21\2\2\u00d1\u00d4\7\22\2\2\u00d2\u00d4\5\6\4\2\u00d3" +
                    "\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\31\3\2\2" +
                    "\2\u00d5\u00da\5\34\17\2\u00d6\u00d7\7\17\2\2\u00d7\u00d9\5\34\17\2\u00d8" +
                    "\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2" +
                    "\2\2\u00db\33\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\5\6\4\2\u00de\u00dd" +
                    "\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7\63\2\2" +
                    "\u00e1\35\3\2\2\2\u00e2\u00e3\7\63\2\2\u00e3\u00e5\7\13\2\2\u00e4\u00e6" +
                    "\5 \21\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7" +
                    "\u00e8\7\f\2\2\u00e8\37\3\2\2\2\u00e9\u00ee\5\n\6\2\u00ea\u00eb\7\17\2" +
                    "\2\u00eb\u00ed\5\n\6\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec" +
                    "\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef!\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1" +
                    "\u00f3\7\63\2\2\u00f2\u00f4\5*\26\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3" +
                    "\2\2\2\u00f4#\3\2\2\2\u00f5\u00f6\5&\24\2\u00f6\u00f9\5\"\22\2\u00f7\u00f8" +
                    "\7\23\2\2\u00f8\u00fa\5> \2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa" +
                    "%\3\2\2\2\u00fb\u00fe\7\24\2\2\u00fc\u00fe\5\6\4\2\u00fd\u00fb\3\2\2\2" +
                    "\u00fd\u00fc\3\2\2\2\u00fe\'\3\2\2\2\u00ff\u0100\5\"\22\2\u0100\u0101" +
                    "\7\23\2\2\u0101\u0102\5> \2\u0102)\3\2\2\2\u0103\u0105\5,\27\2\u0104\u0103" +
                    "\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107" +
                    "+\3\2\2\2\u0108\u0109\7\25\2\2\u0109\u010a\5\n\6\2\u010a\u010b\7\26\2" +
                    "\2\u010b-\3\2\2\2\u010c\u0110\5\60\31\2\u010d\u010f\5\62\32\2\u010e\u010d" +
                    "\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111" +
                    "\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\5\64\33\2\u0114\u0113\3" +
                    "\2\2\2\u0114\u0115\3\2\2\2\u0115/\3\2\2\2\u0116\u0117\7-\2\2\u0117\u0119" +
                    "\5\n\6\2\u0118\u011a\7\27\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2" +
                    "\u011a\u011b\3\2\2\2\u011b\u011c\5\b\5\2\u011c\61\3\2\2\2\u011d\u011e" +
                    "\7.\2\2\u011e\u011f\7-\2\2\u011f\u0121\5\n\6\2\u0120\u0122\7\27\2\2\u0121" +
                    "\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\5\b" +
                    "\5\2\u0124\63\3\2\2\2\u0125\u0127\7.\2\2\u0126\u0128\7\27\2\2\u0127\u0126" +
                    "\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\5\b\5\2\u012a" +
                    "\65\3\2\2\2\u012b\u012c\7/\2\2\u012c\u012d\7\13\2\2\u012d\u012e\5$\23" +
                    "\2\u012e\u0130\7\n\2\2\u012f\u0131\5\n\6\2\u0130\u012f\3\2\2\2\u0130\u0131" +
                    "\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\7\n\2\2\u0133\u0135\5\n\6\2\u0134" +
                    "\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7\f" +
                    "\2\2\u0137\u0138\5\b\5\2\u0138\u0148\3\2\2\2\u0139\u013a\7/\2\2\u013a" +
                    "\u013b\7\13\2\2\u013b\u013c\5(\25\2\u013c\u013e\7\n\2\2\u013d\u013f\5" +
                    "\n\6\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140" +
                    "\u0142\7\n\2\2\u0141\u0143\5\n\6\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2" +
                    "\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\f\2\2\u0145\u0146\5\b\5\2\u0146" +
                    "\u0148\3\2\2\2\u0147\u012b\3\2\2\2\u0147\u0139\3\2\2\2\u0148\67\3\2\2" +
                    "\2\u0149\u014a\7\60\2\2\u014a\u014c\5\n\6\2\u014b\u014d\7\27\2\2\u014c" +
                    "\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\5\b" +
                    "\5\2\u014f9\3\2\2\2\u0150\u0151\t\b\2\2\u0151;\3\2\2\2\u0152\u0153\7\25" +
                    "\2\2\u0153\u0158\5> \2\u0154\u0155\7\17\2\2\u0155\u0157\5> \2\u0156\u0154" +
                    "\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159" +
                    "\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\26\2\2\u015c=\3\2\2\2" +
                    "\u015d\u0161\5\36\20\2\u015e\u0161\5\n\6\2\u015f\u0161\5<\37\2\u0160\u015d" +
                    "\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161?\3\2\2\2\u0162" +
                    "\u0163\7\30\2\2\u0163A\3\2\2\2\u0164\u0165\7\31\2\2\u0165C\3\2\2\2)GP" +
                    "cfw\u0094\u0096\u009d\u00a1\u00a5\u00aa\u00b0\u00b7\u00bd\u00c1\u00c5" +
                    "\u00cb\u00d3\u00da\u00de\u00e5\u00ee\u00f3\u00f9\u00fd\u0106\u0110\u0114" +
                    "\u0119\u0121\u0127\u0130\u0134\u013e\u0142\u0147\u014c\u0158\u0160";
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
                "funCallStmt", "buildInFunStmt", "varFunExpr", "funDeclStmt", "funType",
                "params", "param", "funCall", "args", "varNameExpr", "varDeclStmt", "varType",
                "varAssignStmt", "subScripts", "subScript", "ifStmts", "ifStmt", "elseifStmt",
                "elseStmt", "forStmt", "whileStmt", "number", "list", "subList", "breakStmt",
                "continueStmt"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'{'", "'}'", "'int'", "'double'", "'string'", "'list'", "'bool'",
                "';'", "'('", "')'", "'return'", "'print'", "','", "'println'", "'fun'",
                "'void'", "'='", "'var'", "'['", "']'", "':'", "'break'", "'continue'",
                "'++'", "'--'", "'*'", "'/'", "'%'", "'+'", "'-'", "'>='", "'<='", "'>'",
                "'<'", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'!'", "'if'",
                "'else'", "'for'", "'while'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                "SELFADD", "SELFSUB", "MUL", "DIV", "MOD", "ADD", "SUB", "GE", "LE",
                "GT", "LT", "EQ", "NEQ", "BAND", "BXOR", "BOR", "LAND", "LOR", "LNOT",
                "IF", "ELSE", "FOR", "WHILE", "BOOL", "COMMENT", "ID", "LETTER", "INT",
                "DECIMAL", "STRING", "BLANK"
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
                setState(69);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__21) | (1L << T__22) | (1L << SELFADD) | (1L << SELFSUB) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(66);
                            stmt();
                        }
                    }
                    setState(71);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(72);
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
                setState(74);
                match(T__0);
                setState(78);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__21) | (1L << T__22) | (1L << SELFADD) | (1L << SELFSUB) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(75);
                            stmt();
                        }
                    }
                    setState(80);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(81);
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
                setState(83);
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
                setState(97);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                    case 1: {
                        setState(85);
                        block();
                    }
                    break;
                    case 2: {
                        setState(86);
                        funDeclStmt();
                    }
                    break;
                    case 3: {
                        setState(87);
                        funCallStmt();
                    }
                    break;
                    case 4: {
                        setState(88);
                        varDeclStmt();
                    }
                    break;
                    case 5: {
                        setState(89);
                        varAssignStmt();
                    }
                    break;
                    case 6: {
                        setState(90);
                        ifStmts();
                    }
                    break;
                    case 7: {
                        setState(91);
                        forStmt();
                    }
                    break;
                    case 8: {
                        setState(92);
                        whileStmt();
                    }
                    break;
                    case 9: {
                        setState(93);
                        returnStmt();
                    }
                    break;
                    case 10: {
                        setState(94);
                        selfAddSub();
                    }
                    break;
                    case 11: {
                        setState(95);
                        continueStmt();
                    }
                    break;
                    case 12: {
                        setState(96);
                        breakStmt();
                    }
                    break;
                }
                setState(100);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                    case 1: {
                        setState(99);
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
                setState(117);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                    case 1: {
                        _localctx = new SelfAddSubExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(103);
                        selfAddSub();
                    }
                    break;
                    case 2: {
                        _localctx = new UnaryExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(104);
                        ((UnaryExprContext) _localctx).op = match(SUB);
                        setState(105);
                        expr(8);
                    }
                    break;
                    case 3: {
                        _localctx = new UnaryExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(106);
                        ((UnaryExprContext) _localctx).op = match(LNOT);
                        setState(107);
                        expr(7);
                    }
                    break;
                    case 4: {
                        _localctx = new NumberExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(108);
                        number();
                    }
                    break;
                    case 5: {
                        _localctx = new IdentifierExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(109);
                        varFunExpr();
                    }
                    break;
                    case 6: {
                        _localctx = new FunCallExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(110);
                        funCall();
                    }
                    break;
                    case 7: {
                        _localctx = new StringExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(111);
                        match(STRING);
                    }
                    break;
                    case 8: {
                        _localctx = new BooleanExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(112);
                        match(BOOL);
                    }
                    break;
                    case 9: {
                        _localctx = new SubExprExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(113);
                        match(T__8);
                        setState(114);
                        expr(0);
                        setState(115);
                        match(T__9);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(148);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(146);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                                case 1: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(119);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(120);
                                    ((BinaryExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        ((BinaryExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(121);
                                    expr(18);
                                }
                                break;
                                case 2: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(122);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(123);
                                    ((BinaryExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == ADD || _la == SUB)) {
                                        ((BinaryExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(124);
                                    expr(17);
                                }
                                break;
                                case 3: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(125);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(126);
                                    ((BinaryExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GE) | (1L << LE) | (1L << GT) | (1L << LT))) != 0))) {
                                        ((BinaryExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(127);
                                    expr(16);
                                }
                                break;
                                case 4: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(128);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(129);
                                    ((BinaryExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == EQ || _la == NEQ)) {
                                        ((BinaryExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(130);
                                    expr(15);
                                }
                                break;
                                case 5: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(131);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(132);
                                    ((BinaryExprContext) _localctx).op = match(BAND);
                                    setState(133);
                                    expr(14);
                                }
                                break;
                                case 6: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(134);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(135);
                                    ((BinaryExprContext) _localctx).op = match(BXOR);
                                    setState(136);
                                    expr(13);
                                }
                                break;
                                case 7: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(137);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(138);
                                    ((BinaryExprContext) _localctx).op = match(BOR);
                                    setState(139);
                                    expr(12);
                                }
                                break;
                                case 8: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(140);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(141);
                                    ((BinaryExprContext) _localctx).op = match(LAND);
                                    setState(142);
                                    expr(11);
                                }
                                break;
                                case 9: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(143);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(144);
                                    ((BinaryExprContext) _localctx).op = match(LOR);
                                    setState(145);
                                    expr(10);
                                }
                                break;
                            }
                        }
                    }
                    setState(150);
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
            setState(155);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ID:
                    _localctx = new PostSelfCalcContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(151);
                    match(ID);
                    setState(152);
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
                    setState(153);
                    ((PreSelfCalcContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == SELFADD || _la == SELFSUB)) {
                        ((PreSelfCalcContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(154);
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
                    setState(157);
                    match(T__10);
                    setState(159);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                        case 1: {
                            setState(158);
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

    public final FunCallStmtContext funCallStmt() throws RecognitionException {
        FunCallStmtContext _localctx = new FunCallStmtContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_funCallStmt);
        try {
            setState(163);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(161);
                    funCall();
                }
                break;
                case T__11:
                case T__13:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(162);
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
        enterRule(_localctx, 16, RULE_buildInFunStmt);
        int _la;
        try {
            setState(191);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__11:
                    _localctx = new PrintStmtContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(165);
                    match(T__11);
                    setState(166);
                    match(T__8);
                    setState(168);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(167);
                            expr(0);
                        }
                    }

                    setState(174);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__12) {
                        {
                            {
                                setState(170);
                                match(T__12);
                                setState(171);
                                expr(0);
                            }
                        }
                        setState(176);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(177);
                    match(T__9);
                }
                break;
                case T__13:
                    _localctx = new PrintlnStmtContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(178);
                    match(T__13);
                    setState(179);
                    match(T__8);
                    setState(181);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(180);
                            expr(0);
                        }
                    }

                    setState(187);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__12) {
                        {
                            {
                                setState(183);
                                match(T__12);
                                setState(184);
                                expr(0);
                            }
                        }
                        setState(189);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(190);
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
        enterRule(_localctx, 18, RULE_varFunExpr);
        try {
            setState(195);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(193);
                    funCall();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(194);
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
        enterRule(_localctx, 20, RULE_funDeclStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(197);
                funType();
                setState(198);
                match(ID);
                setState(199);
                match(T__8);
                setState(201);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0)) {
                    {
                        setState(200);
                        params();
                    }
                }

                setState(203);
                match(T__9);
                setState(204);
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
        enterRule(_localctx, 22, RULE_funType);
        try {
            setState(209);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__14:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(206);
                    match(T__14);
                }
                break;
                case T__15:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(207);
                    match(T__15);
                }
                break;
                case T__2:
                case T__3:
                case T__4:
                case T__5:
                case T__6:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(208);
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
        enterRule(_localctx, 24, RULE_params);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(211);
                param();
                setState(216);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__12) {
                    {
                        {
                            setState(212);
                            match(T__12);
                            setState(213);
                            param();
                        }
                    }
                    setState(218);
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
        enterRule(_localctx, 26, RULE_param);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(220);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) {
                    {
                        setState(219);
                        type();
                    }
                }

                setState(222);
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
        enterRule(_localctx, 28, RULE_funCall);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(224);
                match(ID);
                setState(225);
                match(T__8);
                setState(227);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                    {
                        setState(226);
                        args();
                    }
                }

                setState(229);
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
        enterRule(_localctx, 30, RULE_args);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(231);
                expr(0);
                setState(236);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__12) {
                    {
                        {
                            setState(232);
                            match(T__12);
                            setState(233);
                            expr(0);
                        }
                    }
                    setState(238);
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
        enterRule(_localctx, 32, RULE_varNameExpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(239);
                match(ID);
                setState(241);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                    case 1: {
                        setState(240);
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
        enterRule(_localctx, 34, RULE_varDeclStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(243);
                varType();
                setState(244);
                varNameExpr();
                setState(247);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__16) {
                    {
                        setState(245);
                        match(T__16);
                        setState(246);
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
        enterRule(_localctx, 36, RULE_varType);
        try {
            setState(251);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__17:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(249);
                    match(T__17);
                }
                break;
                case T__2:
                case T__3:
                case T__4:
                case T__5:
                case T__6:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(250);
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
        enterRule(_localctx, 38, RULE_varAssignStmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(253);
                varNameExpr();
                setState(254);
                match(T__16);
                setState(255);
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
        enterRule(_localctx, 40, RULE_subScripts);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(258);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(257);
                                subScript();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(260);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
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
        enterRule(_localctx, 42, RULE_subScript);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(262);
                match(T__18);
                setState(263);
                expr(0);
                setState(264);
                match(T__19);
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
        enterRule(_localctx, 44, RULE_ifStmts);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(266);
                ifStmt();
                setState(270);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(267);
                                elseifStmt();
                            }
                        }
                    }
                    setState(272);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                }
                setState(274);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                    case 1: {
                        setState(273);
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
        enterRule(_localctx, 46, RULE_ifStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(276);
                match(IF);
                setState(277);
                expr(0);
                setState(279);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__20) {
                    {
                        setState(278);
                        match(T__20);
                    }
                }

                setState(281);
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
        enterRule(_localctx, 48, RULE_elseifStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(283);
                match(ELSE);
                setState(284);
                match(IF);
                setState(285);
                expr(0);
                setState(287);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__20) {
                    {
                        setState(286);
                        match(T__20);
                    }
                }

                setState(289);
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
        enterRule(_localctx, 50, RULE_elseStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(291);
                match(ELSE);
                setState(293);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__20) {
                    {
                        setState(292);
                        match(T__20);
                    }
                }

                setState(295);
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
        enterRule(_localctx, 52, RULE_forStmt);
        int _la;
        try {
            setState(325);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(297);
                    match(FOR);
                    setState(298);
                    match(T__8);
                    setState(299);
                    varDeclStmt();
                    setState(300);
                    match(T__7);
                    setState(302);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(301);
                            ((ForStmtContext) _localctx).cond = expr(0);
                        }
                    }

                    setState(304);
                    match(T__7);
                    setState(306);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(305);
                            ((ForStmtContext) _localctx).step = expr(0);
                        }
                    }

                    setState(308);
                    match(T__9);
                    setState(309);
                    stmt();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(311);
                    match(FOR);
                    setState(312);
                    match(T__8);
                    setState(313);
                    varAssignStmt();
                    setState(314);
                    match(T__7);
                    setState(316);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(315);
                            ((ForStmtContext) _localctx).cond = expr(0);
                        }
                    }

                    setState(318);
                    match(T__7);
                    setState(320);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(319);
                            ((ForStmtContext) _localctx).step = expr(0);
                        }
                    }

                    setState(322);
                    match(T__9);
                    setState(323);
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
        enterRule(_localctx, 54, RULE_whileStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(327);
                match(WHILE);
                setState(328);
                expr(0);
                setState(330);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__20) {
                    {
                        setState(329);
                        match(T__20);
                    }
                }

                setState(332);
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
        enterRule(_localctx, 56, RULE_number);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(334);
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
        enterRule(_localctx, 58, RULE_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(336);
                match(T__18);
                setState(337);
                subList();
                setState(342);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__12) {
                    {
                        {
                            setState(338);
                            match(T__12);
                            setState(339);
                            subList();
                        }
                    }
                    setState(344);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(345);
                match(T__19);
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
        enterRule(_localctx, 60, RULE_subList);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(350);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 38, _ctx)) {
                    case 1: {
                        setState(347);
                        funCall();
                    }
                    break;
                    case 2: {
                        setState(348);
                        expr(0);
                    }
                    break;
                    case 3: {
                        setState(349);
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
        enterRule(_localctx, 62, RULE_breakStmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(352);
                match(T__21);
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
        enterRule(_localctx, 64, RULE_continueStmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(354);
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
                return precpred(_ctx, 17);
            case 1:
                return precpred(_ctx, 16);
            case 2:
                return precpred(_ctx, 15);
            case 3:
                return precpred(_ctx, 14);
            case 4:
                return precpred(_ctx, 13);
            case 5:
                return precpred(_ctx, 12);
            case 6:
                return precpred(_ctx, 11);
            case 7:
                return precpred(_ctx, 10);
            case 8:
                return precpred(_ctx, 9);
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