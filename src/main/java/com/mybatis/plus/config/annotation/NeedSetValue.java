package com.mybatis.plus.config.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NeedSetValue {

	//定义注解的属性
	Class<?> beanClass();
	//定义传入的参数
	String param();
	//定义调用的方法
	String method();
	//从哪个结果获取
	String targetField();
	
}
