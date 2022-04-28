package com.lfsenior.sql.parser.common.ast;

import com.lfsenior.sql.parser.common.exception.FastSqlException;
import com.lfsenior.sql.parser.common.visitor.SQLASTVisitor;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * <b><code>SQLIdentifierExpr</code></b>
 * <p/>
 * 定义表达式（常用：就是字符串，关键字这些）
 * <p/>
 * <b>Creation Time:</b> 2022/4/28 17:20.
 *
 * @author LFSenior
 */
public class SQLIdentifierExpr extends AbstractSQLObject implements SQLName, Comparable<SQLIdentifierExpr> {
    /*定义字符串*/
    protected String name;

    public SQLIdentifierExpr() {

    }

    public SQLIdentifierExpr(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void output(Appendable buf) {
        try {
            buf.append(this.name);
        } catch (IOException ex) {
            throw new FastSqlException("output error", ex);
        }
    }

    @Override
    protected void accept0(SQLASTVisitor visitor) {
        visitor.visit(this);

        visitor.endVisit(this);
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public String getSimpleName() {
        return this.name;
    }

    @Override
    public SQLName clone() {
        return new SQLIdentifierExpr(this.name);
    }

    @Override
    public List<SQLObject> getChildren() {
        return Collections.emptyList();
    }


    @Override
    public int compareTo(SQLIdentifierExpr o) {
        return this.name.compareTo(o.getName());
    }
}
