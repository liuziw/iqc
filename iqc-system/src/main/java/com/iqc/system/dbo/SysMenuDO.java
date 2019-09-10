package com.iqc.system.dbo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class SysMenuDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="sys_menu";




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
     *权限名
     *name
     */
    public static final String  NAME="name";

    /**
     *权限名
     *name
     */
    public static final String  DB_NAME="name";

    /**
     *别名
     *alias
     */
    public static final String  ALIAS="alias";

    /**
     *别名
     *alias
     */
    public static final String  DB_ALIAS="alias";

    /**
     *描述
     *description
     */
    public static final String  DESCRIPTION="description";

    /**
     *描述
     *description
     */
    public static final String  DB_DESCRIPTION="description";

    /**
     *pid
     *pid
     */
    public static final String  PID="pid";

    /**
     *pid
     *pid
     */
    public static final String  DB_PID="pid";

    /**
     *类型，枚举定义:DIR(0,目录);MENU(1,菜单);OPERATOR(3,,按钮);
     *type
     */
    public static final String  TYPE="type";

    /**
     *类型，枚举定义:DIR(0,目录);MENU(1,菜单);OPERATOR(3,,按钮);
     *type
     */
    public static final String  DB_TYPE="type";

    /**
     *排序
     *ordernum
     */
    public static final String  ORDERNUM="ordernum";

    /**
     *排序
     *ordernum
     */
    public static final String  DB_ORDERNUM="ordernum";

    /**
     *图标
     *icon
     */
    public static final String  ICON="icon";

    /**
     *图标
     *icon
     */
    public static final String  DB_ICON="icon";

    /**
     *权限
     *perms
     */
    public static final String  PERMS="perms";

    /**
     *权限
     *perms
     */
    public static final String  DB_PERMS="perms";

    /**
     *url
     *url
     */
    public static final String  URL="url";

    /**
     *url
     *url
     */
    public static final String  DB_URL="url";

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
     *
     */
    @ApiModelProperty(value = "")
    private Long id;


    /**
     *权限名
     */
    @ApiModelProperty(value = "权限名")
    private String name;


    /**
     *别名
     */
    @ApiModelProperty(value = "别名")
    private String alias;


    /**
     *描述
     */
    @ApiModelProperty(value = "描述")
    private String description;


    /**
     *pid
     */
    @ApiModelProperty(value = "pid")
    private Long pid;


    /**
     *类型，枚举定义:DIR(0,目录);MENU(1,菜单);OPERATOR(3,,按钮);
     */
    @ApiModelProperty(value = "类型，枚举定义:DIR(0,目录);MENU(1,菜单);OPERATOR(3,,按钮);")
    private Integer type;


    /**
     *排序
     */
    @ApiModelProperty(value = "排序")
    private Integer ordernum;


    /**
     *图标
     */
    @ApiModelProperty(value = "图标")
    private String icon;


    /**
     *权限
     */
    @ApiModelProperty(value = "权限")
    private String perms;


    /**
     *url
     */
    @ApiModelProperty(value = "url")
    private String url;


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


    /**
     *是否删除：0未删除，1已删除
     */
    @ApiModelProperty(value = "是否删除：0未删除，1已删除")
    private Integer isDeleted;
}

