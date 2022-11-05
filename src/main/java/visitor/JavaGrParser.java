// Generated from /Users/bartosz/IdeaProjects/TinyGP/src/main/java/antlr/JavaGr.g4 by ANTLR 4.10.1
package visitor;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaGrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING_VAL=1, CHAR_VAL=2, INT_VAL=3, FLOAT_VAL=4, DOUBLE_VAL=5, DO_=6, 
		FLOAT=7, INT=8, DOUBLE=9, STRING=10, CHAR=11, BOOL=12, PUBLIC=13, CLASS=14, 
		TRUE=15, FALSE=16, EQUAL=17, NOT_EQUAL=18, GREATER=19, LESS=20, GREATER_EQUAL=21, 
		LESS_EQUAL=22, BRACKET_L=23, BRACKET_R=24, SQ_BRACKET_L=25, SQ_BRACKET_R=26, 
		PARENT_L=27, PARENT_R=28, ADD_=29, SUBTRACT_=30, MULTIPLY=31, DIVIDE=32, 
		MODULO=33, COMMENT=34, IF=35, ELSE=36, FOR=37, WHILE=38, SEMICOLON=39, 
		COMMA=40, IMPORT=41, PACKAGE=42, RETURN=43, PRIVATE_NEW_VAR=44, PROTECTED_NEW_VAR=45, 
		STATIC_VAR=46, OR=47, AND=48, VOID=49, IDENTIFIER=50, WS=51, BUFFERED_READER=52, 
		SOUT_L=53, NEW=54, INPUT_READER=55, SYS_IN=56;
	public static final int
		RULE_prog = 0, RULE_numeric_type = 1, RULE_text_type = 2, RULE_datatype = 3, 
		RULE_bool_val = 4, RULE_num_val = 5, RULE_input_vars = 6, RULE_function_in = 7, 
		RULE_input_vars_2 = 8, RULE_function_in_2 = 9, RULE_function_to_ret = 10, 
		RULE_return_statement = 11, RULE_elif_statement = 12, RULE_instruction = 13, 
		RULE_instruction_general = 14, RULE_function_body = 15, RULE_function = 16, 
		RULE_math_symbol = 17, RULE_add_equals = 18, RULE_subtract_equals = 19, 
		RULE_multiply_equals = 20, RULE_divide_equals = 21, RULE_modulo_equals = 22, 
		RULE_math_modification = 23, RULE_math_expr = 24, RULE_comma_identifier = 25, 
		RULE_declaration = 26, RULE_assignment = 27, RULE_add_double = 28, RULE_equal_double = 29, 
		RULE_subtract_double = 30, RULE_modification = 31, RULE_comparator = 32, 
		RULE_comparison = 33, RULE_logic_statement = 34, RULE_logic_operator = 35, 
		RULE_logic_condition = 36, RULE_if_statement = 37, RULE_while_loop = 38, 
		RULE_do_while_loop = 39, RULE_for_loop = 40, RULE_sout = 41, RULE_sin = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "numeric_type", "text_type", "datatype", "bool_val", "num_val", 
			"input_vars", "function_in", "input_vars_2", "function_in_2", "function_to_ret", 
			"return_statement", "elif_statement", "instruction", "instruction_general", 
			"function_body", "function", "math_symbol", "add_equals", "subtract_equals", 
			"multiply_equals", "divide_equals", "modulo_equals", "math_modification", 
			"math_expr", "comma_identifier", "declaration", "assignment", "add_double", 
			"equal_double", "subtract_double", "modification", "comparator", "comparison", 
			"logic_statement", "logic_operator", "logic_condition", "if_statement", 
			"while_loop", "do_while_loop", "for_loop", "sout", "sin"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'do'", "'float'", "'int'", "'double'", 
			"'string'", "'char'", "'boolean'", "'public'", "'class'", "'true'", "'false'", 
			"'='", "'!='", "'>'", "'<'", "'>='", "'<='", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", null, "'if'", "'else'", 
			"'for'", "'while'", "';'", "','", "'import'", "'package'", "'return'", 
			"'private'", "'protected'", "'static'", "'||'", "'&&'", "'void'", null, 
			null, "'BufferedReader'", "'System.out.print'", "'new'", "'InputStreamReader'", 
			"'System.in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING_VAL", "CHAR_VAL", "INT_VAL", "FLOAT_VAL", "DOUBLE_VAL", 
			"DO_", "FLOAT", "INT", "DOUBLE", "STRING", "CHAR", "BOOL", "PUBLIC", 
			"CLASS", "TRUE", "FALSE", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "GREATER_EQUAL", 
			"LESS_EQUAL", "BRACKET_L", "BRACKET_R", "SQ_BRACKET_L", "SQ_BRACKET_R", 
			"PARENT_L", "PARENT_R", "ADD_", "SUBTRACT_", "MULTIPLY", "DIVIDE", "MODULO", 
			"COMMENT", "IF", "ELSE", "FOR", "WHILE", "SEMICOLON", "COMMA", "IMPORT", 
			"PACKAGE", "RETURN", "PRIVATE_NEW_VAR", "PROTECTED_NEW_VAR", "STATIC_VAR", 
			"OR", "AND", "VOID", "IDENTIFIER", "WS", "BUFFERED_READER", "SOUT_L", 
			"NEW", "INPUT_READER", "SYS_IN"
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
	public String getGrammarFileName() { return "JavaGr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaGrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			function();
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

	public static class Numeric_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaGrParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(JavaGrParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaGrParser.DOUBLE, 0); }
		public Numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitNumeric_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_typeContext numeric_type() throws RecognitionException {
		Numeric_typeContext _localctx = new Numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_numeric_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << DOUBLE))) != 0)) ) {
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

	public static class Text_typeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(JavaGrParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(JavaGrParser.STRING, 0); }
		public Text_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitText_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_typeContext text_type() throws RecognitionException {
		Text_typeContext _localctx = new Text_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_text_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==CHAR) ) {
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

	public static class DatatypeContext extends ParserRuleContext {
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public Text_typeContext text_type() {
			return getRuleContext(Text_typeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(JavaGrParser.BOOL, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_datatype);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				numeric_type();
				}
				break;
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				text_type();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(BOOL);
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

	public static class Bool_valContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(JavaGrParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JavaGrParser.FALSE, 0); }
		public Bool_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_val; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitBool_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_valContext bool_val() throws RecognitionException {
		Bool_valContext _localctx = new Bool_valContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bool_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class Num_valContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(JavaGrParser.INT_VAL, 0); }
		public TerminalNode ADD_() { return getToken(JavaGrParser.ADD_, 0); }
		public TerminalNode SUBTRACT_() { return getToken(JavaGrParser.SUBTRACT_, 0); }
		public TerminalNode DOUBLE_VAL() { return getToken(JavaGrParser.DOUBLE_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(JavaGrParser.FLOAT_VAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public Num_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_val; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitNum_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_valContext num_val() throws RecognitionException {
		Num_valContext _localctx = new Num_valContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_num_val);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD_ || _la==SUBTRACT_) {
					{
					setState(99);
					_la = _input.LA(1);
					if ( !(_la==ADD_ || _la==SUBTRACT_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(102);
				match(INT_VAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD_ || _la==SUBTRACT_) {
					{
					setState(103);
					_la = _input.LA(1);
					if ( !(_la==ADD_ || _la==SUBTRACT_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(106);
				match(DOUBLE_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD_ || _la==SUBTRACT_) {
					{
					setState(107);
					_la = _input.LA(1);
					if ( !(_la==ADD_ || _la==SUBTRACT_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(110);
				match(FLOAT_VAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD_ || _la==SUBTRACT_) {
					{
					setState(111);
					_la = _input.LA(1);
					if ( !(_la==ADD_ || _la==SUBTRACT_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(114);
				match(IDENTIFIER);
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

	public static class Input_varsContext extends ParserRuleContext {
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaGrParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaGrParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaGrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaGrParser.COMMA, i);
		}
		public Input_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_vars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitInput_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_varsContext input_vars() throws RecognitionException {
		Input_varsContext _localctx = new Input_varsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_input_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			datatype();
			setState(118);
			match(IDENTIFIER);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(119);
				match(COMMA);
				setState(120);
				datatype();
				setState(121);
				match(IDENTIFIER);
				}
				}
				setState(127);
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

	public static class Function_inContext extends ParserRuleContext {
		public TerminalNode BRACKET_L() { return getToken(JavaGrParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(JavaGrParser.BRACKET_R, 0); }
		public Input_varsContext input_vars() {
			return getRuleContext(Input_varsContext.class,0);
		}
		public Function_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_in; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitFunction_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_inContext function_in() throws RecognitionException {
		Function_inContext _localctx = new Function_inContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(BRACKET_L);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(129);
				input_vars();
				}
			}

			setState(132);
			match(BRACKET_R);
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

	public static class Input_vars_2Context extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaGrParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaGrParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaGrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaGrParser.COMMA, i);
		}
		public Input_vars_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_vars_2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitInput_vars_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_vars_2Context input_vars_2() throws RecognitionException {
		Input_vars_2Context _localctx = new Input_vars_2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_input_vars_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(IDENTIFIER);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(135);
				match(COMMA);
				setState(136);
				match(IDENTIFIER);
				}
				}
				setState(141);
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

	public static class Function_in_2Context extends ParserRuleContext {
		public TerminalNode BRACKET_L() { return getToken(JavaGrParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(JavaGrParser.BRACKET_R, 0); }
		public Input_vars_2Context input_vars_2() {
			return getRuleContext(Input_vars_2Context.class,0);
		}
		public Function_in_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_in_2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitFunction_in_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_in_2Context function_in_2() throws RecognitionException {
		Function_in_2Context _localctx = new Function_in_2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_in_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(BRACKET_L);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(143);
				input_vars_2();
				}
			}

			setState(146);
			match(BRACKET_R);
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

	public static class Function_to_retContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public Function_in_2Context function_in_2() {
			return getRuleContext(Function_in_2Context.class,0);
		}
		public Function_to_retContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_to_ret; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitFunction_to_ret(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_to_retContext function_to_ret() throws RecognitionException {
		Function_to_retContext _localctx = new Function_to_retContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_to_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(IDENTIFIER);
			setState(149);
			function_in_2();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaGrParser.RETURN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public Bool_valContext bool_val() {
			return getRuleContext(Bool_valContext.class,0);
		}
		public TerminalNode CHAR_VAL() { return getToken(JavaGrParser.CHAR_VAL, 0); }
		public TerminalNode STRING_VAL() { return getToken(JavaGrParser.STRING_VAL, 0); }
		public Function_to_retContext function_to_ret() {
			return getRuleContext(Function_to_retContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(RETURN);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(152);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(153);
				math_expr(0);
				}
				break;
			case 3:
				{
				setState(154);
				bool_val();
				}
				break;
			case 4:
				{
				setState(155);
				match(CHAR_VAL);
				}
				break;
			case 5:
				{
				setState(156);
				match(STRING_VAL);
				}
				break;
			case 6:
				{
				setState(157);
				function_to_ret();
				}
				break;
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

	public static class Elif_statementContext extends ParserRuleContext {
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(JavaGrParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(JavaGrParser.ELSE, i);
		}
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitElif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elif_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			if_statement();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(161);
				match(ELSE);
				setState(162);
				if_statement();
				}
				}
				setState(167);
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

	public static class InstructionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaGrParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ModificationContext modification() {
			return getRuleContext(ModificationContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Elif_statementContext elif_statement() {
			return getRuleContext(Elif_statementContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Do_while_loopContext do_while_loop() {
			return getRuleContext(Do_while_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public SinContext sin() {
			return getRuleContext(SinContext.class,0);
		}
		public SoutContext sout() {
			return getRuleContext(SoutContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instruction);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				declaration();
				setState(169);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				assignment();
				setState(172);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				modification();
				setState(175);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				elif_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				while_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(180);
				do_while_loop();
				setState(181);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				for_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
				sin();
				setState(185);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(187);
				sout();
				setState(188);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(190);
				return_statement();
				setState(191);
				match(SEMICOLON);
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

	public static class Instruction_generalContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(JavaGrParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(JavaGrParser.COMMENT, i);
		}
		public Instruction_generalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_general; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitInstruction_general(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruction_generalContext instruction_general() throws RecognitionException {
		Instruction_generalContext _localctx = new Instruction_generalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instruction_general);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DO_) | (1L << FLOAT) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOL) | (1L << COMMENT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << IDENTIFIER) | (1L << BUFFERED_READER) | (1L << SOUT_L))) != 0)) {
				{
				setState(197);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DO_:
				case FLOAT:
				case INT:
				case DOUBLE:
				case STRING:
				case CHAR:
				case BOOL:
				case IF:
				case FOR:
				case WHILE:
				case RETURN:
				case IDENTIFIER:
				case BUFFERED_READER:
				case SOUT_L:
					{
					setState(195);
					instruction();
					}
					break;
				case COMMENT:
					{
					setState(196);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(201);
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

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode PARENT_L() { return getToken(JavaGrParser.PARENT_L, 0); }
		public Instruction_generalContext instruction_general() {
			return getRuleContext(Instruction_generalContext.class,0);
		}
		public TerminalNode PARENT_R() { return getToken(JavaGrParser.PARENT_R, 0); }
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(PARENT_L);
			setState(203);
			instruction_general();
			setState(204);
			match(PARENT_R);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public Function_inContext function_in() {
			return getRuleContext(Function_inContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaGrParser.VOID, 0); }
		public TerminalNode STATIC_VAR() { return getToken(JavaGrParser.STATIC_VAR, 0); }
		public TerminalNode PUBLIC() { return getToken(JavaGrParser.PUBLIC, 0); }
		public TerminalNode PRIVATE_NEW_VAR() { return getToken(JavaGrParser.PRIVATE_NEW_VAR, 0); }
		public TerminalNode PROTECTED_NEW_VAR() { return getToken(JavaGrParser.PROTECTED_NEW_VAR, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE_NEW_VAR) | (1L << PROTECTED_NEW_VAR))) != 0)) {
				{
				setState(206);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE_NEW_VAR) | (1L << PROTECTED_NEW_VAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC_VAR) {
				{
				setState(209);
				match(STATIC_VAR);
				}
			}

			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case DOUBLE:
			case STRING:
			case CHAR:
			case BOOL:
				{
				setState(212);
				datatype();
				}
				break;
			case VOID:
				{
				setState(213);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(216);
			match(IDENTIFIER);
			setState(217);
			function_in();
			setState(218);
			function_body();
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

	public static class Math_symbolContext extends ParserRuleContext {
		public TerminalNode ADD_() { return getToken(JavaGrParser.ADD_, 0); }
		public TerminalNode SUBTRACT_() { return getToken(JavaGrParser.SUBTRACT_, 0); }
		public TerminalNode MULTIPLY() { return getToken(JavaGrParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(JavaGrParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(JavaGrParser.MODULO, 0); }
		public Math_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_symbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitMath_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_symbolContext math_symbol() throws RecognitionException {
		Math_symbolContext _localctx = new Math_symbolContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_math_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_) | (1L << SUBTRACT_) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
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

	public static class Add_equalsContext extends ParserRuleContext {
		public TerminalNode ADD_() { return getToken(JavaGrParser.ADD_, 0); }
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public Add_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_equals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitAdd_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_equalsContext add_equals() throws RecognitionException {
		Add_equalsContext _localctx = new Add_equalsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_add_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ADD_);
			setState(223);
			match(EQUAL);
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

	public static class Subtract_equalsContext extends ParserRuleContext {
		public TerminalNode SUBTRACT_() { return getToken(JavaGrParser.SUBTRACT_, 0); }
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public Subtract_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtract_equals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitSubtract_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subtract_equalsContext subtract_equals() throws RecognitionException {
		Subtract_equalsContext _localctx = new Subtract_equalsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_subtract_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(SUBTRACT_);
			setState(226);
			match(EQUAL);
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

	public static class Multiply_equalsContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(JavaGrParser.MULTIPLY, 0); }
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public Multiply_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_equals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitMultiply_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiply_equalsContext multiply_equals() throws RecognitionException {
		Multiply_equalsContext _localctx = new Multiply_equalsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiply_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(MULTIPLY);
			setState(229);
			match(EQUAL);
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

	public static class Divide_equalsContext extends ParserRuleContext {
		public TerminalNode DIVIDE() { return getToken(JavaGrParser.DIVIDE, 0); }
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public Divide_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide_equals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitDivide_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Divide_equalsContext divide_equals() throws RecognitionException {
		Divide_equalsContext _localctx = new Divide_equalsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_divide_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(DIVIDE);
			setState(232);
			match(EQUAL);
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

	public static class Modulo_equalsContext extends ParserRuleContext {
		public TerminalNode MODULO() { return getToken(JavaGrParser.MODULO, 0); }
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public Modulo_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo_equals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitModulo_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modulo_equalsContext modulo_equals() throws RecognitionException {
		Modulo_equalsContext _localctx = new Modulo_equalsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modulo_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(MODULO);
			setState(235);
			match(EQUAL);
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

	public static class Math_modificationContext extends ParserRuleContext {
		public Add_equalsContext add_equals() {
			return getRuleContext(Add_equalsContext.class,0);
		}
		public Subtract_equalsContext subtract_equals() {
			return getRuleContext(Subtract_equalsContext.class,0);
		}
		public Multiply_equalsContext multiply_equals() {
			return getRuleContext(Multiply_equalsContext.class,0);
		}
		public Divide_equalsContext divide_equals() {
			return getRuleContext(Divide_equalsContext.class,0);
		}
		public Modulo_equalsContext modulo_equals() {
			return getRuleContext(Modulo_equalsContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public Math_modificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_modification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitMath_modification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_modificationContext math_modification() throws RecognitionException {
		Math_modificationContext _localctx = new Math_modificationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_math_modification);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD_:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				add_equals();
				}
				break;
			case SUBTRACT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				subtract_equals();
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				multiply_equals();
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				divide_equals();
				}
				break;
			case MODULO:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				modulo_equals();
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				match(EQUAL);
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

	public static class Math_exprContext extends ParserRuleContext {
		public TerminalNode BRACKET_L() { return getToken(JavaGrParser.BRACKET_L, 0); }
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public TerminalNode BRACKET_R() { return getToken(JavaGrParser.BRACKET_R, 0); }
		public Num_valContext num_val() {
			return getRuleContext(Num_valContext.class,0);
		}
		public Math_symbolContext math_symbol() {
			return getRuleContext(Math_symbolContext.class,0);
		}
		public Math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitMath_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_exprContext math_expr() throws RecognitionException {
		return math_expr(0);
	}

	private Math_exprContext math_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_exprContext _localctx = new Math_exprContext(_ctx, _parentState);
		Math_exprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_math_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACKET_L:
				{
				setState(246);
				match(BRACKET_L);
				setState(247);
				math_expr(0);
				setState(248);
				match(BRACKET_R);
				}
				break;
			case INT_VAL:
			case FLOAT_VAL:
			case DOUBLE_VAL:
			case ADD_:
			case SUBTRACT_:
			case IDENTIFIER:
				{
				setState(250);
				num_val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Math_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
					setState(253);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(254);
					math_symbol();
					setState(255);
					math_expr(4);
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Comma_identifierContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(JavaGrParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public Comma_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitComma_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_identifierContext comma_identifier() throws RecognitionException {
		Comma_identifierContext _localctx = new Comma_identifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comma_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(COMMA);
			setState(263);
			match(IDENTIFIER);
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
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public List<Comma_identifierContext> comma_identifier() {
			return getRuleContexts(Comma_identifierContext.class);
		}
		public Comma_identifierContext comma_identifier(int i) {
			return getRuleContext(Comma_identifierContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			datatype();
			setState(266);
			match(IDENTIFIER);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(267);
				comma_identifier();
				}
				}
				setState(272);
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

	public static class AssignmentContext extends ParserRuleContext {
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(JavaGrParser.CHAR, 0); }
		public TerminalNode CHAR_VAL() { return getToken(JavaGrParser.CHAR_VAL, 0); }
		public TerminalNode STRING() { return getToken(JavaGrParser.STRING, 0); }
		public TerminalNode STRING_VAL() { return getToken(JavaGrParser.STRING_VAL, 0); }
		public TerminalNode BOOL() { return getToken(JavaGrParser.BOOL, 0); }
		public Bool_valContext bool_val() {
			return getRuleContext(Bool_valContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignment);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				numeric_type();
				setState(274);
				match(IDENTIFIER);
				setState(275);
				match(EQUAL);
				setState(276);
				math_expr(0);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(CHAR);
				setState(279);
				match(IDENTIFIER);
				setState(280);
				match(EQUAL);
				setState(281);
				match(CHAR_VAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(STRING);
				setState(283);
				match(IDENTIFIER);
				setState(284);
				match(EQUAL);
				setState(285);
				match(STRING_VAL);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				match(BOOL);
				setState(287);
				match(IDENTIFIER);
				setState(288);
				match(EQUAL);
				setState(289);
				bool_val();
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

	public static class Add_doubleContext extends ParserRuleContext {
		public List<TerminalNode> ADD_() { return getTokens(JavaGrParser.ADD_); }
		public TerminalNode ADD_(int i) {
			return getToken(JavaGrParser.ADD_, i);
		}
		public Add_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_double; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitAdd_double(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_doubleContext add_double() throws RecognitionException {
		Add_doubleContext _localctx = new Add_doubleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_add_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(ADD_);
			setState(293);
			match(ADD_);
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

	public static class Equal_doubleContext extends ParserRuleContext {
		public List<TerminalNode> EQUAL() { return getTokens(JavaGrParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(JavaGrParser.EQUAL, i);
		}
		public Equal_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_double; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitEqual_double(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equal_doubleContext equal_double() throws RecognitionException {
		Equal_doubleContext _localctx = new Equal_doubleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_equal_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(EQUAL);
			setState(296);
			match(EQUAL);
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

	public static class Subtract_doubleContext extends ParserRuleContext {
		public List<TerminalNode> SUBTRACT_() { return getTokens(JavaGrParser.SUBTRACT_); }
		public TerminalNode SUBTRACT_(int i) {
			return getToken(JavaGrParser.SUBTRACT_, i);
		}
		public Subtract_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtract_double; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitSubtract_double(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subtract_doubleContext subtract_double() throws RecognitionException {
		Subtract_doubleContext _localctx = new Subtract_doubleContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_subtract_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(SUBTRACT_);
			setState(299);
			match(SUBTRACT_);
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

	public static class ModificationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public Math_modificationContext math_modification() {
			return getRuleContext(Math_modificationContext.class,0);
		}
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public Add_doubleContext add_double() {
			return getRuleContext(Add_doubleContext.class,0);
		}
		public Subtract_doubleContext subtract_double() {
			return getRuleContext(Subtract_doubleContext.class,0);
		}
		public ModificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitModification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModificationContext modification() throws RecognitionException {
		ModificationContext _localctx = new ModificationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_modification);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(IDENTIFIER);
				setState(302);
				math_modification();
				setState(303);
				math_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(IDENTIFIER);
				setState(306);
				add_double();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(IDENTIFIER);
				setState(308);
				subtract_double();
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

	public static class ComparatorContext extends ParserRuleContext {
		public Equal_doubleContext equal_double() {
			return getRuleContext(Equal_doubleContext.class,0);
		}
		public TerminalNode NOT_EQUAL() { return getToken(JavaGrParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(JavaGrParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(JavaGrParser.LESS, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(JavaGrParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(JavaGrParser.LESS_EQUAL, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_comparator);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				equal_double();
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(NOT_EQUAL);
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(GREATER);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				match(LESS);
				}
				break;
			case GREATER_EQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
				match(GREATER_EQUAL);
				}
				break;
			case LESS_EQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(316);
				match(LESS_EQUAL);
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<Num_valContext> num_val() {
			return getRuleContexts(Num_valContext.class);
		}
		public Num_valContext num_val(int i) {
			return getRuleContext(Num_valContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			num_val();
			setState(320);
			comparator();
			setState(321);
			num_val();
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

	public static class Logic_statementContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Bool_valContext bool_val() {
			return getRuleContext(Bool_valContext.class,0);
		}
		public Logic_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitLogic_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_statementContext logic_statement() throws RecognitionException {
		Logic_statementContext _localctx = new Logic_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_logic_statement);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAL:
			case FLOAT_VAL:
			case DOUBLE_VAL:
			case ADD_:
			case SUBTRACT_:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				comparison();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				bool_val();
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

	public static class Logic_operatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(JavaGrParser.OR, 0); }
		public TerminalNode AND() { return getToken(JavaGrParser.AND, 0); }
		public Logic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitLogic_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_operatorContext logic_operator() throws RecognitionException {
		Logic_operatorContext _localctx = new Logic_operatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_logic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
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

	public static class Logic_conditionContext extends ParserRuleContext {
		public TerminalNode BRACKET_L() { return getToken(JavaGrParser.BRACKET_L, 0); }
		public List<Logic_statementContext> logic_statement() {
			return getRuleContexts(Logic_statementContext.class);
		}
		public Logic_statementContext logic_statement(int i) {
			return getRuleContext(Logic_statementContext.class,i);
		}
		public TerminalNode BRACKET_R() { return getToken(JavaGrParser.BRACKET_R, 0); }
		public List<Logic_operatorContext> logic_operator() {
			return getRuleContexts(Logic_operatorContext.class);
		}
		public Logic_operatorContext logic_operator(int i) {
			return getRuleContext(Logic_operatorContext.class,i);
		}
		public Logic_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitLogic_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_conditionContext logic_condition() throws RecognitionException {
		Logic_conditionContext _localctx = new Logic_conditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_logic_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(BRACKET_L);
			setState(330);
			logic_statement();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(331);
				logic_operator();
				setState(332);
				logic_statement();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			match(BRACKET_R);
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
		public TerminalNode IF() { return getToken(JavaGrParser.IF, 0); }
		public Logic_conditionContext logic_condition() {
			return getRuleContext(Logic_conditionContext.class,0);
		}
		public TerminalNode PARENT_L() { return getToken(JavaGrParser.PARENT_L, 0); }
		public Instruction_generalContext instruction_general() {
			return getRuleContext(Instruction_generalContext.class,0);
		}
		public TerminalNode PARENT_R() { return getToken(JavaGrParser.PARENT_R, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(IF);
			setState(342);
			logic_condition();
			setState(343);
			match(PARENT_L);
			setState(344);
			instruction_general();
			setState(345);
			match(PARENT_R);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaGrParser.WHILE, 0); }
		public Logic_conditionContext logic_condition() {
			return getRuleContext(Logic_conditionContext.class,0);
		}
		public TerminalNode PARENT_L() { return getToken(JavaGrParser.PARENT_L, 0); }
		public Instruction_generalContext instruction_general() {
			return getRuleContext(Instruction_generalContext.class,0);
		}
		public TerminalNode PARENT_R() { return getToken(JavaGrParser.PARENT_R, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(WHILE);
			setState(348);
			logic_condition();
			setState(349);
			match(PARENT_L);
			setState(350);
			instruction_general();
			setState(351);
			match(PARENT_R);
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

	public static class Do_while_loopContext extends ParserRuleContext {
		public TerminalNode DO_() { return getToken(JavaGrParser.DO_, 0); }
		public TerminalNode PARENT_L() { return getToken(JavaGrParser.PARENT_L, 0); }
		public Instruction_generalContext instruction_general() {
			return getRuleContext(Instruction_generalContext.class,0);
		}
		public TerminalNode PARENT_R() { return getToken(JavaGrParser.PARENT_R, 0); }
		public TerminalNode WHILE() { return getToken(JavaGrParser.WHILE, 0); }
		public Logic_conditionContext logic_condition() {
			return getRuleContext(Logic_conditionContext.class,0);
		}
		public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitDo_while_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_do_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(DO_);
			setState(354);
			match(PARENT_L);
			setState(355);
			instruction_general();
			setState(356);
			match(PARENT_R);
			setState(357);
			match(WHILE);
			setState(358);
			logic_condition();
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaGrParser.FOR, 0); }
		public TerminalNode BRACKET_L() { return getToken(JavaGrParser.BRACKET_L, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(JavaGrParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JavaGrParser.SEMICOLON, i);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ModificationContext modification() {
			return getRuleContext(ModificationContext.class,0);
		}
		public TerminalNode BRACKET_R() { return getToken(JavaGrParser.BRACKET_R, 0); }
		public TerminalNode PARENT_L() { return getToken(JavaGrParser.PARENT_L, 0); }
		public Instruction_generalContext instruction_general() {
			return getRuleContext(Instruction_generalContext.class,0);
		}
		public TerminalNode PARENT_R() { return getToken(JavaGrParser.PARENT_R, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(FOR);
			setState(361);
			match(BRACKET_L);
			setState(362);
			assignment();
			setState(363);
			match(SEMICOLON);
			setState(364);
			comparison();
			setState(365);
			match(SEMICOLON);
			setState(366);
			modification();
			setState(367);
			match(BRACKET_R);
			setState(368);
			match(PARENT_L);
			setState(369);
			instruction_general();
			setState(370);
			match(PARENT_R);
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

	public static class SoutContext extends ParserRuleContext {
		public TerminalNode SOUT_L() { return getToken(JavaGrParser.SOUT_L, 0); }
		public TerminalNode BRACKET_L() { return getToken(JavaGrParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(JavaGrParser.BRACKET_R, 0); }
		public TerminalNode STRING_VAL() { return getToken(JavaGrParser.STRING_VAL, 0); }
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public Bool_valContext bool_val() {
			return getRuleContext(Bool_valContext.class,0);
		}
		public TerminalNode CHAR_VAL() { return getToken(JavaGrParser.CHAR_VAL, 0); }
		public SoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sout; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitSout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoutContext sout() throws RecognitionException {
		SoutContext _localctx = new SoutContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(SOUT_L);
			setState(373);
			match(BRACKET_L);
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_VAL:
				{
				setState(374);
				match(STRING_VAL);
				}
				break;
			case INT_VAL:
			case FLOAT_VAL:
			case DOUBLE_VAL:
			case BRACKET_L:
			case ADD_:
			case SUBTRACT_:
			case IDENTIFIER:
				{
				setState(375);
				math_expr(0);
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(376);
				bool_val();
				}
				break;
			case CHAR_VAL:
				{
				setState(377);
				match(CHAR_VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(380);
			match(BRACKET_R);
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

	public static class SinContext extends ParserRuleContext {
		public List<TerminalNode> BUFFERED_READER() { return getTokens(JavaGrParser.BUFFERED_READER); }
		public TerminalNode BUFFERED_READER(int i) {
			return getToken(JavaGrParser.BUFFERED_READER, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public List<TerminalNode> NEW() { return getTokens(JavaGrParser.NEW); }
		public TerminalNode NEW(int i) {
			return getToken(JavaGrParser.NEW, i);
		}
		public List<TerminalNode> PARENT_L() { return getTokens(JavaGrParser.PARENT_L); }
		public TerminalNode PARENT_L(int i) {
			return getToken(JavaGrParser.PARENT_L, i);
		}
		public TerminalNode INPUT_READER() { return getToken(JavaGrParser.INPUT_READER, 0); }
		public TerminalNode SYS_IN() { return getToken(JavaGrParser.SYS_IN, 0); }
		public List<TerminalNode> PARENT_R() { return getTokens(JavaGrParser.PARENT_R); }
		public TerminalNode PARENT_R(int i) {
			return getToken(JavaGrParser.PARENT_R, i);
		}
		public SinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitSin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinContext sin() throws RecognitionException {
		SinContext _localctx = new SinContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(BUFFERED_READER);
			setState(383);
			match(IDENTIFIER);
			setState(384);
			match(EQUAL);
			setState(385);
			match(NEW);
			setState(386);
			match(BUFFERED_READER);
			setState(387);
			match(PARENT_L);
			setState(388);
			match(NEW);
			setState(389);
			match(INPUT_READER);
			setState(390);
			match(PARENT_L);
			setState(391);
			match(SYS_IN);
			setState(392);
			match(PARENT_R);
			setState(393);
			match(PARENT_R);
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
		case 24:
			return math_expr_sempred((Math_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_expr_sempred(Math_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00018\u018c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003`\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005"+
		"e\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005i\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005m\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005q\b\u0005"+
		"\u0001\u0005\u0003\u0005t\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006|\b\u0006\n\u0006\f\u0006"+
		"\u007f\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0083\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u008a\b\b\n\b\f\b\u008d"+
		"\t\b\u0001\t\u0001\t\u0003\t\u0091\b\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u009f\b\u000b\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00a4\b\f\n\f\f\f\u00a7\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00c2\b\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00c6\b\u000e\n\u000e\f\u000e\u00c9\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0003\u0010\u00d0\b\u0010\u0001\u0010\u0003"+
		"\u0010\u00d3\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d7\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00f4\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u00fc\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0102\b\u0018\n\u0018\f\u0018\u0105\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u010d\b\u001a\n"+
		"\u001a\f\u001a\u0110\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0123\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0136\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u013e\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0003\"\u0146\b\"\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0005$\u014f\b$\n$\f$\u0152\t$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u017b\b)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0000\u00010+\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRT\u0000\u0007\u0001\u0000\u0007\t\u0001\u0000\n\u000b"+
		"\u0001\u0000\u000f\u0010\u0001\u0000\u001d\u001e\u0002\u0000\r\r,-\u0001"+
		"\u0000\u001d!\u0001\u0000/0\u019a\u0000V\u0001\u0000\u0000\u0000\u0002"+
		"X\u0001\u0000\u0000\u0000\u0004Z\u0001\u0000\u0000\u0000\u0006_\u0001"+
		"\u0000\u0000\u0000\ba\u0001\u0000\u0000\u0000\ns\u0001\u0000\u0000\u0000"+
		"\fu\u0001\u0000\u0000\u0000\u000e\u0080\u0001\u0000\u0000\u0000\u0010"+
		"\u0086\u0001\u0000\u0000\u0000\u0012\u008e\u0001\u0000\u0000\u0000\u0014"+
		"\u0094\u0001\u0000\u0000\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018"+
		"\u00a0\u0001\u0000\u0000\u0000\u001a\u00c1\u0001\u0000\u0000\u0000\u001c"+
		"\u00c7\u0001\u0000\u0000\u0000\u001e\u00ca\u0001\u0000\u0000\u0000 \u00cf"+
		"\u0001\u0000\u0000\u0000\"\u00dc\u0001\u0000\u0000\u0000$\u00de\u0001"+
		"\u0000\u0000\u0000&\u00e1\u0001\u0000\u0000\u0000(\u00e4\u0001\u0000\u0000"+
		"\u0000*\u00e7\u0001\u0000\u0000\u0000,\u00ea\u0001\u0000\u0000\u0000."+
		"\u00f3\u0001\u0000\u0000\u00000\u00fb\u0001\u0000\u0000\u00002\u0106\u0001"+
		"\u0000\u0000\u00004\u0109\u0001\u0000\u0000\u00006\u0122\u0001\u0000\u0000"+
		"\u00008\u0124\u0001\u0000\u0000\u0000:\u0127\u0001\u0000\u0000\u0000<"+
		"\u012a\u0001\u0000\u0000\u0000>\u0135\u0001\u0000\u0000\u0000@\u013d\u0001"+
		"\u0000\u0000\u0000B\u013f\u0001\u0000\u0000\u0000D\u0145\u0001\u0000\u0000"+
		"\u0000F\u0147\u0001\u0000\u0000\u0000H\u0149\u0001\u0000\u0000\u0000J"+
		"\u0155\u0001\u0000\u0000\u0000L\u015b\u0001\u0000\u0000\u0000N\u0161\u0001"+
		"\u0000\u0000\u0000P\u0168\u0001\u0000\u0000\u0000R\u0174\u0001\u0000\u0000"+
		"\u0000T\u017e\u0001\u0000\u0000\u0000VW\u0003 \u0010\u0000W\u0001\u0001"+
		"\u0000\u0000\u0000XY\u0007\u0000\u0000\u0000Y\u0003\u0001\u0000\u0000"+
		"\u0000Z[\u0007\u0001\u0000\u0000[\u0005\u0001\u0000\u0000\u0000\\`\u0003"+
		"\u0002\u0001\u0000]`\u0003\u0004\u0002\u0000^`\u0005\f\u0000\u0000_\\"+
		"\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000"+
		"\u0000`\u0007\u0001\u0000\u0000\u0000ab\u0007\u0002\u0000\u0000b\t\u0001"+
		"\u0000\u0000\u0000ce\u0007\u0003\u0000\u0000dc\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000ft\u0005\u0003\u0000"+
		"\u0000gi\u0007\u0003\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jt\u0005\u0005\u0000\u0000km\u0007"+
		"\u0003\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000nt\u0005\u0004\u0000\u0000oq\u0007\u0003\u0000"+
		"\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rt\u00052\u0000\u0000sd\u0001\u0000\u0000\u0000sh\u0001\u0000"+
		"\u0000\u0000sl\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000\u0000t\u000b"+
		"\u0001\u0000\u0000\u0000uv\u0003\u0006\u0003\u0000v}\u00052\u0000\u0000"+
		"wx\u0005(\u0000\u0000xy\u0003\u0006\u0003\u0000yz\u00052\u0000\u0000z"+
		"|\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000|\u007f\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\r\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0082\u0005\u0017"+
		"\u0000\u0000\u0081\u0083\u0003\f\u0006\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005\u0018\u0000\u0000\u0085\u000f\u0001\u0000\u0000"+
		"\u0000\u0086\u008b\u00052\u0000\u0000\u0087\u0088\u0005(\u0000\u0000\u0088"+
		"\u008a\u00052\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008d"+
		"\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u0011\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008e\u0090\u0005\u0017\u0000\u0000\u008f\u0091"+
		"\u0003\u0010\b\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"\u0018\u0000\u0000\u0093\u0013\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"2\u0000\u0000\u0095\u0096\u0003\u0012\t\u0000\u0096\u0015\u0001\u0000"+
		"\u0000\u0000\u0097\u009e\u0005+\u0000\u0000\u0098\u009f\u00052\u0000\u0000"+
		"\u0099\u009f\u00030\u0018\u0000\u009a\u009f\u0003\b\u0004\u0000\u009b"+
		"\u009f\u0005\u0002\u0000\u0000\u009c\u009f\u0005\u0001\u0000\u0000\u009d"+
		"\u009f\u0003\u0014\n\u0000\u009e\u0098\u0001\u0000\u0000\u0000\u009e\u0099"+
		"\u0001\u0000\u0000\u0000\u009e\u009a\u0001\u0000\u0000\u0000\u009e\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009d"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u0017"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a5\u0003J%\u0000\u00a1\u00a2\u0005$"+
		"\u0000\u0000\u00a2\u00a4\u0003J%\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u0019\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u00034\u001a\u0000\u00a9"+
		"\u00aa\u0005\'\u0000\u0000\u00aa\u00c2\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u00036\u001b\u0000\u00ac\u00ad\u0005\'\u0000\u0000\u00ad\u00c2\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0003>\u001f\u0000\u00af\u00b0\u0005\'"+
		"\u0000\u0000\u00b0\u00c2\u0001\u0000\u0000\u0000\u00b1\u00c2\u0003J%\u0000"+
		"\u00b2\u00c2\u0003\u0018\f\u0000\u00b3\u00c2\u0003L&\u0000\u00b4\u00b5"+
		"\u0003N\'\u0000\u00b5\u00b6\u0005\'\u0000\u0000\u00b6\u00c2\u0001\u0000"+
		"\u0000\u0000\u00b7\u00c2\u0003P(\u0000\u00b8\u00b9\u0003T*\u0000\u00b9"+
		"\u00ba\u0005\'\u0000\u0000\u00ba\u00c2\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0003R)\u0000\u00bc\u00bd\u0005\'\u0000\u0000\u00bd\u00c2\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0003\u0016\u000b\u0000\u00bf\u00c0\u0005\'\u0000"+
		"\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00a8\u0001\u0000\u0000"+
		"\u0000\u00c1\u00ab\u0001\u0000\u0000\u0000\u00c1\u00ae\u0001\u0000\u0000"+
		"\u0000\u00c1\u00b1\u0001\u0000\u0000\u0000\u00c1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00c1\u00b3\u0001\u0000\u0000\u0000\u00c1\u00b4\u0001\u0000\u0000"+
		"\u0000\u00c1\u00b7\u0001\u0000\u0000\u0000\u00c1\u00b8\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bb\u0001\u0000\u0000\u0000\u00c1\u00be\u0001\u0000\u0000"+
		"\u0000\u00c2\u001b\u0001\u0000\u0000\u0000\u00c3\u00c6\u0003\u001a\r\u0000"+
		"\u00c4\u00c6\u0005\"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u001d\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u001b\u0000\u0000\u00cb\u00cc\u0003\u001c\u000e\u0000\u00cc"+
		"\u00cd\u0005\u001c\u0000\u0000\u00cd\u001f\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d0\u0007\u0004\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d3\u0005.\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d7"+
		"\u0003\u0006\u0003\u0000\u00d5\u00d7\u00051\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u00052\u0000\u0000\u00d9\u00da\u0003\u000e"+
		"\u0007\u0000\u00da\u00db\u0003\u001e\u000f\u0000\u00db!\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0007\u0005\u0000\u0000\u00dd#\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0005\u001d\u0000\u0000\u00df\u00e0\u0005\u0011\u0000\u0000"+
		"\u00e0%\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u001e\u0000\u0000\u00e2"+
		"\u00e3\u0005\u0011\u0000\u0000\u00e3\'\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0005\u001f\u0000\u0000\u00e5\u00e6\u0005\u0011\u0000\u0000\u00e6)\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0005 \u0000\u0000\u00e8\u00e9\u0005\u0011"+
		"\u0000\u0000\u00e9+\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005!\u0000\u0000"+
		"\u00eb\u00ec\u0005\u0011\u0000\u0000\u00ec-\u0001\u0000\u0000\u0000\u00ed"+
		"\u00f4\u0003$\u0012\u0000\u00ee\u00f4\u0003&\u0013\u0000\u00ef\u00f4\u0003"+
		"(\u0014\u0000\u00f0\u00f4\u0003*\u0015\u0000\u00f1\u00f4\u0003,\u0016"+
		"\u0000\u00f2\u00f4\u0005\u0011\u0000\u0000\u00f3\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f3\u00ee\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4/\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0006\u0018\uffff\uffff\u0000\u00f6\u00f7\u0005\u0017\u0000"+
		"\u0000\u00f7\u00f8\u00030\u0018\u0000\u00f8\u00f9\u0005\u0018\u0000\u0000"+
		"\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00fc\u0003\n\u0005\u0000\u00fb"+
		"\u00f5\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u0103\u0001\u0000\u0000\u0000\u00fd\u00fe\n\u0003\u0000\u0000\u00fe\u00ff"+
		"\u0003\"\u0011\u0000\u00ff\u0100\u00030\u0018\u0004\u0100\u0102\u0001"+
		"\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0102\u0105\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u01041\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0005(\u0000\u0000\u0107\u0108\u00052\u0000\u0000"+
		"\u01083\u0001\u0000\u0000\u0000\u0109\u010a\u0003\u0006\u0003\u0000\u010a"+
		"\u010e\u00052\u0000\u0000\u010b\u010d\u00032\u0019\u0000\u010c\u010b\u0001"+
		"\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f5\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u0003\u0002"+
		"\u0001\u0000\u0112\u0113\u00052\u0000\u0000\u0113\u0114\u0005\u0011\u0000"+
		"\u0000\u0114\u0115\u00030\u0018\u0000\u0115\u0123\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0005\u000b\u0000\u0000\u0117\u0118\u00052\u0000\u0000\u0118"+
		"\u0119\u0005\u0011\u0000\u0000\u0119\u0123\u0005\u0002\u0000\u0000\u011a"+
		"\u011b\u0005\n\u0000\u0000\u011b\u011c\u00052\u0000\u0000\u011c\u011d"+
		"\u0005\u0011\u0000\u0000\u011d\u0123\u0005\u0001\u0000\u0000\u011e\u011f"+
		"\u0005\f\u0000\u0000\u011f\u0120\u00052\u0000\u0000\u0120\u0121\u0005"+
		"\u0011\u0000\u0000\u0121\u0123\u0003\b\u0004\u0000\u0122\u0111\u0001\u0000"+
		"\u0000\u0000\u0122\u0116\u0001\u0000\u0000\u0000\u0122\u011a\u0001\u0000"+
		"\u0000\u0000\u0122\u011e\u0001\u0000\u0000\u0000\u01237\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0005\u001d\u0000\u0000\u0125\u0126\u0005\u001d\u0000"+
		"\u0000\u01269\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0011\u0000\u0000"+
		"\u0128\u0129\u0005\u0011\u0000\u0000\u0129;\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0005\u001e\u0000\u0000\u012b\u012c\u0005\u001e\u0000\u0000\u012c"+
		"=\u0001\u0000\u0000\u0000\u012d\u012e\u00052\u0000\u0000\u012e\u012f\u0003"+
		".\u0017\u0000\u012f\u0130\u00030\u0018\u0000\u0130\u0136\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u00052\u0000\u0000\u0132\u0136\u00038\u001c\u0000\u0133"+
		"\u0134\u00052\u0000\u0000\u0134\u0136\u0003<\u001e\u0000\u0135\u012d\u0001"+
		"\u0000\u0000\u0000\u0135\u0131\u0001\u0000\u0000\u0000\u0135\u0133\u0001"+
		"\u0000\u0000\u0000\u0136?\u0001\u0000\u0000\u0000\u0137\u013e\u0003:\u001d"+
		"\u0000\u0138\u013e\u0005\u0012\u0000\u0000\u0139\u013e\u0005\u0013\u0000"+
		"\u0000\u013a\u013e\u0005\u0014\u0000\u0000\u013b\u013e\u0005\u0015\u0000"+
		"\u0000\u013c\u013e\u0005\u0016\u0000\u0000\u013d\u0137\u0001\u0000\u0000"+
		"\u0000\u013d\u0138\u0001\u0000\u0000\u0000\u013d\u0139\u0001\u0000\u0000"+
		"\u0000\u013d\u013a\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000"+
		"\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013eA\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0003\n\u0005\u0000\u0140\u0141\u0003@ \u0000\u0141\u0142"+
		"\u0003\n\u0005\u0000\u0142C\u0001\u0000\u0000\u0000\u0143\u0146\u0003"+
		"B!\u0000\u0144\u0146\u0003\b\u0004\u0000\u0145\u0143\u0001\u0000\u0000"+
		"\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146E\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0007\u0006\u0000\u0000\u0148G\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0005\u0017\u0000\u0000\u014a\u0150\u0003D\"\u0000\u014b\u014c"+
		"\u0003F#\u0000\u014c\u014d\u0003D\"\u0000\u014d\u014f\u0001\u0000\u0000"+
		"\u0000\u014e\u014b\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000"+
		"\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000"+
		"\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0005\u0018\u0000\u0000\u0154I\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0005#\u0000\u0000\u0156\u0157\u0003H$\u0000\u0157\u0158"+
		"\u0005\u001b\u0000\u0000\u0158\u0159\u0003\u001c\u000e\u0000\u0159\u015a"+
		"\u0005\u001c\u0000\u0000\u015aK\u0001\u0000\u0000\u0000\u015b\u015c\u0005"+
		"&\u0000\u0000\u015c\u015d\u0003H$\u0000\u015d\u015e\u0005\u001b\u0000"+
		"\u0000\u015e\u015f\u0003\u001c\u000e\u0000\u015f\u0160\u0005\u001c\u0000"+
		"\u0000\u0160M\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u0006\u0000\u0000"+
		"\u0162\u0163\u0005\u001b\u0000\u0000\u0163\u0164\u0003\u001c\u000e\u0000"+
		"\u0164\u0165\u0005\u001c\u0000\u0000\u0165\u0166\u0005&\u0000\u0000\u0166"+
		"\u0167\u0003H$\u0000\u0167O\u0001\u0000\u0000\u0000\u0168\u0169\u0005"+
		"%\u0000\u0000\u0169\u016a\u0005\u0017\u0000\u0000\u016a\u016b\u00036\u001b"+
		"\u0000\u016b\u016c\u0005\'\u0000\u0000\u016c\u016d\u0003B!\u0000\u016d"+
		"\u016e\u0005\'\u0000\u0000\u016e\u016f\u0003>\u001f\u0000\u016f\u0170"+
		"\u0005\u0018\u0000\u0000\u0170\u0171\u0005\u001b\u0000\u0000\u0171\u0172"+
		"\u0003\u001c\u000e\u0000\u0172\u0173\u0005\u001c\u0000\u0000\u0173Q\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u00055\u0000\u0000\u0175\u017a\u0005\u0017"+
		"\u0000\u0000\u0176\u017b\u0005\u0001\u0000\u0000\u0177\u017b\u00030\u0018"+
		"\u0000\u0178\u017b\u0003\b\u0004\u0000\u0179\u017b\u0005\u0002\u0000\u0000"+
		"\u017a\u0176\u0001\u0000\u0000\u0000\u017a\u0177\u0001\u0000\u0000\u0000"+
		"\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u0018\u0000\u0000"+
		"\u017dS\u0001\u0000\u0000\u0000\u017e\u017f\u00054\u0000\u0000\u017f\u0180"+
		"\u00052\u0000\u0000\u0180\u0181\u0005\u0011\u0000\u0000\u0181\u0182\u0005"+
		"6\u0000\u0000\u0182\u0183\u00054\u0000\u0000\u0183\u0184\u0005\u001b\u0000"+
		"\u0000\u0184\u0185\u00056\u0000\u0000\u0185\u0186\u00057\u0000\u0000\u0186"+
		"\u0187\u0005\u001b\u0000\u0000\u0187\u0188\u00058\u0000\u0000\u0188\u0189"+
		"\u0005\u001c\u0000\u0000\u0189\u018a\u0005\u001c\u0000\u0000\u018aU\u0001"+
		"\u0000\u0000\u0000\u001c_dhlps}\u0082\u008b\u0090\u009e\u00a5\u00c1\u00c5"+
		"\u00c7\u00cf\u00d2\u00d6\u00f3\u00fb\u0103\u010e\u0122\u0135\u013d\u0145"+
		"\u0150\u017a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}