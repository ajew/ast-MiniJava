// Generated from ajew_pvcs.g4 by ANTLR 4.4
package main;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ajew_pvcsParser}.
 */
public interface ajew_pvcsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ajew_pvcsParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull ajew_pvcsParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ajew_pvcsParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull ajew_pvcsParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ajew_pvcsParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull ajew_pvcsParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ajew_pvcsParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull ajew_pvcsParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ajew_pvcsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ajew_pvcsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ajew_pvcsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ajew_pvcsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ajew_pvcsParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull ajew_pvcsParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ajew_pvcsParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull ajew_pvcsParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ajew_pvcsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ajew_pvcsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ajew_pvcsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ajew_pvcsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ajew_pvcsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ajew_pvcsParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ajew_pvcsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ajew_pvcsParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ajew_pvcsParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull ajew_pvcsParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ajew_pvcsParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull ajew_pvcsParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ajew_pvcsParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull ajew_pvcsParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ajew_pvcsParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull ajew_pvcsParser.ClassDeclarationContext ctx);
}