package com.iqc.system.daomanager.immutable.impl;

import com.iqc.system.dbo.SysLogDO;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Date;
import com.iqc.common.dao.daomanager.CommonDaoManager;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;
import com.iqc.system.daomanager.immutable.ImmutableSysLogDaoManager;
import com.iqc.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.iqc.system.mapper.SysLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import java.util.ArrayList;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableSysLogDaoManagerImpl extends CommonDaoManagerImpl<SysLogDO,Long> implements ImmutableSysLogDaoManager {

        @Autowired
        private SysLogMapper sysLogMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(sysLogMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(SysLogDO.ID,SysLogDO.DB_ID);
            fieldMap.put(SysLogDO.DB_ID,SysLogDO.DB_ID);

            fieldMap.put(SysLogDO.USERNAME,SysLogDO.DB_USERNAME);
            fieldMap.put(SysLogDO.DB_USERNAME,SysLogDO.DB_USERNAME);

            fieldMap.put(SysLogDO.OPERATION,SysLogDO.DB_OPERATION);
            fieldMap.put(SysLogDO.DB_OPERATION,SysLogDO.DB_OPERATION);

            fieldMap.put(SysLogDO.METHOD,SysLogDO.DB_METHOD);
            fieldMap.put(SysLogDO.DB_METHOD,SysLogDO.DB_METHOD);

            fieldMap.put(SysLogDO.PARAMS,SysLogDO.DB_PARAMS);
            fieldMap.put(SysLogDO.DB_PARAMS,SysLogDO.DB_PARAMS);

            fieldMap.put(SysLogDO.TIME,SysLogDO.DB_TIME);
            fieldMap.put(SysLogDO.DB_TIME,SysLogDO.DB_TIME);

            fieldMap.put(SysLogDO.IP,SysLogDO.DB_IP);
            fieldMap.put(SysLogDO.DB_IP,SysLogDO.DB_IP);

            fieldMap.put(SysLogDO.IS_DELETED,SysLogDO.DB_IS_DELETED);
            fieldMap.put(SysLogDO.DB_IS_DELETED,SysLogDO.DB_IS_DELETED);

            fieldMap.put(SysLogDO.GMT_CREATE,SysLogDO.DB_GMT_CREATE);
            fieldMap.put(SysLogDO.DB_GMT_CREATE,SysLogDO.DB_GMT_CREATE);

            fieldMap.put(SysLogDO.GMT_MODIFIED,SysLogDO.DB_GMT_MODIFIED);
            fieldMap.put(SysLogDO.DB_GMT_MODIFIED,SysLogDO.DB_GMT_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public SysLogDO getById(Long id){
            return this.sysLogMapper.getById(id);
        }



        public List<SysLogDO> listById(Long id, String... fieldNames){
            return this.sysLogMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysLogDO> mapById(Long id, String... fieldNames){
            return this.sysLogMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.sysLogMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(SysLogDO updateDO, Long id){

            return this.sysLogMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(SysLogDO updateDO,  Long id){

            return this.sysLogMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.sysLogMapper.deleteById(id);
        }



        public List<SysLogDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.sysLogMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysLogDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.sysLogMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.sysLogMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(SysLogDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }

            return this.sysLogMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(SysLogDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }

            return this.sysLogMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.sysLogMapper.deleteByInId(idList);
        }


        public List<SysLogDO> listByUsername(String username, String... fieldNames){
            return this.sysLogMapper.listByUsername(username,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysLogDO> mapByUsername(String username, String... fieldNames){
            return this.sysLogMapper.mapByUsername(username,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUsername(String username){
            return this.sysLogMapper.countByUsername(username);
        }

        public Integer updateNotNullFieldsByUsername(SysLogDO updateDO, String username){

            return this.sysLogMapper.updateNotNullFieldsByUsername(updateDO,username);
        }

        public Integer updateAllFieldsByUsername(SysLogDO updateDO,  String username){

            return this.sysLogMapper.updateAllFieldsByUsername(updateDO,username);
        }

        public Integer deleteByUsername( String username){
            return this.sysLogMapper.deleteByUsername(username);
        }



        public List<SysLogDO> listByInUsername(Collection<String> usernameList, String... fieldNames){
            if(CollectionUtils.isEmpty(usernameList)){
                return new ArrayList<>(0);
            }
            return this.sysLogMapper.listByInUsername(usernameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysLogDO> mapByInUsername(Collection<String> usernameList, String... fieldNames){
            if(CollectionUtils.isEmpty(usernameList)){
                 return new HashMap<>();
            }
            return this.sysLogMapper.mapByInUsername(usernameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUsername(Collection<String> usernameList){
            if(CollectionUtils.isEmpty(usernameList)){
                   return 0;
             }
            return this.sysLogMapper.countByInUsername(usernameList);
        }

        public Integer updateNotNullFieldsByInUsername(SysLogDO updateDO, Collection<String> usernameList){
            if(CollectionUtils.isEmpty(usernameList)){
                  return 0;
             }

            return this.sysLogMapper.updateNotNullFieldsByInUsername(updateDO,usernameList);
        }

        public Integer updateAllFieldsByInUsername(SysLogDO updateDO,  Collection<String> usernameList){
            if(CollectionUtils.isEmpty(usernameList)){
                           return 0;
             }

            return this.sysLogMapper.updateAllFieldsByInUsername(updateDO,usernameList);
        }

        public Integer deleteByInUsername( Collection<String> usernameList){
            if(CollectionUtils.isEmpty(usernameList)){
                           return 0;
             }
            return this.sysLogMapper.deleteByInUsername(usernameList);
        }


        public List<SysLogDO> listByOperation(String operation, String... fieldNames){
            return this.sysLogMapper.listByOperation(operation,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysLogDO> mapByOperation(String operation, String... fieldNames){
            return this.sysLogMapper.mapByOperation(operation,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByOperation(String operation){
            return this.sysLogMapper.countByOperation(operation);
        }

        public Integer updateNotNullFieldsByOperation(SysLogDO updateDO, String operation){

            return this.sysLogMapper.updateNotNullFieldsByOperation(updateDO,operation);
        }

        public Integer updateAllFieldsByOperation(SysLogDO updateDO,  String operation){

            return this.sysLogMapper.updateAllFieldsByOperation(updateDO,operation);
        }

        public Integer deleteByOperation( String operation){
            return this.sysLogMapper.deleteByOperation(operation);
        }



        public List<SysLogDO> listByInOperation(Collection<String> operationList, String... fieldNames){
            if(CollectionUtils.isEmpty(operationList)){
                return new ArrayList<>(0);
            }
            return this.sysLogMapper.listByInOperation(operationList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysLogDO> mapByInOperation(Collection<String> operationList, String... fieldNames){
            if(CollectionUtils.isEmpty(operationList)){
                 return new HashMap<>();
            }
            return this.sysLogMapper.mapByInOperation(operationList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInOperation(Collection<String> operationList){
            if(CollectionUtils.isEmpty(operationList)){
                   return 0;
             }
            return this.sysLogMapper.countByInOperation(operationList);
        }

        public Integer updateNotNullFieldsByInOperation(SysLogDO updateDO, Collection<String> operationList){
            if(CollectionUtils.isEmpty(operationList)){
                  return 0;
             }

            return this.sysLogMapper.updateNotNullFieldsByInOperation(updateDO,operationList);
        }

        public Integer updateAllFieldsByInOperation(SysLogDO updateDO,  Collection<String> operationList){
            if(CollectionUtils.isEmpty(operationList)){
                           return 0;
             }

            return this.sysLogMapper.updateAllFieldsByInOperation(updateDO,operationList);
        }

        public Integer deleteByInOperation( Collection<String> operationList){
            if(CollectionUtils.isEmpty(operationList)){
                           return 0;
             }
            return this.sysLogMapper.deleteByInOperation(operationList);
        }


        public List<SysLogDO> listByMethod(String method, String... fieldNames){
            return this.sysLogMapper.listByMethod(method,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysLogDO> mapByMethod(String method, String... fieldNames){
            return this.sysLogMapper.mapByMethod(method,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByMethod(String method){
            return this.sysLogMapper.countByMethod(method);
        }

        public Integer updateNotNullFieldsByMethod(SysLogDO updateDO, String method){

            return this.sysLogMapper.updateNotNullFieldsByMethod(updateDO,method);
        }

        public Integer updateAllFieldsByMethod(SysLogDO updateDO,  String method){

            return this.sysLogMapper.updateAllFieldsByMethod(updateDO,method);
        }

        public Integer deleteByMethod( String method){
            return this.sysLogMapper.deleteByMethod(method);
        }



        public List<SysLogDO> listByInMethod(Collection<String> methodList, String... fieldNames){
            if(CollectionUtils.isEmpty(methodList)){
                return new ArrayList<>(0);
            }
            return this.sysLogMapper.listByInMethod(methodList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysLogDO> mapByInMethod(Collection<String> methodList, String... fieldNames){
            if(CollectionUtils.isEmpty(methodList)){
                 return new HashMap<>();
            }
            return this.sysLogMapper.mapByInMethod(methodList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInMethod(Collection<String> methodList){
            if(CollectionUtils.isEmpty(methodList)){
                   return 0;
             }
            return this.sysLogMapper.countByInMethod(methodList);
        }

        public Integer updateNotNullFieldsByInMethod(SysLogDO updateDO, Collection<String> methodList){
            if(CollectionUtils.isEmpty(methodList)){
                  return 0;
             }

            return this.sysLogMapper.updateNotNullFieldsByInMethod(updateDO,methodList);
        }

        public Integer updateAllFieldsByInMethod(SysLogDO updateDO,  Collection<String> methodList){
            if(CollectionUtils.isEmpty(methodList)){
                           return 0;
             }

            return this.sysLogMapper.updateAllFieldsByInMethod(updateDO,methodList);
        }

        public Integer deleteByInMethod( Collection<String> methodList){
            if(CollectionUtils.isEmpty(methodList)){
                           return 0;
             }
            return this.sysLogMapper.deleteByInMethod(methodList);
        }


        public List<SysLogDO> listByParams(String params, String... fieldNames){
            return this.sysLogMapper.listByParams(params,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysLogDO> mapByParams(String params, String... fieldNames){
            return this.sysLogMapper.mapByParams(params,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByParams(String params){
            return this.sysLogMapper.countByParams(params);
        }

        public Integer updateNotNullFieldsByParams(SysLogDO updateDO, String params){

            return this.sysLogMapper.updateNotNullFieldsByParams(updateDO,params);
        }

        public Integer updateAllFieldsByParams(SysLogDO updateDO,  String params){

            return this.sysLogMapper.updateAllFieldsByParams(updateDO,params);
        }

        public Integer deleteByParams( String params){
            return this.sysLogMapper.deleteByParams(params);
        }



        public List<SysLogDO> listByInParams(Collection<String> paramsList, String... fieldNames){
            if(CollectionUtils.isEmpty(paramsList)){
                return new ArrayList<>(0);
            }
            return this.sysLogMapper.listByInParams(paramsList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysLogDO> mapByInParams(Collection<String> paramsList, String... fieldNames){
            if(CollectionUtils.isEmpty(paramsList)){
                 return new HashMap<>();
            }
            return this.sysLogMapper.mapByInParams(paramsList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInParams(Collection<String> paramsList){
            if(CollectionUtils.isEmpty(paramsList)){
                   return 0;
             }
            return this.sysLogMapper.countByInParams(paramsList);
        }

        public Integer updateNotNullFieldsByInParams(SysLogDO updateDO, Collection<String> paramsList){
            if(CollectionUtils.isEmpty(paramsList)){
                  return 0;
             }

            return this.sysLogMapper.updateNotNullFieldsByInParams(updateDO,paramsList);
        }

        public Integer updateAllFieldsByInParams(SysLogDO updateDO,  Collection<String> paramsList){
            if(CollectionUtils.isEmpty(paramsList)){
                           return 0;
             }

            return this.sysLogMapper.updateAllFieldsByInParams(updateDO,paramsList);
        }

        public Integer deleteByInParams( Collection<String> paramsList){
            if(CollectionUtils.isEmpty(paramsList)){
                           return 0;
             }
            return this.sysLogMapper.deleteByInParams(paramsList);
        }


        public List<SysLogDO> listByTime(Long time, String... fieldNames){
            return this.sysLogMapper.listByTime(time,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysLogDO> mapByTime(Long time, String... fieldNames){
            return this.sysLogMapper.mapByTime(time,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByTime(Long time){
            return this.sysLogMapper.countByTime(time);
        }

        public Integer updateNotNullFieldsByTime(SysLogDO updateDO, Long time){

            return this.sysLogMapper.updateNotNullFieldsByTime(updateDO,time);
        }

        public Integer updateAllFieldsByTime(SysLogDO updateDO,  Long time){

            return this.sysLogMapper.updateAllFieldsByTime(updateDO,time);
        }

        public Integer deleteByTime( Long time){
            return this.sysLogMapper.deleteByTime(time);
        }



        public List<SysLogDO> listByInTime(Collection<Long> timeList, String... fieldNames){
            if(CollectionUtils.isEmpty(timeList)){
                return new ArrayList<>(0);
            }
            return this.sysLogMapper.listByInTime(timeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysLogDO> mapByInTime(Collection<Long> timeList, String... fieldNames){
            if(CollectionUtils.isEmpty(timeList)){
                 return new HashMap<>();
            }
            return this.sysLogMapper.mapByInTime(timeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInTime(Collection<Long> timeList){
            if(CollectionUtils.isEmpty(timeList)){
                   return 0;
             }
            return this.sysLogMapper.countByInTime(timeList);
        }

        public Integer updateNotNullFieldsByInTime(SysLogDO updateDO, Collection<Long> timeList){
            if(CollectionUtils.isEmpty(timeList)){
                  return 0;
             }

            return this.sysLogMapper.updateNotNullFieldsByInTime(updateDO,timeList);
        }

        public Integer updateAllFieldsByInTime(SysLogDO updateDO,  Collection<Long> timeList){
            if(CollectionUtils.isEmpty(timeList)){
                           return 0;
             }

            return this.sysLogMapper.updateAllFieldsByInTime(updateDO,timeList);
        }

        public Integer deleteByInTime( Collection<Long> timeList){
            if(CollectionUtils.isEmpty(timeList)){
                           return 0;
             }
            return this.sysLogMapper.deleteByInTime(timeList);
        }


        public List<SysLogDO> listByIp(String ip, String... fieldNames){
            return this.sysLogMapper.listByIp(ip,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysLogDO> mapByIp(String ip, String... fieldNames){
            return this.sysLogMapper.mapByIp(ip,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByIp(String ip){
            return this.sysLogMapper.countByIp(ip);
        }

        public Integer updateNotNullFieldsByIp(SysLogDO updateDO, String ip){

            return this.sysLogMapper.updateNotNullFieldsByIp(updateDO,ip);
        }

        public Integer updateAllFieldsByIp(SysLogDO updateDO,  String ip){

            return this.sysLogMapper.updateAllFieldsByIp(updateDO,ip);
        }

        public Integer deleteByIp( String ip){
            return this.sysLogMapper.deleteByIp(ip);
        }



        public List<SysLogDO> listByInIp(Collection<String> ipList, String... fieldNames){
            if(CollectionUtils.isEmpty(ipList)){
                return new ArrayList<>(0);
            }
            return this.sysLogMapper.listByInIp(ipList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysLogDO> mapByInIp(Collection<String> ipList, String... fieldNames){
            if(CollectionUtils.isEmpty(ipList)){
                 return new HashMap<>();
            }
            return this.sysLogMapper.mapByInIp(ipList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInIp(Collection<String> ipList){
            if(CollectionUtils.isEmpty(ipList)){
                   return 0;
             }
            return this.sysLogMapper.countByInIp(ipList);
        }

        public Integer updateNotNullFieldsByInIp(SysLogDO updateDO, Collection<String> ipList){
            if(CollectionUtils.isEmpty(ipList)){
                  return 0;
             }

            return this.sysLogMapper.updateNotNullFieldsByInIp(updateDO,ipList);
        }

        public Integer updateAllFieldsByInIp(SysLogDO updateDO,  Collection<String> ipList){
            if(CollectionUtils.isEmpty(ipList)){
                           return 0;
             }

            return this.sysLogMapper.updateAllFieldsByInIp(updateDO,ipList);
        }

        public Integer deleteByInIp( Collection<String> ipList){
            if(CollectionUtils.isEmpty(ipList)){
                           return 0;
             }
            return this.sysLogMapper.deleteByInIp(ipList);
        }


}

