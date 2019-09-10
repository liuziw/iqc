package com.iqc.system.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuziw
 * @date 2019/8/12 10:51
 */
@Data
public class SysLogVO {

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
     *创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private java.util.Date gmtCreate;

}
