package com.lfsenior.sql.parser.clickhouse.adapter.command;

import com.lfsenior.sql.parser.clickhouse.adapter.ClickHouseVisitorCommand;
import com.lfsenior.sql.parser.clickhouse.adapter.TableIdentifierVisitor;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserBaseVisitor;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserVisitor;
import com.lfsenior.sql.parser.common.ast.statement.SQLTableSource;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * <b><code>TableIdentifierVisitor</code></b>
 * <p/>
 * 表定义
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 11:35.
 *
 * @author LFSenior
 */
public class TableIdentifierVisitorCommand extends ClickHouseVisitorCommand<SQLTableSource> {
    public TableIdentifierVisitorCommand() {
        super(new TableIdentifierVisitor(), ":TableIdentifierVisitor");
    }

    /**
     * 静态匹配器，理论上每个节点都必须实现该匹配指令
     *
     * @return
     */
    public static boolean match(ParseTree payload) {
        return payload instanceof ClickHouseParser.TableIdentifierContext;
    }

    /**
     * 判断是否接受该结果
     *
     * @param obj
     * @return
     */
    public static boolean hasReserve(Object obj) {
        return obj instanceof SQLTableSource;
    }

}
