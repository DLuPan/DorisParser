package com.lfsenior.sql.parser.common.ast.statement;

import com.lfsenior.sql.parser.common.ast.SQLExpr;
import com.lfsenior.sql.parser.common.visitor.SQLASTVisitor;

/**
 * <b><code>SQLExprTableSource</code></b>
 * <p/>
 * 表的定义表达式
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 10:44.
 *
 * @author LFSenior
 */
public class SQLTableSource extends AbstractTableSource {
    protected SQLExpr dbExpr;
    protected SQLExpr tableExpr;

    public SQLTableSource() {

    }

    public SQLTableSource(SQLExpr dbExpr, SQLExpr tableExpr, String alias) {
        this.setDbExpr(dbExpr);
        this.setTableExpr(tableExpr);
        this.setAlias(alias);
    }

    public SQLExpr getDbExpr() {
        return dbExpr;
    }

    public void setDbExpr(SQLExpr x) {
        if (x != null) {
            x.setParent(this);
        }
        this.dbExpr = x;
    }

    public SQLExpr getTableExpr() {
        return tableExpr;
    }

    public void setTableExpr(SQLExpr x) {
        if (x != null) {
            x.setParent(this);
        }
        this.tableExpr = x;
    }


    @Override
    protected void accept0(SQLASTVisitor visitor) {
        visitor.visit(this);

        visitor.endVisit(this);
    }

}
