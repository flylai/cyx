// Generated from /home/lkm/DEV/Dev/Java/cyx/design/CYX.g4 by ANTLR 4.7.2
package cyx.Parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CYXParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface CYXVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link CYXParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(CYXParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlock(CYXParser.BlockContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitType(CYXParser.TypeContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStmt(CYXParser.StmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code stringExpr}
     * labeled alternative in {@link CYXParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStringExpr(CYXParser.StringExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code unaryExpr}
     * labeled alternative in {@link CYXParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnaryExpr(CYXParser.UnaryExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code funCallExpr}
     * labeled alternative in {@link CYXParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunCallExpr(CYXParser.FunCallExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code numberExpr}
     * labeled alternative in {@link CYXParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNumberExpr(CYXParser.NumberExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code booleanExpr}
     * labeled alternative in {@link CYXParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBooleanExpr(CYXParser.BooleanExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code subExprExpr}
     * labeled alternative in {@link CYXParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSubExprExpr(CYXParser.SubExprExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code binaryExpr}
     * labeled alternative in {@link CYXParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBinaryExpr(CYXParser.BinaryExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code selfAddSubExpr}
     * labeled alternative in {@link CYXParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelfAddSubExpr(CYXParser.SelfAddSubExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code identifierExpr}
     * labeled alternative in {@link CYXParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifierExpr(CYXParser.IdentifierExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code postSelfCalc}
     * labeled alternative in {@link CYXParser#selfAddSub}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPostSelfCalc(CYXParser.PostSelfCalcContext ctx);

    /**
     * Visit a parse tree produced by the {@code preSelfCalc}
     * labeled alternative in {@link CYXParser#selfAddSub}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPreSelfCalc(CYXParser.PreSelfCalcContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#returnStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturnStmt(CYXParser.ReturnStmtContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#funCallStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunCallStmt(CYXParser.FunCallStmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code printStmt}
     * labeled alternative in {@link CYXParser#buildInFunStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrintStmt(CYXParser.PrintStmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code printlnStmt}
     * labeled alternative in {@link CYXParser#buildInFunStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrintlnStmt(CYXParser.PrintlnStmtContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#varFunExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVarFunExpr(CYXParser.VarFunExprContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#funDeclStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunDeclStmt(CYXParser.FunDeclStmtContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#funType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunType(CYXParser.FunTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#params}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParams(CYXParser.ParamsContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#param}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParam(CYXParser.ParamContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#funCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunCall(CYXParser.FunCallContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#args}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArgs(CYXParser.ArgsContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#varNameExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVarNameExpr(CYXParser.VarNameExprContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#varDeclStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVarDeclStmt(CYXParser.VarDeclStmtContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#varType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVarType(CYXParser.VarTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#varAssignStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVarAssignStmt(CYXParser.VarAssignStmtContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#subScripts}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSubScripts(CYXParser.SubScriptsContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#subScript}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSubScript(CYXParser.SubScriptContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#ifStmts}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfStmts(CYXParser.IfStmtsContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#ifStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfStmt(CYXParser.IfStmtContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#elseifStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElseifStmt(CYXParser.ElseifStmtContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#elseStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElseStmt(CYXParser.ElseStmtContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#forStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitForStmt(CYXParser.ForStmtContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#whileStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhileStmt(CYXParser.WhileStmtContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNumber(CYXParser.NumberContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#list}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitList(CYXParser.ListContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#subList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSubList(CYXParser.SubListContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#breakStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBreakStmt(CYXParser.BreakStmtContext ctx);

    /**
     * Visit a parse tree produced by {@link CYXParser#continueStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitContinueStmt(CYXParser.ContinueStmtContext ctx);
}