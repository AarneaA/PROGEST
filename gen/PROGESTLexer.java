// Generated from PROGEST.g4 by ANTLR 4.2
package parser;
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
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, Variable=24, 
		Number=25, String=26, Comment=27, Whitespace=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'+'", "'-'", "'*'", "'muidu'", "'('", "'<'", "'='", "'kui'", 
		"'!='", "'muut'", "';'", "'<='", "'tee'", "'siis'", "'>'", "'{'", "'=='", 
		"'/'", "'kuni'", "'>='", "'}'", "Variable", "Number", "String", "Comment", 
		"Whitespace"
	};
	public static final String[] ruleNames = {
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "Variable", "Number", 
		"String", "Comment", "Whitespace"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\7\31\u0081\n\31\f\31\16\31\u0084\13\31\3\32\3\32\3\32\7"+
		"\32\u0089\n\32\f\32\16\32\u008c\13\32\5\32\u008e\n\32\3\32\3\32\6\32\u0092"+
		"\n\32\r\32\16\32\u0093\5\32\u0096\n\32\3\33\3\33\7\33\u009a\n\33\f\33"+
		"\16\33\u009d\13\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00a5\n\34\f\34"+
		"\16\34\u00a8\13\34\3\34\3\34\3\34\3\34\3\34\3\35\6\35\u00b0\n\35\r\35"+
		"\16\35\u00b1\3\35\3\35\3\u00a6\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36\3\2\b\4\2C\\c|\6\2\62;C\\aac|\3\2\63"+
		";\3\2\62;\5\2\f\f\17\17$$\5\2\13\f\17\17\"\"\u00bc\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3"+
		"\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3"+
		"\2\2\2\25Q\3\2\2\2\27U\3\2\2\2\31X\3\2\2\2\33]\3\2\2\2\35_\3\2\2\2\37"+
		"b\3\2\2\2!f\3\2\2\2#k\3\2\2\2%m\3\2\2\2\'o\3\2\2\2)r\3\2\2\2+t\3\2\2\2"+
		"-y\3\2\2\2/|\3\2\2\2\61~\3\2\2\2\63\u008d\3\2\2\2\65\u0097\3\2\2\2\67"+
		"\u00a0\3\2\2\29\u00af\3\2\2\2;<\7+\2\2<\4\3\2\2\2=>\7.\2\2>\6\3\2\2\2"+
		"?@\7-\2\2@\b\3\2\2\2AB\7/\2\2B\n\3\2\2\2CD\7,\2\2D\f\3\2\2\2EF\7o\2\2"+
		"FG\7w\2\2GH\7k\2\2HI\7f\2\2IJ\7w\2\2J\16\3\2\2\2KL\7*\2\2L\20\3\2\2\2"+
		"MN\7>\2\2N\22\3\2\2\2OP\7?\2\2P\24\3\2\2\2QR\7m\2\2RS\7w\2\2ST\7k\2\2"+
		"T\26\3\2\2\2UV\7#\2\2VW\7?\2\2W\30\3\2\2\2XY\7o\2\2YZ\7w\2\2Z[\7w\2\2"+
		"[\\\7v\2\2\\\32\3\2\2\2]^\7=\2\2^\34\3\2\2\2_`\7>\2\2`a\7?\2\2a\36\3\2"+
		"\2\2bc\7v\2\2cd\7g\2\2de\7g\2\2e \3\2\2\2fg\7u\2\2gh\7k\2\2hi\7k\2\2i"+
		"j\7u\2\2j\"\3\2\2\2kl\7@\2\2l$\3\2\2\2mn\7}\2\2n&\3\2\2\2op\7?\2\2pq\7"+
		"?\2\2q(\3\2\2\2rs\7\61\2\2s*\3\2\2\2tu\7m\2\2uv\7w\2\2vw\7p\2\2wx\7k\2"+
		"\2x,\3\2\2\2yz\7@\2\2z{\7?\2\2{.\3\2\2\2|}\7\177\2\2}\60\3\2\2\2~\u0082"+
		"\t\2\2\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\62\3\2\2\2\u0084\u0082\3\2\2"+
		"\2\u0085\u008e\7\62\2\2\u0086\u008a\t\4\2\2\u0087\u0089\t\5\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0085\3\2\2\2\u008d"+
		"\u0086\3\2\2\2\u008e\u0095\3\2\2\2\u008f\u0091\7\60\2\2\u0090\u0092\t"+
		"\5\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\64\3\2\2\2\u0097\u009b\7$\2\2\u0098\u009a\n\6\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7$\2\2\u009f\66\3\2\2\2"+
		"\u00a0\u00a1\7\61\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5"+
		"\13\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa"+
		"\7,\2\2\u00aa\u00ab\7\61\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\34\2\2"+
		"\u00ad8\3\2\2\2\u00ae\u00b0\t\7\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\b\35\2\2\u00b4:\3\2\2\2\13\2\u0082\u008a\u008d\u0093\u0095\u009b"+
		"\u00a6\u00b1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}