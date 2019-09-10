package com.iqc.system.daomanager.impl;

import com.iqc.system.daomanager.SysOrganizationDaoManager;
import com.iqc.system.dbo.SysOrganizationDO;
import com.iqc.system.daomanager.immutable.impl.ImmutableSysOrganizationDaoManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.iqc.system.mapper.SysOrganizationMapper;
import com.iqc.system.dao.SysOrganizationDao;

import java.util.HashMap;
import java.util.Map;

@Component
public class SysOrganizationDaoManagerImpl extends  ImmutableSysOrganizationDaoManagerImpl implements SysOrganizationDaoManager{


    @Autowired
    private SysOrganizationDao sysOrganizationDao;

}
