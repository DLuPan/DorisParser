package com.lfsenior.sql.parser.clickhouse.adapter;

/**
 * <b><code>ColumnsExprVisitor</code></b>
 * <p/>
 * columnsExpr
 *     : (tableIdentifier DOT)? ASTERISK  # ColumnsExprAsterisk
 *     | LPAREN selectUnionStmt RPAREN    # ColumnsExprSubquery
 *     // NOTE: asterisk and subquery goes before |columnExpr| so that we can mark them as multi-column expressions.
 *     | columnExpr                       # ColumnsExprColumn
 *     ;
 * <p>
 * todo 待完成
 * <p/>
 * <b>Creation Time:</b> 2022/5/11 16:22.
 *
 * @author LFSenior
 */
public class ColumnsExprVisitor {
}
