package com.lfsenior.sql.parser.clickhouse.adapter;

/**
 * <b><code>ColumnTypeExprVisitor</code></b>
 * <p/>
 * columnTypeExpr
 *     : identifier                                                                             # ColumnTypeExprSimple   // UInt64
 *     | identifier LPAREN identifier columnTypeExpr (COMMA identifier columnTypeExpr)* RPAREN  # ColumnTypeExprNested   // Nested
 *     | identifier LPAREN enumValue (COMMA enumValue)* RPAREN                                  # ColumnTypeExprEnum     // Enum
 *     | identifier LPAREN columnTypeExpr (COMMA columnTypeExpr)* RPAREN                        # ColumnTypeExprComplex  // Array, Tuple
 *     | identifier LPAREN columnExprList? RPAREN                                               # ColumnTypeExprParam    // FixedString(N)
 *     ;                                                                          # ColumnTypeExprSimple   // UInt64     | identifier LPAREN identifier columnTypeExpr (COMMA identifier columnTypeExpr)* RPAREN  # ColumnTypeExprNested   // Nested     | identifier LPAREN enumValue (COMMA enumValue)* RPAREN                                  # ColumnTypeExprEnum     // Enum     | identifier LPAREN columnTypeExpr (COMMA columnTypeExpr)* RPAREN                        # ColumnTypeExprComplex  // Array, Tuple     | identifier LPAREN columnExprList? RPAREN                                               # ColumnTypeExprParam    // FixedString(N)     ;
 * todo 待完成
 * <p/>
 * <b>Creation Time:</b> 2022/5/11 16:21.
 *
 * @author LFSenior
 */
public class ColumnTypeExprVisitor {
}
