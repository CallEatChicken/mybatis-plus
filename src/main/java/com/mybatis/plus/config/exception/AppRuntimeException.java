package com.mybatis.plus.config.exception;

/**
 * 定义系统运行时异常处理
 * @author admin
 * @date 2019-7-5
 * */
@SuppressWarnings("serial")
public abstract class AppRuntimeException extends RuntimeException {
    public AppRuntimeException() {
        super();
    }

    public AppRuntimeException(String msg) {
        super(msg);
    }

    public AppRuntimeException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public AppRuntimeException(Throwable cause) {
        super(cause);
    }

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
