package com.lfsenior.sql.parser.clickhouse.adapter;

import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserBaseVisitor;
import com.lfsenior.sql.parser.common.ast.SQLIdentifierExpr;
import org.antlr.v4.runtime.tree.RuleNode;

/**
 * <b><code>DatabaseIdentifierVisitor</code></b>
 * <p/>
 * db定义实现
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 11:22.
 *
 * @author LFSenior
 */
public class DatabaseIdentifierVisitor extends ClickHouseParserBaseVisitor<SQLIdentifierExpr> {
    SQLIdentifierExpr dbNode;

    @Override
    public SQLIdentifierExpr visitChildren(RuleNode node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            Object sqlNode = DefaultWrapperAdapterLinked.execute(node.getChild(i));
            if (sqlNode instanceof SQLIdentifierExpr) {
                dbNode = (SQLIdentifierExpr) sqlNode;
            }
        }
        return dbNode;
    }
}
