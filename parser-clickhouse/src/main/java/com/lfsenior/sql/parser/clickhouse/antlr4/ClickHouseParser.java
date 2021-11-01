// Generated from D:/dlupan/DorisParser/parser-clickhouse/src/main/antlr4\ClickHouseParser.g4 by ANTLR 4.9.1
package com.lfsenior.sql.parser.clickhouse.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClickHouseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, AFTER=2, ALIAS=3, ALL=4, ALTER=5, AND=6, ANTI=7, ANY=8, ARRAY=9, 
		AS=10, ASCENDING=11, ASOF=12, AST=13, ASYNC=14, ATTACH=15, BETWEEN=16, 
		BOTH=17, BY=18, CASE=19, CAST=20, CHECK=21, CLEAR=22, CLUSTER=23, CODEC=24, 
		COLLATE=25, COLUMN=26, COMMENT=27, CONSTRAINT=28, CREATE=29, CROSS=30, 
		CUBE=31, CURRENT=32, DATABASE=33, DATABASES=34, DATE=35, DAY=36, DEDUPLICATE=37, 
		DEFAULT=38, DELAY=39, DELETE=40, DESC=41, DESCENDING=42, DESCRIBE=43, 
		DETACH=44, DICTIONARIES=45, DICTIONARY=46, DISK=47, DISTINCT=48, DISTRIBUTED=49, 
		DROP=50, ELSE=51, END=52, ENGINE=53, EVENTS=54, EXISTS=55, EXPLAIN=56, 
		EXPRESSION=57, EXTRACT=58, FETCHES=59, FINAL=60, FIRST=61, FLUSH=62, FOLLOWING=63, 
		FOR=64, FORMAT=65, FREEZE=66, FROM=67, FULL=68, FUNCTION=69, GLOBAL=70, 
		GRANULARITY=71, GROUP=72, HAVING=73, HIERARCHICAL=74, HOUR=75, ID=76, 
		IF=77, ILIKE=78, IN=79, INDEX=80, INF=81, INJECTIVE=82, INNER=83, INSERT=84, 
		INTERVAL=85, INTO=86, IS=87, IS_OBJECT_ID=88, JOIN=89, KEY=90, KILL=91, 
		LAST=92, LAYOUT=93, LEADING=94, LEFT=95, LIFETIME=96, LIKE=97, LIMIT=98, 
		LIVE=99, LOCAL=100, LOGS=101, MATERIALIZE=102, MATERIALIZED=103, MAX=104, 
		MERGES=105, MIN=106, MINUTE=107, MODIFY=108, MONTH=109, MOVE=110, MUTATION=111, 
		NAN_SQL=112, NO=113, NOT=114, NULL_SQL=115, NULLS=116, OFFSET=117, ON=118, 
		OPTIMIZE=119, OR=120, ORDER=121, OUTER=122, OUTFILE=123, OVER=124, PARTITION=125, 
		POPULATE=126, PRECEDING=127, PREWHERE=128, PRIMARY=129, PROJECTION=130, 
		QUARTER=131, RANGE=132, RELOAD=133, REMOVE=134, RENAME=135, REPLACE=136, 
		REPLICA=137, REPLICATED=138, RIGHT=139, ROLLUP=140, ROW=141, ROWS=142, 
		SAMPLE=143, SECOND=144, SELECT=145, SEMI=146, SENDS=147, SET=148, SETTINGS=149, 
		SHOW=150, SOURCE=151, START=152, STOP=153, SUBSTRING=154, SYNC=155, SYNTAX=156, 
		SYSTEM=157, TABLE=158, TABLES=159, TEMPORARY=160, TEST=161, THEN=162, 
		TIES=163, TIMEOUT=164, TIMESTAMP=165, TO=166, TOP=167, TOTALS=168, TRAILING=169, 
		TRIM=170, TRUNCATE=171, TTL=172, TYPE=173, UNBOUNDED=174, UNION=175, UPDATE=176, 
		USE=177, USING=178, UUID=179, VALUES=180, VIEW=181, VOLUME=182, WATCH=183, 
		WEEK=184, WHEN=185, WHERE=186, WINDOW=187, WITH=188, YEAR=189, JSON_FALSE=190, 
		JSON_TRUE=191, IDENTIFIER=192, FLOATING_LITERAL=193, OCTAL_LITERAL=194, 
		DECIMAL_LITERAL=195, HEXADECIMAL_LITERAL=196, STRING_LITERAL=197, ARROW=198, 
		ASTERISK=199, BACKQUOTE=200, BACKSLASH=201, COLON=202, COMMA=203, CONCAT=204, 
		DASH=205, DOT=206, EQ_DOUBLE=207, EQ_SINGLE=208, GE=209, GT=210, LBRACE=211, 
		LBRACKET=212, LE=213, LPAREN=214, LT=215, NOT_EQ=216, PERCENT=217, PLUS=218, 
		QUERY=219, QUOTE_DOUBLE=220, QUOTE_SINGLE=221, RBRACE=222, RBRACKET=223, 
		RPAREN=224, SEMICOLON=225, SLASH=226, UNDERSCORE=227, MULTI_LINE_COMMENT=228, 
		SINGLE_LINE_COMMENT=229, WHITESPACE=230;
	public static final int
		RULE_queryStmt = 0, RULE_query = 1, RULE_alterStmt = 2, RULE_alterTableClause = 3, 
		RULE_addAfterColumnName = 4, RULE_assignmentExprList = 5, RULE_assignmentExpr = 6, 
		RULE_tableColumnPropertyType = 7, RULE_partitionClause = 8, RULE_attachStmt = 9, 
		RULE_checkStmt = 10, RULE_createStmt = 11, RULE_dictionarySchemaClause = 12, 
		RULE_dictionaryAttrDfnt = 13, RULE_dictionaryEngineClause = 14, RULE_dictionaryPrimaryKeyClause = 15, 
		RULE_dictionaryArgExpr = 16, RULE_sourceClause = 17, RULE_lifetimeClause = 18, 
		RULE_layoutClause = 19, RULE_rangeClause = 20, RULE_dictionarySettingsClause = 21, 
		RULE_clusterClause = 22, RULE_uuidClause = 23, RULE_destinationClause = 24, 
		RULE_subqueryClause = 25, RULE_tableSchemaClause = 26, RULE_engineClause = 27, 
		RULE_tableCommentClause = 28, RULE_columnCommentClause = 29, RULE_partitionByClause = 30, 
		RULE_primaryKeyClause = 31, RULE_sampleByClause = 32, RULE_ttlClause = 33, 
		RULE_engineExpr = 34, RULE_tableElementExpr = 35, RULE_tableColumnDfnt = 36, 
		RULE_tableColumnPropertyExpr = 37, RULE_tableIndexDfnt = 38, RULE_tableProjectionDfnt = 39, 
		RULE_codecExpr = 40, RULE_codecArgExpr = 41, RULE_ttlExpr = 42, RULE_describeStmt = 43, 
		RULE_dropStmt = 44, RULE_existsStmt = 45, RULE_explainStmt = 46, RULE_insertStmt = 47, 
		RULE_columnsClause = 48, RULE_dataClause = 49, RULE_killStmt = 50, RULE_optimizeStmt = 51, 
		RULE_renameStmt = 52, RULE_projectionSelectStmt = 53, RULE_selectUnionStmt = 54, 
		RULE_selectStmtWithParens = 55, RULE_selectStmt = 56, RULE_withClause = 57, 
		RULE_topClause = 58, RULE_fromClause = 59, RULE_arrayJoinClause = 60, 
		RULE_windowClause = 61, RULE_prewhereClause = 62, RULE_whereClause = 63, 
		RULE_groupByClause = 64, RULE_havingClause = 65, RULE_orderByClause = 66, 
		RULE_projectionOrderByClause = 67, RULE_limitByClause = 68, RULE_limitClause = 69, 
		RULE_settingsClause = 70, RULE_joinExpr = 71, RULE_joinOp = 72, RULE_joinOpCross = 73, 
		RULE_joinConstraintClause = 74, RULE_sampleClause = 75, RULE_limitExpr = 76, 
		RULE_orderExprList = 77, RULE_orderExpr = 78, RULE_ratioExpr = 79, RULE_settingExprList = 80, 
		RULE_settingExpr = 81, RULE_windowExpr = 82, RULE_winPartitionByClause = 83, 
		RULE_winOrderByClause = 84, RULE_winFrameClause = 85, RULE_winFrameExtend = 86, 
		RULE_winFrameBound = 87, RULE_setStmt = 88, RULE_showStmt = 89, RULE_systemStmt = 90, 
		RULE_truncateStmt = 91, RULE_useStmt = 92, RULE_watchStmt = 93, RULE_columnTypeExpr = 94, 
		RULE_columnExprList = 95, RULE_columnsExpr = 96, RULE_columnExpr = 97, 
		RULE_columnArgList = 98, RULE_columnArgExpr = 99, RULE_columnLambdaExpr = 100, 
		RULE_columnIdentifier = 101, RULE_nestedIdentifier = 102, RULE_tableExpr = 103, 
		RULE_tableFunctionExpr = 104, RULE_tableIdentifier = 105, RULE_tableArgList = 106, 
		RULE_tableArgExpr = 107, RULE_databaseIdentifier = 108, RULE_floatingLiteral = 109, 
		RULE_numberLiteral = 110, RULE_literal = 111, RULE_interval = 112, RULE_keyword = 113, 
		RULE_keywordForAlias = 114, RULE_alias = 115, RULE_identifier = 116, RULE_identifierOrNull = 117, 
		RULE_enumValue = 118;
	private static String[] makeRuleNames() {
		return new String[] {
			"queryStmt", "query", "alterStmt", "alterTableClause", "addAfterColumnName", 
			"assignmentExprList", "assignmentExpr", "tableColumnPropertyType", "partitionClause", 
			"attachStmt", "checkStmt", "createStmt", "dictionarySchemaClause", "dictionaryAttrDfnt", 
			"dictionaryEngineClause", "dictionaryPrimaryKeyClause", "dictionaryArgExpr", 
			"sourceClause", "lifetimeClause", "layoutClause", "rangeClause", "dictionarySettingsClause", 
			"clusterClause", "uuidClause", "destinationClause", "subqueryClause", 
			"tableSchemaClause", "engineClause", "tableCommentClause", "columnCommentClause", 
			"partitionByClause", "primaryKeyClause", "sampleByClause", "ttlClause", 
			"engineExpr", "tableElementExpr", "tableColumnDfnt", "tableColumnPropertyExpr", 
			"tableIndexDfnt", "tableProjectionDfnt", "codecExpr", "codecArgExpr", 
			"ttlExpr", "describeStmt", "dropStmt", "existsStmt", "explainStmt", "insertStmt", 
			"columnsClause", "dataClause", "killStmt", "optimizeStmt", "renameStmt", 
			"projectionSelectStmt", "selectUnionStmt", "selectStmtWithParens", "selectStmt", 
			"withClause", "topClause", "fromClause", "arrayJoinClause", "windowClause", 
			"prewhereClause", "whereClause", "groupByClause", "havingClause", "orderByClause", 
			"projectionOrderByClause", "limitByClause", "limitClause", "settingsClause", 
			"joinExpr", "joinOp", "joinOpCross", "joinConstraintClause", "sampleClause", 
			"limitExpr", "orderExprList", "orderExpr", "ratioExpr", "settingExprList", 
			"settingExpr", "windowExpr", "winPartitionByClause", "winOrderByClause", 
			"winFrameClause", "winFrameExtend", "winFrameBound", "setStmt", "showStmt", 
			"systemStmt", "truncateStmt", "useStmt", "watchStmt", "columnTypeExpr", 
			"columnExprList", "columnsExpr", "columnExpr", "columnArgList", "columnArgExpr", 
			"columnLambdaExpr", "columnIdentifier", "nestedIdentifier", "tableExpr", 
			"tableFunctionExpr", "tableIdentifier", "tableArgList", "tableArgExpr", 
			"databaseIdentifier", "floatingLiteral", "numberLiteral", "literal", 
			"interval", "keyword", "keywordForAlias", "alias", "identifier", "identifierOrNull", 
			"enumValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'false'", 
			"'true'", null, null, null, null, null, null, "'->'", "'*'", "'`'", "'\\'", 
			"':'", "','", "'||'", "'-'", "'.'", "'=='", "'='", "'>='", "'>'", "'{'", 
			"'['", "'<='", "'('", "'<'", null, "'%'", "'+'", "'?'", "'\"'", "'''", 
			"'}'", "']'", "')'", "';'", "'/'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "AFTER", "ALIAS", "ALL", "ALTER", "AND", "ANTI", "ANY", 
			"ARRAY", "AS", "ASCENDING", "ASOF", "AST", "ASYNC", "ATTACH", "BETWEEN", 
			"BOTH", "BY", "CASE", "CAST", "CHECK", "CLEAR", "CLUSTER", "CODEC", "COLLATE", 
			"COLUMN", "COMMENT", "CONSTRAINT", "CREATE", "CROSS", "CUBE", "CURRENT", 
			"DATABASE", "DATABASES", "DATE", "DAY", "DEDUPLICATE", "DEFAULT", "DELAY", 
			"DELETE", "DESC", "DESCENDING", "DESCRIBE", "DETACH", "DICTIONARIES", 
			"DICTIONARY", "DISK", "DISTINCT", "DISTRIBUTED", "DROP", "ELSE", "END", 
			"ENGINE", "EVENTS", "EXISTS", "EXPLAIN", "EXPRESSION", "EXTRACT", "FETCHES", 
			"FINAL", "FIRST", "FLUSH", "FOLLOWING", "FOR", "FORMAT", "FREEZE", "FROM", 
			"FULL", "FUNCTION", "GLOBAL", "GRANULARITY", "GROUP", "HAVING", "HIERARCHICAL", 
			"HOUR", "ID", "IF", "ILIKE", "IN", "INDEX", "INF", "INJECTIVE", "INNER", 
			"INSERT", "INTERVAL", "INTO", "IS", "IS_OBJECT_ID", "JOIN", "KEY", "KILL", 
			"LAST", "LAYOUT", "LEADING", "LEFT", "LIFETIME", "LIKE", "LIMIT", "LIVE", 
			"LOCAL", "LOGS", "MATERIALIZE", "MATERIALIZED", "MAX", "MERGES", "MIN", 
			"MINUTE", "MODIFY", "MONTH", "MOVE", "MUTATION", "NAN_SQL", "NO", "NOT", 
			"NULL_SQL", "NULLS", "OFFSET", "ON", "OPTIMIZE", "OR", "ORDER", "OUTER", 
			"OUTFILE", "OVER", "PARTITION", "POPULATE", "PRECEDING", "PREWHERE", 
			"PRIMARY", "PROJECTION", "QUARTER", "RANGE", "RELOAD", "REMOVE", "RENAME", 
			"REPLACE", "REPLICA", "REPLICATED", "RIGHT", "ROLLUP", "ROW", "ROWS", 
			"SAMPLE", "SECOND", "SELECT", "SEMI", "SENDS", "SET", "SETTINGS", "SHOW", 
			"SOURCE", "START", "STOP", "SUBSTRING", "SYNC", "SYNTAX", "SYSTEM", "TABLE", 
			"TABLES", "TEMPORARY", "TEST", "THEN", "TIES", "TIMEOUT", "TIMESTAMP", 
			"TO", "TOP", "TOTALS", "TRAILING", "TRIM", "TRUNCATE", "TTL", "TYPE", 
			"UNBOUNDED", "UNION", "UPDATE", "USE", "USING", "UUID", "VALUES", "VIEW", 
			"VOLUME", "WATCH", "WEEK", "WHEN", "WHERE", "WINDOW", "WITH", "YEAR", 
			"JSON_FALSE", "JSON_TRUE", "IDENTIFIER", "FLOATING_LITERAL", "OCTAL_LITERAL", 
			"DECIMAL_LITERAL", "HEXADECIMAL_LITERAL", "STRING_LITERAL", "ARROW", 
			"ASTERISK", "BACKQUOTE", "BACKSLASH", "COLON", "COMMA", "CONCAT", "DASH", 
			"DOT", "EQ_DOUBLE", "EQ_SINGLE", "GE", "GT", "LBRACE", "LBRACKET", "LE", 
			"LPAREN", "LT", "NOT_EQ", "PERCENT", "PLUS", "QUERY", "QUOTE_DOUBLE", 
			"QUOTE_SINGLE", "RBRACE", "RBRACKET", "RPAREN", "SEMICOLON", "SLASH", 
			"UNDERSCORE", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "ClickHouseParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClickHouseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryStmtContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public TerminalNode OUTFILE() { return getToken(ClickHouseParser.OUTFILE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public IdentifierOrNullContext identifierOrNull() {
			return getRuleContext(IdentifierOrNullContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ClickHouseParser.SEMICOLON, 0); }
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public QueryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterQueryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitQueryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitQueryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryStmtContext queryStmt() throws RecognitionException {
		QueryStmtContext _localctx = new QueryStmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryStmt);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
			case ATTACH:
			case CHECK:
			case CREATE:
			case DESC:
			case DESCRIBE:
			case DETACH:
			case DROP:
			case EXISTS:
			case EXPLAIN:
			case KILL:
			case OPTIMIZE:
			case RENAME:
			case REPLACE:
			case SELECT:
			case SET:
			case SHOW:
			case SYSTEM:
			case TRUNCATE:
			case USE:
			case WATCH:
			case WITH:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				query();
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(239);
					match(INTO);
					setState(240);
					match(OUTFILE);
					setState(241);
					match(STRING_LITERAL);
					}
				}

				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FORMAT) {
					{
					setState(244);
					match(FORMAT);
					setState(245);
					identifierOrNull();
					}
				}

				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(248);
					match(SEMICOLON);
					}
				}

				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				insertStmt();
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

	public static class QueryContext extends ParserRuleContext {
		public AlterStmtContext alterStmt() {
			return getRuleContext(AlterStmtContext.class,0);
		}
		public AttachStmtContext attachStmt() {
			return getRuleContext(AttachStmtContext.class,0);
		}
		public CheckStmtContext checkStmt() {
			return getRuleContext(CheckStmtContext.class,0);
		}
		public CreateStmtContext createStmt() {
			return getRuleContext(CreateStmtContext.class,0);
		}
		public DescribeStmtContext describeStmt() {
			return getRuleContext(DescribeStmtContext.class,0);
		}
		public DropStmtContext dropStmt() {
			return getRuleContext(DropStmtContext.class,0);
		}
		public ExistsStmtContext existsStmt() {
			return getRuleContext(ExistsStmtContext.class,0);
		}
		public ExplainStmtContext explainStmt() {
			return getRuleContext(ExplainStmtContext.class,0);
		}
		public KillStmtContext killStmt() {
			return getRuleContext(KillStmtContext.class,0);
		}
		public OptimizeStmtContext optimizeStmt() {
			return getRuleContext(OptimizeStmtContext.class,0);
		}
		public RenameStmtContext renameStmt() {
			return getRuleContext(RenameStmtContext.class,0);
		}
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public ShowStmtContext showStmt() {
			return getRuleContext(ShowStmtContext.class,0);
		}
		public SystemStmtContext systemStmt() {
			return getRuleContext(SystemStmtContext.class,0);
		}
		public TruncateStmtContext truncateStmt() {
			return getRuleContext(TruncateStmtContext.class,0);
		}
		public UseStmtContext useStmt() {
			return getRuleContext(UseStmtContext.class,0);
		}
		public WatchStmtContext watchStmt() {
			return getRuleContext(WatchStmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				alterStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				attachStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				checkStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				createStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				describeStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				dropStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				existsStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
				explainStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(262);
				killStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(263);
				optimizeStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(264);
				renameStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(265);
				selectUnionStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(266);
				setStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(267);
				showStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(268);
				systemStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(269);
				truncateStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(270);
				useStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(271);
				watchStmt();
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

	public static class AlterStmtContext extends ParserRuleContext {
		public AlterStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStmt; }
	 
		public AlterStmtContext() { }
		public void copyFrom(AlterStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableStmtContext extends AlterStmtContext {
		public TerminalNode ALTER() { return getToken(ClickHouseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<AlterTableClauseContext> alterTableClause() {
			return getRuleContexts(AlterTableClauseContext.class);
		}
		public AlterTableClauseContext alterTableClause(int i) {
			return getRuleContext(AlterTableClauseContext.class,i);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public AlterTableStmtContext(AlterStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterStmtContext alterStmt() throws RecognitionException {
		AlterStmtContext _localctx = new AlterStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterStmt);
		int _la;
		try {
			_localctx = new AlterTableStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(ALTER);
			setState(275);
			match(TABLE);
			setState(276);
			tableIdentifier();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(277);
				clusterClause();
				}
			}

			setState(280);
			alterTableClause();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(281);
				match(COMMA);
				setState(282);
				alterTableClause();
				}
				}
				setState(287);
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

	public static class AlterTableClauseContext extends ParserRuleContext {
		public AlterTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableClause; }
	 
		public AlterTableClauseContext() { }
		public void copyFrom(AlterTableClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableClauseReplaceContext extends AlterTableClauseContext {
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseReplaceContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseReplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseReplace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseReplace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyOrderByContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AlterTableClauseModifyOrderByContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyOrderBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyOrderBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyOrderBy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseUpdateContext extends AlterTableClauseContext {
		public TerminalNode UPDATE() { return getToken(ClickHouseParser.UPDATE, 0); }
		public AssignmentExprListContext assignmentExprList() {
			return getRuleContext(AssignmentExprListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AlterTableClauseUpdateContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseUpdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseClearProjectionContext extends AlterTableClauseContext {
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseClearProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseClearProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseClearProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseClearProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyRemoveContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TableColumnPropertyTypeContext tableColumnPropertyType() {
			return getRuleContext(TableColumnPropertyTypeContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyRemoveContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyRemove(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDeleteContext extends AlterTableClauseContext {
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AlterTableClauseDeleteContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseCommentContext extends AlterTableClauseContext {
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseCommentContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropColumnContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseDropColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDetachContext extends AlterTableClauseContext {
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseDetachContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDetach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDetach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDetach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAddIndexContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseParser.ADD, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TableIndexDfntContext tableIndexDfnt() {
			return getRuleContext(TableIndexDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseAddIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseAddIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseAddIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropPartitionContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseDropPartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDropPartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDropPartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDropPartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseMaterializeIndexContext extends AlterTableClauseContext {
		public TerminalNode MATERIALIZE() { return getToken(ClickHouseParser.MATERIALIZE, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseMaterializeIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseMaterializeIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseMaterializeIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseMaterializeIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseMaterializeProjectionContext extends AlterTableClauseContext {
		public TerminalNode MATERIALIZE() { return getToken(ClickHouseParser.MATERIALIZE, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseMaterializeProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseMaterializeProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseMaterializeProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseMaterializeProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseMovePartitionContext extends AlterTableClauseContext {
		public TerminalNode MOVE() { return getToken(ClickHouseParser.MOVE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseMovePartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseMovePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseMovePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseMovePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseRenameContext extends AlterTableClauseContext {
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public List<NestedIdentifierContext> nestedIdentifier() {
			return getRuleContexts(NestedIdentifierContext.class);
		}
		public NestedIdentifierContext nestedIdentifier(int i) {
			return getRuleContext(NestedIdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseRenameContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseRename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseRename(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseFreezePartitionContext extends AlterTableClauseContext {
		public TerminalNode FREEZE() { return getToken(ClickHouseParser.FREEZE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseFreezePartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseFreezePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseFreezePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseFreezePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseClearColumnContext extends AlterTableClauseContext {
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseClearColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseClearColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseClearColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseClearColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModify(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseClearIndexContext extends AlterTableClauseContext {
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseClearIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseClearIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseClearIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseClearIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseRemoveTTLContext extends AlterTableClauseContext {
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public AlterTableClauseRemoveTTLContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseRemoveTTL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseRemoveTTL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseRemoveTTL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyCodecContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public CodecExprContext codecExpr() {
			return getRuleContext(CodecExprContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyCodecContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyCodec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyCodec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyCodec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAttachContext extends AlterTableClauseContext {
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseAttachContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseAttach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseAttach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseAttach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropProjectionContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseDropProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDropProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDropProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDropProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropIndexContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseDropIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDropIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDropIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyCommentContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ColumnCommentClauseContext columnCommentClause() {
			return getRuleContext(ColumnCommentClauseContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyCommentContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyTTLContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TtlClauseContext ttlClause() {
			return getRuleContext(TtlClauseContext.class,0);
		}
		public AlterTableClauseModifyTTLContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyTTL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyTTL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyTTL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAddProjectionContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseParser.ADD, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public TableProjectionDfntContext tableProjectionDfnt() {
			return getRuleContext(TableProjectionDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseAddProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseAddProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseAddProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAddColumnContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AddAfterColumnNameContext addAfterColumnName() {
			return getRuleContext(AddAfterColumnNameContext.class,0);
		}
		public AlterTableClauseAddColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableClauseContext alterTableClause() throws RecognitionException {
		AlterTableClauseContext _localctx = new AlterTableClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alterTableClause);
		int _la;
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new AlterTableClauseAddColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(ADD);
				setState(289);
				match(COLUMN);
				setState(293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(290);
					match(IF);
					setState(291);
					match(NOT);
					setState(292);
					match(EXISTS);
					}
					break;
				}
				setState(295);
				tableColumnDfnt();
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(296);
					addAfterColumnName();
					}
				}

				}
				break;
			case 2:
				_localctx = new AlterTableClauseAddIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(ADD);
				setState(300);
				match(INDEX);
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(301);
					match(IF);
					setState(302);
					match(NOT);
					setState(303);
					match(EXISTS);
					}
					break;
				}
				setState(306);
				tableIndexDfnt();
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(307);
					match(AFTER);
					setState(308);
					nestedIdentifier();
					}
				}

				}
				break;
			case 3:
				_localctx = new AlterTableClauseAddProjectionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(ADD);
				setState(312);
				match(PROJECTION);
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(313);
					match(IF);
					setState(314);
					match(NOT);
					setState(315);
					match(EXISTS);
					}
					break;
				}
				setState(318);
				tableProjectionDfnt();
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(319);
					match(AFTER);
					setState(320);
					nestedIdentifier();
					}
				}

				}
				break;
			case 4:
				_localctx = new AlterTableClauseAttachContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				match(ATTACH);
				setState(324);
				partitionClause();
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(325);
					match(FROM);
					setState(326);
					tableIdentifier();
					}
				}

				}
				break;
			case 5:
				_localctx = new AlterTableClauseClearColumnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				match(CLEAR);
				setState(330);
				match(COLUMN);
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(331);
					match(IF);
					setState(332);
					match(EXISTS);
					}
					break;
				}
				setState(335);
				nestedIdentifier();
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(336);
					match(IN);
					setState(337);
					partitionClause();
					}
				}

				}
				break;
			case 6:
				_localctx = new AlterTableClauseClearIndexContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				match(CLEAR);
				setState(341);
				match(INDEX);
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(342);
					match(IF);
					setState(343);
					match(EXISTS);
					}
					break;
				}
				setState(346);
				nestedIdentifier();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(347);
					match(IN);
					setState(348);
					partitionClause();
					}
				}

				}
				break;
			case 7:
				_localctx = new AlterTableClauseClearProjectionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(351);
				match(CLEAR);
				setState(352);
				match(PROJECTION);
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(353);
					match(IF);
					setState(354);
					match(EXISTS);
					}
					break;
				}
				setState(357);
				nestedIdentifier();
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(358);
					match(IN);
					setState(359);
					partitionClause();
					}
				}

				}
				break;
			case 8:
				_localctx = new AlterTableClauseCommentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(362);
				match(COMMENT);
				setState(363);
				match(COLUMN);
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(364);
					match(IF);
					setState(365);
					match(EXISTS);
					}
					break;
				}
				setState(368);
				nestedIdentifier();
				setState(369);
				match(STRING_LITERAL);
				}
				break;
			case 9:
				_localctx = new AlterTableClauseDeleteContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(371);
				match(DELETE);
				setState(372);
				match(WHERE);
				setState(373);
				columnExpr(0);
				}
				break;
			case 10:
				_localctx = new AlterTableClauseDetachContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(374);
				match(DETACH);
				setState(375);
				partitionClause();
				}
				break;
			case 11:
				_localctx = new AlterTableClauseDropColumnContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(376);
				match(DROP);
				setState(377);
				match(COLUMN);
				setState(380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(378);
					match(IF);
					setState(379);
					match(EXISTS);
					}
					break;
				}
				setState(382);
				nestedIdentifier();
				}
				break;
			case 12:
				_localctx = new AlterTableClauseDropIndexContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(383);
				match(DROP);
				setState(384);
				match(INDEX);
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(385);
					match(IF);
					setState(386);
					match(EXISTS);
					}
					break;
				}
				setState(389);
				nestedIdentifier();
				}
				break;
			case 13:
				_localctx = new AlterTableClauseDropProjectionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(390);
				match(DROP);
				setState(391);
				match(PROJECTION);
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(392);
					match(IF);
					setState(393);
					match(EXISTS);
					}
					break;
				}
				setState(396);
				nestedIdentifier();
				}
				break;
			case 14:
				_localctx = new AlterTableClauseDropPartitionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(397);
				match(DROP);
				setState(398);
				partitionClause();
				}
				break;
			case 15:
				_localctx = new AlterTableClauseFreezePartitionContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(399);
				match(FREEZE);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(400);
					partitionClause();
					}
				}

				}
				break;
			case 16:
				_localctx = new AlterTableClauseMaterializeIndexContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(403);
				match(MATERIALIZE);
				setState(404);
				match(INDEX);
				setState(407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(405);
					match(IF);
					setState(406);
					match(EXISTS);
					}
					break;
				}
				setState(409);
				nestedIdentifier();
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(410);
					match(IN);
					setState(411);
					partitionClause();
					}
				}

				}
				break;
			case 17:
				_localctx = new AlterTableClauseMaterializeProjectionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(414);
				match(MATERIALIZE);
				setState(415);
				match(PROJECTION);
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(416);
					match(IF);
					setState(417);
					match(EXISTS);
					}
					break;
				}
				setState(420);
				nestedIdentifier();
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(421);
					match(IN);
					setState(422);
					partitionClause();
					}
				}

				}
				break;
			case 18:
				_localctx = new AlterTableClauseModifyCodecContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(425);
				match(MODIFY);
				setState(426);
				match(COLUMN);
				setState(429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(427);
					match(IF);
					setState(428);
					match(EXISTS);
					}
					break;
				}
				setState(431);
				nestedIdentifier();
				setState(432);
				codecExpr();
				}
				break;
			case 19:
				_localctx = new AlterTableClauseModifyCommentContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(434);
				match(MODIFY);
				setState(435);
				match(COLUMN);
				setState(438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(436);
					match(IF);
					setState(437);
					match(EXISTS);
					}
					break;
				}
				setState(440);
				nestedIdentifier();
				setState(441);
				columnCommentClause();
				}
				break;
			case 20:
				_localctx = new AlterTableClauseModifyRemoveContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(443);
				match(MODIFY);
				setState(444);
				match(COLUMN);
				setState(447);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(445);
					match(IF);
					setState(446);
					match(EXISTS);
					}
					break;
				}
				setState(449);
				nestedIdentifier();
				setState(450);
				match(REMOVE);
				setState(451);
				tableColumnPropertyType();
				}
				break;
			case 21:
				_localctx = new AlterTableClauseModifyContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(453);
				match(MODIFY);
				setState(454);
				match(COLUMN);
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(455);
					match(IF);
					setState(456);
					match(EXISTS);
					}
					break;
				}
				setState(459);
				tableColumnDfnt();
				}
				break;
			case 22:
				_localctx = new AlterTableClauseModifyOrderByContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(460);
				match(MODIFY);
				setState(461);
				match(ORDER);
				setState(462);
				match(BY);
				setState(463);
				columnExpr(0);
				}
				break;
			case 23:
				_localctx = new AlterTableClauseModifyTTLContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(464);
				match(MODIFY);
				setState(465);
				ttlClause();
				}
				break;
			case 24:
				_localctx = new AlterTableClauseMovePartitionContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(466);
				match(MOVE);
				setState(467);
				partitionClause();
				setState(477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(468);
					match(TO);
					setState(469);
					match(DISK);
					setState(470);
					match(STRING_LITERAL);
					}
					break;
				case 2:
					{
					setState(471);
					match(TO);
					setState(472);
					match(VOLUME);
					setState(473);
					match(STRING_LITERAL);
					}
					break;
				case 3:
					{
					setState(474);
					match(TO);
					setState(475);
					match(TABLE);
					setState(476);
					tableIdentifier();
					}
					break;
				}
				}
				break;
			case 25:
				_localctx = new AlterTableClauseRemoveTTLContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(479);
				match(REMOVE);
				setState(480);
				match(TTL);
				}
				break;
			case 26:
				_localctx = new AlterTableClauseRenameContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(481);
				match(RENAME);
				setState(482);
				match(COLUMN);
				setState(485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(483);
					match(IF);
					setState(484);
					match(EXISTS);
					}
					break;
				}
				setState(487);
				nestedIdentifier();
				setState(488);
				match(TO);
				setState(489);
				nestedIdentifier();
				}
				break;
			case 27:
				_localctx = new AlterTableClauseReplaceContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(491);
				match(REPLACE);
				setState(492);
				partitionClause();
				setState(493);
				match(FROM);
				setState(494);
				tableIdentifier();
				}
				break;
			case 28:
				_localctx = new AlterTableClauseUpdateContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(496);
				match(UPDATE);
				setState(497);
				assignmentExprList();
				setState(498);
				whereClause();
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

	public static class AddAfterColumnNameContext extends ParserRuleContext {
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AddAfterColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addAfterColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAddAfterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAddAfterColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAddAfterColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddAfterColumnNameContext addAfterColumnName() throws RecognitionException {
		AddAfterColumnNameContext _localctx = new AddAfterColumnNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addAfterColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(AFTER);
			setState(503);
			nestedIdentifier();
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

	public static class AssignmentExprListContext extends ParserRuleContext {
		public List<AssignmentExprContext> assignmentExpr() {
			return getRuleContexts(AssignmentExprContext.class);
		}
		public AssignmentExprContext assignmentExpr(int i) {
			return getRuleContext(AssignmentExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public AssignmentExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAssignmentExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAssignmentExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAssignmentExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExprListContext assignmentExprList() throws RecognitionException {
		AssignmentExprListContext _localctx = new AssignmentExprListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			assignmentExpr();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(506);
				match(COMMA);
				setState(507);
				assignmentExpr();
				}
				}
				setState(512);
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

	public static class AssignmentExprContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AssignmentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAssignmentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExprContext assignmentExpr() throws RecognitionException {
		AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignmentExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			nestedIdentifier();
			setState(514);
			match(EQ_SINGLE);
			setState(515);
			columnExpr(0);
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

	public static class TableColumnPropertyTypeContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TableColumnPropertyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnPropertyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableColumnPropertyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableColumnPropertyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableColumnPropertyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnPropertyTypeContext tableColumnPropertyType() throws RecognitionException {
		TableColumnPropertyTypeContext _localctx = new TableColumnPropertyTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableColumnPropertyType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << CODEC) | (1L << COMMENT) | (1L << DEFAULT))) != 0) || _la==MATERIALIZED || _la==TTL) ) {
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

	public static class PartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public PartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterPartitionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitPartitionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPartitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionClauseContext partitionClause() throws RecognitionException {
		PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_partitionClause);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(PARTITION);
				setState(520);
				columnExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				match(PARTITION);
				setState(522);
				match(ID);
				setState(523);
				match(STRING_LITERAL);
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

	public static class AttachStmtContext extends ParserRuleContext {
		public AttachStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attachStmt; }
	 
		public AttachStmtContext() { }
		public void copyFrom(AttachStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttachDictionaryStmtContext extends AttachStmtContext {
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public AttachDictionaryStmtContext(AttachStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAttachDictionaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAttachDictionaryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAttachDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttachStmtContext attachStmt() throws RecognitionException {
		AttachStmtContext _localctx = new AttachStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attachStmt);
		int _la;
		try {
			_localctx = new AttachDictionaryStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(ATTACH);
			setState(527);
			match(DICTIONARY);
			setState(528);
			tableIdentifier();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(529);
				clusterClause();
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

	public static class CheckStmtContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public CheckStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCheckStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCheckStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCheckStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckStmtContext checkStmt() throws RecognitionException {
		CheckStmtContext _localctx = new CheckStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_checkStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(CHECK);
			setState(533);
			match(TABLE);
			setState(534);
			tableIdentifier();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(535);
				partitionClause();
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

	public static class CreateStmtContext extends ParserRuleContext {
		public CreateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStmt; }
	 
		public CreateStmtContext() { }
		public void copyFrom(CreateStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateViewStmtContext extends CreateStmtContext {
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public CreateViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateViewStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateViewStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDictionaryStmtContext extends CreateStmtContext {
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public DictionarySchemaClauseContext dictionarySchemaClause() {
			return getRuleContext(DictionarySchemaClauseContext.class,0);
		}
		public DictionaryEngineClauseContext dictionaryEngineClause() {
			return getRuleContext(DictionaryEngineClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public CreateDictionaryStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateDictionaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateDictionaryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDatabaseStmtContext extends CreateStmtContext {
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public EngineExprContext engineExpr() {
			return getRuleContext(EngineExprContext.class,0);
		}
		public CreateDatabaseStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateDatabaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateLiveViewStmtContext extends CreateStmtContext {
		public TerminalNode LIVE() { return getToken(ClickHouseParser.LIVE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIMEOUT() { return getToken(ClickHouseParser.TIMEOUT, 0); }
		public DestinationClauseContext destinationClause() {
			return getRuleContext(DestinationClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public CreateLiveViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateLiveViewStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateLiveViewStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateLiveViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateMaterializedViewStmtContext extends CreateStmtContext {
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public DestinationClauseContext destinationClause() {
			return getRuleContext(DestinationClauseContext.class,0);
		}
		public EngineClauseContext engineClause() {
			return getRuleContext(EngineClauseContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public TerminalNode POPULATE() { return getToken(ClickHouseParser.POPULATE, 0); }
		public CreateMaterializedViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateMaterializedViewStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateMaterializedViewStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateMaterializedViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableStmtContext extends CreateStmtContext {
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public EngineClauseContext engineClause() {
			return getRuleContext(EngineClauseContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TableCommentClauseContext tableCommentClause() {
			return getRuleContext(TableCommentClauseContext.class,0);
		}
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public CreateTableStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStmtContext createStmt() throws RecognitionException {
		CreateStmtContext _localctx = new CreateStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createStmt);
		int _la;
		try {
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				_localctx = new CreateDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(539);
				match(DATABASE);
				setState(543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(540);
					match(IF);
					setState(541);
					match(NOT);
					setState(542);
					match(EXISTS);
					}
					break;
				}
				setState(545);
				databaseIdentifier();
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(546);
					clusterClause();
					}
				}

				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENGINE) {
					{
					setState(549);
					engineExpr();
					}
				}

				}
				break;
			case 2:
				_localctx = new CreateDictionaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ATTACH:
					{
					setState(552);
					match(ATTACH);
					}
					break;
				case CREATE:
					{
					setState(553);
					match(CREATE);
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OR) {
						{
						setState(554);
						match(OR);
						setState(555);
						match(REPLACE);
						}
					}

					}
					break;
				case REPLACE:
					{
					setState(558);
					match(REPLACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(561);
				match(DICTIONARY);
				setState(565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(562);
					match(IF);
					setState(563);
					match(NOT);
					setState(564);
					match(EXISTS);
					}
					break;
				}
				setState(567);
				tableIdentifier();
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(568);
					uuidClause();
					}
				}

				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(571);
					clusterClause();
					}
				}

				setState(574);
				dictionarySchemaClause();
				setState(575);
				dictionaryEngineClause();
				}
				break;
			case 3:
				_localctx = new CreateLiveViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(578);
				match(LIVE);
				setState(579);
				match(VIEW);
				setState(583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(580);
					match(IF);
					setState(581);
					match(NOT);
					setState(582);
					match(EXISTS);
					}
					break;
				}
				setState(585);
				tableIdentifier();
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(586);
					uuidClause();
					}
				}

				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(589);
					clusterClause();
					}
				}

				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(592);
					match(WITH);
					setState(593);
					match(TIMEOUT);
					setState(595);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DECIMAL_LITERAL) {
						{
						setState(594);
						match(DECIMAL_LITERAL);
						}
					}

					}
				}

				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(599);
					destinationClause();
					}
				}

				setState(603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(602);
					tableSchemaClause();
					}
					break;
				}
				setState(605);
				subqueryClause();
				}
				break;
			case 4:
				_localctx = new CreateMaterializedViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(607);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(608);
				match(MATERIALIZED);
				setState(609);
				match(VIEW);
				setState(613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(610);
					match(IF);
					setState(611);
					match(NOT);
					setState(612);
					match(EXISTS);
					}
					break;
				}
				setState(615);
				tableIdentifier();
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(616);
					uuidClause();
					}
				}

				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(619);
					clusterClause();
					}
				}

				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==LPAREN) {
					{
					setState(622);
					tableSchemaClause();
					}
				}

				setState(630);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TO:
					{
					setState(625);
					destinationClause();
					}
					break;
				case ENGINE:
					{
					setState(626);
					engineClause();
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==POPULATE) {
						{
						setState(627);
						match(POPULATE);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(632);
				subqueryClause();
				}
				break;
			case 5:
				_localctx = new CreateTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(641);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ATTACH:
					{
					setState(634);
					match(ATTACH);
					}
					break;
				case CREATE:
					{
					setState(635);
					match(CREATE);
					setState(638);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OR) {
						{
						setState(636);
						match(OR);
						setState(637);
						match(REPLACE);
						}
					}

					}
					break;
				case REPLACE:
					{
					setState(640);
					match(REPLACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(643);
					match(TEMPORARY);
					}
				}

				setState(646);
				match(TABLE);
				setState(650);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(647);
					match(IF);
					setState(648);
					match(NOT);
					setState(649);
					match(EXISTS);
					}
					break;
				}
				setState(652);
				tableIdentifier();
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(653);
					uuidClause();
					}
				}

				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(656);
					clusterClause();
					}
				}

				setState(660);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(659);
					tableSchemaClause();
					}
					break;
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENGINE) {
					{
					setState(662);
					engineClause();
					}
				}

				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(665);
					subqueryClause();
					}
				}

				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(668);
					tableCommentClause();
					}
				}

				}
				break;
			case 6:
				_localctx = new CreateViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(671);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(672);
					match(OR);
					setState(673);
					match(REPLACE);
					}
				}

				setState(676);
				match(VIEW);
				setState(680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(677);
					match(IF);
					setState(678);
					match(NOT);
					setState(679);
					match(EXISTS);
					}
					break;
				}
				setState(682);
				tableIdentifier();
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(683);
					uuidClause();
					}
				}

				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(686);
					clusterClause();
					}
				}

				setState(690);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(689);
					tableSchemaClause();
					}
					break;
				}
				setState(692);
				subqueryClause();
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

	public static class DictionarySchemaClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<DictionaryAttrDfntContext> dictionaryAttrDfnt() {
			return getRuleContexts(DictionaryAttrDfntContext.class);
		}
		public DictionaryAttrDfntContext dictionaryAttrDfnt(int i) {
			return getRuleContext(DictionaryAttrDfntContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public DictionarySchemaClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionarySchemaClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionarySchemaClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionarySchemaClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionarySchemaClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionarySchemaClauseContext dictionarySchemaClause() throws RecognitionException {
		DictionarySchemaClauseContext _localctx = new DictionarySchemaClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dictionarySchemaClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(LPAREN);
			setState(697);
			dictionaryAttrDfnt();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(698);
				match(COMMA);
				setState(699);
				dictionaryAttrDfnt();
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(705);
			match(RPAREN);
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

	public static class DictionaryAttrDfntContext extends ParserRuleContext {
		public Dictionary<String> attrs = new Dictionary<>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(ClickHouseParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(ClickHouseParser.DEFAULT, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> EXPRESSION() { return getTokens(ClickHouseParser.EXPRESSION); }
		public TerminalNode EXPRESSION(int i) {
			return getToken(ClickHouseParser.EXPRESSION, i);
		}
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public List<TerminalNode> HIERARCHICAL() { return getTokens(ClickHouseParser.HIERARCHICAL); }
		public TerminalNode HIERARCHICAL(int i) {
			return getToken(ClickHouseParser.HIERARCHICAL, i);
		}
		public List<TerminalNode> INJECTIVE() { return getTokens(ClickHouseParser.INJECTIVE); }
		public TerminalNode INJECTIVE(int i) {
			return getToken(ClickHouseParser.INJECTIVE, i);
		}
		public List<TerminalNode> IS_OBJECT_ID() { return getTokens(ClickHouseParser.IS_OBJECT_ID); }
		public TerminalNode IS_OBJECT_ID(int i) {
			return getToken(ClickHouseParser.IS_OBJECT_ID, i);
		}
		public DictionaryAttrDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryAttrDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionaryAttrDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionaryAttrDfnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryAttrDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryAttrDfntContext dictionaryAttrDfnt() throws RecognitionException {
		DictionaryAttrDfntContext _localctx = new DictionaryAttrDfntContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dictionaryAttrDfnt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			identifier();
			setState(708);
			columnTypeExpr();
			setState(730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(728);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(709);
						if (!(!_localctx.attrs.count("default"))) throw new FailedPredicateException(this, "!$attrs.count(\"default\")");
						setState(710);
						match(DEFAULT);
						setState(711);
						literal();
						_localctx.attrs.insert("default");
						}
						break;
					case 2:
						{
						setState(714);
						if (!(!_localctx.attrs.count("expression"))) throw new FailedPredicateException(this, "!$attrs.count(\"expression\")");
						setState(715);
						match(EXPRESSION);
						setState(716);
						columnExpr(0);
						_localctx.attrs.insert("expression");
						}
						break;
					case 3:
						{
						setState(719);
						if (!(!_localctx.attrs.count("hierarchical"))) throw new FailedPredicateException(this, "!$attrs.count(\"hierarchical\")");
						setState(720);
						match(HIERARCHICAL);
						_localctx.attrs.insert("hierarchical");
						}
						break;
					case 4:
						{
						setState(722);
						if (!(!_localctx.attrs.count("injective"))) throw new FailedPredicateException(this, "!$attrs.count(\"injective\")");
						setState(723);
						match(INJECTIVE);
						_localctx.attrs.insert("injective");
						}
						break;
					case 5:
						{
						setState(725);
						if (!(!_localctx.attrs.count("is_object_id"))) throw new FailedPredicateException(this, "!$attrs.count(\"is_object_id\")");
						setState(726);
						match(IS_OBJECT_ID);
						_localctx.attrs.insert("is_object_id");
						}
						break;
					}
					} 
				}
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class DictionaryEngineClauseContext extends ParserRuleContext {
		public Dictionary<String> clauses = new Dictionary<>();
		public DictionaryPrimaryKeyClauseContext dictionaryPrimaryKeyClause() {
			return getRuleContext(DictionaryPrimaryKeyClauseContext.class,0);
		}
		public List<SourceClauseContext> sourceClause() {
			return getRuleContexts(SourceClauseContext.class);
		}
		public SourceClauseContext sourceClause(int i) {
			return getRuleContext(SourceClauseContext.class,i);
		}
		public List<LifetimeClauseContext> lifetimeClause() {
			return getRuleContexts(LifetimeClauseContext.class);
		}
		public LifetimeClauseContext lifetimeClause(int i) {
			return getRuleContext(LifetimeClauseContext.class,i);
		}
		public List<LayoutClauseContext> layoutClause() {
			return getRuleContexts(LayoutClauseContext.class);
		}
		public LayoutClauseContext layoutClause(int i) {
			return getRuleContext(LayoutClauseContext.class,i);
		}
		public List<RangeClauseContext> rangeClause() {
			return getRuleContexts(RangeClauseContext.class);
		}
		public RangeClauseContext rangeClause(int i) {
			return getRuleContext(RangeClauseContext.class,i);
		}
		public List<DictionarySettingsClauseContext> dictionarySettingsClause() {
			return getRuleContexts(DictionarySettingsClauseContext.class);
		}
		public DictionarySettingsClauseContext dictionarySettingsClause(int i) {
			return getRuleContext(DictionarySettingsClauseContext.class,i);
		}
		public DictionaryEngineClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryEngineClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionaryEngineClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionaryEngineClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryEngineClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryEngineClauseContext dictionaryEngineClause() throws RecognitionException {
		DictionaryEngineClauseContext _localctx = new DictionaryEngineClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dictionaryEngineClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(733);
				dictionaryPrimaryKeyClause();
				}
				break;
			}
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(756);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(736);
						if (!(!_localctx.clauses.count("source"))) throw new FailedPredicateException(this, "!$clauses.count(\"source\")");
						setState(737);
						sourceClause();
						_localctx.clauses.insert("source");
						}
						break;
					case 2:
						{
						setState(740);
						if (!(!_localctx.clauses.count("lifetime"))) throw new FailedPredicateException(this, "!$clauses.count(\"lifetime\")");
						setState(741);
						lifetimeClause();
						_localctx.clauses.insert("lifetime");
						}
						break;
					case 3:
						{
						setState(744);
						if (!(!_localctx.clauses.count("layout"))) throw new FailedPredicateException(this, "!$clauses.count(\"layout\")");
						setState(745);
						layoutClause();
						_localctx.clauses.insert("layout");
						}
						break;
					case 4:
						{
						setState(748);
						if (!(!_localctx.clauses.count("range"))) throw new FailedPredicateException(this, "!$clauses.count(\"range\")");
						setState(749);
						rangeClause();
						_localctx.clauses.insert("range");
						}
						break;
					case 5:
						{
						setState(752);
						if (!(!_localctx.clauses.count("settings"))) throw new FailedPredicateException(this, "!$clauses.count(\"settings\")");
						setState(753);
						dictionarySettingsClause();
						_localctx.clauses.insert("settings");
						}
						break;
					}
					} 
				}
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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

	public static class DictionaryPrimaryKeyClauseContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public DictionaryPrimaryKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryPrimaryKeyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionaryPrimaryKeyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionaryPrimaryKeyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryPrimaryKeyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryPrimaryKeyClauseContext dictionaryPrimaryKeyClause() throws RecognitionException {
		DictionaryPrimaryKeyClauseContext _localctx = new DictionaryPrimaryKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dictionaryPrimaryKeyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(PRIMARY);
			setState(762);
			match(KEY);
			setState(763);
			columnExprList();
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

	public static class DictionaryArgExprContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public DictionaryArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionaryArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionaryArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryArgExprContext dictionaryArgExpr() throws RecognitionException {
		DictionaryArgExprContext _localctx = new DictionaryArgExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dictionaryArgExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			identifier();
			setState(772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case CURRENT:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOLLOWING:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case OVER:
			case PARTITION:
			case POPULATE:
			case PRECEDING:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case ROW:
			case ROWS:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNBOUNDED:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				{
				setState(766);
				identifier();
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(767);
					match(LPAREN);
					setState(768);
					match(RPAREN);
					}
				}

				}
				break;
			case INF:
			case NAN_SQL:
			case NULL_SQL:
			case FLOATING_LITERAL:
			case OCTAL_LITERAL:
			case DECIMAL_LITERAL:
			case HEXADECIMAL_LITERAL:
			case STRING_LITERAL:
			case DASH:
			case DOT:
			case PLUS:
				{
				setState(771);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SourceClauseContext extends ParserRuleContext {
		public TerminalNode SOURCE() { return getToken(ClickHouseParser.SOURCE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public List<DictionaryArgExprContext> dictionaryArgExpr() {
			return getRuleContexts(DictionaryArgExprContext.class);
		}
		public DictionaryArgExprContext dictionaryArgExpr(int i) {
			return getRuleContext(DictionaryArgExprContext.class,i);
		}
		public SourceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSourceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSourceClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSourceClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceClauseContext sourceClause() throws RecognitionException {
		SourceClauseContext _localctx = new SourceClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sourceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(SOURCE);
			setState(775);
			match(LPAREN);
			setState(776);
			identifier();
			setState(777);
			match(LPAREN);
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
				{
				{
				setState(778);
				dictionaryArgExpr();
				}
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(784);
			match(RPAREN);
			setState(785);
			match(RPAREN);
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

	public static class LifetimeClauseContext extends ParserRuleContext {
		public TerminalNode LIFETIME() { return getToken(ClickHouseParser.LIFETIME, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(ClickHouseParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(ClickHouseParser.DECIMAL_LITERAL, i);
		}
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public LifetimeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLifetimeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLifetimeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLifetimeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeClauseContext lifetimeClause() throws RecognitionException {
		LifetimeClauseContext _localctx = new LifetimeClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lifetimeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(LIFETIME);
			setState(788);
			match(LPAREN);
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				{
				setState(789);
				match(DECIMAL_LITERAL);
				}
				break;
			case MIN:
				{
				setState(790);
				match(MIN);
				setState(791);
				match(DECIMAL_LITERAL);
				setState(792);
				match(MAX);
				setState(793);
				match(DECIMAL_LITERAL);
				}
				break;
			case MAX:
				{
				setState(794);
				match(MAX);
				setState(795);
				match(DECIMAL_LITERAL);
				setState(796);
				match(MIN);
				setState(797);
				match(DECIMAL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(800);
			match(RPAREN);
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

	public static class LayoutClauseContext extends ParserRuleContext {
		public TerminalNode LAYOUT() { return getToken(ClickHouseParser.LAYOUT, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public List<DictionaryArgExprContext> dictionaryArgExpr() {
			return getRuleContexts(DictionaryArgExprContext.class);
		}
		public DictionaryArgExprContext dictionaryArgExpr(int i) {
			return getRuleContext(DictionaryArgExprContext.class,i);
		}
		public LayoutClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLayoutClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLayoutClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLayoutClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutClauseContext layoutClause() throws RecognitionException {
		LayoutClauseContext _localctx = new LayoutClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_layoutClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(LAYOUT);
			setState(803);
			match(LPAREN);
			setState(804);
			identifier();
			setState(805);
			match(LPAREN);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
				{
				{
				setState(806);
				dictionaryArgExpr();
				}
				}
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(812);
			match(RPAREN);
			setState(813);
			match(RPAREN);
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

	public static class RangeClauseContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(ClickHouseParser.RANGE, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitRangeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(RANGE);
			setState(816);
			match(LPAREN);
			setState(827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				{
				setState(817);
				match(MIN);
				setState(818);
				identifier();
				setState(819);
				match(MAX);
				setState(820);
				identifier();
				}
				break;
			case MAX:
				{
				setState(822);
				match(MAX);
				setState(823);
				identifier();
				setState(824);
				match(MIN);
				setState(825);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(829);
			match(RPAREN);
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

	public static class DictionarySettingsClauseContext extends ParserRuleContext {
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public DictionarySettingsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionarySettingsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionarySettingsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionarySettingsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionarySettingsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionarySettingsClauseContext dictionarySettingsClause() throws RecognitionException {
		DictionarySettingsClauseContext _localctx = new DictionarySettingsClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dictionarySettingsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(SETTINGS);
			setState(832);
			match(LPAREN);
			setState(833);
			settingExprList();
			setState(834);
			match(RPAREN);
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

	public static class ClusterClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public TerminalNode CLUSTER() { return getToken(ClickHouseParser.CLUSTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterClusterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitClusterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitClusterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClusterClauseContext clusterClause() throws RecognitionException {
		ClusterClauseContext _localctx = new ClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_clusterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(ON);
			setState(837);
			match(CLUSTER);
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case CURRENT:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOLLOWING:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case OVER:
			case PARTITION:
			case POPULATE:
			case PRECEDING:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case ROW:
			case ROWS:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNBOUNDED:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				{
				setState(838);
				identifier();
				}
				break;
			case STRING_LITERAL:
				{
				setState(839);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class UuidClauseContext extends ParserRuleContext {
		public TerminalNode UUID() { return getToken(ClickHouseParser.UUID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public UuidClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uuidClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterUuidClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitUuidClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitUuidClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UuidClauseContext uuidClause() throws RecognitionException {
		UuidClauseContext _localctx = new UuidClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_uuidClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(UUID);
			setState(843);
			match(STRING_LITERAL);
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

	public static class DestinationClauseContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public DestinationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destinationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDestinationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDestinationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDestinationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationClauseContext destinationClause() throws RecognitionException {
		DestinationClauseContext _localctx = new DestinationClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_destinationClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(TO);
			setState(846);
			tableIdentifier();
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

	public static class SubqueryClauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public SubqueryClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSubqueryClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSubqueryClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSubqueryClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryClauseContext subqueryClause() throws RecognitionException {
		SubqueryClauseContext _localctx = new SubqueryClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_subqueryClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(AS);
			setState(849);
			selectUnionStmt();
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

	public static class TableSchemaClauseContext extends ParserRuleContext {
		public TableSchemaClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSchemaClause; }
	 
		public TableSchemaClauseContext() { }
		public void copyFrom(TableSchemaClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SchemaAsTableClauseContext extends TableSchemaClauseContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SchemaAsTableClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSchemaAsTableClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSchemaAsTableClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSchemaAsTableClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SchemaAsFunctionClauseContext extends TableSchemaClauseContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public SchemaAsFunctionClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSchemaAsFunctionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSchemaAsFunctionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSchemaAsFunctionClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SchemaDescriptionClauseContext extends TableSchemaClauseContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<TableElementExprContext> tableElementExpr() {
			return getRuleContexts(TableElementExprContext.class);
		}
		public TableElementExprContext tableElementExpr(int i) {
			return getRuleContext(TableElementExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public SchemaDescriptionClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSchemaDescriptionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSchemaDescriptionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSchemaDescriptionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSchemaClauseContext tableSchemaClause() throws RecognitionException {
		TableSchemaClauseContext _localctx = new TableSchemaClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tableSchemaClause);
		int _la;
		try {
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new SchemaDescriptionClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				match(LPAREN);
				setState(852);
				tableElementExpr();
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(853);
					match(COMMA);
					setState(854);
					tableElementExpr();
					}
					}
					setState(859);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(860);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new SchemaAsTableClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(862);
				match(AS);
				setState(863);
				tableIdentifier();
				}
				break;
			case 3:
				_localctx = new SchemaAsFunctionClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
				match(AS);
				setState(865);
				tableFunctionExpr();
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

	public static class EngineClauseContext extends ParserRuleContext {
		public Dictionary<String> clauses = new Dictionary<>();
		public EngineExprContext engineExpr() {
			return getRuleContext(EngineExprContext.class,0);
		}
		public List<OrderByClauseContext> orderByClause() {
			return getRuleContexts(OrderByClauseContext.class);
		}
		public OrderByClauseContext orderByClause(int i) {
			return getRuleContext(OrderByClauseContext.class,i);
		}
		public List<PartitionByClauseContext> partitionByClause() {
			return getRuleContexts(PartitionByClauseContext.class);
		}
		public PartitionByClauseContext partitionByClause(int i) {
			return getRuleContext(PartitionByClauseContext.class,i);
		}
		public List<PrimaryKeyClauseContext> primaryKeyClause() {
			return getRuleContexts(PrimaryKeyClauseContext.class);
		}
		public PrimaryKeyClauseContext primaryKeyClause(int i) {
			return getRuleContext(PrimaryKeyClauseContext.class,i);
		}
		public List<SampleByClauseContext> sampleByClause() {
			return getRuleContexts(SampleByClauseContext.class);
		}
		public SampleByClauseContext sampleByClause(int i) {
			return getRuleContext(SampleByClauseContext.class,i);
		}
		public List<TtlClauseContext> ttlClause() {
			return getRuleContexts(TtlClauseContext.class);
		}
		public TtlClauseContext ttlClause(int i) {
			return getRuleContext(TtlClauseContext.class,i);
		}
		public List<SettingsClauseContext> settingsClause() {
			return getRuleContexts(SettingsClauseContext.class);
		}
		public SettingsClauseContext settingsClause(int i) {
			return getRuleContext(SettingsClauseContext.class,i);
		}
		public EngineClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterEngineClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitEngineClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitEngineClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineClauseContext engineClause() throws RecognitionException {
		EngineClauseContext _localctx = new EngineClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_engineClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			engineExpr();
			setState(895);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(893);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						setState(869);
						if (!(!_localctx.clauses.count("orderByClause"))) throw new FailedPredicateException(this, "!$clauses.count(\"orderByClause\")");
						setState(870);
						orderByClause();
						_localctx.clauses.insert("orderByClause");
						}
						break;
					case 2:
						{
						setState(873);
						if (!(!_localctx.clauses.count("partitionByClause"))) throw new FailedPredicateException(this, "!$clauses.count(\"partitionByClause\")");
						setState(874);
						partitionByClause();
						_localctx.clauses.insert("partitionByClause");
						}
						break;
					case 3:
						{
						setState(877);
						if (!(!_localctx.clauses.count("primaryKeyClause"))) throw new FailedPredicateException(this, "!$clauses.count(\"primaryKeyClause\")");
						setState(878);
						primaryKeyClause();
						_localctx.clauses.insert("primaryKeyClause");
						}
						break;
					case 4:
						{
						setState(881);
						if (!(!_localctx.clauses.count("sampleByClause"))) throw new FailedPredicateException(this, "!$clauses.count(\"sampleByClause\")");
						setState(882);
						sampleByClause();
						_localctx.clauses.insert("sampleByClause");
						}
						break;
					case 5:
						{
						setState(885);
						if (!(!_localctx.clauses.count("ttlClause"))) throw new FailedPredicateException(this, "!$clauses.count(\"ttlClause\")");
						setState(886);
						ttlClause();
						_localctx.clauses.insert("ttlClause");
						}
						break;
					case 6:
						{
						setState(889);
						if (!(!_localctx.clauses.count("settingsClause"))) throw new FailedPredicateException(this, "!$clauses.count(\"settingsClause\")");
						setState(890);
						settingsClause();
						_localctx.clauses.insert("settingsClause");
						}
						break;
					}
					} 
				}
				setState(897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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

	public static class TableCommentClauseContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TableCommentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableCommentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableCommentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableCommentClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableCommentClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableCommentClauseContext tableCommentClause() throws RecognitionException {
		TableCommentClauseContext _localctx = new TableCommentClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tableCommentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(COMMENT);
			setState(899);
			match(STRING_LITERAL);
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

	public static class ColumnCommentClauseContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ColumnCommentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnCommentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnCommentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnCommentClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnCommentClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnCommentClauseContext columnCommentClause() throws RecognitionException {
		ColumnCommentClauseContext _localctx = new ColumnCommentClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_columnCommentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(COMMENT);
			setState(902);
			match(STRING_LITERAL);
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

	public static class PartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterPartitionByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitPartitionByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPartitionByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionByClauseContext partitionByClause() throws RecognitionException {
		PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_partitionByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(PARTITION);
			setState(905);
			match(BY);
			setState(906);
			columnExpr(0);
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

	public static class PrimaryKeyClauseContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PrimaryKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterPrimaryKeyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitPrimaryKeyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPrimaryKeyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyClauseContext primaryKeyClause() throws RecognitionException {
		PrimaryKeyClauseContext _localctx = new PrimaryKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primaryKeyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(PRIMARY);
			setState(909);
			match(KEY);
			setState(910);
			columnExpr(0);
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

	public static class SampleByClauseContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public SampleByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSampleByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSampleByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSampleByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleByClauseContext sampleByClause() throws RecognitionException {
		SampleByClauseContext _localctx = new SampleByClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sampleByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(SAMPLE);
			setState(913);
			match(BY);
			setState(914);
			columnExpr(0);
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

	public static class TtlClauseContext extends ParserRuleContext {
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public List<TtlExprContext> ttlExpr() {
			return getRuleContexts(TtlExprContext.class);
		}
		public TtlExprContext ttlExpr(int i) {
			return getRuleContext(TtlExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public TtlClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttlClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTtlClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTtlClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTtlClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TtlClauseContext ttlClause() throws RecognitionException {
		TtlClauseContext _localctx = new TtlClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ttlClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(TTL);
			setState(917);
			ttlExpr();
			setState(922);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(918);
					match(COMMA);
					setState(919);
					ttlExpr();
					}
					} 
				}
				setState(924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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

	public static class EngineExprContext extends ParserRuleContext {
		public TerminalNode ENGINE() { return getToken(ClickHouseParser.ENGINE, 0); }
		public IdentifierOrNullContext identifierOrNull() {
			return getRuleContext(IdentifierOrNullContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public EngineExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterEngineExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitEngineExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitEngineExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineExprContext engineExpr() throws RecognitionException {
		EngineExprContext _localctx = new EngineExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_engineExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(ENGINE);
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_SINGLE) {
				{
				setState(926);
				match(EQ_SINGLE);
				}
			}

			setState(929);
			identifierOrNull();
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(930);
				match(LPAREN);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
					setState(931);
					columnExprList();
					}
				}

				setState(934);
				match(RPAREN);
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

	public static class TableElementExprContext extends ParserRuleContext {
		public TableElementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElementExpr; }
	 
		public TableElementExprContext() { }
		public void copyFrom(TableElementExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableElementExprProjectionContext extends TableElementExprContext {
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public TableProjectionDfntContext tableProjectionDfnt() {
			return getRuleContext(TableProjectionDfntContext.class,0);
		}
		public TableElementExprProjectionContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableElementExprProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableElementExprProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableElementExprProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableElementExprConstraintContext extends TableElementExprContext {
		public TerminalNode CONSTRAINT() { return getToken(ClickHouseParser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TableElementExprConstraintContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableElementExprConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableElementExprConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableElementExprConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableElementExprColumnContext extends TableElementExprContext {
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TableElementExprColumnContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableElementExprColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableElementExprColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableElementExprColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableElementExprIndexContext extends TableElementExprContext {
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TableIndexDfntContext tableIndexDfnt() {
			return getRuleContext(TableIndexDfntContext.class,0);
		}
		public TableElementExprIndexContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableElementExprIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableElementExprIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableElementExprIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementExprContext tableElementExpr() throws RecognitionException {
		TableElementExprContext _localctx = new TableElementExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tableElementExpr);
		try {
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				_localctx = new TableElementExprColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				tableColumnDfnt();
				}
				break;
			case 2:
				_localctx = new TableElementExprConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				match(CONSTRAINT);
				setState(939);
				identifier();
				setState(940);
				match(CHECK);
				setState(941);
				columnExpr(0);
				}
				break;
			case 3:
				_localctx = new TableElementExprIndexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(943);
				match(INDEX);
				setState(944);
				tableIndexDfnt();
				}
				break;
			case 4:
				_localctx = new TableElementExprProjectionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(945);
				match(PROJECTION);
				setState(946);
				tableProjectionDfnt();
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

	public static class TableColumnDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TableColumnPropertyExprContext tableColumnPropertyExpr() {
			return getRuleContext(TableColumnPropertyExprContext.class,0);
		}
		public ColumnCommentClauseContext columnCommentClause() {
			return getRuleContext(ColumnCommentClauseContext.class,0);
		}
		public CodecExprContext codecExpr() {
			return getRuleContext(CodecExprContext.class,0);
		}
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TableColumnDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableColumnDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableColumnDfnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableColumnDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnDfntContext tableColumnDfnt() throws RecognitionException {
		TableColumnDfntContext _localctx = new TableColumnDfntContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tableColumnDfnt);
		int _la;
		try {
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				nestedIdentifier();
				setState(950);
				columnTypeExpr();
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIAS || _la==DEFAULT || _la==MATERIALIZED) {
					{
					setState(951);
					tableColumnPropertyExpr();
					}
				}

				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(954);
					columnCommentClause();
					}
				}

				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEC) {
					{
					setState(957);
					codecExpr();
					}
				}

				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TTL) {
					{
					setState(960);
					match(TTL);
					setState(961);
					columnExpr(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				nestedIdentifier();
				setState(966);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(965);
					columnTypeExpr();
					}
					break;
				}
				setState(968);
				tableColumnPropertyExpr();
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(969);
					columnCommentClause();
					}
				}

				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEC) {
					{
					setState(972);
					codecExpr();
					}
				}

				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TTL) {
					{
					setState(975);
					match(TTL);
					setState(976);
					columnExpr(0);
					}
				}

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

	public static class TableColumnPropertyExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TableColumnPropertyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnPropertyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableColumnPropertyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableColumnPropertyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableColumnPropertyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnPropertyExprContext tableColumnPropertyExpr() throws RecognitionException {
		TableColumnPropertyExprContext _localctx = new TableColumnPropertyExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tableColumnPropertyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			_la = _input.LA(1);
			if ( !(_la==ALIAS || _la==DEFAULT || _la==MATERIALIZED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(982);
			columnExpr(0);
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

	public static class TableIndexDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(ClickHouseParser.TYPE, 0); }
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TerminalNode GRANULARITY() { return getToken(ClickHouseParser.GRANULARITY, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TableIndexDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndexDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableIndexDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableIndexDfnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableIndexDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIndexDfntContext tableIndexDfnt() throws RecognitionException {
		TableIndexDfntContext _localctx = new TableIndexDfntContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tableIndexDfnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			nestedIdentifier();
			setState(985);
			columnExpr(0);
			setState(986);
			match(TYPE);
			setState(987);
			columnTypeExpr();
			setState(988);
			match(GRANULARITY);
			setState(989);
			match(DECIMAL_LITERAL);
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

	public static class TableProjectionDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ProjectionSelectStmtContext projectionSelectStmt() {
			return getRuleContext(ProjectionSelectStmtContext.class,0);
		}
		public TableProjectionDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProjectionDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableProjectionDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableProjectionDfnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableProjectionDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProjectionDfntContext tableProjectionDfnt() throws RecognitionException {
		TableProjectionDfntContext _localctx = new TableProjectionDfntContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tableProjectionDfnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			nestedIdentifier();
			setState(992);
			projectionSelectStmt();
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

	public static class CodecExprContext extends ParserRuleContext {
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<CodecArgExprContext> codecArgExpr() {
			return getRuleContexts(CodecArgExprContext.class);
		}
		public CodecArgExprContext codecArgExpr(int i) {
			return getRuleContext(CodecArgExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public CodecExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codecExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCodecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCodecExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCodecExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodecExprContext codecExpr() throws RecognitionException {
		CodecExprContext _localctx = new CodecExprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_codecExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(CODEC);
			setState(995);
			match(LPAREN);
			setState(996);
			codecArgExpr();
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(997);
				match(COMMA);
				setState(998);
				codecArgExpr();
				}
				}
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1004);
			match(RPAREN);
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

	public static class CodecArgExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public CodecArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codecArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCodecArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCodecArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCodecArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodecArgExprContext codecArgExpr() throws RecognitionException {
		CodecArgExprContext _localctx = new CodecArgExprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_codecArgExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			identifier();
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1007);
				match(LPAREN);
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
					setState(1008);
					columnExprList();
					}
				}

				setState(1011);
				match(RPAREN);
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

	public static class TtlExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TtlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttlExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTtlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTtlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTtlExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TtlExprContext ttlExpr() throws RecognitionException {
		TtlExprContext _localctx = new TtlExprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ttlExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			columnExpr(0);
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1015);
				match(DELETE);
				}
				break;
			case 2:
				{
				setState(1016);
				match(TO);
				setState(1017);
				match(DISK);
				setState(1018);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(1019);
				match(TO);
				setState(1020);
				match(VOLUME);
				setState(1021);
				match(STRING_LITERAL);
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

	public static class DescribeStmtContext extends ParserRuleContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public TerminalNode DESCRIBE() { return getToken(ClickHouseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public DescribeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDescribeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDescribeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDescribeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeStmtContext describeStmt() throws RecognitionException {
		DescribeStmtContext _localctx = new DescribeStmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_describeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			_la = _input.LA(1);
			if ( !(_la==DESC || _la==DESCRIBE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1025);
				match(TABLE);
				}
				break;
			}
			setState(1028);
			tableExpr(0);
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

	public static class DropStmtContext extends ParserRuleContext {
		public DropStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropStmt; }
	 
		public DropStmtContext() { }
		public void copyFrom(DropStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DropDatabaseStmtContext extends DropStmtContext {
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public DropDatabaseStmtContext(DropStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDropDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDropDatabaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDropDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableStmtContext extends DropStmtContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode NO() { return getToken(ClickHouseParser.NO, 0); }
		public TerminalNode DELAY() { return getToken(ClickHouseParser.DELAY, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public DropTableStmtContext(DropStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDropTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDropTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDropTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropStmtContext dropStmt() throws RecognitionException {
		DropStmtContext _localctx = new DropStmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dropStmt);
		int _la;
		try {
			setState(1061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				_localctx = new DropDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				_la = _input.LA(1);
				if ( !(_la==DETACH || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1031);
				match(DATABASE);
				setState(1034);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1032);
					match(IF);
					setState(1033);
					match(EXISTS);
					}
					break;
				}
				setState(1036);
				databaseIdentifier();
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1037);
					clusterClause();
					}
				}

				}
				break;
			case 2:
				_localctx = new DropTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1040);
				_la = _input.LA(1);
				if ( !(_la==DETACH || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1047);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DICTIONARY:
					{
					setState(1041);
					match(DICTIONARY);
					}
					break;
				case TABLE:
				case TEMPORARY:
					{
					setState(1043);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TEMPORARY) {
						{
						setState(1042);
						match(TEMPORARY);
						}
					}

					setState(1045);
					match(TABLE);
					}
					break;
				case VIEW:
					{
					setState(1046);
					match(VIEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1051);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1049);
					match(IF);
					setState(1050);
					match(EXISTS);
					}
					break;
				}
				setState(1053);
				tableIdentifier();
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1054);
					clusterClause();
					}
				}

				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1057);
					match(NO);
					setState(1058);
					match(DELAY);
					}
				}

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

	public static class ExistsStmtContext extends ParserRuleContext {
		public ExistsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsStmt; }
	 
		public ExistsStmtContext() { }
		public void copyFrom(ExistsStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExistsTableStmtContext extends ExistsStmtContext {
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public ExistsTableStmtContext(ExistsStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterExistsTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitExistsTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitExistsTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsDatabaseStmtContext extends ExistsStmtContext {
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ExistsDatabaseStmtContext(ExistsStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterExistsDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitExistsDatabaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitExistsDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsStmtContext existsStmt() throws RecognitionException {
		ExistsStmtContext _localctx = new ExistsStmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_existsStmt);
		int _la;
		try {
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				_localctx = new ExistsDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				match(EXISTS);
				setState(1064);
				match(DATABASE);
				setState(1065);
				databaseIdentifier();
				}
				break;
			case 2:
				_localctx = new ExistsTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				match(EXISTS);
				setState(1073);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1067);
					match(DICTIONARY);
					}
					break;
				case 2:
					{
					setState(1069);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TEMPORARY) {
						{
						setState(1068);
						match(TEMPORARY);
						}
					}

					setState(1071);
					match(TABLE);
					}
					break;
				case 3:
					{
					setState(1072);
					match(VIEW);
					}
					break;
				}
				setState(1075);
				tableIdentifier();
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

	public static class ExplainStmtContext extends ParserRuleContext {
		public ExplainStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainStmt; }
	 
		public ExplainStmtContext() { }
		public void copyFrom(ExplainStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainSyntaxStmtContext extends ExplainStmtContext {
		public TerminalNode EXPLAIN() { return getToken(ClickHouseParser.EXPLAIN, 0); }
		public TerminalNode SYNTAX() { return getToken(ClickHouseParser.SYNTAX, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExplainSyntaxStmtContext(ExplainStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterExplainSyntaxStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitExplainSyntaxStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitExplainSyntaxStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainASTStmtContext extends ExplainStmtContext {
		public TerminalNode EXPLAIN() { return getToken(ClickHouseParser.EXPLAIN, 0); }
		public TerminalNode AST() { return getToken(ClickHouseParser.AST, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExplainASTStmtContext(ExplainStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterExplainASTStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitExplainASTStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitExplainASTStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainStmtContext explainStmt() throws RecognitionException {
		ExplainStmtContext _localctx = new ExplainStmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_explainStmt);
		try {
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				_localctx = new ExplainASTStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
				match(EXPLAIN);
				setState(1079);
				match(AST);
				setState(1080);
				query();
				}
				break;
			case 2:
				_localctx = new ExplainSyntaxStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				match(EXPLAIN);
				setState(1082);
				match(SYNTAX);
				setState(1083);
				query();
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

	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ClickHouseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public DataClauseContext dataClause() {
			return getRuleContext(DataClauseContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(ClickHouseParser.FUNCTION, 0); }
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public ColumnsClauseContext columnsClause() {
			return getRuleContext(ColumnsClauseContext.class,0);
		}
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterInsertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitInsertStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitInsertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			match(INSERT);
			setState(1087);
			match(INTO);
			setState(1089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1088);
				match(TABLE);
				}
				break;
			}
			setState(1094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1091);
				tableIdentifier();
				}
				break;
			case 2:
				{
				setState(1092);
				match(FUNCTION);
				setState(1093);
				tableFunctionExpr();
				}
				break;
			}
			setState(1097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1096);
				columnsClause();
				}
				break;
			}
			setState(1099);
			dataClause();
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

	public static class ColumnsClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<NestedIdentifierContext> nestedIdentifier() {
			return getRuleContexts(NestedIdentifierContext.class);
		}
		public NestedIdentifierContext nestedIdentifier(int i) {
			return getRuleContext(NestedIdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsClauseContext columnsClause() throws RecognitionException {
		ColumnsClauseContext _localctx = new ColumnsClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_columnsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(LPAREN);
			setState(1102);
			nestedIdentifier();
			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1103);
				match(COMMA);
				setState(1104);
				nestedIdentifier();
				}
				}
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1110);
			match(RPAREN);
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

	public static class DataClauseContext extends ParserRuleContext {
		public DataClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataClause; }
	 
		public DataClauseContext() { }
		public void copyFrom(DataClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DataClauseValuesContext extends DataClauseContext {
		public TerminalNode VALUES() { return getToken(ClickHouseParser.VALUES, 0); }
		public DataClauseValuesContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDataClauseValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDataClauseValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDataClauseValues(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataClauseFormatContext extends DataClauseContext {
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataClauseFormatContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDataClauseFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDataClauseFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDataClauseFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataClauseSelectContext extends DataClauseContext {
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ClickHouseParser.EOF, 0); }
		public TerminalNode SEMICOLON() { return getToken(ClickHouseParser.SEMICOLON, 0); }
		public DataClauseSelectContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDataClauseSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDataClauseSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDataClauseSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataClauseContext dataClause() throws RecognitionException {
		DataClauseContext _localctx = new DataClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dataClause);
		int _la;
		try {
			setState(1121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new DataClauseFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1112);
				match(FORMAT);
				setState(1113);
				identifier();
				}
				break;
			case VALUES:
				_localctx = new DataClauseValuesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				match(VALUES);
				}
				break;
			case SELECT:
			case WITH:
			case LPAREN:
				_localctx = new DataClauseSelectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1115);
				selectUnionStmt();
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(1116);
					match(SEMICOLON);
					}
				}

				setState(1119);
				match(EOF);
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

	public static class KillStmtContext extends ParserRuleContext {
		public KillStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killStmt; }
	 
		public KillStmtContext() { }
		public void copyFrom(KillStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KillMutationStmtContext extends KillStmtContext {
		public TerminalNode KILL() { return getToken(ClickHouseParser.KILL, 0); }
		public TerminalNode MUTATION() { return getToken(ClickHouseParser.MUTATION, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode ASYNC() { return getToken(ClickHouseParser.ASYNC, 0); }
		public TerminalNode TEST() { return getToken(ClickHouseParser.TEST, 0); }
		public KillMutationStmtContext(KillStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterKillMutationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitKillMutationStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitKillMutationStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KillStmtContext killStmt() throws RecognitionException {
		KillStmtContext _localctx = new KillStmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_killStmt);
		int _la;
		try {
			_localctx = new KillMutationStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			match(KILL);
			setState(1124);
			match(MUTATION);
			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1125);
				clusterClause();
				}
			}

			setState(1128);
			whereClause();
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC || _la==SYNC || _la==TEST) {
				{
				setState(1129);
				_la = _input.LA(1);
				if ( !(_la==ASYNC || _la==SYNC || _la==TEST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class OptimizeStmtContext extends ParserRuleContext {
		public TerminalNode OPTIMIZE() { return getToken(ClickHouseParser.OPTIMIZE, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public TerminalNode DEDUPLICATE() { return getToken(ClickHouseParser.DEDUPLICATE, 0); }
		public OptimizeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimizeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterOptimizeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitOptimizeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOptimizeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptimizeStmtContext optimizeStmt() throws RecognitionException {
		OptimizeStmtContext _localctx = new OptimizeStmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_optimizeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			match(OPTIMIZE);
			setState(1133);
			match(TABLE);
			setState(1134);
			tableIdentifier();
			setState(1136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1135);
				clusterClause();
				}
			}

			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1138);
				partitionClause();
				}
			}

			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(1141);
				match(FINAL);
				}
			}

			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEDUPLICATE) {
				{
				setState(1144);
				match(DEDUPLICATE);
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

	public static class RenameStmtContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public List<TerminalNode> TO() { return getTokens(ClickHouseParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(ClickHouseParser.TO, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public RenameStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterRenameStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitRenameStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitRenameStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameStmtContext renameStmt() throws RecognitionException {
		RenameStmtContext _localctx = new RenameStmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_renameStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			match(RENAME);
			setState(1148);
			match(TABLE);
			setState(1149);
			tableIdentifier();
			setState(1150);
			match(TO);
			setState(1151);
			tableIdentifier();
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1152);
				match(COMMA);
				setState(1153);
				tableIdentifier();
				setState(1154);
				match(TO);
				setState(1155);
				tableIdentifier();
				}
				}
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1162);
				clusterClause();
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

	public static class ProjectionSelectStmtContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode SELECT() { return getToken(ClickHouseParser.SELECT, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public ProjectionOrderByClauseContext projectionOrderByClause() {
			return getRuleContext(ProjectionOrderByClauseContext.class,0);
		}
		public ProjectionSelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionSelectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterProjectionSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitProjectionSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitProjectionSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionSelectStmtContext projectionSelectStmt() throws RecognitionException {
		ProjectionSelectStmtContext _localctx = new ProjectionSelectStmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_projectionSelectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(LPAREN);
			setState(1167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1166);
				withClause();
				}
			}

			setState(1169);
			match(SELECT);
			setState(1170);
			columnExprList();
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1171);
				groupByClause();
				}
			}

			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1174);
				projectionOrderByClause();
				}
			}

			setState(1177);
			match(RPAREN);
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

	public static class SelectUnionStmtContext extends ParserRuleContext {
		public List<SelectStmtWithParensContext> selectStmtWithParens() {
			return getRuleContexts(SelectStmtWithParensContext.class);
		}
		public SelectStmtWithParensContext selectStmtWithParens(int i) {
			return getRuleContext(SelectStmtWithParensContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(ClickHouseParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(ClickHouseParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(ClickHouseParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(ClickHouseParser.ALL, i);
		}
		public SelectUnionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectUnionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSelectUnionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSelectUnionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSelectUnionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectUnionStmtContext selectUnionStmt() throws RecognitionException {
		SelectUnionStmtContext _localctx = new SelectUnionStmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_selectUnionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			selectStmtWithParens();
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(1180);
				match(UNION);
				setState(1181);
				match(ALL);
				setState(1182);
				selectStmtWithParens();
				}
				}
				setState(1187);
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

	public static class SelectStmtWithParensContext extends ParserRuleContext {
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public SelectStmtWithParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmtWithParens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSelectStmtWithParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSelectStmtWithParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSelectStmtWithParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtWithParensContext selectStmtWithParens() throws RecognitionException {
		SelectStmtWithParensContext _localctx = new SelectStmtWithParensContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_selectStmtWithParens);
		try {
			setState(1193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1188);
				selectStmt();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1189);
				match(LPAREN);
				setState(1190);
				selectUnionStmt();
				setState(1191);
				match(RPAREN);
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

	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ClickHouseParser.SELECT, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public TopClauseContext topClause() {
			return getRuleContext(TopClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public ArrayJoinClauseContext arrayJoinClause() {
			return getRuleContext(ArrayJoinClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public PrewhereClauseContext prewhereClause() {
			return getRuleContext(PrewhereClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(ClickHouseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(ClickHouseParser.WITH, i);
		}
		public TerminalNode TOTALS() { return getToken(ClickHouseParser.TOTALS, 0); }
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitByClauseContext limitByClause() {
			return getRuleContext(LimitByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SettingsClauseContext settingsClause() {
			return getRuleContext(SettingsClauseContext.class,0);
		}
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1195);
				withClause();
				}
			}

			setState(1198);
			match(SELECT);
			setState(1200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1199);
				match(DISTINCT);
				}
				break;
			}
			setState(1203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1202);
				topClause();
				}
				break;
			}
			setState(1205);
			columnExprList();
			setState(1207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1206);
				fromClause();
				}
			}

			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY || _la==INNER || _la==LEFT) {
				{
				setState(1209);
				arrayJoinClause();
				}
			}

			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1212);
				windowClause();
				}
			}

			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PREWHERE) {
				{
				setState(1215);
				prewhereClause();
				}
			}

			setState(1219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1218);
				whereClause();
				}
			}

			setState(1222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1221);
				groupByClause();
				}
			}

			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1224);
				match(WITH);
				setState(1225);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1228);
				match(WITH);
				setState(1229);
				match(TOTALS);
				}
			}

			setState(1233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1232);
				havingClause();
				}
			}

			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1235);
				orderByClause();
				}
			}

			setState(1239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1238);
				limitByClause();
				}
				break;
			}
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1241);
				limitClause();
				}
			}

			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETTINGS) {
				{
				setState(1244);
				settingsClause();
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

	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWithClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWithClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_withClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			match(WITH);
			setState(1248);
			columnExprList();
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

	public static class TopClauseContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(ClickHouseParser.TOP, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public TopClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTopClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTopClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTopClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopClauseContext topClause() throws RecognitionException {
		TopClauseContext _localctx = new TopClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_topClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			match(TOP);
			setState(1251);
			match(DECIMAL_LITERAL);
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1252);
				match(WITH);
				setState(1253);
				match(TIES);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public JoinExprContext joinExpr() {
			return getRuleContext(JoinExprContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			match(FROM);
			setState(1257);
			joinExpr(0);
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

	public static class ArrayJoinClauseContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(ClickHouseParser.ARRAY, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public ArrayJoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayJoinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterArrayJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitArrayJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitArrayJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayJoinClauseContext arrayJoinClause() throws RecognitionException {
		ArrayJoinClauseContext _localctx = new ArrayJoinClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_arrayJoinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INNER || _la==LEFT) {
				{
				setState(1259);
				_la = _input.LA(1);
				if ( !(_la==INNER || _la==LEFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1262);
			match(ARRAY);
			setState(1263);
			match(JOIN);
			setState(1264);
			columnExprList();
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

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(ClickHouseParser.WINDOW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public WindowExprContext windowExpr() {
			return getRuleContext(WindowExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_windowClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(WINDOW);
			setState(1267);
			identifier();
			setState(1268);
			match(AS);
			setState(1269);
			match(LPAREN);
			setState(1270);
			windowExpr();
			setState(1271);
			match(RPAREN);
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

	public static class PrewhereClauseContext extends ParserRuleContext {
		public TerminalNode PREWHERE() { return getToken(ClickHouseParser.PREWHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PrewhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prewhereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterPrewhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitPrewhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPrewhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrewhereClauseContext prewhereClause() throws RecognitionException {
		PrewhereClauseContext _localctx = new PrewhereClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_prewhereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			match(PREWHERE);
			setState(1274);
			columnExpr(0);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(WHERE);
			setState(1277);
			columnExpr(0);
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(ClickHouseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(GROUP);
			setState(1280);
			match(BY);
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1281);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1282);
				match(LPAREN);
				setState(1283);
				columnExprList();
				setState(1284);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(1286);
				columnExprList();
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(ClickHouseParser.HAVING, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			match(HAVING);
			setState(1290);
			columnExpr(0);
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public OrderExprListContext orderExprList() {
			return getRuleContext(OrderExprListContext.class,0);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(ORDER);
			setState(1293);
			match(BY);
			setState(1294);
			orderExprList();
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

	public static class ProjectionOrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ProjectionOrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionOrderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterProjectionOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitProjectionOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitProjectionOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionOrderByClauseContext projectionOrderByClause() throws RecognitionException {
		ProjectionOrderByClauseContext _localctx = new ProjectionOrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_projectionOrderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			match(ORDER);
			setState(1297);
			match(BY);
			setState(1298);
			columnExprList();
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

	public static class LimitByClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public LimitExprContext limitExpr() {
			return getRuleContext(LimitExprContext.class,0);
		}
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public LimitByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLimitByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLimitByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLimitByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitByClauseContext limitByClause() throws RecognitionException {
		LimitByClauseContext _localctx = new LimitByClauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_limitByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			match(LIMIT);
			setState(1301);
			limitExpr();
			setState(1302);
			match(BY);
			setState(1303);
			columnExprList();
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

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public LimitExprContext limitExpr() {
			return getRuleContext(LimitExprContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			match(LIMIT);
			setState(1306);
			limitExpr();
			setState(1309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1307);
				match(WITH);
				setState(1308);
				match(TIES);
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

	public static class SettingsClauseContext extends ParserRuleContext {
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public SettingsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSettingsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSettingsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSettingsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingsClauseContext settingsClause() throws RecognitionException {
		SettingsClauseContext _localctx = new SettingsClauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_settingsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			match(SETTINGS);
			setState(1312);
			settingExprList();
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

	public static class JoinExprContext extends ParserRuleContext {
		public JoinExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinExpr; }
	 
		public JoinExprContext() { }
		public void copyFrom(JoinExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinExprOpContext extends JoinExprContext {
		public List<JoinExprContext> joinExpr() {
			return getRuleContexts(JoinExprContext.class);
		}
		public JoinExprContext joinExpr(int i) {
			return getRuleContext(JoinExprContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public JoinConstraintClauseContext joinConstraintClause() {
			return getRuleContext(JoinConstraintClauseContext.class,0);
		}
		public JoinOpContext joinOp() {
			return getRuleContext(JoinOpContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public JoinExprOpContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinExprOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinExprOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprTableContext extends JoinExprContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public SampleClauseContext sampleClause() {
			return getRuleContext(SampleClauseContext.class,0);
		}
		public JoinExprTableContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinExprTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinExprTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprParensContext extends JoinExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public JoinExprContext joinExpr() {
			return getRuleContext(JoinExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public JoinExprParensContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinExprParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinExprParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprCrossOpContext extends JoinExprContext {
		public List<JoinExprContext> joinExpr() {
			return getRuleContexts(JoinExprContext.class);
		}
		public JoinExprContext joinExpr(int i) {
			return getRuleContext(JoinExprContext.class,i);
		}
		public JoinOpCrossContext joinOpCross() {
			return getRuleContext(JoinOpCrossContext.class,0);
		}
		public JoinExprCrossOpContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinExprCrossOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinExprCrossOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprCrossOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinExprContext joinExpr() throws RecognitionException {
		return joinExpr(0);
	}

	private JoinExprContext joinExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JoinExprContext _localctx = new JoinExprContext(_ctx, _parentState);
		JoinExprContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_joinExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				_localctx = new JoinExprTableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1315);
				tableExpr(0);
				setState(1317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1316);
					match(FINAL);
					}
					break;
				}
				setState(1320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1319);
					sampleClause();
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new JoinExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1322);
				match(LPAREN);
				setState(1323);
				joinExpr(0);
				setState(1324);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1343);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
						{
						_localctx = new JoinExprCrossOpContext(new JoinExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_joinExpr);
						setState(1328);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1329);
						joinOpCross();
						setState(1330);
						joinExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new JoinExprOpContext(new JoinExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_joinExpr);
						setState(1332);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1334);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==GLOBAL || _la==LOCAL) {
							{
							setState(1333);
							_la = _input.LA(1);
							if ( !(_la==GLOBAL || _la==LOCAL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(1337);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (FULL - 68)) | (1L << (INNER - 68)) | (1L << (LEFT - 68)))) != 0) || _la==RIGHT || _la==SEMI) {
							{
							setState(1336);
							joinOp();
							}
						}

						setState(1339);
						match(JOIN);
						setState(1340);
						joinExpr(0);
						setState(1341);
						joinConstraintClause();
						}
						break;
					}
					} 
				}
				setState(1347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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

	public static class JoinOpContext extends ParserRuleContext {
		public JoinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOp; }
	 
		public JoinOpContext() { }
		public void copyFrom(JoinOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinOpFullContext extends JoinOpContext {
		public TerminalNode FULL() { return getToken(ClickHouseParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public JoinOpFullContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinOpFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinOpFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpFull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinOpInnerContext extends JoinOpContext {
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public JoinOpInnerContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinOpInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinOpInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpInner(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinOpLeftRightContext extends JoinOpContext {
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(ClickHouseParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(ClickHouseParser.SEMI, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANTI() { return getToken(ClickHouseParser.ANTI, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public JoinOpLeftRightContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinOpLeftRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinOpLeftRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpLeftRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinOpContext joinOp() throws RecognitionException {
		JoinOpContext _localctx = new JoinOpContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_joinOp);
		int _la;
		try {
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				_localctx = new JoinOpInnerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) {
						{
						setState(1348);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1351);
					match(INNER);
					}
					break;
				case 2:
					{
					setState(1352);
					match(INNER);
					setState(1354);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) {
						{
						setState(1353);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				case 3:
					{
					setState(1356);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new JoinOpLeftRightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1360);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) {
						{
						setState(1359);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1362);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1364);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1363);
						match(OUTER);
						}
					}

					}
					break;
				case 2:
					{
					setState(1366);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1368);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1367);
						match(OUTER);
						}
					}

					setState(1371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) {
						{
						setState(1370);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new JoinOpFullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1376);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==ANY) {
						{
						setState(1375);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1378);
					match(FULL);
					setState(1380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1379);
						match(OUTER);
						}
					}

					}
					break;
				case 2:
					{
					setState(1382);
					match(FULL);
					setState(1384);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1383);
						match(OUTER);
						}
					}

					setState(1387);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==ANY) {
						{
						setState(1386);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				}
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

	public static class JoinOpCrossContext extends ParserRuleContext {
		public TerminalNode CROSS() { return getToken(ClickHouseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public TerminalNode COMMA() { return getToken(ClickHouseParser.COMMA, 0); }
		public JoinOpCrossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOpCross; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinOpCross(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinOpCross(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpCross(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinOpCrossContext joinOpCross() throws RecognitionException {
		JoinOpCrossContext _localctx = new JoinOpCrossContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_joinOpCross);
		int _la;
		try {
			setState(1399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CROSS:
			case GLOBAL:
			case LOCAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==LOCAL) {
					{
					setState(1393);
					_la = _input.LA(1);
					if ( !(_la==GLOBAL || _la==LOCAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1396);
				match(CROSS);
				setState(1397);
				match(JOIN);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1398);
				match(COMMA);
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

	public static class JoinConstraintClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode USING() { return getToken(ClickHouseParser.USING, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public JoinConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinConstraintClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinConstraintClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinConstraintClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinConstraintClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConstraintClauseContext joinConstraintClause() throws RecognitionException {
		JoinConstraintClauseContext _localctx = new JoinConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_joinConstraintClause);
		try {
			setState(1410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1401);
				match(ON);
				setState(1402);
				columnExprList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1403);
				match(USING);
				setState(1404);
				match(LPAREN);
				setState(1405);
				columnExprList();
				setState(1406);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1408);
				match(USING);
				setState(1409);
				columnExprList();
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

	public static class SampleClauseContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public List<RatioExprContext> ratioExpr() {
			return getRuleContexts(RatioExprContext.class);
		}
		public RatioExprContext ratioExpr(int i) {
			return getRuleContext(RatioExprContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public SampleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSampleClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSampleClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSampleClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleClauseContext sampleClause() throws RecognitionException {
		SampleClauseContext _localctx = new SampleClauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_sampleClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(SAMPLE);
			setState(1413);
			ratioExpr();
			setState(1416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1414);
				match(OFFSET);
				setState(1415);
				ratioExpr();
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

	public static class LimitExprContext extends ParserRuleContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ClickHouseParser.COMMA, 0); }
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public LimitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLimitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLimitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLimitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitExprContext limitExpr() throws RecognitionException {
		LimitExprContext _localctx = new LimitExprContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_limitExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			columnExpr(0);
			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET || _la==COMMA) {
				{
				setState(1419);
				_la = _input.LA(1);
				if ( !(_la==OFFSET || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1420);
				columnExpr(0);
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

	public static class OrderExprListContext extends ParserRuleContext {
		public List<OrderExprContext> orderExpr() {
			return getRuleContexts(OrderExprContext.class);
		}
		public OrderExprContext orderExpr(int i) {
			return getRuleContext(OrderExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public OrderExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterOrderExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitOrderExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOrderExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExprListContext orderExprList() throws RecognitionException {
		OrderExprListContext _localctx = new OrderExprListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_orderExprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			orderExpr();
			setState(1428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1424);
					match(COMMA);
					setState(1425);
					orderExpr();
					}
					} 
				}
				setState(1430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
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

	public static class OrderExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(ClickHouseParser.NULLS, 0); }
		public TerminalNode COLLATE() { return getToken(ClickHouseParser.COLLATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode ASCENDING() { return getToken(ClickHouseParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(ClickHouseParser.DESCENDING, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(ClickHouseParser.LAST, 0); }
		public OrderExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterOrderExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitOrderExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOrderExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExprContext orderExpr() throws RecognitionException {
		OrderExprContext _localctx = new OrderExprContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_orderExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			columnExpr(0);
			setState(1433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1432);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASCENDING) | (1L << DESC) | (1L << DESCENDING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1435);
				match(NULLS);
				setState(1436);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1439);
				match(COLLATE);
				setState(1440);
				match(STRING_LITERAL);
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

	public static class RatioExprContext extends ParserRuleContext {
		public List<NumberLiteralContext> numberLiteral() {
			return getRuleContexts(NumberLiteralContext.class);
		}
		public NumberLiteralContext numberLiteral(int i) {
			return getRuleContext(NumberLiteralContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(ClickHouseParser.SLASH, 0); }
		public RatioExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratioExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterRatioExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitRatioExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitRatioExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RatioExprContext ratioExpr() throws RecognitionException {
		RatioExprContext _localctx = new RatioExprContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_ratioExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			numberLiteral();
			setState(1446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1444);
				match(SLASH);
				setState(1445);
				numberLiteral();
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

	public static class SettingExprListContext extends ParserRuleContext {
		public List<SettingExprContext> settingExpr() {
			return getRuleContexts(SettingExprContext.class);
		}
		public SettingExprContext settingExpr(int i) {
			return getRuleContext(SettingExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public SettingExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSettingExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSettingExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSettingExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingExprListContext settingExprList() throws RecognitionException {
		SettingExprListContext _localctx = new SettingExprListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_settingExprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			settingExpr();
			setState(1453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1449);
					match(COMMA);
					setState(1450);
					settingExpr();
					}
					} 
				}
				setState(1455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
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

	public static class SettingExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SettingExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSettingExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSettingExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSettingExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingExprContext settingExpr() throws RecognitionException {
		SettingExprContext _localctx = new SettingExprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_settingExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			identifier();
			setState(1457);
			match(EQ_SINGLE);
			setState(1458);
			literal();
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

	public static class WindowExprContext extends ParserRuleContext {
		public WinPartitionByClauseContext winPartitionByClause() {
			return getRuleContext(WinPartitionByClauseContext.class,0);
		}
		public WinOrderByClauseContext winOrderByClause() {
			return getRuleContext(WinOrderByClauseContext.class,0);
		}
		public WinFrameClauseContext winFrameClause() {
			return getRuleContext(WinFrameClauseContext.class,0);
		}
		public WindowExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWindowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWindowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWindowExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowExprContext windowExpr() throws RecognitionException {
		WindowExprContext _localctx = new WindowExprContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_windowExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1460);
				winPartitionByClause();
				}
			}

			setState(1464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1463);
				winOrderByClause();
				}
			}

			setState(1467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1466);
				winFrameClause();
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

	public static class WinPartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WinPartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winPartitionByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWinPartitionByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWinPartitionByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWinPartitionByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinPartitionByClauseContext winPartitionByClause() throws RecognitionException {
		WinPartitionByClauseContext _localctx = new WinPartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_winPartitionByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			match(PARTITION);
			setState(1470);
			match(BY);
			setState(1471);
			columnExprList();
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

	public static class WinOrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public OrderExprListContext orderExprList() {
			return getRuleContext(OrderExprListContext.class,0);
		}
		public WinOrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winOrderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWinOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWinOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWinOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinOrderByClauseContext winOrderByClause() throws RecognitionException {
		WinOrderByClauseContext _localctx = new WinOrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_winOrderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			match(ORDER);
			setState(1474);
			match(BY);
			setState(1475);
			orderExprList();
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

	public static class WinFrameClauseContext extends ParserRuleContext {
		public WinFrameExtendContext winFrameExtend() {
			return getRuleContext(WinFrameExtendContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(ClickHouseParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(ClickHouseParser.RANGE, 0); }
		public WinFrameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winFrameClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWinFrameClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWinFrameClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWinFrameClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinFrameClauseContext winFrameClause() throws RecognitionException {
		WinFrameClauseContext _localctx = new WinFrameClauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_winFrameClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			_la = _input.LA(1);
			if ( !(_la==RANGE || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1478);
			winFrameExtend();
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

	public static class WinFrameExtendContext extends ParserRuleContext {
		public WinFrameExtendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winFrameExtend; }
	 
		public WinFrameExtendContext() { }
		public void copyFrom(WinFrameExtendContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FrameStartContext extends WinFrameExtendContext {
		public WinFrameBoundContext winFrameBound() {
			return getRuleContext(WinFrameBoundContext.class,0);
		}
		public FrameStartContext(WinFrameExtendContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterFrameStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitFrameStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitFrameStart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FrameBetweenContext extends WinFrameExtendContext {
		public TerminalNode BETWEEN() { return getToken(ClickHouseParser.BETWEEN, 0); }
		public List<WinFrameBoundContext> winFrameBound() {
			return getRuleContexts(WinFrameBoundContext.class);
		}
		public WinFrameBoundContext winFrameBound(int i) {
			return getRuleContext(WinFrameBoundContext.class,i);
		}
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public FrameBetweenContext(WinFrameExtendContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterFrameBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitFrameBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitFrameBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinFrameExtendContext winFrameExtend() throws RecognitionException {
		WinFrameExtendContext _localctx = new WinFrameExtendContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_winFrameExtend);
		try {
			setState(1486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT:
			case INF:
			case NAN_SQL:
			case UNBOUNDED:
			case FLOATING_LITERAL:
			case OCTAL_LITERAL:
			case DECIMAL_LITERAL:
			case HEXADECIMAL_LITERAL:
			case DASH:
			case DOT:
			case PLUS:
				_localctx = new FrameStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1480);
				winFrameBound();
				}
				break;
			case BETWEEN:
				_localctx = new FrameBetweenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1481);
				match(BETWEEN);
				setState(1482);
				winFrameBound();
				setState(1483);
				match(AND);
				setState(1484);
				winFrameBound();
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

	public static class WinFrameBoundContext extends ParserRuleContext {
		public TerminalNode CURRENT() { return getToken(ClickHouseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(ClickHouseParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(ClickHouseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(ClickHouseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(ClickHouseParser.FOLLOWING, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public WinFrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winFrameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWinFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWinFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWinFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinFrameBoundContext winFrameBound() throws RecognitionException {
		WinFrameBoundContext _localctx = new WinFrameBoundContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_winFrameBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1488);
				match(CURRENT);
				setState(1489);
				match(ROW);
				}
				break;
			case 2:
				{
				setState(1490);
				match(UNBOUNDED);
				setState(1491);
				match(PRECEDING);
				}
				break;
			case 3:
				{
				setState(1492);
				match(UNBOUNDED);
				setState(1493);
				match(FOLLOWING);
				}
				break;
			case 4:
				{
				setState(1494);
				numberLiteral();
				setState(1495);
				match(PRECEDING);
				}
				break;
			case 5:
				{
				setState(1497);
				numberLiteral();
				setState(1498);
				match(FOLLOWING);
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

	public static class SetStmtContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(ClickHouseParser.SET, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_setStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			match(SET);
			setState(1503);
			settingExprList();
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

	public static class ShowStmtContext extends ParserRuleContext {
		public ShowStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStmt; }
	 
		public ShowStmtContext() { }
		public void copyFrom(ShowStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowCreateDatabaseStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ShowCreateDatabaseStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowCreateDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowCreateDatabaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowCreateDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDatabasesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(ClickHouseParser.DATABASES, 0); }
		public ShowDatabasesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowDatabasesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowDatabasesStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowDatabasesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public ShowCreateTableStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowCreateTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowCreateTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(ClickHouseParser.TABLES, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public ShowTablesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowTablesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowTablesStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowTablesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDictionariesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ShowDictionariesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowDictionariesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowDictionariesStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowDictionariesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateDictionaryStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateDictionaryStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowCreateDictionaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowCreateDictionaryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowCreateDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowStmtContext showStmt() throws RecognitionException {
		ShowStmtContext _localctx = new ShowStmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_showStmt);
		int _la;
		try {
			setState(1547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				_localctx = new ShowCreateDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1505);
				match(SHOW);
				setState(1506);
				match(CREATE);
				setState(1507);
				match(DATABASE);
				setState(1508);
				databaseIdentifier();
				}
				break;
			case 2:
				_localctx = new ShowCreateDictionaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1509);
				match(SHOW);
				setState(1510);
				match(CREATE);
				setState(1511);
				match(DICTIONARY);
				setState(1512);
				tableIdentifier();
				}
				break;
			case 3:
				_localctx = new ShowCreateTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1513);
				match(SHOW);
				setState(1514);
				match(CREATE);
				setState(1516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1515);
					match(TEMPORARY);
					}
					break;
				}
				setState(1519);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1518);
					match(TABLE);
					}
					break;
				}
				setState(1521);
				tableIdentifier();
				}
				break;
			case 4:
				_localctx = new ShowDatabasesStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1522);
				match(SHOW);
				setState(1523);
				match(DATABASES);
				}
				break;
			case 5:
				_localctx = new ShowDictionariesStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1524);
				match(SHOW);
				setState(1525);
				match(DICTIONARIES);
				setState(1528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(1526);
					match(FROM);
					setState(1527);
					databaseIdentifier();
					}
				}

				}
				break;
			case 6:
				_localctx = new ShowTablesStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1530);
				match(SHOW);
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(1531);
					match(TEMPORARY);
					}
				}

				setState(1534);
				match(TABLES);
				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(1535);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1536);
					databaseIdentifier();
					}
				}

				setState(1542);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIKE:
					{
					setState(1539);
					match(LIKE);
					setState(1540);
					match(STRING_LITERAL);
					}
					break;
				case WHERE:
					{
					setState(1541);
					whereClause();
					}
					break;
				case EOF:
				case FORMAT:
				case INTO:
				case LIMIT:
				case SEMICOLON:
					break;
				default:
					break;
				}
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(1544);
					limitClause();
					}
				}

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

	public static class SystemStmtContext extends ParserRuleContext {
		public TerminalNode SYSTEM() { return getToken(ClickHouseParser.SYSTEM, 0); }
		public TerminalNode FLUSH() { return getToken(ClickHouseParser.FLUSH, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(ClickHouseParser.DISTRIBUTED, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LOGS() { return getToken(ClickHouseParser.LOGS, 0); }
		public TerminalNode RELOAD() { return getToken(ClickHouseParser.RELOAD, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode START() { return getToken(ClickHouseParser.START, 0); }
		public TerminalNode STOP() { return getToken(ClickHouseParser.STOP, 0); }
		public TerminalNode SENDS() { return getToken(ClickHouseParser.SENDS, 0); }
		public TerminalNode FETCHES() { return getToken(ClickHouseParser.FETCHES, 0); }
		public TerminalNode MERGES() { return getToken(ClickHouseParser.MERGES, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TerminalNode REPLICATED() { return getToken(ClickHouseParser.REPLICATED, 0); }
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode REPLICA() { return getToken(ClickHouseParser.REPLICA, 0); }
		public SystemStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSystemStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSystemStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSystemStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemStmtContext systemStmt() throws RecognitionException {
		SystemStmtContext _localctx = new SystemStmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_systemStmt);
		int _la;
		try {
			setState(1583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1549);
				match(SYSTEM);
				setState(1550);
				match(FLUSH);
				setState(1551);
				match(DISTRIBUTED);
				setState(1552);
				tableIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1553);
				match(SYSTEM);
				setState(1554);
				match(FLUSH);
				setState(1555);
				match(LOGS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1556);
				match(SYSTEM);
				setState(1557);
				match(RELOAD);
				setState(1558);
				match(DICTIONARIES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1559);
				match(SYSTEM);
				setState(1560);
				match(RELOAD);
				setState(1561);
				match(DICTIONARY);
				setState(1562);
				tableIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1563);
				match(SYSTEM);
				setState(1564);
				_la = _input.LA(1);
				if ( !(_la==START || _la==STOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1572);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DISTRIBUTED:
					{
					setState(1565);
					match(DISTRIBUTED);
					setState(1566);
					match(SENDS);
					}
					break;
				case FETCHES:
					{
					setState(1567);
					match(FETCHES);
					}
					break;
				case MERGES:
				case TTL:
					{
					setState(1569);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TTL) {
						{
						setState(1568);
						match(TTL);
						}
					}

					setState(1571);
					match(MERGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1574);
				tableIdentifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1575);
				match(SYSTEM);
				setState(1576);
				_la = _input.LA(1);
				if ( !(_la==START || _la==STOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1577);
				match(REPLICATED);
				setState(1578);
				match(SENDS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1579);
				match(SYSTEM);
				setState(1580);
				match(SYNC);
				setState(1581);
				match(REPLICA);
				setState(1582);
				tableIdentifier();
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

	public static class TruncateStmtContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(ClickHouseParser.TRUNCATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TruncateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTruncateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTruncateStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTruncateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateStmtContext truncateStmt() throws RecognitionException {
		TruncateStmtContext _localctx = new TruncateStmtContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_truncateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			match(TRUNCATE);
			setState(1587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1586);
				match(TEMPORARY);
				}
				break;
			}
			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1589);
				match(TABLE);
				}
				break;
			}
			setState(1594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1592);
				match(IF);
				setState(1593);
				match(EXISTS);
				}
				break;
			}
			setState(1596);
			tableIdentifier();
			setState(1598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1597);
				clusterClause();
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

	public static class UseStmtContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(ClickHouseParser.USE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public UseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterUseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitUseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitUseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStmtContext useStmt() throws RecognitionException {
		UseStmtContext _localctx = new UseStmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_useStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			match(USE);
			setState(1601);
			databaseIdentifier();
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

	public static class WatchStmtContext extends ParserRuleContext {
		public TerminalNode WATCH() { return getToken(ClickHouseParser.WATCH, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EVENTS() { return getToken(ClickHouseParser.EVENTS, 0); }
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public WatchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_watchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWatchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWatchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWatchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WatchStmtContext watchStmt() throws RecognitionException {
		WatchStmtContext _localctx = new WatchStmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_watchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			match(WATCH);
			setState(1604);
			tableIdentifier();
			setState(1606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVENTS) {
				{
				setState(1605);
				match(EVENTS);
				}
			}

			setState(1610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1608);
				match(LIMIT);
				setState(1609);
				match(DECIMAL_LITERAL);
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

	public static class ColumnTypeExprContext extends ParserRuleContext {
		public ColumnTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnTypeExpr; }
	 
		public ColumnTypeExprContext() { }
		public void copyFrom(ColumnTypeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnTypeExprNestedContext extends ColumnTypeExprContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnTypeExprContext> columnTypeExpr() {
			return getRuleContexts(ColumnTypeExprContext.class);
		}
		public ColumnTypeExprContext columnTypeExpr(int i) {
			return getRuleContext(ColumnTypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprNestedContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprNested(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprParamContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnTypeExprParamContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprSimpleContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnTypeExprSimpleContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprComplexContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnTypeExprContext> columnTypeExpr() {
			return getRuleContexts(ColumnTypeExprContext.class);
		}
		public ColumnTypeExprContext columnTypeExpr(int i) {
			return getRuleContext(ColumnTypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprComplexContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprComplex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprEnumContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprEnumContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnTypeExprContext columnTypeExpr() throws RecognitionException {
		ColumnTypeExprContext _localctx = new ColumnTypeExprContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_columnTypeExpr);
		int _la;
		try {
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				_localctx = new ColumnTypeExprSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1612);
				identifier();
				}
				break;
			case 2:
				_localctx = new ColumnTypeExprNestedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1613);
				identifier();
				setState(1614);
				match(LPAREN);
				setState(1615);
				identifier();
				setState(1616);
				columnTypeExpr();
				setState(1623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1617);
					match(COMMA);
					setState(1618);
					identifier();
					setState(1619);
					columnTypeExpr();
					}
					}
					setState(1625);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1626);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ColumnTypeExprEnumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1628);
				identifier();
				setState(1629);
				match(LPAREN);
				setState(1630);
				enumValue();
				setState(1635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1631);
					match(COMMA);
					setState(1632);
					enumValue();
					}
					}
					setState(1637);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1638);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ColumnTypeExprComplexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1640);
				identifier();
				setState(1641);
				match(LPAREN);
				setState(1642);
				columnTypeExpr();
				setState(1647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1643);
					match(COMMA);
					setState(1644);
					columnTypeExpr();
					}
					}
					setState(1649);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1650);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new ColumnTypeExprParamContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1652);
				identifier();
				setState(1653);
				match(LPAREN);
				setState(1655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
					setState(1654);
					columnExprList();
					}
				}

				setState(1657);
				match(RPAREN);
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

	public static class ColumnExprListContext extends ParserRuleContext {
		public List<ColumnsExprContext> columnsExpr() {
			return getRuleContexts(ColumnsExprContext.class);
		}
		public ColumnsExprContext columnsExpr(int i) {
			return getRuleContext(ColumnsExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnExprListContext columnExprList() throws RecognitionException {
		ColumnExprListContext _localctx = new ColumnExprListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_columnExprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			columnsExpr();
			setState(1666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1662);
					match(COMMA);
					setState(1663);
					columnsExpr();
					}
					} 
				}
				setState(1668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
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

	public static class ColumnsExprContext extends ParserRuleContext {
		public ColumnsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsExpr; }
	 
		public ColumnsExprContext() { }
		public void copyFrom(ColumnsExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnsExprColumnContext extends ColumnsExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnsExprColumnContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnsExprColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnsExprColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsExprColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnsExprAsteriskContext extends ColumnsExprContext {
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnsExprAsteriskContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnsExprAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnsExprAsterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsExprAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnsExprSubqueryContext extends ColumnsExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnsExprSubqueryContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnsExprSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnsExprSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsExprContext columnsExpr() throws RecognitionException {
		ColumnsExprContext _localctx = new ColumnsExprContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_columnsExpr);
		int _la;
		try {
			setState(1680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				_localctx = new ColumnsExprAsteriskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
					{
					setState(1669);
					tableIdentifier();
					setState(1670);
					match(DOT);
					}
				}

				setState(1674);
				match(ASTERISK);
				}
				break;
			case 2:
				_localctx = new ColumnsExprSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1675);
				match(LPAREN);
				setState(1676);
				selectUnionStmt();
				setState(1677);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ColumnsExprColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1679);
				columnExpr(0);
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

	public static class ColumnExprContext extends ParserRuleContext {
		public ColumnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExpr; }
	 
		public ColumnExprContext() { }
		public void copyFrom(ColumnExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnExprTernaryOpContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode QUERY() { return getToken(ClickHouseParser.QUERY, 0); }
		public TerminalNode COLON() { return getToken(ClickHouseParser.COLON, 0); }
		public ColumnExprTernaryOpContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTernaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTernaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTernaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAliasContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnExprAliasContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprExtractContext extends ColumnExprContext {
		public TerminalNode EXTRACT() { return getToken(ClickHouseParser.EXTRACT, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprExtractContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprNegateContext extends ColumnExprContext {
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnExprNegateContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprSubqueryContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprSubqueryContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprLiteralContext extends ColumnExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ColumnExprLiteralContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprArrayContext extends ColumnExprContext {
		public TerminalNode LBRACKET() { return getToken(ClickHouseParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ClickHouseParser.RBRACKET, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprArrayContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprSubstringContext extends ColumnExprContext {
		public TerminalNode SUBSTRING() { return getToken(ClickHouseParser.SUBSTRING, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(ClickHouseParser.FOR, 0); }
		public ColumnExprSubstringContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprCastContext extends ColumnExprContext {
		public TerminalNode CAST() { return getToken(ClickHouseParser.CAST, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprCastContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprOrContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public ColumnExprOrContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence1Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(ClickHouseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(ClickHouseParser.PERCENT, 0); }
		public ColumnExprPrecedence1Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprPrecedence1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprPrecedence1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprPrecedence1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence2Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ClickHouseParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public TerminalNode CONCAT() { return getToken(ClickHouseParser.CONCAT, 0); }
		public ColumnExprPrecedence2Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprPrecedence2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprPrecedence2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprPrecedence2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence3Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode EQ_DOUBLE() { return getToken(ClickHouseParser.EQ_DOUBLE, 0); }
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public TerminalNode NOT_EQ() { return getToken(ClickHouseParser.NOT_EQ, 0); }
		public TerminalNode LE() { return getToken(ClickHouseParser.LE, 0); }
		public TerminalNode GE() { return getToken(ClickHouseParser.GE, 0); }
		public TerminalNode LT() { return getToken(ClickHouseParser.LT, 0); }
		public TerminalNode GT() { return getToken(ClickHouseParser.GT, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(ClickHouseParser.ILIKE, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprPrecedence3Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprPrecedence3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprPrecedence3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprPrecedence3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIntervalContext extends ColumnExprContext {
		public TerminalNode INTERVAL() { return getToken(ClickHouseParser.INTERVAL, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public ColumnExprIntervalContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIsNullContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode IS() { return getToken(ClickHouseParser.IS, 0); }
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprIsNullContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprIsNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprIsNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprIsNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprWinFunctionTargetContext extends ColumnExprContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OVER() { return getToken(ClickHouseParser.OVER, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprWinFunctionTargetContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprWinFunctionTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprWinFunctionTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprWinFunctionTarget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTrimContext extends ColumnExprContext {
		public TerminalNode TRIM() { return getToken(ClickHouseParser.TRIM, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode BOTH() { return getToken(ClickHouseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(ClickHouseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(ClickHouseParser.TRAILING, 0); }
		public ColumnExprTrimContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTupleContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprTupleContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprArrayAccessContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(ClickHouseParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ClickHouseParser.RBRACKET, 0); }
		public ColumnExprArrayAccessContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprBetweenContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(ClickHouseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprBetweenContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprParensContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprParensContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTimestampContext extends ColumnExprContext {
		public TerminalNode TIMESTAMP() { return getToken(ClickHouseParser.TIMESTAMP, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ColumnExprTimestampContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTimestamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAndContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public ColumnExprAndContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTupleAccessContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public ColumnExprTupleAccessContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTupleAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTupleAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTupleAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprCaseContext extends ColumnExprContext {
		public TerminalNode CASE() { return getToken(ClickHouseParser.CASE, 0); }
		public TerminalNode END() { return getToken(ClickHouseParser.END, 0); }
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(ClickHouseParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(ClickHouseParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(ClickHouseParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(ClickHouseParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(ClickHouseParser.ELSE, 0); }
		public ColumnExprCaseContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprDateContext extends ColumnExprContext {
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ColumnExprDateContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprNotContext extends ColumnExprContext {
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnExprNotContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprWinFunctionContext extends ColumnExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OVER() { return getToken(ClickHouseParser.OVER, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public WindowExprContext windowExpr() {
			return getRuleContext(WindowExprContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprWinFunctionContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprWinFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprWinFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprWinFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIdentifierContext extends ColumnExprContext {
		public ColumnIdentifierContext columnIdentifier() {
			return getRuleContext(ColumnIdentifierContext.class,0);
		}
		public ColumnExprIdentifierContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprFunctionContext extends ColumnExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public ColumnArgListContext columnArgList() {
			return getRuleContext(ColumnArgListContext.class,0);
		}
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprFunctionContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAsteriskContext extends ColumnExprContext {
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnExprAsteriskContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprAsterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnExprContext columnExpr() throws RecognitionException {
		return columnExpr(0);
	}

	private ColumnExprContext columnExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ColumnExprContext _localctx = new ColumnExprContext(_ctx, _parentState);
		ColumnExprContext _prevctx = _localctx;
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_columnExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				_localctx = new ColumnExprCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1683);
				match(CASE);
				setState(1685);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1684);
					columnExpr(0);
					}
					break;
				}
				setState(1692); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1687);
					match(WHEN);
					setState(1688);
					columnExpr(0);
					setState(1689);
					match(THEN);
					setState(1690);
					columnExpr(0);
					}
					}
					setState(1694); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1696);
					match(ELSE);
					setState(1697);
					columnExpr(0);
					}
				}

				setState(1700);
				match(END);
				}
				break;
			case 2:
				{
				_localctx = new ColumnExprCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1702);
				match(CAST);
				setState(1703);
				match(LPAREN);
				setState(1704);
				columnExpr(0);
				setState(1705);
				match(AS);
				setState(1706);
				columnTypeExpr();
				setState(1707);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new ColumnExprDateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1709);
				match(DATE);
				setState(1710);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				{
				_localctx = new ColumnExprExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1711);
				match(EXTRACT);
				setState(1712);
				match(LPAREN);
				setState(1713);
				interval();
				setState(1714);
				match(FROM);
				setState(1715);
				columnExpr(0);
				setState(1716);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new ColumnExprIntervalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1718);
				match(INTERVAL);
				setState(1719);
				columnExpr(0);
				setState(1720);
				interval();
				}
				break;
			case 6:
				{
				_localctx = new ColumnExprSubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1722);
				match(SUBSTRING);
				setState(1723);
				match(LPAREN);
				setState(1724);
				columnExpr(0);
				setState(1725);
				match(FROM);
				setState(1726);
				columnExpr(0);
				setState(1729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1727);
					match(FOR);
					setState(1728);
					columnExpr(0);
					}
				}

				setState(1731);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new ColumnExprTimestampContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1733);
				match(TIMESTAMP);
				setState(1734);
				match(STRING_LITERAL);
				}
				break;
			case 8:
				{
				_localctx = new ColumnExprTrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1735);
				match(TRIM);
				setState(1736);
				match(LPAREN);
				setState(1737);
				_la = _input.LA(1);
				if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1738);
				match(STRING_LITERAL);
				setState(1739);
				match(FROM);
				setState(1740);
				columnExpr(0);
				setState(1741);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new ColumnExprWinFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1743);
				identifier();
				{
				setState(1744);
				match(LPAREN);
				setState(1746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
					setState(1745);
					columnExprList();
					}
				}

				setState(1748);
				match(RPAREN);
				}
				setState(1750);
				match(OVER);
				setState(1751);
				match(LPAREN);
				setState(1752);
				windowExpr();
				setState(1753);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new ColumnExprWinFunctionTargetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1755);
				identifier();
				{
				setState(1756);
				match(LPAREN);
				setState(1758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
					setState(1757);
					columnExprList();
					}
				}

				setState(1760);
				match(RPAREN);
				}
				setState(1762);
				match(OVER);
				setState(1763);
				identifier();
				}
				break;
			case 11:
				{
				_localctx = new ColumnExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1765);
				identifier();
				setState(1771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1766);
					match(LPAREN);
					setState(1768);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
						{
						setState(1767);
						columnExprList();
						}
					}

					setState(1770);
					match(RPAREN);
					}
					break;
				}
				setState(1773);
				match(LPAREN);
				setState(1775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1774);
					match(DISTINCT);
					}
					break;
				}
				setState(1778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
					setState(1777);
					columnArgList();
					}
				}

				setState(1780);
				match(RPAREN);
				}
				break;
			case 12:
				{
				_localctx = new ColumnExprLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1782);
				literal();
				}
				break;
			case 13:
				{
				_localctx = new ColumnExprNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1783);
				match(DASH);
				setState(1784);
				columnExpr(17);
				}
				break;
			case 14:
				{
				_localctx = new ColumnExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1785);
				match(NOT);
				setState(1786);
				columnExpr(12);
				}
				break;
			case 15:
				{
				_localctx = new ColumnExprAsteriskContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
					{
					setState(1787);
					tableIdentifier();
					setState(1788);
					match(DOT);
					}
				}

				setState(1792);
				match(ASTERISK);
				}
				break;
			case 16:
				{
				_localctx = new ColumnExprSubqueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1793);
				match(LPAREN);
				setState(1794);
				selectUnionStmt();
				setState(1795);
				match(RPAREN);
				}
				break;
			case 17:
				{
				_localctx = new ColumnExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1797);
				match(LPAREN);
				setState(1798);
				columnExpr(0);
				setState(1799);
				match(RPAREN);
				}
				break;
			case 18:
				{
				_localctx = new ColumnExprTupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1801);
				match(LPAREN);
				setState(1802);
				columnExprList();
				setState(1803);
				match(RPAREN);
				}
				break;
			case 19:
				{
				_localctx = new ColumnExprArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1805);
				match(LBRACKET);
				setState(1807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
					setState(1806);
					columnExprList();
					}
				}

				setState(1809);
				match(RBRACKET);
				}
				break;
			case 20:
				{
				_localctx = new ColumnExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1810);
				columnIdentifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1884);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1882);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
					case 1:
						{
						_localctx = new ColumnExprPrecedence1Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1813);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1814);
						_la = _input.LA(1);
						if ( !(((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (ASTERISK - 199)) | (1L << (PERCENT - 199)) | (1L << (SLASH - 199)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1815);
						columnExpr(17);
						}
						break;
					case 2:
						{
						_localctx = new ColumnExprPrecedence2Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1816);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1817);
						_la = _input.LA(1);
						if ( !(((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (CONCAT - 204)) | (1L << (DASH - 204)) | (1L << (PLUS - 204)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1818);
						columnExpr(16);
						}
						break;
					case 3:
						{
						_localctx = new ColumnExprPrecedence3Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1819);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1838);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
						case 1:
							{
							setState(1820);
							match(EQ_DOUBLE);
							}
							break;
						case 2:
							{
							setState(1821);
							match(EQ_SINGLE);
							}
							break;
						case 3:
							{
							setState(1822);
							match(NOT_EQ);
							}
							break;
						case 4:
							{
							setState(1823);
							match(LE);
							}
							break;
						case 5:
							{
							setState(1824);
							match(GE);
							}
							break;
						case 6:
							{
							setState(1825);
							match(LT);
							}
							break;
						case 7:
							{
							setState(1826);
							match(GT);
							}
							break;
						case 8:
							{
							setState(1828);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==GLOBAL) {
								{
								setState(1827);
								match(GLOBAL);
								}
							}

							setState(1831);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NOT) {
								{
								setState(1830);
								match(NOT);
								}
							}

							setState(1833);
							match(IN);
							}
							break;
						case 9:
							{
							setState(1835);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NOT) {
								{
								setState(1834);
								match(NOT);
								}
							}

							setState(1837);
							_la = _input.LA(1);
							if ( !(_la==ILIKE || _la==LIKE) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						}
						setState(1840);
						columnExpr(15);
						}
						break;
					case 4:
						{
						_localctx = new ColumnExprAndContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1841);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1842);
						match(AND);
						setState(1843);
						columnExpr(12);
						}
						break;
					case 5:
						{
						_localctx = new ColumnExprOrContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1844);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1845);
						match(OR);
						setState(1846);
						columnExpr(11);
						}
						break;
					case 6:
						{
						_localctx = new ColumnExprBetweenContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1847);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1849);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1848);
							match(NOT);
							}
						}

						setState(1851);
						match(BETWEEN);
						setState(1852);
						columnExpr(0);
						setState(1853);
						match(AND);
						setState(1854);
						columnExpr(10);
						}
						break;
					case 7:
						{
						_localctx = new ColumnExprTernaryOpContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1856);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1857);
						match(QUERY);
						setState(1858);
						columnExpr(0);
						setState(1859);
						match(COLON);
						setState(1860);
						columnExpr(8);
						}
						break;
					case 8:
						{
						_localctx = new ColumnExprArrayAccessContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1862);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1863);
						match(LBRACKET);
						setState(1864);
						columnExpr(0);
						setState(1865);
						match(RBRACKET);
						}
						break;
					case 9:
						{
						_localctx = new ColumnExprTupleAccessContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1867);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1868);
						match(DOT);
						setState(1869);
						match(DECIMAL_LITERAL);
						}
						break;
					case 10:
						{
						_localctx = new ColumnExprIsNullContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1870);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1871);
						match(IS);
						setState(1873);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1872);
							match(NOT);
							}
						}

						setState(1875);
						match(NULL_SQL);
						}
						break;
					case 11:
						{
						_localctx = new ColumnExprAliasContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1876);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1880);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DATE:
						case FIRST:
						case ID:
						case KEY:
						case IDENTIFIER:
							{
							setState(1877);
							alias();
							}
							break;
						case AS:
							{
							setState(1878);
							match(AS);
							setState(1879);
							identifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
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

	public static class ColumnArgListContext extends ParserRuleContext {
		public List<ColumnArgExprContext> columnArgExpr() {
			return getRuleContexts(ColumnArgExprContext.class);
		}
		public ColumnArgExprContext columnArgExpr(int i) {
			return getRuleContext(ColumnArgExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnArgListContext columnArgList() throws RecognitionException {
		ColumnArgListContext _localctx = new ColumnArgListContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_columnArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
			columnArgExpr();
			setState(1892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1888);
				match(COMMA);
				setState(1889);
				columnArgExpr();
				}
				}
				setState(1894);
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

	public static class ColumnArgExprContext extends ParserRuleContext {
		public ColumnLambdaExprContext columnLambdaExpr() {
			return getRuleContext(ColumnLambdaExprContext.class,0);
		}
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnArgExprContext columnArgExpr() throws RecognitionException {
		ColumnArgExprContext _localctx = new ColumnArgExprContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_columnArgExpr);
		try {
			setState(1897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1895);
				columnLambdaExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1896);
				columnExpr(0);
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

	public static class ColumnLambdaExprContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(ClickHouseParser.ARROW, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnLambdaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnLambdaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnLambdaExprContext columnLambdaExpr() throws RecognitionException {
		ColumnLambdaExprContext _localctx = new ColumnLambdaExprContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_columnLambdaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1899);
				match(LPAREN);
				setState(1900);
				identifier();
				setState(1905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1901);
					match(COMMA);
					setState(1902);
					identifier();
					}
					}
					setState(1907);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1908);
				match(RPAREN);
				}
				break;
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case CURRENT:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOLLOWING:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case OVER:
			case PARTITION:
			case POPULATE:
			case PRECEDING:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case ROW:
			case ROWS:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNBOUNDED:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				{
				setState(1910);
				identifier();
				setState(1915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1911);
					match(COMMA);
					setState(1912);
					identifier();
					}
					}
					setState(1917);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1920);
			match(ARROW);
			setState(1921);
			columnExpr(0);
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

	public static class ColumnIdentifierContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnIdentifierContext columnIdentifier() throws RecognitionException {
		ColumnIdentifierContext _localctx = new ColumnIdentifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_columnIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1923);
				tableIdentifier();
				setState(1924);
				match(DOT);
				}
				break;
			}
			setState(1928);
			nestedIdentifier();
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

	public static class NestedIdentifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public NestedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterNestedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitNestedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitNestedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedIdentifierContext nestedIdentifier() throws RecognitionException {
		NestedIdentifierContext _localctx = new NestedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_nestedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			identifier();
			setState(1933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(1931);
				match(DOT);
				setState(1932);
				identifier();
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

	public static class TableExprContext extends ParserRuleContext {
		public TableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpr; }
	 
		public TableExprContext() { }
		public void copyFrom(TableExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableExprIdentifierContext extends TableExprContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableExprIdentifierContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableExprIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableExprIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprSubqueryContext extends TableExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TableExprSubqueryContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableExprSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableExprSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprAliasContext extends TableExprContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableExprAliasContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableExprAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableExprAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprFunctionContext extends TableExprContext {
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public TableExprFunctionContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableExprFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableExprFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExprContext tableExpr() throws RecognitionException {
		return tableExpr(0);
	}

	private TableExprContext tableExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TableExprContext _localctx = new TableExprContext(_ctx, _parentState);
		TableExprContext _prevctx = _localctx;
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_tableExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				_localctx = new TableExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1936);
				tableIdentifier();
				}
				break;
			case 2:
				{
				_localctx = new TableExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1937);
				tableFunctionExpr();
				}
				break;
			case 3:
				{
				_localctx = new TableExprSubqueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1938);
				match(LPAREN);
				setState(1939);
				selectUnionStmt();
				setState(1940);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1952);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TableExprAliasContext(new TableExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tableExpr);
					setState(1944);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1948);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DATE:
					case FIRST:
					case ID:
					case KEY:
					case IDENTIFIER:
						{
						setState(1945);
						alias();
						}
						break;
					case AS:
						{
						setState(1946);
						match(AS);
						setState(1947);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1954);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
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

	public static class TableFunctionExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TableArgListContext tableArgList() {
			return getRuleContext(TableArgListContext.class,0);
		}
		public TableFunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFunctionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFunctionExprContext tableFunctionExpr() throws RecognitionException {
		TableFunctionExprContext _localctx = new TableFunctionExprContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_tableFunctionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			identifier();
			setState(1956);
			match(LPAREN);
			setState(1958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (PLUS - 192)))) != 0)) {
				{
				setState(1957);
				tableArgList();
				}
			}

			setState(1960);
			match(RPAREN);
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(1962);
				databaseIdentifier();
				setState(1963);
				match(DOT);
				}
				break;
			}
			setState(1967);
			identifier();
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

	public static class TableArgListContext extends ParserRuleContext {
		public List<TableArgExprContext> tableArgExpr() {
			return getRuleContexts(TableArgExprContext.class);
		}
		public TableArgExprContext tableArgExpr(int i) {
			return getRuleContext(TableArgExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public TableArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableArgListContext tableArgList() throws RecognitionException {
		TableArgListContext _localctx = new TableArgListContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_tableArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			tableArgExpr();
			setState(1974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1970);
				match(COMMA);
				setState(1971);
				tableArgExpr();
				}
				}
				setState(1976);
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

	public static class TableArgExprContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TableArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableArgExprContext tableArgExpr() throws RecognitionException {
		TableArgExprContext _localctx = new TableArgExprContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_tableArgExpr);
		try {
			setState(1980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1977);
				nestedIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1978);
				tableFunctionExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1979);
				literal();
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

	public static class DatabaseIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDatabaseIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDatabaseIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDatabaseIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseIdentifierContext databaseIdentifier() throws RecognitionException {
		DatabaseIdentifierContext _localctx = new DatabaseIdentifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_databaseIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1982);
			identifier();
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

	public static class FloatingLiteralContext extends ParserRuleContext {
		public TerminalNode FLOATING_LITERAL() { return getToken(ClickHouseParser.FLOATING_LITERAL, 0); }
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(ClickHouseParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(ClickHouseParser.DECIMAL_LITERAL, i);
		}
		public TerminalNode OCTAL_LITERAL() { return getToken(ClickHouseParser.OCTAL_LITERAL, 0); }
		public FloatingLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterFloatingLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitFloatingLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitFloatingLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingLiteralContext floatingLiteral() throws RecognitionException {
		FloatingLiteralContext _localctx = new FloatingLiteralContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_floatingLiteral);
		int _la;
		try {
			setState(1992);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOATING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1984);
				match(FLOATING_LITERAL);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1985);
				match(DOT);
				setState(1986);
				_la = _input.LA(1);
				if ( !(_la==OCTAL_LITERAL || _la==DECIMAL_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1987);
				match(DECIMAL_LITERAL);
				setState(1988);
				match(DOT);
				setState(1990);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(1989);
					_la = _input.LA(1);
					if ( !(_la==OCTAL_LITERAL || _la==DECIMAL_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public FloatingLiteralContext floatingLiteral() {
			return getRuleContext(FloatingLiteralContext.class,0);
		}
		public TerminalNode OCTAL_LITERAL() { return getToken(ClickHouseParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEXADECIMAL_LITERAL() { return getToken(ClickHouseParser.HEXADECIMAL_LITERAL, 0); }
		public TerminalNode INF() { return getToken(ClickHouseParser.INF, 0); }
		public TerminalNode NAN_SQL() { return getToken(ClickHouseParser.NAN_SQL, 0); }
		public TerminalNode PLUS() { return getToken(ClickHouseParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH || _la==PLUS) {
				{
				setState(1994);
				_la = _input.LA(1);
				if ( !(_la==DASH || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(1997);
				floatingLiteral();
				}
				break;
			case 2:
				{
				setState(1998);
				match(OCTAL_LITERAL);
				}
				break;
			case 3:
				{
				setState(1999);
				match(DECIMAL_LITERAL);
				}
				break;
			case 4:
				{
				setState(2000);
				match(HEXADECIMAL_LITERAL);
				}
				break;
			case 5:
				{
				setState(2001);
				match(INF);
				}
				break;
			case 6:
				{
				setState(2002);
				match(NAN_SQL);
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

	public static class LiteralContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_literal);
		try {
			setState(2008);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INF:
			case NAN_SQL:
			case FLOATING_LITERAL:
			case OCTAL_LITERAL:
			case DECIMAL_LITERAL:
			case HEXADECIMAL_LITERAL:
			case DASH:
			case DOT:
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2005);
				numberLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2006);
				match(STRING_LITERAL);
				}
				break;
			case NULL_SQL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2007);
				match(NULL_SQL);
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(ClickHouseParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(ClickHouseParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(ClickHouseParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(ClickHouseParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(ClickHouseParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(ClickHouseParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(ClickHouseParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(ClickHouseParser.YEAR, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (HOUR - 75)) | (1L << (MINUTE - 75)) | (1L << (MONTH - 75)) | (1L << (QUARTER - 75)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (SECOND - 144)) | (1L << (WEEK - 144)) | (1L << (YEAR - 144)))) != 0)) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(ClickHouseParser.ALTER, 0); }
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public TerminalNode ANTI() { return getToken(ClickHouseParser.ANTI, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(ClickHouseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TerminalNode ASCENDING() { return getToken(ClickHouseParser.ASCENDING, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public TerminalNode AST() { return getToken(ClickHouseParser.AST, 0); }
		public TerminalNode ASYNC() { return getToken(ClickHouseParser.ASYNC, 0); }
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode BETWEEN() { return getToken(ClickHouseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(ClickHouseParser.BOTH, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public TerminalNode CASE() { return getToken(ClickHouseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(ClickHouseParser.CAST, 0); }
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(ClickHouseParser.CLUSTER, 0); }
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode COLLATE() { return getToken(ClickHouseParser.COLLATE, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode CONSTRAINT() { return getToken(ClickHouseParser.CONSTRAINT, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode CROSS() { return getToken(ClickHouseParser.CROSS, 0); }
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(ClickHouseParser.CURRENT, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(ClickHouseParser.DATABASES, 0); }
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode DEDUPLICATE() { return getToken(ClickHouseParser.DEDUPLICATE, 0); }
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode DELAY() { return getToken(ClickHouseParser.DELAY, 0); }
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(ClickHouseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode DESCENDING() { return getToken(ClickHouseParser.DESCENDING, 0); }
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(ClickHouseParser.DISTRIBUTED, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(ClickHouseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(ClickHouseParser.END, 0); }
		public TerminalNode ENGINE() { return getToken(ClickHouseParser.ENGINE, 0); }
		public TerminalNode EVENTS() { return getToken(ClickHouseParser.EVENTS, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(ClickHouseParser.EXPLAIN, 0); }
		public TerminalNode EXPRESSION() { return getToken(ClickHouseParser.EXPRESSION, 0); }
		public TerminalNode EXTRACT() { return getToken(ClickHouseParser.EXTRACT, 0); }
		public TerminalNode FETCHES() { return getToken(ClickHouseParser.FETCHES, 0); }
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode FLUSH() { return getToken(ClickHouseParser.FLUSH, 0); }
		public TerminalNode FOR() { return getToken(ClickHouseParser.FOR, 0); }
		public TerminalNode FOLLOWING() { return getToken(ClickHouseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public TerminalNode FREEZE() { return getToken(ClickHouseParser.FREEZE, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode FULL() { return getToken(ClickHouseParser.FULL, 0); }
		public TerminalNode FUNCTION() { return getToken(ClickHouseParser.FUNCTION, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode GRANULARITY() { return getToken(ClickHouseParser.GRANULARITY, 0); }
		public TerminalNode GROUP() { return getToken(ClickHouseParser.GROUP, 0); }
		public TerminalNode HAVING() { return getToken(ClickHouseParser.HAVING, 0); }
		public TerminalNode HIERARCHICAL() { return getToken(ClickHouseParser.HIERARCHICAL, 0); }
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode ILIKE() { return getToken(ClickHouseParser.ILIKE, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TerminalNode INJECTIVE() { return getToken(ClickHouseParser.INJECTIVE, 0); }
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public TerminalNode INSERT() { return getToken(ClickHouseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(ClickHouseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(ClickHouseParser.IS, 0); }
		public TerminalNode IS_OBJECT_ID() { return getToken(ClickHouseParser.IS_OBJECT_ID, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public TerminalNode JSON_FALSE() { return getToken(ClickHouseParser.JSON_FALSE, 0); }
		public TerminalNode JSON_TRUE() { return getToken(ClickHouseParser.JSON_TRUE, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public TerminalNode KILL() { return getToken(ClickHouseParser.KILL, 0); }
		public TerminalNode LAST() { return getToken(ClickHouseParser.LAST, 0); }
		public TerminalNode LAYOUT() { return getToken(ClickHouseParser.LAYOUT, 0); }
		public TerminalNode LEADING() { return getToken(ClickHouseParser.LEADING, 0); }
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode LIFETIME() { return getToken(ClickHouseParser.LIFETIME, 0); }
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public TerminalNode LIVE() { return getToken(ClickHouseParser.LIVE, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public TerminalNode LOGS() { return getToken(ClickHouseParser.LOGS, 0); }
		public TerminalNode MATERIALIZE() { return getToken(ClickHouseParser.MATERIALIZE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public TerminalNode MERGES() { return getToken(ClickHouseParser.MERGES, 0); }
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode MOVE() { return getToken(ClickHouseParser.MOVE, 0); }
		public TerminalNode MUTATION() { return getToken(ClickHouseParser.MUTATION, 0); }
		public TerminalNode NO() { return getToken(ClickHouseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode NULLS() { return getToken(ClickHouseParser.NULLS, 0); }
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public TerminalNode OPTIMIZE() { return getToken(ClickHouseParser.OPTIMIZE, 0); }
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode OUTFILE() { return getToken(ClickHouseParser.OUTFILE, 0); }
		public TerminalNode OVER() { return getToken(ClickHouseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public TerminalNode POPULATE() { return getToken(ClickHouseParser.POPULATE, 0); }
		public TerminalNode PRECEDING() { return getToken(ClickHouseParser.PRECEDING, 0); }
		public TerminalNode PREWHERE() { return getToken(ClickHouseParser.PREWHERE, 0); }
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode RANGE() { return getToken(ClickHouseParser.RANGE, 0); }
		public TerminalNode RELOAD() { return getToken(ClickHouseParser.RELOAD, 0); }
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public TerminalNode REPLICA() { return getToken(ClickHouseParser.REPLICA, 0); }
		public TerminalNode REPLICATED() { return getToken(ClickHouseParser.REPLICATED, 0); }
		public TerminalNode RIGHT() { return getToken(ClickHouseParser.RIGHT, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(ClickHouseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(ClickHouseParser.ROWS, 0); }
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public TerminalNode SELECT() { return getToken(ClickHouseParser.SELECT, 0); }
		public TerminalNode SEMI() { return getToken(ClickHouseParser.SEMI, 0); }
		public TerminalNode SENDS() { return getToken(ClickHouseParser.SENDS, 0); }
		public TerminalNode SET() { return getToken(ClickHouseParser.SET, 0); }
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode SOURCE() { return getToken(ClickHouseParser.SOURCE, 0); }
		public TerminalNode START() { return getToken(ClickHouseParser.START, 0); }
		public TerminalNode STOP() { return getToken(ClickHouseParser.STOP, 0); }
		public TerminalNode SUBSTRING() { return getToken(ClickHouseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode SYNTAX() { return getToken(ClickHouseParser.SYNTAX, 0); }
		public TerminalNode SYSTEM() { return getToken(ClickHouseParser.SYSTEM, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(ClickHouseParser.TABLES, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TEST() { return getToken(ClickHouseParser.TEST, 0); }
		public TerminalNode THEN() { return getToken(ClickHouseParser.THEN, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public TerminalNode TIMEOUT() { return getToken(ClickHouseParser.TIMEOUT, 0); }
		public TerminalNode TIMESTAMP() { return getToken(ClickHouseParser.TIMESTAMP, 0); }
		public TerminalNode TOTALS() { return getToken(ClickHouseParser.TOTALS, 0); }
		public TerminalNode TRAILING() { return getToken(ClickHouseParser.TRAILING, 0); }
		public TerminalNode TRIM() { return getToken(ClickHouseParser.TRIM, 0); }
		public TerminalNode TRUNCATE() { return getToken(ClickHouseParser.TRUNCATE, 0); }
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode TOP() { return getToken(ClickHouseParser.TOP, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TerminalNode TYPE() { return getToken(ClickHouseParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(ClickHouseParser.UNBOUNDED, 0); }
		public TerminalNode UNION() { return getToken(ClickHouseParser.UNION, 0); }
		public TerminalNode UPDATE() { return getToken(ClickHouseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(ClickHouseParser.USE, 0); }
		public TerminalNode USING() { return getToken(ClickHouseParser.USING, 0); }
		public TerminalNode UUID() { return getToken(ClickHouseParser.UUID, 0); }
		public TerminalNode VALUES() { return getToken(ClickHouseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TerminalNode WATCH() { return getToken(ClickHouseParser.WATCH, 0); }
		public TerminalNode WHEN() { return getToken(ClickHouseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(ClickHouseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0)) ) {
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

	public static class KeywordForAliasContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public KeywordForAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordForAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterKeywordForAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitKeywordForAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitKeywordForAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordForAliasContext keywordForAlias() throws RecognitionException {
		KeywordForAliasContext _localctx = new KeywordForAliasContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_keywordForAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (DATE - 35)) | (1L << (FIRST - 35)) | (1L << (ID - 35)) | (1L << (KEY - 35)))) != 0)) ) {
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseParser.IDENTIFIER, 0); }
		public KeywordForAliasContext keywordForAlias() {
			return getRuleContext(KeywordForAliasContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_alias);
		try {
			setState(2018);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2016);
				match(IDENTIFIER);
				}
				break;
			case DATE:
			case FIRST:
			case ID:
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2017);
				keywordForAlias();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseParser.IDENTIFIER, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_identifier);
		try {
			setState(2023);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2020);
				match(IDENTIFIER);
				}
				break;
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case QUARTER:
			case SECOND:
			case WEEK:
			case YEAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2021);
				interval();
				}
				break;
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case CURRENT:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOLLOWING:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MODIFY:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case OVER:
			case PARTITION:
			case POPULATE:
			case PRECEDING:
			case PREWHERE:
			case PRIMARY:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case ROW:
			case ROWS:
			case SAMPLE:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNBOUNDED:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case JSON_FALSE:
			case JSON_TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2022);
				keyword();
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

	public static class IdentifierOrNullContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public IdentifierOrNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterIdentifierOrNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitIdentifierOrNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitIdentifierOrNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrNullContext identifierOrNull() throws RecognitionException {
		IdentifierOrNullContext _localctx = new IdentifierOrNullContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_identifierOrNull);
		try {
			setState(2027);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case CURRENT:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOLLOWING:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case OVER:
			case PARTITION:
			case POPULATE:
			case PRECEDING:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case ROW:
			case ROWS:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNBOUNDED:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2025);
				identifier();
				}
				break;
			case NULL_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2026);
				match(NULL_SQL);
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

	public static class EnumValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
			match(STRING_LITERAL);
			setState(2030);
			match(EQ_SINGLE);
			setState(2031);
			numberLiteral();
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
		case 13:
			return dictionaryAttrDfnt_sempred((DictionaryAttrDfntContext)_localctx, predIndex);
		case 14:
			return dictionaryEngineClause_sempred((DictionaryEngineClauseContext)_localctx, predIndex);
		case 27:
			return engineClause_sempred((EngineClauseContext)_localctx, predIndex);
		case 71:
			return joinExpr_sempred((JoinExprContext)_localctx, predIndex);
		case 97:
			return columnExpr_sempred((ColumnExprContext)_localctx, predIndex);
		case 103:
			return tableExpr_sempred((TableExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dictionaryAttrDfnt_sempred(DictionaryAttrDfntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_localctx.attrs.count("default");
		case 1:
			return !_localctx.attrs.count("expression");
		case 2:
			return !_localctx.attrs.count("hierarchical");
		case 3:
			return !_localctx.attrs.count("injective");
		case 4:
			return !_localctx.attrs.count("is_object_id");
		}
		return true;
	}
	private boolean dictionaryEngineClause_sempred(DictionaryEngineClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return !_localctx.clauses.count("source");
		case 6:
			return !_localctx.clauses.count("lifetime");
		case 7:
			return !_localctx.clauses.count("layout");
		case 8:
			return !_localctx.clauses.count("range");
		case 9:
			return !_localctx.clauses.count("settings");
		}
		return true;
	}
	private boolean engineClause_sempred(EngineClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return !_localctx.clauses.count("orderByClause");
		case 11:
			return !_localctx.clauses.count("partitionByClause");
		case 12:
			return !_localctx.clauses.count("primaryKeyClause");
		case 13:
			return !_localctx.clauses.count("sampleByClause");
		case 14:
			return !_localctx.clauses.count("ttlClause");
		case 15:
			return !_localctx.clauses.count("settingsClause");
		}
		return true;
	}
	private boolean joinExpr_sempred(JoinExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean columnExpr_sempred(ColumnExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 16);
		case 19:
			return precpred(_ctx, 15);
		case 20:
			return precpred(_ctx, 14);
		case 21:
			return precpred(_ctx, 11);
		case 22:
			return precpred(_ctx, 10);
		case 23:
			return precpred(_ctx, 9);
		case 24:
			return precpred(_ctx, 8);
		case 25:
			return precpred(_ctx, 19);
		case 26:
			return precpred(_ctx, 18);
		case 27:
			return precpred(_ctx, 13);
		case 28:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean tableExpr_sempred(TableExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e8\u07f4\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\3\2\3\2\3\2\3\2\5\2\u00f5\n\2\3\2\3\2\5\2\u00f9\n\2\3\2\5\2"+
		"\u00fc\n\2\3\2\5\2\u00ff\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0113\n\3\3\4\3\4\3\4\3\4\5\4\u0119"+
		"\n\4\3\4\3\4\3\4\7\4\u011e\n\4\f\4\16\4\u0121\13\4\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u0128\n\5\3\5\3\5\5\5\u012c\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0133\n\5"+
		"\3\5\3\5\3\5\5\5\u0138\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u013f\n\5\3\5\3\5\3"+
		"\5\5\5\u0144\n\5\3\5\3\5\3\5\3\5\5\5\u014a\n\5\3\5\3\5\3\5\3\5\5\5\u0150"+
		"\n\5\3\5\3\5\3\5\5\5\u0155\n\5\3\5\3\5\3\5\3\5\5\5\u015b\n\5\3\5\3\5\3"+
		"\5\5\5\u0160\n\5\3\5\3\5\3\5\3\5\5\5\u0166\n\5\3\5\3\5\3\5\5\5\u016b\n"+
		"\5\3\5\3\5\3\5\3\5\5\5\u0171\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u017f\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0186\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u018d\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0194\n\5\3\5\3\5\3\5\3"+
		"\5\5\5\u019a\n\5\3\5\3\5\3\5\5\5\u019f\n\5\3\5\3\5\3\5\3\5\5\5\u01a5\n"+
		"\5\3\5\3\5\3\5\5\5\u01aa\n\5\3\5\3\5\3\5\3\5\5\5\u01b0\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u01b9\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01c2\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01cc\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01e0\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u01e8\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u01f7\n\5\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u01ff\n\7\f\7"+
		"\16\7\u0202\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u020f"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u0215\n\13\3\f\3\f\3\f\3\f\5\f\u021b\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0222\n\r\3\r\3\r\5\r\u0226\n\r\3\r\5\r\u0229"+
		"\n\r\3\r\3\r\3\r\3\r\5\r\u022f\n\r\3\r\5\r\u0232\n\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0238\n\r\3\r\3\r\5\r\u023c\n\r\3\r\5\r\u023f\n\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u024a\n\r\3\r\3\r\5\r\u024e\n\r\3\r\5\r\u0251\n"+
		"\r\3\r\3\r\3\r\5\r\u0256\n\r\5\r\u0258\n\r\3\r\5\r\u025b\n\r\3\r\5\r\u025e"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0268\n\r\3\r\3\r\5\r\u026c\n"+
		"\r\3\r\5\r\u026f\n\r\3\r\5\r\u0272\n\r\3\r\3\r\3\r\5\r\u0277\n\r\5\r\u0279"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0281\n\r\3\r\5\r\u0284\n\r\3\r\5\r\u0287"+
		"\n\r\3\r\3\r\3\r\3\r\5\r\u028d\n\r\3\r\3\r\5\r\u0291\n\r\3\r\5\r\u0294"+
		"\n\r\3\r\5\r\u0297\n\r\3\r\5\r\u029a\n\r\3\r\5\r\u029d\n\r\3\r\5\r\u02a0"+
		"\n\r\3\r\3\r\3\r\5\r\u02a5\n\r\3\r\3\r\3\r\3\r\5\r\u02ab\n\r\3\r\3\r\5"+
		"\r\u02af\n\r\3\r\5\r\u02b2\n\r\3\r\5\r\u02b5\n\r\3\r\3\r\5\r\u02b9\n\r"+
		"\3\16\3\16\3\16\3\16\7\16\u02bf\n\16\f\16\16\16\u02c2\13\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u02db\n\17\f\17\16\17\u02de\13"+
		"\17\3\20\5\20\u02e1\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u02f7\n\20"+
		"\f\20\16\20\u02fa\13\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0304"+
		"\n\22\3\22\5\22\u0307\n\22\3\23\3\23\3\23\3\23\3\23\7\23\u030e\n\23\f"+
		"\23\16\23\u0311\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0321\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u032a\n\25\f\25\16\25\u032d\13\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u033e\n\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u034b\n\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u035a\n\34"+
		"\f\34\16\34\u035d\13\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0365\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0380\n\35"+
		"\f\35\16\35\u0383\13\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u039b\n#\f#\16#\u039e\13#\3$\3"+
		"$\5$\u03a2\n$\3$\3$\3$\5$\u03a7\n$\3$\5$\u03aa\n$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\5%\u03b6\n%\3&\3&\3&\5&\u03bb\n&\3&\5&\u03be\n&\3&\5&\u03c1"+
		"\n&\3&\3&\5&\u03c5\n&\3&\3&\5&\u03c9\n&\3&\3&\5&\u03cd\n&\3&\5&\u03d0"+
		"\n&\3&\3&\5&\u03d4\n&\5&\u03d6\n&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)"+
		"\3)\3)\3*\3*\3*\3*\3*\7*\u03ea\n*\f*\16*\u03ed\13*\3*\3*\3+\3+\3+\5+\u03f4"+
		"\n+\3+\5+\u03f7\n+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0401\n,\3-\3-\5-\u0405"+
		"\n-\3-\3-\3.\3.\3.\3.\5.\u040d\n.\3.\3.\5.\u0411\n.\3.\3.\3.\5.\u0416"+
		"\n.\3.\3.\5.\u041a\n.\3.\3.\5.\u041e\n.\3.\3.\5.\u0422\n.\3.\3.\5.\u0426"+
		"\n.\5.\u0428\n.\3/\3/\3/\3/\3/\3/\5/\u0430\n/\3/\3/\5/\u0434\n/\3/\5/"+
		"\u0437\n/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u043f\n\60\3\61\3\61\3\61"+
		"\5\61\u0444\n\61\3\61\3\61\3\61\5\61\u0449\n\61\3\61\5\61\u044c\n\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\7\62\u0454\n\62\f\62\16\62\u0457\13\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\5\63\u0460\n\63\3\63\3\63\5\63\u0464"+
		"\n\63\3\64\3\64\3\64\5\64\u0469\n\64\3\64\3\64\5\64\u046d\n\64\3\65\3"+
		"\65\3\65\3\65\5\65\u0473\n\65\3\65\5\65\u0476\n\65\3\65\5\65\u0479\n\65"+
		"\3\65\5\65\u047c\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\7\66\u0488\n\66\f\66\16\66\u048b\13\66\3\66\5\66\u048e\n\66\3\67\3\67"+
		"\5\67\u0492\n\67\3\67\3\67\3\67\5\67\u0497\n\67\3\67\5\67\u049a\n\67\3"+
		"\67\3\67\38\38\38\38\78\u04a2\n8\f8\168\u04a5\138\39\39\39\39\39\59\u04ac"+
		"\n9\3:\5:\u04af\n:\3:\3:\5:\u04b3\n:\3:\5:\u04b6\n:\3:\3:\5:\u04ba\n:"+
		"\3:\5:\u04bd\n:\3:\5:\u04c0\n:\3:\5:\u04c3\n:\3:\5:\u04c6\n:\3:\5:\u04c9"+
		"\n:\3:\3:\5:\u04cd\n:\3:\3:\5:\u04d1\n:\3:\5:\u04d4\n:\3:\5:\u04d7\n:"+
		"\3:\5:\u04da\n:\3:\5:\u04dd\n:\3:\5:\u04e0\n:\3;\3;\3;\3<\3<\3<\3<\5<"+
		"\u04e9\n<\3=\3=\3=\3>\5>\u04ef\n>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@"+
		"\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\5B\u050a\nB\3C\3C\3C\3D\3D\3D"+
		"\3D\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\5G\u0520\nG\3H\3H\3H\3I\3I"+
		"\3I\5I\u0528\nI\3I\5I\u052b\nI\3I\3I\3I\3I\5I\u0531\nI\3I\3I\3I\3I\3I"+
		"\3I\5I\u0539\nI\3I\5I\u053c\nI\3I\3I\3I\3I\7I\u0542\nI\fI\16I\u0545\13"+
		"I\3J\5J\u0548\nJ\3J\3J\3J\5J\u054d\nJ\3J\5J\u0550\nJ\3J\5J\u0553\nJ\3"+
		"J\3J\5J\u0557\nJ\3J\3J\5J\u055b\nJ\3J\5J\u055e\nJ\5J\u0560\nJ\3J\5J\u0563"+
		"\nJ\3J\3J\5J\u0567\nJ\3J\3J\5J\u056b\nJ\3J\5J\u056e\nJ\5J\u0570\nJ\5J"+
		"\u0572\nJ\3K\5K\u0575\nK\3K\3K\3K\5K\u057a\nK\3L\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\5L\u0585\nL\3M\3M\3M\3M\5M\u058b\nM\3N\3N\3N\5N\u0590\nN\3O\3O\3O"+
		"\7O\u0595\nO\fO\16O\u0598\13O\3P\3P\5P\u059c\nP\3P\3P\5P\u05a0\nP\3P\3"+
		"P\5P\u05a4\nP\3Q\3Q\3Q\5Q\u05a9\nQ\3R\3R\3R\7R\u05ae\nR\fR\16R\u05b1\13"+
		"R\3S\3S\3S\3S\3T\5T\u05b8\nT\3T\5T\u05bb\nT\3T\5T\u05be\nT\3U\3U\3U\3"+
		"U\3V\3V\3V\3V\3W\3W\3W\3X\3X\3X\3X\3X\3X\5X\u05d1\nX\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u05df\nY\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\3[\5[\u05ef\n[\3[\5[\u05f2\n[\3[\3[\3[\3[\3[\3[\3[\5[\u05fb\n[\3[\3"+
		"[\5[\u05ff\n[\3[\3[\3[\5[\u0604\n[\3[\3[\3[\5[\u0609\n[\3[\5[\u060c\n"+
		"[\5[\u060e\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0624\n\\\3\\\5\\\u0627\n\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\5\\\u0632\n\\\3]\3]\5]\u0636\n]\3]\5]\u0639\n]"+
		"\3]\3]\5]\u063d\n]\3]\3]\5]\u0641\n]\3^\3^\3^\3_\3_\3_\5_\u0649\n_\3_"+
		"\3_\5_\u064d\n_\3`\3`\3`\3`\3`\3`\3`\3`\3`\7`\u0658\n`\f`\16`\u065b\13"+
		"`\3`\3`\3`\3`\3`\3`\3`\7`\u0664\n`\f`\16`\u0667\13`\3`\3`\3`\3`\3`\3`"+
		"\3`\7`\u0670\n`\f`\16`\u0673\13`\3`\3`\3`\3`\3`\5`\u067a\n`\3`\3`\5`\u067e"+
		"\n`\3a\3a\3a\7a\u0683\na\fa\16a\u0686\13a\3b\3b\3b\5b\u068b\nb\3b\3b\3"+
		"b\3b\3b\3b\5b\u0693\nb\3c\3c\3c\5c\u0698\nc\3c\3c\3c\3c\3c\6c\u069f\n"+
		"c\rc\16c\u06a0\3c\3c\5c\u06a5\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u06c4\nc\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u06d5\nc\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\5c\u06e1\nc\3c\3c\3c\3c\3c\3c\3c\3c\5c\u06eb\nc\3c\5c\u06ee"+
		"\nc\3c\3c\5c\u06f2\nc\3c\5c\u06f5\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c"+
		"\u0701\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0712\nc\3c"+
		"\3c\5c\u0716\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0727"+
		"\nc\3c\5c\u072a\nc\3c\3c\5c\u072e\nc\3c\5c\u0731\nc\3c\3c\3c\3c\3c\3c"+
		"\3c\3c\3c\5c\u073c\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\5c\u0754\nc\3c\3c\3c\3c\3c\5c\u075b\nc\7c\u075d\nc"+
		"\fc\16c\u0760\13c\3d\3d\3d\7d\u0765\nd\fd\16d\u0768\13d\3e\3e\5e\u076c"+
		"\ne\3f\3f\3f\3f\7f\u0772\nf\ff\16f\u0775\13f\3f\3f\3f\3f\3f\7f\u077c\n"+
		"f\ff\16f\u077f\13f\5f\u0781\nf\3f\3f\3f\3g\3g\3g\5g\u0789\ng\3g\3g\3h"+
		"\3h\3h\5h\u0790\nh\3i\3i\3i\3i\3i\3i\3i\5i\u0799\ni\3i\3i\3i\3i\5i\u079f"+
		"\ni\7i\u07a1\ni\fi\16i\u07a4\13i\3j\3j\3j\5j\u07a9\nj\3j\3j\3k\3k\3k\5"+
		"k\u07b0\nk\3k\3k\3l\3l\3l\7l\u07b7\nl\fl\16l\u07ba\13l\3m\3m\3m\5m\u07bf"+
		"\nm\3n\3n\3o\3o\3o\3o\3o\3o\5o\u07c9\no\5o\u07cb\no\3p\5p\u07ce\np\3p"+
		"\3p\3p\3p\3p\3p\5p\u07d6\np\3q\3q\3q\5q\u07db\nq\3r\3r\3s\3s\3t\3t\3u"+
		"\3u\5u\u07e5\nu\3v\3v\3v\5v\u07ea\nv\3w\3w\5w\u07ee\nw\3x\3x\3x\3x\3x"+
		"\2\5\u0090\u00c4\u00d0y\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\2\36\b\2\5\5\32\32\35\35((ii\u00ae\u00ae"+
		"\4\2\21\21\37\37\5\2\5\5((ii\4\2++--\4\2..\64\64\5\2\20\20\u009d\u009d"+
		"\u00a3\u00a3\4\2!!\u008e\u008e\4\2UUaa\4\2HHff\5\2\6\6\n\n\16\16\6\2\6"+
		"\6\t\n\16\16\u0094\u0094\4\2aa\u008d\u008d\4\2\6\6\n\n\4\2ww\u00cd\u00cd"+
		"\4\2\r\r+,\4\2??^^\4\2\u0086\u0086\u0090\u0090\4\2EEQQ\3\2\u009a\u009b"+
		"\5\2\23\23``\u00ab\u00ab\5\2\u00c9\u00c9\u00db\u00db\u00e4\u00e4\4\2\u00ce"+
		"\u00cf\u00dc\u00dc\4\2PPcc\3\2\u00c4\u00c5\4\2\u00cf\u00cf\u00dc\u00dc"+
		"\n\2&&MMmmoo\u0085\u0085\u0092\u0092\u00ba\u00ba\u00bf\u00bf\16\2\4%\'"+
		"LNRTlnnpqstv\u0083\u0086\u0091\u0093\u00b9\u00bb\u00be\u00c0\u00c1\6\2"+
		"%%??NN\\\\\2\u090f\2\u00fe\3\2\2\2\4\u0112\3\2\2\2\6\u0114\3\2\2\2\b\u01f6"+
		"\3\2\2\2\n\u01f8\3\2\2\2\f\u01fb\3\2\2\2\16\u0203\3\2\2\2\20\u0207\3\2"+
		"\2\2\22\u020e\3\2\2\2\24\u0210\3\2\2\2\26\u0216\3\2\2\2\30\u02b8\3\2\2"+
		"\2\32\u02ba\3\2\2\2\34\u02c5\3\2\2\2\36\u02e0\3\2\2\2 \u02fb\3\2\2\2\""+
		"\u02ff\3\2\2\2$\u0308\3\2\2\2&\u0315\3\2\2\2(\u0324\3\2\2\2*\u0331\3\2"+
		"\2\2,\u0341\3\2\2\2.\u0346\3\2\2\2\60\u034c\3\2\2\2\62\u034f\3\2\2\2\64"+
		"\u0352\3\2\2\2\66\u0364\3\2\2\28\u0366\3\2\2\2:\u0384\3\2\2\2<\u0387\3"+
		"\2\2\2>\u038a\3\2\2\2@\u038e\3\2\2\2B\u0392\3\2\2\2D\u0396\3\2\2\2F\u039f"+
		"\3\2\2\2H\u03b5\3\2\2\2J\u03d5\3\2\2\2L\u03d7\3\2\2\2N\u03da\3\2\2\2P"+
		"\u03e1\3\2\2\2R\u03e4\3\2\2\2T\u03f0\3\2\2\2V\u03f8\3\2\2\2X\u0402\3\2"+
		"\2\2Z\u0427\3\2\2\2\\\u0436\3\2\2\2^\u043e\3\2\2\2`\u0440\3\2\2\2b\u044f"+
		"\3\2\2\2d\u0463\3\2\2\2f\u0465\3\2\2\2h\u046e\3\2\2\2j\u047d\3\2\2\2l"+
		"\u048f\3\2\2\2n\u049d\3\2\2\2p\u04ab\3\2\2\2r\u04ae\3\2\2\2t\u04e1\3\2"+
		"\2\2v\u04e4\3\2\2\2x\u04ea\3\2\2\2z\u04ee\3\2\2\2|\u04f4\3\2\2\2~\u04fb"+
		"\3\2\2\2\u0080\u04fe\3\2\2\2\u0082\u0501\3\2\2\2\u0084\u050b\3\2\2\2\u0086"+
		"\u050e\3\2\2\2\u0088\u0512\3\2\2\2\u008a\u0516\3\2\2\2\u008c\u051b\3\2"+
		"\2\2\u008e\u0521\3\2\2\2\u0090\u0530\3\2\2\2\u0092\u0571\3\2\2\2\u0094"+
		"\u0579\3\2\2\2\u0096\u0584\3\2\2\2\u0098\u0586\3\2\2\2\u009a\u058c\3\2"+
		"\2\2\u009c\u0591\3\2\2\2\u009e\u0599\3\2\2\2\u00a0\u05a5\3\2\2\2\u00a2"+
		"\u05aa\3\2\2\2\u00a4\u05b2\3\2\2\2\u00a6\u05b7\3\2\2\2\u00a8\u05bf\3\2"+
		"\2\2\u00aa\u05c3\3\2\2\2\u00ac\u05c7\3\2\2\2\u00ae\u05d0\3\2\2\2\u00b0"+
		"\u05de\3\2\2\2\u00b2\u05e0\3\2\2\2\u00b4\u060d\3\2\2\2\u00b6\u0631\3\2"+
		"\2\2\u00b8\u0633\3\2\2\2\u00ba\u0642\3\2\2\2\u00bc\u0645\3\2\2\2\u00be"+
		"\u067d\3\2\2\2\u00c0\u067f\3\2\2\2\u00c2\u0692\3\2\2\2\u00c4\u0715\3\2"+
		"\2\2\u00c6\u0761\3\2\2\2\u00c8\u076b\3\2\2\2\u00ca\u0780\3\2\2\2\u00cc"+
		"\u0788\3\2\2\2\u00ce\u078c\3\2\2\2\u00d0\u0798\3\2\2\2\u00d2\u07a5\3\2"+
		"\2\2\u00d4\u07af\3\2\2\2\u00d6\u07b3\3\2\2\2\u00d8\u07be\3\2\2\2\u00da"+
		"\u07c0\3\2\2\2\u00dc\u07ca\3\2\2\2\u00de\u07cd\3\2\2\2\u00e0\u07da\3\2"+
		"\2\2\u00e2\u07dc\3\2\2\2\u00e4\u07de\3\2\2\2\u00e6\u07e0\3\2\2\2\u00e8"+
		"\u07e4\3\2\2\2\u00ea\u07e9\3\2\2\2\u00ec\u07ed\3\2\2\2\u00ee\u07ef\3\2"+
		"\2\2\u00f0\u00f4\5\4\3\2\u00f1\u00f2\7X\2\2\u00f2\u00f3\7}\2\2\u00f3\u00f5"+
		"\7\u00c7\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3\2\2"+
		"\2\u00f6\u00f7\7C\2\2\u00f7\u00f9\5\u00ecw\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00fc\7\u00e3\2\2\u00fb\u00fa"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00ff\5`\61\2\u00fe"+
		"\u00f0\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\3\3\2\2\2\u0100\u0113\5\6\4\2"+
		"\u0101\u0113\5\24\13\2\u0102\u0113\5\26\f\2\u0103\u0113\5\30\r\2\u0104"+
		"\u0113\5X-\2\u0105\u0113\5Z.\2\u0106\u0113\5\\/\2\u0107\u0113\5^\60\2"+
		"\u0108\u0113\5f\64\2\u0109\u0113\5h\65\2\u010a\u0113\5j\66\2\u010b\u0113"+
		"\5n8\2\u010c\u0113\5\u00b2Z\2\u010d\u0113\5\u00b4[\2\u010e\u0113\5\u00b6"+
		"\\\2\u010f\u0113\5\u00b8]\2\u0110\u0113\5\u00ba^\2\u0111\u0113\5\u00bc"+
		"_\2\u0112\u0100\3\2\2\2\u0112\u0101\3\2\2\2\u0112\u0102\3\2\2\2\u0112"+
		"\u0103\3\2\2\2\u0112\u0104\3\2\2\2\u0112\u0105\3\2\2\2\u0112\u0106\3\2"+
		"\2\2\u0112\u0107\3\2\2\2\u0112\u0108\3\2\2\2\u0112\u0109\3\2\2\2\u0112"+
		"\u010a\3\2\2\2\u0112\u010b\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u010d\3\2"+
		"\2\2\u0112\u010e\3\2\2\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0111\3\2\2\2\u0113\5\3\2\2\2\u0114\u0115\7\7\2\2\u0115\u0116\7\u00a0"+
		"\2\2\u0116\u0118\5\u00d4k\2\u0117\u0119\5.\30\2\u0118\u0117\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011f\5\b\5\2\u011b\u011c\7\u00cd"+
		"\2\2\u011c\u011e\5\b\5\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\7\3\2\2\2\u0121\u011f\3\2\2\2"+
		"\u0122\u0123\7\3\2\2\u0123\u0127\7\34\2\2\u0124\u0125\7O\2\2\u0125\u0126"+
		"\7t\2\2\u0126\u0128\79\2\2\u0127\u0124\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012b\5J&\2\u012a\u012c\5\n\6\2\u012b\u012a\3\2\2"+
		"\2\u012b\u012c\3\2\2\2\u012c\u01f7\3\2\2\2\u012d\u012e\7\3\2\2\u012e\u0132"+
		"\7R\2\2\u012f\u0130\7O\2\2\u0130\u0131\7t\2\2\u0131\u0133\79\2\2\u0132"+
		"\u012f\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0137\5N"+
		"(\2\u0135\u0136\7\4\2\2\u0136\u0138\5\u00ceh\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u01f7\3\2\2\2\u0139\u013a\7\3\2\2\u013a\u013e\7\u0084"+
		"\2\2\u013b\u013c\7O\2\2\u013c\u013d\7t\2\2\u013d\u013f\79\2\2\u013e\u013b"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0143\5P)\2\u0141"+
		"\u0142\7\4\2\2\u0142\u0144\5\u00ceh\2\u0143\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u01f7\3\2\2\2\u0145\u0146\7\21\2\2\u0146\u0149\5\22\n\2"+
		"\u0147\u0148\7E\2\2\u0148\u014a\5\u00d4k\2\u0149\u0147\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u01f7\3\2\2\2\u014b\u014c\7\30\2\2\u014c\u014f\7\34\2\2"+
		"\u014d\u014e\7O\2\2\u014e\u0150\79\2\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0154\5\u00ceh\2\u0152\u0153\7Q\2\2"+
		"\u0153\u0155\5\22\n\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u01f7"+
		"\3\2\2\2\u0156\u0157\7\30\2\2\u0157\u015a\7R\2\2\u0158\u0159\7O\2\2\u0159"+
		"\u015b\79\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015f\5\u00ceh\2\u015d\u015e\7Q\2\2\u015e\u0160\5\22\n\2\u015f"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u01f7\3\2\2\2\u0161\u0162\7\30"+
		"\2\2\u0162\u0165\7\u0084\2\2\u0163\u0164\7O\2\2\u0164\u0166\79\2\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016a\5\u00ce"+
		"h\2\u0168\u0169\7Q\2\2\u0169\u016b\5\22\n\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u01f7\3\2\2\2\u016c\u016d\7\35\2\2\u016d\u0170\7"+
		"\34\2\2\u016e\u016f\7O\2\2\u016f\u0171\79\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\5\u00ceh\2\u0173\u0174"+
		"\7\u00c7\2\2\u0174\u01f7\3\2\2\2\u0175\u0176\7*\2\2\u0176\u0177\7\u00bc"+
		"\2\2\u0177\u01f7\5\u00c4c\2\u0178\u0179\7.\2\2\u0179\u01f7\5\22\n\2\u017a"+
		"\u017b\7\64\2\2\u017b\u017e\7\34\2\2\u017c\u017d\7O\2\2\u017d\u017f\7"+
		"9\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u01f7\5\u00ceh\2\u0181\u0182\7\64\2\2\u0182\u0185\7R\2\2\u0183\u0184"+
		"\7O\2\2\u0184\u0186\79\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u01f7\5\u00ceh\2\u0188\u0189\7\64\2\2\u0189\u018c"+
		"\7\u0084\2\2\u018a\u018b\7O\2\2\u018b\u018d\79\2\2\u018c\u018a\3\2\2\2"+
		"\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u01f7\5\u00ceh\2\u018f"+
		"\u0190\7\64\2\2\u0190\u01f7\5\22\n\2\u0191\u0193\7D\2\2\u0192\u0194\5"+
		"\22\n\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u01f7\3\2\2\2\u0195"+
		"\u0196\7h\2\2\u0196\u0199\7R\2\2\u0197\u0198\7O\2\2\u0198\u019a\79\2\2"+
		"\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e"+
		"\5\u00ceh\2\u019c\u019d\7Q\2\2\u019d\u019f\5\22\n\2\u019e\u019c\3\2\2"+
		"\2\u019e\u019f\3\2\2\2\u019f\u01f7\3\2\2\2\u01a0\u01a1\7h\2\2\u01a1\u01a4"+
		"\7\u0084\2\2\u01a2\u01a3\7O\2\2\u01a3\u01a5\79\2\2\u01a4\u01a2\3\2\2\2"+
		"\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a9\5\u00ceh\2\u01a7"+
		"\u01a8\7Q\2\2\u01a8\u01aa\5\22\n\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2"+
		"\2\2\u01aa\u01f7\3\2\2\2\u01ab\u01ac\7n\2\2\u01ac\u01af\7\34\2\2\u01ad"+
		"\u01ae\7O\2\2\u01ae\u01b0\79\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2"+
		"\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\5\u00ceh\2\u01b2\u01b3\5R*\2\u01b3"+
		"\u01f7\3\2\2\2\u01b4\u01b5\7n\2\2\u01b5\u01b8\7\34\2\2\u01b6\u01b7\7O"+
		"\2\2\u01b7\u01b9\79\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bb\5\u00ceh\2\u01bb\u01bc\5<\37\2\u01bc\u01f7"+
		"\3\2\2\2\u01bd\u01be\7n\2\2\u01be\u01c1\7\34\2\2\u01bf\u01c0\7O\2\2\u01c0"+
		"\u01c2\79\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\u01c4\5\u00ceh\2\u01c4\u01c5\7\u0088\2\2\u01c5\u01c6\5\20\t"+
		"\2\u01c6\u01f7\3\2\2\2\u01c7\u01c8\7n\2\2\u01c8\u01cb\7\34\2\2\u01c9\u01ca"+
		"\7O\2\2\u01ca\u01cc\79\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01f7\5J&\2\u01ce\u01cf\7n\2\2\u01cf\u01d0\7{\2\2"+
		"\u01d0\u01d1\7\24\2\2\u01d1\u01f7\5\u00c4c\2\u01d2\u01d3\7n\2\2\u01d3"+
		"\u01f7\5D#\2\u01d4\u01d5\7p\2\2\u01d5\u01df\5\22\n\2\u01d6\u01d7\7\u00a8"+
		"\2\2\u01d7\u01d8\7\61\2\2\u01d8\u01e0\7\u00c7\2\2\u01d9\u01da\7\u00a8"+
		"\2\2\u01da\u01db\7\u00b8\2\2\u01db\u01e0\7\u00c7\2\2\u01dc\u01dd\7\u00a8"+
		"\2\2\u01dd\u01de\7\u00a0\2\2\u01de\u01e0\5\u00d4k\2\u01df\u01d6\3\2\2"+
		"\2\u01df\u01d9\3\2\2\2\u01df\u01dc\3\2\2\2\u01e0\u01f7\3\2\2\2\u01e1\u01e2"+
		"\7\u0088\2\2\u01e2\u01f7\7\u00ae\2\2\u01e3\u01e4\7\u0089\2\2\u01e4\u01e7"+
		"\7\34\2\2\u01e5\u01e6\7O\2\2\u01e6\u01e8\79\2\2\u01e7\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\5\u00ceh\2\u01ea\u01eb"+
		"\7\u00a8\2\2\u01eb\u01ec\5\u00ceh\2\u01ec\u01f7\3\2\2\2\u01ed\u01ee\7"+
		"\u008a\2\2\u01ee\u01ef\5\22\n\2\u01ef\u01f0\7E\2\2\u01f0\u01f1\5\u00d4"+
		"k\2\u01f1\u01f7\3\2\2\2\u01f2\u01f3\7\u00b2\2\2\u01f3\u01f4\5\f\7\2\u01f4"+
		"\u01f5\5\u0080A\2\u01f5\u01f7\3\2\2\2\u01f6\u0122\3\2\2\2\u01f6\u012d"+
		"\3\2\2\2\u01f6\u0139\3\2\2\2\u01f6\u0145\3\2\2\2\u01f6\u014b\3\2\2\2\u01f6"+
		"\u0156\3\2\2\2\u01f6\u0161\3\2\2\2\u01f6\u016c\3\2\2\2\u01f6\u0175\3\2"+
		"\2\2\u01f6\u0178\3\2\2\2\u01f6\u017a\3\2\2\2\u01f6\u0181\3\2\2\2\u01f6"+
		"\u0188\3\2\2\2\u01f6\u018f\3\2\2\2\u01f6\u0191\3\2\2\2\u01f6\u0195\3\2"+
		"\2\2\u01f6\u01a0\3\2\2\2\u01f6\u01ab\3\2\2\2\u01f6\u01b4\3\2\2\2\u01f6"+
		"\u01bd\3\2\2\2\u01f6\u01c7\3\2\2\2\u01f6\u01ce\3\2\2\2\u01f6\u01d2\3\2"+
		"\2\2\u01f6\u01d4\3\2\2\2\u01f6\u01e1\3\2\2\2\u01f6\u01e3\3\2\2\2\u01f6"+
		"\u01ed\3\2\2\2\u01f6\u01f2\3\2\2\2\u01f7\t\3\2\2\2\u01f8\u01f9\7\4\2\2"+
		"\u01f9\u01fa\5\u00ceh\2\u01fa\13\3\2\2\2\u01fb\u0200\5\16\b\2\u01fc\u01fd"+
		"\7\u00cd\2\2\u01fd\u01ff\5\16\b\2\u01fe\u01fc\3\2\2\2\u01ff\u0202\3\2"+
		"\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\r\3\2\2\2\u0202\u0200"+
		"\3\2\2\2\u0203\u0204\5\u00ceh\2\u0204\u0205\7\u00d2\2\2\u0205\u0206\5"+
		"\u00c4c\2\u0206\17\3\2\2\2\u0207\u0208\t\2\2\2\u0208\21\3\2\2\2\u0209"+
		"\u020a\7\177\2\2\u020a\u020f\5\u00c4c\2\u020b\u020c\7\177\2\2\u020c\u020d"+
		"\7N\2\2\u020d\u020f\7\u00c7\2\2\u020e\u0209\3\2\2\2\u020e\u020b\3\2\2"+
		"\2\u020f\23\3\2\2\2\u0210\u0211\7\21\2\2\u0211\u0212\7\60\2\2\u0212\u0214"+
		"\5\u00d4k\2\u0213\u0215\5.\30\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2"+
		"\2\u0215\25\3\2\2\2\u0216\u0217\7\27\2\2\u0217\u0218\7\u00a0\2\2\u0218"+
		"\u021a\5\u00d4k\2\u0219\u021b\5\22\n\2\u021a\u0219\3\2\2\2\u021a\u021b"+
		"\3\2\2\2\u021b\27\3\2\2\2\u021c\u021d\t\3\2\2\u021d\u0221\7#\2\2\u021e"+
		"\u021f\7O\2\2\u021f\u0220\7t\2\2\u0220\u0222\79\2\2\u0221\u021e\3\2\2"+
		"\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\5\u00dan\2\u0224"+
		"\u0226\5.\30\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\3\2"+
		"\2\2\u0227\u0229\5F$\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u02b9"+
		"\3\2\2\2\u022a\u0232\7\21\2\2\u022b\u022e\7\37\2\2\u022c\u022d\7z\2\2"+
		"\u022d\u022f\7\u008a\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0232\3\2\2\2\u0230\u0232\7\u008a\2\2\u0231\u022a\3\2\2\2\u0231\u022b"+
		"\3\2\2\2\u0231\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0237\7\60\2\2"+
		"\u0234\u0235\7O\2\2\u0235\u0236\7t\2\2\u0236\u0238\79\2\2\u0237\u0234"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\5\u00d4k"+
		"\2\u023a\u023c\5\60\31\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023e\3\2\2\2\u023d\u023f\5.\30\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2"+
		"\2\2\u023f\u0240\3\2\2\2\u0240\u0241\5\32\16\2\u0241\u0242\5\36\20\2\u0242"+
		"\u02b9\3\2\2\2\u0243\u0244\t\3\2\2\u0244\u0245\7e\2\2\u0245\u0249\7\u00b7"+
		"\2\2\u0246\u0247\7O\2\2\u0247\u0248\7t\2\2\u0248\u024a\79\2\2\u0249\u0246"+
		"\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\5\u00d4k"+
		"\2\u024c\u024e\5\60\31\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u0250\3\2\2\2\u024f\u0251\5.\30\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251\u0257\3\2\2\2\u0252\u0253\7\u00be\2\2\u0253\u0255\7\u00a6\2"+
		"\2\u0254\u0256\7\u00c5\2\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0258\3\2\2\2\u0257\u0252\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2"+
		"\2\2\u0259\u025b\5\62\32\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025d\3\2\2\2\u025c\u025e\5\66\34\2\u025d\u025c\3\2\2\2\u025d\u025e\3"+
		"\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\5\64\33\2\u0260\u02b9\3\2\2\2\u0261"+
		"\u0262\t\3\2\2\u0262\u0263\7i\2\2\u0263\u0267\7\u00b7\2\2\u0264\u0265"+
		"\7O\2\2\u0265\u0266\7t\2\2\u0266\u0268\79\2\2\u0267\u0264\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\5\u00d4k\2\u026a\u026c"+
		"\5\60\31\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2"+
		"\u026d\u026f\5.\30\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0271"+
		"\3\2\2\2\u0270\u0272\5\66\34\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2\2\2"+
		"\u0272\u0278\3\2\2\2\u0273\u0279\5\62\32\2\u0274\u0276\58\35\2\u0275\u0277"+
		"\7\u0080\2\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\3\2\2"+
		"\2\u0278\u0273\3\2\2\2\u0278\u0274\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b"+
		"\5\64\33\2\u027b\u02b9\3\2\2\2\u027c\u0284\7\21\2\2\u027d\u0280\7\37\2"+
		"\2\u027e\u027f\7z\2\2\u027f\u0281\7\u008a\2\2\u0280\u027e\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0284\7\u008a\2\2\u0283\u027c"+
		"\3\2\2\2\u0283\u027d\3\2\2\2\u0283\u0282\3\2\2\2\u0284\u0286\3\2\2\2\u0285"+
		"\u0287\7\u00a2\2\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288"+
		"\3\2\2\2\u0288\u028c\7\u00a0\2\2\u0289\u028a\7O\2\2\u028a\u028b\7t\2\2"+
		"\u028b\u028d\79\2\2\u028c\u0289\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e"+
		"\3\2\2\2\u028e\u0290\5\u00d4k\2\u028f\u0291\5\60\31\2\u0290\u028f\3\2"+
		"\2\2\u0290\u0291\3\2\2\2\u0291\u0293\3\2\2\2\u0292\u0294\5.\30\2\u0293"+
		"\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u0297\5\66"+
		"\34\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298"+
		"\u029a\58\35\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2"+
		"\2\2\u029b\u029d\5\64\33\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d"+
		"\u029f\3\2\2\2\u029e\u02a0\5:\36\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2"+
		"\2\2\u02a0\u02b9\3\2\2\2\u02a1\u02a4\t\3\2\2\u02a2\u02a3\7z\2\2\u02a3"+
		"\u02a5\7\u008a\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6"+
		"\3\2\2\2\u02a6\u02aa\7\u00b7\2\2\u02a7\u02a8\7O\2\2\u02a8\u02a9\7t\2\2"+
		"\u02a9\u02ab\79\2\2\u02aa\u02a7\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac"+
		"\3\2\2\2\u02ac\u02ae\5\u00d4k\2\u02ad\u02af\5\60\31\2\u02ae\u02ad\3\2"+
		"\2\2\u02ae\u02af\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02b2\5.\30\2\u02b1"+
		"\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02b5\5\66"+
		"\34\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02b7\5\64\33\2\u02b7\u02b9\3\2\2\2\u02b8\u021c\3\2\2\2\u02b8\u0231\3"+
		"\2\2\2\u02b8\u0243\3\2\2\2\u02b8\u0261\3\2\2\2\u02b8\u0283\3\2\2\2\u02b8"+
		"\u02a1\3\2\2\2\u02b9\31\3\2\2\2\u02ba\u02bb\7\u00d8\2\2\u02bb\u02c0\5"+
		"\34\17\2\u02bc\u02bd\7\u00cd\2\2\u02bd\u02bf\5\34\17\2\u02be\u02bc\3\2"+
		"\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02c3\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\7\u00e2\2\2\u02c4\33\3"+
		"\2\2\2\u02c5\u02c6\5\u00eav\2\u02c6\u02dc\5\u00be`\2\u02c7\u02c8\6\17"+
		"\2\3\u02c8\u02c9\7(\2\2\u02c9\u02ca\5\u00e0q\2\u02ca\u02cb\b\17\1\2\u02cb"+
		"\u02db\3\2\2\2\u02cc\u02cd\6\17\3\3\u02cd\u02ce\7;\2\2\u02ce\u02cf\5\u00c4"+
		"c\2\u02cf\u02d0\b\17\1\2\u02d0\u02db\3\2\2\2\u02d1\u02d2\6\17\4\3\u02d2"+
		"\u02d3\7L\2\2\u02d3\u02db\b\17\1\2\u02d4\u02d5\6\17\5\3\u02d5\u02d6\7"+
		"T\2\2\u02d6\u02db\b\17\1\2\u02d7\u02d8\6\17\6\3\u02d8\u02d9\7Z\2\2\u02d9"+
		"\u02db\b\17\1\2\u02da\u02c7\3\2\2\2\u02da\u02cc\3\2\2\2\u02da\u02d1\3"+
		"\2\2\2\u02da\u02d4\3\2\2\2\u02da\u02d7\3\2\2\2\u02db\u02de\3\2\2\2\u02dc"+
		"\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\35\3\2\2\2\u02de\u02dc\3\2\2"+
		"\2\u02df\u02e1\5 \21\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02f8"+
		"\3\2\2\2\u02e2\u02e3\6\20\7\3\u02e3\u02e4\5$\23\2\u02e4\u02e5\b\20\1\2"+
		"\u02e5\u02f7\3\2\2\2\u02e6\u02e7\6\20\b\3\u02e7\u02e8\5&\24\2\u02e8\u02e9"+
		"\b\20\1\2\u02e9\u02f7\3\2\2\2\u02ea\u02eb\6\20\t\3\u02eb\u02ec\5(\25\2"+
		"\u02ec\u02ed\b\20\1\2\u02ed\u02f7\3\2\2\2\u02ee\u02ef\6\20\n\3\u02ef\u02f0"+
		"\5*\26\2\u02f0\u02f1\b\20\1\2\u02f1\u02f7\3\2\2\2\u02f2\u02f3\6\20\13"+
		"\3\u02f3\u02f4\5,\27\2\u02f4\u02f5\b\20\1\2\u02f5\u02f7\3\2\2\2\u02f6"+
		"\u02e2\3\2\2\2\u02f6\u02e6\3\2\2\2\u02f6\u02ea\3\2\2\2\u02f6\u02ee\3\2"+
		"\2\2\u02f6\u02f2\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8"+
		"\u02f9\3\2\2\2\u02f9\37\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fc\7\u0083"+
		"\2\2\u02fc\u02fd\7\\\2\2\u02fd\u02fe\5\u00c0a\2\u02fe!\3\2\2\2\u02ff\u0306"+
		"\5\u00eav\2\u0300\u0303\5\u00eav\2\u0301\u0302\7\u00d8\2\2\u0302\u0304"+
		"\7\u00e2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0307\3\2\2"+
		"\2\u0305\u0307\5\u00e0q\2\u0306\u0300\3\2\2\2\u0306\u0305\3\2\2\2\u0307"+
		"#\3\2\2\2\u0308\u0309\7\u0099\2\2\u0309\u030a\7\u00d8\2\2\u030a\u030b"+
		"\5\u00eav\2\u030b\u030f\7\u00d8\2\2\u030c\u030e\5\"\22\2\u030d\u030c\3"+
		"\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0312\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0313\7\u00e2\2\2\u0313\u0314"+
		"\7\u00e2\2\2\u0314%\3\2\2\2\u0315\u0316\7b\2\2\u0316\u0320\7\u00d8\2\2"+
		"\u0317\u0321\7\u00c5\2\2\u0318\u0319\7l\2\2\u0319\u031a\7\u00c5\2\2\u031a"+
		"\u031b\7j\2\2\u031b\u0321\7\u00c5\2\2\u031c\u031d\7j\2\2\u031d\u031e\7"+
		"\u00c5\2\2\u031e\u031f\7l\2\2\u031f\u0321\7\u00c5\2\2\u0320\u0317\3\2"+
		"\2\2\u0320\u0318\3\2\2\2\u0320\u031c\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0323\7\u00e2\2\2\u0323\'\3\2\2\2\u0324\u0325\7_\2\2\u0325\u0326\7\u00d8"+
		"\2\2\u0326\u0327\5\u00eav\2\u0327\u032b\7\u00d8\2\2\u0328\u032a\5\"\22"+
		"\2\u0329\u0328\3\2\2\2\u032a\u032d\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032c"+
		"\3\2\2\2\u032c\u032e\3\2\2\2\u032d\u032b\3\2\2\2\u032e\u032f\7\u00e2\2"+
		"\2\u032f\u0330\7\u00e2\2\2\u0330)\3\2\2\2\u0331\u0332\7\u0086\2\2\u0332"+
		"\u033d\7\u00d8\2\2\u0333\u0334\7l\2\2\u0334\u0335\5\u00eav\2\u0335\u0336"+
		"\7j\2\2\u0336\u0337\5\u00eav\2\u0337\u033e\3\2\2\2\u0338\u0339\7j\2\2"+
		"\u0339\u033a\5\u00eav\2\u033a\u033b\7l\2\2\u033b\u033c\5\u00eav\2\u033c"+
		"\u033e\3\2\2\2\u033d\u0333\3\2\2\2\u033d\u0338\3\2\2\2\u033e\u033f\3\2"+
		"\2\2\u033f\u0340\7\u00e2\2\2\u0340+\3\2\2\2\u0341\u0342\7\u0097\2\2\u0342"+
		"\u0343\7\u00d8\2\2\u0343\u0344\5\u00a2R\2\u0344\u0345\7\u00e2\2\2\u0345"+
		"-\3\2\2\2\u0346\u0347\7x\2\2\u0347\u034a\7\31\2\2\u0348\u034b\5\u00ea"+
		"v\2\u0349\u034b\7\u00c7\2\2\u034a\u0348\3\2\2\2\u034a\u0349\3\2\2\2\u034b"+
		"/\3\2\2\2\u034c\u034d\7\u00b5\2\2\u034d\u034e\7\u00c7\2\2\u034e\61\3\2"+
		"\2\2\u034f\u0350\7\u00a8\2\2\u0350\u0351\5\u00d4k\2\u0351\63\3\2\2\2\u0352"+
		"\u0353\7\f\2\2\u0353\u0354\5n8\2\u0354\65\3\2\2\2\u0355\u0356\7\u00d8"+
		"\2\2\u0356\u035b\5H%\2\u0357\u0358\7\u00cd\2\2\u0358\u035a\5H%\2\u0359"+
		"\u0357\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035c\3\2"+
		"\2\2\u035c\u035e\3\2\2\2\u035d\u035b\3\2\2\2\u035e\u035f\7\u00e2\2\2\u035f"+
		"\u0365\3\2\2\2\u0360\u0361\7\f\2\2\u0361\u0365\5\u00d4k\2\u0362\u0363"+
		"\7\f\2\2\u0363\u0365\5\u00d2j\2\u0364\u0355\3\2\2\2\u0364\u0360\3\2\2"+
		"\2\u0364\u0362\3\2\2\2\u0365\67\3\2\2\2\u0366\u0381\5F$\2\u0367\u0368"+
		"\6\35\f\3\u0368\u0369\5\u0086D\2\u0369\u036a\b\35\1\2\u036a\u0380\3\2"+
		"\2\2\u036b\u036c\6\35\r\3\u036c\u036d\5> \2\u036d\u036e\b\35\1\2\u036e"+
		"\u0380\3\2\2\2\u036f\u0370\6\35\16\3\u0370\u0371\5@!\2\u0371\u0372\b\35"+
		"\1\2\u0372\u0380\3\2\2\2\u0373\u0374\6\35\17\3\u0374\u0375\5B\"\2\u0375"+
		"\u0376\b\35\1\2\u0376\u0380\3\2\2\2\u0377\u0378\6\35\20\3\u0378\u0379"+
		"\5D#\2\u0379\u037a\b\35\1\2\u037a\u0380\3\2\2\2\u037b\u037c\6\35\21\3"+
		"\u037c\u037d\5\u008eH\2\u037d\u037e\b\35\1\2\u037e\u0380\3\2\2\2\u037f"+
		"\u0367\3\2\2\2\u037f\u036b\3\2\2\2\u037f\u036f\3\2\2\2\u037f\u0373\3\2"+
		"\2\2\u037f\u0377\3\2\2\2\u037f\u037b\3\2\2\2\u0380\u0383\3\2\2\2\u0381"+
		"\u037f\3\2\2\2\u0381\u0382\3\2\2\2\u03829\3\2\2\2\u0383\u0381\3\2\2\2"+
		"\u0384\u0385\7\35\2\2\u0385\u0386\7\u00c7\2\2\u0386;\3\2\2\2\u0387\u0388"+
		"\7\35\2\2\u0388\u0389\7\u00c7\2\2\u0389=\3\2\2\2\u038a\u038b\7\177\2\2"+
		"\u038b\u038c\7\24\2\2\u038c\u038d\5\u00c4c\2\u038d?\3\2\2\2\u038e\u038f"+
		"\7\u0083\2\2\u038f\u0390\7\\\2\2\u0390\u0391\5\u00c4c\2\u0391A\3\2\2\2"+
		"\u0392\u0393\7\u0091\2\2\u0393\u0394\7\24\2\2\u0394\u0395\5\u00c4c\2\u0395"+
		"C\3\2\2\2\u0396\u0397\7\u00ae\2\2\u0397\u039c\5V,\2\u0398\u0399\7\u00cd"+
		"\2\2\u0399\u039b\5V,\2\u039a\u0398\3\2\2\2\u039b\u039e\3\2\2\2\u039c\u039a"+
		"\3\2\2\2\u039c\u039d\3\2\2\2\u039dE\3\2\2\2\u039e\u039c\3\2\2\2\u039f"+
		"\u03a1\7\67\2\2\u03a0\u03a2\7\u00d2\2\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2"+
		"\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a9\5\u00ecw\2\u03a4\u03a6\7\u00d8"+
		"\2\2\u03a5\u03a7\5\u00c0a\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03aa\7\u00e2\2\2\u03a9\u03a4\3\2\2\2\u03a9\u03aa"+
		"\3\2\2\2\u03aaG\3\2\2\2\u03ab\u03b6\5J&\2\u03ac\u03ad\7\36\2\2\u03ad\u03ae"+
		"\5\u00eav\2\u03ae\u03af\7\27\2\2\u03af\u03b0\5\u00c4c\2\u03b0\u03b6\3"+
		"\2\2\2\u03b1\u03b2\7R\2\2\u03b2\u03b6\5N(\2\u03b3\u03b4\7\u0084\2\2\u03b4"+
		"\u03b6\5P)\2\u03b5\u03ab\3\2\2\2\u03b5\u03ac\3\2\2\2\u03b5\u03b1\3\2\2"+
		"\2\u03b5\u03b3\3\2\2\2\u03b6I\3\2\2\2\u03b7\u03b8\5\u00ceh\2\u03b8\u03ba"+
		"\5\u00be`\2\u03b9\u03bb\5L\'\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2"+
		"\u03bb\u03bd\3\2\2\2\u03bc\u03be\5<\37\2\u03bd\u03bc\3\2\2\2\u03bd\u03be"+
		"\3\2\2\2\u03be\u03c0\3\2\2\2\u03bf\u03c1\5R*\2\u03c0\u03bf\3\2\2\2\u03c0"+
		"\u03c1\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c3\7\u00ae\2\2\u03c3\u03c5"+
		"\5\u00c4c\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03d6\3\2\2"+
		"\2\u03c6\u03c8\5\u00ceh\2\u03c7\u03c9\5\u00be`\2\u03c8\u03c7\3\2\2\2\u03c8"+
		"\u03c9\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cc\5L\'\2\u03cb\u03cd\5<\37"+
		"\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03cf\3\2\2\2\u03ce\u03d0"+
		"\5R*\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1"+
		"\u03d2\7\u00ae\2\2\u03d2\u03d4\5\u00c4c\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4"+
		"\3\2\2\2\u03d4\u03d6\3\2\2\2\u03d5\u03b7\3\2\2\2\u03d5\u03c6\3\2\2\2\u03d6"+
		"K\3\2\2\2\u03d7\u03d8\t\4\2\2\u03d8\u03d9\5\u00c4c\2\u03d9M\3\2\2\2\u03da"+
		"\u03db\5\u00ceh\2\u03db\u03dc\5\u00c4c\2\u03dc\u03dd\7\u00af\2\2\u03dd"+
		"\u03de\5\u00be`\2\u03de\u03df\7I\2\2\u03df\u03e0\7\u00c5\2\2\u03e0O\3"+
		"\2\2\2\u03e1\u03e2\5\u00ceh\2\u03e2\u03e3\5l\67\2\u03e3Q\3\2\2\2\u03e4"+
		"\u03e5\7\32\2\2\u03e5\u03e6\7\u00d8\2\2\u03e6\u03eb\5T+\2\u03e7\u03e8"+
		"\7\u00cd\2\2\u03e8\u03ea\5T+\2\u03e9\u03e7\3\2\2\2\u03ea\u03ed\3\2\2\2"+
		"\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ee\3\2\2\2\u03ed\u03eb"+
		"\3\2\2\2\u03ee\u03ef\7\u00e2\2\2\u03efS\3\2\2\2\u03f0\u03f6\5\u00eav\2"+
		"\u03f1\u03f3\7\u00d8\2\2\u03f2\u03f4\5\u00c0a\2\u03f3\u03f2\3\2\2\2\u03f3"+
		"\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\7\u00e2\2\2\u03f6\u03f1"+
		"\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7U\3\2\2\2\u03f8\u0400\5\u00c4c\2\u03f9"+
		"\u0401\7*\2\2\u03fa\u03fb\7\u00a8\2\2\u03fb\u03fc\7\61\2\2\u03fc\u0401"+
		"\7\u00c7\2\2\u03fd\u03fe\7\u00a8\2\2\u03fe\u03ff\7\u00b8\2\2\u03ff\u0401"+
		"\7\u00c7\2\2\u0400\u03f9\3\2\2\2\u0400\u03fa\3\2\2\2\u0400\u03fd\3\2\2"+
		"\2\u0400\u0401\3\2\2\2\u0401W\3\2\2\2\u0402\u0404\t\5\2\2\u0403\u0405"+
		"\7\u00a0\2\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3\2\2"+
		"\2\u0406\u0407\5\u00d0i\2\u0407Y\3\2\2\2\u0408\u0409\t\6\2\2\u0409\u040c"+
		"\7#\2\2\u040a\u040b\7O\2\2\u040b\u040d\79\2\2\u040c\u040a\3\2\2\2\u040c"+
		"\u040d\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\5\u00dan\2\u040f\u0411"+
		"\5.\30\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0428\3\2\2\2\u0412"+
		"\u0419\t\6\2\2\u0413\u041a\7\60\2\2\u0414\u0416\7\u00a2\2\2\u0415\u0414"+
		"\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u041a\7\u00a0\2"+
		"\2\u0418\u041a\7\u00b7\2\2\u0419\u0413\3\2\2\2\u0419\u0415\3\2\2\2\u0419"+
		"\u0418\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u041c\7O\2\2\u041c\u041e\79\2"+
		"\2\u041d\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0421"+
		"\5\u00d4k\2\u0420\u0422\5.\30\2\u0421\u0420\3\2\2\2\u0421\u0422\3\2\2"+
		"\2\u0422\u0425\3\2\2\2\u0423\u0424\7s\2\2\u0424\u0426\7)\2\2\u0425\u0423"+
		"\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0428\3\2\2\2\u0427\u0408\3\2\2\2\u0427"+
		"\u0412\3\2\2\2\u0428[\3\2\2\2\u0429\u042a\79\2\2\u042a\u042b\7#\2\2\u042b"+
		"\u0437\5\u00dan\2\u042c\u0433\79\2\2\u042d\u0434\7\60\2\2\u042e\u0430"+
		"\7\u00a2\2\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\3\2\2"+
		"\2\u0431\u0434\7\u00a0\2\2\u0432\u0434\7\u00b7\2\2\u0433\u042d\3\2\2\2"+
		"\u0433\u042f\3\2\2\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435"+
		"\3\2\2\2\u0435\u0437\5\u00d4k\2\u0436\u0429\3\2\2\2\u0436\u042c\3\2\2"+
		"\2\u0437]\3\2\2\2\u0438\u0439\7:\2\2\u0439\u043a\7\17\2\2\u043a\u043f"+
		"\5\4\3\2\u043b\u043c\7:\2\2\u043c\u043d\7\u009e\2\2\u043d\u043f\5\4\3"+
		"\2\u043e\u0438\3\2\2\2\u043e\u043b\3\2\2\2\u043f_\3\2\2\2\u0440\u0441"+
		"\7V\2\2\u0441\u0443\7X\2\2\u0442\u0444\7\u00a0\2\2\u0443\u0442\3\2\2\2"+
		"\u0443\u0444\3\2\2\2\u0444\u0448\3\2\2\2\u0445\u0449\5\u00d4k\2\u0446"+
		"\u0447\7G\2\2\u0447\u0449\5\u00d2j\2\u0448\u0445\3\2\2\2\u0448\u0446\3"+
		"\2\2\2\u0449\u044b\3\2\2\2\u044a\u044c\5b\62\2\u044b\u044a\3\2\2\2\u044b"+
		"\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\5d\63\2\u044ea\3\2\2\2"+
		"\u044f\u0450\7\u00d8\2\2\u0450\u0455\5\u00ceh\2\u0451\u0452\7\u00cd\2"+
		"\2\u0452\u0454\5\u00ceh\2\u0453\u0451\3\2\2\2\u0454\u0457\3\2\2\2\u0455"+
		"\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0458\3\2\2\2\u0457\u0455\3\2"+
		"\2\2\u0458\u0459\7\u00e2\2\2\u0459c\3\2\2\2\u045a\u045b\7C\2\2\u045b\u0464"+
		"\5\u00eav\2\u045c\u0464\7\u00b6\2\2\u045d\u045f\5n8\2\u045e\u0460\7\u00e3"+
		"\2\2\u045f\u045e\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\3\2\2\2\u0461"+
		"\u0462\7\2\2\3\u0462\u0464\3\2\2\2\u0463\u045a\3\2\2\2\u0463\u045c\3\2"+
		"\2\2\u0463\u045d\3\2\2\2\u0464e\3\2\2\2\u0465\u0466\7]\2\2\u0466\u0468"+
		"\7q\2\2\u0467\u0469\5.\30\2\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\u046c\5\u0080A\2\u046b\u046d\t\7\2\2\u046c\u046b"+
		"\3\2\2\2\u046c\u046d\3\2\2\2\u046dg\3\2\2\2\u046e\u046f\7y\2\2\u046f\u0470"+
		"\7\u00a0\2\2\u0470\u0472\5\u00d4k\2\u0471\u0473\5.\30\2\u0472\u0471\3"+
		"\2\2\2\u0472\u0473\3\2\2\2\u0473\u0475\3\2\2\2\u0474\u0476\5\22\n\2\u0475"+
		"\u0474\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0478\3\2\2\2\u0477\u0479\7>"+
		"\2\2\u0478\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\3\2\2\2\u047a"+
		"\u047c\7\'\2\2\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2\2\u047ci\3\2\2\2"+
		"\u047d\u047e\7\u0089\2\2\u047e\u047f\7\u00a0\2\2\u047f\u0480\5\u00d4k"+
		"\2\u0480\u0481\7\u00a8\2\2\u0481\u0489\5\u00d4k\2\u0482\u0483\7\u00cd"+
		"\2\2\u0483\u0484\5\u00d4k\2\u0484\u0485\7\u00a8\2\2\u0485\u0486\5\u00d4"+
		"k\2\u0486\u0488\3\2\2\2\u0487\u0482\3\2\2\2\u0488\u048b\3\2\2\2\u0489"+
		"\u0487\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048d\3\2\2\2\u048b\u0489\3\2"+
		"\2\2\u048c\u048e\5.\30\2\u048d\u048c\3\2\2\2\u048d\u048e\3\2\2\2\u048e"+
		"k\3\2\2\2\u048f\u0491\7\u00d8\2\2\u0490\u0492\5t;\2\u0491\u0490\3\2\2"+
		"\2\u0491\u0492\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\7\u0093\2\2\u0494"+
		"\u0496\5\u00c0a\2\u0495\u0497\5\u0082B\2\u0496\u0495\3\2\2\2\u0496\u0497"+
		"\3\2\2\2\u0497\u0499\3\2\2\2\u0498\u049a\5\u0088E\2\u0499\u0498\3\2\2"+
		"\2\u0499\u049a\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\7\u00e2\2\2\u049c"+
		"m\3\2\2\2\u049d\u04a3\5p9\2\u049e\u049f\7\u00b1\2\2\u049f\u04a0\7\6\2"+
		"\2\u04a0\u04a2\5p9\2\u04a1\u049e\3\2\2\2\u04a2\u04a5\3\2\2\2\u04a3\u04a1"+
		"\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4o\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a6"+
		"\u04ac\5r:\2\u04a7\u04a8\7\u00d8\2\2\u04a8\u04a9\5n8\2\u04a9\u04aa\7\u00e2"+
		"\2\2\u04aa\u04ac\3\2\2\2\u04ab\u04a6\3\2\2\2\u04ab\u04a7\3\2\2\2\u04ac"+
		"q\3\2\2\2\u04ad\u04af\5t;\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0\u04b2\7\u0093\2\2\u04b1\u04b3\7\62\2\2\u04b2\u04b1"+
		"\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b5\3\2\2\2\u04b4\u04b6\5v<\2\u04b5"+
		"\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b9\5\u00c0"+
		"a\2\u04b8\u04ba\5x=\2\u04b9\u04b8\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bc"+
		"\3\2\2\2\u04bb\u04bd\5z>\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd"+
		"\u04bf\3\2\2\2\u04be\u04c0\5|?\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2"+
		"\2\u04c0\u04c2\3\2\2\2\u04c1\u04c3\5~@\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3"+
		"\3\2\2\2\u04c3\u04c5\3\2\2\2\u04c4\u04c6\5\u0080A\2\u04c5\u04c4\3\2\2"+
		"\2\u04c5\u04c6\3\2\2\2\u04c6\u04c8\3\2\2\2\u04c7\u04c9\5\u0082B\2\u04c8"+
		"\u04c7\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04cc\3\2\2\2\u04ca\u04cb\7\u00be"+
		"\2\2\u04cb\u04cd\t\b\2\2\u04cc\u04ca\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd"+
		"\u04d0\3\2\2\2\u04ce\u04cf\7\u00be\2\2\u04cf\u04d1\7\u00aa\2\2\u04d0\u04ce"+
		"\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d3\3\2\2\2\u04d2\u04d4\5\u0084C"+
		"\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6\3\2\2\2\u04d5\u04d7"+
		"\5\u0086D\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d9\3\2\2"+
		"\2\u04d8\u04da\5\u008aF\2\u04d9\u04d8\3\2\2\2\u04d9\u04da\3\2\2\2\u04da"+
		"\u04dc\3\2\2\2\u04db\u04dd\5\u008cG\2\u04dc\u04db\3\2\2\2\u04dc\u04dd"+
		"\3\2\2\2\u04dd\u04df\3\2\2\2\u04de\u04e0\5\u008eH\2\u04df\u04de\3\2\2"+
		"\2\u04df\u04e0\3\2\2\2\u04e0s\3\2\2\2\u04e1\u04e2\7\u00be\2\2\u04e2\u04e3"+
		"\5\u00c0a\2\u04e3u\3\2\2\2\u04e4\u04e5\7\u00a9\2\2\u04e5\u04e8\7\u00c5"+
		"\2\2\u04e6\u04e7\7\u00be\2\2\u04e7\u04e9\7\u00a5\2\2\u04e8\u04e6\3\2\2"+
		"\2\u04e8\u04e9\3\2\2\2\u04e9w\3\2\2\2\u04ea\u04eb\7E\2\2\u04eb\u04ec\5"+
		"\u0090I\2\u04ecy\3\2\2\2\u04ed\u04ef\t\t\2\2\u04ee\u04ed\3\2\2\2\u04ee"+
		"\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\7\13\2\2\u04f1\u04f2\7"+
		"[\2\2\u04f2\u04f3\5\u00c0a\2\u04f3{\3\2\2\2\u04f4\u04f5\7\u00bd\2\2\u04f5"+
		"\u04f6\5\u00eav\2\u04f6\u04f7\7\f\2\2\u04f7\u04f8\7\u00d8\2\2\u04f8\u04f9"+
		"\5\u00a6T\2\u04f9\u04fa\7\u00e2\2\2\u04fa}\3\2\2\2\u04fb\u04fc\7\u0082"+
		"\2\2\u04fc\u04fd\5\u00c4c\2\u04fd\177\3\2\2\2\u04fe\u04ff\7\u00bc\2\2"+
		"\u04ff\u0500\5\u00c4c\2\u0500\u0081\3\2\2\2\u0501\u0502\7J\2\2\u0502\u0509"+
		"\7\24\2\2\u0503\u0504\t\b\2\2\u0504\u0505\7\u00d8\2\2\u0505\u0506\5\u00c0"+
		"a\2\u0506\u0507\7\u00e2\2\2\u0507\u050a\3\2\2\2\u0508\u050a\5\u00c0a\2"+
		"\u0509\u0503\3\2\2\2\u0509\u0508\3\2\2\2\u050a\u0083\3\2\2\2\u050b\u050c"+
		"\7K\2\2\u050c\u050d\5\u00c4c\2\u050d\u0085\3\2\2\2\u050e\u050f\7{\2\2"+
		"\u050f\u0510\7\24\2\2\u0510\u0511\5\u009cO\2\u0511\u0087\3\2\2\2\u0512"+
		"\u0513\7{\2\2\u0513\u0514\7\24\2\2\u0514\u0515\5\u00c0a\2\u0515\u0089"+
		"\3\2\2\2\u0516\u0517\7d\2\2\u0517\u0518\5\u009aN\2\u0518\u0519\7\24\2"+
		"\2\u0519\u051a\5\u00c0a\2\u051a\u008b\3\2\2\2\u051b\u051c\7d\2\2\u051c"+
		"\u051f\5\u009aN\2\u051d\u051e\7\u00be\2\2\u051e\u0520\7\u00a5\2\2\u051f"+
		"\u051d\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u008d\3\2\2\2\u0521\u0522\7\u0097"+
		"\2\2\u0522\u0523\5\u00a2R\2\u0523\u008f\3\2\2\2\u0524\u0525\bI\1\2\u0525"+
		"\u0527\5\u00d0i\2\u0526\u0528\7>\2\2\u0527\u0526\3\2\2\2\u0527\u0528\3"+
		"\2\2\2\u0528\u052a\3\2\2\2\u0529\u052b\5\u0098M\2\u052a\u0529\3\2\2\2"+
		"\u052a\u052b\3\2\2\2\u052b\u0531\3\2\2\2\u052c\u052d\7\u00d8\2\2\u052d"+
		"\u052e\5\u0090I\2\u052e\u052f\7\u00e2\2\2\u052f\u0531\3\2\2\2\u0530\u0524"+
		"\3\2\2\2\u0530\u052c\3\2\2\2\u0531\u0543\3\2\2\2\u0532\u0533\f\5\2\2\u0533"+
		"\u0534\5\u0094K\2\u0534\u0535\5\u0090I\6\u0535\u0542\3\2\2\2\u0536\u0538"+
		"\f\6\2\2\u0537\u0539\t\n\2\2\u0538\u0537\3\2\2\2\u0538\u0539\3\2\2\2\u0539"+
		"\u053b\3\2\2\2\u053a\u053c\5\u0092J\2\u053b\u053a\3\2\2\2\u053b\u053c"+
		"\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053e\7[\2\2\u053e\u053f\5\u0090I\2"+
		"\u053f\u0540\5\u0096L\2\u0540\u0542\3\2\2\2\u0541\u0532\3\2\2\2\u0541"+
		"\u0536\3\2\2\2\u0542\u0545\3\2\2\2\u0543\u0541\3\2\2\2\u0543\u0544\3\2"+
		"\2\2\u0544\u0091\3\2\2\2\u0545\u0543\3\2\2\2\u0546\u0548\t\13\2\2\u0547"+
		"\u0546\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u0550\7U"+
		"\2\2\u054a\u054c\7U\2\2\u054b\u054d\t\13\2\2\u054c\u054b\3\2\2\2\u054c"+
		"\u054d\3\2\2\2\u054d\u0550\3\2\2\2\u054e\u0550\t\13\2\2\u054f\u0547\3"+
		"\2\2\2\u054f\u054a\3\2\2\2\u054f\u054e\3\2\2\2\u0550\u0572\3\2\2\2\u0551"+
		"\u0553\t\f\2\2\u0552\u0551\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\3\2"+
		"\2\2\u0554\u0556\t\r\2\2\u0555\u0557\7|\2\2\u0556\u0555\3\2\2\2\u0556"+
		"\u0557\3\2\2\2\u0557\u0560\3\2\2\2\u0558\u055a\t\r\2\2\u0559\u055b\7|"+
		"\2\2\u055a\u0559\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055d\3\2\2\2\u055c"+
		"\u055e\t\f\2\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0560\3\2"+
		"\2\2\u055f\u0552\3\2\2\2\u055f\u0558\3\2\2\2\u0560\u0572\3\2\2\2\u0561"+
		"\u0563\t\16\2\2\u0562\u0561\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0564\3"+
		"\2\2\2\u0564\u0566\7F\2\2\u0565\u0567\7|\2\2\u0566\u0565\3\2\2\2\u0566"+
		"\u0567\3\2\2\2\u0567\u0570\3\2\2\2\u0568\u056a\7F\2\2\u0569\u056b\7|\2"+
		"\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056d\3\2\2\2\u056c\u056e"+
		"\t\16\2\2\u056d\u056c\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0570\3\2\2\2"+
		"\u056f\u0562\3\2\2\2\u056f\u0568\3\2\2\2\u0570\u0572\3\2\2\2\u0571\u054f"+
		"\3\2\2\2\u0571\u055f\3\2\2\2\u0571\u056f\3\2\2\2\u0572\u0093\3\2\2\2\u0573"+
		"\u0575\t\n\2\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0576\3\2"+
		"\2\2\u0576\u0577\7 \2\2\u0577\u057a\7[\2\2\u0578\u057a\7\u00cd\2\2\u0579"+
		"\u0574\3\2\2\2\u0579\u0578\3\2\2\2\u057a\u0095\3\2\2\2\u057b\u057c\7x"+
		"\2\2\u057c\u0585\5\u00c0a\2\u057d\u057e\7\u00b4\2\2\u057e\u057f\7\u00d8"+
		"\2\2\u057f\u0580\5\u00c0a\2\u0580\u0581\7\u00e2\2\2\u0581\u0585\3\2\2"+
		"\2\u0582\u0583\7\u00b4\2\2\u0583\u0585\5\u00c0a\2\u0584\u057b\3\2\2\2"+
		"\u0584\u057d\3\2\2\2\u0584\u0582\3\2\2\2\u0585\u0097\3\2\2\2\u0586\u0587"+
		"\7\u0091\2\2\u0587\u058a\5\u00a0Q\2\u0588\u0589\7w\2\2\u0589\u058b\5\u00a0"+
		"Q\2\u058a\u0588\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u0099\3\2\2\2\u058c"+
		"\u058f\5\u00c4c\2\u058d\u058e\t\17\2\2\u058e\u0590\5\u00c4c\2\u058f\u058d"+
		"\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u009b\3\2\2\2\u0591\u0596\5\u009eP"+
		"\2\u0592\u0593\7\u00cd\2\2\u0593\u0595\5\u009eP\2\u0594\u0592\3\2\2\2"+
		"\u0595\u0598\3\2\2\2\u0596\u0594\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u009d"+
		"\3\2\2\2\u0598\u0596\3\2\2\2\u0599\u059b\5\u00c4c\2\u059a\u059c\t\20\2"+
		"\2\u059b\u059a\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059f\3\2\2\2\u059d\u059e"+
		"\7v\2\2\u059e\u05a0\t\21\2\2\u059f\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0"+
		"\u05a3\3\2\2\2\u05a1\u05a2\7\33\2\2\u05a2\u05a4\7\u00c7\2\2\u05a3\u05a1"+
		"\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u009f\3\2\2\2\u05a5\u05a8\5\u00dep"+
		"\2\u05a6\u05a7\7\u00e4\2\2\u05a7\u05a9\5\u00dep\2\u05a8\u05a6\3\2\2\2"+
		"\u05a8\u05a9\3\2\2\2\u05a9\u00a1\3\2\2\2\u05aa\u05af\5\u00a4S\2\u05ab"+
		"\u05ac\7\u00cd\2\2\u05ac\u05ae\5\u00a4S\2\u05ad\u05ab\3\2\2\2\u05ae\u05b1"+
		"\3\2\2\2\u05af\u05ad\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u00a3\3\2\2\2\u05b1"+
		"\u05af\3\2\2\2\u05b2\u05b3\5\u00eav\2\u05b3\u05b4\7\u00d2\2\2\u05b4\u05b5"+
		"\5\u00e0q\2\u05b5\u00a5\3\2\2\2\u05b6\u05b8\5\u00a8U\2\u05b7\u05b6\3\2"+
		"\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9\u05bb\5\u00aaV\2\u05ba"+
		"\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bd\3\2\2\2\u05bc\u05be\5\u00ac"+
		"W\2\u05bd\u05bc\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u00a7\3\2\2\2\u05bf"+
		"\u05c0\7\177\2\2\u05c0\u05c1\7\24\2\2\u05c1\u05c2\5\u00c0a\2\u05c2\u00a9"+
		"\3\2\2\2\u05c3\u05c4\7{\2\2\u05c4\u05c5\7\24\2\2\u05c5\u05c6\5\u009cO"+
		"\2\u05c6\u00ab\3\2\2\2\u05c7\u05c8\t\22\2\2\u05c8\u05c9\5\u00aeX\2\u05c9"+
		"\u00ad\3\2\2\2\u05ca\u05d1\5\u00b0Y\2\u05cb\u05cc\7\22\2\2\u05cc\u05cd"+
		"\5\u00b0Y\2\u05cd\u05ce\7\b\2\2\u05ce\u05cf\5\u00b0Y\2\u05cf\u05d1\3\2"+
		"\2\2\u05d0\u05ca\3\2\2\2\u05d0\u05cb\3\2\2\2\u05d1\u00af\3\2\2\2\u05d2"+
		"\u05d3\7\"\2\2\u05d3\u05df\7\u008f\2\2\u05d4\u05d5\7\u00b0\2\2\u05d5\u05df"+
		"\7\u0081\2\2\u05d6\u05d7\7\u00b0\2\2\u05d7\u05df\7A\2\2\u05d8\u05d9\5"+
		"\u00dep\2\u05d9\u05da\7\u0081\2\2\u05da\u05df\3\2\2\2\u05db\u05dc\5\u00de"+
		"p\2\u05dc\u05dd\7A\2\2\u05dd\u05df\3\2\2\2\u05de\u05d2\3\2\2\2\u05de\u05d4"+
		"\3\2\2\2\u05de\u05d6\3\2\2\2\u05de\u05d8\3\2\2\2\u05de\u05db\3\2\2\2\u05df"+
		"\u00b1\3\2\2\2\u05e0\u05e1\7\u0096\2\2\u05e1\u05e2\5\u00a2R\2\u05e2\u00b3"+
		"\3\2\2\2\u05e3\u05e4\7\u0098\2\2\u05e4\u05e5\7\37\2\2\u05e5\u05e6\7#\2"+
		"\2\u05e6\u060e\5\u00dan\2\u05e7\u05e8\7\u0098\2\2\u05e8\u05e9\7\37\2\2"+
		"\u05e9\u05ea\7\60\2\2\u05ea\u060e\5\u00d4k\2\u05eb\u05ec\7\u0098\2\2\u05ec"+
		"\u05ee\7\37\2\2\u05ed\u05ef\7\u00a2\2\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef"+
		"\3\2\2\2\u05ef\u05f1\3\2\2\2\u05f0\u05f2\7\u00a0\2\2\u05f1\u05f0\3\2\2"+
		"\2\u05f1\u05f2\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u060e\5\u00d4k\2\u05f4"+
		"\u05f5\7\u0098\2\2\u05f5\u060e\7$\2\2\u05f6\u05f7\7\u0098\2\2\u05f7\u05fa"+
		"\7/\2\2\u05f8\u05f9\7E\2\2\u05f9\u05fb\5\u00dan\2\u05fa\u05f8\3\2\2\2"+
		"\u05fa\u05fb\3\2\2\2\u05fb\u060e\3\2\2\2\u05fc\u05fe\7\u0098\2\2\u05fd"+
		"\u05ff\7\u00a2\2\2\u05fe\u05fd\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0600"+
		"\3\2\2\2\u0600\u0603\7\u00a1\2\2\u0601\u0602\t\23\2\2\u0602\u0604\5\u00da"+
		"n\2\u0603\u0601\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0608\3\2\2\2\u0605"+
		"\u0606\7c\2\2\u0606\u0609\7\u00c7\2\2\u0607\u0609\5\u0080A\2\u0608\u0605"+
		"\3\2\2\2\u0608\u0607\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060b\3\2\2\2\u060a"+
		"\u060c\5\u008cG\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060e"+
		"\3\2\2\2\u060d\u05e3\3\2\2\2\u060d\u05e7\3\2\2\2\u060d\u05eb\3\2\2\2\u060d"+
		"\u05f4\3\2\2\2\u060d\u05f6\3\2\2\2\u060d\u05fc\3\2\2\2\u060e\u00b5\3\2"+
		"\2\2\u060f\u0610\7\u009f\2\2\u0610\u0611\7@\2\2\u0611\u0612\7\63\2\2\u0612"+
		"\u0632\5\u00d4k\2\u0613\u0614\7\u009f\2\2\u0614\u0615\7@\2\2\u0615\u0632"+
		"\7g\2\2\u0616\u0617\7\u009f\2\2\u0617\u0618\7\u0087\2\2\u0618\u0632\7"+
		"/\2\2\u0619\u061a\7\u009f\2\2\u061a\u061b\7\u0087\2\2\u061b\u061c\7\60"+
		"\2\2\u061c\u0632\5\u00d4k\2\u061d\u061e\7\u009f\2\2\u061e\u0626\t\24\2"+
		"\2\u061f\u0620\7\63\2\2\u0620\u0627\7\u0095\2\2\u0621\u0627\7=\2\2\u0622"+
		"\u0624\7\u00ae\2\2\u0623\u0622\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0625"+
		"\3\2\2\2\u0625\u0627\7k\2\2\u0626\u061f\3\2\2\2\u0626\u0621\3\2\2\2\u0626"+
		"\u0623\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0632\5\u00d4k\2\u0629\u062a"+
		"\7\u009f\2\2\u062a\u062b\t\24\2\2\u062b\u062c\7\u008c\2\2\u062c\u0632"+
		"\7\u0095\2\2\u062d\u062e\7\u009f\2\2\u062e\u062f\7\u009d\2\2\u062f\u0630"+
		"\7\u008b\2\2\u0630\u0632\5\u00d4k\2\u0631\u060f\3\2\2\2\u0631\u0613\3"+
		"\2\2\2\u0631\u0616\3\2\2\2\u0631\u0619\3\2\2\2\u0631\u061d\3\2\2\2\u0631"+
		"\u0629\3\2\2\2\u0631\u062d\3\2\2\2\u0632\u00b7\3\2\2\2\u0633\u0635\7\u00ad"+
		"\2\2\u0634\u0636\7\u00a2\2\2\u0635\u0634\3\2\2\2\u0635\u0636\3\2\2\2\u0636"+
		"\u0638\3\2\2\2\u0637\u0639\7\u00a0\2\2\u0638\u0637\3\2\2\2\u0638\u0639"+
		"\3\2\2\2\u0639\u063c\3\2\2\2\u063a\u063b\7O\2\2\u063b\u063d\79\2\2\u063c"+
		"\u063a\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0640\5\u00d4"+
		"k\2\u063f\u0641\5.\30\2\u0640\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641"+
		"\u00b9\3\2\2\2\u0642\u0643\7\u00b3\2\2\u0643\u0644\5\u00dan\2\u0644\u00bb"+
		"\3\2\2\2\u0645\u0646\7\u00b9\2\2\u0646\u0648\5\u00d4k\2\u0647\u0649\7"+
		"8\2\2\u0648\u0647\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064c\3\2\2\2\u064a"+
		"\u064b\7d\2\2\u064b\u064d\7\u00c5\2\2\u064c\u064a\3\2\2\2\u064c\u064d"+
		"\3\2\2\2\u064d\u00bd\3\2\2\2\u064e\u067e\5\u00eav\2\u064f\u0650\5\u00ea"+
		"v\2\u0650\u0651\7\u00d8\2\2\u0651\u0652\5\u00eav\2\u0652\u0659\5\u00be"+
		"`\2\u0653\u0654\7\u00cd\2\2\u0654\u0655\5\u00eav\2\u0655\u0656\5\u00be"+
		"`\2\u0656\u0658\3\2\2\2\u0657\u0653\3\2\2\2\u0658\u065b\3\2\2\2\u0659"+
		"\u0657\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u065c\3\2\2\2\u065b\u0659\3\2"+
		"\2\2\u065c\u065d\7\u00e2\2\2\u065d\u067e\3\2\2\2\u065e\u065f\5\u00eav"+
		"\2\u065f\u0660\7\u00d8\2\2\u0660\u0665\5\u00eex\2\u0661\u0662\7\u00cd"+
		"\2\2\u0662\u0664\5\u00eex\2\u0663\u0661\3\2\2\2\u0664\u0667\3\2\2\2\u0665"+
		"\u0663\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0668\3\2\2\2\u0667\u0665\3\2"+
		"\2\2\u0668\u0669\7\u00e2\2\2\u0669\u067e\3\2\2\2\u066a\u066b\5\u00eav"+
		"\2\u066b\u066c\7\u00d8\2\2\u066c\u0671\5\u00be`\2\u066d\u066e\7\u00cd"+
		"\2\2\u066e\u0670\5\u00be`\2\u066f\u066d\3\2\2\2\u0670\u0673\3\2\2\2\u0671"+
		"\u066f\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0674\3\2\2\2\u0673\u0671\3\2"+
		"\2\2\u0674\u0675\7\u00e2\2\2\u0675\u067e\3\2\2\2\u0676\u0677\5\u00eav"+
		"\2\u0677\u0679\7\u00d8\2\2\u0678\u067a\5\u00c0a\2\u0679\u0678\3\2\2\2"+
		"\u0679\u067a\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067c\7\u00e2\2\2\u067c"+
		"\u067e\3\2\2\2\u067d\u064e\3\2\2\2\u067d\u064f\3\2\2\2\u067d\u065e\3\2"+
		"\2\2\u067d\u066a\3\2\2\2\u067d\u0676\3\2\2\2\u067e\u00bf\3\2\2\2\u067f"+
		"\u0684\5\u00c2b\2\u0680\u0681\7\u00cd\2\2\u0681\u0683\5\u00c2b\2\u0682"+
		"\u0680\3\2\2\2\u0683\u0686\3\2\2\2\u0684\u0682\3\2\2\2\u0684\u0685\3\2"+
		"\2\2\u0685\u00c1\3\2\2\2\u0686\u0684\3\2\2\2\u0687\u0688\5\u00d4k\2\u0688"+
		"\u0689\7\u00d0\2\2\u0689\u068b\3\2\2\2\u068a\u0687\3\2\2\2\u068a\u068b"+
		"\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u0693\7\u00c9\2\2\u068d\u068e\7\u00d8"+
		"\2\2\u068e\u068f\5n8\2\u068f\u0690\7\u00e2\2\2\u0690\u0693\3\2\2\2\u0691"+
		"\u0693\5\u00c4c\2\u0692\u068a\3\2\2\2\u0692\u068d\3\2\2\2\u0692\u0691"+
		"\3\2\2\2\u0693\u00c3\3\2\2\2\u0694\u0695\bc\1\2\u0695\u0697\7\25\2\2\u0696"+
		"\u0698\5\u00c4c\2\u0697\u0696\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u069e"+
		"\3\2\2\2\u0699\u069a\7\u00bb\2\2\u069a\u069b\5\u00c4c\2\u069b\u069c\7"+
		"\u00a4\2\2\u069c\u069d\5\u00c4c\2\u069d\u069f\3\2\2\2\u069e\u0699\3\2"+
		"\2\2\u069f\u06a0\3\2\2\2\u06a0\u069e\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1"+
		"\u06a4\3\2\2\2\u06a2\u06a3\7\65\2\2\u06a3\u06a5\5\u00c4c\2\u06a4\u06a2"+
		"\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a7\7\66\2\2"+
		"\u06a7\u0716\3\2\2\2\u06a8\u06a9\7\26\2\2\u06a9\u06aa\7\u00d8\2\2\u06aa"+
		"\u06ab\5\u00c4c\2\u06ab\u06ac\7\f\2\2\u06ac\u06ad\5\u00be`\2\u06ad\u06ae"+
		"\7\u00e2\2\2\u06ae\u0716\3\2\2\2\u06af\u06b0\7%\2\2\u06b0\u0716\7\u00c7"+
		"\2\2\u06b1\u06b2\7<\2\2\u06b2\u06b3\7\u00d8\2\2\u06b3\u06b4\5\u00e2r\2"+
		"\u06b4\u06b5\7E\2\2\u06b5\u06b6\5\u00c4c\2\u06b6\u06b7\7\u00e2\2\2\u06b7"+
		"\u0716\3\2\2\2\u06b8\u06b9\7W\2\2\u06b9\u06ba\5\u00c4c\2\u06ba\u06bb\5"+
		"\u00e2r\2\u06bb\u0716\3\2\2\2\u06bc\u06bd\7\u009c\2\2\u06bd\u06be\7\u00d8"+
		"\2\2\u06be\u06bf\5\u00c4c\2\u06bf\u06c0\7E\2\2\u06c0\u06c3\5\u00c4c\2"+
		"\u06c1\u06c2\7B\2\2\u06c2\u06c4\5\u00c4c\2\u06c3\u06c1\3\2\2\2\u06c3\u06c4"+
		"\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c6\7\u00e2\2\2\u06c6\u0716\3\2\2"+
		"\2\u06c7\u06c8\7\u00a7\2\2\u06c8\u0716\7\u00c7\2\2\u06c9\u06ca\7\u00ac"+
		"\2\2\u06ca\u06cb\7\u00d8\2\2\u06cb\u06cc\t\25\2\2\u06cc\u06cd\7\u00c7"+
		"\2\2\u06cd\u06ce\7E\2\2\u06ce\u06cf\5\u00c4c\2\u06cf\u06d0\7\u00e2\2\2"+
		"\u06d0\u0716\3\2\2\2\u06d1\u06d2\5\u00eav\2\u06d2\u06d4\7\u00d8\2\2\u06d3"+
		"\u06d5\5\u00c0a\2\u06d4\u06d3\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d6"+
		"\3\2\2\2\u06d6\u06d7\7\u00e2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u06d9\7~\2"+
		"\2\u06d9\u06da\7\u00d8\2\2\u06da\u06db\5\u00a6T\2\u06db\u06dc\7\u00e2"+
		"\2\2\u06dc\u0716\3\2\2\2\u06dd\u06de\5\u00eav\2\u06de\u06e0\7\u00d8\2"+
		"\2\u06df\u06e1\5\u00c0a\2\u06e0\u06df\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1"+
		"\u06e2\3\2\2\2\u06e2\u06e3\7\u00e2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e5"+
		"\7~\2\2\u06e5\u06e6\5\u00eav\2\u06e6\u0716\3\2\2\2\u06e7\u06ed\5\u00ea"+
		"v\2\u06e8\u06ea\7\u00d8\2\2\u06e9\u06eb\5\u00c0a\2\u06ea\u06e9\3\2\2\2"+
		"\u06ea\u06eb\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ee\7\u00e2\2\2\u06ed"+
		"\u06e8\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f1\7\u00d8"+
		"\2\2\u06f0\u06f2\7\62\2\2\u06f1\u06f0\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2"+
		"\u06f4\3\2\2\2\u06f3\u06f5\5\u00c6d\2\u06f4\u06f3\3\2\2\2\u06f4\u06f5"+
		"\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06f7\7\u00e2\2\2\u06f7\u0716\3\2\2"+
		"\2\u06f8\u0716\5\u00e0q\2\u06f9\u06fa\7\u00cf\2\2\u06fa\u0716\5\u00c4"+
		"c\23\u06fb\u06fc\7t\2\2\u06fc\u0716\5\u00c4c\16\u06fd\u06fe\5\u00d4k\2"+
		"\u06fe\u06ff\7\u00d0\2\2\u06ff\u0701\3\2\2\2\u0700\u06fd\3\2\2\2\u0700"+
		"\u0701\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0716\7\u00c9\2\2\u0703\u0704"+
		"\7\u00d8\2\2\u0704\u0705\5n8\2\u0705\u0706\7\u00e2\2\2\u0706\u0716\3\2"+
		"\2\2\u0707\u0708\7\u00d8\2\2\u0708\u0709\5\u00c4c\2\u0709\u070a\7\u00e2"+
		"\2\2\u070a\u0716\3\2\2\2\u070b\u070c\7\u00d8\2\2\u070c\u070d\5\u00c0a"+
		"\2\u070d\u070e\7\u00e2\2\2\u070e\u0716\3\2\2\2\u070f\u0711\7\u00d6\2\2"+
		"\u0710\u0712\5\u00c0a\2\u0711\u0710\3\2\2\2\u0711\u0712\3\2\2\2\u0712"+
		"\u0713\3\2\2\2\u0713\u0716\7\u00e1\2\2\u0714\u0716\5\u00ccg\2\u0715\u0694"+
		"\3\2\2\2\u0715\u06a8\3\2\2\2\u0715\u06af\3\2\2\2\u0715\u06b1\3\2\2\2\u0715"+
		"\u06b8\3\2\2\2\u0715\u06bc\3\2\2\2\u0715\u06c7\3\2\2\2\u0715\u06c9\3\2"+
		"\2\2\u0715\u06d1\3\2\2\2\u0715\u06dd\3\2\2\2\u0715\u06e7\3\2\2\2\u0715"+
		"\u06f8\3\2\2\2\u0715\u06f9\3\2\2\2\u0715\u06fb\3\2\2\2\u0715\u0700\3\2"+
		"\2\2\u0715\u0703\3\2\2\2\u0715\u0707\3\2\2\2\u0715\u070b\3\2\2\2\u0715"+
		"\u070f\3\2\2\2\u0715\u0714\3\2\2\2\u0716\u075e\3\2\2\2\u0717\u0718\f\22"+
		"\2\2\u0718\u0719\t\26\2\2\u0719\u075d\5\u00c4c\23\u071a\u071b\f\21\2\2"+
		"\u071b\u071c\t\27\2\2\u071c\u075d\5\u00c4c\22\u071d\u0730\f\20\2\2\u071e"+
		"\u0731\7\u00d1\2\2\u071f\u0731\7\u00d2\2\2\u0720\u0731\7\u00da\2\2\u0721"+
		"\u0731\7\u00d7\2\2\u0722\u0731\7\u00d3\2\2\u0723\u0731\7\u00d9\2\2\u0724"+
		"\u0731\7\u00d4\2\2\u0725\u0727\7H\2\2\u0726\u0725\3\2\2\2\u0726\u0727"+
		"\3\2\2\2\u0727\u0729\3\2\2\2\u0728\u072a\7t\2\2\u0729\u0728\3\2\2\2\u0729"+
		"\u072a\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u0731\7Q\2\2\u072c\u072e\7t\2"+
		"\2\u072d\u072c\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0731"+
		"\t\30\2\2\u0730\u071e\3\2\2\2\u0730\u071f\3\2\2\2\u0730\u0720\3\2\2\2"+
		"\u0730\u0721\3\2\2\2\u0730\u0722\3\2\2\2\u0730\u0723\3\2\2\2\u0730\u0724"+
		"\3\2\2\2\u0730\u0726\3\2\2\2\u0730\u072d\3\2\2\2\u0731\u0732\3\2\2\2\u0732"+
		"\u075d\5\u00c4c\21\u0733\u0734\f\r\2\2\u0734\u0735\7\b\2\2\u0735\u075d"+
		"\5\u00c4c\16\u0736\u0737\f\f\2\2\u0737\u0738\7z\2\2\u0738\u075d\5\u00c4"+
		"c\r\u0739\u073b\f\13\2\2\u073a\u073c\7t\2\2\u073b\u073a\3\2\2\2\u073b"+
		"\u073c\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073e\7\22\2\2\u073e\u073f\5"+
		"\u00c4c\2\u073f\u0740\7\b\2\2\u0740\u0741\5\u00c4c\f\u0741\u075d\3\2\2"+
		"\2\u0742\u0743\f\n\2\2\u0743\u0744\7\u00dd\2\2\u0744\u0745\5\u00c4c\2"+
		"\u0745\u0746\7\u00cc\2\2\u0746\u0747\5\u00c4c\n\u0747\u075d\3\2\2\2\u0748"+
		"\u0749\f\25\2\2\u0749\u074a\7\u00d6\2\2\u074a\u074b\5\u00c4c\2\u074b\u074c"+
		"\7\u00e1\2\2\u074c\u075d\3\2\2\2\u074d\u074e\f\24\2\2\u074e\u074f\7\u00d0"+
		"\2\2\u074f\u075d\7\u00c5\2\2\u0750\u0751\f\17\2\2\u0751\u0753\7Y\2\2\u0752"+
		"\u0754\7t\2\2\u0753\u0752\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0755\3\2"+
		"\2\2\u0755\u075d\7u\2\2\u0756\u075a\f\t\2\2\u0757\u075b\5\u00e8u\2\u0758"+
		"\u0759\7\f\2\2\u0759\u075b\5\u00eav\2\u075a\u0757\3\2\2\2\u075a\u0758"+
		"\3\2\2\2\u075b\u075d\3\2\2\2\u075c\u0717\3\2\2\2\u075c\u071a\3\2\2\2\u075c"+
		"\u071d\3\2\2\2\u075c\u0733\3\2\2\2\u075c\u0736\3\2\2\2\u075c\u0739\3\2"+
		"\2\2\u075c\u0742\3\2\2\2\u075c\u0748\3\2\2\2\u075c\u074d\3\2\2\2\u075c"+
		"\u0750\3\2\2\2\u075c\u0756\3\2\2\2\u075d\u0760\3\2\2\2\u075e\u075c\3\2"+
		"\2\2\u075e\u075f\3\2\2\2\u075f\u00c5\3\2\2\2\u0760\u075e\3\2\2\2\u0761"+
		"\u0766\5\u00c8e\2\u0762\u0763\7\u00cd\2\2\u0763\u0765\5\u00c8e\2\u0764"+
		"\u0762\3\2\2\2\u0765\u0768\3\2\2\2\u0766\u0764\3\2\2\2\u0766\u0767\3\2"+
		"\2\2\u0767\u00c7\3\2\2\2\u0768\u0766\3\2\2\2\u0769\u076c\5\u00caf\2\u076a"+
		"\u076c\5\u00c4c\2\u076b\u0769\3\2\2\2\u076b\u076a\3\2\2\2\u076c\u00c9"+
		"\3\2\2\2\u076d\u076e\7\u00d8\2\2\u076e\u0773\5\u00eav\2\u076f\u0770\7"+
		"\u00cd\2\2\u0770\u0772\5\u00eav\2\u0771\u076f\3\2\2\2\u0772\u0775\3\2"+
		"\2\2\u0773\u0771\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0776\3\2\2\2\u0775"+
		"\u0773\3\2\2\2\u0776\u0777\7\u00e2\2\2\u0777\u0781\3\2\2\2\u0778\u077d"+
		"\5\u00eav\2\u0779\u077a\7\u00cd\2\2\u077a\u077c\5\u00eav\2\u077b\u0779"+
		"\3\2\2\2\u077c\u077f\3\2\2\2\u077d\u077b\3\2\2\2\u077d\u077e\3\2\2\2\u077e"+
		"\u0781\3\2\2\2\u077f\u077d\3\2\2\2\u0780\u076d\3\2\2\2\u0780\u0778\3\2"+
		"\2\2\u0781\u0782\3\2\2\2\u0782\u0783\7\u00c8\2\2\u0783\u0784\5\u00c4c"+
		"\2\u0784\u00cb\3\2\2\2\u0785\u0786\5\u00d4k\2\u0786\u0787\7\u00d0\2\2"+
		"\u0787\u0789\3\2\2\2\u0788\u0785\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u078a"+
		"\3\2\2\2\u078a\u078b\5\u00ceh\2\u078b\u00cd\3\2\2\2\u078c\u078f\5\u00ea"+
		"v\2\u078d\u078e\7\u00d0\2\2\u078e\u0790\5\u00eav\2\u078f\u078d\3\2\2\2"+
		"\u078f\u0790\3\2\2\2\u0790\u00cf\3\2\2\2\u0791\u0792\bi\1\2\u0792\u0799"+
		"\5\u00d4k\2\u0793\u0799\5\u00d2j\2\u0794\u0795\7\u00d8\2\2\u0795\u0796"+
		"\5n8\2\u0796\u0797\7\u00e2\2\2\u0797\u0799\3\2\2\2\u0798\u0791\3\2\2\2"+
		"\u0798\u0793\3\2\2\2\u0798\u0794\3\2\2\2\u0799\u07a2\3\2\2\2\u079a\u079e"+
		"\f\3\2\2\u079b\u079f\5\u00e8u\2\u079c\u079d\7\f\2\2\u079d\u079f\5\u00ea"+
		"v\2\u079e\u079b\3\2\2\2\u079e\u079c\3\2\2\2\u079f\u07a1\3\2\2\2\u07a0"+
		"\u079a\3\2\2\2\u07a1\u07a4\3\2\2\2\u07a2\u07a0\3\2\2\2\u07a2\u07a3\3\2"+
		"\2\2\u07a3\u00d1\3\2\2\2\u07a4\u07a2\3\2\2\2\u07a5\u07a6\5\u00eav\2\u07a6"+
		"\u07a8\7\u00d8\2\2\u07a7\u07a9\5\u00d6l\2\u07a8\u07a7\3\2\2\2\u07a8\u07a9"+
		"\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ab\7\u00e2\2\2\u07ab\u00d3\3\2\2"+
		"\2\u07ac\u07ad\5\u00dan\2\u07ad\u07ae\7\u00d0\2\2\u07ae\u07b0\3\2\2\2"+
		"\u07af\u07ac\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b2"+
		"\5\u00eav\2\u07b2\u00d5\3\2\2\2\u07b3\u07b8\5\u00d8m\2\u07b4\u07b5\7\u00cd"+
		"\2\2\u07b5\u07b7\5\u00d8m\2\u07b6\u07b4\3\2\2\2\u07b7\u07ba\3\2\2\2\u07b8"+
		"\u07b6\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u00d7\3\2\2\2\u07ba\u07b8\3\2"+
		"\2\2\u07bb\u07bf\5\u00ceh\2\u07bc\u07bf\5\u00d2j\2\u07bd\u07bf\5\u00e0"+
		"q\2\u07be\u07bb\3\2\2\2\u07be\u07bc\3\2\2\2\u07be\u07bd\3\2\2\2\u07bf"+
		"\u00d9\3\2\2\2\u07c0\u07c1\5\u00eav\2\u07c1\u00db\3\2\2\2\u07c2\u07cb"+
		"\7\u00c3\2\2\u07c3\u07c4\7\u00d0\2\2\u07c4\u07cb\t\31\2\2\u07c5\u07c6"+
		"\7\u00c5\2\2\u07c6\u07c8\7\u00d0\2\2\u07c7\u07c9\t\31\2\2\u07c8\u07c7"+
		"\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07cb\3\2\2\2\u07ca\u07c2\3\2\2\2\u07ca"+
		"\u07c3\3\2\2\2\u07ca\u07c5\3\2\2\2\u07cb\u00dd\3\2\2\2\u07cc\u07ce\t\32"+
		"\2\2\u07cd\u07cc\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce\u07d5\3\2\2\2\u07cf"+
		"\u07d6\5\u00dco\2\u07d0\u07d6\7\u00c4\2\2\u07d1\u07d6\7\u00c5\2\2\u07d2"+
		"\u07d6\7\u00c6\2\2\u07d3\u07d6\7S\2\2\u07d4\u07d6\7r\2\2\u07d5\u07cf\3"+
		"\2\2\2\u07d5\u07d0\3\2\2\2\u07d5\u07d1\3\2\2\2\u07d5\u07d2\3\2\2\2\u07d5"+
		"\u07d3\3\2\2\2\u07d5\u07d4\3\2\2\2\u07d6\u00df\3\2\2\2\u07d7\u07db\5\u00de"+
		"p\2\u07d8\u07db\7\u00c7\2\2\u07d9\u07db\7u\2\2\u07da\u07d7\3\2\2\2\u07da"+
		"\u07d8\3\2\2\2\u07da\u07d9\3\2\2\2\u07db\u00e1\3\2\2\2\u07dc\u07dd\t\33"+
		"\2\2\u07dd\u00e3\3\2\2\2\u07de\u07df\t\34\2\2\u07df\u00e5\3\2\2\2\u07e0"+
		"\u07e1\t\35\2\2\u07e1\u00e7\3\2\2\2\u07e2\u07e5\7\u00c2\2\2\u07e3\u07e5"+
		"\5\u00e6t\2\u07e4\u07e2\3\2\2\2\u07e4\u07e3\3\2\2\2\u07e5\u00e9\3\2\2"+
		"\2\u07e6\u07ea\7\u00c2\2\2\u07e7\u07ea\5\u00e2r\2\u07e8\u07ea\5\u00e4"+
		"s\2\u07e9\u07e6\3\2\2\2\u07e9\u07e7\3\2\2\2\u07e9\u07e8\3\2\2\2\u07ea"+
		"\u00eb\3\2\2\2\u07eb\u07ee\5\u00eav\2\u07ec\u07ee\7u\2\2\u07ed\u07eb\3"+
		"\2\2\2\u07ed\u07ec\3\2\2\2\u07ee\u00ed\3\2\2\2\u07ef\u07f0\7\u00c7\2\2"+
		"\u07f0\u07f1\7\u00d2\2\2\u07f1\u07f2\5\u00dep\2\u07f2\u00ef\3\2\2\2\u0110"+
		"\u00f4\u00f8\u00fb\u00fe\u0112\u0118\u011f\u0127\u012b\u0132\u0137\u013e"+
		"\u0143\u0149\u014f\u0154\u015a\u015f\u0165\u016a\u0170\u017e\u0185\u018c"+
		"\u0193\u0199\u019e\u01a4\u01a9\u01af\u01b8\u01c1\u01cb\u01df\u01e7\u01f6"+
		"\u0200\u020e\u0214\u021a\u0221\u0225\u0228\u022e\u0231\u0237\u023b\u023e"+
		"\u0249\u024d\u0250\u0255\u0257\u025a\u025d\u0267\u026b\u026e\u0271\u0276"+
		"\u0278\u0280\u0283\u0286\u028c\u0290\u0293\u0296\u0299\u029c\u029f\u02a4"+
		"\u02aa\u02ae\u02b1\u02b4\u02b8\u02c0\u02da\u02dc\u02e0\u02f6\u02f8\u0303"+
		"\u0306\u030f\u0320\u032b\u033d\u034a\u035b\u0364\u037f\u0381\u039c\u03a1"+
		"\u03a6\u03a9\u03b5\u03ba\u03bd\u03c0\u03c4\u03c8\u03cc\u03cf\u03d3\u03d5"+
		"\u03eb\u03f3\u03f6\u0400\u0404\u040c\u0410\u0415\u0419\u041d\u0421\u0425"+
		"\u0427\u042f\u0433\u0436\u043e\u0443\u0448\u044b\u0455\u045f\u0463\u0468"+
		"\u046c\u0472\u0475\u0478\u047b\u0489\u048d\u0491\u0496\u0499\u04a3\u04ab"+
		"\u04ae\u04b2\u04b5\u04b9\u04bc\u04bf\u04c2\u04c5\u04c8\u04cc\u04d0\u04d3"+
		"\u04d6\u04d9\u04dc\u04df\u04e8\u04ee\u0509\u051f\u0527\u052a\u0530\u0538"+
		"\u053b\u0541\u0543\u0547\u054c\u054f\u0552\u0556\u055a\u055d\u055f\u0562"+
		"\u0566\u056a\u056d\u056f\u0571\u0574\u0579\u0584\u058a\u058f\u0596\u059b"+
		"\u059f\u05a3\u05a8\u05af\u05b7\u05ba\u05bd\u05d0\u05de\u05ee\u05f1\u05fa"+
		"\u05fe\u0603\u0608\u060b\u060d\u0623\u0626\u0631\u0635\u0638\u063c\u0640"+
		"\u0648\u064c\u0659\u0665\u0671\u0679\u067d\u0684\u068a\u0692\u0697\u06a0"+
		"\u06a4\u06c3\u06d4\u06e0\u06ea\u06ed\u06f1\u06f4\u0700\u0711\u0715\u0726"+
		"\u0729\u072d\u0730\u073b\u0753\u075a\u075c\u075e\u0766\u076b\u0773\u077d"+
		"\u0780\u0788\u078f\u0798\u079e\u07a2\u07a8\u07af\u07b8\u07be\u07c8\u07ca"+
		"\u07cd\u07d5\u07da\u07e4\u07e9\u07ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}