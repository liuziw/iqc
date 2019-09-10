package com.iqc.system.daomanager.immutable.impl;

import com.iqc.system.dbo.SysUserDO;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Date;
import com.iqc.common.dao.daomanager.CommonDaoManager;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;
import com.iqc.system.daomanager.immutable.ImmutableSysUserDaoManager;
import com.iqc.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.iqc.system.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import java.util.ArrayList;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableSysUserDaoManagerImpl extends CommonDaoManagerImpl<SysUserDO,Long> implements ImmutableSysUserDaoManager {

        @Autowired
        private SysUserMapper sysUserMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(sysUserMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(SysUserDO.ID,SysUserDO.DB_ID);
            fieldMap.put(SysUserDO.DB_ID,SysUserDO.DB_ID);

            fieldMap.put(SysUserDO.NAME,SysUserDO.DB_NAME);
            fieldMap.put(SysUserDO.DB_NAME,SysUserDO.DB_NAME);

            fieldMap.put(SysUserDO.USERNAME,SysUserDO.DB_USERNAME);
            fieldMap.put(SysUserDO.DB_USERNAME,SysUserDO.DB_USERNAME);

            fieldMap.put(SysUserDO.PASSWORD,SysUserDO.DB_PASSWORD);
            fieldMap.put(SysUserDO.DB_PASSWORD,SysUserDO.DB_PASSWORD);

            fieldMap.put(SysUserDO.ORGID,SysUserDO.DB_ORGID);
            fieldMap.put(SysUserDO.DB_ORGID,SysUserDO.DB_ORGID);

            fieldMap.put(SysUserDO.STATUS,SysUserDO.DB_STATUS);
            fieldMap.put(SysUserDO.DB_STATUS,SysUserDO.DB_STATUS);

            fieldMap.put(SysUserDO.IS_DELETED,SysUserDO.DB_IS_DELETED);
            fieldMap.put(SysUserDO.DB_IS_DELETED,SysUserDO.DB_IS_DELETED);

            fieldMap.put(SysUserDO.GMT_CREATE,SysUserDO.DB_GMT_CREATE);
            fieldMap.put(SysUserDO.DB_GMT_CREATE,SysUserDO.DB_GMT_CREATE);

            fieldMap.put(SysUserDO.GMT_MODIFIED,SysUserDO.DB_GMT_MODIFIED);
            fieldMap.put(SysUserDO.DB_GMT_MODIFIED,SysUserDO.DB_GMT_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public SysUserDO getById(Long id){
            return this.sysUserMapper.getById(id);
        }



        public List<SysUserDO> listById(Long id, String... fieldNames){
            return this.sysUserMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserDO> mapById(Long id, String... fieldNames){
            return this.sysUserMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.sysUserMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(SysUserDO updateDO, Long id){

            return this.sysUserMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(SysUserDO updateDO,  Long id){

            return this.sysUserMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.sysUserMapper.deleteById(id);
        }



        public List<SysUserDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.sysUserMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.sysUserMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.sysUserMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(SysUserDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }

            return this.sysUserMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(SysUserDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }

            return this.sysUserMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.sysUserMapper.deleteByInId(idList);
        }


        public List<SysUserDO> listByName(String name, String... fieldNames){
            return this.sysUserMapper.listByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserDO> mapByName(String name, String... fieldNames){
            return this.sysUserMapper.mapByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByName(String name){
            return this.sysUserMapper.countByName(name);
        }

        public Integer updateNotNullFieldsByName(SysUserDO updateDO, String name){

            return this.sysUserMapper.updateNotNullFieldsByName(updateDO,name);
        }

        public Integer updateAllFieldsByName(SysUserDO updateDO,  String name){

            return this.sysUserMapper.updateAllFieldsByName(updateDO,name);
        }

        public Integer deleteByName( String name){
            return this.sysUserMapper.deleteByName(name);
        }



        public List<SysUserDO> listByInName(Collection<String> nameList, String... fieldNames){
            if(CollectionUtils.isEmpty(nameList)){
                return new ArrayList<>(0);
            }
            return this.sysUserMapper.listByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserDO> mapByInName(Collection<String> nameList, String... fieldNames){
            if(CollectionUtils.isEmpty(nameList)){
                 return new HashMap<>();
            }
            return this.sysUserMapper.mapByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInName(Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                   return 0;
             }
            return this.sysUserMapper.countByInName(nameList);
        }

        public Integer updateNotNullFieldsByInName(SysUserDO updateDO, Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                  return 0;
             }

            return this.sysUserMapper.updateNotNullFieldsByInName(updateDO,nameList);
        }

        public Integer updateAllFieldsByInName(SysUserDO updateDO,  Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                           return 0;
             }

            return this.sysUserMapper.updateAllFieldsByInName(updateDO,nameList);
        }

        public Integer deleteByInName( Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                           return 0;
             }
            return this.sysUserMapper.deleteByInName(nameList);
        }


        public List<SysUserDO> listByUsername(String username, String... fieldNames){
            return this.sysUserMapper.listByUsername(username,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserDO> mapByUsername(String username, String... fieldNames){
            return this.sysUserMapper.mapByUsername(username,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUsername(String username){
            return this.sysUserMapper.countByUsername(username);
        }

        public Integer updateNotNullFieldsByUsername(SysUserDO updateDO, String username){

            return this.sysUserMapper.updateNotNullFieldsByUsername(updateDO,username);
        }

        public Integer updateAllFieldsByUsername(SysUserDO updateDO,  String username){

            return this.sysUserMapper.updateAllFieldsByUsername(updateDO,username);
        }

        public Integer deleteByUsername( String username){
            return this.sysUserMapper.deleteByUsername(username);
        }



        public List<SysUserDO> listByInUsername(Collection<String> usernameList, String... fieldNames){
            if(CollectionUtils.isEmpty(usernameList)){
                return new ArrayList<>(0);
            }
            return this.sysUserMapper.listByInUsername(usernameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserDO> mapByInUsername(Collection<String> usernameList, String... fieldNames){
            if(CollectionUtils.isEmpty(usernameList)){
                 return new HashMap<>();
            }
            return this.sysUserMapper.mapByInUsername(usernameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUsername(Collection<String> usernameList){
            if(CollectionUtils.isEmpty(usernameList)){
                   return 0;
             }
            return this.sysUserMapper.countByInUsername(usernameList);
        }

        public Integer updateNotNullFieldsByInUsername(SysUserDO updateDO, Collection<String> usernameList){
            if(CollectionUtils.isEmpty(usernameList)){
                  return 0;
             }

            return this.sysUserMapper.updateNotNullFieldsByInUsername(updateDO,usernameList);
        }

        public Integer updateAllFieldsByInUsername(SysUserDO updateDO,  Collection<String> usernameList){
            if(CollectionUtils.isEmpty(usernameList)){
                           return 0;
             }

            return this.sysUserMapper.updateAllFieldsByInUsername(updateDO,usernameList);
        }

        public Integer deleteByInUsername( Collection<String> usernameList){
            if(CollectionUtils.isEmpty(usernameList)){
                           return 0;
             }
            return this.sysUserMapper.deleteByInUsername(usernameList);
        }


        public List<SysUserDO> listByPassword(String password, String... fieldNames){
            return this.sysUserMapper.listByPassword(password,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserDO> mapByPassword(String password, String... fieldNames){
            return this.sysUserMapper.mapByPassword(password,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPassword(String password){
            return this.sysUserMapper.countByPassword(password);
        }

        public Integer updateNotNullFieldsByPassword(SysUserDO updateDO, String password){

            return this.sysUserMapper.updateNotNullFieldsByPassword(updateDO,password);
        }

        public Integer updateAllFieldsByPassword(SysUserDO updateDO,  String password){

            return this.sysUserMapper.updateAllFieldsByPassword(updateDO,password);
        }

        public Integer deleteByPassword( String password){
            return this.sysUserMapper.deleteByPassword(password);
        }



        public List<SysUserDO> listByInPassword(Collection<String> passwordList, String... fieldNames){
            if(CollectionUtils.isEmpty(passwordList)){
                return new ArrayList<>(0);
            }
            return this.sysUserMapper.listByInPassword(passwordList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserDO> mapByInPassword(Collection<String> passwordList, String... fieldNames){
            if(CollectionUtils.isEmpty(passwordList)){
                 return new HashMap<>();
            }
            return this.sysUserMapper.mapByInPassword(passwordList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPassword(Collection<String> passwordList){
            if(CollectionUtils.isEmpty(passwordList)){
                   return 0;
             }
            return this.sysUserMapper.countByInPassword(passwordList);
        }

        public Integer updateNotNullFieldsByInPassword(SysUserDO updateDO, Collection<String> passwordList){
            if(CollectionUtils.isEmpty(passwordList)){
                  return 0;
             }

            return this.sysUserMapper.updateNotNullFieldsByInPassword(updateDO,passwordList);
        }

        public Integer updateAllFieldsByInPassword(SysUserDO updateDO,  Collection<String> passwordList){
            if(CollectionUtils.isEmpty(passwordList)){
                           return 0;
             }

            return this.sysUserMapper.updateAllFieldsByInPassword(updateDO,passwordList);
        }

        public Integer deleteByInPassword( Collection<String> passwordList){
            if(CollectionUtils.isEmpty(passwordList)){
                           return 0;
             }
            return this.sysUserMapper.deleteByInPassword(passwordList);
        }


        public List<SysUserDO> listByOrgid(Long orgid, String... fieldNames){
            return this.sysUserMapper.listByOrgid(orgid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserDO> mapByOrgid(Long orgid, String... fieldNames){
            return this.sysUserMapper.mapByOrgid(orgid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByOrgid(Long orgid){
            return this.sysUserMapper.countByOrgid(orgid);
        }

        public Integer updateNotNullFieldsByOrgid(SysUserDO updateDO, Long orgid){

            return this.sysUserMapper.updateNotNullFieldsByOrgid(updateDO,orgid);
        }

        public Integer updateAllFieldsByOrgid(SysUserDO updateDO,  Long orgid){

            return this.sysUserMapper.updateAllFieldsByOrgid(updateDO,orgid);
        }

        public Integer deleteByOrgid( Long orgid){
            return this.sysUserMapper.deleteByOrgid(orgid);
        }



        public List<SysUserDO> listByInOrgid(Collection<Long> orgidList, String... fieldNames){
            if(CollectionUtils.isEmpty(orgidList)){
                return new ArrayList<>(0);
            }
            return this.sysUserMapper.listByInOrgid(orgidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserDO> mapByInOrgid(Collection<Long> orgidList, String... fieldNames){
            if(CollectionUtils.isEmpty(orgidList)){
                 return new HashMap<>();
            }
            return this.sysUserMapper.mapByInOrgid(orgidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInOrgid(Collection<Long> orgidList){
            if(CollectionUtils.isEmpty(orgidList)){
                   return 0;
             }
            return this.sysUserMapper.countByInOrgid(orgidList);
        }

        public Integer updateNotNullFieldsByInOrgid(SysUserDO updateDO, Collection<Long> orgidList){
            if(CollectionUtils.isEmpty(orgidList)){
                  return 0;
             }

            return this.sysUserMapper.updateNotNullFieldsByInOrgid(updateDO,orgidList);
        }

        public Integer updateAllFieldsByInOrgid(SysUserDO updateDO,  Collection<Long> orgidList){
            if(CollectionUtils.isEmpty(orgidList)){
                           return 0;
             }

            return this.sysUserMapper.updateAllFieldsByInOrgid(updateDO,orgidList);
        }

        public Integer deleteByInOrgid( Collection<Long> orgidList){
            if(CollectionUtils.isEmpty(orgidList)){
                           return 0;
             }
            return this.sysUserMapper.deleteByInOrgid(orgidList);
        }


        public List<SysUserDO> listByStatus(Integer status, String... fieldNames){
            return this.sysUserMapper.listByStatus(status,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserDO> mapByStatus(Integer status, String... fieldNames){
            return this.sysUserMapper.mapByStatus(status,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByStatus(Integer status){
            return this.sysUserMapper.countByStatus(status);
        }

        public Integer updateNotNullFieldsByStatus(SysUserDO updateDO, Integer status){

            return this.sysUserMapper.updateNotNullFieldsByStatus(updateDO,status);
        }

        public Integer updateAllFieldsByStatus(SysUserDO updateDO,  Integer status){

            return this.sysUserMapper.updateAllFieldsByStatus(updateDO,status);
        }

        public Integer deleteByStatus( Integer status){
            return this.sysUserMapper.deleteByStatus(status);
        }



        public List<SysUserDO> listByInStatus(Collection<Integer> statusList, String... fieldNames){
            if(CollectionUtils.isEmpty(statusList)){
                return new ArrayList<>(0);
            }
            return this.sysUserMapper.listByInStatus(statusList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysUserDO> mapByInStatus(Collection<Integer> statusList, String... fieldNames){
            if(CollectionUtils.isEmpty(statusList)){
                 return new HashMap<>();
            }
            return this.sysUserMapper.mapByInStatus(statusList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInStatus(Collection<Integer> statusList){
            if(CollectionUtils.isEmpty(statusList)){
                   return 0;
             }
            return this.sysUserMapper.countByInStatus(statusList);
        }

        public Integer updateNotNullFieldsByInStatus(SysUserDO updateDO, Collection<Integer> statusList){
            if(CollectionUtils.isEmpty(statusList)){
                  return 0;
             }

            return this.sysUserMapper.updateNotNullFieldsByInStatus(updateDO,statusList);
        }

        public Integer updateAllFieldsByInStatus(SysUserDO updateDO,  Collection<Integer> statusList){
            if(CollectionUtils.isEmpty(statusList)){
                           return 0;
             }

            return this.sysUserMapper.updateAllFieldsByInStatus(updateDO,statusList);
        }

        public Integer deleteByInStatus( Collection<Integer> statusList){
            if(CollectionUtils.isEmpty(statusList)){
                           return 0;
             }
            return this.sysUserMapper.deleteByInStatus(statusList);
        }


}

