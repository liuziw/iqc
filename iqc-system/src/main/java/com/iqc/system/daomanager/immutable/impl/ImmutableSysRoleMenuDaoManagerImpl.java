package com.iqc.system.daomanager.immutable.impl;

import com.iqc.system.dbo.SysRoleMenuDO;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Date;
import com.iqc.common.dao.daomanager.CommonDaoManager;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;
import com.iqc.system.daomanager.immutable.ImmutableSysRoleMenuDaoManager;
import com.iqc.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.iqc.system.mapper.SysRoleMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import java.util.ArrayList;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableSysRoleMenuDaoManagerImpl extends CommonDaoManagerImpl<SysRoleMenuDO,Long> implements ImmutableSysRoleMenuDaoManager {

        @Autowired
        private SysRoleMenuMapper sysRoleMenuMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(sysRoleMenuMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(SysRoleMenuDO.ID,SysRoleMenuDO.DB_ID);
            fieldMap.put(SysRoleMenuDO.DB_ID,SysRoleMenuDO.DB_ID);

            fieldMap.put(SysRoleMenuDO.ROLEID,SysRoleMenuDO.DB_ROLEID);
            fieldMap.put(SysRoleMenuDO.DB_ROLEID,SysRoleMenuDO.DB_ROLEID);

            fieldMap.put(SysRoleMenuDO.MENUID,SysRoleMenuDO.DB_MENUID);
            fieldMap.put(SysRoleMenuDO.DB_MENUID,SysRoleMenuDO.DB_MENUID);

            fieldMap.put(SysRoleMenuDO.CREATETIME,SysRoleMenuDO.DB_CREATETIME);
            fieldMap.put(SysRoleMenuDO.DB_CREATETIME,SysRoleMenuDO.DB_CREATETIME);

            fieldMap.put(SysRoleMenuDO.IS_DELETED,SysRoleMenuDO.DB_IS_DELETED);
            fieldMap.put(SysRoleMenuDO.DB_IS_DELETED,SysRoleMenuDO.DB_IS_DELETED);

            fieldMap.put(SysRoleMenuDO.GMT_CREATE,SysRoleMenuDO.DB_GMT_CREATE);
            fieldMap.put(SysRoleMenuDO.DB_GMT_CREATE,SysRoleMenuDO.DB_GMT_CREATE);

            fieldMap.put(SysRoleMenuDO.GMT_MODIFIED,SysRoleMenuDO.DB_GMT_MODIFIED);
            fieldMap.put(SysRoleMenuDO.DB_GMT_MODIFIED,SysRoleMenuDO.DB_GMT_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public SysRoleMenuDO getById(Long id){
            return this.sysRoleMenuMapper.getById(id);
        }



        public List<SysRoleMenuDO> listById(Long id, String... fieldNames){
            return this.sysRoleMenuMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleMenuDO> mapById(Long id, String... fieldNames){
            return this.sysRoleMenuMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.sysRoleMenuMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(SysRoleMenuDO updateDO, Long id){

            return this.sysRoleMenuMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(SysRoleMenuDO updateDO,  Long id){

            return this.sysRoleMenuMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.sysRoleMenuMapper.deleteById(id);
        }



        public List<SysRoleMenuDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.sysRoleMenuMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleMenuDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.sysRoleMenuMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.sysRoleMenuMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(SysRoleMenuDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }

            return this.sysRoleMenuMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(SysRoleMenuDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }

            return this.sysRoleMenuMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.sysRoleMenuMapper.deleteByInId(idList);
        }


        public List<SysRoleMenuDO> listByRoleid(Long roleid, String... fieldNames){
            return this.sysRoleMenuMapper.listByRoleid(roleid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleMenuDO> mapByRoleid(Long roleid, String... fieldNames){
            return this.sysRoleMenuMapper.mapByRoleid(roleid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByRoleid(Long roleid){
            return this.sysRoleMenuMapper.countByRoleid(roleid);
        }

        public Integer updateNotNullFieldsByRoleid(SysRoleMenuDO updateDO, Long roleid){

            return this.sysRoleMenuMapper.updateNotNullFieldsByRoleid(updateDO,roleid);
        }

        public Integer updateAllFieldsByRoleid(SysRoleMenuDO updateDO,  Long roleid){

            return this.sysRoleMenuMapper.updateAllFieldsByRoleid(updateDO,roleid);
        }

        public Integer deleteByRoleid( Long roleid){
            return this.sysRoleMenuMapper.deleteByRoleid(roleid);
        }



        public List<SysRoleMenuDO> listByInRoleid(Collection<Long> roleidList, String... fieldNames){
            if(CollectionUtils.isEmpty(roleidList)){
                return new ArrayList<>(0);
            }
            return this.sysRoleMenuMapper.listByInRoleid(roleidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleMenuDO> mapByInRoleid(Collection<Long> roleidList, String... fieldNames){
            if(CollectionUtils.isEmpty(roleidList)){
                 return new HashMap<>();
            }
            return this.sysRoleMenuMapper.mapByInRoleid(roleidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInRoleid(Collection<Long> roleidList){
            if(CollectionUtils.isEmpty(roleidList)){
                   return 0;
             }
            return this.sysRoleMenuMapper.countByInRoleid(roleidList);
        }

        public Integer updateNotNullFieldsByInRoleid(SysRoleMenuDO updateDO, Collection<Long> roleidList){
            if(CollectionUtils.isEmpty(roleidList)){
                  return 0;
             }

            return this.sysRoleMenuMapper.updateNotNullFieldsByInRoleid(updateDO,roleidList);
        }

        public Integer updateAllFieldsByInRoleid(SysRoleMenuDO updateDO,  Collection<Long> roleidList){
            if(CollectionUtils.isEmpty(roleidList)){
                           return 0;
             }

            return this.sysRoleMenuMapper.updateAllFieldsByInRoleid(updateDO,roleidList);
        }

        public Integer deleteByInRoleid( Collection<Long> roleidList){
            if(CollectionUtils.isEmpty(roleidList)){
                           return 0;
             }
            return this.sysRoleMenuMapper.deleteByInRoleid(roleidList);
        }


        public List<SysRoleMenuDO> listByMenuid(Long menuid, String... fieldNames){
            return this.sysRoleMenuMapper.listByMenuid(menuid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleMenuDO> mapByMenuid(Long menuid, String... fieldNames){
            return this.sysRoleMenuMapper.mapByMenuid(menuid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByMenuid(Long menuid){
            return this.sysRoleMenuMapper.countByMenuid(menuid);
        }

        public Integer updateNotNullFieldsByMenuid(SysRoleMenuDO updateDO, Long menuid){

            return this.sysRoleMenuMapper.updateNotNullFieldsByMenuid(updateDO,menuid);
        }

        public Integer updateAllFieldsByMenuid(SysRoleMenuDO updateDO,  Long menuid){

            return this.sysRoleMenuMapper.updateAllFieldsByMenuid(updateDO,menuid);
        }

        public Integer deleteByMenuid( Long menuid){
            return this.sysRoleMenuMapper.deleteByMenuid(menuid);
        }



        public List<SysRoleMenuDO> listByInMenuid(Collection<Long> menuidList, String... fieldNames){
            if(CollectionUtils.isEmpty(menuidList)){
                return new ArrayList<>(0);
            }
            return this.sysRoleMenuMapper.listByInMenuid(menuidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleMenuDO> mapByInMenuid(Collection<Long> menuidList, String... fieldNames){
            if(CollectionUtils.isEmpty(menuidList)){
                 return new HashMap<>();
            }
            return this.sysRoleMenuMapper.mapByInMenuid(menuidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInMenuid(Collection<Long> menuidList){
            if(CollectionUtils.isEmpty(menuidList)){
                   return 0;
             }
            return this.sysRoleMenuMapper.countByInMenuid(menuidList);
        }

        public Integer updateNotNullFieldsByInMenuid(SysRoleMenuDO updateDO, Collection<Long> menuidList){
            if(CollectionUtils.isEmpty(menuidList)){
                  return 0;
             }

            return this.sysRoleMenuMapper.updateNotNullFieldsByInMenuid(updateDO,menuidList);
        }

        public Integer updateAllFieldsByInMenuid(SysRoleMenuDO updateDO,  Collection<Long> menuidList){
            if(CollectionUtils.isEmpty(menuidList)){
                           return 0;
             }

            return this.sysRoleMenuMapper.updateAllFieldsByInMenuid(updateDO,menuidList);
        }

        public Integer deleteByInMenuid( Collection<Long> menuidList){
            if(CollectionUtils.isEmpty(menuidList)){
                           return 0;
             }
            return this.sysRoleMenuMapper.deleteByInMenuid(menuidList);
        }


        public List<SysRoleMenuDO> listByCreatetime(java.util.Date createtime, String... fieldNames){
            return this.sysRoleMenuMapper.listByCreatetime(createtime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleMenuDO> mapByCreatetime(java.util.Date createtime, String... fieldNames){
            return this.sysRoleMenuMapper.mapByCreatetime(createtime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByCreatetime(java.util.Date createtime){
            return this.sysRoleMenuMapper.countByCreatetime(createtime);
        }

        public Integer updateNotNullFieldsByCreatetime(SysRoleMenuDO updateDO, java.util.Date createtime){

            return this.sysRoleMenuMapper.updateNotNullFieldsByCreatetime(updateDO,createtime);
        }

        public Integer updateAllFieldsByCreatetime(SysRoleMenuDO updateDO,  java.util.Date createtime){

            return this.sysRoleMenuMapper.updateAllFieldsByCreatetime(updateDO,createtime);
        }

        public Integer deleteByCreatetime( java.util.Date createtime){
            return this.sysRoleMenuMapper.deleteByCreatetime(createtime);
        }



        public List<SysRoleMenuDO> listByInCreatetime(Collection<java.util.Date> createtimeList, String... fieldNames){
            if(CollectionUtils.isEmpty(createtimeList)){
                return new ArrayList<>(0);
            }
            return this.sysRoleMenuMapper.listByInCreatetime(createtimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysRoleMenuDO> mapByInCreatetime(Collection<java.util.Date> createtimeList, String... fieldNames){
            if(CollectionUtils.isEmpty(createtimeList)){
                 return new HashMap<>();
            }
            return this.sysRoleMenuMapper.mapByInCreatetime(createtimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInCreatetime(Collection<java.util.Date> createtimeList){
            if(CollectionUtils.isEmpty(createtimeList)){
                   return 0;
             }
            return this.sysRoleMenuMapper.countByInCreatetime(createtimeList);
        }

        public Integer updateNotNullFieldsByInCreatetime(SysRoleMenuDO updateDO, Collection<java.util.Date> createtimeList){
            if(CollectionUtils.isEmpty(createtimeList)){
                  return 0;
             }

            return this.sysRoleMenuMapper.updateNotNullFieldsByInCreatetime(updateDO,createtimeList);
        }

        public Integer updateAllFieldsByInCreatetime(SysRoleMenuDO updateDO,  Collection<java.util.Date> createtimeList){
            if(CollectionUtils.isEmpty(createtimeList)){
                           return 0;
             }

            return this.sysRoleMenuMapper.updateAllFieldsByInCreatetime(updateDO,createtimeList);
        }

        public Integer deleteByInCreatetime( Collection<java.util.Date> createtimeList){
            if(CollectionUtils.isEmpty(createtimeList)){
                           return 0;
             }
            return this.sysRoleMenuMapper.deleteByInCreatetime(createtimeList);
        }


}

