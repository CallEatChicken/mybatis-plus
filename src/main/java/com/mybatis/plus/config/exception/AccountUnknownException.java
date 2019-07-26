package com.mybatis.plus.config.exception;

import org.apache.shiro.authc.AuthenticationException;

@SuppressWarnings("serial")
public class AccountUnknownException extends AuthenticationException{
	
	public AccountUnknownException(){
		super();
	}
    public AccountUnknownException(String message){
    	super(message);
    }
    public AccountUnknownException(Throwable throwable){
    	super(throwable);
    }
    public AccountUnknownException(String message,Throwable throwable){
    	super(message,throwable);
    }
}
