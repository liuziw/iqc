package com.iqc.system.service;

import com.iqc.system.bo.RoleBO;

import java.util.List;

/**
 * @author liuziw
 * @date 2019/8/12 17:55
 */
public interface SysRoleService {

    List<RoleBO> getRolesByUsername(String userName);
}
