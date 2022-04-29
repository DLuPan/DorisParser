package com.lfsenior.sql.parser.clickhouse.antlr4;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * <b><code>ClickHouseErrorListener</code></b>
 * <p/>
 * <p>
 * <p/>
 * <b>Creation Time:</b> 2022/4/29 16:33.
 *
 * @author LFSenior
 */
public class ClickHouseErrorListener extends BaseErrorListener {
    public static final ClickHouseErrorListener INSTANCE = new ClickHouseErrorListener();

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        throw new RuntimeException("CK解析异常line " + line + ":" + charPositionInLine + " " + msg);
    }
}
