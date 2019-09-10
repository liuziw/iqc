package com.iqc.system.daomanager.impl;

import com.iqc.system.daomanager.SysLogDaoManager;
import com.iqc.system.dbo.SysLogDO;
import com.iqc.system.daomanager.immutable.impl.ImmutableSysLogDaoManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.iqc.system.mapper.SysLogMapper;
import com.iqc.system.dao.SysLogDao;

import java.util.HashMap;
import java.util.Map;

@Component
public class SysLogDaoManagerImpl extends  ImmutableSysLogDaoManagerImpl implements SysLogDaoManager{


    @Autowired
    private SysLogDao sysLogDao;

}
