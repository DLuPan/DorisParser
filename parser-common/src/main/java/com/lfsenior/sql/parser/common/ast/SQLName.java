package com.lfsenior.sql.parser.common.ast;

/**
 * <b><code>SQLName</code></b>
 * <p/>
 * 名称类型，比如columnName\tableName等等
 * <p/>
 * <b>Creation Time:</b> 2022/4/28 17:09.
 *
 * @author LFSenior
 */
public interface SQLName extends SQLExpr {
    /**
     * 获取名称字符串
     *
     * @return
     */
    String getSimpleName();

    @Override
    SQLName clone();
}
