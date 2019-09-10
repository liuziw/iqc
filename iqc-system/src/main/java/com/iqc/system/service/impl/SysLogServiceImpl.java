package com.iqc.system.service.impl;

import com.iqc.common.core.bo.PageBO;
import com.iqc.common.core.exception.CommonException;
import com.iqc.common.core.util.CommonUtils;
import com.iqc.common.dao.dto.QueryItemDTO;
import com.iqc.common.dao.util.DaoUtils;
import com.iqc.system.daomanager.SysLogDaoManager;
import com.iqc.system.dbo.SysLogDO;
import com.iqc.system.dto.sys.SysLogDTO;
import com.iqc.system.service.SysLogService;
import com.iqc.system.vo.SysLogVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuziw
 * @date 2019/8/12 10:47
 */
@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogDaoManager sysLogDaoManager;

    @Override
    public Integer addSysLog(SysLogDO sysLogDO) {
        if(sysLogDO == null){
            throw CommonException.exception("日志对象不能为空");
        }
        return sysLogDaoManager.insertNotNullProperties(sysLogDO);
    }

    /**
     * 分页查询系统日志
     * <pre>
     *     1.如果请求体为空则返回空数组（请求体中必须包含分页信息）
     *     2.拼接查询条件，执行分页查询
     *     3.将DO转为VO
     *     4.返回
     * </pre>
     * @param dto
     * @return
     */
    @Override
    public PageBO<SysLogVO> querySysLog(SysLogDTO dto) {
        if(dto == null){
            return new PageBO<>();
        }
        List<QueryItemDTO> conditions = new ArrayList<>();
        if(!StringUtils.isEmpty(dto.getUsername())){
            conditions.add(DaoUtils.buildLike(SysLogDO.DB_USERNAME,"%"+dto.getUsername()+"%"));
        }
        if(!StringUtils.isEmpty(dto.getOperation())){
            conditions.add(DaoUtils.buildLike(SysLogDO.DB_OPERATION,"%"+dto.getOperation()+"%"));
        }
        if(!StringUtils.isEmpty(dto.getIp())){
            conditions.add(DaoUtils.buildEqualTo(SysLogDO.DB_IP,dto.getIp()));
        }
        dto.setQueryItems(conditions);
        dto.setSortType("desc");
        PageBO<SysLogDO> sysLogDOPageBO =sysLogDaoManager.pageQuery(dto);
        if(sysLogDOPageBO == null){
            return new PageBO<>();
        }
        List<SysLogDO> sysLogDOList = sysLogDOPageBO.getList();
        List<SysLogVO> sysLogVOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(sysLogDOList)){
            for(SysLogDO sysLogDO:sysLogDOList){
                SysLogVO sysLogVO = CommonUtils.newInstance(sysLogDO,SysLogVO.class);
                sysLogVOList.add(sysLogVO);
            }
        }
        PageBO<SysLogVO> sysLogVOPage = CommonUtils.newInstance(sysLogDOPageBO,PageBO.class);
        sysLogVOPage.setList(sysLogVOList);
        return sysLogVOPage;
    }

    @Override
    public void insertOptrLog(Long userId, Long appId, String mainModel, String subModel, String optrDesc, String optrTarget) {

    }

    @Override
    public void insertOptrLog(Long appId, String mainModel, String subModel, String optrDesc, String optrTarget) {

    }
}
