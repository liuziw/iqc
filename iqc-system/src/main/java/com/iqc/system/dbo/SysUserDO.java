package com.iqc.system.dbo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class SysUserDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="sys_user";




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
     *姓名
     *name
     */
    public static final String  NAME="name";

    /**
     *姓名
     *name
     */
    public static final String  DB_NAME="name";

    /**
     *账号
     *username
     */
    public static final String  USERNAME="username";

    /**
     *账号
     *username
     */
    public static final String  DB_USERNAME="username";

    /**
     *密码
     *password
     */
    public static final String  PASSWORD="password";

    /**
     *密码
     *password
     */
    public static final String  DB_PASSWORD="password";

    /**
     *所属组织id
     *orgid
     */
    public static final String  ORGID="orgid";

    /**
     *所属组织id
     *orgid
     */
    public static final String  DB_ORGID="orgid";

    /**
     *用户状态0无效1有效
     *status
     */
    public static final String  STATUS="status";

    /**
     *用户状态0无效1有效
     *status
     */
    public static final String  DB_STATUS="status";

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
     *姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;


    /**
     *账号
     */
    @ApiModelProperty(value = "账号")
    private String username;


    /**
     *密码
     */
    @ApiModelProperty(value = "密码")
    private String password;


    /**
     *所属组织id
     */
    @ApiModelProperty(value = "所属组织id")
    private Long orgid;


    /**
     *用户状态0无效1有效
     */
    @ApiModelProperty(value = "用户状态0无效1有效")
    private Integer status;


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

