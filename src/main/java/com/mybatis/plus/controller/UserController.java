package com.mybatis.plus.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybatis.plus.bean.User;
import com.mybatis.plus.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController{

	@Autowired
	private UserService userServiceImpl;
	
	@GetMapping("/save")
    public String testError(String id,String name) {
		userServiceImpl.save(new User(id,name,"test1","test2"));
        return "success";
    }

	
}
