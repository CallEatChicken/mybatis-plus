package com.mybatis.plus.event;

import org.springframework.context.ApplicationEvent;

/*订单操作*/
public class OrderEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderEvent(Object source) {
		super(source);
	}

}
