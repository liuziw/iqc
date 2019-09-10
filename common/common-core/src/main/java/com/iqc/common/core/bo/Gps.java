package com.iqc.common.core.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuziw
 */
@Data
@ApiModel("gps坐标实体")
public class Gps {

    @ApiModelProperty("坐标Y,纬度")
    private String latitude;

    @ApiModelProperty("坐标X,经度")
    private String longitude;

}
