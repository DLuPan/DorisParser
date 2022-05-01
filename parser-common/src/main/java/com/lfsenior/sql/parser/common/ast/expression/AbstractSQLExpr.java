package com.lfsenior.sql.parser.common.ast.expression;

import com.lfsenior.sql.parser.common.ast.AbstractSQLObject;
import com.lfsenior.sql.parser.common.ast.SQLExpr;
import com.lfsenior.sql.parser.common.ast.SQLObject;

import java.util.List;

/**
 * <b><code>AbstractSQLExpr</code></b>
 * <p/>
 * 通用封装SQLExpr
 * <p/>
 * <b>Creation Time:</b> 2022/4/28 17:13.
 *
 * @author LFSenior
 */
public abstract class AbstractSQLExpr extends AbstractSQLObject implements SQLExpr {
    public abstract SQLExpr clone();

    @Override
    public List<SQLObject> getChildren() {
        return null;
    }
}
