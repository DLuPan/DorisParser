package com.lfsenior.sql.parser.clickhouse.adapter;

import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserBaseVisitor;
import com.lfsenior.sql.parser.common.ast.SQLStatement;
import com.lfsenior.sql.parser.common.ast.statement.AbstractTableSource;
import com.lfsenior.sql.parser.common.ast.statement.SQLAlterTableItem;
import com.lfsenior.sql.parser.common.ast.statement.SQLAlterTableStatement;
import com.lfsenior.sql.parser.common.ast.statement.SQLTableSource;
import com.lfsenior.sql.parser.common.type.DbType;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

/**
 * <b><code>AlterTableStmtVisitor</code></b>
 * <p/>
 * 修改表实现
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 10:34.
 *
 * @author LFSenior
 */
public class AlterTableStmtVisitor extends ClickHouseParserBaseVisitor<SQLAlterTableStatement> {
    /*标准返回构建*/
    private SQLAlterTableStatement alterTableStatement;

    @Override
    public SQLAlterTableStatement visitChildren(RuleNode node) {
        alterTableStatement = new SQLAlterTableStatement(DbType.Clickhouse);
        for (int i = 0; i < node.getChildCount(); i++) {
            ParseTree cNode = node.getChild(i);
            Object sqlNode = DefaultWrapperAdapterLinked.execute(cNode);
            if (sqlNode instanceof SQLTableSource) {
                alterTableStatement.setTableSource((SQLTableSource) sqlNode);
            } else if (sqlNode instanceof SQLAlterTableItem) {
                alterTableStatement.addItem((SQLAlterTableItem) sqlNode);
            }
        }
        return alterTableStatement;
    }
}
