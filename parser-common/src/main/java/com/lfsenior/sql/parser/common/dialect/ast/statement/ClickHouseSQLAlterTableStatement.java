package com.lfsenior.sql.parser.common.dialect.ast.statement;

import com.lfsenior.sql.parser.common.ast.statement.SQLAlterTableStatement;
import com.lfsenior.sql.parser.common.type.DbType;

/**
 * <b><code>ClickHouseSQLAlterTableStatement</code></b>
 * <p/>
 * CK定制的ALTERTable子句
 * <p/>
 * <b>Creation Time:</b> 2022/5/11 15:44.
 *
 * @author LFSenior
 */
public class ClickHouseSQLAlterTableStatement extends SQLAlterTableStatement {
    private ClickHouseSQLClusterClause clusterClause;

    public ClickHouseSQLAlterTableStatement() {
        super(DbType.Clickhouse);
    }

    public void setClusterClause(ClickHouseSQLClusterClause clusterClause) {
        if (clusterClause != null) {
            clusterClause.setParent(this);
        }
        this.clusterClause = clusterClause;
    }
}
