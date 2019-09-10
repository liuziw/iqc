package com.iqc.system.service;

import com.iqc.common.core.bo.PageBO;
import com.iqc.system.dbo.SysLogDO;
import com.iqc.system.dto.sys.SysLogDTO;
import com.iqc.system.vo.SysLogVO;

/**
 * @author liuziw
 * @date 2019/8/12 10:43
 */
public interface SysLogService {

    /**
     * 添加系统日志
     * @param sysLogDO
     * @return
     */
    Integer addSysLog(SysLogDO sysLogDO);

    /**
     * 分页请求系统日志列表
     * @param dto
     * @return
     */
    PageBO<SysLogVO> querySysLog(SysLogDTO dto);



    /**
     * 插入日志
     * @param userId 用户
     * @param appId 应用id
     * @param mainModel 主模块
     * @param subModel 子模块
     * @param optrDesc 操作描述
     * @param optrTarget 操作对象
     */
    void insertOptrLog(Long userId,Long appId,String mainModel,String subModel,String optrDesc,String optrTarget);
    /**
     * 插入日志
     * @param appId 应用id
     * @param mainModel 主模块
     * @param subModel 子模块
     * @param optrDesc 操作描述
     * @param optrTarget 操作对象
     */
    void insertOptrLog(Long appId,String mainModel,String subModel,String optrDesc,String optrTarget);
}
