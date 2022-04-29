package com.lfsenior.sql.parser.common.convert;

import com.lfsenior.sql.parser.common.ast.SQLStatement;

import java.util.Objects;

/**
 * <b><code>Convert</code></b>
 * <p/>
 * 指令用于实现正对不用接收者的不同实现，隔离调用者和接收者的关系
 * <p/>
 * <b>Creation Time:</b> 2022/4/29 11:17.
 *
 * @author LFSenior
 */
public interface Command {
    /**
     * 获取命令执行指令
     *
     * @return
     */
    Receiver getReceiver();

    /**
     * 设置指令接收者
     *
     * @param receiver
     */
    void setReceiver(Receiver receiver);

    /**
     * 执行指令动作
     *
     * @param payload 指令负载（一般为接受依赖的参数）
     * @return
     */
    Object action(Object payload);


}
