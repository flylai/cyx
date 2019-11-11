// Generated from /home/lkm/DEV/Dev/Java/cyx/design/CYX.g4 by ANTLR 4.7.2
package AntlrGen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CYXParser}.
 */
public interface CYXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CYXParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CYXParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CYXParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CYXParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CYXParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CYXParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CYXParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CYXParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CYXParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(CYXParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(CYXParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(CYXParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(CYXParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(CYXParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(CYXParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logANDExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogANDExpr(CYXParser.LogANDExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logANDExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogANDExpr(CYXParser.LogANDExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExprExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExprExpr(CYXParser.SubExprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExprExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExprExpr(CYXParser.SubExprExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivModExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivModExpr(CYXParser.MulDivModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivModExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivModExpr(CYXParser.MulDivModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logORExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogORExpr(CYXParser.LogORExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logORExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogORExpr(CYXParser.LogORExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitXORExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitXORExpr(CYXParser.BitXORExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitXORExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitXORExpr(CYXParser.BitXORExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfAddSubExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelfAddSubExpr(CYXParser.SelfAddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfAddSubExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelfAddSubExpr(CYXParser.SelfAddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(CYXParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(CYXParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCmpExpr(CYXParser.CmpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCmpExpr(CYXParser.CmpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(CYXParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(CYXParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitORExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitORExpr(CYXParser.BitORExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitORExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitORExpr(CYXParser.BitORExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(CYXParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(CYXParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funCallExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunCallExpr(CYXParser.FunCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funCallExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunCallExpr(CYXParser.FunCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitANDExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitANDExpr(CYXParser.BitANDExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitANDExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitANDExpr(CYXParser.BitANDExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(CYXParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link CYXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(CYXParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#selfAddSub}.
	 * @param ctx the parse tree
	 */
	void enterSelfAddSub(CYXParser.SelfAddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#selfAddSub}.
	 * @param ctx the parse tree
	 */
	void exitSelfAddSub(CYXParser.SelfAddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(CYXParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(CYXParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#funCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterFunCallStmt(CYXParser.FunCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#funCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitFunCallStmt(CYXParser.FunCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link CYXParser#buildInFunStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(CYXParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link CYXParser#buildInFunStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(CYXParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printlnStmt}
	 * labeled alternative in {@link CYXParser#buildInFunStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnStmt(CYXParser.PrintlnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printlnStmt}
	 * labeled alternative in {@link CYXParser#buildInFunStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnStmt(CYXParser.PrintlnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#varFunExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarFunExpr(CYXParser.VarFunExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#varFunExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarFunExpr(CYXParser.VarFunExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#funDeclStmt}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclStmt(CYXParser.FunDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#funDeclStmt}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclStmt(CYXParser.FunDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#funType}.
	 * @param ctx the parse tree
	 */
	void enterFunType(CYXParser.FunTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#funType}.
	 * @param ctx the parse tree
	 */
	void exitFunType(CYXParser.FunTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CYXParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CYXParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CYXParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CYXParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#funCall}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(CYXParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#funCall}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(CYXParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CYXParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CYXParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#varNameExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarNameExpr(CYXParser.VarNameExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#varNameExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarNameExpr(CYXParser.VarNameExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#varDeclStmt}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclStmt(CYXParser.VarDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#varDeclStmt}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclStmt(CYXParser.VarDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(CYXParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(CYXParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#varAssignStmt}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignStmt(CYXParser.VarAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#varAssignStmt}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignStmt(CYXParser.VarAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#subScripts}.
	 * @param ctx the parse tree
	 */
	void enterSubScripts(CYXParser.SubScriptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#subScripts}.
	 * @param ctx the parse tree
	 */
	void exitSubScripts(CYXParser.SubScriptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#subScript}.
	 * @param ctx the parse tree
	 */
	void enterSubScript(CYXParser.SubScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#subScript}.
	 * @param ctx the parse tree
	 */
	void exitSubScript(CYXParser.SubScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#ifStmts}.
	 * @param ctx the parse tree
	 */
	void enterIfStmts(CYXParser.IfStmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#ifStmts}.
	 * @param ctx the parse tree
	 */
	void exitIfStmts(CYXParser.IfStmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CYXParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CYXParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#elseifStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseifStmt(CYXParser.ElseifStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#elseifStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseifStmt(CYXParser.ElseifStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(CYXParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(CYXParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(CYXParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(CYXParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(CYXParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(CYXParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CYXParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CYXParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CYXParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CYXParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYXParser#subList}.
	 * @param ctx the parse tree
	 */
	void enterSubList(CYXParser.SubListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYXParser#subList}.
	 * @param ctx the parse tree
	 */
	void exitSubList(CYXParser.SubListContext ctx);
}