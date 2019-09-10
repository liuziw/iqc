package com.iqc.system.dto.sys;

import com.iqc.common.dao.dto.PageQueryItemDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuziw
 * @date 2019/8/12 10:54
 */
@Data
@ApiModel("系统日志请求实体")
public class SysLogDTO extends PageQueryItemDTO {


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
     *IP地址
     */
    @ApiModelProperty(value = "IP地址")
    private String ip;
}
