package com.iqc.system.daomanager.immutable.impl;

import com.iqc.system.dbo.SysRoleDO;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Date;
import com.iqc.common.dao.daomanager.CommonDaoManager;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;
import com.iqc.system.daomanager.immutable.ImmutableSysRoleDaoManager;
import com.iqc.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.iqc.system.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import java.util.ArrayList;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableSysRoleDaoManagerImpl extends CommonDaoManagerImpl<SysRoleDO,Long> implements ImmutableSysRoleDaoManager {

        @Autowired
        private SysRoleMapper sysRoleMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(sysRoleMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(SysRoleDO.ID,SysRoleDO.DB_ID);
            fieldMap.put(SysRoleDO.DB_ID,SysRoleDO.DB_ID);

            fieldMap.put(SysRoleDO.NAME,SysRoleDO.DB_NAME);
            fieldMap.put(SysRoleDO.DB_NAME,SysRoleDO.DB_NAME);

            fieldMap.put(SysRoleDO.DESCRIPTION,SysRoleDO.DB_DESCRIPTION);
            fieldMap.put(SysRoleDO.DB_DESCRIPTION,SysRoleDO.DB_DESCRIPTION);

            fieldMap.put(SysRoleDO.ROLEKEY,SysRoleDO.DB_ROLEKEY);
            fieldMap.put(SysRoleDO.DB_ROLEKEY,SysRoleDO.DB_ROLEKEY);

            fieldMap.put(SysRoleDO.IS_DELETED,SysRoleDO.DB_IS_DELETED);
            fieldMap.put(SysRoleDO.DB_IS_DELETED,SysRoleDO.DB_IS_DELETED);

            fieldMap.put(SysRoleDO.GMT_CREATE,SysRoleDO.DB_GMT_CREATE);
            fieldMap.put(SysRoleDO.DB_GMT_CREATE,SysRoleDO.DB_GMT_CREATE);

            fieldMap.put(SysRoleDO.GMT_MODIFIED,SysRoleDO.DB_GMT_MODIFIED);
            fieldMap.put(SysRoleDO.DB_GMT_MODIFIED,SysRoleDO.DB_GMT_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public SysRoleDO getById(Long id){
            return this.sysRoleMapper.getById(id);
        }



        public List<SysRoleDO> listById(Long id, String... fieldNames){
            return this.sysRoleMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleDO> mapById(Long id, String... fieldNames){
            return this.sysRoleMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.sysRoleMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(SysRoleDO updateDO, Long id){

            return this.sysRoleMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(SysRoleDO updateDO,  Long id){

            return this.sysRoleMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.sysRoleMapper.deleteById(id);
        }



        public List<SysRoleDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.sysRoleMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.sysRoleMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.sysRoleMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(SysRoleDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }

            return this.sysRoleMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(SysRoleDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }

            return this.sysRoleMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.sysRoleMapper.deleteByInId(idList);
        }


        public List<SysRoleDO> listByName(String name, String... fieldNames){
            return this.sysRoleMapper.listByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleDO> mapByName(String name, String... fieldNames){
            return this.sysRoleMapper.mapByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByName(String name){
            return this.sysRoleMapper.countByName(name);
        }

        public Integer updateNotNullFieldsByName(SysRoleDO updateDO, String name){

            return this.sysRoleMapper.updateNotNullFieldsByName(updateDO,name);
        }

        public Integer updateAllFieldsByName(SysRoleDO updateDO,  String name){

            return this.sysRoleMapper.updateAllFieldsByName(updateDO,name);
        }

        public Integer deleteByName( String name){
            return this.sysRoleMapper.deleteByName(name);
        }



        public List<SysRoleDO> listByInName(Collection<String> nameList, String... fieldNames){
            if(CollectionUtils.isEmpty(nameList)){
                return new ArrayList<>(0);
            }
            return this.sysRoleMapper.listByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleDO> mapByInName(Collection<String> nameList, String... fieldNames){
            if(CollectionUtils.isEmpty(nameList)){
                 return new HashMap<>();
            }
            return this.sysRoleMapper.mapByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInName(Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                   return 0;
             }
            return this.sysRoleMapper.countByInName(nameList);
        }

        public Integer updateNotNullFieldsByInName(SysRoleDO updateDO, Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                  return 0;
             }

            return this.sysRoleMapper.updateNotNullFieldsByInName(updateDO,nameList);
        }

        public Integer updateAllFieldsByInName(SysRoleDO updateDO,  Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                           return 0;
             }

            return this.sysRoleMapper.updateAllFieldsByInName(updateDO,nameList);
        }

        public Integer deleteByInName( Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                           return 0;
             }
            return this.sysRoleMapper.deleteByInName(nameList);
        }


        public List<SysRoleDO> listByDescription(String description, String... fieldNames){
            return this.sysRoleMapper.listByDescription(description,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleDO> mapByDescription(String description, String... fieldNames){
            return this.sysRoleMapper.mapByDescription(description,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDescription(String description){
            return this.sysRoleMapper.countByDescription(description);
        }

        public Integer updateNotNullFieldsByDescription(SysRoleDO updateDO, String description){

            return this.sysRoleMapper.updateNotNullFieldsByDescription(updateDO,description);
        }

        public Integer updateAllFieldsByDescription(SysRoleDO updateDO,  String description){

            return this.sysRoleMapper.updateAllFieldsByDescription(updateDO,description);
        }

        public Integer deleteByDescription( String description){
            return this.sysRoleMapper.deleteByDescription(description);
        }



        public List<SysRoleDO> listByInDescription(Collection<String> descriptionList, String... fieldNames){
            if(CollectionUtils.isEmpty(descriptionList)){
                return new ArrayList<>(0);
            }
            return this.sysRoleMapper.listByInDescription(descriptionList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleDO> mapByInDescription(Collection<String> descriptionList, String... fieldNames){
            if(CollectionUtils.isEmpty(descriptionList)){
                 return new HashMap<>();
            }
            return this.sysRoleMapper.mapByInDescription(descriptionList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDescription(Collection<String> descriptionList){
            if(CollectionUtils.isEmpty(descriptionList)){
                   return 0;
             }
            return this.sysRoleMapper.countByInDescription(descriptionList);
        }

        public Integer updateNotNullFieldsByInDescription(SysRoleDO updateDO, Collection<String> descriptionList){
            if(CollectionUtils.isEmpty(descriptionList)){
                  return 0;
             }

            return this.sysRoleMapper.updateNotNullFieldsByInDescription(updateDO,descriptionList);
        }

        public Integer updateAllFieldsByInDescription(SysRoleDO updateDO,  Collection<String> descriptionList){
            if(CollectionUtils.isEmpty(descriptionList)){
                           return 0;
             }

            return this.sysRoleMapper.updateAllFieldsByInDescription(updateDO,descriptionList);
        }

        public Integer deleteByInDescription( Collection<String> descriptionList){
            if(CollectionUtils.isEmpty(descriptionList)){
                           return 0;
             }
            return this.sysRoleMapper.deleteByInDescription(descriptionList);
        }


        public List<SysRoleDO> listByRolekey(String rolekey, String... fieldNames){
            return this.sysRoleMapper.listByRolekey(rolekey,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleDO> mapByRolekey(String rolekey, String... fieldNames){
            return this.sysRoleMapper.mapByRolekey(rolekey,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByRolekey(String rolekey){
            return this.sysRoleMapper.countByRolekey(rolekey);
        }

        public Integer updateNotNullFieldsByRolekey(SysRoleDO updateDO, String rolekey){

            return this.sysRoleMapper.updateNotNullFieldsByRolekey(updateDO,rolekey);
        }

        public Integer updateAllFieldsByRolekey(SysRoleDO updateDO,  String rolekey){

            return this.sysRoleMapper.updateAllFieldsByRolekey(updateDO,rolekey);
        }

        public Integer deleteByRolekey( String rolekey){
            return this.sysRoleMapper.deleteByRolekey(rolekey);
        }



        public List<SysRoleDO> listByInRolekey(Collection<String> rolekeyList, String... fieldNames){
            if(CollectionUtils.isEmpty(rolekeyList)){
                return new ArrayList<>(0);
            }
            return this.sysRoleMapper.listByInRolekey(rolekeyList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleDO> mapByInRolekey(Collection<String> rolekeyList, String... fieldNames){
            if(CollectionUtils.isEmpty(rolekeyList)){
                 return new HashMap<>();
            }
            return this.sysRoleMapper.mapByInRolekey(rolekeyList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInRolekey(Collection<String> rolekeyList){
            if(CollectionUtils.isEmpty(rolekeyList)){
                   return 0;
             }
            return this.sysRoleMapper.countByInRolekey(rolekeyList);
        }

        public Integer updateNotNullFieldsByInRolekey(SysRoleDO updateDO, Collection<String> rolekeyList){
            if(CollectionUtils.isEmpty(rolekeyList)){
                  return 0;
             }

            return this.sysRoleMapper.updateNotNullFieldsByInRolekey(updateDO,rolekeyList);
        }

        public Integer updateAllFieldsByInRolekey(SysRoleDO updateDO,  Collection<String> rolekeyList){
            if(CollectionUtils.isEmpty(rolekeyList)){
                           return 0;
             }

            return this.sysRoleMapper.updateAllFieldsByInRolekey(updateDO,rolekeyList);
        }

        public Integer deleteByInRolekey( Collection<String> rolekeyList){
            if(CollectionUtils.isEmpty(rolekeyList)){
                           return 0;
             }
            return this.sysRoleMapper.deleteByInRolekey(rolekeyList);
        }


}

