package com.lfsenior.sql.parser;

import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseErrorListener;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseLexer;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.common.ast.SQLStatement;
import com.lfsenior.sql.parser.common.convert.Command;
import com.lfsenior.sql.parser.common.parser.spi.AbstractSqlParser;
import com.lfsenior.sql.parser.common.type.DbType;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * <b><code>ClickhouseSqlParser</code></b>
 * <p/>
 * CK SQL解析实现
 * <p/>
 * <b>Creation Time:</b> 2022/4/29 14:07.
 *
 * @author LFSenior
 */
@Slf4j
public class ClickhouseSqlParser extends AbstractSqlParser {

    public ClickhouseSqlParser() {
        super(DbType.Clickhouse);

    }

    @Override
    protected List<SQLStatement> doParser(String sql, int maxAstNum) {
        /*进行SQL解析获取顶级Statement*/
        ClickHouseLexer lexer = new ClickHouseLexer(CharStreams.fromString(sql));
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        ClickHouseParser parser = new ClickHouseParser(commonTokenStream);
        parser.addErrorListener(ClickHouseErrorListener.INSTANCE);
        List<SQLStatement> statementList = new ArrayList<>();
        int idx = 1;
        log.info("[CK]解析基础数据初始化完成");
        do {
            long start = System.currentTimeMillis();
            ClickHouseParser.QueryStmtContext queryStmt = parser.queryStmt();
            Object statement = ClickhouseConvertCommand.INSTANCE().action(queryStmt);
            statementList.add((SQLStatement) statement);
            log.info("[CK]完成【{}】次解析，耗时【{}ms】", idx, System.currentTimeMillis() - start);
            ++idx;
        } while (commonTokenStream.get(commonTokenStream.index()).getType() != Token.EOF && idx <= maxAstNum);
        return statementList;
    }


}
