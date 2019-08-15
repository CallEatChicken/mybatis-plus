package com.mybatis.plus.service.impl;

import com.mybatis.plus.bean.StaffOrder;
import com.mybatis.plus.event.OrderEvent;
import com.mybatis.plus.mapper.StaffOrderMapper;
import com.mybatis.plus.service.StaffOrderService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import org.h2.util.New;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wzf
 * @since 2019-07-25
 */
@Service
public class StaffOrderServiceImpl extends ServiceImpl<StaffOrderMapper, StaffOrder> implements StaffOrderService {

	@Autowired
	ApplicationContext applicationContext;
	
	@Override
	public List<StaffOrder> selectListByWrapper(Wrapper wrapper) {
		return baseMapper.selectListByWrapper(wrapper);
	}

	@Override
	public void save() {
		System.out.println("订单创建成功");
		applicationContext.publishEvent(new OrderEvent(""));
	}
}
