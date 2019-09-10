package com.iqc.system.daomanager.impl;

import com.iqc.system.daomanager.SysUserRoleDaoManager;
import com.iqc.system.dbo.SysUserRoleDO;
import com.iqc.system.daomanager.immutable.impl.ImmutableSysUserRoleDaoManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.iqc.system.mapper.SysUserRoleMapper;
import com.iqc.system.dao.SysUserRoleDao;

import java.util.HashMap;
import java.util.Map;

@Component
public class SysUserRoleDaoManagerImpl extends  ImmutableSysUserRoleDaoManagerImpl implements SysUserRoleDaoManager{


    @Autowired
    private SysUserRoleDao sysUserRoleDao;

}
