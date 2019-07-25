package com.mybatis.plus.mapper;

import com.mybatis.plus.bean.User;
import com.mybatis.plus.bean.UserOrder;

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
 * @since 2019-07-24
 */
public interface UserOrderMapper extends BaseMapper<UserOrder> {

	List<UserOrder> selectListOrder(@Param("ew") Wrapper wrapper);
	
}
