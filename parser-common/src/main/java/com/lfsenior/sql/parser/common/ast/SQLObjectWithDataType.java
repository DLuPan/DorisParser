package com.lfsenior.sql.parser.common.ast;

/**
 * <b><code>SQLObjectWithSQLDataType</code></b>
 * <p/>
 * 具备获取SQL数据类型的能力
 * <p/>
 * <b>Creation Time:</b> 2022/4/27 15:10.
 *
 * @author LFSenior
 */
public interface SQLObjectWithDataType extends SQLObject {
    SQLDataType getDataType();

    void setDataType(SQLDataType dataType);
}
