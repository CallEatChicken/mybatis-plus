package com.mybatis.plus.mapper;

import com.mybatis.plus.bean.Staff;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wzf
 * @since 2019-07-25
 */
public interface StaffMapper extends BaseMapper<Staff> {
	
	 /**
	  * 自定义注入方法
     */
    int deleteAll();
	
	 @Select("select * from staff")
	 List<Staff> selectListBySQL();
	
	 List<Staff> selectListByWrapper(@Param("ew") Wrapper wrapper);
	 
	 Staff selectStaffById(@Param("id") long id);
}
