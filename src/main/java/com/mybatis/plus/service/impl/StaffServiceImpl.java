package com.mybatis.plus.service.impl;

import com.mybatis.plus.bean.Staff;
import com.mybatis.plus.mapper.StaffMapper;
import com.mybatis.plus.service.StaffService;
import com.mybatis.plus.util.SnowflakeIdWorker;
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
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements StaffService {

	@Override
	public List<Staff> selectListByWrapper(Wrapper wrapper) {
		return baseMapper.selectListByWrapper(wrapper);
	}

	@Override
	public int deleteAll() {
		return baseMapper.deleteAll();
	}

	@Override
	public List<Staff> selectListBySQL() {
		// TODO Auto-generated method stub
		return baseMapper.selectListBySQL();
	}

	@Override
	public void testadd() {
		// TODO Auto-generated method stub
       Thread thread = new Thread(new Runnable() {
		public void run() {
			for(int i=0;i<40000;i++) {
				Staff staff = new Staff(new SnowflakeIdWorker(3,3).nextId(), "wz","nan","123456"+i);
				staff.insert();
			}
		}
	});
       	new Thread(thread).start(); 
		new Thread(thread).start(); 
		new Thread(thread).start(); 
	}

}
