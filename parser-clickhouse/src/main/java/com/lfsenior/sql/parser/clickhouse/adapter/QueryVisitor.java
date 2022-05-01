package com.lfsenior.sql.parser.clickhouse.adapter;

import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserBaseVisitor;
import com.lfsenior.sql.parser.common.ast.SQLStatement;
import org.antlr.v4.runtime.tree.RuleNode;

/**
 * <b><code>QueryVisitor</code></b>
 * <p/>
 * Query节点访问器
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 10:23.
 *
 * @author LFSenior
 */
public class QueryVisitor extends ClickHouseParserBaseVisitor<SQLStatement> {
    @Override
    public SQLStatement visitChildren(RuleNode node) {
        SQLStatement sqlStatement = null;
        /*注意了，这个主要用于识别子句的*/
        /*
         * 开发计划：
         * 5.1 完成Alter table ADD .....
         * */
        for (int i = 0; i < node.getChildCount(); i++) {
            Object sqlNode = DefaultWrapperAdapterLinked.execute(node.getChild(i));
            if (sqlNode instanceof SQLStatement) {
                sqlStatement = (SQLStatement) sqlNode;
                break;
            }
        }
        return sqlStatement;
    }
}
