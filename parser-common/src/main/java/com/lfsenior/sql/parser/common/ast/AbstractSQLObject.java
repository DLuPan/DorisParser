package com.lfsenior.sql.parser.common.ast;

import com.lfsenior.sql.parser.common.visitor.SQLASTVisitor;
import org.apache.commons.collections.MapUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <b><code>AbstractSQLObject</code></b>
 * <p/>
 * SQLObject实现封装
 * <p/>
 * <b>Creation Time:</b> 2022/4/27 14:28.
 *
 * @author LFSenior
 */
public abstract class AbstractSQLObject implements SQLObject {
    /*父节点*/
    protected SQLObject parent;
    /*节点属性*/
    protected Map<String, Object> attributes;

    @Override
    public void accept(SQLASTVisitor visitor) {
        if (visitor == null) {
            throw new IllegalArgumentException("visitor不能为空");
        }

        visitor.preListener(this);
        accept0(visitor);
        visitor.postListener(this);

    }

    /**
     * 实现具体访问
     *
     * @param visitor
     */
    protected abstract void accept0(SQLASTVisitor visitor);

    /**
     * 访问下层节点
     *
     * @param visitor
     * @param children
     */
    protected final void acceptChild(SQLASTVisitor visitor, List<? extends SQLObject> children) {
        if (children == null) {
            return;
        }

        for (int i = 0; i < children.size(); i++) {
            acceptChild(visitor, children.get(i));
        }
    }

    /**
     * 访问下层节点
     *
     * @param visitor
     * @param child
     */
    protected final void acceptChild(SQLASTVisitor visitor, SQLObject child) {
        if (child == null) {
            return;
        }

        child.accept(visitor);
    }

    public void output(StringBuffer buf) {
        output((Appendable) buf);
    }

    public void output(Appendable buf) {
        // todo 输出到指定格式的StringBuffer中
    }

    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer();
        output(buf);
        return buf.toString();
    }

    @Override
    public SQLObject getParent() {
        return parent;
    }

    @Override
    public void setParent(SQLObject parent) {
        this.parent = parent;
    }

    @Override
    public Map<String, Object> getAttributes() {
        if (attributes == null) {
            //初始化
            attributes = new HashMap<>(1);
        }
        return attributes;
    }

    @Override
    public Object getAttribute(String name) {
        if (attributes == null) {
            return null;
        }
        return attributes.get(name);
    }

    @Override
    public boolean containsAttribute(String name) {
        if (attributes == null) {
            return false;
        }
        return attributes.containsKey(name);
    }

    @Override
    public void putAttribute(String name, Object value) {
        if (attributes == null) {
            attributes = new HashMap<>(1);
        }
        attributes.put(name, value);
    }

    @Override
    public Map<String, Object> getReadOnlyAttributes() {
        return MapUtils.unmodifiableMap(attributes);
    }


}
