package com.mybatis.plus.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.tags.Param;
/**
 * @author wzf
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

		 @PostMapping(value = "/xss")
		 public Object test(String name) {
		 System.out.println(name);
		 return name;
		 }
		 @PostMapping(value = "/json")
		 public Object testJSON(@RequestBody Param param) {
		 return param;
		 }
		 @GetMapping(value = "/query")
		 public Object testQuery(String q){
		 return q;
		 }
		 @PostMapping(value = "/upload")
		 public Object upload(MultipartFile file){
		 System.out.println(file.getOriginalFilename());
		 return "OK";
		 }
	
}
