package com.lfsenior.sql.parser.common.ast;

import com.lfsenior.sql.parser.common.type.DbType;
import com.lfsenior.sql.parser.common.visitor.VisitorFeature;

import java.util.List;

/**
 * <b><code>SQLStatement</code></b>
 * <p/>
 * 所有SQL语句的顶级对象
 * <p/>
 * <b>Creation Time:</b> 2022/4/27 10:48.
 *
 * @author LFSenior
 */
public interface SQLStatement extends SQLObject {
    /**
     * 获取语句所属的DB类型
     *
     * @return
     */
    DbType getDbType();

    @Override
    SQLStatement clone();

    /**
     * 获取包含的子AST节点
     *
     * @return
     */
    List<SQLObject> getChildren();

    /**
     * 生成SQL字符串，注意默认大写
     *
     * @return
     */
    String toString();

    /**
     * 按指定特征输出
     *
     * @param features
     * @return
     */
    String toString(VisitorFeature... features);

    /**
     * 生成SQL字符串，小写
     *
     * @return
     */
    String toLowerCaseString();
}
