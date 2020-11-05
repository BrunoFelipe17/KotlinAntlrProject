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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ID=18, INT=19, DOUBLE=20, STRING=21, MULT=22, DIV=23, ADD=24, SUB=25, 
		INCREMENT=26, DECREMENT=27, MODULO=28, GREATER_EQUAL=29, GREATER=30, LESS_EQUAL=31, 
		LESS=32, EQUAL=33, OPEN_P=34, CLOSE_P=35, OPEN_B=36, CLOSE_B=37, WS=38;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment_statement = 3, 
		RULE_re_assignment = 4, RULE_print_statement = 5, RULE_expr = 6, RULE_printnormal = 7, 
		RULE_printline = 8, RULE_if_statement = 9, RULE_else_block = 10, RULE_while_statement = 11, 
		RULE_repeat_statement = 12, RULE_comṕarison = 13, RULE_declaration = 14, 
		RULE_type = 15, RULE_func = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "assignment_statement", "re_assignment", 
			"print_statement", "expr", "printnormal", "printline", "if_statement", 
			"else_block", "while_statement", "repeat_statement", "comṕarison", "declaration", 
			"type", "func"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "':'", "'='", "'scan()'", "'print'", "','", "'println'", 
			"'if'", "'else'", "'while'", "'repeat'", "'var'", "'val'", "'Int'", "'Double'", 
			"'String'", "'fun'", null, null, null, null, "'*'", "'/'", "'+'", "'-'", 
			"'++'", "'--'", "'%'", "'>='", "'>'", "'<='", "'<'", "'=='", "'('", "')'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "INT", "DOUBLE", "STRING", 
			"MULT", "DIV", "ADD", "SUB", "INCREMENT", "DECREMENT", "MODULO", "GREATER_EQUAL", 
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
			setState(34);
			func();
			setState(35);
			match(T__0);
			setState(36);
			match(OPEN_P);
			setState(37);
			match(CLOSE_P);
			setState(38);
			match(OPEN_B);
			setState(39);
			block();
			setState(40);
			match(CLOSE_B);
			setState(41);
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
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				statement();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << ID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << OPEN_P))) != 0) );
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__11:
			case T__12:
			case ID:
			case INT:
			case DOUBLE:
			case STRING:
			case OPEN_P:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				assignment_statement();
				}
				break;
			case T__4:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				print_statement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				if_statement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				while_statement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
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
		enterRule(_localctx, 6, RULE_assignment_statement);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				declaration();
				setState(56);
				match(ID);
				setState(57);
				match(T__1);
				setState(58);
				type();
				setState(59);
				match(T__2);
				setState(60);
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
				setState(62);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_re_assignment);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ReassignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(ID);
				setState(66);
				match(T__2);
				setState(67);
				expr(0);
				}
				break;
			case 2:
				_localctx = new IncrementOrDecrementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				expr(0);
				setState(69);
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
				setState(71);
				expr(0);
				setState(72);
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
				setState(73);
				match(T__2);
				setState(74);
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
		enterRule(_localctx, 10, RULE_print_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new PrintNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				printnormal();
				}
				break;
			case T__6:
				_localctx = new PrintLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				match(DOUBLE);
				}
				break;
			case T__3:
				{
				_localctx = new ScanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(T__3);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(INT);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(STRING);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(ID);
				}
				break;
			case OPEN_P:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(OPEN_P);
				setState(89);
				expr(0);
				setState(90);
				match(CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MultOrDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(95);
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
						setState(96);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new AddOrSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(98);
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
						setState(99);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(104);
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
		enterRule(_localctx, 14, RULE_printnormal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__4);
			setState(106);
			match(OPEN_P);
			setState(107);
			expr(0);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(108);
				match(T__5);
				setState(109);
				expr(0);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
		enterRule(_localctx, 16, RULE_printline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__6);
			setState(118);
			match(OPEN_P);
			setState(119);
			expr(0);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(120);
				match(T__5);
				setState(121);
				expr(0);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
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
		public List<TerminalNode> OPEN_B() { return getTokens(KotlinParser.OPEN_B); }
		public TerminalNode OPEN_B(int i) {
			return getToken(KotlinParser.OPEN_B, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> CLOSE_B() { return getTokens(KotlinParser.CLOSE_B); }
		public TerminalNode CLOSE_B(int i) {
			return getToken(KotlinParser.CLOSE_B, i);
		}
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
		enterRule(_localctx, 18, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__7);
			setState(130);
			match(OPEN_P);
			setState(131);
			comṕarison();
			setState(132);
			match(CLOSE_P);
			setState(133);
			match(OPEN_B);
			setState(134);
			block();
			setState(135);
			match(CLOSE_B);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(136);
				match(T__8);
				setState(137);
				match(OPEN_B);
				setState(138);
				else_block();
				setState(139);
				match(CLOSE_B);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			block();
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
		enterRule(_localctx, 22, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__9);
			setState(146);
			match(OPEN_P);
			setState(147);
			comṕarison();
			setState(148);
			match(CLOSE_P);
			setState(149);
			match(OPEN_B);
			setState(150);
			block();
			setState(151);
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
		enterRule(_localctx, 24, RULE_repeat_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__10);
			setState(154);
			match(OPEN_P);
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(156);
			match(CLOSE_P);
			setState(157);
			match(OPEN_B);
			setState(158);
			block();
			setState(159);
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
		enterRule(_localctx, 26, RULE_comṕarison);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new GreaterOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				expr(0);
				setState(162);
				match(GREATER_EQUAL);
				setState(163);
				expr(0);
				}
				break;
			case 2:
				_localctx = new GreaterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				expr(0);
				setState(166);
				match(GREATER);
				setState(167);
				expr(0);
				}
				break;
			case 3:
				_localctx = new LessOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				expr(0);
				setState(170);
				match(LESS_EQUAL);
				setState(171);
				expr(0);
				}
				break;
			case 4:
				_localctx = new LessContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				expr(0);
				setState(174);
				match(LESS);
				setState(175);
				expr(0);
				}
				break;
			case 5:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				expr(0);
				setState(178);
				match(EQUAL);
				setState(179);
				expr(0);
				}
				break;
			case 6:
				_localctx = new ModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				expr(0);
				setState(182);
				((ModuloContext)_localctx).op = match(MODULO);
				setState(183);
				expr(0);
				setState(184);
				match(EQUAL);
				setState(185);
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
		enterRule(_localctx, 28, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
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
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
		enterRule(_localctx, 32, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__16);
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
		case 6:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3/\n\3\r\3\16\3\60\3\4\3\4"+
		"\3\4\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5B\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\5\7S\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b_\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"g\n\b\f\b\16\bj\13\b\3\t\3\t\3\t\3\t\3\t\7\tq\n\t\f\t\16\tt\13\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0090\n\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00be\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\2\3\16\23\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"\2\t\3\2\34\35\3\2\30\33\3\2\30\31\3\2\32\33"+
		"\3\2\25\27\3\2\16\17\3\2\20\22\2\u00cc\2$\3\2\2\2\4.\3\2\2\2\6\67\3\2"+
		"\2\2\bA\3\2\2\2\nN\3\2\2\2\fR\3\2\2\2\16^\3\2\2\2\20k\3\2\2\2\22w\3\2"+
		"\2\2\24\u0083\3\2\2\2\26\u0091\3\2\2\2\30\u0093\3\2\2\2\32\u009b\3\2\2"+
		"\2\34\u00bd\3\2\2\2\36\u00bf\3\2\2\2 \u00c1\3\2\2\2\"\u00c3\3\2\2\2$%"+
		"\5\"\22\2%&\7\3\2\2&\'\7$\2\2\'(\7%\2\2()\7&\2\2)*\5\4\3\2*+\7\'\2\2+"+
		",\7\2\2\3,\3\3\2\2\2-/\5\6\4\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61"+
		"\3\2\2\2\61\5\3\2\2\2\628\5\b\5\2\638\5\f\7\2\648\5\24\13\2\658\5\30\r"+
		"\2\668\5\32\16\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2"+
		"\2\67\66\3\2\2\28\7\3\2\2\29:\5\36\20\2:;\7\24\2\2;<\7\4\2\2<=\5 \21\2"+
		"=>\7\5\2\2>?\5\16\b\2?B\3\2\2\2@B\5\n\6\2A9\3\2\2\2A@\3\2\2\2B\t\3\2\2"+
		"\2CD\7\24\2\2DE\7\5\2\2EO\5\16\b\2FG\5\16\b\2GH\t\2\2\2HO\3\2\2\2IJ\5"+
		"\16\b\2JK\t\3\2\2KL\7\5\2\2LM\5\16\b\2MO\3\2\2\2NC\3\2\2\2NF\3\2\2\2N"+
		"I\3\2\2\2O\13\3\2\2\2PS\5\20\t\2QS\5\22\n\2RP\3\2\2\2RQ\3\2\2\2S\r\3\2"+
		"\2\2TU\b\b\1\2U_\7\26\2\2V_\7\6\2\2W_\7\25\2\2X_\7\27\2\2Y_\7\24\2\2Z"+
		"[\7$\2\2[\\\5\16\b\2\\]\7%\2\2]_\3\2\2\2^T\3\2\2\2^V\3\2\2\2^W\3\2\2\2"+
		"^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2_h\3\2\2\2`a\f\n\2\2ab\t\4\2\2bg\5\16\b"+
		"\13cd\f\t\2\2de\t\5\2\2eg\5\16\b\nf`\3\2\2\2fc\3\2\2\2gj\3\2\2\2hf\3\2"+
		"\2\2hi\3\2\2\2i\17\3\2\2\2jh\3\2\2\2kl\7\7\2\2lm\7$\2\2mr\5\16\b\2no\7"+
		"\b\2\2oq\5\16\b\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr"+
		"\3\2\2\2uv\7%\2\2v\21\3\2\2\2wx\7\t\2\2xy\7$\2\2y~\5\16\b\2z{\7\b\2\2"+
		"{}\5\16\b\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7%\2\2\u0082\23\3\2\2\2\u0083\u0084"+
		"\7\n\2\2\u0084\u0085\7$\2\2\u0085\u0086\5\34\17\2\u0086\u0087\7%\2\2\u0087"+
		"\u0088\7&\2\2\u0088\u0089\5\4\3\2\u0089\u008f\7\'\2\2\u008a\u008b\7\13"+
		"\2\2\u008b\u008c\7&\2\2\u008c\u008d\5\26\f\2\u008d\u008e\7\'\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u0090\3\2\2\2\u0090\25\3\2\2"+
		"\2\u0091\u0092\5\4\3\2\u0092\27\3\2\2\2\u0093\u0094\7\f\2\2\u0094\u0095"+
		"\7$\2\2\u0095\u0096\5\34\17\2\u0096\u0097\7%\2\2\u0097\u0098\7&\2\2\u0098"+
		"\u0099\5\4\3\2\u0099\u009a\7\'\2\2\u009a\31\3\2\2\2\u009b\u009c\7\r\2"+
		"\2\u009c\u009d\7$\2\2\u009d\u009e\t\6\2\2\u009e\u009f\7%\2\2\u009f\u00a0"+
		"\7&\2\2\u00a0\u00a1\5\4\3\2\u00a1\u00a2\7\'\2\2\u00a2\33\3\2\2\2\u00a3"+
		"\u00a4\5\16\b\2\u00a4\u00a5\7\37\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00be"+
		"\3\2\2\2\u00a7\u00a8\5\16\b\2\u00a8\u00a9\7 \2\2\u00a9\u00aa\5\16\b\2"+
		"\u00aa\u00be\3\2\2\2\u00ab\u00ac\5\16\b\2\u00ac\u00ad\7!\2\2\u00ad\u00ae"+
		"\5\16\b\2\u00ae\u00be\3\2\2\2\u00af\u00b0\5\16\b\2\u00b0\u00b1\7\"\2\2"+
		"\u00b1\u00b2\5\16\b\2\u00b2\u00be\3\2\2\2\u00b3\u00b4\5\16\b\2\u00b4\u00b5"+
		"\7#\2\2\u00b5\u00b6\5\16\b\2\u00b6\u00be\3\2\2\2\u00b7\u00b8\5\16\b\2"+
		"\u00b8\u00b9\7\36\2\2\u00b9\u00ba\5\16\b\2\u00ba\u00bb\7#\2\2\u00bb\u00bc"+
		"\5\16\b\2\u00bc\u00be\3\2\2\2\u00bd\u00a3\3\2\2\2\u00bd\u00a7\3\2\2\2"+
		"\u00bd\u00ab\3\2\2\2\u00bd\u00af\3\2\2\2\u00bd\u00b3\3\2\2\2\u00bd\u00b7"+
		"\3\2\2\2\u00be\35\3\2\2\2\u00bf\u00c0\t\7\2\2\u00c0\37\3\2\2\2\u00c1\u00c2"+
		"\t\b\2\2\u00c2!\3\2\2\2\u00c3\u00c4\7\23\2\2\u00c4#\3\2\2\2\16\60\67A"+
		"NR^fhr~\u008f\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}