package com.mybatis.plus.service;

import com.mybatis.plus.bean.StaffOrder;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wzf
 * @since 2019-07-25
 */
public interface StaffOrderService extends IService<StaffOrder> {
	
	public List<StaffOrder> selectListByWrapper(Wrapper wrapper);

}
