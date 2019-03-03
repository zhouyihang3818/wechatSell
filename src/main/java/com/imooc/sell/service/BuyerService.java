package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * @author yihangZhou
 * @create 2019-01-07 10:35
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消一个订单
    OrderDTO cancelOrder(String openid, String orderId);

}
