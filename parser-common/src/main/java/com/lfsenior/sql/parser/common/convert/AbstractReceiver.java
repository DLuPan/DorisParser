package com.lfsenior.sql.parser.common.convert;

import com.lfsenior.sql.parser.common.ast.SQLStatement;
import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>AbstractReceiver</code></b>
 * <p/>
 * 指令接收者，真实执行转换动作的实体
 * <p/>
 * <b>Creation Time:</b> 2022/4/29 14:01.
 *
 * @author LFSenior
 */
@Slf4j
public abstract class AbstractReceiver implements Receiver {
    /*转换器实例*/
    Command command;

    protected AbstractReceiver() {
    }

    @Override
    public SQLStatement convert(Object statement) {
        /*执行转换器*/
        log.info("[Receiver]接收者执行指令动作开始>>>>>>>>>");
        SQLStatement result = doConvert(statement);
        log.info("[Receiver]接收者执行指令动作结束>>>>>>>>>");
        return result;
    }

    /**
     * 子类具体实现的接收者动作
     *
     * @param statement
     * @return
     */
    protected abstract SQLStatement doConvert(Object statement);

    @Override
    public Command getCommand() {
        return command;
    }

    @Override
    public void setCommand(Command command) {
        this.command = command;
    }
}
