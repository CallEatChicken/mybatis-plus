package com.mybatis.plus.service.impl;

import com.mybatis.plus.bean.StaffOrder;
import com.mybatis.plus.mapper.StaffOrderMapper;
import com.mybatis.plus.service.StaffOrderService;
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
 * @since 2019-07-25
 */
@Service
public class StaffOrderServiceImpl extends ServiceImpl<StaffOrderMapper, StaffOrder> implements StaffOrderService {

	@Override
	public List<StaffOrder> selectListByWrapper(Wrapper wrapper) {
		return baseMapper.selectListByWrapper(wrapper);
	}

}
