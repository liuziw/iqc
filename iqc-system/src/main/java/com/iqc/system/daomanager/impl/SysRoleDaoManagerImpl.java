package com.iqc.system.daomanager.impl;

import com.iqc.system.daomanager.SysRoleDaoManager;
import com.iqc.system.dbo.SysRoleDO;
import com.iqc.system.daomanager.immutable.impl.ImmutableSysRoleDaoManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.iqc.system.mapper.SysRoleMapper;
import com.iqc.system.dao.SysRoleDao;

import java.util.HashMap;
import java.util.Map;

@Component
public class SysRoleDaoManagerImpl extends  ImmutableSysRoleDaoManagerImpl implements SysRoleDaoManager{


    @Autowired
    private SysRoleDao sysRoleDao;

}
