package com.lfsenior.sql.parser.common.ast.statement;

import com.lfsenior.sql.parser.common.ast.AbstractSQLObject;
import com.lfsenior.sql.parser.common.ast.SQLColumnDefinition;
import com.lfsenior.sql.parser.common.visitor.SQLASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <b><code>SQLAlterTableAddColumn</code></b>
 * <p/>
 * add column定义
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 11:05.
 *
 * @author LFSenior
 */
public class SQLAlterTableAddColumn extends AbstractSQLObject implements SQLAlterTableItem {
    private final List<SQLColumnDefinition> columns = new ArrayList<>();

    @Override
    protected void accept0(SQLASTVisitor visitor) {
        if (visitor.visit(this)) {
            acceptChild(visitor, columns);
        }
        visitor.endVisit(this);
    }

    public List<SQLColumnDefinition> getColumns() {
        return columns;
    }

    public void addColumn(SQLColumnDefinition column) {
        if (column != null) {
            column.setParent(this);
        }
        this.columns.add(column);
    }
}
