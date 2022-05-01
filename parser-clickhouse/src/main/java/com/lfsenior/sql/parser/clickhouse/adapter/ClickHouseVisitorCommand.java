package com.lfsenior.sql.parser.clickhouse.adapter;

import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserVisitor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * <b><code>ClickHouseVisitorCommand</code></b>
 * <p/>
 * 访问指令实现
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 9:23.
 *
 * @author LFSenior
 */
@Slf4j
public abstract class ClickHouseVisitorCommand<T> {
    private ClickHouseParserVisitor<T> visitor;
    private String commandId = "CKVisitor";

    public ClickHouseVisitorCommand(ClickHouseParserVisitor<T> visitor, String suffix) {
        this.visitor = visitor;
        this.commandId += suffix;
    }

    /**
     * 静态匹配器，理论上每个节点都必须实现该匹配指令
     *
     * @return
     */
    public static boolean match(ParseTree payload) {
        return false;
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

    /**
     * 指令动作
     *
     * @param payload
     * @return
     */
    public T action(ParseTree payload) {
        log.info("执行适配指令[{}]开始>>>>>>", commandId);
        T result = payload.accept(visitor);
        log.info("执行适配指令[{}]结束>>>>>>", commandId);
        return result;
    }
}
