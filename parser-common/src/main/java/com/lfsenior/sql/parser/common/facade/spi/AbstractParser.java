package com.lfsenior.sql.parser.common.facade.spi;

import com.lfsenior.sql.parser.common.ast.SQLStatement;
import com.lfsenior.sql.parser.common.facade.Parser;
import com.lfsenior.sql.parser.common.type.DbType;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * <b><code>AbstractParser</code></b>
 * <p/>
 * 解析公共实现
 * <p/>
 * <b>Creation Time:</b> 2022/4/27 10:17.
 *
 * @author LFSenior
 */
@Slf4j
public abstract class AbstractParser implements Parser {
    /*单次解析的最大AST数量*/
    private static final int MAX_AST_NUM = 8;
    /*引擎类型*/
    private DbType dbType;

    protected AbstractParser(DbType dbType) {
        this.dbType = dbType;
    }

    /**
     * sql解析入口，默认生成一颗AST树
     *
     * @param sql 输入的SQL字符串
     * @return
     */
    public SQLStatement parser(String sql) {
        log.info("[parser] 解析SQL开始>>>>>>>>>");
        SQLStatement sqlStatement = null;
        long start = System.currentTimeMillis();
        List<SQLStatement> sqlStatements = doParser(sql, 1);
        if (CollectionUtils.isNotEmpty(sqlStatements)) {
            return sqlStatements.get(0);
        }
        log.info("[parser] 解析SQL结束,耗时:[{}ms]<<<<<<<<<", System.currentTimeMillis() - start);
        return null;
    }

    public List<SQLStatement> parserList(String sql) {
        log.info("[parser] 解析SQL开始>>>>>>>>>");
        List<SQLStatement> sqlStatementList = null;
        long start = System.currentTimeMillis();
        sqlStatementList = doParser(sql, MAX_AST_NUM);
        log.info("[parser] 解析SQL结束,耗时:[{}ms]<<<<<<<<<", System.currentTimeMillis() - start);
        return sqlStatementList;
    }

    /**
     * sql解析方法，用于生成AST树
     *
     * @param sql       输入的SQL
     * @param maxAstNum 输出的最大AST数量
     * @return
     */
    protected abstract List<SQLStatement> doParser(String sql, int maxAstNum);

    public DbType getDbType() {
        return dbType;
    }
}
