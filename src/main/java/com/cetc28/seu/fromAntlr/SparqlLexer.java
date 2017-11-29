package com.cetc28.seu.fromAntlr;

// Generated from Sparql.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INT=3, BASE=4, PREFIX=5, MODIFY=6, DELETE=7, INSERT=8, 
		DATA=9, INTO=10, LOAD=11, CLEAR=12, CREATE=13, SILENT=14, DROP=15, EXISTS=16, 
		UNSAID=17, NOT=18, SELECT=19, DISTINCT=20, REDUCED=21, CONSTRUCT=22, DESCRIBE=23, 
		ASK=24, FROM=25, NAMED=26, WHERE=27, ORDER=28, GROUP=29, HAVING=30, BY=31, 
		ASC=32, DESC=33, LIMIT=34, OFFSET=35, OPTIONAL=36, GRAPH=37, UNION=38, 
		FILTER=39, A=40, AS=41, STR=42, LANG=43, LANGMATCHES=44, DATATYPE=45, 
		BOUND=46, SAMETERM=47, ISIRI=48, ISURI=49, ISBLANK=50, ISLITERAL=51, REGEX=52, 
		COUNT=53, SUM=54, MIN=55, MAX=56, AVG=57, TRUE=58, FALSE=59, IF=60, COALESCE=61, 
		IRI_REF=62, PNAME_NS=63, PNAME_LN=64, VAR1=65, VAR2=66, LANGTAG=67, INTEGER=68, 
		DECIMAL=69, DOUBLE=70, INTEGER_POSITIVE=71, DECIMAL_POSITIVE=72, DOUBLE_POSITIVE=73, 
		INTEGER_NEGATIVE=74, DECIMAL_NEGATIVE=75, DOUBLE_NEGATIVE=76, STRING_LITERAL1=77, 
		STRING_LITERAL2=78, STRING_LITERAL_LONG1=79, STRING_LITERAL_LONG2=80, 
		NIL=81, WS=82, ANON=83, BLANK_NODE_LABEL=84, REFERENCE=85, AND=86, OR=87, 
		OPEN_CURLY_BRACE=88, CLOSE_CURLY_BRACE=89, SEMICOLON=90, DOT=91, PLUS=92, 
		MINUS=93, ASTERISK=94, COMMA=95, NOT_SIGN=96, DIVIDE=97, EQUAL=98, LESS=99, 
		GREATER=100, OPEN_BRACE=101, CLOSE_BRACE=102, LESS_EQUAL=103, GREATER_EQUAL=104, 
		NOT_EQUAL=105, OPEN_SQUARE_BRACE=106, CLOSE_SQUARE_BRACE=107;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "INT", "BASE", "PREFIX", "MODIFY", "DELETE", "INSERT", 
		"DATA", "INTO", "LOAD", "CLEAR", "CREATE", "SILENT", "DROP", "EXISTS", 
		"UNSAID", "NOT", "SELECT", "DISTINCT", "REDUCED", "CONSTRUCT", "DESCRIBE", 
		"ASK", "FROM", "NAMED", "WHERE", "ORDER", "GROUP", "HAVING", "BY", "ASC", 
		"DESC", "LIMIT", "OFFSET", "OPTIONAL", "GRAPH", "UNION", "FILTER", "A", 
		"AS", "STR", "LANG", "LANGMATCHES", "DATATYPE", "BOUND", "SAMETERM", "ISIRI", 
		"ISURI", "ISBLANK", "ISLITERAL", "REGEX", "COUNT", "SUM", "MIN", "MAX", 
		"AVG", "TRUE", "FALSE", "IF", "COALESCE", "IRI_REF", "PNAME_NS", "PNAME_LN", 
		"VAR1", "VAR2", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "DIGIT", "INTEGER_POSITIVE", 
		"DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", 
		"DOUBLE_NEGATIVE", "EXPONENT", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", 
		"STRING_LITERAL_LONG2", "ECHAR", "NIL", "WS", "ANON", "PN_CHARS_BASE", 
		"PN_CHARS_U", "VARNAME", "PN_CHARS", "PN_PREFIX", "PN_LOCAL", "BLANK_NODE_LABEL", 
		"REFERENCE", "AND", "OR", "EOL", "OPEN_CURLY_BRACE", "CLOSE_CURLY_BRACE", 
		"SEMICOLON", "DOT", "PLUS", "MINUS", "ASTERISK", "COMMA", "NOT_SIGN", 
		"DIVIDE", "EQUAL", "LESS", "GREATER", "OPEN_BRACE", "CLOSE_BRACE", "LESS_EQUAL", 
		"GREATER_EQUAL", "NOT_EQUAL", "OPEN_SQUARE_BRACE", "CLOSE_SQUARE_BRACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'^'", "'?'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'^^'", "'&&'", "'||'", "'{'", "'}'", "';'", "'.'", "'+'", "'-'", 
		"'*'", "','", "'!'", "'/'", "'='", "'<'", "'>'", "'('", "')'", "'<='", 
		"'>='", "'!='", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "INT", "BASE", "PREFIX", "MODIFY", "DELETE", "INSERT", 
		"DATA", "INTO", "LOAD", "CLEAR", "CREATE", "SILENT", "DROP", "EXISTS", 
		"UNSAID", "NOT", "SELECT", "DISTINCT", "REDUCED", "CONSTRUCT", "DESCRIBE", 
		"ASK", "FROM", "NAMED", "WHERE", "ORDER", "GROUP", "HAVING", "BY", "ASC", 
		"DESC", "LIMIT", "OFFSET", "OPTIONAL", "GRAPH", "UNION", "FILTER", "A", 
		"AS", "STR", "LANG", "LANGMATCHES", "DATATYPE", "BOUND", "SAMETERM", "ISIRI", 
		"ISURI", "ISBLANK", "ISLITERAL", "REGEX", "COUNT", "SUM", "MIN", "MAX", 
		"AVG", "TRUE", "FALSE", "IF", "COALESCE", "IRI_REF", "PNAME_NS", "PNAME_LN", 
		"VAR1", "VAR2", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "INTEGER_POSITIVE", 
		"DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", 
		"DOUBLE_NEGATIVE", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", 
		"STRING_LITERAL_LONG2", "NIL", "WS", "ANON", "BLANK_NODE_LABEL", "REFERENCE", 
		"AND", "OR", "OPEN_CURLY_BRACE", "CLOSE_CURLY_BRACE", "SEMICOLON", "DOT", 
		"PLUS", "MINUS", "ASTERISK", "COMMA", "NOT_SIGN", "DIVIDE", "EQUAL", "LESS", 
		"GREATER", "OPEN_BRACE", "CLOSE_BRACE", "LESS_EQUAL", "GREATER_EQUAL", 
		"NOT_EQUAL", "OPEN_SQUARE_BRACE", "CLOSE_SQUARE_BRACE"
	};
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


	public SparqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sparql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2m\u03a4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\3"+
		"\2\3\2\3\3\3\3\3\4\6\4\u00f3\n\4\r\4\16\4\u00f4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\3:\3"+
		":\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3?\3?\7?\u025f\n?\f?\16?\u0262\13?\3?\3?\3@\5@\u0267\n@\3@\3@"+
		"\3A\3A\3A\3B\3B\3B\3C\3C\3D\3D\3D\6D\u0276\nD\rD\16D\u0277\3D\3D\3D\3"+
		"D\6D\u027e\nD\rD\16D\u027f\7D\u0282\nD\fD\16D\u0285\13D\3E\6E\u0288\n"+
		"E\rE\16E\u0289\3F\6F\u028d\nF\rF\16F\u028e\3F\3F\7F\u0293\nF\fF\16F\u0296"+
		"\13F\3F\3F\6F\u029a\nF\rF\16F\u029b\5F\u029e\nF\3G\6G\u02a1\nG\rG\16G"+
		"\u02a2\3G\3G\7G\u02a7\nG\fG\16G\u02aa\13G\3G\3G\3G\3G\6G\u02b0\nG\rG\16"+
		"G\u02b1\3G\3G\3G\6G\u02b7\nG\rG\16G\u02b8\3G\3G\5G\u02bd\nG\3H\3H\3I\3"+
		"I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\5O\u02d6\n"+
		"O\3O\6O\u02d9\nO\rO\16O\u02da\3P\3P\3P\7P\u02e0\nP\fP\16P\u02e3\13P\3"+
		"P\3P\3Q\3Q\3Q\7Q\u02ea\nQ\fQ\16Q\u02ed\13Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R"+
		"\5R\u02f8\nR\3R\3R\5R\u02fc\nR\7R\u02fe\nR\fR\16R\u0301\13R\3R\3R\3R\3"+
		"R\3S\3S\3S\3S\3S\3S\3S\5S\u030e\nS\3S\3S\5S\u0312\nS\7S\u0314\nS\fS\16"+
		"S\u0317\13S\3S\3S\3S\3S\3T\3T\3T\3U\3U\5U\u0322\nU\3U\3U\3V\3V\5V\u0328"+
		"\nV\3V\3V\3W\3W\7W\u032e\nW\fW\16W\u0331\13W\3W\3W\3X\3X\3Y\3Y\5Y\u0339"+
		"\nY\3Z\7Z\u033c\nZ\fZ\16Z\u033f\13Z\3Z\3Z\5Z\u0343\nZ\3Z\3Z\7Z\u0347\n"+
		"Z\fZ\16Z\u034a\13Z\3[\3[\3[\5[\u034f\n[\3\\\3\\\3\\\7\\\u0354\n\\\f\\"+
		"\16\\\u0357\13\\\3\\\5\\\u035a\n\\\3]\3]\5]\u035e\n]\3]\3]\7]\u0362\n"+
		"]\f]\16]\u0365\13]\3]\5]\u0368\n]\3^\3^\3^\3^\3^\3_\3_\3_\3`\3`\3`\3a"+
		"\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l"+
		"\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3r\3s\3s\3s\3t\3t\3t\3u\3u\3v"+
		"\3v\2\2w\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66"+
		"k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG"+
		"\u008dH\u008f\2\u0091I\u0093J\u0095K\u0097L\u0099M\u009bN\u009d\2\u009f"+
		"O\u00a1P\u00a3Q\u00a5R\u00a7\2\u00a9S\u00abT\u00adU\u00af\2\u00b1\2\u00b3"+
		"\2\u00b5\2\u00b7\2\u00b9\2\u00bbV\u00bdW\u00bfX\u00c1Y\u00c3\2\u00c5Z"+
		"\u00c7[\u00c9\\\u00cb]\u00cd^\u00cf_\u00d1`\u00d3a\u00d5b\u00d7c\u00d9"+
		"d\u00dbe\u00ddf\u00dfg\u00e1h\u00e3i\u00e5j\u00e7k\u00e9l\u00ebm\3\2%"+
		"\3\2\62;\4\2DDdd\4\2CCcc\4\2UUuu\4\2GGgg\4\2RRrr\4\2TTtt\4\2HHhh\4\2K"+
		"Kkk\4\2ZZzz\4\2OOoo\4\2QQqq\4\2FFff\4\2[[{{\4\2NNnn\4\2VVvv\4\2PPpp\4"+
		"\2EEee\4\2WWww\4\2MMmm\4\2YYyy\4\2JJjj\4\2IIii\4\2XXxx\3\2\2\"\6\2\f\f"+
		"\17\17))^^\6\2\f\f\17\17$$^^\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\4\2\13"+
		"\13\"\"\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381"+
		"\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2"+
		"\uffff\b\2--//\62<\u00b9\u00b9\u0302\u0371\u2041\u2042\6\2\62;\u00b9\u00b9"+
		"\u0302\u0371\u2041\u2042\4\2\f\f\17\17\u03ca\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9"+
		"\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2"+
		"\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db"+
		"\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2"+
		"\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\3\u00ed"+
		"\3\2\2\2\5\u00ef\3\2\2\2\7\u00f2\3\2\2\2\t\u00f6\3\2\2\2\13\u00fb\3\2"+
		"\2\2\r\u0102\3\2\2\2\17\u0109\3\2\2\2\21\u0110\3\2\2\2\23\u0117\3\2\2"+
		"\2\25\u011c\3\2\2\2\27\u0121\3\2\2\2\31\u0126\3\2\2\2\33\u012c\3\2\2\2"+
		"\35\u0133\3\2\2\2\37\u013a\3\2\2\2!\u013f\3\2\2\2#\u0146\3\2\2\2%\u014d"+
		"\3\2\2\2\'\u0151\3\2\2\2)\u0158\3\2\2\2+\u0161\3\2\2\2-\u0169\3\2\2\2"+
		"/\u0173\3\2\2\2\61\u017c\3\2\2\2\63\u0180\3\2\2\2\65\u0185\3\2\2\2\67"+
		"\u018b\3\2\2\29\u0191\3\2\2\2;\u0197\3\2\2\2=\u019d\3\2\2\2?\u01a4\3\2"+
		"\2\2A\u01a7\3\2\2\2C\u01ab\3\2\2\2E\u01b0\3\2\2\2G\u01b6\3\2\2\2I\u01bd"+
		"\3\2\2\2K\u01c6\3\2\2\2M\u01cc\3\2\2\2O\u01d2\3\2\2\2Q\u01d9\3\2\2\2S"+
		"\u01db\3\2\2\2U\u01de\3\2\2\2W\u01e2\3\2\2\2Y\u01e7\3\2\2\2[\u01f3\3\2"+
		"\2\2]\u01fc\3\2\2\2_\u0202\3\2\2\2a\u020b\3\2\2\2c\u0211\3\2\2\2e\u0217"+
		"\3\2\2\2g\u021f\3\2\2\2i\u0229\3\2\2\2k\u022f\3\2\2\2m\u0235\3\2\2\2o"+
		"\u0239\3\2\2\2q\u023d\3\2\2\2s\u0241\3\2\2\2u\u0245\3\2\2\2w\u024a\3\2"+
		"\2\2y\u0250\3\2\2\2{\u0253\3\2\2\2}\u025c\3\2\2\2\177\u0266\3\2\2\2\u0081"+
		"\u026a\3\2\2\2\u0083\u026d\3\2\2\2\u0085\u0270\3\2\2\2\u0087\u0272\3\2"+
		"\2\2\u0089\u0287\3\2\2\2\u008b\u029d\3\2\2\2\u008d\u02bc\3\2\2\2\u008f"+
		"\u02be\3\2\2\2\u0091\u02c0\3\2\2\2\u0093\u02c3\3\2\2\2\u0095\u02c6\3\2"+
		"\2\2\u0097\u02c9\3\2\2\2\u0099\u02cc\3\2\2\2\u009b\u02cf\3\2\2\2\u009d"+
		"\u02d2\3\2\2\2\u009f\u02dc\3\2\2\2\u00a1\u02e6\3\2\2\2\u00a3\u02f0\3\2"+
		"\2\2\u00a5\u0306\3\2\2\2\u00a7\u031c\3\2\2\2\u00a9\u0321\3\2\2\2\u00ab"+
		"\u0327\3\2\2\2\u00ad\u032b\3\2\2\2\u00af\u0334\3\2\2\2\u00b1\u0338\3\2"+
		"\2\2\u00b3\u033d\3\2\2\2\u00b5\u034e\3\2\2\2\u00b7\u0350\3\2\2\2\u00b9"+
		"\u035d\3\2\2\2\u00bb\u0369\3\2\2\2\u00bd\u036e\3\2\2\2\u00bf\u0371\3\2"+
		"\2\2\u00c1\u0374\3\2\2\2\u00c3\u0377\3\2\2\2\u00c5\u0379\3\2\2\2\u00c7"+
		"\u037b\3\2\2\2\u00c9\u037d\3\2\2\2\u00cb\u037f\3\2\2\2\u00cd\u0381\3\2"+
		"\2\2\u00cf\u0383\3\2\2\2\u00d1\u0385\3\2\2\2\u00d3\u0387\3\2\2\2\u00d5"+
		"\u0389\3\2\2\2\u00d7\u038b\3\2\2\2\u00d9\u038d\3\2\2\2\u00db\u038f\3\2"+
		"\2\2\u00dd\u0391\3\2\2\2\u00df\u0393\3\2\2\2\u00e1\u0395\3\2\2\2\u00e3"+
		"\u0397\3\2\2\2\u00e5\u039a\3\2\2\2\u00e7\u039d\3\2\2\2\u00e9\u03a0\3\2"+
		"\2\2\u00eb\u03a2\3\2\2\2\u00ed\u00ee\7`\2\2\u00ee\4\3\2\2\2\u00ef\u00f0"+
		"\7A\2\2\u00f0\6\3\2\2\2\u00f1\u00f3\t\2\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\b\3\2\2\2"+
		"\u00f6\u00f7\t\3\2\2\u00f7\u00f8\t\4\2\2\u00f8\u00f9\t\5\2\2\u00f9\u00fa"+
		"\t\6\2\2\u00fa\n\3\2\2\2\u00fb\u00fc\t\7\2\2\u00fc\u00fd\t\b\2\2\u00fd"+
		"\u00fe\t\6\2\2\u00fe\u00ff\t\t\2\2\u00ff\u0100\t\n\2\2\u0100\u0101\t\13"+
		"\2\2\u0101\f\3\2\2\2\u0102\u0103\t\f\2\2\u0103\u0104\t\r\2\2\u0104\u0105"+
		"\t\16\2\2\u0105\u0106\t\n\2\2\u0106\u0107\t\t\2\2\u0107\u0108\t\17\2\2"+
		"\u0108\16\3\2\2\2\u0109\u010a\t\16\2\2\u010a\u010b\t\6\2\2\u010b\u010c"+
		"\t\20\2\2\u010c\u010d\t\6\2\2\u010d\u010e\t\21\2\2\u010e\u010f\t\6\2\2"+
		"\u010f\20\3\2\2\2\u0110\u0111\t\n\2\2\u0111\u0112\t\22\2\2\u0112\u0113"+
		"\t\5\2\2\u0113\u0114\t\6\2\2\u0114\u0115\t\b\2\2\u0115\u0116\t\21\2\2"+
		"\u0116\22\3\2\2\2\u0117\u0118\t\16\2\2\u0118\u0119\t\4\2\2\u0119\u011a"+
		"\t\21\2\2\u011a\u011b\t\4\2\2\u011b\24\3\2\2\2\u011c\u011d\t\n\2\2\u011d"+
		"\u011e\t\22\2\2\u011e\u011f\t\21\2\2\u011f\u0120\t\r\2\2\u0120\26\3\2"+
		"\2\2\u0121\u0122\t\20\2\2\u0122\u0123\t\r\2\2\u0123\u0124\t\4\2\2\u0124"+
		"\u0125\t\16\2\2\u0125\30\3\2\2\2\u0126\u0127\t\23\2\2\u0127\u0128\t\20"+
		"\2\2\u0128\u0129\t\6\2\2\u0129\u012a\t\4\2\2\u012a\u012b\t\b\2\2\u012b"+
		"\32\3\2\2\2\u012c\u012d\t\23\2\2\u012d\u012e\t\b\2\2\u012e\u012f\t\6\2"+
		"\2\u012f\u0130\t\4\2\2\u0130\u0131\t\21\2\2\u0131\u0132\t\6\2\2\u0132"+
		"\34\3\2\2\2\u0133\u0134\t\5\2\2\u0134\u0135\t\n\2\2\u0135\u0136\t\20\2"+
		"\2\u0136\u0137\t\6\2\2\u0137\u0138\t\22\2\2\u0138\u0139\t\21\2\2\u0139"+
		"\36\3\2\2\2\u013a\u013b\t\16\2\2\u013b\u013c\t\b\2\2\u013c\u013d\t\r\2"+
		"\2\u013d\u013e\t\7\2\2\u013e \3\2\2\2\u013f\u0140\t\6\2\2\u0140\u0141"+
		"\t\13\2\2\u0141\u0142\t\n\2\2\u0142\u0143\t\5\2\2\u0143\u0144\t\21\2\2"+
		"\u0144\u0145\t\5\2\2\u0145\"\3\2\2\2\u0146\u0147\t\24\2\2\u0147\u0148"+
		"\t\22\2\2\u0148\u0149\t\5\2\2\u0149\u014a\t\4\2\2\u014a\u014b\t\n\2\2"+
		"\u014b\u014c\t\16\2\2\u014c$\3\2\2\2\u014d\u014e\t\22\2\2\u014e\u014f"+
		"\t\r\2\2\u014f\u0150\t\21\2\2\u0150&\3\2\2\2\u0151\u0152\t\5\2\2\u0152"+
		"\u0153\t\6\2\2\u0153\u0154\t\20\2\2\u0154\u0155\t\6\2\2\u0155\u0156\t"+
		"\23\2\2\u0156\u0157\t\21\2\2\u0157(\3\2\2\2\u0158\u0159\t\16\2\2\u0159"+
		"\u015a\t\n\2\2\u015a\u015b\t\5\2\2\u015b\u015c\t\21\2\2\u015c\u015d\t"+
		"\n\2\2\u015d\u015e\t\22\2\2\u015e\u015f\t\23\2\2\u015f\u0160\t\21\2\2"+
		"\u0160*\3\2\2\2\u0161\u0162\t\b\2\2\u0162\u0163\t\6\2\2\u0163\u0164\t"+
		"\16\2\2\u0164\u0165\t\24\2\2\u0165\u0166\t\23\2\2\u0166\u0167\t\6\2\2"+
		"\u0167\u0168\t\16\2\2\u0168,\3\2\2\2\u0169\u016a\t\23\2\2\u016a\u016b"+
		"\t\r\2\2\u016b\u016c\t\22\2\2\u016c\u016d\t\5\2\2\u016d\u016e\t\21\2\2"+
		"\u016e\u016f\t\b\2\2\u016f\u0170\t\24\2\2\u0170\u0171\t\23\2\2\u0171\u0172"+
		"\t\21\2\2\u0172.\3\2\2\2\u0173\u0174\t\16\2\2\u0174\u0175\t\6\2\2\u0175"+
		"\u0176\t\5\2\2\u0176\u0177\t\23\2\2\u0177\u0178\t\b\2\2\u0178\u0179\t"+
		"\n\2\2\u0179\u017a\t\3\2\2\u017a\u017b\t\6\2\2\u017b\60\3\2\2\2\u017c"+
		"\u017d\t\4\2\2\u017d\u017e\t\5\2\2\u017e\u017f\t\25\2\2\u017f\62\3\2\2"+
		"\2\u0180\u0181\t\t\2\2\u0181\u0182\t\b\2\2\u0182\u0183\t\r\2\2\u0183\u0184"+
		"\t\f\2\2\u0184\64\3\2\2\2\u0185\u0186\t\22\2\2\u0186\u0187\t\4\2\2\u0187"+
		"\u0188\t\f\2\2\u0188\u0189\t\6\2\2\u0189\u018a\t\16\2\2\u018a\66\3\2\2"+
		"\2\u018b\u018c\t\26\2\2\u018c\u018d\t\27\2\2\u018d\u018e\t\6\2\2\u018e"+
		"\u018f\t\b\2\2\u018f\u0190\t\6\2\2\u01908\3\2\2\2\u0191\u0192\t\r\2\2"+
		"\u0192\u0193\t\b\2\2\u0193\u0194\t\16\2\2\u0194\u0195\t\6\2\2\u0195\u0196"+
		"\t\b\2\2\u0196:\3\2\2\2\u0197\u0198\t\30\2\2\u0198\u0199\t\b\2\2\u0199"+
		"\u019a\t\r\2\2\u019a\u019b\t\24\2\2\u019b\u019c\t\7\2\2\u019c<\3\2\2\2"+
		"\u019d\u019e\t\27\2\2\u019e\u019f\t\4\2\2\u019f\u01a0\t\31\2\2\u01a0\u01a1"+
		"\t\n\2\2\u01a1\u01a2\t\22\2\2\u01a2\u01a3\t\30\2\2\u01a3>\3\2\2\2\u01a4"+
		"\u01a5\t\3\2\2\u01a5\u01a6\t\17\2\2\u01a6@\3\2\2\2\u01a7\u01a8\t\4\2\2"+
		"\u01a8\u01a9\t\5\2\2\u01a9\u01aa\t\23\2\2\u01aaB\3\2\2\2\u01ab\u01ac\t"+
		"\16\2\2\u01ac\u01ad\t\6\2\2\u01ad\u01ae\t\5\2\2\u01ae\u01af\t\23\2\2\u01af"+
		"D\3\2\2\2\u01b0\u01b1\t\20\2\2\u01b1\u01b2\t\n\2\2\u01b2\u01b3\t\f\2\2"+
		"\u01b3\u01b4\t\n\2\2\u01b4\u01b5\t\21\2\2\u01b5F\3\2\2\2\u01b6\u01b7\t"+
		"\r\2\2\u01b7\u01b8\t\t\2\2\u01b8\u01b9\t\t\2\2\u01b9\u01ba\t\5\2\2\u01ba"+
		"\u01bb\t\6\2\2\u01bb\u01bc\t\21\2\2\u01bcH\3\2\2\2\u01bd\u01be\t\r\2\2"+
		"\u01be\u01bf\t\7\2\2\u01bf\u01c0\t\21\2\2\u01c0\u01c1\t\n\2\2\u01c1\u01c2"+
		"\t\r\2\2\u01c2\u01c3\t\22\2\2\u01c3\u01c4\t\4\2\2\u01c4\u01c5\t\20\2\2"+
		"\u01c5J\3\2\2\2\u01c6\u01c7\t\30\2\2\u01c7\u01c8\t\b\2\2\u01c8\u01c9\t"+
		"\4\2\2\u01c9\u01ca\t\7\2\2\u01ca\u01cb\t\27\2\2\u01cbL\3\2\2\2\u01cc\u01cd"+
		"\t\24\2\2\u01cd\u01ce\t\22\2\2\u01ce\u01cf\t\n\2\2\u01cf\u01d0\t\r\2\2"+
		"\u01d0\u01d1\t\22\2\2\u01d1N\3\2\2\2\u01d2\u01d3\t\t\2\2\u01d3\u01d4\t"+
		"\n\2\2\u01d4\u01d5\t\20\2\2\u01d5\u01d6\t\21\2\2\u01d6\u01d7\t\6\2\2\u01d7"+
		"\u01d8\t\b\2\2\u01d8P\3\2\2\2\u01d9\u01da\7c\2\2\u01daR\3\2\2\2\u01db"+
		"\u01dc\t\4\2\2\u01dc\u01dd\t\5\2\2\u01ddT\3\2\2\2\u01de\u01df\t\5\2\2"+
		"\u01df\u01e0\t\21\2\2\u01e0\u01e1\t\b\2\2\u01e1V\3\2\2\2\u01e2\u01e3\t"+
		"\20\2\2\u01e3\u01e4\t\4\2\2\u01e4\u01e5\t\22\2\2\u01e5\u01e6\t\30\2\2"+
		"\u01e6X\3\2\2\2\u01e7\u01e8\t\20\2\2\u01e8\u01e9\t\4\2\2\u01e9\u01ea\t"+
		"\22\2\2\u01ea\u01eb\t\30\2\2\u01eb\u01ec\t\f\2\2\u01ec\u01ed\t\4\2\2\u01ed"+
		"\u01ee\t\21\2\2\u01ee\u01ef\t\23\2\2\u01ef\u01f0\t\27\2\2\u01f0\u01f1"+
		"\t\6\2\2\u01f1\u01f2\t\5\2\2\u01f2Z\3\2\2\2\u01f3\u01f4\t\16\2\2\u01f4"+
		"\u01f5\t\4\2\2\u01f5\u01f6\t\21\2\2\u01f6\u01f7\t\4\2\2\u01f7\u01f8\t"+
		"\21\2\2\u01f8\u01f9\t\17\2\2\u01f9\u01fa\t\7\2\2\u01fa\u01fb\t\6\2\2\u01fb"+
		"\\\3\2\2\2\u01fc\u01fd\t\3\2\2\u01fd\u01fe\t\r\2\2\u01fe\u01ff\t\24\2"+
		"\2\u01ff\u0200\t\22\2\2\u0200\u0201\t\16\2\2\u0201^\3\2\2\2\u0202\u0203"+
		"\t\5\2\2\u0203\u0204\t\4\2\2\u0204\u0205\t\f\2\2\u0205\u0206\t\6\2\2\u0206"+
		"\u0207\t\21\2\2\u0207\u0208\t\6\2\2\u0208\u0209\t\b\2\2\u0209\u020a\t"+
		"\f\2\2\u020a`\3\2\2\2\u020b\u020c\t\n\2\2\u020c\u020d\t\5\2\2\u020d\u020e"+
		"\t\n\2\2\u020e\u020f\t\b\2\2\u020f\u0210\t\n\2\2\u0210b\3\2\2\2\u0211"+
		"\u0212\t\n\2\2\u0212\u0213\t\5\2\2\u0213\u0214\t\24\2\2\u0214\u0215\t"+
		"\b\2\2\u0215\u0216\t\n\2\2\u0216d\3\2\2\2\u0217\u0218\t\n\2\2\u0218\u0219"+
		"\t\5\2\2\u0219\u021a\t\3\2\2\u021a\u021b\t\20\2\2\u021b\u021c\t\4\2\2"+
		"\u021c\u021d\t\22\2\2\u021d\u021e\t\25\2\2\u021ef\3\2\2\2\u021f\u0220"+
		"\t\n\2\2\u0220\u0221\t\5\2\2\u0221\u0222\t\20\2\2\u0222\u0223\t\n\2\2"+
		"\u0223\u0224\t\21\2\2\u0224\u0225\t\6\2\2\u0225\u0226\t\b\2\2\u0226\u0227"+
		"\t\4\2\2\u0227\u0228\t\20\2\2\u0228h\3\2\2\2\u0229\u022a\t\b\2\2\u022a"+
		"\u022b\t\6\2\2\u022b\u022c\t\30\2\2\u022c\u022d\t\6\2\2\u022d\u022e\t"+
		"\13\2\2\u022ej\3\2\2\2\u022f\u0230\t\23\2\2\u0230\u0231\t\r\2\2\u0231"+
		"\u0232\t\24\2\2\u0232\u0233\t\22\2\2\u0233\u0234\t\21\2\2\u0234l\3\2\2"+
		"\2\u0235\u0236\t\5\2\2\u0236\u0237\t\24\2\2\u0237\u0238\t\f\2\2\u0238"+
		"n\3\2\2\2\u0239\u023a\t\f\2\2\u023a\u023b\t\n\2\2\u023b\u023c\t\22\2\2"+
		"\u023cp\3\2\2\2\u023d\u023e\t\f\2\2\u023e\u023f\t\4\2\2\u023f\u0240\t"+
		"\13\2\2\u0240r\3\2\2\2\u0241\u0242\t\4\2\2\u0242\u0243\t\31\2\2\u0243"+
		"\u0244\t\30\2\2\u0244t\3\2\2\2\u0245\u0246\t\21\2\2\u0246\u0247\t\b\2"+
		"\2\u0247\u0248\t\24\2\2\u0248\u0249\t\6\2\2\u0249v\3\2\2\2\u024a\u024b"+
		"\t\t\2\2\u024b\u024c\t\4\2\2\u024c\u024d\t\20\2\2\u024d\u024e\t\5\2\2"+
		"\u024e\u024f\t\6\2\2\u024fx\3\2\2\2\u0250\u0251\t\n\2\2\u0251\u0252\t"+
		"\t\2\2\u0252z\3\2\2\2\u0253\u0254\t\23\2\2\u0254\u0255\t\r\2\2\u0255\u0256"+
		"\t\4\2\2\u0256\u0257\t\20\2\2\u0257\u0258\t\6\2\2\u0258\u0259\t\5\2\2"+
		"\u0259\u025a\t\23\2\2\u025a\u025b\t\6\2\2\u025b|\3\2\2\2\u025c\u0260\5"+
		"\u00dbn\2\u025d\u025f\n\32\2\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2\2\2"+
		"\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u0260"+
		"\3\2\2\2\u0263\u0264\5\u00ddo\2\u0264~\3\2\2\2\u0265\u0267\5\u00b7\\\2"+
		"\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269"+
		"\7<\2\2\u0269\u0080\3\2\2\2\u026a\u026b\5\177@\2\u026b\u026c\5\u00b9]"+
		"\2\u026c\u0082\3\2\2\2\u026d\u026e\7A\2\2\u026e\u026f\5\u00b3Z\2\u026f"+
		"\u0084\3\2\2\2\u0270\u0271\5\u00b3Z\2\u0271\u0086\3\2\2\2\u0272\u0275"+
		"\7B\2\2\u0273\u0274\4c|\2\u0274\u0276\4C\\\2\u0275\u0273\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0283\3\2"+
		"\2\2\u0279\u027d\5\u00cfh\2\u027a\u027b\4c|\2\u027b\u027c\4C\\\2\u027c"+
		"\u027e\4\62;\2\u027d\u027a\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u027d\3\2"+
		"\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u0279\3\2\2\2\u0282"+
		"\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0088\3\2"+
		"\2\2\u0285\u0283\3\2\2\2\u0286\u0288\t\2\2\2\u0287\u0286\3\2\2\2\u0288"+
		"\u0289\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u008a\3\2"+
		"\2\2\u028b\u028d\4\62;\2\u028c\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0294\5\u00cb"+
		"f\2\u0291\u0293\4\62;\2\u0292\u0291\3\2\2\2\u0293\u0296\3\2\2\2\u0294"+
		"\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u029e\3\2\2\2\u0296\u0294\3\2"+
		"\2\2\u0297\u0299\5\u00cbf\2\u0298\u029a\4\62;\2\u0299\u0298\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2"+
		"\2\2\u029d\u028c\3\2\2\2\u029d\u0297\3\2\2\2\u029e\u008c\3\2\2\2\u029f"+
		"\u02a1\5\u008fH\2\u02a0\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a0"+
		"\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a8\5\u00cbf"+
		"\2\u02a5\u02a7\5\u008fH\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a8\3\2"+
		"\2\2\u02ab\u02ac\5\u009dO\2\u02ac\u02bd\3\2\2\2\u02ad\u02af\5\u00cbf\2"+
		"\u02ae\u02b0\5\u008fH\2\u02af\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\5\u009d"+
		"O\2\u02b4\u02bd\3\2\2\2\u02b5\u02b7\5\u008fH\2\u02b6\u02b5\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2"+
		"\2\2\u02ba\u02bb\5\u009dO\2\u02bb\u02bd\3\2\2\2\u02bc\u02a0\3\2\2\2\u02bc"+
		"\u02ad\3\2\2\2\u02bc\u02b6\3\2\2\2\u02bd\u008e\3\2\2\2\u02be\u02bf\4\62"+
		";\2\u02bf\u0090\3\2\2\2\u02c0\u02c1\5\u00cdg\2\u02c1\u02c2\5\u0089E\2"+
		"\u02c2\u0092\3\2\2\2\u02c3\u02c4\5\u00cdg\2\u02c4\u02c5\5\u008bF\2\u02c5"+
		"\u0094\3\2\2\2\u02c6\u02c7\5\u00cdg\2\u02c7\u02c8\5\u008dG\2\u02c8\u0096"+
		"\3\2\2\2\u02c9\u02ca\5\u00cfh\2\u02ca\u02cb\5\u0089E\2\u02cb\u0098\3\2"+
		"\2\2\u02cc\u02cd\5\u00cfh\2\u02cd\u02ce\5\u008bF\2\u02ce\u009a\3\2\2\2"+
		"\u02cf\u02d0\5\u00cfh\2\u02d0\u02d1\5\u008dG\2\u02d1\u009c\3\2\2\2\u02d2"+
		"\u02d5\t\6\2\2\u02d3\u02d6\5\u00cdg\2\u02d4\u02d6\5\u00cfh\2\u02d5\u02d3"+
		"\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7"+
		"\u02d9\4\62;\2\u02d8\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02d8\3\2"+
		"\2\2\u02da\u02db\3\2\2\2\u02db\u009e\3\2\2\2\u02dc\u02e1\7)\2\2\u02dd"+
		"\u02e0\n\33\2\2\u02de\u02e0\5\u00a7T\2\u02df\u02dd\3\2\2\2\u02df\u02de"+
		"\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2"+
		"\u02e4\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02e5\7)\2\2\u02e5\u00a0\3\2"+
		"\2\2\u02e6\u02eb\7$\2\2\u02e7\u02ea\n\34\2\2\u02e8\u02ea\5\u00a7T\2\u02e9"+
		"\u02e7\3\2\2\2\u02e9\u02e8\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2"+
		"\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee"+
		"\u02ef\7$\2\2\u02ef\u00a2\3\2\2\2\u02f0\u02f1\7)\2\2\u02f1\u02f2\7)\2"+
		"\2\u02f2\u02f3\7)\2\2\u02f3\u02ff\3\2\2\2\u02f4\u02f8\7)\2\2\u02f5\u02f6"+
		"\7)\2\2\u02f6\u02f8\7)\2\2\u02f7\u02f4\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02fc\n\35\2\2\u02fa\u02fc\5"+
		"\u00a7T\2\u02fb\u02f9\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fc\u02fe\3\2\2\2"+
		"\u02fd\u02f7\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300"+
		"\3\2\2\2\u0300\u0302\3\2\2\2\u0301\u02ff\3\2\2\2\u0302\u0303\7)\2\2\u0303"+
		"\u0304\7)\2\2\u0304\u0305\7)\2\2\u0305\u00a4\3\2\2\2\u0306\u0307\7$\2"+
		"\2\u0307\u0308\7$\2\2\u0308\u0309\7$\2\2\u0309\u0315\3\2\2\2\u030a\u030e"+
		"\7$\2\2\u030b\u030c\7$\2\2\u030c\u030e\7$\2\2\u030d\u030a\3\2\2\2\u030d"+
		"\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u0312\n\36"+
		"\2\2\u0310\u0312\5\u00a7T\2\u0311\u030f\3\2\2\2\u0311\u0310\3\2\2\2\u0312"+
		"\u0314\3\2\2\2\u0313\u030d\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2"+
		"\2\2\u0315\u0316\3\2\2\2\u0316\u0318\3\2\2\2\u0317\u0315\3\2\2\2\u0318"+
		"\u0319\7$\2\2\u0319\u031a\7$\2\2\u031a\u031b\7$\2\2\u031b\u00a6\3\2\2"+
		"\2\u031c\u031d\7^\2\2\u031d\u031e\t\37\2\2\u031e\u00a8\3\2\2\2\u031f\u0322"+
		"\t \2\2\u0320\u0322\5\u00c3b\2\u0321\u031f\3\2\2\2\u0321\u0320\3\2\2\2"+
		"\u0322\u0323\3\2\2\2\u0323\u0324\bU\2\2\u0324\u00aa\3\2\2\2\u0325\u0328"+
		"\t \2\2\u0326\u0328\5\u00c3b\2\u0327\u0325\3\2\2\2\u0327\u0326\3\2\2\2"+
		"\u0328\u0329\3\2\2\2\u0329\u032a\bV\2\2\u032a\u00ac\3\2\2\2\u032b\u032f"+
		"\5\u00e9u\2\u032c\u032e\5\u00abV\2\u032d\u032c\3\2\2\2\u032e\u0331\3\2"+
		"\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0332\3\2\2\2\u0331"+
		"\u032f\3\2\2\2\u0332\u0333\5\u00ebv\2\u0333\u00ae\3\2\2\2\u0334\u0335"+
		"\t!\2\2\u0335\u00b0\3\2\2\2\u0336\u0339\5\u00afX\2\u0337\u0339\7a\2\2"+
		"\u0338\u0336\3\2\2\2\u0338\u0337\3\2\2\2\u0339\u00b2\3\2\2\2\u033a\u033c"+
		"\7/\2\2\u033b\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033d"+
		"\u033e\3\2\2\2\u033e\u0342\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0343\5\u00b1"+
		"Y\2\u0341\u0343\4\62;\2\u0342\u0340\3\2\2\2\u0342\u0341\3\2\2\2\u0343"+
		"\u0348\3\2\2\2\u0344\u0347\5\u00b1Y\2\u0345\u0347\t\"\2\2\u0346\u0344"+
		"\3\2\2\2\u0346\u0345\3\2\2\2\u0347\u034a\3\2\2\2\u0348\u0346\3\2\2\2\u0348"+
		"\u0349\3\2\2\2\u0349\u00b4\3\2\2\2\u034a\u0348\3\2\2\2\u034b\u034f\5\u00b1"+
		"Y\2\u034c\u034f\5\u00cfh\2\u034d\u034f\t#\2\2\u034e\u034b\3\2\2\2\u034e"+
		"\u034c\3\2\2\2\u034e\u034d\3\2\2\2\u034f\u00b6\3\2\2\2\u0350\u0359\5\u00af"+
		"X\2\u0351\u0354\5\u00b5[\2\u0352\u0354\5\u00cbf\2\u0353\u0351\3\2\2\2"+
		"\u0353\u0352\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356"+
		"\3\2\2\2\u0356\u0358\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u035a\5\u00b5["+
		"\2\u0359\u0355\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u00b8\3\2\2\2\u035b\u035e"+
		"\5\u00b1Y\2\u035c\u035e\4\62;\2\u035d\u035b\3\2\2\2\u035d\u035c\3\2\2"+
		"\2\u035e\u0367\3\2\2\2\u035f\u0362\5\u00b5[\2\u0360\u0362\5\u00cbf\2\u0361"+
		"\u035f\3\2\2\2\u0361\u0360\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0361\3\2"+
		"\2\2\u0363\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u0363\3\2\2\2\u0366"+
		"\u0368\5\u00b5[\2\u0367\u0363\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u00ba"+
		"\3\2\2\2\u0369\u036a\7a\2\2\u036a\u036b\7<\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u036d\5\u00b9]\2\u036d\u00bc\3\2\2\2\u036e\u036f\7`\2\2\u036f\u0370\7"+
		"`\2\2\u0370\u00be\3\2\2\2\u0371\u0372\7(\2\2\u0372\u0373\7(\2\2\u0373"+
		"\u00c0\3\2\2\2\u0374\u0375\7~\2\2\u0375\u0376\7~\2\2\u0376\u00c2\3\2\2"+
		"\2\u0377\u0378\t$\2\2\u0378\u00c4\3\2\2\2\u0379\u037a\7}\2\2\u037a\u00c6"+
		"\3\2\2\2\u037b\u037c\7\177\2\2\u037c\u00c8\3\2\2\2\u037d\u037e\7=\2\2"+
		"\u037e\u00ca\3\2\2\2\u037f\u0380\7\60\2\2\u0380\u00cc\3\2\2\2\u0381\u0382"+
		"\7-\2\2\u0382\u00ce\3\2\2\2\u0383\u0384\7/\2\2\u0384\u00d0\3\2\2\2\u0385"+
		"\u0386\7,\2\2\u0386\u00d2\3\2\2\2\u0387\u0388\7.\2\2\u0388\u00d4\3\2\2"+
		"\2\u0389\u038a\7#\2\2\u038a\u00d6\3\2\2\2\u038b\u038c\7\61\2\2\u038c\u00d8"+
		"\3\2\2\2\u038d\u038e\7?\2\2\u038e\u00da\3\2\2\2\u038f\u0390\7>\2\2\u0390"+
		"\u00dc\3\2\2\2\u0391\u0392\7@\2\2\u0392\u00de\3\2\2\2\u0393\u0394\7*\2"+
		"\2\u0394\u00e0\3\2\2\2\u0395\u0396\7+\2\2\u0396\u00e2\3\2\2\2\u0397\u0398"+
		"\7>\2\2\u0398\u0399\7?\2\2\u0399\u00e4\3\2\2\2\u039a\u039b\7@\2\2\u039b"+
		"\u039c\7?\2\2\u039c\u00e6\3\2\2\2\u039d\u039e\7#\2\2\u039e\u039f\7?\2"+
		"\2\u039f\u00e8\3\2\2\2\u03a0\u03a1\7]\2\2\u03a1\u00ea\3\2\2\2\u03a2\u03a3"+
		"\7_\2\2\u03a3\u00ec\3\2\2\2/\2\u00f4\u0260\u0266\u0277\u027f\u0283\u0289"+
		"\u028e\u0294\u029b\u029d\u02a2\u02a8\u02b1\u02b8\u02bc\u02d5\u02da\u02df"+
		"\u02e1\u02e9\u02eb\u02f7\u02fb\u02ff\u030d\u0311\u0315\u0321\u0327\u032f"+
		"\u0338\u033d\u0342\u0346\u0348\u034e\u0353\u0355\u0359\u035d\u0361\u0363"+
		"\u0367\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}