package com.mybatis.plus.service;

import com.mybatis.plus.bean.Staff;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
	
	public void testadd();
	
	public Staff selectStaffById(@Param("id") long id);

}
