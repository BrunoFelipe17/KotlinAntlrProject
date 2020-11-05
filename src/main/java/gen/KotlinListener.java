package gen;// Generated from /home/bruno/Área de Trabalho/Atividade Compiladores/Kotlin/src/main/Kotlin.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KotlinParser}.
 */
public interface KotlinListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KotlinParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(KotlinParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(KotlinParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(KotlinParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(KotlinParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KotlinParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KotlinParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link KotlinParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(KotlinParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link KotlinParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(KotlinParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varReassignment}
	 * labeled alternative in {@link KotlinParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterVarReassignment(KotlinParser.VarReassignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varReassignment}
	 * labeled alternative in {@link KotlinParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitVarReassignment(KotlinParser.VarReassignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reassignment}
	 * labeled alternative in {@link KotlinParser#re_assignment}.
	 * @param ctx the parse tree
	 */
	void enterReassignment(KotlinParser.ReassignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reassignment}
	 * labeled alternative in {@link KotlinParser#re_assignment}.
	 * @param ctx the parse tree
	 */
	void exitReassignment(KotlinParser.ReassignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrementOrDecrement}
	 * labeled alternative in {@link KotlinParser#re_assignment}.
	 * @param ctx the parse tree
	 */
	void enterIncrementOrDecrement(KotlinParser.IncrementOrDecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrementOrDecrement}
	 * labeled alternative in {@link KotlinParser#re_assignment}.
	 * @param ctx the parse tree
	 */
	void exitIncrementOrDecrement(KotlinParser.IncrementOrDecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleOp}
	 * labeled alternative in {@link KotlinParser#re_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSimpleOp(KotlinParser.SimpleOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleOp}
	 * labeled alternative in {@link KotlinParser#re_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSimpleOp(KotlinParser.SimpleOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printNormal}
	 * labeled alternative in {@link KotlinParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintNormal(KotlinParser.PrintNormalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printNormal}
	 * labeled alternative in {@link KotlinParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintNormal(KotlinParser.PrintNormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printLine}
	 * labeled alternative in {@link KotlinParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintLine(KotlinParser.PrintLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printLine}
	 * labeled alternative in {@link KotlinParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintLine(KotlinParser.PrintLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddOrSub}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSub(KotlinParser.AddOrSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddOrSub}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSub(KotlinParser.AddOrSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(KotlinParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(KotlinParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDouble(KotlinParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDouble(KotlinParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scan}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterScan(KotlinParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scan}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitScan(KotlinParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(KotlinParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(KotlinParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(KotlinParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(KotlinParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(KotlinParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(KotlinParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultOrDiv}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultOrDiv(KotlinParser.MultOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultOrDiv}
	 * labeled alternative in {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultOrDiv(KotlinParser.MultOrDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#printnormal}.
	 * @param ctx the parse tree
	 */
	void enterPrintnormal(KotlinParser.PrintnormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#printnormal}.
	 * @param ctx the parse tree
	 */
	void exitPrintnormal(KotlinParser.PrintnormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#printline}.
	 * @param ctx the parse tree
	 */
	void enterPrintline(KotlinParser.PrintlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#printline}.
	 * @param ctx the parse tree
	 */
	void exitPrintline(KotlinParser.PrintlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(KotlinParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(KotlinParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(KotlinParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(KotlinParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(KotlinParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(KotlinParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_statement(KotlinParser.Repeat_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_statement(KotlinParser.Repeat_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterOrEqual}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEqual(KotlinParser.GreaterOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterOrEqual}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEqual(KotlinParser.GreaterOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greater}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 */
	void enterGreater(KotlinParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greater}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 */
	void exitGreater(KotlinParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessOrEqual}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEqual(KotlinParser.LessOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessOrEqual}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEqual(KotlinParser.LessOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code less}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 */
	void enterLess(KotlinParser.LessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code less}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 */
	void exitLess(KotlinParser.LessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 */
	void enterEqual(KotlinParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 */
	void exitEqual(KotlinParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modulo}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 */
	void enterModulo(KotlinParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modulo}
	 * labeled alternative in {@link KotlinParser#comṕarison}.
	 * @param ctx the parse tree
	 */
	void exitModulo(KotlinParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(KotlinParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(KotlinParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(KotlinParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(KotlinParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(KotlinParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(KotlinParser.FuncContext ctx);
}