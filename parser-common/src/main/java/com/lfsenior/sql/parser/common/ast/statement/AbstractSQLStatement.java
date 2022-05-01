package com.lfsenior.sql.parser.common.ast.statement;

import com.lfsenior.sql.parser.common.ast.AbstractSQLObject;
import com.lfsenior.sql.parser.common.ast.SQLObject;
import com.lfsenior.sql.parser.common.ast.SQLStatement;
import com.lfsenior.sql.parser.common.type.DbType;
import com.lfsenior.sql.parser.common.visitor.SQLASTVisitor;
import com.lfsenior.sql.parser.common.visitor.VisitorFeature;

import java.util.List;

/**
 * <b><code>AbstractSQLStatement</code></b>
 * <p/>
 * 通过实现
 * todo 待完成
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 10:37.
 *
 * @author LFSenior
 */
public abstract class AbstractSQLStatement extends AbstractSQLObject implements SQLStatement {
    protected DbType dbType;

    public AbstractSQLStatement() {

    }

    public AbstractSQLStatement(DbType dbType) {
        this.dbType = dbType;
    }

    @Override
    protected void accept0(SQLASTVisitor visitor) {
        throw new UnsupportedOperationException(this.getClass().getName());
    }

    @Override
    public DbType getDbType() {
        return dbType;
    }

    @Override
    public List<SQLObject> getChildren() {
        throw new UnsupportedOperationException(this.getClass().getName());
    }

    @Override
    public String toString(VisitorFeature... features) {
        // todo
        return null;
    }

    @Override
    public String toLowerCaseString() {
        // todo
        return null;
    }

    public SQLStatement clone() {
        throw new UnsupportedOperationException(this.getClass().getName());
    }
}
