package com.mybatis.plus.config.aspect;

import java.util.Collection;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mybatis.plus.bean.UserOrder;
import com.mybatis.plus.util.BeanUtil;


@Component
@Aspect
public class SetFeildValueAspect {
	
	@Autowired
	BeanUtil beanUtil;
	
	@Around("@annotation(com.mybatis.plus.config.annotation.NeedSetFieldValue)")
	public Object doSetFeildVlue(ProceedingJoinPoint pjp) throws Throwable{
		//等价于我们直接调用当前要使用的方法NeedSetFieldValue注释的
		Object ret = pjp.proceed();
		//这个结果集带有NeedSetValue的值
		//对这个结果集处理
		if(ret instanceof Collection) {
			this.beanUtil.setFeildValueAspect((Collection)ret);
		}
		return ret;
	}
	
	

}
