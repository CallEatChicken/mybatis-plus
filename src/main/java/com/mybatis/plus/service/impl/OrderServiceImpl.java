package com.mybatis.plus.service.impl;

import com.mybatis.plus.bean.Order;
import com.mybatis.plus.mapper.OrderMapper;
import com.mybatis.plus.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wzf
 * @since 2019-07-24
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
