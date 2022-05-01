package com.lfsenior.sql.parser.clickhouse.adapter;

import com.lfsenior.sql.parser.common.exception.AdapterConvertException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <b><code>WrapperAdapterNode</code></b>
 * <p/>
 * <b>装饰节点实现：</b>
 * <p>
 * 这里主要是对Visitor指令的装饰
 * <p>
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 9:23.
 *
 * @author LFSenior
 */
public class WrapperAdapterNode {

    public WrapperAdapterNode(Class<? extends ClickHouseVisitorCommand> clickHouseVisitorCommand, WrapperAdapterNode next) {
        this.clickHouseVisitorCommand = clickHouseVisitorCommand;
        this.next = next;
    }

    public WrapperAdapterNode(Class<? extends ClickHouseVisitorCommand> clickHouseVisitorCommand) {
        this.clickHouseVisitorCommand = clickHouseVisitorCommand;
    }

    private static final String MATCH_METHOD_NAME = "match";

    private static final String HASRESERVE_METHOD_NAME = "hasReserve";
    /*封装所对应的指令集合*/
    private Class<? extends ClickHouseVisitorCommand> clickHouseVisitorCommand;

    /*指令匹配动作缓存*/
    private static ConcurrentHashMap<Class<? extends ClickHouseVisitorCommand>, Method> COMMAND_MATCH_ACTION_CACHE = new ConcurrentHashMap<>();

    /*结果接受判断动作缓存*/
    private static ConcurrentHashMap<Class<? extends ClickHouseVisitorCommand>, Method> RESERVE_ACTION_CACHE = new ConcurrentHashMap<>();
    /*下一节点*/
    private WrapperAdapterNode next;

    /**
     * 执行匹配动作
     *
     * @return
     */
    public boolean match(ParseTree payload) {
        /*判断是否有缓存*/
        Boolean result = false;
        try {
            Method invokeMethod = null;
            if ((invokeMethod = COMMAND_MATCH_ACTION_CACHE.get(clickHouseVisitorCommand)) == null) {
                /*需要进行初始化*/
                invokeMethod = clickHouseVisitorCommand.getMethod("match", ParseTree.class);
                /*加入缓存*/
                COMMAND_MATCH_ACTION_CACHE.putIfAbsent(clickHouseVisitorCommand, invokeMethod);
            }
            result = (Boolean) invokeMethod.invoke(clickHouseVisitorCommand, payload);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new AdapterConvertException(e);
        }
        return result;
    }


    public boolean hasReserve(Object obj) {
        /*判断是否有缓存*/
        Boolean result = false;
        try {
            Method invokeMethod = null;
            if ((invokeMethod = RESERVE_ACTION_CACHE.get(clickHouseVisitorCommand)) == null) {
                /*需要进行初始化*/
                invokeMethod = clickHouseVisitorCommand.getMethod("hasReserve", Object.class);
                /*加入缓存*/
                RESERVE_ACTION_CACHE.putIfAbsent(clickHouseVisitorCommand, invokeMethod);
            }
            result = (Boolean) invokeMethod.invoke(clickHouseVisitorCommand, obj);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new AdapterConvertException(e);
        }
        return result;
    }

    /**
     * 执行解析动作
     *
     * @return
     */
    public Object execute(ParseTree payload) {
        try {
            ClickHouseVisitorCommand command = this.clickHouseVisitorCommand.newInstance();
            return command.action(payload);
        } catch (InstantiationException | IllegalAccessException e) {
            throw new AdapterConvertException(e);
        }
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public WrapperAdapterNode getNext() {
        return next;
    }

    /**
     * 完整组链动作
     *
     * @param wrapperAdapterNode
     */
    public WrapperAdapterNode setNext(WrapperAdapterNode wrapperAdapterNode) {
        WrapperAdapterNode parentNode = this;
        while (parentNode.hasNext()) {
            parentNode = parentNode.getNext();
        }
        parentNode.next = wrapperAdapterNode;
        return this;
    }


}
