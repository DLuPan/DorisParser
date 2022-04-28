package com.lfsenior.sql.parser.common.visitor;

import com.lfsenior.sql.parser.common.ast.SQLIdentifierExpr;
import com.lfsenior.sql.parser.common.ast.SQLObject;

/**
 * <b><code>SQLASTListener</code></b>
 * <p/>
 * SQLAST监听器
 * <p/>
 * <b>Creation Time:</b> 2022/4/27 14:32.
 *
 * @author LFSenior
 */
public interface SQLASTListener {
    /// SQLObject监听
    default void postListener(SQLObject sqlObject) {
    }

    default void preListener(SQLObject sqlObject) {
    }

    /// SQLIdentifierExpr监听
    default void postListener(SQLIdentifierExpr sqlIdentifierExpr) {
    }

    default void preListener(SQLIdentifierExpr sqlIdentifierExpr) {
    }
}
