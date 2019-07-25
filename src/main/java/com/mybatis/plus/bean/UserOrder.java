package com.mybatis.plus.bean;

import com.mybatis.plus.config.annotation.NeedSetValue;
import com.mybatis.plus.mapper.UserMapper;
import com.mybatis.plus.service.UserService;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wzf
 * @since 2019-07-24
 */
public class UserOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userId;

    private String shopName;

    private String shopId;
    
    @NeedSetValue(beanClass = UserService.class, method = "getById", param = "id", targetField = "name")
    private String userName;
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserOrder(String id, String userId, String shopName, String shopId) {
		super();
		this.id = id;
		this.userId = userId;
		this.shopName = shopName;
		this.shopId = shopId;
	}

	@Override
	public String toString() {
		return "UserOrder [id=" + id + ", userId=" + userId + ", shopName=" + shopName + ", shopId=" + shopId
				+ ", userName=" +userName+ "]";
	}
	
}
