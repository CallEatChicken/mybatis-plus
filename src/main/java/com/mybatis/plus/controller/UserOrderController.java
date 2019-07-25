package com.mybatis.plus.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatis.plus.bean.User;
import com.mybatis.plus.bean.UserOrder;
import com.mybatis.plus.service.UserOrderService;
import com.mybatis.plus.service.UserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wzf
 * @since 2019-07-24
 */
@RestController
@RequestMapping("/userOrder")
public class UserOrderController {
	
	@Autowired
	private UserOrderService userOrderService;
	
	@GetMapping("/save")
    public String testError(String id,String userId) {
		userOrderService.save(new UserOrder(id,userId,"栗子",id));
        return "success";
    }
	
	@GetMapping("/orderList")
    public String orderList() {
		QueryWrapper<UserOrder> wrapper = new QueryWrapper<UserOrder>();
		List<UserOrder> listUserOrder =  
				userOrderService.selectListByWrapper(wrapper);
		for(UserOrder userOrder : listUserOrder) {
			System.out.println(userOrder.toString());
		}
		return null;
	}

}
