package gen;// Generated from /home/bruno/Área de Trabalho/Atividade Compiladores/Kotlin/src/main/Kotlin.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KotlinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, ID=17, 
		INT=18, DOUBLE=19, STRING=20, MULT=21, DIV=22, ADD=23, SUB=24, INCREMENT=25, 
		DECREMENT=26, MODULO=27, GREATER_EQUAL=28, GREATER=29, LESS_EQUAL=30, 
		LESS=31, EQUAL=32, OPEN_P=33, CLOSE_P=34, OPEN_B=35, CLOSE_B=36, WS=37;
	public static final int
		RULE_program = 0, RULE_func_main = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_assignment_statement = 4, RULE_re_assignment = 5, RULE_print_statement = 6, 
		RULE_expr = 7, RULE_printnormal = 8, RULE_printline = 9, RULE_if_statement = 10, 
		RULE_else_block = 11, RULE_ab = 12, RULE_while_statement = 13, RULE_repeat_statement = 14, 
		RULE_comṕarison = 15, RULE_declaration = 16, RULE_type = 17, RULE_func = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "func_main", "block", "statement", "assignment_statement", 
			"re_assignment", "print_statement", "expr", "printnormal", "printline", 
			"if_statement", "else_block", "ab", "while_statement", "repeat_statement", 
			"comṕarison", "declaration", "type", "func"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "':'", "'='", "'scan()'", "'print'", "','", "'println'", 
			"'if'", "'else'", "'while'", "'repeat'", "'val'", "'Int'", "'Double'", 
			"'String'", "'fun'", null, null, null, null, "'*'", "'/'", "'+'", "'-'", 
			"'++'", "'--'", "'%'", "'>='", "'>'", "'<='", "'<'", "'=='", "'('", "')'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID", "INT", "DOUBLE", "STRING", "MULT", 
			"DIV", "ADD", "SUB", "INCREMENT", "DECREMENT", "MODULO", "GREATER_EQUAL", 
			"GREATER", "LESS_EQUAL", "LESS", "EQUAL", "OPEN_P", "CLOSE_P", "OPEN_B", 
			"CLOSE_B", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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
	public String getGrammarFileName() { return "Kotlin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KotlinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Func_mainContext func_main() {
			return getRuleContext(Func_mainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KotlinParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			func_main();
			setState(39);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_mainContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode OPEN_P() { return getToken(KotlinParser.OPEN_P, 0); }
		public TerminalNode CLOSE_P() { return getToken(KotlinParser.CLOSE_P, 0); }
		public TerminalNode OPEN_B() { return getToken(KotlinParser.OPEN_B, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(KotlinParser.CLOSE_B, 0); }
		public Func_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterFunc_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitFunc_main(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitFunc_main(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_mainContext func_main() throws RecognitionException {
		Func_mainContext _localctx = new Func_mainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			func();
			setState(42);
			match(T__0);
			setState(43);
			match(OPEN_P);
			setState(44);
			match(CLOSE_P);
			setState(45);
			match(OPEN_B);
			setState(46);
			block();
			setState(47);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << OPEN_P))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Repeat_statementContext repeat_statement() {
			return getRuleContext(Repeat_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__11:
			case ID:
			case INT:
			case DOUBLE:
			case STRING:
			case OPEN_P:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				assignment_statement();
				}
				break;
			case T__4:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				print_statement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				if_statement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				while_statement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				repeat_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_statementContext extends ParserRuleContext {
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	 
		public Assignment_statementContext() { }
		public void copyFrom(Assignment_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarReassignmentContext extends Assignment_statementContext {
		public Re_assignmentContext re_assignment() {
			return getRuleContext(Re_assignmentContext.class,0);
		}
		public VarReassignmentContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterVarReassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitVarReassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitVarReassignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclarationContext extends Assignment_statementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclarationContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment_statement);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				declaration();
				setState(62);
				match(ID);
				setState(63);
				match(T__1);
				setState(64);
				type();
				setState(65);
				match(T__2);
				setState(66);
				expr(0);
				}
				break;
			case T__3:
			case ID:
			case INT:
			case DOUBLE:
			case STRING:
			case OPEN_P:
				_localctx = new VarReassignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				re_assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Re_assignmentContext extends ParserRuleContext {
		public Re_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_re_assignment; }
	 
		public Re_assignmentContext() { }
		public void copyFrom(Re_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReassignmentContext extends Re_assignmentContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReassignmentContext(Re_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterReassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitReassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitReassignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleOpContext extends Re_assignmentContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(KotlinParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(KotlinParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(KotlinParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KotlinParser.SUB, 0); }
		public SimpleOpContext(Re_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterSimpleOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitSimpleOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitSimpleOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementOrDecrementContext extends Re_assignmentContext {
		public Token op;
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode INCREMENT() { return getToken(KotlinParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(KotlinParser.DECREMENT, 0); }
		public IncrementOrDecrementContext(Re_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterIncrementOrDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitIncrementOrDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitIncrementOrDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Re_assignmentContext re_assignment() throws RecognitionException {
		Re_assignmentContext _localctx = new Re_assignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_re_assignment);
		int _la;
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ReassignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(ID);
				setState(72);
				match(T__2);
				setState(73);
				expr(0);
				}
				break;
			case 2:
				_localctx = new IncrementOrDecrementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(ID);
				setState(75);
				((IncrementOrDecrementContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
					((IncrementOrDecrementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new SimpleOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				expr(0);
				setState(77);
				((SimpleOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << ADD) | (1L << SUB))) != 0)) ) {
					((SimpleOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(78);
				match(T__2);
				setState(79);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_statementContext extends ParserRuleContext {
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
	 
		public Print_statementContext() { }
		public void copyFrom(Print_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintLineContext extends Print_statementContext {
		public PrintlineContext printline() {
			return getRuleContext(PrintlineContext.class,0);
		}
		public PrintLineContext(Print_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterPrintLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitPrintLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitPrintLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintNormalContext extends Print_statementContext {
		public PrintnormalContext printnormal() {
			return getRuleContext(PrintnormalContext.class,0);
		}
		public PrintNormalContext(Print_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterPrintNormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitPrintNormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitPrintNormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_statement);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new PrintNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				printnormal();
				}
				break;
			case T__6:
				_localctx = new PrintLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				printline();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddOrSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(KotlinParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KotlinParser.SUB, 0); }
		public AddOrSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterAddOrSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitAddOrSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitAddOrSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(KotlinParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(KotlinParser.DOUBLE, 0); }
		public DoubleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScanContext extends ExprContext {
		public ScanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitScan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public TerminalNode OPEN_P() { return getToken(KotlinParser.OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_P() { return getToken(KotlinParser.CLOSE_P, 0); }
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(KotlinParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultOrDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(KotlinParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(KotlinParser.DIV, 0); }
		public MultOrDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterMultOrDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitMultOrDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitMultOrDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(88);
				match(DOUBLE);
				}
				break;
			case T__3:
				{
				_localctx = new ScanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(T__3);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(INT);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(STRING);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(ID);
				}
				break;
			case OPEN_P:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(OPEN_P);
				setState(94);
				expr(0);
				setState(95);
				match(CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MultOrDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(100);
						((MultOrDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MultOrDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new AddOrSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(103);
						((AddOrSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddOrSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintnormalContext extends ParserRuleContext {
		public TerminalNode OPEN_P() { return getToken(KotlinParser.OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_P() { return getToken(KotlinParser.CLOSE_P, 0); }
		public PrintnormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printnormal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterPrintnormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitPrintnormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitPrintnormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintnormalContext printnormal() throws RecognitionException {
		PrintnormalContext _localctx = new PrintnormalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printnormal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__4);
			setState(111);
			match(OPEN_P);
			setState(112);
			expr(0);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(113);
				match(T__5);
				setState(114);
				expr(0);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintlineContext extends ParserRuleContext {
		public TerminalNode OPEN_P() { return getToken(KotlinParser.OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_P() { return getToken(KotlinParser.CLOSE_P, 0); }
		public PrintlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterPrintline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitPrintline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitPrintline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlineContext printline() throws RecognitionException {
		PrintlineContext _localctx = new PrintlineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__6);
			setState(123);
			match(OPEN_P);
			setState(124);
			expr(0);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(125);
				match(T__5);
				setState(126);
				expr(0);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode OPEN_P() { return getToken(KotlinParser.OPEN_P, 0); }
		public ComṕarisonContext comṕarison() {
			return getRuleContext(ComṕarisonContext.class,0);
		}
		public TerminalNode CLOSE_P() { return getToken(KotlinParser.CLOSE_P, 0); }
		public TerminalNode OPEN_B() { return getToken(KotlinParser.OPEN_B, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AbContext ab() {
			return getRuleContext(AbContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(KotlinParser.CLOSE_B, 0); }
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__7);
			setState(135);
			match(OPEN_P);
			setState(136);
			comṕarison();
			setState(137);
			match(CLOSE_P);
			setState(138);
			match(OPEN_B);
			setState(139);
			block();
			setState(140);
			ab();
			setState(141);
			match(CLOSE_B);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(142);
				else_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_B() { return getToken(KotlinParser.OPEN_B, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(KotlinParser.CLOSE_B, 0); }
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__8);
			setState(146);
			match(OPEN_B);
			setState(147);
			block();
			setState(148);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbContext extends ParserRuleContext {
		public AbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterAb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitAb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitAb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbContext ab() throws RecognitionException {
		AbContext _localctx = new AbContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode OPEN_P() { return getToken(KotlinParser.OPEN_P, 0); }
		public ComṕarisonContext comṕarison() {
			return getRuleContext(ComṕarisonContext.class,0);
		}
		public TerminalNode CLOSE_P() { return getToken(KotlinParser.CLOSE_P, 0); }
		public TerminalNode OPEN_B() { return getToken(KotlinParser.OPEN_B, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(KotlinParser.CLOSE_B, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__9);
			setState(153);
			match(OPEN_P);
			setState(154);
			comṕarison();
			setState(155);
			match(CLOSE_P);
			setState(156);
			match(OPEN_B);
			setState(157);
			block();
			setState(158);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Repeat_statementContext extends ParserRuleContext {
		public TerminalNode OPEN_P() { return getToken(KotlinParser.OPEN_P, 0); }
		public TerminalNode CLOSE_P() { return getToken(KotlinParser.CLOSE_P, 0); }
		public TerminalNode OPEN_B() { return getToken(KotlinParser.OPEN_B, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(KotlinParser.CLOSE_B, 0); }
		public TerminalNode INT() { return getToken(KotlinParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(KotlinParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(KotlinParser.STRING, 0); }
		public Repeat_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterRepeat_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitRepeat_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitRepeat_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_statementContext repeat_statement() throws RecognitionException {
		Repeat_statementContext _localctx = new Repeat_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_repeat_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__10);
			setState(161);
			match(OPEN_P);
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
			match(CLOSE_P);
			setState(164);
			match(OPEN_B);
			setState(165);
			block();
			setState(166);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComṕarisonContext extends ParserRuleContext {
		public ComṕarisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comṕarison; }
	 
		public ComṕarisonContext() { }
		public void copyFrom(ComṕarisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualContext extends ComṕarisonContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(KotlinParser.EQUAL, 0); }
		public EqualContext(ComṕarisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterOrEqualContext extends ComṕarisonContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATER_EQUAL() { return getToken(KotlinParser.GREATER_EQUAL, 0); }
		public GreaterOrEqualContext(ComṕarisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterGreaterOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitGreaterOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitGreaterOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessOrEqualContext extends ComṕarisonContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS_EQUAL() { return getToken(KotlinParser.LESS_EQUAL, 0); }
		public LessOrEqualContext(ComṕarisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterLessOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitLessOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitLessOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessContext extends ComṕarisonContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(KotlinParser.LESS, 0); }
		public LessContext(ComṕarisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterContext extends ComṕarisonContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(KotlinParser.GREATER, 0); }
		public GreaterContext(ComṕarisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloContext extends ComṕarisonContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(KotlinParser.EQUAL, 0); }
		public TerminalNode MODULO() { return getToken(KotlinParser.MODULO, 0); }
		public ModuloContext(ComṕarisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitModulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComṕarisonContext comṕarison() throws RecognitionException {
		ComṕarisonContext _localctx = new ComṕarisonContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comṕarison);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new GreaterOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				expr(0);
				setState(169);
				match(GREATER_EQUAL);
				setState(170);
				expr(0);
				}
				break;
			case 2:
				_localctx = new GreaterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				expr(0);
				setState(173);
				match(GREATER);
				setState(174);
				expr(0);
				}
				break;
			case 3:
				_localctx = new LessOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				expr(0);
				setState(177);
				match(LESS_EQUAL);
				setState(178);
				expr(0);
				}
				break;
			case 4:
				_localctx = new LessContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				expr(0);
				setState(181);
				match(LESS);
				setState(182);
				expr(0);
				}
				break;
			case 5:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				expr(0);
				setState(185);
				match(EQUAL);
				setState(186);
				expr(0);
				}
				break;
			case 6:
				_localctx = new ModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				expr(0);
				setState(189);
				((ModuloContext)_localctx).op = match(MODULO);
				setState(190);
				expr(0);
				setState(191);
				match(EQUAL);
				setState(192);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinListener ) ((KotlinListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinVisitor) return ((KotlinVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6"+
		"\4\65\n\4\r\4\16\4\66\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6H\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n\7"+
		"\3\b\3\b\5\bX\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\td\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\n\3\n\3\n\3\n\3\n\7\nv"+
		"\n\n\f\n\16\ny\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u0082\n\13\f"+
		"\13\16\13\u0085\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0092\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c5\n\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\2\3\20\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&\2\b\3\2\33\34\3\2\27\32\3\2\27\30\3\2\31\32\3\2\24\26\3\2\17"+
		"\21\2\u00d1\2(\3\2\2\2\4+\3\2\2\2\6\64\3\2\2\2\b=\3\2\2\2\nG\3\2\2\2\f"+
		"S\3\2\2\2\16W\3\2\2\2\20c\3\2\2\2\22p\3\2\2\2\24|\3\2\2\2\26\u0088\3\2"+
		"\2\2\30\u0093\3\2\2\2\32\u0098\3\2\2\2\34\u009a\3\2\2\2\36\u00a2\3\2\2"+
		"\2 \u00c4\3\2\2\2\"\u00c6\3\2\2\2$\u00c8\3\2\2\2&\u00ca\3\2\2\2()\5\4"+
		"\3\2)*\7\2\2\3*\3\3\2\2\2+,\5&\24\2,-\7\3\2\2-.\7#\2\2./\7$\2\2/\60\7"+
		"%\2\2\60\61\5\6\4\2\61\62\7&\2\2\62\5\3\2\2\2\63\65\5\b\5\2\64\63\3\2"+
		"\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\7\3\2\2\28>\5\n\6\2"+
		"9>\5\16\b\2:>\5\26\f\2;>\5\34\17\2<>\5\36\20\2=8\3\2\2\2=9\3\2\2\2=:\3"+
		"\2\2\2=;\3\2\2\2=<\3\2\2\2>\t\3\2\2\2?@\5\"\22\2@A\7\23\2\2AB\7\4\2\2"+
		"BC\5$\23\2CD\7\5\2\2DE\5\20\t\2EH\3\2\2\2FH\5\f\7\2G?\3\2\2\2GF\3\2\2"+
		"\2H\13\3\2\2\2IJ\7\23\2\2JK\7\5\2\2KT\5\20\t\2LM\7\23\2\2MT\t\2\2\2NO"+
		"\5\20\t\2OP\t\3\2\2PQ\7\5\2\2QR\5\20\t\2RT\3\2\2\2SI\3\2\2\2SL\3\2\2\2"+
		"SN\3\2\2\2T\r\3\2\2\2UX\5\22\n\2VX\5\24\13\2WU\3\2\2\2WV\3\2\2\2X\17\3"+
		"\2\2\2YZ\b\t\1\2Zd\7\25\2\2[d\7\6\2\2\\d\7\24\2\2]d\7\26\2\2^d\7\23\2"+
		"\2_`\7#\2\2`a\5\20\t\2ab\7$\2\2bd\3\2\2\2cY\3\2\2\2c[\3\2\2\2c\\\3\2\2"+
		"\2c]\3\2\2\2c^\3\2\2\2c_\3\2\2\2dm\3\2\2\2ef\f\n\2\2fg\t\4\2\2gl\5\20"+
		"\t\13hi\f\t\2\2ij\t\5\2\2jl\5\20\t\nke\3\2\2\2kh\3\2\2\2lo\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2n\21\3\2\2\2om\3\2\2\2pq\7\7\2\2qr\7#\2\2rw\5\20\t\2s"+
		"t\7\b\2\2tv\5\20\t\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2"+
		"yw\3\2\2\2z{\7$\2\2{\23\3\2\2\2|}\7\t\2\2}~\7#\2\2~\u0083\5\20\t\2\177"+
		"\u0080\7\b\2\2\u0080\u0082\5\20\t\2\u0081\177\3\2\2\2\u0082\u0085\3\2"+
		"\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\7$\2\2\u0087\25\3\2\2\2\u0088\u0089\7\n\2\2"+
		"\u0089\u008a\7#\2\2\u008a\u008b\5 \21\2\u008b\u008c\7$\2\2\u008c\u008d"+
		"\7%\2\2\u008d\u008e\5\6\4\2\u008e\u008f\5\32\16\2\u008f\u0091\7&\2\2\u0090"+
		"\u0092\5\30\r\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\27\3\2\2"+
		"\2\u0093\u0094\7\13\2\2\u0094\u0095\7%\2\2\u0095\u0096\5\6\4\2\u0096\u0097"+
		"\7&\2\2\u0097\31\3\2\2\2\u0098\u0099\3\2\2\2\u0099\33\3\2\2\2\u009a\u009b"+
		"\7\f\2\2\u009b\u009c\7#\2\2\u009c\u009d\5 \21\2\u009d\u009e\7$\2\2\u009e"+
		"\u009f\7%\2\2\u009f\u00a0\5\6\4\2\u00a0\u00a1\7&\2\2\u00a1\35\3\2\2\2"+
		"\u00a2\u00a3\7\r\2\2\u00a3\u00a4\7#\2\2\u00a4\u00a5\t\6\2\2\u00a5\u00a6"+
		"\7$\2\2\u00a6\u00a7\7%\2\2\u00a7\u00a8\5\6\4\2\u00a8\u00a9\7&\2\2\u00a9"+
		"\37\3\2\2\2\u00aa\u00ab\5\20\t\2\u00ab\u00ac\7\36\2\2\u00ac\u00ad\5\20"+
		"\t\2\u00ad\u00c5\3\2\2\2\u00ae\u00af\5\20\t\2\u00af\u00b0\7\37\2\2\u00b0"+
		"\u00b1\5\20\t\2\u00b1\u00c5\3\2\2\2\u00b2\u00b3\5\20\t\2\u00b3\u00b4\7"+
		" \2\2\u00b4\u00b5\5\20\t\2\u00b5\u00c5\3\2\2\2\u00b6\u00b7\5\20\t\2\u00b7"+
		"\u00b8\7!\2\2\u00b8\u00b9\5\20\t\2\u00b9\u00c5\3\2\2\2\u00ba\u00bb\5\20"+
		"\t\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\5\20\t\2\u00bd\u00c5\3\2\2\2\u00be"+
		"\u00bf\5\20\t\2\u00bf\u00c0\7\35\2\2\u00c0\u00c1\5\20\t\2\u00c1\u00c2"+
		"\7\"\2\2\u00c2\u00c3\5\20\t\2\u00c3\u00c5\3\2\2\2\u00c4\u00aa\3\2\2\2"+
		"\u00c4\u00ae\3\2\2\2\u00c4\u00b2\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c4\u00ba"+
		"\3\2\2\2\u00c4\u00be\3\2\2\2\u00c5!\3\2\2\2\u00c6\u00c7\7\16\2\2\u00c7"+
		"#\3\2\2\2\u00c8\u00c9\t\7\2\2\u00c9%\3\2\2\2\u00ca\u00cb\7\22\2\2\u00cb"+
		"\'\3\2\2\2\16\66=GSWckmw\u0083\u0091\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}