package com.mybatis.plus.config.exception;

public class GlobalExceptionEntity<T> {
	
	private static final int ok = 0;
	private static final int error = 100;
	private int code;
	private String msg;
	private String url;
	private T data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public static int getOk() {
		return ok;
	}
	public static int getError() {
		return error;
	}
	
	
	

}
