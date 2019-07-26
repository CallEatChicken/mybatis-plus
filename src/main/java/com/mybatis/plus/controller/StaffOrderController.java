package com.mybatis.plus.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatis.plus.bean.Staff;
import com.mybatis.plus.bean.StaffOrder;
import com.mybatis.plus.service.StaffOrderService;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wzf
 * @since 2019-07-25
 */
@RestController
@RequestMapping("/staffOrder")
public class StaffOrderController {
	
	@Autowired
	StaffOrderService staffOrderService;
	
	/**
     * http://localhost:8080/staffOrder/select_wrapper
     */
    @GetMapping("/select_wrapper")
    public void getUserByWrapper() {
         staffOrderService.selectListByWrapper(new QueryWrapper<StaffOrder>()
                .lambda().like(StaffOrder::getShopName, "苹")
                .or(e -> e.like(StaffOrder::getShopName, "栗")));
    }

}
