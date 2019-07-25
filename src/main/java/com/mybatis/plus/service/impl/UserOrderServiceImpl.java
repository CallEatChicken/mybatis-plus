package com.mybatis.plus.service.impl;

import com.mybatis.plus.bean.UserOrder;
import com.mybatis.plus.config.annotation.NeedSetFieldValue;
import com.mybatis.plus.mapper.UserOrderMapper;
import com.mybatis.plus.service.UserOrderService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wzf
 * @since 2019-07-24
 */
@Service
public class UserOrderServiceImpl extends ServiceImpl<UserOrderMapper, UserOrder> implements UserOrderService {

	@NeedSetFieldValue
	@Override
	public List<UserOrder> selectListByWrapper(Wrapper wrapper) {
		List<UserOrder> sList = baseMapper.selectListOrder(wrapper);
		sList.forEach(iten->{
			System.out.println(iten.toString());
		});
		return baseMapper.selectListOrder(wrapper);
	}

}
