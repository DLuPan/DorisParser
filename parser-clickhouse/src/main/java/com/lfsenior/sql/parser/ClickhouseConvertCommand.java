package com.lfsenior.sql.parser;

import com.lfsenior.sql.parser.common.convert.AbstractCommand;
import com.lfsenior.sql.parser.common.convert.Receiver;

/**
 * <b><code>ClickhouseConvertCommand</code></b>
 * <p/>
 * 转换指令
 * <p/>
 * <b>Creation Time:</b> 2022/4/29 14:33.
 *
 * @author LFSenior
 */
public class ClickhouseConvertCommand extends AbstractCommand {

    protected ClickhouseConvertCommand() {
        super(new ClickhouseConvertReceiver(), ":ClickhouseConvert");
    }

    @Override
    public void setReceiver(Receiver receiver) {

    }

    /**
     * 实例化一个可用对象
     *
     * @return
     */
    public static ClickhouseConvertCommand INSTANCE() {
        return new ClickhouseConvertCommand();
    }
}
