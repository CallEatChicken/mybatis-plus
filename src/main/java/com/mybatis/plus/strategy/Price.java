package com.mybatis.plus.strategy;

import java.math.BigDecimal;

/**
 * 
 * @ClassName: 
 * @Description: 
 * @author: wzf/290124
 * @version: V1.0
 * @date: 2019年8月16日 下午4:15:51
 * @Copyright: 抽象策略
 */
public interface Price {
	BigDecimal getPrice(BigDecimal price);
	
	/**
	 * @author wzf
	 * 会员,六折
	 **/
	@PriceRegion(min = 10000,max = 20000)
	class Member implements Price {
	    @Override
	    public BigDecimal getPrice(BigDecimal price) {
	        return price.multiply(new BigDecimal(0.6 + ""));
	    }
	}
	/**
	 * @author wzf
	 * 普通客户
	 **/
	@PriceRegion(max = 10000)
	class Ordinary implements Price {
	    @Override
	    public BigDecimal getPrice(BigDecimal price) {
	        return price;
	    }
	}
	/**
	 * @author wzf
	 * 超级会员,4折
	 **/ 
	@PriceRegion(min = 20000)
	class SuperMember implements Price{
	    @Override
	    public BigDecimal getPrice(BigDecimal price) {
	        return price.multiply(new BigDecimal(0.4+""));
	    }
	}

}
