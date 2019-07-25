package com.mybatis.plus.bean;

import java.io.Serializable;
import java.sql.Date;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wzf
 * @since 2019-07-25
 */
@SuppressWarnings("serial")
public class Staff extends SuperEntity<Staff> {

    private static final long serialVersionUID = 1L;

    private String name;

    private String sex;

    private String tel;

    
    

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getSex() {
		return sex;
	}




	public void setSex(String sex) {
		this.sex = sex;
	}




	public String getTel() {
		return tel;
	}




	public void setTel(String tel) {
		this.tel = tel;
	}




	public Staff(Long id, String name, String sex, String tel) {
		super(id);
		this.name = name;
		this.sex = sex;
		this.tel = tel;
	}

    
    

}
