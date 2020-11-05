package gen;// Generated from /home/bruno/Área de Trabalho/Atividade Compiladores/Kotlin/src/main/Kotlin.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KotlinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KotlinVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KotlinParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(KotlinParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(KotlinParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(KotlinParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link KotlinParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(KotlinParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varReassignment}
	 * labeled alternative in {@link KotlinParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReassignment(KotlinParser.VarReassignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reassignment}
	 * labeled alternative in {@link KotlinParser#re_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReassignment(KotlinParser.ReassignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementOrDecrement}
	 * labeled alternative in {@link KotlinParser#re_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementOrDecrement(KotlinParser.IncrementOrDecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleOp}
	 * labeled alternative in {@link KotlinParser#re_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleOp(KotlinParser.SimpleOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printNormal}
	 * labeled alternative in {@link KotlinParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintNormal(KotlinParser.PrintNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printLine}
	 * labeled alternative in {@link KotlinParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintLine(KotlinParser.PrintLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddOrSub}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSub(KotlinParser.AddOrSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(KotlinParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(KotlinParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scan}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(KotlinParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(KotlinParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(KotlinParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(KotlinParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultOrDiv}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOrDiv(KotlinParser.MultOrDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#printnormal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintnormal(KotlinParser.PrintnormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#printline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintline(KotlinParser.PrintlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(KotlinParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(KotlinParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(KotlinParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#repeat_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_statement(KotlinParser.Repeat_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterOrEqual}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOrEqual(KotlinParser.GreaterOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greater}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(KotlinParser.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessOrEqual}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrEqual(KotlinParser.LessOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code less}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(KotlinParser.LessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(KotlinParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modulo}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(KotlinParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(KotlinParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(KotlinParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(KotlinParser.FuncContext ctx);
}