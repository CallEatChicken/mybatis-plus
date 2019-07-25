package com.mybatis.plus.bean;

import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author wzf
 * @since 2019-07-25
 */
@Data
@SuppressWarnings("serial")
public class Staff extends SuperEntity<Staff> {

    private static final long serialVersionUID = 1L;

    private String name;

    private String sex;

    private String tel;

	public Staff(Long id, String name, String sex, String tel) {
		super(id);
		this.name = name;
		this.sex = sex;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", sex=" + sex + ", tel=" + tel + "]";
	}

}
