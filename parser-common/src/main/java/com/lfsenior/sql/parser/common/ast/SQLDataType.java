package com.lfsenior.sql.parser.common.ast;

import com.lfsenior.sql.parser.common.type.DbType;

import java.util.List;

/**
 * <b><code>SQLDataType</code></b>
 * <p/>
 * SQL数据类型
 * <p/>
 * <b>Creation Time:</b> 2022/4/27 14:56.
 *
 * @author LFSenior
 */
public interface SQLDataType extends SQLObject{

    /**
     * 获取数据类型名称
     *
     * @return
     */
    String getName();

    /**
     * 设置数据类型名称
     *
     * @param name
     */
    void setName(String name);

    /**
     * 获取参数
     *
     * @return
     */
    List<SQLExpr> getArguments();

    /**
     *
     * @return
     */
    SQLDataType clone();

    void setDbType(DbType dbType);

    DbType getDbType();

    /**
     * 提供基础数据类型：可以扩展
     */
    interface Constants {
        String CHAR = "CHAR";
        String VARCHAR = "VARCHAR";
        String VARBINARY = "VARBINARY";
        String DATE = "DATE";
        String TIMESTAMP = "TIMESTAMP";
        String XML = "XML";

        String DECIMAL = "DECIMAL";
        String NUMBER = "NUMBER";
        String REAL = "REAL";
        String DOUBLE = "DOUBLE";

        String TINYINT = "TINYINT";
        String SMALLINT = "SMALLINT";
        String INT = "INT";
        String BIGINT = "BIGINT";
        String TEXT = "TEXT";
        String BYTE = "BYTE";
        String BOOLEAN = "BOOLEAN";

        String FLOAT = "FLOAT";
    }
}
