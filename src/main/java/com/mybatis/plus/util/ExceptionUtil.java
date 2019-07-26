package com.mybatis.plus.util;

import com.mybatis.plus.config.exception.AppCheckedException;
import com.mybatis.plus.config.exception.AppRuntimeException;

public class ExceptionUtil {
	
	/**
	 * 将异常对象转换成字符串
	 * @param  throwable 要转换的异常对象
	 * @return String
	 * */
	public static String getExceptionMsg(Throwable throwable){
		StringBuffer sf = new StringBuffer();
		StackTraceElement [] sElement = throwable.getStackTrace();
		if(sElement != null && sElement.length > 0){
			for(StackTraceElement element : sElement){
				sf.append("r\n").append(element);
			}
		}
		return sf.toString();
	}
	
	/**
	 * 获取异常中的cause 信息
	 * @param  ex 指定异常对象
	 * @param  nullable 是否为null
	 * @return Throwable
	 * */
	public static Throwable getRootCause(Throwable ex, boolean nullable) {
        Throwable rootCause = nullable ? null : ex;
        Throwable cause = ex.getCause();
        while (cause != null && cause != rootCause) {
            rootCause = cause;
            cause = cause.getCause();
        }
        return rootCause;
    }

	/**
	 * 判断指定class 是否属于 指定异常类
	 * @param  ex 指定异常对象
	 * @param  exType 指定class
	 * @return boolean
	 * */	
   public  static boolean contains(Throwable ex, Class<? extends Throwable> exType) {
        if (exType == null) {
            return false;
        }
        if (exType.isInstance(ex)) {
            return true;
        }
        Throwable cause = ex.getCause();
        if (cause == ex) {
            return false;
        }
        if (cause instanceof AppRuntimeException) {
            return ((AppRuntimeException) cause).contains(exType);
        } else if (cause instanceof AppCheckedException) {
            return ((AppCheckedException) cause).contains(exType);
        } else {
            while (cause != null) {
                if (exType.isInstance(cause)) {
                    return true;
                }
                if (cause.getCause() == cause) {
                    break;
                }
                cause = cause.getCause();
            }
            return false;
        }
    }
}

