### 1、parser-dorse版本对照

| parser-dorse版本 | doris版本      | 备注 |
| ---------------- | -------------- | ---- |
| master           | 0.14.0-release |      |



### 2、单独编译

```shell
mvn clean package -Dmvn.skip.test=true
```



### 3、使用

编译后上传到私服就可以通过mvn来引用了

```xml
<dependency>
    <groupId>com.lfsenior.sql.parser</groupId>
    <artifactId>parser-doris</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>

<dependency>
    <groupId>net.sourceforge.czt.dev</groupId>
    <artifactId>java-cup</artifactId>
    <version>0.11-a-czt02-cdh</version>
</dependency>

<dependency>
    <groupId>net.sourceforge.czt.dev</groupId>
    <artifactId>java-cup-runtime</artifactId>
    <version>0.11-a-czt01-cdh</version>
</dependency>

<dependency>
    <groupId>com.google.guava</groupId>
    <artifactId>guava</artifactId>
    <version>29.0-jre</version>
</dependency>
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.6</version>
</dependency>

<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.16</version>
</dependency>
```

demo

```java
package com.lfsenior.parser;

import com.lfsenior.sql.parser.doris.analysis.SqlParser;
import com.lfsenior.sql.parser.doris.analysis.SqlScanner;
import com.lfsenior.sql.parser.doris.analysis.StatementBase;
import com.lfsenior.sql.parser.doris.common.util.SqlParserUtils;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

/**
 * @program: Antlr4ForClickHouse
 * @package: com.lfsenior.parser
 * @description:
 * @author: DingLuPan
 * @create: 2021/11/1 16:42
 **/
public class DorisSqlParser {
    @Test
    public void createTableTest() throws Exception {
        String sql = "CREATE TABLE `doris_example` ( \n" +
                "`project_id` bigint  DEFAULT NULL COMMENT '销售项目id', \n" +
                "`project_code` string  DEFAULT NULL COMMENT '销售项目编码', \n" +
                "`project_way` int  DEFAULT NULL COMMENT '项目方式[crm_fresh_project_way](10按寄件公司运作，20按付款公司运作，30按寄件和付款公司运作)', \n" +
                "`project_status` int  DEFAULT NULL COMMENT '项目状态 [crm_market_project_status] 10-待审核,20-审核中,30-被驳回,40-已生效,50-已放弃,60-已结束]', \n" +
                "`etl_date` datetime  DEFAULT NULL COMMENT '跑批时间', \n" +
                "`project_type` int sum DEFAULT NULL COMMENT '项目类型：10生鲜项目，20展会项目，30服装城项目，40其他', \n" +
                "`main_responsible_person_id` bigint sum DEFAULT NULL COMMENT '总负责人id', \n" +
                "`project_type_detail` int max DEFAULT NULL COMMENT '项目细项，根据项目类型联动，crm_market_project_detail_fresh，crm_market_project_detail_exhibition，...', \n" +
                "`customer_short_name` string max DEFAULT NULL COMMENT '客户简称', \n" +
                "`customer_id` bigint min DEFAULT NULL COMMENT '客户ID', \n" +
                "`customer_code` string max DEFAULT NULL COMMENT '客户编码', \n" +
                "`market_id` bigint sum DEFAULT NULL COMMENT '销售经理id', \n" +
                "`market_name` string max DEFAULT NULL COMMENT '销售经理', \n" +
                "`assistant_id` bigint sum DEFAULT NULL COMMENT '销售助理ID', \n" +
                "`assistant_name` string min DEFAULT NULL COMMENT '销售助理', \n" +
                "`calculation_id` bigint sum DEFAULT NULL COMMENT '销售总监id', \n" +
                "`calculation_name` string max DEFAULT NULL COMMENT '销售总监', \n" +
                "`senior_manager_id` bigint max DEFAULT NULL COMMENT '销售高监id', \n" +
                "`senior_manager_name` string replace DEFAULT NULL COMMENT '销售高监', \n" +
                "`target_amount` decimal(13,2) sum DEFAULT NULL COMMENT '目标额度', \n" +
                "`create_time` datetime max NOT NULL COMMENT '创建时间', \n" +
                "`_version` bigint replace DEFAULT NULL COMMENT '版本号' \n" +
                ")  \n" +
                "AGGREGATE KEY(project_id,project_code,project_way,project_status,etl_date) \n" +
                "COMMENT \"doris测试复合分区\" \n" +
                "PARTITION BY RANGE (etl_date) \n" +
                "(  \n" +
                "PARTITION P1 VALUES [('2021-08-07 00:00:00'), ('2021-08-15 00:00:00')), \n" +
                "PARTITION P2 VALUES [('2021-08-16 00:00:00'), ('2021-08-31 00:00:00')) \n" +
                ")  \n" +
                "DISTRIBUTED BY HASH(project_id,project_code) BUCKETS 3 \n" +
                "rollup (\n" +
                " r1(project_code,project_id,project_type_detail)\n" +
                " ) \n" +
                "PROPERTIES ( \n" +
                "\"replication_num\" = \"2\",\n" +
                "\"dynamic_partition.time_unit\" = \"DAY\",\n" +
                "\"dynamic_partition.buckets\" = \"3\",\n" +
                "\"dynamic_partition.end\" = \"2\",\n" +
                "\"dynamic_partition.prefix\" = \"P\" \n" +
                ")  \n" +
                ";\n" +
                "\n" +
                "\n";
        SqlScanner sqlScanner = new SqlScanner(new StringReader(sql), 0l);
        SqlParser sqlParser = new SqlParser(sqlScanner);
        List<StatementBase> multiStmts = SqlParserUtils.getMultiStmts(sqlParser);
        System.out.println(multiStmts.toString());
    }

    @Test
    public void alterTableAddColumnTest() throws Exception {
        String sql = "ALTER TABLE doris_example ADD COLUMN (user_name  varchar(400) NULL COMMENT \"用户名称\")";
        SqlScanner sqlScanner = new SqlScanner(new StringReader(sql), 0L);
        SqlParser sqlParser = new SqlParser(sqlScanner);
        List<StatementBase> multiStmts = SqlParserUtils.getMultiStmts(sqlParser);
        System.out.println(multiStmts.toString());
    }

    @Test
    public void alterTableModifyColumnTest() throws Exception {
        String sql = "ALTER TABLE doris_example MODIFY COLUMN supplier_name varchar(500) NULL COMMENT \"供应商名称\"";
        SqlScanner sqlScanner = new SqlScanner(new StringReader(sql), 0l);
        SqlParser sqlParser = new SqlParser(sqlScanner);
        List<StatementBase> multiStmts = SqlParserUtils.getMultiStmts(sqlParser);
        System.out.println(multiStmts.toString());
    }

    @Test
    public void alterTableRenameTest() throws Exception {
        String sql = "alter table doris_example rename doris_new_example;";
        SqlScanner sqlScanner = new SqlScanner(new StringReader(sql), 0l);
        SqlParser sqlParser = new SqlParser(sqlScanner);
        List<StatementBase> multiStmts = SqlParserUtils.getMultiStmts(sqlParser);
        System.out.println(multiStmts.toString());
    }
}

```



4、相关

[实现](./doc/1、accomplish.md)