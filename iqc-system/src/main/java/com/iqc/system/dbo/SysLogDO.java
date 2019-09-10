package com.iqc.system.dbo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class SysLogDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="sys_log";




    //定义字段常量
    /**
     *
     *id
     */
    public static final String  ID="id";

    /**
     *
     *id
     */
    public static final String  DB_ID="id";

    /**
     *用户名
     *username
     */
    public static final String  USERNAME="username";

    /**
     *用户名
     *username
     */
    public static final String  DB_USERNAME="username";

    /**
     *用户操作
     *operation
     */
    public static final String  OPERATION="operation";

    /**
     *用户操作
     *operation
     */
    public static final String  DB_OPERATION="operation";

    /**
     *请求方法
     *method
     */
    public static final String  METHOD="method";

    /**
     *请求方法
     *method
     */
    public static final String  DB_METHOD="method";

    /**
     *请求参数
     *params
     */
    public static final String  PARAMS="params";

    /**
     *请求参数
     *params
     */
    public static final String  DB_PARAMS="params";

    /**
     *执行时长(毫秒)
     *time
     */
    public static final String  TIME="time";

    /**
     *执行时长(毫秒)
     *time
     */
    public static final String  DB_TIME="time";

    /**
     *IP地址
     *ip
     */
    public static final String  IP="ip";

    /**
     *IP地址
     *ip
     */
    public static final String  DB_IP="ip";

    /**
     *是否删除：0未删除，1已删除
     *isDeleted
     */
    public static final String  IS_DELETED="isDeleted";

    /**
     *是否删除：0未删除，1已删除
     *is_deleted
     */
    public static final String  DB_IS_DELETED="is_deleted";

    /**
     *创建时间
     *gmtCreate
     */
    public static final String  GMT_CREATE="gmtCreate";

    /**
     *创建时间
     *gmt_create
     */
    public static final String  DB_GMT_CREATE="gmt_create";

    /**
     *更新时间
     *gmtModified
     */
    public static final String  GMT_MODIFIED="gmtModified";

    /**
     *更新时间
     *gmt_modified
     */
    public static final String  DB_GMT_MODIFIED="gmt_modified";




    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long id;


    /**
     *用户名
     */
    @ApiModelProperty(value = "用户名")
    private String username;


    /**
     *用户操作
     */
    @ApiModelProperty(value = "用户操作")
    private String operation;


    /**
     *请求方法
     */
    @ApiModelProperty(value = "请求方法")
    private String method;


    /**
     *请求参数
     */
    @ApiModelProperty(value = "请求参数")
    private String params;


    /**
     *执行时长(毫秒)
     */
    @ApiModelProperty(value = "执行时长(毫秒)")
    private Long time;


    /**
     *IP地址
     */
    @ApiModelProperty(value = "IP地址")
    private String ip;


    /**
     *是否删除：0未删除，1已删除
     */
    @ApiModelProperty(value = "是否删除：0未删除，1已删除")
    private Integer isDeleted;


    /**
     *创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private java.util.Date gmtCreate;


    /**
     *更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private java.util.Date gmtModified;
}

