package com.lfsenior.sql.parser.common.ast;

import java.util.List;

/**
 * <b><code>SQLExpr</code></b>
 * <p/>
 * SQL表达式
 * <p/>
 * <b>Creation Time:</b> 2022/4/27 14:58.
 *
 * @author LFSenior
 */
public interface SQLExpr extends SQLObject {
    /**
     * 对象复制
     *
     * @return
     */
    SQLExpr clone();

    /**
     * 获取子节点
     *
     * @return
     */
    List<SQLObject> getChildren();
}
