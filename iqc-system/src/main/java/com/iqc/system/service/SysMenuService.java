package com.iqc.system.service;

import com.iqc.system.bo.MenuBO;

import java.util.List;

/**
 * @author liuziw
 * @date 2019/8/12 17:54
 */
public interface SysMenuService {
    List<MenuBO> getAllMenus();

    List<MenuBO> getPermissionByUid(Long userId);
}
