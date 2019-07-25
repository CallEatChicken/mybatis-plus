package com.mybatis.plus.service;

import com.mybatis.plus.bean.UserOrder;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wzf
 * @since 2019-07-24
 */
public interface UserOrderService extends IService<UserOrder> {

	public List<UserOrder> selectListByWrapper(Wrapper wrapper);
	
}
