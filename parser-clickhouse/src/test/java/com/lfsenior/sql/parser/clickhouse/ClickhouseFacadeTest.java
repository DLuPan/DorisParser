package com.lfsenior.sql.parser.clickhouse;

import com.lfsenior.sql.parser.ClickhouseSqlParser;
import com.lfsenior.sql.parser.common.ast.SQLStatement;
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
    public static String alterTableSql = "ALTER TABLE test.ck_example ON CLUSTER cluster_frontend_crm_special MODIFY COLUMN seller_id String COMMENT '人员ID';";

    @Test
    public void alterTableModifyColumnTest() throws Exception {
        alterTableSql += alterTableSql;
        /*通过指令来运行*/
        ClickhouseSqlParser ckParser = new ClickhouseSqlParser();
        List<SQLStatement> sqlStatementList = ckParser.parserList(alterTableSql);
        System.out.println(sqlStatementList);
    }

    @Test
    public void alterTableByWrapperAdapterTest() {

    }
}
