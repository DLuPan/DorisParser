package com.lfsenior.sql.parser.clickhouse.adapter.command;

import com.lfsenior.sql.parser.clickhouse.adapter.ClickHouseVisitorCommand;
import com.lfsenior.sql.parser.clickhouse.adapter.ClusterClauseVisitor;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.common.dialect.ast.statement.ClickHouseSQLClusterClause;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * <b><code>ClusterClauseVisitorCommand</code></b>
 * <p/>
 * 子句指令
 * <p/>
 * <b>Creation Time:</b> 2022/5/11 15:57.
 *
 * @author LFSenior
 */
public class ClusterClauseVisitorCommand extends ClickHouseVisitorCommand<ClickHouseSQLClusterClause> {
    public ClusterClauseVisitorCommand() {
        super(new ClusterClauseVisitor(), ":ClusterClauseVisitor");
    }


    /**
     * 静态匹配器，理论上每个节点都必须实现该匹配指令
     *
     * @return
     */
    public static boolean match(ParseTree payload) {
        return payload instanceof ClickHouseParser.ClusterClauseContext;
    }

    /**
     * 判断是否接受该结果
     *
     * @param obj
     * @return
     */
    public static boolean hasReserve(Object obj) {
        return obj != null && obj instanceof ClickHouseSQLClusterClause;
    }

}
