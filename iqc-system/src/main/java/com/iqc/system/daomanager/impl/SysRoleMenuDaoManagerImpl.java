package com.iqc.system.daomanager.impl;

import com.iqc.system.daomanager.SysRoleMenuDaoManager;
import com.iqc.system.dbo.SysRoleMenuDO;
import com.iqc.system.daomanager.immutable.impl.ImmutableSysRoleMenuDaoManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.iqc.system.mapper.SysRoleMenuMapper;
import com.iqc.system.dao.SysRoleMenuDao;

import java.util.HashMap;
import java.util.Map;

@Component
public class SysRoleMenuDaoManagerImpl extends  ImmutableSysRoleMenuDaoManagerImpl implements SysRoleMenuDaoManager{


    @Autowired
    private SysRoleMenuDao sysRoleMenuDao;

}
