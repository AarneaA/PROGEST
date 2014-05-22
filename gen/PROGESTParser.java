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
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, Variable=24, 
		Number=25, String=26, Comment=27, Whitespace=28;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "','", "'+'", "'-'", "'*'", "'muidu'", "'('", "'<'", 
		"'='", "'kui'", "'!='", "'muut'", "';'", "'<='", "'tee'", "'siis'", "'>'", 
		"'{'", "'=='", "'/'", "'kuni'", "'>='", "'}'", "Variable", "Number", "String", 
		"Comment", "Whitespace"
	};
	public static final int
		RULE_program = 0, RULE_sentences = 1, RULE_sentence = 2, RULE_ifSentence = 3, 
		RULE_whileSentence = 4, RULE_assignment = 5, RULE_declaration = 6, RULE_expression = 7, 
		RULE_expressionNegatives = 8;
	public static final String[] ruleNames = {
		"program", "sentences", "sentence", "ifSentence", "whileSentence", "assignment", 
		"declaration", "expression", "expressionNegatives"
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
			setState(18); sentences();
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
			setState(20); sentence();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==13) {
				{
				{
				setState(21); match(13);
				setState(22); sentence();
				}
				}
				setState(27);
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
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28); ifSentence();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29); whileSentence();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30); assignment();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(31); declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(32); expression(0);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(33); match(18);
				setState(34); sentences();
				setState(35); match(23);
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
			setState(39); match(10);
			setState(40); expression(0);
			setState(41); match(16);
			setState(42); match(18);
			setState(43); sentence();
			setState(44); match(23);
			setState(45); match(6);
			setState(46); match(18);
			setState(47); sentence();
			setState(48); match(23);
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
			setState(60);
			switch (_input.LA(1)) {
			case 21:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); match(21);
				setState(51); expression(0);
				setState(52); match(15);
				setState(53); sentence();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 2);
				{
				setState(55); match(15);
				setState(56); sentence();
				setState(57); match(21);
				setState(58); expression(0);
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
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(Variable);
			setState(63); match(9);
			setState(64); expression(0);
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
		enterRule(_localctx, 12, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(12);
			setState(67); match(Variable);
			setState(68); match(9);
			setState(69); expression(0);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(72); match(Variable);
				setState(73); match(7);
				setState(82);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 7) | (1L << Variable) | (1L << Number) | (1L << String))) != 0)) {
					{
					setState(74); expression(0);
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==2) {
						{
						{
						setState(75); match(2);
						setState(76); expression(0);
						}
						}
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(84); match(1);
				}
				break;

			case 2:
				{
				_localctx = new NegativesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85); match(4);
				setState(86); expressionNegatives();
				}
				break;

			case 3:
				{
				_localctx = new VariableLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87); match(Variable);
				}
				break;

			case 4:
				{
				_localctx = new NumberLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88); match(Number);
				}
				break;

			case 5:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89); match(String);
				}
				break;

			case 6:
				{
				_localctx = new ExpressionsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90); match(7);
				setState(91); expression(0);
				setState(92); match(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(97);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 14) | (1L << 17) | (1L << 19) | (1L << 22))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(98); expression(10);
						}
						break;

					case 2:
						{
						_localctx = new AdditionSubtractionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(100);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==4) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(101); expression(9);
						}
						break;

					case 3:
						{
						_localctx = new MultiplicationDivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(103);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==20) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(104); expression(8);
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
		enterRule(_localctx, 16, RULE_expressionNegatives);
		try {
			setState(116);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); match(Number);
				}
				break;
			case Variable:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); match(Variable);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 3);
				{
				setState(112); match(7);
				setState(113); expression(0);
				setState(114); match(1);
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
		case 7: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 9);

		case 1: return precpred(_ctx, 8);

		case 2: return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3"+
		"\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4(\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tP\n\t\f\t\16\tS\13\t\5\tU\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ta\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nw\n\n\3\n\2"+
		"\3\20\13\2\4\6\b\n\f\16\20\22\2\5\b\2\n\n\r\r\20\20\23\23\25\25\30\30"+
		"\3\2\5\6\4\2\7\7\26\26\u0082\2\24\3\2\2\2\4\26\3\2\2\2\6\'\3\2\2\2\b)"+
		"\3\2\2\2\n>\3\2\2\2\f@\3\2\2\2\16D\3\2\2\2\20`\3\2\2\2\22v\3\2\2\2\24"+
		"\25\5\4\3\2\25\3\3\2\2\2\26\33\5\6\4\2\27\30\7\17\2\2\30\32\5\6\4\2\31"+
		"\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\5\3\2\2\2\35"+
		"\33\3\2\2\2\36(\5\b\5\2\37(\5\n\6\2 (\5\f\7\2!(\5\16\b\2\"(\5\20\t\2#"+
		"$\7\24\2\2$%\5\4\3\2%&\7\31\2\2&(\3\2\2\2\'\36\3\2\2\2\'\37\3\2\2\2\'"+
		" \3\2\2\2\'!\3\2\2\2\'\"\3\2\2\2\'#\3\2\2\2(\7\3\2\2\2)*\7\f\2\2*+\5\20"+
		"\t\2+,\7\22\2\2,-\7\24\2\2-.\5\6\4\2./\7\31\2\2/\60\7\b\2\2\60\61\7\24"+
		"\2\2\61\62\5\6\4\2\62\63\7\31\2\2\63\t\3\2\2\2\64\65\7\27\2\2\65\66\5"+
		"\20\t\2\66\67\7\21\2\2\678\5\6\4\28?\3\2\2\29:\7\21\2\2:;\5\6\4\2;<\7"+
		"\27\2\2<=\5\20\t\2=?\3\2\2\2>\64\3\2\2\2>9\3\2\2\2?\13\3\2\2\2@A\7\32"+
		"\2\2AB\7\13\2\2BC\5\20\t\2C\r\3\2\2\2DE\7\16\2\2EF\7\32\2\2FG\7\13\2\2"+
		"GH\5\20\t\2H\17\3\2\2\2IJ\b\t\1\2JK\7\32\2\2KT\7\t\2\2LQ\5\20\t\2MN\7"+
		"\4\2\2NP\5\20\t\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ"+
		"\3\2\2\2TL\3\2\2\2TU\3\2\2\2UV\3\2\2\2Va\7\3\2\2WX\7\6\2\2Xa\5\22\n\2"+
		"Ya\7\32\2\2Za\7\33\2\2[a\7\34\2\2\\]\7\t\2\2]^\5\20\t\2^_\7\3\2\2_a\3"+
		"\2\2\2`I\3\2\2\2`W\3\2\2\2`Y\3\2\2\2`Z\3\2\2\2`[\3\2\2\2`\\\3\2\2\2am"+
		"\3\2\2\2bc\f\13\2\2cd\t\2\2\2dl\5\20\t\fef\f\n\2\2fg\t\3\2\2gl\5\20\t"+
		"\13hi\f\t\2\2ij\t\4\2\2jl\5\20\t\nkb\3\2\2\2ke\3\2\2\2kh\3\2\2\2lo\3\2"+
		"\2\2mk\3\2\2\2mn\3\2\2\2n\21\3\2\2\2om\3\2\2\2pw\7\33\2\2qw\7\32\2\2r"+
		"s\7\t\2\2st\5\20\t\2tu\7\3\2\2uw\3\2\2\2vp\3\2\2\2vq\3\2\2\2vr\3\2\2\2"+
		"w\23\3\2\2\2\13\33\'>QT`kmv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}