package com.iqc.api.vo;

import com.iqc.system.bo.UserBO;
import lombok.Data;

/**
 * @author liuziw
 * @date 2019/8/13 17:47
 */
@Data
public class LoginVO {

    private UserBO userInfo;

    private String redirectUri;

    private String message;
}
