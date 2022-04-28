package com.lfsenior.sql.parser.common.ast;

import com.lfsenior.sql.parser.common.visitor.SQLASTVisitor;

import java.io.Closeable;
import java.util.Map;

/**
 * <b><code>SQLObject</code></b>
 * <p/>
 * AST的顶级对象，所有AST中的成员均为其子对象
 * <p/>
 * <b>Creation Time:</b> 2022/4/27 10:32.
 *
 * @author LFSenior
 */
public interface SQLObject extends Cloneable {
    /**
     * 接受访问者调用
     *
     * @param visitor
     */
    void accept(SQLASTVisitor visitor);

    /**
     * 对象克隆
     *
     * @return
     */
    SQLObject clone();

    /**
     * 获取父对象
     *
     * @return
     */
    SQLObject getParent();

    /**
     * 设置父对象
     *
     * @param parent
     */
    void setParent(SQLObject parent);

    /**
     * 获取AST节点绑定属性MAP
     *
     * @return
     */

    Map<String, Object> getAttributes();

    /**
     * 判断属性是否存在
     *
     * @param name
     * @return
     */
    boolean containsAttribute(String name);

    /**
     * 获取属性值
     *
     * @param name
     * @return
     */
    Object getAttribute(String name);

    /**
     * 设置属性值
     *
     * @param name
     * @param value
     */
    void putAttribute(String name, Object value);

    /**
     * 获取只读属性MAP
     *
     * @return
     */
    Map<String, Object> getReadOnlyAttributes();

    /**
     * 输出到StringBuffer
     *
     * @param buf
     */
    void output(StringBuffer buf);

    /**
     * 输出到Appendable（自定义 Formatter）
     *
     * @param buf
     */
    void output(Appendable buf);
}
