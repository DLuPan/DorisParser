package com.lfsenior.sql.parser.common.dialect.ast.statement;

import com.lfsenior.sql.parser.common.ast.AbstractSQLObject;
import com.lfsenior.sql.parser.common.ast.SQLExpr;
import com.lfsenior.sql.parser.common.ast.statement.SQLAlterTableItem;
import com.lfsenior.sql.parser.common.visitor.SQLASTVisitor;

/**
 * <b><code>SQLClusterClauseStatement</code></b>
 * <p/>
 * CK子句
 * ON CLUSTER (identifier | STRING_LITERAL)
 * <p/>
 * <b>Creation Time:</b> 2022/5/11 15:43.
 *
 * @author LFSenior
 */
public class ClickHouseSQLClusterClause extends AbstractSQLObject {
    /*子句定义的字符串*/
    protected SQLExpr expr;

    public void setExpr(SQLExpr expr) {
        if (expr != null) {
            expr.setParent(this);
        }
        this.expr = expr;
    }

    @Override
    protected void accept0(SQLASTVisitor visitor) {
        visitor.visit(this);
        visitor.endVisit(this);
    }

}
