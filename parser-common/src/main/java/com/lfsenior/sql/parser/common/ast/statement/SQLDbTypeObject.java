package com.lfsenior.sql.parser.common.ast.statement;

import com.lfsenior.sql.parser.common.type.DbType;

/**
 * <b><code>SQLDbTypeObject</code></b>
 * <p/>
 * 标识需要提供DbType属性
 * <p/>
 * <b>Creation Time:</b> 2022/4/27 14:54.
 *
 * @author LFSenior
 */
public interface SQLDbTypeObject {
    DbType getDbType();
}
