package com.lfsenior.sql.parser.common.exception;

/**
 * <b><code>AdapterConvertException</code></b>
 * <p/>
 * 适配器转换异常
 * <p/>
 * <b>Creation Time:</b> 2022/5/1 9:45.
 *
 * @author LFSenior
 */
public class AdapterConvertException extends RuntimeException {
    public AdapterConvertException() {
        super();
    }

    public AdapterConvertException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdapterConvertException(String message) {
        super(message);
    }

    public AdapterConvertException(Throwable cause) {
        super(cause);
    }
}
