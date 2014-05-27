// Generated from PROGEST.g4 by ANTLR 4.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PROGESTParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, Variable=27, Number=28, String=29, Comment=30, Whitespace=31;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'korral vahemikus'", "'*'", "'-'", "'('", "'<'", 
		"'!='", "'<='", "'tee'", "'{'", "'}'", "'iga'", "')'", "'+'", "'muidu'", 
		"'kui'", "'='", "';'", "'muut'", "'siis'", "'>'", "'/'", "'=='", "'kuni'", 
		"'>='", "'..'", "Variable", "Number", "String", "Comment", "Whitespace"
	};
	public static final int
		RULE_program = 0, RULE_sentences = 1, RULE_sentence = 2, RULE_ifSentence = 3, 
		RULE_whileSentence = 4, RULE_forSentence = 5, RULE_assignment = 6, RULE_declaration = 7, 
		RULE_expression = 8, RULE_expressionNegatives = 9;
	public static final String[] ruleNames = {
		"program", "sentences", "sentence", "ifSentence", "whileSentence", "forSentence", 
		"assignment", "declaration", "expression", "expressionNegatives"
	};

	@Override
	public String getGrammarFileName() { return "PROGEST.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PROGESTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); sentences();
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

	public static class SentencesContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public SentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterSentences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitSentences(this);
		}
	}

	public final SentencesContext sentences() throws RecognitionException {
		SentencesContext _localctx = new SentencesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); sentence();
			setState(23); match(18);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 9) | (1L << 10) | (1L << 12) | (1L << 16) | (1L << 19) | (1L << 24) | (1L << Variable) | (1L << Number) | (1L << String))) != 0)) {
				{
				{
				setState(24); sentence();
				setState(25); match(18);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SentenceContext extends ParserRuleContext {
		public WhileSentenceContext whileSentence() {
			return getRuleContext(WhileSentenceContext.class,0);
		}
		public IfSentenceContext ifSentence() {
			return getRuleContext(IfSentenceContext.class,0);
		}
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForSentenceContext forSentence() {
			return getRuleContext(ForSentenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); ifSentence();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33); whileSentence();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34); forSentence();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35); assignment();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(36); declaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(37); expression(0);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(38); match(10);
				setState(39); sentences();
				setState(40); match(11);
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

	public static class IfSentenceContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterIfSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitIfSentence(this);
		}
	}

	public final IfSentenceContext ifSentence() throws RecognitionException {
		IfSentenceContext _localctx = new IfSentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(16);
			setState(45); expression(0);
			setState(46); match(20);
			setState(47); match(10);
			setState(48); sentence();
			setState(49); match(11);
			setState(50); match(15);
			setState(51); match(10);
			setState(52); sentence();
			setState(53); match(11);
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

	public static class WhileSentenceContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterWhileSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitWhileSentence(this);
		}
	}

	public final WhileSentenceContext whileSentence() throws RecognitionException {
		WhileSentenceContext _localctx = new WhileSentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileSentence);
		try {
			setState(65);
			switch (_input.LA(1)) {
			case 24:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); match(24);
				setState(56); expression(0);
				setState(57); match(9);
				setState(58); sentence();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 2);
				{
				setState(60); match(9);
				setState(61); sentence();
				setState(62); match(24);
				setState(63); expression(0);
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

	public static class ForSentenceContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ForSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterForSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitForSentence(this);
		}
	}

	public final ForSentenceContext forSentence() throws RecognitionException {
		ForSentenceContext _localctx = new ForSentenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(12);
			setState(68); expression(0);
			setState(69); match(2);
			setState(70); expression(0);
			setState(71); match(10);
			setState(72); sentence();
			setState(73); match(11);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(PROGESTParser.Variable, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(Variable);
			setState(76); match(17);
			setState(77); expression(0);
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
		public TerminalNode Variable() { return getToken(PROGESTParser.Variable, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(19);
			setState(80); match(Variable);
			setState(81); match(17);
			setState(82); expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegativesContext extends ExpressionContext {
		public ExpressionNegativesContext expressionNegatives() {
			return getRuleContext(ExpressionNegativesContext.class,0);
		}
		public NegativesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterNegatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitNegatives(this);
		}
	}
	public static class StringLiteralContext extends ExpressionContext {
		public TerminalNode String() { return getToken(PROGESTParser.String, 0); }
		public StringLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitStringLiteral(this);
		}
	}
	public static class RangeContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public RangeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitRange(this);
		}
	}
	public static class ExpressionsContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitExpressions(this);
		}
	}
	public static class AdditionSubtractionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AdditionSubtractionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterAdditionSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitAdditionSubtraction(this);
		}
	}
	public static class VariableLiteralContext extends ExpressionContext {
		public TerminalNode Variable() { return getToken(PROGESTParser.Variable, 0); }
		public VariableLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterVariableLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitVariableLiteral(this);
		}
	}
	public static class NumberLiteralContext extends ExpressionContext {
		public TerminalNode Number() { return getToken(PROGESTParser.Number, 0); }
		public NumberLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitNumberLiteral(this);
		}
	}
	public static class FunctionCallContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Variable() { return getToken(PROGESTParser.Variable, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitFunctionCall(this);
		}
	}
	public static class MultiplicationDivisionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MultiplicationDivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterMultiplicationDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitMultiplicationDivision(this);
		}
	}
	public static class ComparisonContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitComparison(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(85); match(Variable);
				setState(86); match(5);
				setState(95);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << Variable) | (1L << Number) | (1L << String))) != 0)) {
					{
					setState(87); expression(0);
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==1) {
						{
						{
						setState(88); match(1);
						setState(89); expression(0);
						}
						}
						setState(94);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(97); match(13);
				}
				break;

			case 2:
				{
				_localctx = new NegativesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98); match(4);
				setState(99); expressionNegatives();
				}
				break;

			case 3:
				{
				_localctx = new VariableLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100); match(Variable);
				}
				break;

			case 4:
				{
				_localctx = new NumberLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101); match(Number);
				}
				break;

			case 5:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102); match(String);
				}
				break;

			case 6:
				{
				_localctx = new ExpressionsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103); match(5);
				setState(104); expression(0);
				setState(105); match(13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(121);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(110);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 21) | (1L << 23) | (1L << 25))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(111); expression(11);
						}
						break;

					case 2:
						{
						_localctx = new AdditionSubtractionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(113);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==14) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(114); expression(10);
						}
						break;

					case 3:
						{
						_localctx = new MultiplicationDivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(116);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==22) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(117); expression(9);
						}
						break;

					case 4:
						{
						_localctx = new RangeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(119); match(26);
						setState(120); expression(8);
						}
						break;
					}
					} 
				}
				setState(125);
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

	public static class ExpressionNegativesContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(PROGESTParser.Variable, 0); }
		public TerminalNode Number() { return getToken(PROGESTParser.Number, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionNegativesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNegatives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).enterExpressionNegatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PROGESTListener ) ((PROGESTListener)listener).exitExpressionNegatives(this);
		}
	}

	public final ExpressionNegativesContext expressionNegatives() throws RecognitionException {
		ExpressionNegativesContext _localctx = new ExpressionNegativesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressionNegatives);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); match(Number);
				}
				break;
			case Variable:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); match(Variable);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); match(5);
				setState(129); expression(0);
				setState(130); match(13);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 10);

		case 1: return precpred(_ctx, 9);

		case 2: return precpred(_ctx, 8);

		case 3: return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u0089\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6D\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n]\n\n\f\n\16\n`\13\n\5\nb\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0087"+
		"\n\13\3\13\2\3\22\f\2\4\6\b\n\f\16\20\22\24\2\5\6\2\b\n\27\27\31\31\33"+
		"\33\4\2\6\6\20\20\4\2\5\5\30\30\u0093\2\26\3\2\2\2\4\30\3\2\2\2\6,\3\2"+
		"\2\2\b.\3\2\2\2\nC\3\2\2\2\fE\3\2\2\2\16M\3\2\2\2\20Q\3\2\2\2\22m\3\2"+
		"\2\2\24\u0086\3\2\2\2\26\27\5\4\3\2\27\3\3\2\2\2\30\31\5\6\4\2\31\37\7"+
		"\24\2\2\32\33\5\6\4\2\33\34\7\24\2\2\34\36\3\2\2\2\35\32\3\2\2\2\36!\3"+
		"\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \5\3\2\2\2!\37\3\2\2\2\"-\5\b\5\2#-\5"+
		"\n\6\2$-\5\f\7\2%-\5\16\b\2&-\5\20\t\2\'-\5\22\n\2()\7\f\2\2)*\5\4\3\2"+
		"*+\7\r\2\2+-\3\2\2\2,\"\3\2\2\2,#\3\2\2\2,$\3\2\2\2,%\3\2\2\2,&\3\2\2"+
		"\2,\'\3\2\2\2,(\3\2\2\2-\7\3\2\2\2./\7\22\2\2/\60\5\22\n\2\60\61\7\26"+
		"\2\2\61\62\7\f\2\2\62\63\5\6\4\2\63\64\7\r\2\2\64\65\7\21\2\2\65\66\7"+
		"\f\2\2\66\67\5\6\4\2\678\7\r\2\28\t\3\2\2\29:\7\32\2\2:;\5\22\n\2;<\7"+
		"\13\2\2<=\5\6\4\2=D\3\2\2\2>?\7\13\2\2?@\5\6\4\2@A\7\32\2\2AB\5\22\n\2"+
		"BD\3\2\2\2C9\3\2\2\2C>\3\2\2\2D\13\3\2\2\2EF\7\16\2\2FG\5\22\n\2GH\7\4"+
		"\2\2HI\5\22\n\2IJ\7\f\2\2JK\5\6\4\2KL\7\r\2\2L\r\3\2\2\2MN\7\35\2\2NO"+
		"\7\23\2\2OP\5\22\n\2P\17\3\2\2\2QR\7\25\2\2RS\7\35\2\2ST\7\23\2\2TU\5"+
		"\22\n\2U\21\3\2\2\2VW\b\n\1\2WX\7\35\2\2Xa\7\7\2\2Y^\5\22\n\2Z[\7\3\2"+
		"\2[]\5\22\n\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3"+
		"\2\2\2aY\3\2\2\2ab\3\2\2\2bc\3\2\2\2cn\7\17\2\2de\7\6\2\2en\5\24\13\2"+
		"fn\7\35\2\2gn\7\36\2\2hn\7\37\2\2ij\7\7\2\2jk\5\22\n\2kl\7\17\2\2ln\3"+
		"\2\2\2mV\3\2\2\2md\3\2\2\2mf\3\2\2\2mg\3\2\2\2mh\3\2\2\2mi\3\2\2\2n}\3"+
		"\2\2\2op\f\f\2\2pq\t\2\2\2q|\5\22\n\rrs\f\13\2\2st\t\3\2\2t|\5\22\n\f"+
		"uv\f\n\2\2vw\t\4\2\2w|\5\22\n\13xy\f\t\2\2yz\7\34\2\2z|\5\22\n\n{o\3\2"+
		"\2\2{r\3\2\2\2{u\3\2\2\2{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\23"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0087\7\36\2\2\u0081\u0087\7\35\2\2\u0082"+
		"\u0083\7\7\2\2\u0083\u0084\5\22\n\2\u0084\u0085\7\17\2\2\u0085\u0087\3"+
		"\2\2\2\u0086\u0080\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0087"+
		"\25\3\2\2\2\13\37,C^am{}\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}