package com.imooc.sell.service;

import com.imooc.sell.dataobject.SellerInfo;


/**
 * @author yihangZhou
 * @create 2019-01-24 22:14
 */

public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
