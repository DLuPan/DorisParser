package com.lfsenior.sql.parser.clickhouse.adapter;

import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserVisitor;
import com.lfsenior.sql.parser.common.ast.SQLObject;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * <b><code>QueryStmtVisitor</code></b>
 * <p/>
 * 适配访问者，目的是将对象转换通用AST模型，任重道远。
 * <p/>
 * <b>Creation Time:</b> 2022/4/29 17:16.
 *
 * @author LFSenior
 */
public abstract class StatementAdapterVisitor implements ClickHouseParserVisitor<SQLObject> {
    @Override
    public SQLObject visitQueryStmt(ClickHouseParser.QueryStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitQuery(ClickHouseParser.QueryContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableStmt(ClickHouseParser.AlterTableStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseAddColumn(ClickHouseParser.AlterTableClauseAddColumnContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseAddIndex(ClickHouseParser.AlterTableClauseAddIndexContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseAddProjection(ClickHouseParser.AlterTableClauseAddProjectionContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseAttach(ClickHouseParser.AlterTableClauseAttachContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseClearColumn(ClickHouseParser.AlterTableClauseClearColumnContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseClearIndex(ClickHouseParser.AlterTableClauseClearIndexContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseClearProjection(ClickHouseParser.AlterTableClauseClearProjectionContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseComment(ClickHouseParser.AlterTableClauseCommentContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseDelete(ClickHouseParser.AlterTableClauseDeleteContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseDetach(ClickHouseParser.AlterTableClauseDetachContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseDropColumn(ClickHouseParser.AlterTableClauseDropColumnContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseDropIndex(ClickHouseParser.AlterTableClauseDropIndexContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseDropProjection(ClickHouseParser.AlterTableClauseDropProjectionContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseDropPartition(ClickHouseParser.AlterTableClauseDropPartitionContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseFreezePartition(ClickHouseParser.AlterTableClauseFreezePartitionContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseMaterializeIndex(ClickHouseParser.AlterTableClauseMaterializeIndexContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseMaterializeProjection(ClickHouseParser.AlterTableClauseMaterializeProjectionContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseModifyCodec(ClickHouseParser.AlterTableClauseModifyCodecContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseModifyComment(ClickHouseParser.AlterTableClauseModifyCommentContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseModifyRemove(ClickHouseParser.AlterTableClauseModifyRemoveContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseModify(ClickHouseParser.AlterTableClauseModifyContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseModifyOrderBy(ClickHouseParser.AlterTableClauseModifyOrderByContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseModifyTTL(ClickHouseParser.AlterTableClauseModifyTTLContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseMovePartition(ClickHouseParser.AlterTableClauseMovePartitionContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseRemoveTTL(ClickHouseParser.AlterTableClauseRemoveTTLContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseRename(ClickHouseParser.AlterTableClauseRenameContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseReplace(ClickHouseParser.AlterTableClauseReplaceContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlterTableClauseUpdate(ClickHouseParser.AlterTableClauseUpdateContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAddAfterColumnName(ClickHouseParser.AddAfterColumnNameContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAssignmentExprList(ClickHouseParser.AssignmentExprListContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAssignmentExpr(ClickHouseParser.AssignmentExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableColumnPropertyType(ClickHouseParser.TableColumnPropertyTypeContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitPartitionClause(ClickHouseParser.PartitionClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAttachDictionaryStmt(ClickHouseParser.AttachDictionaryStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitCheckStmt(ClickHouseParser.CheckStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitCreateDatabaseStmt(ClickHouseParser.CreateDatabaseStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitCreateDictionaryStmt(ClickHouseParser.CreateDictionaryStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitCreateLiveViewStmt(ClickHouseParser.CreateLiveViewStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitCreateMaterializedViewStmt(ClickHouseParser.CreateMaterializedViewStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitCreateTableStmt(ClickHouseParser.CreateTableStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitCreateViewStmt(ClickHouseParser.CreateViewStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitDictionarySchemaClause(ClickHouseParser.DictionarySchemaClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitDictionaryAttrDfnt(ClickHouseParser.DictionaryAttrDfntContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitDictionaryEngineClause(ClickHouseParser.DictionaryEngineClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitDictionaryPrimaryKeyClause(ClickHouseParser.DictionaryPrimaryKeyClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitDictionaryArgExpr(ClickHouseParser.DictionaryArgExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSourceClause(ClickHouseParser.SourceClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitLifetimeClause(ClickHouseParser.LifetimeClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitLayoutClause(ClickHouseParser.LayoutClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitRangeClause(ClickHouseParser.RangeClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitDictionarySettingsClause(ClickHouseParser.DictionarySettingsClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitClusterClause(ClickHouseParser.ClusterClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitUuidClause(ClickHouseParser.UuidClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitDestinationClause(ClickHouseParser.DestinationClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSubqueryClause(ClickHouseParser.SubqueryClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSchemaDescriptionClause(ClickHouseParser.SchemaDescriptionClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSchemaAsTableClause(ClickHouseParser.SchemaAsTableClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSchemaAsFunctionClause(ClickHouseParser.SchemaAsFunctionClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitEngineClause(ClickHouseParser.EngineClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableCommentClause(ClickHouseParser.TableCommentClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnCommentClause(ClickHouseParser.ColumnCommentClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitPartitionByClause(ClickHouseParser.PartitionByClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitPrimaryKeyClause(ClickHouseParser.PrimaryKeyClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSampleByClause(ClickHouseParser.SampleByClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTtlClause(ClickHouseParser.TtlClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitEngineExpr(ClickHouseParser.EngineExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableElementExprColumn(ClickHouseParser.TableElementExprColumnContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableElementExprConstraint(ClickHouseParser.TableElementExprConstraintContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableElementExprIndex(ClickHouseParser.TableElementExprIndexContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableElementExprProjection(ClickHouseParser.TableElementExprProjectionContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableColumnDfnt(ClickHouseParser.TableColumnDfntContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableColumnPropertyExpr(ClickHouseParser.TableColumnPropertyExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableIndexDfnt(ClickHouseParser.TableIndexDfntContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableProjectionDfnt(ClickHouseParser.TableProjectionDfntContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitCodecExpr(ClickHouseParser.CodecExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitCodecArgExpr(ClickHouseParser.CodecArgExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTtlExpr(ClickHouseParser.TtlExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitDescribeStmt(ClickHouseParser.DescribeStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitDropDatabaseStmt(ClickHouseParser.DropDatabaseStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitDropTableStmt(ClickHouseParser.DropTableStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitExistsDatabaseStmt(ClickHouseParser.ExistsDatabaseStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitExistsTableStmt(ClickHouseParser.ExistsTableStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitExplainASTStmt(ClickHouseParser.ExplainASTStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitExplainSyntaxStmt(ClickHouseParser.ExplainSyntaxStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitInsertStmt(ClickHouseParser.InsertStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnsClause(ClickHouseParser.ColumnsClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitDataClauseFormat(ClickHouseParser.DataClauseFormatContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitDataClauseValues(ClickHouseParser.DataClauseValuesContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitDataClauseSelect(ClickHouseParser.DataClauseSelectContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitKillMutationStmt(ClickHouseParser.KillMutationStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitOptimizeStmt(ClickHouseParser.OptimizeStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitRenameStmt(ClickHouseParser.RenameStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitProjectionSelectStmt(ClickHouseParser.ProjectionSelectStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSelectUnionStmt(ClickHouseParser.SelectUnionStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSelectStmtWithParens(ClickHouseParser.SelectStmtWithParensContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSelectStmt(ClickHouseParser.SelectStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitWithClause(ClickHouseParser.WithClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTopClause(ClickHouseParser.TopClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitFromClause(ClickHouseParser.FromClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitArrayJoinClause(ClickHouseParser.ArrayJoinClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitWindowClause(ClickHouseParser.WindowClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitPrewhereClause(ClickHouseParser.PrewhereClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitWhereClause(ClickHouseParser.WhereClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitGroupByClause(ClickHouseParser.GroupByClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitHavingClause(ClickHouseParser.HavingClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitOrderByClause(ClickHouseParser.OrderByClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitProjectionOrderByClause(ClickHouseParser.ProjectionOrderByClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitLimitByClause(ClickHouseParser.LimitByClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitLimitClause(ClickHouseParser.LimitClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSettingsClause(ClickHouseParser.SettingsClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitJoinExprOp(ClickHouseParser.JoinExprOpContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitJoinExprTable(ClickHouseParser.JoinExprTableContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitJoinExprParens(ClickHouseParser.JoinExprParensContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitJoinExprCrossOp(ClickHouseParser.JoinExprCrossOpContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitJoinOpInner(ClickHouseParser.JoinOpInnerContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitJoinOpLeftRight(ClickHouseParser.JoinOpLeftRightContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitJoinOpFull(ClickHouseParser.JoinOpFullContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitJoinOpCross(ClickHouseParser.JoinOpCrossContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitJoinConstraintClause(ClickHouseParser.JoinConstraintClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSampleClause(ClickHouseParser.SampleClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitLimitExpr(ClickHouseParser.LimitExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitOrderExprList(ClickHouseParser.OrderExprListContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitOrderExpr(ClickHouseParser.OrderExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitRatioExpr(ClickHouseParser.RatioExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSettingExprList(ClickHouseParser.SettingExprListContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSettingExpr(ClickHouseParser.SettingExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitWindowExpr(ClickHouseParser.WindowExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitWinPartitionByClause(ClickHouseParser.WinPartitionByClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitWinOrderByClause(ClickHouseParser.WinOrderByClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitWinFrameClause(ClickHouseParser.WinFrameClauseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitFrameStart(ClickHouseParser.FrameStartContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitFrameBetween(ClickHouseParser.FrameBetweenContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitWinFrameBound(ClickHouseParser.WinFrameBoundContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSetStmt(ClickHouseParser.SetStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitShowCreateDatabaseStmt(ClickHouseParser.ShowCreateDatabaseStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitShowCreateDictionaryStmt(ClickHouseParser.ShowCreateDictionaryStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitShowCreateTableStmt(ClickHouseParser.ShowCreateTableStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitShowDatabasesStmt(ClickHouseParser.ShowDatabasesStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitShowDictionariesStmt(ClickHouseParser.ShowDictionariesStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitShowTablesStmt(ClickHouseParser.ShowTablesStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitSystemStmt(ClickHouseParser.SystemStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTruncateStmt(ClickHouseParser.TruncateStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitUseStmt(ClickHouseParser.UseStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitWatchStmt(ClickHouseParser.WatchStmtContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnTypeExprSimple(ClickHouseParser.ColumnTypeExprSimpleContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnTypeExprNested(ClickHouseParser.ColumnTypeExprNestedContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnTypeExprEnum(ClickHouseParser.ColumnTypeExprEnumContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnTypeExprComplex(ClickHouseParser.ColumnTypeExprComplexContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnTypeExprParam(ClickHouseParser.ColumnTypeExprParamContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprList(ClickHouseParser.ColumnExprListContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnsExprAsterisk(ClickHouseParser.ColumnsExprAsteriskContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnsExprSubquery(ClickHouseParser.ColumnsExprSubqueryContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnsExprColumn(ClickHouseParser.ColumnsExprColumnContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprTernaryOp(ClickHouseParser.ColumnExprTernaryOpContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprAlias(ClickHouseParser.ColumnExprAliasContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprExtract(ClickHouseParser.ColumnExprExtractContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprNegate(ClickHouseParser.ColumnExprNegateContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprSubquery(ClickHouseParser.ColumnExprSubqueryContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprLiteral(ClickHouseParser.ColumnExprLiteralContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprArray(ClickHouseParser.ColumnExprArrayContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprSubstring(ClickHouseParser.ColumnExprSubstringContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprCast(ClickHouseParser.ColumnExprCastContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprOr(ClickHouseParser.ColumnExprOrContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprPrecedence1(ClickHouseParser.ColumnExprPrecedence1Context ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprPrecedence2(ClickHouseParser.ColumnExprPrecedence2Context ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprPrecedence3(ClickHouseParser.ColumnExprPrecedence3Context ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprInterval(ClickHouseParser.ColumnExprIntervalContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprIsNull(ClickHouseParser.ColumnExprIsNullContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprWinFunctionTarget(ClickHouseParser.ColumnExprWinFunctionTargetContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprTrim(ClickHouseParser.ColumnExprTrimContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprTuple(ClickHouseParser.ColumnExprTupleContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprArrayAccess(ClickHouseParser.ColumnExprArrayAccessContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprBetween(ClickHouseParser.ColumnExprBetweenContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprParens(ClickHouseParser.ColumnExprParensContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprTimestamp(ClickHouseParser.ColumnExprTimestampContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprAnd(ClickHouseParser.ColumnExprAndContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprTupleAccess(ClickHouseParser.ColumnExprTupleAccessContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprCase(ClickHouseParser.ColumnExprCaseContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprDate(ClickHouseParser.ColumnExprDateContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprNot(ClickHouseParser.ColumnExprNotContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprWinFunction(ClickHouseParser.ColumnExprWinFunctionContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprIdentifier(ClickHouseParser.ColumnExprIdentifierContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprFunction(ClickHouseParser.ColumnExprFunctionContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnExprAsterisk(ClickHouseParser.ColumnExprAsteriskContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnArgList(ClickHouseParser.ColumnArgListContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnArgExpr(ClickHouseParser.ColumnArgExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnLambdaExpr(ClickHouseParser.ColumnLambdaExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitColumnIdentifier(ClickHouseParser.ColumnIdentifierContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitNestedIdentifier(ClickHouseParser.NestedIdentifierContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableExprIdentifier(ClickHouseParser.TableExprIdentifierContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableExprSubquery(ClickHouseParser.TableExprSubqueryContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableExprAlias(ClickHouseParser.TableExprAliasContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableExprFunction(ClickHouseParser.TableExprFunctionContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableFunctionExpr(ClickHouseParser.TableFunctionExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableIdentifier(ClickHouseParser.TableIdentifierContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableArgList(ClickHouseParser.TableArgListContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitTableArgExpr(ClickHouseParser.TableArgExprContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitDatabaseIdentifier(ClickHouseParser.DatabaseIdentifierContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitFloatingLiteral(ClickHouseParser.FloatingLiteralContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitNumberLiteral(ClickHouseParser.NumberLiteralContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitLiteral(ClickHouseParser.LiteralContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitInterval(ClickHouseParser.IntervalContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitKeyword(ClickHouseParser.KeywordContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitKeywordForAlias(ClickHouseParser.KeywordForAliasContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitAlias(ClickHouseParser.AliasContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitIdentifier(ClickHouseParser.IdentifierContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitIdentifierOrNull(ClickHouseParser.IdentifierOrNullContext ctx) {
        return null;
    }

    @Override
    public SQLObject visitEnumValue(ClickHouseParser.EnumValueContext ctx) {
        return null;
    }

    @Override
    public SQLObject visit(ParseTree tree) {
        return null;
    }

    @Override
    public SQLObject visitChildren(RuleNode node) {
        return null;
    }

    @Override
    public SQLObject visitTerminal(TerminalNode node) {
        return null;
    }

    @Override
    public SQLObject visitErrorNode(ErrorNode node) {
        return null;
    }
}
