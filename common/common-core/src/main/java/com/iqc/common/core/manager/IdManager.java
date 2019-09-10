package com.iqc.common.core.manager;

/**
 *
 * ID的生成器
 * @author liuziw
 */
public interface IdManager {


    /**
     * 生成一个id，每次调用都是唯一的
     * @return
     */
    public Long createId();


    /**
     *  生成一个id，每次调用相同Key的情况下都是唯一的
     * @param key
     * @return
     */
    public Long createId(String key);

}
