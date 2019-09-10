package com.iqc.system.daomanager.immutable.impl;

import com.iqc.system.dbo.SysUserRoleDO;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Date;
import com.iqc.common.dao.daomanager.CommonDaoManager;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;
import com.iqc.system.daomanager.immutable.ImmutableSysUserRoleDaoManager;
import com.iqc.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.iqc.system.mapper.SysUserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import java.util.ArrayList;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableSysUserRoleDaoManagerImpl extends CommonDaoManagerImpl<SysUserRoleDO,Long> implements ImmutableSysUserRoleDaoManager {

        @Autowired
        private SysUserRoleMapper sysUserRoleMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(sysUserRoleMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(SysUserRoleDO.ID,SysUserRoleDO.DB_ID);
            fieldMap.put(SysUserRoleDO.DB_ID,SysUserRoleDO.DB_ID);

            fieldMap.put(SysUserRoleDO.USERID,SysUserRoleDO.DB_USERID);
            fieldMap.put(SysUserRoleDO.DB_USERID,SysUserRoleDO.DB_USERID);

            fieldMap.put(SysUserRoleDO.ROLEID,SysUserRoleDO.DB_ROLEID);
            fieldMap.put(SysUserRoleDO.DB_ROLEID,SysUserRoleDO.DB_ROLEID);

            fieldMap.put(SysUserRoleDO.CREATETIME,SysUserRoleDO.DB_CREATETIME);
            fieldMap.put(SysUserRoleDO.DB_CREATETIME,SysUserRoleDO.DB_CREATETIME);

            fieldMap.put(SysUserRoleDO.IS_DELETED,SysUserRoleDO.DB_IS_DELETED);
            fieldMap.put(SysUserRoleDO.DB_IS_DELETED,SysUserRoleDO.DB_IS_DELETED);

            fieldMap.put(SysUserRoleDO.GMT_CREATE,SysUserRoleDO.DB_GMT_CREATE);
            fieldMap.put(SysUserRoleDO.DB_GMT_CREATE,SysUserRoleDO.DB_GMT_CREATE);

            fieldMap.put(SysUserRoleDO.GMT_MODIFIED,SysUserRoleDO.DB_GMT_MODIFIED);
            fieldMap.put(SysUserRoleDO.DB_GMT_MODIFIED,SysUserRoleDO.DB_GMT_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public SysUserRoleDO getById(Long id){
            return this.sysUserRoleMapper.getById(id);
        }



        public List<SysUserRoleDO> listById(Long id, String... fieldNames){
            return this.sysUserRoleMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserRoleDO> mapById(Long id, String... fieldNames){
            return this.sysUserRoleMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.sysUserRoleMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(SysUserRoleDO updateDO, Long id){

            return this.sysUserRoleMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(SysUserRoleDO updateDO,  Long id){

            return this.sysUserRoleMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.sysUserRoleMapper.deleteById(id);
        }



        public List<SysUserRoleDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.sysUserRoleMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserRoleDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.sysUserRoleMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.sysUserRoleMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(SysUserRoleDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }

            return this.sysUserRoleMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(SysUserRoleDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }

            return this.sysUserRoleMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.sysUserRoleMapper.deleteByInId(idList);
        }


        public List<SysUserRoleDO> listByUserid(Long userid, String... fieldNames){
            return this.sysUserRoleMapper.listByUserid(userid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserRoleDO> mapByUserid(Long userid, String... fieldNames){
            return this.sysUserRoleMapper.mapByUserid(userid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserid(Long userid){
            return this.sysUserRoleMapper.countByUserid(userid);
        }

        public Integer updateNotNullFieldsByUserid(SysUserRoleDO updateDO, Long userid){

            return this.sysUserRoleMapper.updateNotNullFieldsByUserid(updateDO,userid);
        }

        public Integer updateAllFieldsByUserid(SysUserRoleDO updateDO,  Long userid){

            return this.sysUserRoleMapper.updateAllFieldsByUserid(updateDO,userid);
        }

        public Integer deleteByUserid( Long userid){
            return this.sysUserRoleMapper.deleteByUserid(userid);
        }



        public List<SysUserRoleDO> listByInUserid(Collection<Long> useridList, String... fieldNames){
            if(CollectionUtils.isEmpty(useridList)){
                return new ArrayList<>(0);
            }
            return this.sysUserRoleMapper.listByInUserid(useridList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserRoleDO> mapByInUserid(Collection<Long> useridList, String... fieldNames){
            if(CollectionUtils.isEmpty(useridList)){
                 return new HashMap<>();
            }
            return this.sysUserRoleMapper.mapByInUserid(useridList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserid(Collection<Long> useridList){
            if(CollectionUtils.isEmpty(useridList)){
                   return 0;
             }
            return this.sysUserRoleMapper.countByInUserid(useridList);
        }

        public Integer updateNotNullFieldsByInUserid(SysUserRoleDO updateDO, Collection<Long> useridList){
            if(CollectionUtils.isEmpty(useridList)){
                  return 0;
             }

            return this.sysUserRoleMapper.updateNotNullFieldsByInUserid(updateDO,useridList);
        }

        public Integer updateAllFieldsByInUserid(SysUserRoleDO updateDO,  Collection<Long> useridList){
            if(CollectionUtils.isEmpty(useridList)){
                           return 0;
             }

            return this.sysUserRoleMapper.updateAllFieldsByInUserid(updateDO,useridList);
        }

        public Integer deleteByInUserid( Collection<Long> useridList){
            if(CollectionUtils.isEmpty(useridList)){
                           return 0;
             }
            return this.sysUserRoleMapper.deleteByInUserid(useridList);
        }


        public List<SysUserRoleDO> listByRoleid(Long roleid, String... fieldNames){
            return this.sysUserRoleMapper.listByRoleid(roleid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserRoleDO> mapByRoleid(Long roleid, String... fieldNames){
            return this.sysUserRoleMapper.mapByRoleid(roleid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByRoleid(Long roleid){
            return this.sysUserRoleMapper.countByRoleid(roleid);
        }

        public Integer updateNotNullFieldsByRoleid(SysUserRoleDO updateDO, Long roleid){

            return this.sysUserRoleMapper.updateNotNullFieldsByRoleid(updateDO,roleid);
        }

        public Integer updateAllFieldsByRoleid(SysUserRoleDO updateDO,  Long roleid){

            return this.sysUserRoleMapper.updateAllFieldsByRoleid(updateDO,roleid);
        }

        public Integer deleteByRoleid( Long roleid){
            return this.sysUserRoleMapper.deleteByRoleid(roleid);
        }



        public List<SysUserRoleDO> listByInRoleid(Collection<Long> roleidList, String... fieldNames){
            if(CollectionUtils.isEmpty(roleidList)){
                return new ArrayList<>(0);
            }
            return this.sysUserRoleMapper.listByInRoleid(roleidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserRoleDO> mapByInRoleid(Collection<Long> roleidList, String... fieldNames){
            if(CollectionUtils.isEmpty(roleidList)){
                 return new HashMap<>();
            }
            return this.sysUserRoleMapper.mapByInRoleid(roleidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInRoleid(Collection<Long> roleidList){
            if(CollectionUtils.isEmpty(roleidList)){
                   return 0;
             }
            return this.sysUserRoleMapper.countByInRoleid(roleidList);
        }

        public Integer updateNotNullFieldsByInRoleid(SysUserRoleDO updateDO, Collection<Long> roleidList){
            if(CollectionUtils.isEmpty(roleidList)){
                  return 0;
             }

            return this.sysUserRoleMapper.updateNotNullFieldsByInRoleid(updateDO,roleidList);
        }

        public Integer updateAllFieldsByInRoleid(SysUserRoleDO updateDO,  Collection<Long> roleidList){
            if(CollectionUtils.isEmpty(roleidList)){
                           return 0;
             }

            return this.sysUserRoleMapper.updateAllFieldsByInRoleid(updateDO,roleidList);
        }

        public Integer deleteByInRoleid( Collection<Long> roleidList){
            if(CollectionUtils.isEmpty(roleidList)){
                           return 0;
             }
            return this.sysUserRoleMapper.deleteByInRoleid(roleidList);
        }


        public List<SysUserRoleDO> listByCreatetime(java.util.Date createtime, String... fieldNames){
            return this.sysUserRoleMapper.listByCreatetime(createtime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserRoleDO> mapByCreatetime(java.util.Date createtime, String... fieldNames){
            return this.sysUserRoleMapper.mapByCreatetime(createtime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByCreatetime(java.util.Date createtime){
            return this.sysUserRoleMapper.countByCreatetime(createtime);
        }

        public Integer updateNotNullFieldsByCreatetime(SysUserRoleDO updateDO, java.util.Date createtime){

            return this.sysUserRoleMapper.updateNotNullFieldsByCreatetime(updateDO,createtime);
        }

        public Integer updateAllFieldsByCreatetime(SysUserRoleDO updateDO,  java.util.Date createtime){

            return this.sysUserRoleMapper.updateAllFieldsByCreatetime(updateDO,createtime);
        }

        public Integer deleteByCreatetime( java.util.Date createtime){
            return this.sysUserRoleMapper.deleteByCreatetime(createtime);
        }



        public List<SysUserRoleDO> listByInCreatetime(Collection<java.util.Date> createtimeList, String... fieldNames){
            if(CollectionUtils.isEmpty(createtimeList)){
                return new ArrayList<>(0);
            }
            return this.sysUserRoleMapper.listByInCreatetime(createtimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserRoleDO> mapByInCreatetime(Collection<java.util.Date> createtimeList, String... fieldNames){
            if(CollectionUtils.isEmpty(createtimeList)){
                 return new HashMap<>();
            }
            return this.sysUserRoleMapper.mapByInCreatetime(createtimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInCreatetime(Collection<java.util.Date> createtimeList){
            if(CollectionUtils.isEmpty(createtimeList)){
                   return 0;
             }
            return this.sysUserRoleMapper.countByInCreatetime(createtimeList);
        }

        public Integer updateNotNullFieldsByInCreatetime(SysUserRoleDO updateDO, Collection<java.util.Date> createtimeList){
            if(CollectionUtils.isEmpty(createtimeList)){
                  return 0;
             }

            return this.sysUserRoleMapper.updateNotNullFieldsByInCreatetime(updateDO,createtimeList);
        }

        public Integer updateAllFieldsByInCreatetime(SysUserRoleDO updateDO,  Collection<java.util.Date> createtimeList){
            if(CollectionUtils.isEmpty(createtimeList)){
                           return 0;
             }

            return this.sysUserRoleMapper.updateAllFieldsByInCreatetime(updateDO,createtimeList);
        }

        public Integer deleteByInCreatetime( Collection<java.util.Date> createtimeList){
            if(CollectionUtils.isEmpty(createtimeList)){
                           return 0;
             }
            return this.sysUserRoleMapper.deleteByInCreatetime(createtimeList);
        }


}

