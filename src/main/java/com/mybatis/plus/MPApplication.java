package com.mybatis.plus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.mybatis.plus.mapper")
@EnableTransactionManagement
public class MPApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MPApplication.class, args);
	}

}
