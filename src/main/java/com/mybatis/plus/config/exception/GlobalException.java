package com.mybatis.plus.config.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 定义全局异常，由于采用前后端分离，故
 * 需要以json 形式返回前端异常信息
 * @author admin
 * @date 2019-7-7
 * */
@ControllerAdvice
public class GlobalException {
	@ResponseBody
	@ExceptionHandler(value=SysException.class)
	public ResponseEntity<?> handleException(HttpServletRequest request,SysException sysException){
		GlobalExceptionEntity<String> globalException = new GlobalExceptionEntity<String>();
		globalException.setCode(GlobalExceptionEntity.getError());
		globalException.setMsg(sysException.getErrMsg());
		globalException.setUrl(request.getRequestURI().toString());
		globalException.setData("系统处理出现异常：");
		return new ResponseEntity<>(globalException,HttpStatus.OK);
	}

}
