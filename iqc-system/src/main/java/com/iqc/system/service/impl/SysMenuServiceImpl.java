package com.iqc.system.service.impl;

import com.iqc.system.bo.MenuBO;
import com.iqc.system.service.SysMenuService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuziw
 * @date 2019/8/12 18:10
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Override
    public List<MenuBO> getAllMenus() {
        return null;
    }

    @Override
    public List<MenuBO> getPermissionByUid(Long userId) {
        return null;
    }
}
