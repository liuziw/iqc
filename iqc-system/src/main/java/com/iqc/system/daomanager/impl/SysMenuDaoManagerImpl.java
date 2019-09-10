package com.iqc.system.daomanager.impl;

import com.iqc.system.daomanager.SysMenuDaoManager;
import com.iqc.system.dbo.SysMenuDO;
import com.iqc.system.daomanager.immutable.impl.ImmutableSysMenuDaoManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.iqc.system.mapper.SysMenuMapper;
import com.iqc.system.dao.SysMenuDao;

import java.util.HashMap;
import java.util.Map;

@Component
public class SysMenuDaoManagerImpl extends  ImmutableSysMenuDaoManagerImpl implements SysMenuDaoManager{


    @Autowired
    private SysMenuDao sysMenuDao;

}
