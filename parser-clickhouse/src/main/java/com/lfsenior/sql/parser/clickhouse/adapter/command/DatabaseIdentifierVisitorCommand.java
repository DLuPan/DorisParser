package com.lfsenior.sql.parser.clickhouse.adapter.command;

import com.lfsenior.sql.parser.clickhouse.adapter.ClickHouseVisitorCommand;
import com.lfsenior.sql.parser.clickhouse.adapter.DatabaseIdentifierVisitor;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserVisitor;
import com.lfsenior.sql.parser.common.ast.SQLExpr;
import com.lfsenior.sql.parser.common.ast.SQLIdentifierExpr;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * <b><code>DatabaseIdentifierVisitorCommand</code></b>
 * <p/>
 * 数据库访问指令
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 11:37.
 *
 * @author LFSenior
 */
public class DatabaseIdentifierVisitorCommand extends ClickHouseVisitorCommand<SQLIdentifierExpr> {
    public DatabaseIdentifierVisitorCommand() {
        super(new DatabaseIdentifierVisitor(), ":DatabaseIdentifierVisitor");
    }

    /**
     * 静态匹配器，理论上每个节点都必须实现该匹配指令
     *
     * @return
     */
    public static boolean match(ParseTree payload) {
        return payload instanceof ClickHouseParser.DatabaseIdentifierContext;
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
