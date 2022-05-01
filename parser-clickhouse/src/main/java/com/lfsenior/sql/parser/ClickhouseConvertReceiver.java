package com.lfsenior.sql.parser;

import com.lfsenior.sql.parser.clickhouse.adapter.DefaultWrapperAdapterLinked;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.common.ast.SQLStatement;
import com.lfsenior.sql.parser.common.convert.AbstractReceiver;
import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>ClickhouseConvertReceiver</code></b>
 * <p/>
 * 转换指令实现
 * <p/>
 * <b>Creation Time:</b> 2022/4/29 14:33.
 *
 * @author LFSenior
 */
@Slf4j
public class ClickhouseConvertReceiver extends AbstractReceiver {
    protected ClickhouseConvertReceiver() {
    }

    @Override
    protected SQLStatement doConvert(Object statement) {
        log.info("[CK]转换AST模型开始>>>>>>>>");
        SQLStatement sqlStatement = null;
        if (statement instanceof ClickHouseParser.QueryStmtContext) {
            ClickHouseParser.QueryStmtContext queryStmtContext = (ClickHouseParser.QueryStmtContext) statement;
            sqlStatement = (SQLStatement) DefaultWrapperAdapterLinked.execute(queryStmtContext);
        } else {
            /*非法参数异常*/
            throw new IllegalArgumentException("CK仅支持ClickHouseParser.QueryStmtContext转换");
        }
        log.info("[CK]转换AST模型结束>>>>>>>>");
        return sqlStatement;
    }

}
