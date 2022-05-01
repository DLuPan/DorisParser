package com.lfsenior.sql.parser.common.ast.statement;

import com.lfsenior.sql.parser.common.ast.AbstractSQLObject;

/**
 * <b><code>AbstractTableSource</code></b>
 * <p/>
 * 表定义
 * todo 待完成
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 10:45.
 *
 * @author LFSenior
 */
public abstract class AbstractTableSource extends AbstractSQLObject {
    protected String alias;

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public AbstractTableSource clone() {
        throw new UnsupportedOperationException();
    }
}
