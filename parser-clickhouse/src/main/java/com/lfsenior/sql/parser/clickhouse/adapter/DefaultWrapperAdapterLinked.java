package com.lfsenior.sql.parser.clickhouse.adapter;

import com.lfsenior.sql.parser.clickhouse.adapter.command.*;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * <b><code>ClickHouseWrapperAdapterLinked</code></b>
 * <p/>
 * CK适配器
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 10:16.
 *
 * @author LFSenior
 */
public class DefaultWrapperAdapterLinked {
    private static WrapperAdapterNode start = new WrapperAdapterNode(null);

    static {
        start.setNext(new WrapperAdapterNode(QueryStmtVisitorCommand.class));
        start.setNext(new WrapperAdapterNode(QueryVisitorCommand.class));
        start.setNext(new WrapperAdapterNode(AlterTableStmtVisitorCommand.class));
        start.setNext(new WrapperAdapterNode(TableIdentifierVisitorCommand.class));
        start.setNext(new WrapperAdapterNode(DatabaseIdentifierVisitorCommand.class));
        start.setNext(new WrapperAdapterNode(IdentifierVisitorCommand.class));
    }

    /**
     * 执行入口
     *
     * @param payload
     * @return
     */
    public static Object execute(ParseTree payload) {
        WrapperAdapterNode currentNode = start;
        Object result = null;
        while (currentNode.hasNext()) {
            currentNode = currentNode.getNext();
            if (currentNode.match(payload)) {
                result = currentNode.execute(payload);
            }
            /*判断是否接受该返回*/
            if (currentNode.hasReserve(result)) {
                break;
            }
        }
        return result;
    }
}
