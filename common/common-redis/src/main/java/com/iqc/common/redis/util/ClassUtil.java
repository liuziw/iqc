package com.iqc.common.redis.util;

import java.lang.reflect.ParameterizedType;

/**
 * @author liuziw
 */
public class ClassUtil<D> {

    public Class<D> getTClass()
    {
        Class<D> tClass = (Class<D>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return tClass;
    }

}
