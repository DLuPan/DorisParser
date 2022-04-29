package com.lfsenior.sql.parser.common.convert;

import com.lfsenior.sql.parser.common.ast.SQLStatement;

/**
 * <b><code>Receiver</code></b>
 * <p/>
 * 指令处理者
 * <p/>
 * <b>Creation Time:</b> 2022/4/29 13:49.
 *
 * @author LFSenior
 */
public interface Receiver {
    /**
     * 获取指令
     *
     * @return
     */
    Command getCommand();

    /**
     * 设置指令
     *
     * @param command
     */
    void setCommand(Command command);


    /**
     * 用于将模型转换为通用模型（指令实现动作）
     *
     * @param statement 目标AST模型
     * @return 通用AST模型
     */
    SQLStatement convert(Object statement);


}
