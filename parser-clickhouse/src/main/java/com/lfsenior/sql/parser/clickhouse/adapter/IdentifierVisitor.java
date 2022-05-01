package com.lfsenior.sql.parser.clickhouse.adapter;

import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserBaseVisitor;
import com.lfsenior.sql.parser.common.ast.SQLIdentifierExpr;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * <b><code>IdentifierVisitor</code></b>
 * <p/>
 * 定义（常量、字符串这些解析）
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 11:13.
 *
 * @author LFSenior
 */
public class IdentifierVisitor extends ClickHouseParserBaseVisitor<SQLIdentifierExpr> {
    private SQLIdentifierExpr sqlIdentifierExpr;

    @Override
    public SQLIdentifierExpr visitTerminal(TerminalNode node) {
        Token symbol = node.getSymbol();
        if (symbol != null) {
            sqlIdentifierExpr = new SQLIdentifierExpr(symbol.getText());
        }
        return sqlIdentifierExpr;
    }

    @Override
    public SQLIdentifierExpr visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }
}
