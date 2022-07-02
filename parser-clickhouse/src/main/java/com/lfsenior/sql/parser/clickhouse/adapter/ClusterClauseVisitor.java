package com.lfsenior.sql.parser.clickhouse.adapter;

import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserBaseVisitor;
import com.lfsenior.sql.parser.common.ast.SQLExpr;
import com.lfsenior.sql.parser.common.ast.SQLStatement;
import com.lfsenior.sql.parser.common.ast.statement.SQLAlterTableItem;
import com.lfsenior.sql.parser.common.ast.statement.SQLTableSource;
import com.lfsenior.sql.parser.common.dialect.ast.statement.ClickHouseSQLAlterTableStatement;
import com.lfsenior.sql.parser.common.dialect.ast.statement.ClickHouseSQLClusterClause;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

/**
 * <b><code>ClusterClauseVisitor</code></b>
 * <p/>
 * 访问子句
 * <p/>
 * <b>Creation Time:</b> 2022/5/11 15:49.
 *
 * @author LFSenior
 */
public class ClusterClauseVisitor extends ClickHouseParserBaseVisitor<ClickHouseSQLClusterClause> {
    private ClickHouseSQLClusterClause clusterClause;

    @Override
    public ClickHouseSQLClusterClause visitChildren(RuleNode node) {
        clusterClause = new ClickHouseSQLClusterClause();
        for (int i = 0; i < node.getChildCount(); i++) {
            ParseTree cNode = node.getChild(i);
            if (cNode instanceof ClickHouseParser.IdentifierContext) {
                clusterClause.setExpr((SQLExpr) DefaultWrapperAdapterLinked.execute(cNode));
            }
        }
        return clusterClause;
    }
}
