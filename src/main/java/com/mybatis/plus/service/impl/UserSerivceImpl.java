package com.mybatis.plus.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mybatis.plus.bean.User;
import com.mybatis.plus.bean.UserOrder;
import com.mybatis.plus.mapper.UserMapper;
import com.mybatis.plus.service.UserService;

@Service
public class UserSerivceImpl extends ServiceImpl<UserMapper, User> implements UserService{

	@Override
	public boolean deleteAll() {
		return retBool(baseMapper.deleteAll());
	}

	@Override
	public List<User> selectListBySQL() {
		return baseMapper.selectListBySQL();
	}

	@Override
	public List<User> selectListByWrapper(Wrapper wrapper) {
		return baseMapper.selectListByWrapper(wrapper);
	}
	
	@Override
	public User getUser(String id) {
		return baseMapper.selectById(id);
	}
	
}

