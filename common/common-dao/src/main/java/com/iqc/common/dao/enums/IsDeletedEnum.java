package com.iqc.common.dao.enums;

/**
 * 对应数据库中的is_delete字段.
 * @Author: liuziw
 */
public enum IsDeletedEnum {

    /**
     * 已经删除
     */
    DELETED(1,"已经删除"),
    /**
     * 未删除
     */
    NOT_DELETED(0,"未删除");

    private final Integer code;
    private final String desc;

    private IsDeletedEnum(Integer code,String desc){
        this.code=code;
        this.desc=desc;
    }
    public Integer getCode() {
        return code;
    }
    public String getDesc() {
        return desc;
    }


    @Override
    public String toString() {
        return "IsDeletedEnum{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
