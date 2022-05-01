package com.lfsenior.sql.parser.clickhouse.adapter.command;

import com.lfsenior.sql.parser.clickhouse.adapter.ClickHouseVisitorCommand;
import com.lfsenior.sql.parser.clickhouse.adapter.QueryVisitor;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserVisitor;
import com.lfsenior.sql.parser.common.ast.SQLStatement;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * <b><code>QueryVisitorCommand</code></b>
 * <p/>
 * Query访问指令
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 11:29.
 *
 * @author LFSenior
 */
public class QueryVisitorCommand extends ClickHouseVisitorCommand<SQLStatement> {
    public QueryVisitorCommand() {
        super(new QueryVisitor(), ":QueryVisitor");
    }

    /**
     * 静态匹配器，理论上每个节点都必须实现该匹配指令
     *
     * @return
     */
    public static boolean match(ParseTree payload) {
        return payload instanceof ClickHouseParser.QueryContext;
    }
}
