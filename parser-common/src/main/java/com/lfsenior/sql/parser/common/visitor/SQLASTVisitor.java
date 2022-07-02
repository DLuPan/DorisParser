package com.lfsenior.sql.parser.common.visitor;

import com.lfsenior.sql.parser.common.ast.SQLIdentifierExpr;
import com.lfsenior.sql.parser.common.ast.SQLObject;
import com.lfsenior.sql.parser.common.ast.statement.SQLAlterTableAddColumn;
import com.lfsenior.sql.parser.common.ast.statement.SQLTableSource;

/**
 * <b><code>SQLASTVisitor</code></b>
 * <p/>
 * 访问者顶级接口
 * <p/>
 * <b>Creation Time:</b> 2022/4/27 10:33.
 *
 * @author LFSenior
 */
public interface SQLASTVisitor extends SQLASTListener {
    /// SQLObject访问者
    default boolean visit(SQLObject sql) {
        return true;
    }

    default boolean endVisit(SQLObject sql) {
        return true;
    }

    /// SQLIdentifierExpr访问者
    default boolean visit(SQLIdentifierExpr sql) {
        return true;
    }

    default void endVisit(SQLIdentifierExpr sql) {
    }


    /// SQLTableSource
    default boolean visit(SQLTableSource sql) {
        return true;
    }

    default void endVisit(SQLTableSource sql) {
    }

    /// SQLAlterTableAddColumn
    default boolean visit(SQLAlterTableAddColumn sql) {
        return true;
    }

    default void endVisit(SQLAlterTableAddColumn sql) {
    }

}