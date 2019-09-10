package com.iqc.system.daomanager.impl;

import com.iqc.system.daomanager.SysUserDaoManager;
import com.iqc.system.dbo.SysUserDO;
import com.iqc.system.daomanager.immutable.impl.ImmutableSysUserDaoManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.iqc.system.mapper.SysUserMapper;
import com.iqc.system.dao.SysUserDao;

import java.util.HashMap;
import java.util.Map;

@Component
public class SysUserDaoManagerImpl extends  ImmutableSysUserDaoManagerImpl implements SysUserDaoManager{


    @Autowired
    private SysUserDao sysUserDao;

}
