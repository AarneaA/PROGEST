// Generated from /Users/taavikala/kool/PROGEST/src/parser/PROGEST.g4 by ANTLR 4.x
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PROGESTLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, Variable=13, Number=14, String=15, Comment=16, 
		Whitespace=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'siis'", "'tee'", "'{'", "')'", "'muidu'", "'('", "'kui'", "'kuni'", 
		"'='", "'}'", "';'", "'muut'", "Variable", "Number", "String", "Comment", 
		"Whitespace"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "Variable", "Number", "String", "Comment", "Whitespace"
	};


	public PROGESTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PROGEST.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\7\16Q\n\16\f\16\16\16T\13"+
		"\16\3\17\3\17\3\17\7\17Y\n\17\f\17\16\17\\\13\17\5\17^\n\17\3\17\3\17"+
		"\6\17b\n\17\r\17\16\17c\5\17f\n\17\3\20\3\20\7\20j\n\20\f\20\16\20m\13"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21u\n\21\f\21\16\21x\13\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\6\22\u0080\n\22\r\22\16\22\u0081\3\22\3\22\3v"+
		"\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23\3\2\b\4\2C\\c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\5\2\f"+
		"\f\17\17$$\5\2\13\f\17\17\"\"\u008c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5*\3\2\2\2\7.\3\2\2"+
		"\2\t\60\3\2\2\2\13\62\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21>\3\2\2\2\23C\3"+
		"\2\2\2\25E\3\2\2\2\27G\3\2\2\2\31I\3\2\2\2\33N\3\2\2\2\35]\3\2\2\2\37"+
		"g\3\2\2\2!p\3\2\2\2#\177\3\2\2\2%&\7u\2\2&\'\7k\2\2\'(\7k\2\2()\7u\2\2"+
		")\4\3\2\2\2*+\7v\2\2+,\7g\2\2,-\7g\2\2-\6\3\2\2\2./\7}\2\2/\b\3\2\2\2"+
		"\60\61\7+\2\2\61\n\3\2\2\2\62\63\7o\2\2\63\64\7w\2\2\64\65\7k\2\2\65\66"+
		"\7f\2\2\66\67\7w\2\2\67\f\3\2\2\289\7*\2\29\16\3\2\2\2:;\7m\2\2;<\7w\2"+
		"\2<=\7k\2\2=\20\3\2\2\2>?\7m\2\2?@\7w\2\2@A\7p\2\2AB\7k\2\2B\22\3\2\2"+
		"\2CD\7?\2\2D\24\3\2\2\2EF\7\177\2\2F\26\3\2\2\2GH\7=\2\2H\30\3\2\2\2I"+
		"J\7o\2\2JK\7w\2\2KL\7w\2\2LM\7v\2\2M\32\3\2\2\2NR\t\2\2\2OQ\t\3\2\2PO"+
		"\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\34\3\2\2\2TR\3\2\2\2U^\7\62\2"+
		"\2VZ\t\4\2\2WY\t\5\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2"+
		"\2\2\\Z\3\2\2\2]U\3\2\2\2]V\3\2\2\2^e\3\2\2\2_a\7\60\2\2`b\t\5\2\2a`\3"+
		"\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2e_\3\2\2\2ef\3\2\2\2f\36"+
		"\3\2\2\2gk\7$\2\2hj\n\6\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln"+
		"\3\2\2\2mk\3\2\2\2no\7$\2\2o \3\2\2\2pq\7\61\2\2qr\7,\2\2rv\3\2\2\2su"+
		"\13\2\2\2ts\3\2\2\2ux\3\2\2\2vw\3\2\2\2vt\3\2\2\2wy\3\2\2\2xv\3\2\2\2"+
		"yz\7,\2\2z{\7\61\2\2{|\3\2\2\2|}\b\21\2\2}\"\3\2\2\2~\u0080\t\7\2\2\177"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\b\22\2\2\u0084$\3\2\2\2\13\2RZ]cekv\u0081\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}