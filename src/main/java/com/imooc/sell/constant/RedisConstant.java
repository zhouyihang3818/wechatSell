package com.imooc.sell.constant;

import lombok.Data;

/**
 * @author yihangZhou
 * @create 2019-01-25 19:43
 */

public interface RedisConstant {

    String TOKEN_PREFIX = " token_%s";

    Integer EXPIRE = 7200;//2小时

}
