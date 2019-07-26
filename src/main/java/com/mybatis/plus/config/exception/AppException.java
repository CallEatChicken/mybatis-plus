package com.mybatis.plus.config.exception;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 定义应用级别的异常处理，包括编译异常
 * @author admin
 * @date 2019-7-5
 * */
public class AppException extends AppCheckedException {
    private static final long serialVersionUID = 1L;
    private static Logger logger = LoggerFactory.getLogger(SysException.class);

    public String getErrId() {
        return this.errId;
    }

    public void setErrId(String errId) {
        this.errId = errId;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public AppException() {

    }

    /**
     * 错误号
     */

    String errId;

    /**
     * 错误信息，当前错误的信息。
     */
    String errMsg;

    public AppException(String errId, String errOwnMsg) {
        this.errId = errId;
        this.errMsg = errOwnMsg;
        this.writeAppException();
    }

    private void writeAppException() {
        logger.error("应用错误号：" + this.errId);
        logger.error("应用错误信息：" + this.errMsg);
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream p = new PrintStream(os);
        this.printStackTrace(p);
        logger.error(os.toString());
    }
}
