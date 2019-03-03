package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author yihangZhou
 * @create 2019-01-24 22:04
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String SellerId;

    private String username;

    private String password;

    private String openid;
}
