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
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, Variable=27, Number=28, String=29, Comment=30, Whitespace=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"','", "'korral vahemikus'", "'*'", "'-'", "'('", "'<'", "'!='", "'<='", 
		"'tee'", "'{'", "'}'", "'iga'", "')'", "'+'", "'muidu'", "'kui'", "'='", 
		"';'", "'muut'", "'siis'", "'>'", "'/'", "'=='", "'kuni'", "'>='", "'..'", 
		"Variable", "Number", "String", "Comment", "Whitespace"
	};
	public static final String[] ruleNames = {
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "Variable", "Number", "String", "Comment", "Whitespace"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00d3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\7"+
		"\34\u009f\n\34\f\34\16\34\u00a2\13\34\3\35\3\35\3\35\7\35\u00a7\n\35\f"+
		"\35\16\35\u00aa\13\35\5\35\u00ac\n\35\3\35\3\35\6\35\u00b0\n\35\r\35\16"+
		"\35\u00b1\5\35\u00b4\n\35\3\36\3\36\7\36\u00b8\n\36\f\36\16\36\u00bb\13"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00c3\n\37\f\37\16\37\u00c6\13"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \6 \u00ce\n \r \16 \u00cf\3 \3 \3\u00c4"+
		"\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!\3\2\b\4\2C\\c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\5\2\f\f\17\17$"+
		"$\5\2\13\f\17\17\"\"\u00da\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2"+
		"\2\2\7T\3\2\2\2\tV\3\2\2\2\13X\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21_\3\2"+
		"\2\2\23b\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31j\3\2\2\2\33n\3\2\2\2\35p\3"+
		"\2\2\2\37r\3\2\2\2!x\3\2\2\2#|\3\2\2\2%~\3\2\2\2\'\u0080\3\2\2\2)\u0085"+
		"\3\2\2\2+\u008a\3\2\2\2-\u008c\3\2\2\2/\u008e\3\2\2\2\61\u0091\3\2\2\2"+
		"\63\u0096\3\2\2\2\65\u0099\3\2\2\2\67\u009c\3\2\2\29\u00ab\3\2\2\2;\u00b5"+
		"\3\2\2\2=\u00be\3\2\2\2?\u00cd\3\2\2\2AB\7.\2\2B\4\3\2\2\2CD\7m\2\2DE"+
		"\7q\2\2EF\7t\2\2FG\7t\2\2GH\7c\2\2HI\7n\2\2IJ\7\"\2\2JK\7x\2\2KL\7c\2"+
		"\2LM\7j\2\2MN\7g\2\2NO\7o\2\2OP\7k\2\2PQ\7m\2\2QR\7w\2\2RS\7u\2\2S\6\3"+
		"\2\2\2TU\7,\2\2U\b\3\2\2\2VW\7/\2\2W\n\3\2\2\2XY\7*\2\2Y\f\3\2\2\2Z[\7"+
		">\2\2[\16\3\2\2\2\\]\7#\2\2]^\7?\2\2^\20\3\2\2\2_`\7>\2\2`a\7?\2\2a\22"+
		"\3\2\2\2bc\7v\2\2cd\7g\2\2de\7g\2\2e\24\3\2\2\2fg\7}\2\2g\26\3\2\2\2h"+
		"i\7\177\2\2i\30\3\2\2\2jk\7k\2\2kl\7i\2\2lm\7c\2\2m\32\3\2\2\2no\7+\2"+
		"\2o\34\3\2\2\2pq\7-\2\2q\36\3\2\2\2rs\7o\2\2st\7w\2\2tu\7k\2\2uv\7f\2"+
		"\2vw\7w\2\2w \3\2\2\2xy\7m\2\2yz\7w\2\2z{\7k\2\2{\"\3\2\2\2|}\7?\2\2}"+
		"$\3\2\2\2~\177\7=\2\2\177&\3\2\2\2\u0080\u0081\7o\2\2\u0081\u0082\7w\2"+
		"\2\u0082\u0083\7w\2\2\u0083\u0084\7v\2\2\u0084(\3\2\2\2\u0085\u0086\7"+
		"u\2\2\u0086\u0087\7k\2\2\u0087\u0088\7k\2\2\u0088\u0089\7u\2\2\u0089*"+
		"\3\2\2\2\u008a\u008b\7@\2\2\u008b,\3\2\2\2\u008c\u008d\7\61\2\2\u008d"+
		".\3\2\2\2\u008e\u008f\7?\2\2\u008f\u0090\7?\2\2\u0090\60\3\2\2\2\u0091"+
		"\u0092\7m\2\2\u0092\u0093\7w\2\2\u0093\u0094\7p\2\2\u0094\u0095\7k\2\2"+
		"\u0095\62\3\2\2\2\u0096\u0097\7@\2\2\u0097\u0098\7?\2\2\u0098\64\3\2\2"+
		"\2\u0099\u009a\7\60\2\2\u009a\u009b\7\60\2\2\u009b\66\3\2\2\2\u009c\u00a0"+
		"\t\2\2\2\u009d\u009f\t\3\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a18\3\2\2\2\u00a2\u00a0\3\2\2\2"+
		"\u00a3\u00ac\7\62\2\2\u00a4\u00a8\t\4\2\2\u00a5\u00a7\t\5\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a4\3\2"+
		"\2\2\u00ac\u00b3\3\2\2\2\u00ad\u00af\7\60\2\2\u00ae\u00b0\t\5\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		":\3\2\2\2\u00b5\u00b9\7$\2\2\u00b6\u00b8\n\6\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7$\2\2\u00bd<\3\2\2\2\u00be\u00bf"+
		"\7\61\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c3\13\2\2\2"+
		"\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7,\2\2\u00c8"+
		"\u00c9\7\61\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\37\2\2\u00cb>\3\2\2"+
		"\2\u00cc\u00ce\t\7\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b \2\2\u00d2"+
		"@\3\2\2\2\13\2\u00a0\u00a8\u00ab\u00b1\u00b3\u00b9\u00c4\u00cf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}