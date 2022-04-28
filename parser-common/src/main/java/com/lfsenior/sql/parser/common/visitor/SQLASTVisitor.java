package com.lfsenior.sql.parser.common.visitor;

import com.lfsenior.sql.parser.common.ast.SQLIdentifierExpr;
import com.lfsenior.sql.parser.common.ast.SQLObject;

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
    default boolean visit(SQLObject sqlObject) {
        return true;
    }

    default boolean endVisit(SQLObject sqlObject) {
        return true;
    }

    /// SQLIdentifierExpr访问者
    default boolean visit(SQLIdentifierExpr sqlIdentifierExpr) {
        return true;
    }

    default void endVisit(SQLIdentifierExpr sqlIdentifierExpr) {
    }

}
