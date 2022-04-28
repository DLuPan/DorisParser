package com.lfsenior.sql.parser.common.ast;

/**
 * <b><code>SQLTableElement</code></b>
 * <p/>
 * SQL构成元素
 * <p/>
 * <b>Creation Time:</b> 2022/4/27 14:22.
 *
 * @author LFSenior
 */
public interface SQLTableElement extends SQLObject {
    @Override
    SQLTableElement clone();
}
