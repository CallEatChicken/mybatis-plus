package com.mybatis.plus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages="com.mybatis.plus")
@MapperScan("com.mybatis.plus.mapper")
@EnableTransactionManagement
@EnableAutoConfiguration
@EnableSwagger2
public class MPApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MPApplication.class, args);
	}

}
