package com.lfsenior.sql.parser.common.ast.statement;

import com.lfsenior.sql.parser.common.type.DbType;

import java.util.ArrayList;
import java.util.List;

/**
 * <b><code>SQLAlterTableStatement</code></b>
 * <p/>
 * 修改表
 * todo 待完成
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 10:36.
 *
 * @author LFSenior
 */
public class SQLAlterTableStatement extends AbstractSQLStatement implements SQLDDLStatement, SQLAlterStatement {
    /*表名定义*/
    private SQLTableSource tableSource;
    /*构成元素定义*/
    private List<SQLAlterTableItem> items = new ArrayList<SQLAlterTableItem>();

    public SQLAlterTableStatement() {
    }

    public SQLAlterTableStatement(DbType dbType) {
        super(dbType);
    }

    public void setTableSource(SQLTableSource tableSource) {
        if (tableSource != null) {
            tableSource.setParent(this);
        }
        this.tableSource = tableSource;
    }

    public SQLTableSource getTableSource() {
        return tableSource;
    }

    public void addItem(SQLAlterTableItem item) {
        if (item != null) {
            item.setParent(this);
            this.items.add(item);
        }
    }

    public List<SQLAlterTableItem> getItems() {
        return items;
    }

    public void setItems(List<SQLAlterTableItem> items) {
        this.items = items;
    }
}
