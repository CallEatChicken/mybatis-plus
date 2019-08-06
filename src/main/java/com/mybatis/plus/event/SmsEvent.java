package com.mybatis.plus.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Service;

//监听事件
@Service
public class SmsEvent implements SmartApplicationListener{

	//事件发生的时候
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("2发短信");
	}

	//执行顺序，多个坚挺，值越大，越往后
	@Override
	public int getOrder() {
		return 60;
	}

	//仅仅坚挺指定的事件
	@Override
	public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
		return eventType == OrderEvent.class;
	}

	@Override
	public boolean supportsSourceType(Class<?> sourceType) {
		return true;
	}

}
