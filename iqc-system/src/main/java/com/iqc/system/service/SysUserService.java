package com.iqc.system.service;

import com.iqc.system.bo.UserBO;

/**
 * @author liuziw
 * @date 2019/8/12 17:56
 */
public interface SysUserService {

    UserBO login(String userName);
}
