package com.iqc.system.daomanager.immutable.impl;

import com.iqc.system.dbo.SysOrganizationDO;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Date;
import com.iqc.common.dao.daomanager.CommonDaoManager;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;
import com.iqc.system.daomanager.immutable.ImmutableSysOrganizationDaoManager;
import com.iqc.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.iqc.system.mapper.SysOrganizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import java.util.ArrayList;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableSysOrganizationDaoManagerImpl extends CommonDaoManagerImpl<SysOrganizationDO,Long> implements ImmutableSysOrganizationDaoManager {

        @Autowired
        private SysOrganizationMapper sysOrganizationMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(sysOrganizationMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(SysOrganizationDO.ID,SysOrganizationDO.DB_ID);
            fieldMap.put(SysOrganizationDO.DB_ID,SysOrganizationDO.DB_ID);

            fieldMap.put(SysOrganizationDO.NAME,SysOrganizationDO.DB_NAME);
            fieldMap.put(SysOrganizationDO.DB_NAME,SysOrganizationDO.DB_NAME);

            fieldMap.put(SysOrganizationDO.DESCRIPTION,SysOrganizationDO.DB_DESCRIPTION);
            fieldMap.put(SysOrganizationDO.DB_DESCRIPTION,SysOrganizationDO.DB_DESCRIPTION);

            fieldMap.put(SysOrganizationDO.PID,SysOrganizationDO.DB_PID);
            fieldMap.put(SysOrganizationDO.DB_PID,SysOrganizationDO.DB_PID);

            fieldMap.put(SysOrganizationDO.PATH,SysOrganizationDO.DB_PATH);
            fieldMap.put(SysOrganizationDO.DB_PATH,SysOrganizationDO.DB_PATH);

            fieldMap.put(SysOrganizationDO.IS_DELETED,SysOrganizationDO.DB_IS_DELETED);
            fieldMap.put(SysOrganizationDO.DB_IS_DELETED,SysOrganizationDO.DB_IS_DELETED);

            fieldMap.put(SysOrganizationDO.GMT_CREATE,SysOrganizationDO.DB_GMT_CREATE);
            fieldMap.put(SysOrganizationDO.DB_GMT_CREATE,SysOrganizationDO.DB_GMT_CREATE);

            fieldMap.put(SysOrganizationDO.GMT_MODIFIED,SysOrganizationDO.DB_GMT_MODIFIED);
            fieldMap.put(SysOrganizationDO.DB_GMT_MODIFIED,SysOrganizationDO.DB_GMT_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public SysOrganizationDO getById(Long id){
            return this.sysOrganizationMapper.getById(id);
        }



        public List<SysOrganizationDO> listById(Long id, String... fieldNames){
            return this.sysOrganizationMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysOrganizationDO> mapById(Long id, String... fieldNames){
            return this.sysOrganizationMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.sysOrganizationMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(SysOrganizationDO updateDO, Long id){

            return this.sysOrganizationMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(SysOrganizationDO updateDO,  Long id){

            return this.sysOrganizationMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.sysOrganizationMapper.deleteById(id);
        }



        public List<SysOrganizationDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.sysOrganizationMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysOrganizationDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.sysOrganizationMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.sysOrganizationMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(SysOrganizationDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }

            return this.sysOrganizationMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(SysOrganizationDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }

            return this.sysOrganizationMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.sysOrganizationMapper.deleteByInId(idList);
        }


        public List<SysOrganizationDO> listByName(String name, String... fieldNames){
            return this.sysOrganizationMapper.listByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysOrganizationDO> mapByName(String name, String... fieldNames){
            return this.sysOrganizationMapper.mapByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByName(String name){
            return this.sysOrganizationMapper.countByName(name);
        }

        public Integer updateNotNullFieldsByName(SysOrganizationDO updateDO, String name){

            return this.sysOrganizationMapper.updateNotNullFieldsByName(updateDO,name);
        }

        public Integer updateAllFieldsByName(SysOrganizationDO updateDO,  String name){

            return this.sysOrganizationMapper.updateAllFieldsByName(updateDO,name);
        }

        public Integer deleteByName( String name){
            return this.sysOrganizationMapper.deleteByName(name);
        }



        public List<SysOrganizationDO> listByInName(Collection<String> nameList, String... fieldNames){
            if(CollectionUtils.isEmpty(nameList)){
                return new ArrayList<>(0);
            }
            return this.sysOrganizationMapper.listByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysOrganizationDO> mapByInName(Collection<String> nameList, String... fieldNames){
            if(CollectionUtils.isEmpty(nameList)){
                 return new HashMap<>();
            }
            return this.sysOrganizationMapper.mapByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInName(Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                   return 0;
             }
            return this.sysOrganizationMapper.countByInName(nameList);
        }

        public Integer updateNotNullFieldsByInName(SysOrganizationDO updateDO, Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                  return 0;
             }

            return this.sysOrganizationMapper.updateNotNullFieldsByInName(updateDO,nameList);
        }

        public Integer updateAllFieldsByInName(SysOrganizationDO updateDO,  Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                           return 0;
             }

            return this.sysOrganizationMapper.updateAllFieldsByInName(updateDO,nameList);
        }

        public Integer deleteByInName( Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                           return 0;
             }
            return this.sysOrganizationMapper.deleteByInName(nameList);
        }


        public List<SysOrganizationDO> listByDescription(String description, String... fieldNames){
            return this.sysOrganizationMapper.listByDescription(description,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysOrganizationDO> mapByDescription(String description, String... fieldNames){
            return this.sysOrganizationMapper.mapByDescription(description,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDescription(String description){
            return this.sysOrganizationMapper.countByDescription(description);
        }

        public Integer updateNotNullFieldsByDescription(SysOrganizationDO updateDO, String description){

            return this.sysOrganizationMapper.updateNotNullFieldsByDescription(updateDO,description);
        }

        public Integer updateAllFieldsByDescription(SysOrganizationDO updateDO,  String description){

            return this.sysOrganizationMapper.updateAllFieldsByDescription(updateDO,description);
        }

        public Integer deleteByDescription( String description){
            return this.sysOrganizationMapper.deleteByDescription(description);
        }



        public List<SysOrganizationDO> listByInDescription(Collection<String> descriptionList, String... fieldNames){
            if(CollectionUtils.isEmpty(descriptionList)){
                return new ArrayList<>(0);
            }
            return this.sysOrganizationMapper.listByInDescription(descriptionList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysOrganizationDO> mapByInDescription(Collection<String> descriptionList, String... fieldNames){
            if(CollectionUtils.isEmpty(descriptionList)){
                 return new HashMap<>();
            }
            return this.sysOrganizationMapper.mapByInDescription(descriptionList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDescription(Collection<String> descriptionList){
            if(CollectionUtils.isEmpty(descriptionList)){
                   return 0;
             }
            return this.sysOrganizationMapper.countByInDescription(descriptionList);
        }

        public Integer updateNotNullFieldsByInDescription(SysOrganizationDO updateDO, Collection<String> descriptionList){
            if(CollectionUtils.isEmpty(descriptionList)){
                  return 0;
             }

            return this.sysOrganizationMapper.updateNotNullFieldsByInDescription(updateDO,descriptionList);
        }

        public Integer updateAllFieldsByInDescription(SysOrganizationDO updateDO,  Collection<String> descriptionList){
            if(CollectionUtils.isEmpty(descriptionList)){
                           return 0;
             }

            return this.sysOrganizationMapper.updateAllFieldsByInDescription(updateDO,descriptionList);
        }

        public Integer deleteByInDescription( Collection<String> descriptionList){
            if(CollectionUtils.isEmpty(descriptionList)){
                           return 0;
             }
            return this.sysOrganizationMapper.deleteByInDescription(descriptionList);
        }


        public List<SysOrganizationDO> listByPid(Long pid, String... fieldNames){
            return this.sysOrganizationMapper.listByPid(pid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysOrganizationDO> mapByPid(Long pid, String... fieldNames){
            return this.sysOrganizationMapper.mapByPid(pid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPid(Long pid){
            return this.sysOrganizationMapper.countByPid(pid);
        }

        public Integer updateNotNullFieldsByPid(SysOrganizationDO updateDO, Long pid){

            return this.sysOrganizationMapper.updateNotNullFieldsByPid(updateDO,pid);
        }

        public Integer updateAllFieldsByPid(SysOrganizationDO updateDO,  Long pid){

            return this.sysOrganizationMapper.updateAllFieldsByPid(updateDO,pid);
        }

        public Integer deleteByPid( Long pid){
            return this.sysOrganizationMapper.deleteByPid(pid);
        }



        public List<SysOrganizationDO> listByInPid(Collection<Long> pidList, String... fieldNames){
            if(CollectionUtils.isEmpty(pidList)){
                return new ArrayList<>(0);
            }
            return this.sysOrganizationMapper.listByInPid(pidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysOrganizationDO> mapByInPid(Collection<Long> pidList, String... fieldNames){
            if(CollectionUtils.isEmpty(pidList)){
                 return new HashMap<>();
            }
            return this.sysOrganizationMapper.mapByInPid(pidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPid(Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                   return 0;
             }
            return this.sysOrganizationMapper.countByInPid(pidList);
        }

        public Integer updateNotNullFieldsByInPid(SysOrganizationDO updateDO, Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                  return 0;
             }

            return this.sysOrganizationMapper.updateNotNullFieldsByInPid(updateDO,pidList);
        }

        public Integer updateAllFieldsByInPid(SysOrganizationDO updateDO,  Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                           return 0;
             }

            return this.sysOrganizationMapper.updateAllFieldsByInPid(updateDO,pidList);
        }

        public Integer deleteByInPid( Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                           return 0;
             }
            return this.sysOrganizationMapper.deleteByInPid(pidList);
        }


        public List<SysOrganizationDO> listByPath(String path, String... fieldNames){
            return this.sysOrganizationMapper.listByPath(path,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysOrganizationDO> mapByPath(String path, String... fieldNames){
            return this.sysOrganizationMapper.mapByPath(path,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPath(String path){
            return this.sysOrganizationMapper.countByPath(path);
        }

        public Integer updateNotNullFieldsByPath(SysOrganizationDO updateDO, String path){

            return this.sysOrganizationMapper.updateNotNullFieldsByPath(updateDO,path);
        }

        public Integer updateAllFieldsByPath(SysOrganizationDO updateDO,  String path){

            return this.sysOrganizationMapper.updateAllFieldsByPath(updateDO,path);
        }

        public Integer deleteByPath( String path){
            return this.sysOrganizationMapper.deleteByPath(path);
        }



        public List<SysOrganizationDO> listByInPath(Collection<String> pathList, String... fieldNames){
            if(CollectionUtils.isEmpty(pathList)){
                return new ArrayList<>(0);
            }
            return this.sysOrganizationMapper.listByInPath(pathList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysOrganizationDO> mapByInPath(Collection<String> pathList, String... fieldNames){
            if(CollectionUtils.isEmpty(pathList)){
                 return new HashMap<>();
            }
            return this.sysOrganizationMapper.mapByInPath(pathList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPath(Collection<String> pathList){
            if(CollectionUtils.isEmpty(pathList)){
                   return 0;
             }
            return this.sysOrganizationMapper.countByInPath(pathList);
        }

        public Integer updateNotNullFieldsByInPath(SysOrganizationDO updateDO, Collection<String> pathList){
            if(CollectionUtils.isEmpty(pathList)){
                  return 0;
             }

            return this.sysOrganizationMapper.updateNotNullFieldsByInPath(updateDO,pathList);
        }

        public Integer updateAllFieldsByInPath(SysOrganizationDO updateDO,  Collection<String> pathList){
            if(CollectionUtils.isEmpty(pathList)){
                           return 0;
             }

            return this.sysOrganizationMapper.updateAllFieldsByInPath(updateDO,pathList);
        }

        public Integer deleteByInPath( Collection<String> pathList){
            if(CollectionUtils.isEmpty(pathList)){
                           return 0;
             }
            return this.sysOrganizationMapper.deleteByInPath(pathList);
        }


}

