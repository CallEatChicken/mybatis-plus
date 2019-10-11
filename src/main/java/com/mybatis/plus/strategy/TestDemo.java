package com.mybatis.plus.strategy;

import java.math.BigDecimal;

/**
 * 
 * @ClassName: 
 * @Description: 
 * @author: wzf/290124
 * @version: V1.0
 * @date: 2019年8月16日 下午4:19:20
 * @Copyright: 
 */
public class TestDemo {

	
	 public static void main(String[] args) throws Exception {
	        PriceContext priceContext = new PriceContext();
	        System.out.println(priceContext.getPrice(new BigDecimal(200)));
	        System.out.println(priceContext.getPrice(new BigDecimal(11100)));
	        System.out.println(priceContext.getPrice(new BigDecimal(30000)));
	 }
	 
	 
}
