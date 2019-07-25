package com.mybatis.plus.service;

import com.mybatis.plus.bean.Staff;

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
public interface StaffService extends IService<Staff> {

	int deleteAll();

	public List<Staff> selectListBySQL();

	public List<Staff> selectListByWrapper(Wrapper wrapper);

}
