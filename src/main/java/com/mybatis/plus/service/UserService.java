package com.mybatis.plus.service;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mybatis.plus.bean.User;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface UserService extends IService<User>{

	boolean deleteAll();

	public List<User> selectListBySQL();

	public List<User> selectListByWrapper(Wrapper wrapper);
	
}
