package com.lfsenior.sql.parser.clickhouse.adapter.command;

import com.lfsenior.sql.parser.clickhouse.adapter.ClickHouseVisitorCommand;
import com.lfsenior.sql.parser.clickhouse.adapter.QueryStmtVisitor;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.common.ast.SQLStatement;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * <b><code>QueryStmtVisitorCommand</code></b>
 * <p/>
 * queryStmt命令
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 9:53.
 *
 * @author LFSenior
 */
public class QueryStmtVisitorCommand extends ClickHouseVisitorCommand<SQLStatement> {
    public QueryStmtVisitorCommand() {
        super(new QueryStmtVisitor(), ":QueryStmtVisitor");
    }

    /**
     * 静态匹配器，理论上每个节点都必须实现该匹配指令
     *
     * @return
     */
    public static boolean match(ParseTree payload) {
        return payload instanceof ClickHouseParser.QueryStmtContext;
    }

    /**
     * 判断是否接受该结果
     *
     * @param obj
     * @return
     */
    public static boolean hasReserve(Object obj) {
        return obj != null;
    }
}
