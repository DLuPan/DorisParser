package com.lfsenior.sql.parser.common.visitor;

import com.lfsenior.sql.parser.common.ast.SQLIdentifierExpr;
import com.lfsenior.sql.parser.common.ast.SQLObject;
import com.lfsenior.sql.parser.common.ast.statement.SQLAlterTableAddColumn;
import com.lfsenior.sql.parser.common.ast.statement.SQLTableSource;

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
    default void postListener(SQLObject sql) {
    }

    default void preListener(SQLObject sql) {
    }

    /// SQLIdentifierExpr监听
    default void postListener(SQLIdentifierExpr sql) {
    }

    default void preListener(SQLIdentifierExpr sql) {
    }

    /// SQLExprTableSource
    default void postListener(SQLTableSource sql) {
    }

    default void preListener(SQLTableSource sql) {
    }

    /// SQLAlterTableAddColumn
    default void postListener(SQLAlterTableAddColumn sql) {
    }

    default void preListener(SQLAlterTableAddColumn sql) {
    }
}
