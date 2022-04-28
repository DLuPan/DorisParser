package com.lfsenior.sql.parser.common.ast;

import com.lfsenior.sql.parser.common.type.DbType;
import com.lfsenior.sql.parser.common.visitor.SQLASTVisitor;

/**
 * <b><code>SQLColumnDefinition</code></b>
 * <p/>
 * SQL字段元素 eg:name varchar(50) comment '姓名';
 * <p/>
 * <b>Creation Time:</b> 2022/4/27 14:52.
 *
 * @author LFSenior
 */
public class SQLColumnDefinition extends AbstractSQLObject implements SQLTableElement, SQLObjectWithDataType, SQLObjectWithDbType {
    /*sql字段的基本构成*/
    /*引擎类型*/
    protected DbType dbType;

    /*字段名称*/
    protected SQLName name;

    /*字段数据类型*/
    protected SQLDataType dataType;


    @Override
    protected void accept0(SQLASTVisitor visitor) {

    }

    @Override
    public SQLColumnDefinition clone() {
        return null;
    }

    @Override
    public SQLDataType getDataType() {
        return dataType;
    }

    @Override
    public void setDataType(SQLDataType dataType) {
        this.dataType = dataType;
    }

    @Override
    public DbType getDbType() {
        return dbType;
    }

    @Override
    public void setDbType(DbType dbType) {
        this.dbType = dbType;
    }
}
