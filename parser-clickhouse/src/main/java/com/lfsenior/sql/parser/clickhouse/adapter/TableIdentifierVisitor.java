package com.lfsenior.sql.parser.clickhouse.adapter;

import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserBaseVisitor;
import com.lfsenior.sql.parser.common.ast.SQLExpr;
import com.lfsenior.sql.parser.common.ast.statement.SQLTableSource;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

/**
 * <b><code>TableIdentifierVisitor</code></b>
 * <p/>
 * 表定义
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 11:10.
 *
 * @author LFSenior
 */
public class TableIdentifierVisitor extends ClickHouseParserBaseVisitor<SQLTableSource> {
    private SQLTableSource tableSource;

    @Override
    public SQLTableSource visitChildren(RuleNode node) {
        tableSource = new SQLTableSource();
        /*开始识别表定义*/
        for (int i = 0; i < node.getChildCount(); i++) {
            ParseTree cNode = node.getChild(i);
            if (cNode instanceof ClickHouseParser.IdentifierContext) {
                tableSource.setTableExpr((SQLExpr) DefaultWrapperAdapterLinked.execute(cNode));
            } else if (cNode instanceof ClickHouseParser.DatabaseIdentifierContext) {
                tableSource.setDbExpr((SQLExpr) DefaultWrapperAdapterLinked.execute(cNode));
            }
        }
        return tableSource;
    }
}
