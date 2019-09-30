package com.mybatis.plus.strategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @ClassName: 
 * @Description: 
 * @author: wzf/290124
 * @version: V1.0
 * @date: 2019年8月16日 下午4:06:09
 * @Copyright: 价格范围注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PriceRegion {
	
	int min() default 0;
    int max() default Integer.MAX_VALUE;

}
