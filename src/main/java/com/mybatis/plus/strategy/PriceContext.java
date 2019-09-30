package com.mybatis.plus.strategy;

import java.math.BigDecimal;

/**
 * 
 * @ClassName: 
 * @Description: 上下文
 * @author: wzf/290124
 * @version: V1.0
 * @date: 2019年8月16日 下午4:17:05
 * @Copyright: 上下文
 */
public class PriceContext {
	BigDecimal getPrice(BigDecimal costPrice) throws Exception {
        Price price = PriceFactory.getInstance().getPrice(costPrice);
        return price.getPrice(costPrice);
    }
}
