package com.lfsenior.sql.parser.clickhouse.adapter;

/**
 * <b><code>ColumnExprVisitor</code></b>
 * <p/>
 * columnExpr
 *     : CASE columnExpr? (WHEN columnExpr THEN columnExpr)+ (ELSE columnExpr)? END          # ColumnExprCase
 *     | CAST LPAREN columnExpr AS columnTypeExpr RPAREN                                     # ColumnExprCast
 *     | DATE STRING_LITERAL                                                                 # ColumnExprDate
 *     | EXTRACT LPAREN interval FROM columnExpr RPAREN                                      # ColumnExprExtract
 *     | INTERVAL columnExpr interval                                                        # ColumnExprInterval
 *     | SUBSTRING LPAREN columnExpr FROM columnExpr (FOR columnExpr)? RPAREN                # ColumnExprSubstring
 *     | TIMESTAMP STRING_LITERAL                                                            # ColumnExprTimestamp
 *     | TRIM LPAREN (BOTH | LEADING | TRAILING) STRING_LITERAL FROM columnExpr RPAREN       # ColumnExprTrim
 *     | identifier (LPAREN columnExprList? RPAREN) OVER LPAREN windowExpr RPAREN            # ColumnExprWinFunction
 *     | identifier (LPAREN columnExprList? RPAREN) OVER identifier                          # ColumnExprWinFunctionTarget
 *     | identifier (LPAREN columnExprList? RPAREN)? LPAREN DISTINCT? columnArgList? RPAREN  # ColumnExprFunction
 *     | literal                                                                             # ColumnExprLiteral
 *
 *     // FIXME(ilezhankin): this part looks very ugly, maybe there is another way to express it
 *     | columnExpr LBRACKET columnExpr RBRACKET                                             # ColumnExprArrayAccess
 *     | columnExpr DOT DECIMAL_LITERAL                                                      # ColumnExprTupleAccess
 *     | DASH columnExpr                                                                     # ColumnExprNegate
 *     | columnExpr ( ASTERISK                                                               // multiply
 *                  | SLASH                                                                  // divide
 *                  | PERCENT                                                                // modulo
 *                  ) columnExpr                                                             # ColumnExprPrecedence1
 *     | columnExpr ( PLUS                                                                   // plus
 *                  | DASH                                                                   // minus
 *                  | CONCAT                                                                 // concat
 *                  ) columnExpr                                                             # ColumnExprPrecedence2
 *     | columnExpr ( EQ_DOUBLE                                                              // equals
 *                  | EQ_SINGLE                                                              // equals
 *                  | NOT_EQ                                                                 // notEquals
 *                  | LE                                                                     // lessOrEquals
 *                  | GE                                                                     // greaterOrEquals
 *                  | LT                                                                     // less
 *                  | GT                                                                     // greater
 *                  | GLOBAL? NOT? IN                                                        // in, notIn, globalIn, globalNotIn
 *                  | NOT? (LIKE | ILIKE)                                                    // like, notLike, ilike, notILike
 *                  ) columnExpr                                                             # ColumnExprPrecedence3
 *     | columnExpr IS NOT? NULL_SQL                                                         # ColumnExprIsNull
 *     | NOT columnExpr                                                                      # ColumnExprNot
 *     | columnExpr AND columnExpr                                                           # ColumnExprAnd
 *     | columnExpr OR columnExpr                                                            # ColumnExprOr
 *     // TODO(ilezhankin): `BETWEEN a AND b AND c` is parsed in a wrong way: `BETWEEN (a AND b) AND c`
 *     | columnExpr NOT? BETWEEN columnExpr AND columnExpr                                   # ColumnExprBetween
 *     | <assoc=right> columnExpr QUERY columnExpr COLON columnExpr                          # ColumnExprTernaryOp
 *     | columnExpr (alias | AS identifier)                                                  # ColumnExprAlias
 *
 *     | (tableIdentifier DOT)? ASTERISK                                                     # ColumnExprAsterisk  // single-column only
 *     | LPAREN selectUnionStmt RPAREN                                                       # ColumnExprSubquery  // single-column only
 *     | LPAREN columnExpr RPAREN                                                            # ColumnExprParens    // single-column only
 *     | LPAREN columnExprList RPAREN                                                        # ColumnExprTuple
 *     | LBRACKET columnExprList? RBRACKET                                                   # ColumnExprArray
 *     | columnIdentifier                                                                    # ColumnExprIdentifier
 *     ;
 * <p>
 * todo 待完成
 * <p/>
 * <b>Creation Time:</b> 2022/5/11 16:23.
 *
 * @author LFSenior
 */
public class ColumnExprVisitor {
}
