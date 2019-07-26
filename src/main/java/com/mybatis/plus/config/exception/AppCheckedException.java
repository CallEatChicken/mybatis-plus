package com.mybatis.plus.config.exception;

/**
 * 定义应用级别校验异常
 * @author admin
 * @date 2019-7-5
 * */
@SuppressWarnings("serial")
public abstract class AppCheckedException extends Exception {
    public AppCheckedException() {
        super();
    }

    public AppCheckedException(String msg) {
        super(msg);
    }

    public AppCheckedException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public AppCheckedException(Throwable cause) {
        super(cause);
    }

    @Override
    public String getMessage() {
        return ExceptionUtil.getExceptionMsg(getCause());
    }

    public Throwable getRootCause() {
        return ExceptionUtil.getRootCause(this, true);
    }

    public Throwable getMostSpecificCause() {
        return ExceptionUtil.getRootCause(this, false);
    }

    public boolean contains(Class<? extends Throwable> exType) {
        return ExceptionUtil.contains(this, exType);
    }
}
