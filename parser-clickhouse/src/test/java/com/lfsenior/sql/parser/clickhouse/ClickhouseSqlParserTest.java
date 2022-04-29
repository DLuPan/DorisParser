package com.lfsenior.sql.parser.clickhouse;

import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseErrorListener;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseLexer;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserBaseVisitor;
import lombok.Data;
import org.antlr.v4.runtime.*;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DorisParser
 * @package: com.lfsenior.sql.parser.clickhouse
 * @description: ck解析测试
 * @author: DingLuPan
 * @create: 2021/11/1 15:20
 **/
public class ClickhouseSqlParserTest {
    @Test
    public void createTableTest() {
        String sql = "/**************************************************维度表**************************************************/\n" +
                "CREATE TABLE dict.dim_department_cur_source ON CLUSTER cluster_frontend_crm_special(serial_id Int32 COMMENT '自增ID',department_id Int32 COMMENT 'id',department_name String COMMENT '部门名称',charge_id Int64 COMMENT '部门负责人id',charge_name String COMMENT '部门负责人',duty_id Int32 COMMENT '负责人职位id',duty_name String COMMENT '负责人职位',charge_hierarchy String COMMENT '负责人层级',part_time_flag Int32 COMMENT '是否兼职，数据字典：hr_common_yes_no',part_time_flag_id String COMMENT '是否兼职，数据字典：hr_common_yes_no',department_duty String COMMENT '部门职责',department_position String COMMENT '部门定位',parent_id Int32 COMMENT '上级部门id',parent_name String COMMENT '上级部门名称',hierarchy String COMMENT '组织级称 10-公司 20-本部 30-中心 40-部门 50-处 60-科 70-室 80-组 90-班',hierarchy_code Int32 COMMENT '组织层级',hierarchy_id String COMMENT '部门级称，数据字典：hr_department_hierarchy',department_code String COMMENT '部门编码',department_route String COMMENT '部门全路径',department_id_route String COMMENT '组织ID全路径',virtual_department Int32 COMMENT '是否虚拟部门',instructions String COMMENT '说明',code String COMMENT '组织类型（树结构字段）',left_value Int32 COMMENT '左节点（树结构字段）',right_value Int32 COMMENT '右节点（树结构字段）',display_index Int32 COMMENT '排序',trace_id String COMMENT '路由ID',enabled_flag Int32 COMMENT '是否有效[1:有效,0:无效]',created_by String COMMENT '创建人',creation_date String COMMENT '创建时间',updated_by String COMMENT '修改人',updation_date String COMMENT '修改时间',planning_staff_num Int32 COMMENT '',org_code String COMMENT '部门代码',responsible_department_id Int32 COMMENT '关联的部门ID(department_id 重命名)',responsible_department_name String COMMENT '关联的部门名称(department_name 重命名)',network_id Int32 COMMENT '关联的点部ID',network_name String COMMENT '关联的点部名称',site_id Int64 COMMENT 'tms传过来的网点ID',site_name String COMMENT 'tms传过来的网点名称',type String COMMENT '组织类型，数据字典：hr_department_type',department_type_id String COMMENT '部门类型，数据字典：hr_department_type',service_organization String COMMENT '服务组织，数据字典：hr_service_organization',service_org_id String COMMENT '服务部门，数据字典：hr_service_organization',cost_area Int32 COMMENT '成本区域 数据字典：hr_cost_area',cost_area_id String COMMENT '成本区域, 数据字典：hr_cost_area',start_date String COMMENT '有效开始时间',end_date String COMMENT '有效截止时间',etl_creation_date String COMMENT '插入数据数据库自动处理，无需程序干预',etl_updation_date String COMMENT '修改数据时，数据库自动处理更新时间',level_num Int32 COMMENT '部门层级',is_leaf Int32 COMMENT '是否叶子节点[1:是,0:否]',whole_id String COMMENT '部门id全路径',whole_name String COMMENT '部门名称全路径',lv1_id Int32 COMMENT '一级部门id',lv1_name String COMMENT '一级部门名称',lv2_id Int32 COMMENT '二级部门id',lv2_name String COMMENT '二级部门名称',lv3_id Int32 COMMENT '三级部门id',lv3_name String COMMENT '三级部门名称',lv4_id Int32 COMMENT '四级部门id',lv4_name String COMMENT '四级部门名称',lv4_charge_id Int32 COMMENT '四级部门负责人id',lv4_charge_name String COMMENT '四级部门负责人',lv5_id Int32 COMMENT '五级部门id',lv5_name String COMMENT '五级部门名称',lv5_charge_id Int32 COMMENT '五级部门负责人id',lv5_charge_name String COMMENT '五级部门负责人',lv6_id Int32 COMMENT '六级部门id',lv6_name String COMMENT '六级部门名称',lv6_charge_id Int32 COMMENT '六级部门负责人id',lv6_charge_name String COMMENT '六级部门负责人',lv7_id Int32 COMMENT '七级部门id',lv7_name String COMMENT '七级部门名称',lv7_charge_id Int32 COMMENT '七级部门负责人id',lv7_charge_name String COMMENT '七级部门负责人',lv8_id Int32 COMMENT '八级部门id',lv8_name String COMMENT '八级部门名称',lv8_charge_id Int32 COMMENT '八级部门负责人id',lv8_charge_name String COMMENT '八级部门负责人',lv9_id Int32 COMMENT '九级部门id',lv9_name String COMMENT '九级部门名称',lv9_charge_id Int32 COMMENT '九级部门负责人id',lv9_charge_name String COMMENT '九级部门负责人',biz_finance_dept_id Int32 COMMENT '财务核算部门id',rec_source String COMMENT '记录数据源',etl_created_time String COMMENT 'etl数据加载时间',etl_modified_time String COMMENT 'etl数据修改时间') ENGINE=ReplicatedMergeTree('/clickhouse/tables/cluster_frontend_crm_special/{shard}/dwd.dim_department_cur', '{replica}') ORDER BY department_id SETTINGS index_granularity=8192;\n" +
                "/**************************************************维度表**************************************************/";
        sql += sql;
        ClickHouseLexer lexer = new ClickHouseLexer(CharStreams.fromString(sql));
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        ClickHouseParser parser = new ClickHouseParser(commonTokenStream);
        parser.addErrorListener(ClickHouseErrorListener.INSTANCE);
        ClickHouseParser.QueryStmtContext queryStmtContext = parser.queryStmt();
        QueryStmtVisitor visitor = new QueryStmtVisitor().init();
        queryStmtContext.accept(visitor);
        System.out.println(visitor.getParserVo());
    }

    @Test
    public void alterTableAddColumnTest() {
        String sql = "ALTER TABLE ck_example ON CLUSTER cluster_frontend_crm_special ADD COLUMN  IF NOT EXISTS  age Float64 COMMENT '年龄' AFTER votes;";
        ClickHouseLexer lexer = new ClickHouseLexer(CharStreams.fromString(sql));
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        ClickHouseParser parser = new ClickHouseParser(commonTokenStream);
        parser.addErrorListener(ClickHouseErrorListener.INSTANCE);
        ClickHouseParser.QueryStmtContext queryStmtContext = parser.queryStmt();
        QueryStmtVisitor visitor = new QueryStmtVisitor().init();
        queryStmtContext.accept(visitor);
        System.out.println(visitor.getParserVo());
    }

    @Test
    public void alterTableModifyColumnTest() {
        String sql = "ALTER TABLE ck_example ON CLUSTER cluster_frontend_crm_special MODIFY COLUMN seller_id String COMMENT '人员ID';";
        ClickHouseLexer lexer = new ClickHouseLexer(CharStreams.fromString(sql));
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        ClickHouseParser parser = new ClickHouseParser(commonTokenStream);
        parser.addErrorListener(ClickHouseErrorListener.INSTANCE);
        ClickHouseParser.QueryStmtContext queryStmtContext = parser.queryStmt();
        QueryStmtVisitor visitor = new QueryStmtVisitor().init();
        queryStmtContext.accept(visitor);
        System.out.println(visitor.getParserVo());
    }


    /**
     * 读取转换器
     */
    public static class QueryStmtVisitor extends ClickHouseParserBaseVisitor<MetaDdlSqlParserVo> {
        private MetaDdlSqlParserVo parserVo;
        private List<MetaDdlColumns> columnsList;
        private ColumnDefVisitor columnDefVisitor;

        public QueryStmtVisitor init() {
            parserVo = new MetaDdlSqlParserVo();
            columnsList = new ArrayList<>();
            columnDefVisitor = new ColumnDefVisitor();
            return this;
        }

        public MetaDdlSqlParserVo getParserVo() {
            parserVo.setColumnDefList(columnsList);
            return parserVo;
        }

        @Override
        public MetaDdlSqlParserVo visitTableCommentClause(ClickHouseParser.TableCommentClauseContext ctx) {
            parserVo.setTableDesc(ctx.getStop().getText());
            parserVo.setTableChinese(ctx.getStop().getText());
            return super.visitTableCommentClause(ctx);
        }

        @Override
        public MetaDdlSqlParserVo visitDatabaseIdentifier(ClickHouseParser.DatabaseIdentifierContext ctx) {
            parserVo.setDbName(ctx.getText());
            return super.visitDatabaseIdentifier(ctx);
        }

        @Override
        public MetaDdlSqlParserVo visitTableIdentifier(ClickHouseParser.TableIdentifierContext ctx) {
            if (StringUtils.isEmpty(parserVo.getTableName())) {
                parserVo.setTableName(ctx.getStop().getText());
            } else {
                parserVo.setNewTableName(ctx.getStop().getText());
            }
            return super.visitTableIdentifier(ctx);
        }

        @Override
        public MetaDdlSqlParserVo visitAlterTableClauseModify(ClickHouseParser.AlterTableClauseModifyContext ctx) {
            return super.visitAlterTableClauseModify(ctx);
        }

        @Override
        public MetaDdlSqlParserVo visitTableColumnDfnt(ClickHouseParser.TableColumnDfntContext ctx) {
            ctx.accept(columnDefVisitor.init());
            MetaDdlColumns column = columnDefVisitor.getColumn();
            columnsList.add(column);
            return super.visitTableColumnDfnt(ctx);
        }


        @Override
        public MetaDdlSqlParserVo visitAddAfterColumnName(ClickHouseParser.AddAfterColumnNameContext ctx) {
            MetaDdlColumns column = columnsList.get(columnsList.size() - 1);
            return super.visitAddAfterColumnName(ctx);
        }
    }


    /**
     * 解析字段用的visitor
     */
    public static class ColumnDefVisitor extends ClickHouseParserBaseVisitor<MetaDdlColumns> {
        private MetaDdlColumns column;

        public ColumnDefVisitor init() {
            column = new MetaDdlColumns();
            return this;
        }

        public MetaDdlColumns getColumn() {
            return column;
        }

        @Override
        public MetaDdlColumns visitColumnCommentClause(ClickHouseParser.ColumnCommentClauseContext ctx) {
            String columnChinese = ctx.getStop().getText();
            if (StringUtils.isNotEmpty(columnChinese)) {
                if (columnChinese.startsWith("'") || columnChinese.startsWith("\"")) {
                    columnChinese = columnChinese.substring(1);
                }
                if (columnChinese.endsWith("'") || columnChinese.endsWith("\"")) {
                    columnChinese = columnChinese.substring(0, columnChinese.length() - 1);
                }
                column.setColumnChinese(columnChinese);
            }
            return super.visitColumnCommentClause(ctx);
        }

        @Override
        public MetaDdlColumns visitNestedIdentifier(ClickHouseParser.NestedIdentifierContext ctx) {
            column.setColumnName(removeInvalidChar(ctx.getStop().getText()));
            return super.visitNestedIdentifier(ctx);
        }

        @Override
        public MetaDdlColumns visitColumnTypeExprSimple(ClickHouseParser.ColumnTypeExprSimpleContext ctx) {
            column.setType(ctx.getStart().getText());
            return super.visitColumnTypeExprSimple(ctx);
        }

        @Override
        public MetaDdlColumns visitColumnTypeExprComplex(ClickHouseParser.ColumnTypeExprComplexContext ctx) {
            column.setType(ctx.getStart().getText());
            return super.visitColumnTypeExprComplex(ctx);
        }

        @Override
        public MetaDdlColumns visitColumnTypeExprEnum(ClickHouseParser.ColumnTypeExprEnumContext ctx) {
            column.setType(ctx.getStart().getText());
            return super.visitColumnTypeExprEnum(ctx);
        }

        @Override
        public MetaDdlColumns visitColumnTypeExprNested(ClickHouseParser.ColumnTypeExprNestedContext ctx) {
            column.setType(ctx.getStart().getText());
            return super.visitColumnTypeExprNested(ctx);
        }

        @Override
        public MetaDdlColumns visitColumnTypeExprParam(ClickHouseParser.ColumnTypeExprParamContext ctx) {
            column.setType(ctx.getStart().getText());
            return super.visitColumnTypeExprParam(ctx);
        }
    }

    public static String removeInvalidChar(String origin) {
        if (StringUtils.isEmpty(origin)) {
            return origin;
        }
        return origin.replaceAll("`", "");
    }

    @Data
    public static class MetaDdlSqlParserVo {
        /***字段定义列表*/
        private List<MetaDdlColumns> columnDefList;
        /***表名*/
        private String tableName;
        /***新表名，仅修改表名可用*/
        private String newTableName;
        /***表中文名*/
        private String tableChinese;
        /***表描述*/
        private String tableDesc;
        /***库名*/
        private String dbName;

    }

    @Data
    public static class MetaDdlColumns {

        /***字段名*/
        private String columnName;

        /***原始字段名*/
        private String originColumnName;

        /***字段名-中文*/
        private String columnChinese;

        /***字段类型*/
        private String type;

        /***字段长度*/
        private String length;

    }


}
