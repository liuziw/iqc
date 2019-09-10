package com.iqc.system.dbo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class SysRoleDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="sys_role";




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
     *名称
     *name
     */
    public static final String  NAME="name";

    /**
     *名称
     *name
     */
    public static final String  DB_NAME="name";

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
     *
     *rolekey
     */
    public static final String  ROLEKEY="rolekey";

    /**
     *
     *rolekey
     */
    public static final String  DB_ROLEKEY="rolekey";

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
     *名称
     */
    @ApiModelProperty(value = "名称")
    private String name;


    /**
     *描述
     */
    @ApiModelProperty(value = "描述")
    private String description;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String rolekey;


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

