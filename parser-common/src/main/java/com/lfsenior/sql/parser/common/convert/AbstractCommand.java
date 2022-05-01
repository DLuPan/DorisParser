package com.lfsenior.sql.parser.common.convert;

import com.lfsenior.sql.parser.common.ast.SQLStatement;
import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>AbstractCommand</code></b>
 * <p/>
 * 指令的通用封装
 * <p/>
 * <b>Creation Time:</b> 2022/4/29 14:26.
 *
 * @author LFSenior
 */
@Slf4j
public abstract class AbstractCommand implements Command {

    /*指令接收者*/
    private Receiver receiver;
    /**/
    private String commandId = "Convert";

    protected AbstractCommand(Receiver receiver, String suffix) {
        this.receiver = receiver;
        this.commandId += suffix;
        receiver.setCommand(this);
    }

    @Override
    public Object action(Object payload) {
        log.info("[{}]指令启动>>>>>>>>>", commandId);
        SQLStatement result = receiver.convert(payload);
        log.info("[{}]指令结束>>>>>>>>>", commandId);
        return result;
    }

    @Override
    public Receiver getReceiver() {
        return receiver;
    }
}
