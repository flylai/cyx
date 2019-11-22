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
            T__17 = 18, T__18 = 19, T__19 = 20, SELFADD = 21, SELFSUB = 22, MUL = 23, DIV = 24,
            MOD = 25, ADD = 26, SUB = 27, GE = 28, LE = 29, GT = 30, LT = 31, EQ = 32, NEQ = 33, BAND = 34,
            BXOR = 35, BOR = 36, LAND = 37, LOR = 38, LNOT = 39, IF = 40, ELSE = 41, FOR = 42, WHILE = 43,
            BOOL = 44, BREAK = 45, CONTINUE = 46, COMMENT = 47, ID = 48, LETTER = 49, INT = 50,
            DECIMAL = 51, STRING = 52, BLANK = 53;
    public static final int
            RULE_program = 0, RULE_block = 1, RULE_type = 2, RULE_stmt = 3, RULE_expr = 4,
            RULE_selfAddSub = 5, RULE_returnStmt = 6, RULE_funCallStmt = 7, RULE_buildInFunStmt = 8,
            RULE_varFunExpr = 9, RULE_funDeclStmt = 10, RULE_funType = 11, RULE_params = 12,
            RULE_param = 13, RULE_funCall = 14, RULE_args = 15, RULE_varNameExpr = 16,
            RULE_varDeclStmt = 17, RULE_varType = 18, RULE_varAssignStmt = 19, RULE_subScripts = 20,
            RULE_subScript = 21, RULE_ifStmts = 22, RULE_ifStmt = 23, RULE_elseifStmt = 24,
            RULE_elseStmt = 25, RULE_forStmt = 26, RULE_whileStmt = 27, RULE_number = 28,
            RULE_list = 29, RULE_subList = 30;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u015e\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2" +
                    "\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3\3" +
                    "\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3" +
                    "\5\5\5c\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3" +
                    "\6\5\6t\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0091\n\6\f\6\16" +
                    "\6\u0094\13\6\3\7\3\7\3\7\3\7\5\7\u009a\n\7\3\b\3\b\5\b\u009e\n\b\3\t" +
                    "\3\t\5\t\u00a2\n\t\3\n\3\n\3\n\5\n\u00a7\n\n\3\n\3\n\7\n\u00ab\n\n\f\n" +
                    "\16\n\u00ae\13\n\3\n\3\n\3\n\3\n\5\n\u00b4\n\n\3\n\3\n\7\n\u00b8\n\n\f" +
                    "\n\16\n\u00bb\13\n\3\n\5\n\u00be\n\n\3\13\3\13\5\13\u00c2\n\13\3\f\3\f" +
                    "\3\f\3\f\5\f\u00c8\n\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00d0\n\r\3\16\3\16" +
                    "\3\16\7\16\u00d5\n\16\f\16\16\16\u00d8\13\16\3\17\5\17\u00db\n\17\3\17" +
                    "\3\17\3\20\3\20\3\20\5\20\u00e2\n\20\3\20\3\20\3\21\3\21\3\21\7\21\u00e9" +
                    "\n\21\f\21\16\21\u00ec\13\21\3\22\3\22\5\22\u00f0\n\22\3\23\3\23\3\23" +
                    "\3\23\5\23\u00f6\n\23\3\24\3\24\5\24\u00fa\n\24\3\25\3\25\3\25\3\25\3" +
                    "\26\6\26\u0101\n\26\r\26\16\26\u0102\3\27\3\27\3\27\3\27\3\30\3\30\7\30" +
                    "\u010b\n\30\f\30\16\30\u010e\13\30\3\30\5\30\u0111\n\30\3\31\3\31\3\31" +
                    "\5\31\u0116\n\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u011e\n\32\3\32\3" +
                    "\32\3\33\3\33\5\33\u0124\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34" +
                    "\u012d\n\34\3\34\3\34\5\34\u0131\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3" +
                    "\34\3\34\5\34\u013b\n\34\3\34\3\34\5\34\u013f\n\34\3\34\3\34\3\34\5\34" +
                    "\u0144\n\34\3\35\3\35\3\35\5\35\u0149\n\35\3\35\3\35\3\36\3\36\3\37\3" +
                    "\37\3\37\3\37\7\37\u0153\n\37\f\37\16\37\u0156\13\37\3\37\3\37\3 \3 \5" +
                    " \u015c\n \3 \2\3\n!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60" +
                    "\62\64\668:<>\2\t\3\2\5\b\3\2\31\33\3\2\34\35\3\2\36!\3\2\"#\3\2\27\30" +
                    "\3\2\64\65\2\u017e\2C\3\2\2\2\4H\3\2\2\2\6Q\3\2\2\2\b_\3\2\2\2\ns\3\2" +
                    "\2\2\f\u0099\3\2\2\2\16\u009b\3\2\2\2\20\u00a1\3\2\2\2\22\u00bd\3\2\2" +
                    "\2\24\u00c1\3\2\2\2\26\u00c3\3\2\2\2\30\u00cf\3\2\2\2\32\u00d1\3\2\2\2" +
                    "\34\u00da\3\2\2\2\36\u00de\3\2\2\2 \u00e5\3\2\2\2\"\u00ed\3\2\2\2$\u00f1" +
                    "\3\2\2\2&\u00f9\3\2\2\2(\u00fb\3\2\2\2*\u0100\3\2\2\2,\u0104\3\2\2\2." +
                    "\u0108\3\2\2\2\60\u0112\3\2\2\2\62\u0119\3\2\2\2\64\u0121\3\2\2\2\66\u0143" +
                    "\3\2\2\28\u0145\3\2\2\2:\u014c\3\2\2\2<\u014e\3\2\2\2>\u015b\3\2\2\2@" +
                    "B\5\b\5\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2" +
                    "FG\7\2\2\3G\3\3\2\2\2HL\7\3\2\2IK\5\b\5\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2" +
                    "\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\4\2\2P\5\3\2\2\2QR\t\2\2\2R\7\3\2" +
                    "\2\2S`\5\4\3\2T`\5\26\f\2U`\5\20\t\2V`\5$\23\2W`\5(\25\2X`\5.\30\2Y`\5" +
                    "\66\34\2Z`\58\35\2[`\5\16\b\2\\`\5\f\7\2]`\7\60\2\2^`\7/\2\2_S\3\2\2\2" +
                    "_T\3\2\2\2_U\3\2\2\2_V\3\2\2\2_W\3\2\2\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2" +
                    "_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`b\3\2\2\2ac\7\t\2\2ba\3\2\2" +
                    "\2bc\3\2\2\2c\t\3\2\2\2de\b\6\1\2et\5\f\7\2fg\7\35\2\2gt\5\n\6\nhi\7)" +
                    "\2\2it\5\n\6\tjt\5:\36\2kt\5\24\13\2lt\5\36\20\2mt\7\66\2\2nt\7.\2\2o" +
                    "p\7\n\2\2pq\5\n\6\2qr\7\13\2\2rt\3\2\2\2sd\3\2\2\2sf\3\2\2\2sh\3\2\2\2" +
                    "sj\3\2\2\2sk\3\2\2\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2t\u0092\3" +
                    "\2\2\2uv\f\23\2\2vw\t\3\2\2w\u0091\5\n\6\24xy\f\22\2\2yz\t\4\2\2z\u0091" +
                    "\5\n\6\23{|\f\21\2\2|}\t\5\2\2}\u0091\5\n\6\22~\177\f\20\2\2\177\u0080" +
                    "\t\6\2\2\u0080\u0091\5\n\6\21\u0081\u0082\f\17\2\2\u0082\u0083\7$\2\2" +
                    "\u0083\u0091\5\n\6\20\u0084\u0085\f\16\2\2\u0085\u0086\7%\2\2\u0086\u0091" +
                    "\5\n\6\17\u0087\u0088\f\r\2\2\u0088\u0089\7&\2\2\u0089\u0091\5\n\6\16" +
                    "\u008a\u008b\f\f\2\2\u008b\u008c\7\'\2\2\u008c\u0091\5\n\6\r\u008d\u008e" +
                    "\f\13\2\2\u008e\u008f\7(\2\2\u008f\u0091\5\n\6\f\u0090u\3\2\2\2\u0090" +
                    "x\3\2\2\2\u0090{\3\2\2\2\u0090~\3\2\2\2\u0090\u0081\3\2\2\2\u0090\u0084" +
                    "\3\2\2\2\u0090\u0087\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008d\3\2\2\2\u0091" +
                    "\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\13\3\2\2" +
                    "\2\u0094\u0092\3\2\2\2\u0095\u0096\7\62\2\2\u0096\u009a\t\7\2\2\u0097" +
                    "\u0098\t\7\2\2\u0098\u009a\7\62\2\2\u0099\u0095\3\2\2\2\u0099\u0097\3" +
                    "\2\2\2\u009a\r\3\2\2\2\u009b\u009d\7\f\2\2\u009c\u009e\5\n\6\2\u009d\u009c" +
                    "\3\2\2\2\u009d\u009e\3\2\2\2\u009e\17\3\2\2\2\u009f\u00a2\5\36\20\2\u00a0" +
                    "\u00a2\5\22\n\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\21\3\2\2" +
                    "\2\u00a3\u00a4\7\r\2\2\u00a4\u00a6\7\n\2\2\u00a5\u00a7\5\n\6\2\u00a6\u00a5" +
                    "\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ac\3\2\2\2\u00a8\u00a9\7\16\2\2" +
                    "\u00a9\u00ab\5\n\6\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa" +
                    "\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af" +
                    "\u00be\7\13\2\2\u00b0\u00b1\7\17\2\2\u00b1\u00b3\7\n\2\2\u00b2\u00b4\5" +
                    "\n\6\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b9\3\2\2\2\u00b5" +
                    "\u00b6\7\16\2\2\u00b6\u00b8\5\n\6\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3" +
                    "\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb" +
                    "\u00b9\3\2\2\2\u00bc\u00be\7\13\2\2\u00bd\u00a3\3\2\2\2\u00bd\u00b0\3" +
                    "\2\2\2\u00be\23\3\2\2\2\u00bf\u00c2\5\36\20\2\u00c0\u00c2\5\"\22\2\u00c1" +
                    "\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\25\3\2\2\2\u00c3\u00c4\5\30\r" +
                    "\2\u00c4\u00c5\7\62\2\2\u00c5\u00c7\7\n\2\2\u00c6\u00c8\5\32\16\2\u00c7" +
                    "\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\13" +
                    "\2\2\u00ca\u00cb\5\4\3\2\u00cb\27\3\2\2\2\u00cc\u00d0\7\20\2\2\u00cd\u00d0" +
                    "\7\21\2\2\u00ce\u00d0\5\6\4\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2" +
                    "\u00cf\u00ce\3\2\2\2\u00d0\31\3\2\2\2\u00d1\u00d6\5\34\17\2\u00d2\u00d3" +
                    "\7\16\2\2\u00d3\u00d5\5\34\17\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2" +
                    "\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\33\3\2\2\2\u00d8\u00d6" +
                    "\3\2\2\2\u00d9\u00db\5\6\4\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db" +
                    "\u00dc\3\2\2\2\u00dc\u00dd\7\62\2\2\u00dd\35\3\2\2\2\u00de\u00df\7\62" +
                    "\2\2\u00df\u00e1\7\n\2\2\u00e0\u00e2\5 \21\2\u00e1\u00e0\3\2\2\2\u00e1" +
                    "\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\13\2\2\u00e4\37\3\2\2" +
                    "\2\u00e5\u00ea\5\n\6\2\u00e6\u00e7\7\16\2\2\u00e7\u00e9\5\n\6\2\u00e8" +
                    "\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2" +
                    "\2\2\u00eb!\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\7\62\2\2\u00ee\u00f0" +
                    "\5*\26\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0#\3\2\2\2\u00f1" +
                    "\u00f2\5&\24\2\u00f2\u00f5\5\"\22\2\u00f3\u00f4\7\22\2\2\u00f4\u00f6\5" +
                    "> \2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6%\3\2\2\2\u00f7\u00fa" +
                    "\7\23\2\2\u00f8\u00fa\5\6\4\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2" +
                    "\u00fa\'\3\2\2\2\u00fb\u00fc\5\"\22\2\u00fc\u00fd\7\22\2\2\u00fd\u00fe" +
                    "\5> \2\u00fe)\3\2\2\2\u00ff\u0101\5,\27\2\u0100\u00ff\3\2\2\2\u0101\u0102" +
                    "\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103+\3\2\2\2\u0104" +
                    "\u0105\7\24\2\2\u0105\u0106\5\n\6\2\u0106\u0107\7\25\2\2\u0107-\3\2\2" +
                    "\2\u0108\u010c\5\60\31\2\u0109\u010b\5\62\32\2\u010a\u0109\3\2\2\2\u010b" +
                    "\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0110\3\2" +
                    "\2\2\u010e\u010c\3\2\2\2\u010f\u0111\5\64\33\2\u0110\u010f\3\2\2\2\u0110" +
                    "\u0111\3\2\2\2\u0111/\3\2\2\2\u0112\u0113\7*\2\2\u0113\u0115\5\n\6\2\u0114" +
                    "\u0116\7\26\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3" +
                    "\2\2\2\u0117\u0118\5\4\3\2\u0118\61\3\2\2\2\u0119\u011a\7+\2\2\u011a\u011b" +
                    "\7*\2\2\u011b\u011d\5\n\6\2\u011c\u011e\7\26\2\2\u011d\u011c\3\2\2\2\u011d" +
                    "\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\5\4\3\2\u0120\63\3\2\2" +
                    "\2\u0121\u0123\7+\2\2\u0122\u0124\7\26\2\2\u0123\u0122\3\2\2\2\u0123\u0124" +
                    "\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\5\4\3\2\u0126\65\3\2\2\2\u0127" +
                    "\u0128\7,\2\2\u0128\u0129\7\n\2\2\u0129\u012a\5$\23\2\u012a\u012c\7\t" +
                    "\2\2\u012b\u012d\5\n\6\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d" +
                    "\u012e\3\2\2\2\u012e\u0130\7\t\2\2\u012f\u0131\5\n\6\2\u0130\u012f\3\2" +
                    "\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\13\2\2\u0133" +
                    "\u0134\5\4\3\2\u0134\u0144\3\2\2\2\u0135\u0136\7,\2\2\u0136\u0137\7\n" +
                    "\2\2\u0137\u0138\5(\25\2\u0138\u013a\7\t\2\2\u0139\u013b\5\n\6\2\u013a" +
                    "\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\7\t" +
                    "\2\2\u013d\u013f\5\n\6\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f" +
                    "\u0140\3\2\2\2\u0140\u0141\7\13\2\2\u0141\u0142\5\4\3\2\u0142\u0144\3" +
                    "\2\2\2\u0143\u0127\3\2\2\2\u0143\u0135\3\2\2\2\u0144\67\3\2\2\2\u0145" +
                    "\u0146\7-\2\2\u0146\u0148\5\n\6\2\u0147\u0149\7\26\2\2\u0148\u0147\3\2" +
                    "\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\5\4\3\2\u014b" +
                    "9\3\2\2\2\u014c\u014d\t\b\2\2\u014d;\3\2\2\2\u014e\u014f\7\24\2\2\u014f" +
                    "\u0154\5> \2\u0150\u0151\7\16\2\2\u0151\u0153\5> \2\u0152\u0150\3\2\2" +
                    "\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157" +
                    "\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7\25\2\2\u0158=\3\2\2\2\u0159" +
                    "\u015c\5\n\6\2\u015a\u015c\5<\37\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2" +
                    "\2\2\u015c?\3\2\2\2)CL_bs\u0090\u0092\u0099\u009d\u00a1\u00a6\u00ac\u00b3" +
                    "\u00b9\u00bd\u00c1\u00c7\u00cf\u00d6\u00da\u00e1\u00ea\u00ef\u00f5\u00f9" +
                    "\u0102\u010c\u0110\u0115\u011d\u0123\u012c\u0130\u013a\u013e\u0143\u0148" +
                    "\u0154\u015b";
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
                "elseStmt", "forStmt", "whileStmt", "number", "list", "subList"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'{'", "'}'", "'int'", "'double'", "'string'", "'list'", "';'",
                "'('", "')'", "'return'", "'print'", "','", "'println'", "'fun'", "'void'",
                "'='", "'var'", "'['", "']'", "':'", "'++'", "'--'", "'*'", "'/'", "'%'",
                "'+'", "'-'", "'>='", "'<='", "'>'", "'<'", "'=='", "'!='", "'&'", "'^'",
                "'|'", "'&&'", "'||'", "'!'", "'if'", "'else'", "'for'", "'while'", null,
                "'break'", "'continue'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, "SELFADD", "SELFSUB",
                "MUL", "DIV", "MOD", "ADD", "SUB", "GE", "LE", "GT", "LT", "EQ", "NEQ",
                "BAND", "BXOR", "BOR", "LAND", "LOR", "LNOT", "IF", "ELSE", "FOR", "WHILE",
                "BOOL", "BREAK", "CONTINUE", "COMMENT", "ID", "LETTER", "INT", "DECIMAL",
                "STRING", "BLANK"
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
                setState(65);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << SELFADD) | (1L << SELFSUB) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(62);
                            stmt();
                        }
                    }
                    setState(67);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(68);
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
                setState(70);
                match(T__0);
                setState(74);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << SELFADD) | (1L << SELFSUB) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(71);
                            stmt();
                        }
                    }
                    setState(76);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(77);
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
                setState(79);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0))) {
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
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(93);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                    case 1: {
                        setState(81);
                        block();
                    }
                    break;
                    case 2: {
                        setState(82);
                        funDeclStmt();
                    }
                    break;
                    case 3: {
                        setState(83);
                        funCallStmt();
                    }
                    break;
                    case 4: {
                        setState(84);
                        varDeclStmt();
                    }
                    break;
                    case 5: {
                        setState(85);
                        varAssignStmt();
                    }
                    break;
                    case 6: {
                        setState(86);
                        ifStmts();
                    }
                    break;
                    case 7: {
                        setState(87);
                        forStmt();
                    }
                    break;
                    case 8: {
                        setState(88);
                        whileStmt();
                    }
                    break;
                    case 9: {
                        setState(89);
                        returnStmt();
                    }
                    break;
                    case 10: {
                        setState(90);
                        selfAddSub();
                    }
                    break;
                    case 11: {
                        setState(91);
                        match(CONTINUE);
                    }
                    break;
                    case 12: {
                        setState(92);
                        match(BREAK);
                    }
                    break;
                }
                setState(96);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__6) {
                    {
                        setState(95);
                        match(T__6);
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
                setState(113);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                    case 1: {
                        _localctx = new SelfAddSubExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(99);
                        selfAddSub();
                    }
                    break;
                    case 2: {
                        _localctx = new UnaryExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(100);
                        ((UnaryExprContext) _localctx).op = match(SUB);
                        setState(101);
                        expr(8);
                    }
                    break;
                    case 3: {
                        _localctx = new UnaryExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(102);
                        ((UnaryExprContext) _localctx).op = match(LNOT);
                        setState(103);
                        expr(7);
                    }
                    break;
                    case 4: {
                        _localctx = new NumberExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(104);
                        number();
                    }
                    break;
                    case 5: {
                        _localctx = new IdentifierExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(105);
                        varFunExpr();
                    }
                    break;
                    case 6: {
                        _localctx = new FunCallExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(106);
                        funCall();
                    }
                    break;
                    case 7: {
                        _localctx = new StringExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(107);
                        match(STRING);
                    }
                    break;
                    case 8: {
                        _localctx = new BooleanExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(108);
                        match(BOOL);
                    }
                    break;
                    case 9: {
                        _localctx = new SubExprExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(109);
                        match(T__7);
                        setState(110);
                        expr(0);
                        setState(111);
                        match(T__8);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(144);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(142);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                                case 1: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(115);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(116);
                                    ((BinaryExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        ((BinaryExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(117);
                                    expr(18);
                                }
                                break;
                                case 2: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(118);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(119);
                                    ((BinaryExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == ADD || _la == SUB)) {
                                        ((BinaryExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(120);
                                    expr(17);
                                }
                                break;
                                case 3: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(121);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(122);
                                    ((BinaryExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GE) | (1L << LE) | (1L << GT) | (1L << LT))) != 0))) {
                                        ((BinaryExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(123);
                                    expr(16);
                                }
                                break;
                                case 4: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(124);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(125);
                                    ((BinaryExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == EQ || _la == NEQ)) {
                                        ((BinaryExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(126);
                                    expr(15);
                                }
                                break;
                                case 5: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(127);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(128);
                                    ((BinaryExprContext) _localctx).op = match(BAND);
                                    setState(129);
                                    expr(14);
                                }
                                break;
                                case 6: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(130);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(131);
                                    ((BinaryExprContext) _localctx).op = match(BXOR);
                                    setState(132);
                                    expr(13);
                                }
                                break;
                                case 7: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(133);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(134);
                                    ((BinaryExprContext) _localctx).op = match(BOR);
                                    setState(135);
                                    expr(12);
                                }
                                break;
                                case 8: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(136);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(137);
                                    ((BinaryExprContext) _localctx).op = match(LAND);
                                    setState(138);
                                    expr(11);
                                }
                                break;
                                case 9: {
                                    _localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(139);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(140);
                                    ((BinaryExprContext) _localctx).op = match(LOR);
                                    setState(141);
                                    expr(10);
                                }
                                break;
                            }
                        }
                    }
                    setState(146);
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
            setState(151);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ID:
                    _localctx = new PostSelfCalcContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(147);
                    match(ID);
                    setState(148);
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
                    setState(149);
                    ((PreSelfCalcContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == SELFADD || _la == SELFSUB)) {
                        ((PreSelfCalcContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(150);
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
                    setState(153);
                    match(T__9);
                    setState(155);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                        case 1: {
                            setState(154);
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
            setState(159);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(157);
                    funCall();
                }
                break;
                case T__10:
                case T__12:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(158);
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
            setState(187);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__10:
                    _localctx = new PrintStmtContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(161);
                    match(T__10);
                    setState(162);
                    match(T__7);
                    setState(164);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(163);
                            expr(0);
                        }
                    }

                    setState(170);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__11) {
                        {
                            {
                                setState(166);
                                match(T__11);
                                setState(167);
                                expr(0);
                            }
                        }
                        setState(172);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(173);
                    match(T__8);
                }
                break;
                case T__12:
                    _localctx = new PrintlnStmtContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(174);
                    match(T__12);
                    setState(175);
                    match(T__7);
                    setState(177);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(176);
                            expr(0);
                        }
                    }

                    setState(183);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__11) {
                        {
                            {
                                setState(179);
                                match(T__11);
                                setState(180);
                                expr(0);
                            }
                        }
                        setState(185);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(186);
                    match(T__8);
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
            setState(191);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(189);
                    funCall();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(190);
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
                setState(193);
                funType();
                setState(194);
                match(ID);
                setState(195);
                match(T__7);
                setState(197);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << ID))) != 0)) {
                    {
                        setState(196);
                        params();
                    }
                }

                setState(199);
                match(T__8);
                setState(200);
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
            setState(205);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__13:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(202);
                    match(T__13);
                }
                break;
                case T__14:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(203);
                    match(T__14);
                }
                break;
                case T__2:
                case T__3:
                case T__4:
                case T__5:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(204);
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
                setState(207);
                param();
                setState(212);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__11) {
                    {
                        {
                            setState(208);
                            match(T__11);
                            setState(209);
                            param();
                        }
                    }
                    setState(214);
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
                setState(216);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
                    {
                        setState(215);
                        type();
                    }
                }

                setState(218);
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
                setState(220);
                match(ID);
                setState(221);
                match(T__7);
                setState(223);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                    {
                        setState(222);
                        args();
                    }
                }

                setState(225);
                match(T__8);
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
                setState(227);
                expr(0);
                setState(232);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__11) {
                    {
                        {
                            setState(228);
                            match(T__11);
                            setState(229);
                            expr(0);
                        }
                    }
                    setState(234);
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
                setState(235);
                match(ID);
                setState(237);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                    case 1: {
                        setState(236);
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
                setState(239);
                varType();
                setState(240);
                varNameExpr();
                setState(243);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__15) {
                    {
                        setState(241);
                        match(T__15);
                        setState(242);
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
            setState(247);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__16:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(245);
                    match(T__16);
                }
                break;
                case T__2:
                case T__3:
                case T__4:
                case T__5:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(246);
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
                setState(249);
                varNameExpr();
                setState(250);
                match(T__15);
                setState(251);
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
                setState(254);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(253);
                                subScript();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(256);
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
                setState(258);
                match(T__17);
                setState(259);
                expr(0);
                setState(260);
                match(T__18);
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
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(262);
                ifStmt();
                setState(266);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(263);
                                elseifStmt();
                            }
                        }
                    }
                    setState(268);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                }
                setState(270);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ELSE) {
                    {
                        setState(269);
                        elseStmt();
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

    public final IfStmtContext ifStmt() throws RecognitionException {
        IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_ifStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(272);
                match(IF);
                setState(273);
                expr(0);
                setState(275);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__19) {
                    {
                        setState(274);
                        match(T__19);
                    }
                }

                setState(277);
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

    public final ElseifStmtContext elseifStmt() throws RecognitionException {
        ElseifStmtContext _localctx = new ElseifStmtContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_elseifStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(279);
                match(ELSE);
                setState(280);
                match(IF);
                setState(281);
                expr(0);
                setState(283);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__19) {
                    {
                        setState(282);
                        match(T__19);
                    }
                }

                setState(285);
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

    public final ElseStmtContext elseStmt() throws RecognitionException {
        ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_elseStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(287);
                match(ELSE);
                setState(289);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__19) {
                    {
                        setState(288);
                        match(T__19);
                    }
                }

                setState(291);
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

    public final ForStmtContext forStmt() throws RecognitionException {
        ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_forStmt);
        int _la;
        try {
            setState(321);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(293);
                    match(FOR);
                    setState(294);
                    match(T__7);
                    setState(295);
                    varDeclStmt();
                    setState(296);
                    match(T__6);
                    setState(298);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(297);
                            ((ForStmtContext) _localctx).cond = expr(0);
                        }
                    }

                    setState(300);
                    match(T__6);
                    setState(302);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(301);
                            ((ForStmtContext) _localctx).step = expr(0);
                        }
                    }

                    setState(304);
                    match(T__8);
                    setState(305);
                    block();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(307);
                    match(FOR);
                    setState(308);
                    match(T__7);
                    setState(309);
                    varAssignStmt();
                    setState(310);
                    match(T__6);
                    setState(312);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(311);
                            ((ForStmtContext) _localctx).cond = expr(0);
                        }
                    }

                    setState(314);
                    match(T__6);
                    setState(316);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELFADD) | (1L << SELFSUB) | (1L << SUB) | (1L << LNOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
                        {
                            setState(315);
                            ((ForStmtContext) _localctx).step = expr(0);
                        }
                    }

                    setState(318);
                    match(T__8);
                    setState(319);
                    block();
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
                setState(323);
                match(WHILE);
                setState(324);
                expr(0);
                setState(326);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__19) {
                    {
                        setState(325);
                        match(T__19);
                    }
                }

                setState(328);
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

    public final NumberContext number() throws RecognitionException {
        NumberContext _localctx = new NumberContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_number);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(330);
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
                setState(332);
                match(T__17);
                setState(333);
                subList();
                setState(338);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__11) {
                    {
                        {
                            setState(334);
                            match(T__11);
                            setState(335);
                            subList();
                        }
                    }
                    setState(340);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(341);
                match(T__18);
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
                setState(345);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__7:
                    case SELFADD:
                    case SELFSUB:
                    case SUB:
                    case LNOT:
                    case BOOL:
                    case ID:
                    case INT:
                    case DECIMAL:
                    case STRING: {
                        setState(343);
                        expr(0);
                    }
                    break;
                    case T__17: {
                        setState(344);
                        list();
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

        public TerminalNode CONTINUE() {
            return getToken(CYXParser.CONTINUE, 0);
        }

        public TerminalNode BREAK() {
            return getToken(CYXParser.BREAK, 0);
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

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
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

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
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

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
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

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
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

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
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
}