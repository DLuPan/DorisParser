package com.lfsenior.sql.parser.common.ast;

import com.lfsenior.sql.parser.common.type.DbType;

/**
 * <b><code>SQLObjectWithDbType</code></b>
 * <p/>
 * 具有获取引擎类型的能力
 * <p/>
 * <b>Creation Time:</b> 2022/4/27 15:09.
 *
 * @author LFSenior
 */
public interface SQLObjectWithDbType extends SQLObject{
    DbType getDbType();

    void setDbType(DbType dbType);
}
