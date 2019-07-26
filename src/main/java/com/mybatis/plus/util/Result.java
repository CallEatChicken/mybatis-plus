package com.mybatis.plus.util;

import java.io.Serializable;


public class Result<T> implements Serializable {

	
private static final long serialVersionUID = 1L;
	
	/**
	 *  返回值，200标识数据获取成功；400代表数据获取失败
	 */
	private Integer code;
	
	/**
	 * 返回提示信息或者错误信息
	 */
	private String message;
	
	/**
	 * 业务关心的数据
	 */
	private T data;
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	private Result(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	private Result(Integer code, T data) {
		this.code = code;
		this.data = data;
	}

	public static <T> Result<T> success(Integer code, T data) {
		return new Result<>(code, data);
	}

	public static <T> Result<T> error(Integer code, String message) {
		return new Result<>(code, message);
	}
	
}
