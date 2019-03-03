package com.imooc.sell.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author yihangZhou
 * @create 2019-01-24 16:36
 */
@Data
public class ProductForm {

    private String productId;

    /**名字*/
    private String productName;

    /**价格*/
    private BigDecimal productPrice;

    /**库存*/
    private Integer productStock;

    /**描述*/
    private String productDescription;

    /**小图*/
    private String productIcon;

    /**类目编号*/
    private Integer categoryType;

}
