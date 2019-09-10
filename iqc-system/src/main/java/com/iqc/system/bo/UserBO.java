package com.iqc.system.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author liuziw
 * @date 2019/8/12 18:02
 */
@Data
public class UserBO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *ID
     */
    @ApiModelProperty(value = "ID")
    private Long id;


    /**
     *用户账户
     */
    @ApiModelProperty(value = "用户账户")
    private String userAccount;



    /**
     *用户名
     */
    @ApiModelProperty(value = "用户名")
    private String userName;


    /**
     *手机号码
     */
    @ApiModelProperty(value = "手机号码")
    private String mobileNo;


    /**
     *邮箱地址
     */
    @ApiModelProperty(value = "邮箱地址")
    private String email;


    /**
     *出生年月
     */
    @ApiModelProperty(value = "出生年月")
    private java.util.Date birthday;


    /**
     *用户头像，对应资源表中的id
     */
    @ApiModelProperty(value = "用户头像，对应资源表中的id")
    private Long userPhoto;


    /**
     *枚举定义:MALE(1,男),FEMALE(0,女);
     */
    @ApiModelProperty(value = "枚举定义:MALE(1,男),FEMALE(0,女);")
    private Integer gender;


    /**
     *所属部门ID
     */
    @ApiModelProperty(value = "所属部门ID")
    private Long deptId;


    @ApiModelProperty("部门名称")
    private String deptName;



    @ApiModelProperty("角色信息")
    private Set<String> roles;

    @ApiModelProperty("角色IDs")
    private Set<Long> roleIds;

    @ApiModelProperty("权限信息")
    private Set<String> perms;

    @ApiModelProperty("App信息")
    private Set<String> apps;
}
