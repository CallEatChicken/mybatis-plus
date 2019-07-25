package com.mybatis.plus.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanUtil implements ApplicationContextAware{

	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		if(this.applicationContext == null)
			this.applicationContext = applicationContext;
	}
	
	public void setFeildValueAspect(Collection col) throws Exception{
		//获取结果集class
		Class<?> clazz = col.iterator().next().getClass();
		
		//通过对象获取属性
		Field[] fields = clazz.getDeclaredFields();
		
		//加缓存
		Map<String, Object> cache = new HashMap<>();
		
		
//		for(Field needFeid : fields){
//			NeedSetValue sv = needFeid.getAnnotation(NeedSetValue.class);
//			if(sv == null)
//				continue;
//			//设置可见性
//			needFeid.setAccessible(true);
//			sv.getClass();
//			//操作注解--获取bean
//			Object bean = this.applicationContext.getBean(sv.beanClass());
//			//获取方法--获取父类
//			Class<?> u  = sv.beanClass();
//			
//			for(Method method :u.getMethods()) {
//				System.out.println(method);
//			}
//			Method method = u.getMethod("getById", clazz.getDeclaredField(sv.param()).getType());
////			Method method = sv.beanClass().
////					getMethod(sv.method(), clazz.getDeclaredField(sv.param()).getType());
//			
//			//获取入参
//			Field paramField = clazz.getDeclaredField(sv.param());
//			paramField.setAccessible(true);
//			
//			Field targetField = null;
//			
//			//缓存key
//			String keyPrefix =sv.beanClass()+"-"+sv.method()+"-"+sv.targetField()+"=";
//			for(Object obj : col) {
//				
//				Object paramValue = paramField.get(obj);
//				if(paramValue == null)
//					continue;
//				Object value = null;
//				String key = keyPrefix + paramValue;
//				if(cache.containsKey(key)) {
//					value = cache.get(key);
//				}else {
//					value = method.invoke(bean, paramValue);
//					if(value != null) {
//						if(targetField == null) {
//							targetField = value.getClass().getDeclaredField(sv.targetField());
//							targetField.setAccessible(true);
//						}
//						value = targetField.get(value);
//					}
//					cache.put(key, value);
//				}
//				needFeid.set(obj, value);
//			}
//		}
	}

}
