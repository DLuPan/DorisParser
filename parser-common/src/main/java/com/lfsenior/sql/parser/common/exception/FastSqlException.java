package com.lfsenior.sql.parser.common.exception;

/**
 * <b><code>FastsqlException</code></b>
 * <p/>
 * 快速SQL异常
 * <p/>
 * <b>Creation Time:</b> 2022/4/28 17:24.
 *
 * @author LFSenior
 */
public class FastSqlException extends RuntimeException {
    public FastSqlException() {
        super();
    }

    public FastSqlException(String message, Throwable cause) {
        super(message, cause);
    }

    public FastSqlException(String message) {
        super(message);
    }

    public FastSqlException(Throwable cause) {
        super(cause);
    }
}
