package com.iqc.system.daomanager.immutable.impl;

import com.iqc.system.dbo.SysMenuDO;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Date;
import com.iqc.common.dao.daomanager.CommonDaoManager;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;
import com.iqc.system.daomanager.immutable.ImmutableSysMenuDaoManager;
import com.iqc.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.iqc.system.mapper.SysMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import java.util.ArrayList;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableSysMenuDaoManagerImpl extends CommonDaoManagerImpl<SysMenuDO,Long> implements ImmutableSysMenuDaoManager {

        @Autowired
        private SysMenuMapper sysMenuMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(sysMenuMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(SysMenuDO.ID,SysMenuDO.DB_ID);
            fieldMap.put(SysMenuDO.DB_ID,SysMenuDO.DB_ID);

            fieldMap.put(SysMenuDO.NAME,SysMenuDO.DB_NAME);
            fieldMap.put(SysMenuDO.DB_NAME,SysMenuDO.DB_NAME);

            fieldMap.put(SysMenuDO.ALIAS,SysMenuDO.DB_ALIAS);
            fieldMap.put(SysMenuDO.DB_ALIAS,SysMenuDO.DB_ALIAS);

            fieldMap.put(SysMenuDO.DESCRIPTION,SysMenuDO.DB_DESCRIPTION);
            fieldMap.put(SysMenuDO.DB_DESCRIPTION,SysMenuDO.DB_DESCRIPTION);

            fieldMap.put(SysMenuDO.PID,SysMenuDO.DB_PID);
            fieldMap.put(SysMenuDO.DB_PID,SysMenuDO.DB_PID);

            fieldMap.put(SysMenuDO.TYPE,SysMenuDO.DB_TYPE);
            fieldMap.put(SysMenuDO.DB_TYPE,SysMenuDO.DB_TYPE);

            fieldMap.put(SysMenuDO.ORDERNUM,SysMenuDO.DB_ORDERNUM);
            fieldMap.put(SysMenuDO.DB_ORDERNUM,SysMenuDO.DB_ORDERNUM);

            fieldMap.put(SysMenuDO.ICON,SysMenuDO.DB_ICON);
            fieldMap.put(SysMenuDO.DB_ICON,SysMenuDO.DB_ICON);

            fieldMap.put(SysMenuDO.PERMS,SysMenuDO.DB_PERMS);
            fieldMap.put(SysMenuDO.DB_PERMS,SysMenuDO.DB_PERMS);

            fieldMap.put(SysMenuDO.URL,SysMenuDO.DB_URL);
            fieldMap.put(SysMenuDO.DB_URL,SysMenuDO.DB_URL);

            fieldMap.put(SysMenuDO.GMT_CREATE,SysMenuDO.DB_GMT_CREATE);
            fieldMap.put(SysMenuDO.DB_GMT_CREATE,SysMenuDO.DB_GMT_CREATE);

            fieldMap.put(SysMenuDO.GMT_MODIFIED,SysMenuDO.DB_GMT_MODIFIED);
            fieldMap.put(SysMenuDO.DB_GMT_MODIFIED,SysMenuDO.DB_GMT_MODIFIED);

            fieldMap.put(SysMenuDO.IS_DELETED,SysMenuDO.DB_IS_DELETED);
            fieldMap.put(SysMenuDO.DB_IS_DELETED,SysMenuDO.DB_IS_DELETED);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public SysMenuDO getById(Long id){
            return this.sysMenuMapper.getById(id);
        }



        public List<SysMenuDO> listById(Long id, String... fieldNames){
            return this.sysMenuMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapById(Long id, String... fieldNames){
            return this.sysMenuMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.sysMenuMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(SysMenuDO updateDO, Long id){

            return this.sysMenuMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(SysMenuDO updateDO,  Long id){

            return this.sysMenuMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.sysMenuMapper.deleteById(id);
        }



        public List<SysMenuDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.sysMenuMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.sysMenuMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.sysMenuMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(SysMenuDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }

            return this.sysMenuMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(SysMenuDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }

            return this.sysMenuMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.sysMenuMapper.deleteByInId(idList);
        }


        public List<SysMenuDO> listByName(String name, String... fieldNames){
            return this.sysMenuMapper.listByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByName(String name, String... fieldNames){
            return this.sysMenuMapper.mapByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByName(String name){
            return this.sysMenuMapper.countByName(name);
        }

        public Integer updateNotNullFieldsByName(SysMenuDO updateDO, String name){

            return this.sysMenuMapper.updateNotNullFieldsByName(updateDO,name);
        }

        public Integer updateAllFieldsByName(SysMenuDO updateDO,  String name){

            return this.sysMenuMapper.updateAllFieldsByName(updateDO,name);
        }

        public Integer deleteByName( String name){
            return this.sysMenuMapper.deleteByName(name);
        }



        public List<SysMenuDO> listByInName(Collection<String> nameList, String... fieldNames){
            if(CollectionUtils.isEmpty(nameList)){
                return new ArrayList<>(0);
            }
            return this.sysMenuMapper.listByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByInName(Collection<String> nameList, String... fieldNames){
            if(CollectionUtils.isEmpty(nameList)){
                 return new HashMap<>();
            }
            return this.sysMenuMapper.mapByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInName(Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                   return 0;
             }
            return this.sysMenuMapper.countByInName(nameList);
        }

        public Integer updateNotNullFieldsByInName(SysMenuDO updateDO, Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                  return 0;
             }

            return this.sysMenuMapper.updateNotNullFieldsByInName(updateDO,nameList);
        }

        public Integer updateAllFieldsByInName(SysMenuDO updateDO,  Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                           return 0;
             }

            return this.sysMenuMapper.updateAllFieldsByInName(updateDO,nameList);
        }

        public Integer deleteByInName( Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                           return 0;
             }
            return this.sysMenuMapper.deleteByInName(nameList);
        }


        public List<SysMenuDO> listByAlias(String alias, String... fieldNames){
            return this.sysMenuMapper.listByAlias(alias,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByAlias(String alias, String... fieldNames){
            return this.sysMenuMapper.mapByAlias(alias,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByAlias(String alias){
            return this.sysMenuMapper.countByAlias(alias);
        }

        public Integer updateNotNullFieldsByAlias(SysMenuDO updateDO, String alias){

            return this.sysMenuMapper.updateNotNullFieldsByAlias(updateDO,alias);
        }

        public Integer updateAllFieldsByAlias(SysMenuDO updateDO,  String alias){

            return this.sysMenuMapper.updateAllFieldsByAlias(updateDO,alias);
        }

        public Integer deleteByAlias( String alias){
            return this.sysMenuMapper.deleteByAlias(alias);
        }



        public List<SysMenuDO> listByInAlias(Collection<String> aliasList, String... fieldNames){
            if(CollectionUtils.isEmpty(aliasList)){
                return new ArrayList<>(0);
            }
            return this.sysMenuMapper.listByInAlias(aliasList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByInAlias(Collection<String> aliasList, String... fieldNames){
            if(CollectionUtils.isEmpty(aliasList)){
                 return new HashMap<>();
            }
            return this.sysMenuMapper.mapByInAlias(aliasList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInAlias(Collection<String> aliasList){
            if(CollectionUtils.isEmpty(aliasList)){
                   return 0;
             }
            return this.sysMenuMapper.countByInAlias(aliasList);
        }

        public Integer updateNotNullFieldsByInAlias(SysMenuDO updateDO, Collection<String> aliasList){
            if(CollectionUtils.isEmpty(aliasList)){
                  return 0;
             }

            return this.sysMenuMapper.updateNotNullFieldsByInAlias(updateDO,aliasList);
        }

        public Integer updateAllFieldsByInAlias(SysMenuDO updateDO,  Collection<String> aliasList){
            if(CollectionUtils.isEmpty(aliasList)){
                           return 0;
             }

            return this.sysMenuMapper.updateAllFieldsByInAlias(updateDO,aliasList);
        }

        public Integer deleteByInAlias( Collection<String> aliasList){
            if(CollectionUtils.isEmpty(aliasList)){
                           return 0;
             }
            return this.sysMenuMapper.deleteByInAlias(aliasList);
        }


        public List<SysMenuDO> listByDescription(String description, String... fieldNames){
            return this.sysMenuMapper.listByDescription(description,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByDescription(String description, String... fieldNames){
            return this.sysMenuMapper.mapByDescription(description,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDescription(String description){
            return this.sysMenuMapper.countByDescription(description);
        }

        public Integer updateNotNullFieldsByDescription(SysMenuDO updateDO, String description){

            return this.sysMenuMapper.updateNotNullFieldsByDescription(updateDO,description);
        }

        public Integer updateAllFieldsByDescription(SysMenuDO updateDO,  String description){

            return this.sysMenuMapper.updateAllFieldsByDescription(updateDO,description);
        }

        public Integer deleteByDescription( String description){
            return this.sysMenuMapper.deleteByDescription(description);
        }



        public List<SysMenuDO> listByInDescription(Collection<String> descriptionList, String... fieldNames){
            if(CollectionUtils.isEmpty(descriptionList)){
                return new ArrayList<>(0);
            }
            return this.sysMenuMapper.listByInDescription(descriptionList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByInDescription(Collection<String> descriptionList, String... fieldNames){
            if(CollectionUtils.isEmpty(descriptionList)){
                 return new HashMap<>();
            }
            return this.sysMenuMapper.mapByInDescription(descriptionList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDescription(Collection<String> descriptionList){
            if(CollectionUtils.isEmpty(descriptionList)){
                   return 0;
             }
            return this.sysMenuMapper.countByInDescription(descriptionList);
        }

        public Integer updateNotNullFieldsByInDescription(SysMenuDO updateDO, Collection<String> descriptionList){
            if(CollectionUtils.isEmpty(descriptionList)){
                  return 0;
             }

            return this.sysMenuMapper.updateNotNullFieldsByInDescription(updateDO,descriptionList);
        }

        public Integer updateAllFieldsByInDescription(SysMenuDO updateDO,  Collection<String> descriptionList){
            if(CollectionUtils.isEmpty(descriptionList)){
                           return 0;
             }

            return this.sysMenuMapper.updateAllFieldsByInDescription(updateDO,descriptionList);
        }

        public Integer deleteByInDescription( Collection<String> descriptionList){
            if(CollectionUtils.isEmpty(descriptionList)){
                           return 0;
             }
            return this.sysMenuMapper.deleteByInDescription(descriptionList);
        }


        public List<SysMenuDO> listByPid(Long pid, String... fieldNames){
            return this.sysMenuMapper.listByPid(pid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByPid(Long pid, String... fieldNames){
            return this.sysMenuMapper.mapByPid(pid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPid(Long pid){
            return this.sysMenuMapper.countByPid(pid);
        }

        public Integer updateNotNullFieldsByPid(SysMenuDO updateDO, Long pid){

            return this.sysMenuMapper.updateNotNullFieldsByPid(updateDO,pid);
        }

        public Integer updateAllFieldsByPid(SysMenuDO updateDO,  Long pid){

            return this.sysMenuMapper.updateAllFieldsByPid(updateDO,pid);
        }

        public Integer deleteByPid( Long pid){
            return this.sysMenuMapper.deleteByPid(pid);
        }



        public List<SysMenuDO> listByInPid(Collection<Long> pidList, String... fieldNames){
            if(CollectionUtils.isEmpty(pidList)){
                return new ArrayList<>(0);
            }
            return this.sysMenuMapper.listByInPid(pidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByInPid(Collection<Long> pidList, String... fieldNames){
            if(CollectionUtils.isEmpty(pidList)){
                 return new HashMap<>();
            }
            return this.sysMenuMapper.mapByInPid(pidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPid(Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                   return 0;
             }
            return this.sysMenuMapper.countByInPid(pidList);
        }

        public Integer updateNotNullFieldsByInPid(SysMenuDO updateDO, Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                  return 0;
             }

            return this.sysMenuMapper.updateNotNullFieldsByInPid(updateDO,pidList);
        }

        public Integer updateAllFieldsByInPid(SysMenuDO updateDO,  Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                           return 0;
             }

            return this.sysMenuMapper.updateAllFieldsByInPid(updateDO,pidList);
        }

        public Integer deleteByInPid( Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                           return 0;
             }
            return this.sysMenuMapper.deleteByInPid(pidList);
        }


        public List<SysMenuDO> listByType(Integer type, String... fieldNames){
            return this.sysMenuMapper.listByType(type,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByType(Integer type, String... fieldNames){
            return this.sysMenuMapper.mapByType(type,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByType(Integer type){
            return this.sysMenuMapper.countByType(type);
        }

        public Integer updateNotNullFieldsByType(SysMenuDO updateDO, Integer type){

            return this.sysMenuMapper.updateNotNullFieldsByType(updateDO,type);
        }

        public Integer updateAllFieldsByType(SysMenuDO updateDO,  Integer type){

            return this.sysMenuMapper.updateAllFieldsByType(updateDO,type);
        }

        public Integer deleteByType( Integer type){
            return this.sysMenuMapper.deleteByType(type);
        }



        public List<SysMenuDO> listByInType(Collection<Integer> typeList, String... fieldNames){
            if(CollectionUtils.isEmpty(typeList)){
                return new ArrayList<>(0);
            }
            return this.sysMenuMapper.listByInType(typeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByInType(Collection<Integer> typeList, String... fieldNames){
            if(CollectionUtils.isEmpty(typeList)){
                 return new HashMap<>();
            }
            return this.sysMenuMapper.mapByInType(typeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInType(Collection<Integer> typeList){
            if(CollectionUtils.isEmpty(typeList)){
                   return 0;
             }
            return this.sysMenuMapper.countByInType(typeList);
        }

        public Integer updateNotNullFieldsByInType(SysMenuDO updateDO, Collection<Integer> typeList){
            if(CollectionUtils.isEmpty(typeList)){
                  return 0;
             }

            return this.sysMenuMapper.updateNotNullFieldsByInType(updateDO,typeList);
        }

        public Integer updateAllFieldsByInType(SysMenuDO updateDO,  Collection<Integer> typeList){
            if(CollectionUtils.isEmpty(typeList)){
                           return 0;
             }

            return this.sysMenuMapper.updateAllFieldsByInType(updateDO,typeList);
        }

        public Integer deleteByInType( Collection<Integer> typeList){
            if(CollectionUtils.isEmpty(typeList)){
                           return 0;
             }
            return this.sysMenuMapper.deleteByInType(typeList);
        }


        public List<SysMenuDO> listByOrdernum(Integer ordernum, String... fieldNames){
            return this.sysMenuMapper.listByOrdernum(ordernum,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByOrdernum(Integer ordernum, String... fieldNames){
            return this.sysMenuMapper.mapByOrdernum(ordernum,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByOrdernum(Integer ordernum){
            return this.sysMenuMapper.countByOrdernum(ordernum);
        }

        public Integer updateNotNullFieldsByOrdernum(SysMenuDO updateDO, Integer ordernum){

            return this.sysMenuMapper.updateNotNullFieldsByOrdernum(updateDO,ordernum);
        }

        public Integer updateAllFieldsByOrdernum(SysMenuDO updateDO,  Integer ordernum){

            return this.sysMenuMapper.updateAllFieldsByOrdernum(updateDO,ordernum);
        }

        public Integer deleteByOrdernum( Integer ordernum){
            return this.sysMenuMapper.deleteByOrdernum(ordernum);
        }



        public List<SysMenuDO> listByInOrdernum(Collection<Integer> ordernumList, String... fieldNames){
            if(CollectionUtils.isEmpty(ordernumList)){
                return new ArrayList<>(0);
            }
            return this.sysMenuMapper.listByInOrdernum(ordernumList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByInOrdernum(Collection<Integer> ordernumList, String... fieldNames){
            if(CollectionUtils.isEmpty(ordernumList)){
                 return new HashMap<>();
            }
            return this.sysMenuMapper.mapByInOrdernum(ordernumList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInOrdernum(Collection<Integer> ordernumList){
            if(CollectionUtils.isEmpty(ordernumList)){
                   return 0;
             }
            return this.sysMenuMapper.countByInOrdernum(ordernumList);
        }

        public Integer updateNotNullFieldsByInOrdernum(SysMenuDO updateDO, Collection<Integer> ordernumList){
            if(CollectionUtils.isEmpty(ordernumList)){
                  return 0;
             }

            return this.sysMenuMapper.updateNotNullFieldsByInOrdernum(updateDO,ordernumList);
        }

        public Integer updateAllFieldsByInOrdernum(SysMenuDO updateDO,  Collection<Integer> ordernumList){
            if(CollectionUtils.isEmpty(ordernumList)){
                           return 0;
             }

            return this.sysMenuMapper.updateAllFieldsByInOrdernum(updateDO,ordernumList);
        }

        public Integer deleteByInOrdernum( Collection<Integer> ordernumList){
            if(CollectionUtils.isEmpty(ordernumList)){
                           return 0;
             }
            return this.sysMenuMapper.deleteByInOrdernum(ordernumList);
        }


        public List<SysMenuDO> listByIcon(String icon, String... fieldNames){
            return this.sysMenuMapper.listByIcon(icon,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByIcon(String icon, String... fieldNames){
            return this.sysMenuMapper.mapByIcon(icon,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByIcon(String icon){
            return this.sysMenuMapper.countByIcon(icon);
        }

        public Integer updateNotNullFieldsByIcon(SysMenuDO updateDO, String icon){

            return this.sysMenuMapper.updateNotNullFieldsByIcon(updateDO,icon);
        }

        public Integer updateAllFieldsByIcon(SysMenuDO updateDO,  String icon){

            return this.sysMenuMapper.updateAllFieldsByIcon(updateDO,icon);
        }

        public Integer deleteByIcon( String icon){
            return this.sysMenuMapper.deleteByIcon(icon);
        }



        public List<SysMenuDO> listByInIcon(Collection<String> iconList, String... fieldNames){
            if(CollectionUtils.isEmpty(iconList)){
                return new ArrayList<>(0);
            }
            return this.sysMenuMapper.listByInIcon(iconList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByInIcon(Collection<String> iconList, String... fieldNames){
            if(CollectionUtils.isEmpty(iconList)){
                 return new HashMap<>();
            }
            return this.sysMenuMapper.mapByInIcon(iconList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInIcon(Collection<String> iconList){
            if(CollectionUtils.isEmpty(iconList)){
                   return 0;
             }
            return this.sysMenuMapper.countByInIcon(iconList);
        }

        public Integer updateNotNullFieldsByInIcon(SysMenuDO updateDO, Collection<String> iconList){
            if(CollectionUtils.isEmpty(iconList)){
                  return 0;
             }

            return this.sysMenuMapper.updateNotNullFieldsByInIcon(updateDO,iconList);
        }

        public Integer updateAllFieldsByInIcon(SysMenuDO updateDO,  Collection<String> iconList){
            if(CollectionUtils.isEmpty(iconList)){
                           return 0;
             }

            return this.sysMenuMapper.updateAllFieldsByInIcon(updateDO,iconList);
        }

        public Integer deleteByInIcon( Collection<String> iconList){
            if(CollectionUtils.isEmpty(iconList)){
                           return 0;
             }
            return this.sysMenuMapper.deleteByInIcon(iconList);
        }


        public List<SysMenuDO> listByPerms(String perms, String... fieldNames){
            return this.sysMenuMapper.listByPerms(perms,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByPerms(String perms, String... fieldNames){
            return this.sysMenuMapper.mapByPerms(perms,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPerms(String perms){
            return this.sysMenuMapper.countByPerms(perms);
        }

        public Integer updateNotNullFieldsByPerms(SysMenuDO updateDO, String perms){

            return this.sysMenuMapper.updateNotNullFieldsByPerms(updateDO,perms);
        }

        public Integer updateAllFieldsByPerms(SysMenuDO updateDO,  String perms){

            return this.sysMenuMapper.updateAllFieldsByPerms(updateDO,perms);
        }

        public Integer deleteByPerms( String perms){
            return this.sysMenuMapper.deleteByPerms(perms);
        }



        public List<SysMenuDO> listByInPerms(Collection<String> permsList, String... fieldNames){
            if(CollectionUtils.isEmpty(permsList)){
                return new ArrayList<>(0);
            }
            return this.sysMenuMapper.listByInPerms(permsList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByInPerms(Collection<String> permsList, String... fieldNames){
            if(CollectionUtils.isEmpty(permsList)){
                 return new HashMap<>();
            }
            return this.sysMenuMapper.mapByInPerms(permsList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPerms(Collection<String> permsList){
            if(CollectionUtils.isEmpty(permsList)){
                   return 0;
             }
            return this.sysMenuMapper.countByInPerms(permsList);
        }

        public Integer updateNotNullFieldsByInPerms(SysMenuDO updateDO, Collection<String> permsList){
            if(CollectionUtils.isEmpty(permsList)){
                  return 0;
             }

            return this.sysMenuMapper.updateNotNullFieldsByInPerms(updateDO,permsList);
        }

        public Integer updateAllFieldsByInPerms(SysMenuDO updateDO,  Collection<String> permsList){
            if(CollectionUtils.isEmpty(permsList)){
                           return 0;
             }

            return this.sysMenuMapper.updateAllFieldsByInPerms(updateDO,permsList);
        }

        public Integer deleteByInPerms( Collection<String> permsList){
            if(CollectionUtils.isEmpty(permsList)){
                           return 0;
             }
            return this.sysMenuMapper.deleteByInPerms(permsList);
        }


        public List<SysMenuDO> listByUrl(String url, String... fieldNames){
            return this.sysMenuMapper.listByUrl(url,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByUrl(String url, String... fieldNames){
            return this.sysMenuMapper.mapByUrl(url,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUrl(String url){
            return this.sysMenuMapper.countByUrl(url);
        }

        public Integer updateNotNullFieldsByUrl(SysMenuDO updateDO, String url){

            return this.sysMenuMapper.updateNotNullFieldsByUrl(updateDO,url);
        }

        public Integer updateAllFieldsByUrl(SysMenuDO updateDO,  String url){

            return this.sysMenuMapper.updateAllFieldsByUrl(updateDO,url);
        }

        public Integer deleteByUrl( String url){
            return this.sysMenuMapper.deleteByUrl(url);
        }



        public List<SysMenuDO> listByInUrl(Collection<String> urlList, String... fieldNames){
            if(CollectionUtils.isEmpty(urlList)){
                return new ArrayList<>(0);
            }
            return this.sysMenuMapper.listByInUrl(urlList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysMenuDO> mapByInUrl(Collection<String> urlList, String... fieldNames){
            if(CollectionUtils.isEmpty(urlList)){
                 return new HashMap<>();
            }
            return this.sysMenuMapper.mapByInUrl(urlList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUrl(Collection<String> urlList){
            if(CollectionUtils.isEmpty(urlList)){
                   return 0;
             }
            return this.sysMenuMapper.countByInUrl(urlList);
        }

        public Integer updateNotNullFieldsByInUrl(SysMenuDO updateDO, Collection<String> urlList){
            if(CollectionUtils.isEmpty(urlList)){
                  return 0;
             }

            return this.sysMenuMapper.updateNotNullFieldsByInUrl(updateDO,urlList);
        }

        public Integer updateAllFieldsByInUrl(SysMenuDO updateDO,  Collection<String> urlList){
            if(CollectionUtils.isEmpty(urlList)){
                           return 0;
             }

            return this.sysMenuMapper.updateAllFieldsByInUrl(updateDO,urlList);
        }

        public Integer deleteByInUrl( Collection<String> urlList){
            if(CollectionUtils.isEmpty(urlList)){
                           return 0;
             }
            return this.sysMenuMapper.deleteByInUrl(urlList);
        }


}

