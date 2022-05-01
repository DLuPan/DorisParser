package com.lfsenior.sql.parser.clickhouse.adapter;

import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParser;
import com.lfsenior.sql.parser.clickhouse.antlr4.ClickHouseParserBaseVisitor;
import com.lfsenior.sql.parser.common.ast.SQLStatement;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

/**
 * <b><code>QueryStmtVisitor</code></b>
 * <p/>
 * <strike>
 * 最顶级的访问对象实现,最终的目的是生成SQLStatement实现。
 * <p>
 * 所以我们决定采用自适应方案实现，通过接口提供自适应注册，完成自适应解析
 * <p>
 * 其实很简单就是责任链模式，高等级->低等级下放最终完成解析
 * <p>
 * 访问入口，所有的入口都是从这里来这里会拿到一个Query，然后路由到QueryVisitor最终生成通用AST
 * <p>
 * </strike>
 * <b>方案变更如下：</b>
 * <p>
 * 责任链模式固然好用，但是存在一个问题，就是每个visitor都是独立的，所以需要频繁初始化对象，更新对象，每次访问都必须实例化，这很扯
 * 所以最好的办法我理解是将判断逻辑前置话，用装饰器+指令模式来控会更好
 * <p>
 * <u>为什么？</u>
 * <p>
 * 使用装饰器，可以将对象的动态调用改为静态调用，通过指令来绑定具体的执行Visitor，从而将解析源与解析动作解耦，提供高可读性。
 * <p>
 * 所以就会有！WrapperAdapterNode,ClickHouseVisitorCommand
 * <p>
 * 装饰器节点的目的就是用来组链，这里提供Default匹配链路，Command的目的是解耦实现，通过Match+Action的模型来实现访问
 * <p>
 * 注意Match动作是静态的，而Action是动态的，将静态匹配，按需实例化，降低解析的内存消耗，提高解析效率
 * <b>Creation Time:</b> 2022/4/29 17:31.
 *
 * @author LFSenior
 */
public class QueryStmtVisitor extends ClickHouseParserBaseVisitor<SQLStatement> {

    @Override
    public SQLStatement visitChildren(RuleNode node) {
        SQLStatement result = defaultResult();
        int n = node.getChildCount();
        for (int i = 0; i < n; i++) {
            Object sqlNode = DefaultWrapperAdapterLinked.execute(node.getChild(i));
            if (sqlNode instanceof SQLStatement) {
                result = (SQLStatement) sqlNode;
                break;
            }
        }
        return result;
    }


}
