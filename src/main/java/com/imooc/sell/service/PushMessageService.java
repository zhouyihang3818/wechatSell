package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * 推送消息
 * @author yihangZhou
 * @create 2019-01-25 23:11
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
