package com.lfsenior.sql.parser.clickhouse;

import com.lfsenior.sql.parser.ClickhouseSqlParser;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseErrorListener;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseLexer;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.common.ast.SQLStatement;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.util.List;

/**
 * <b><code>ClickhouseFacadeTest</code></b>
 * <p/>
 * CK解析简单调用测试
 * <p/>
 * <b>Creation Time:</b> 2022/4/29 17:00.
 *
 * @author LFSenior
 */
public class ClickhouseFacadeTest {
    @Test
    public void alterTableModifyColumnTest() throws Exception {
        String sql = "ALTER TABLE ck_example ON CLUSTER cluster_frontend_crm_special MODIFY COLUMN seller_id String COMMENT '人员ID';";
        sql += sql;
        /*通过指令来运行*/
        ClickhouseSqlParser ckParser = new ClickhouseSqlParser();
        List<SQLStatement> sqlStatementList = ckParser.parserList(sql);
        System.out.println(sqlStatementList);
    }
}
