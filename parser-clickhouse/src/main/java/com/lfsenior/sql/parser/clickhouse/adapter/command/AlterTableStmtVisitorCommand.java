package com.lfsenior.sql.parser.clickhouse.adapter.command;

import com.lfsenior.sql.parser.clickhouse.adapter.AlterTableStmtVisitor;
import com.lfsenior.sql.parser.clickhouse.adapter.ClickHouseVisitorCommand;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserVisitor;
import com.lfsenior.sql.parser.common.ast.statement.SQLAlterTableStatement;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * <b><code>AlterTableStmtVisitorCommand</code></b>
 * <p/>
 * 修改表visitor指令
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 11:32.
 *
 * @author LFSenior
 */
public class AlterTableStmtVisitorCommand extends ClickHouseVisitorCommand<SQLAlterTableStatement> {
    public AlterTableStmtVisitorCommand() {
        super(new AlterTableStmtVisitor(), ":AlterTableStmtVisitor");
    }

    /**
     * 静态匹配器，理论上每个节点都必须实现该匹配指令
     *
     * @return
     */
    public static boolean match(ParseTree payload) {
        return payload instanceof ClickHouseParser.AlterTableStmtContext;
    }

    /**
     * 判断是否接受该结果
     *
     * @param obj
     * @return
     */
    public static boolean hasReserve(Object obj) {
        return obj != null && obj instanceof SQLAlterTableStatement;
    }
}
