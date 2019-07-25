package com.mybatis.plus.mapper;

import com.mybatis.plus.bean.Staff;
import com.mybatis.plus.bean.StaffOrder;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
public interface StaffOrderMapper extends BaseMapper<StaffOrder> {

	 List<StaffOrder> selectListByWrapper(@Param("ew") Wrapper wrapper);
	
}
