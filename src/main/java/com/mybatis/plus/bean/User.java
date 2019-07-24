package com.mybatis.plus.bean;



import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName(value = "user")
public class User {
	private String id;
    private String name;
    private String column_1;
    private String column_2;
	public User(String id, String name, String column_1, String column_2) {
		super();
		this.id = id;
		this.name = name;
		this.column_1 = column_1;
		this.column_2 = column_2;
	}
}
