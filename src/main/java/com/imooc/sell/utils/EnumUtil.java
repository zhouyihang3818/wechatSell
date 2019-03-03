package com.imooc.sell.utils;

import com.imooc.sell.enums.CodeEnum;

/**
 * @author yihangZhou
 * @create 2019-01-21 21:21
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
        for (T each: enumClass.getEnumConstants()){
            if(code.equals(each.getCode())){
                return each;
            }
        }
        return null;

    }

}
