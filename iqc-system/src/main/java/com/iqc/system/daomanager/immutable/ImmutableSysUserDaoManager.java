package com.iqc.system.daomanager.immutable;

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


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public interface ImmutableSysUserDaoManager extends CommonDaoManager<SysUserDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public SysUserDO getById(Long id);

        public List<SysUserDO> listById(Long id, String... fieldNames);

        public Map<Long,SysUserDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default SysUserDO singleResultById(Long id,String... fieldNames){
             List<SysUserDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingById(Long id, Function<SysUserDO, T> mapper, String... fieldNames){
             List<SysUserDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(SysUserDO updateDO, Long id);

        public Integer updateAllFieldsById(SysUserDO updateDO,  Long id);

        public Integer deleteById( Long id);






        public List<SysUserDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,SysUserDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default SysUserDO singleResultByInId(Collection<Long> idList,String... fieldNames){
              List<SysUserDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysUserDO>> groupingByInId(Collection<Long> idList, Function<SysUserDO, T> mapper, String... fieldNames){
              List<SysUserDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(SysUserDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(SysUserDO updateDO,  Collection<Long> idList);

         public Integer deleteByInId( Collection<Long> idList);
        public List<SysUserDO> listByName(String name, String... fieldNames);

        public Map<Long,SysUserDO> mapByName(String name, String... fieldNames);

        public Integer countByName(String name);

        public default SysUserDO singleResultByName(String name,String... fieldNames){
             List<SysUserDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByName(String name, Function<SysUserDO, T> mapper, String... fieldNames){
             List<SysUserDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(SysUserDO updateDO, String name);

        public Integer updateAllFieldsByName(SysUserDO updateDO,  String name);

        public Integer deleteByName( String name);






        public List<SysUserDO> listByInName(Collection<String> nameList, String... fieldNames);

         public Map<Long,SysUserDO> mapByInName(Collection<String> nameList, String... fieldNames);

         public Integer countByInName(Collection<String> nameList);

         public default SysUserDO singleResultByInName(Collection<String> nameList,String... fieldNames){
              List<SysUserDO> list=this.listByInName(nameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysUserDO>> groupingByInName(Collection<String> nameList, Function<SysUserDO, T> mapper, String... fieldNames){
              List<SysUserDO> list=this.listByInName(nameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInName(SysUserDO updateDO, Collection<String> nameList);

         public Integer updateAllFieldsByInName(SysUserDO updateDO,  Collection<String> nameList);

         public Integer deleteByInName( Collection<String> nameList);
        public List<SysUserDO> listByUsername(String username, String... fieldNames);

        public Map<Long,SysUserDO> mapByUsername(String username, String... fieldNames);

        public Integer countByUsername(String username);

        public default SysUserDO singleResultByUsername(String username,String... fieldNames){
             List<SysUserDO> list=this.listByUsername(username,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByUsername(String username, Function<SysUserDO, T> mapper, String... fieldNames){
             List<SysUserDO> list=this.listByUsername(username,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUsername(SysUserDO updateDO, String username);

        public Integer updateAllFieldsByUsername(SysUserDO updateDO,  String username);

        public Integer deleteByUsername( String username);






        public List<SysUserDO> listByInUsername(Collection<String> usernameList, String... fieldNames);

         public Map<Long,SysUserDO> mapByInUsername(Collection<String> usernameList, String... fieldNames);

         public Integer countByInUsername(Collection<String> usernameList);

         public default SysUserDO singleResultByInUsername(Collection<String> usernameList,String... fieldNames){
              List<SysUserDO> list=this.listByInUsername(usernameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysUserDO>> groupingByInUsername(Collection<String> usernameList, Function<SysUserDO, T> mapper, String... fieldNames){
              List<SysUserDO> list=this.listByInUsername(usernameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUsername(SysUserDO updateDO, Collection<String> usernameList);

         public Integer updateAllFieldsByInUsername(SysUserDO updateDO,  Collection<String> usernameList);

         public Integer deleteByInUsername( Collection<String> usernameList);
        public List<SysUserDO> listByPassword(String password, String... fieldNames);

        public Map<Long,SysUserDO> mapByPassword(String password, String... fieldNames);

        public Integer countByPassword(String password);

        public default SysUserDO singleResultByPassword(String password,String... fieldNames){
             List<SysUserDO> list=this.listByPassword(password,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByPassword(String password, Function<SysUserDO, T> mapper, String... fieldNames){
             List<SysUserDO> list=this.listByPassword(password,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPassword(SysUserDO updateDO, String password);

        public Integer updateAllFieldsByPassword(SysUserDO updateDO,  String password);

        public Integer deleteByPassword( String password);






        public List<SysUserDO> listByInPassword(Collection<String> passwordList, String... fieldNames);

         public Map<Long,SysUserDO> mapByInPassword(Collection<String> passwordList, String... fieldNames);

         public Integer countByInPassword(Collection<String> passwordList);

         public default SysUserDO singleResultByInPassword(Collection<String> passwordList,String... fieldNames){
              List<SysUserDO> list=this.listByInPassword(passwordList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysUserDO>> groupingByInPassword(Collection<String> passwordList, Function<SysUserDO, T> mapper, String... fieldNames){
              List<SysUserDO> list=this.listByInPassword(passwordList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPassword(SysUserDO updateDO, Collection<String> passwordList);

         public Integer updateAllFieldsByInPassword(SysUserDO updateDO,  Collection<String> passwordList);

         public Integer deleteByInPassword( Collection<String> passwordList);
        public List<SysUserDO> listByOrgid(Long orgid, String... fieldNames);

        public Map<Long,SysUserDO> mapByOrgid(Long orgid, String... fieldNames);

        public Integer countByOrgid(Long orgid);

        public default SysUserDO singleResultByOrgid(Long orgid,String... fieldNames){
             List<SysUserDO> list=this.listByOrgid(orgid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByOrgid(Long orgid, Function<SysUserDO, T> mapper, String... fieldNames){
             List<SysUserDO> list=this.listByOrgid(orgid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByOrgid(SysUserDO updateDO, Long orgid);

        public Integer updateAllFieldsByOrgid(SysUserDO updateDO,  Long orgid);

        public Integer deleteByOrgid( Long orgid);






        public List<SysUserDO> listByInOrgid(Collection<Long> orgidList, String... fieldNames);

         public Map<Long,SysUserDO> mapByInOrgid(Collection<Long> orgidList, String... fieldNames);

         public Integer countByInOrgid(Collection<Long> orgidList);

         public default SysUserDO singleResultByInOrgid(Collection<Long> orgidList,String... fieldNames){
              List<SysUserDO> list=this.listByInOrgid(orgidList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysUserDO>> groupingByInOrgid(Collection<Long> orgidList, Function<SysUserDO, T> mapper, String... fieldNames){
              List<SysUserDO> list=this.listByInOrgid(orgidList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInOrgid(SysUserDO updateDO, Collection<Long> orgidList);

         public Integer updateAllFieldsByInOrgid(SysUserDO updateDO,  Collection<Long> orgidList);

         public Integer deleteByInOrgid( Collection<Long> orgidList);
        public List<SysUserDO> listByStatus(Integer status, String... fieldNames);

        public Map<Long,SysUserDO> mapByStatus(Integer status, String... fieldNames);

        public Integer countByStatus(Integer status);

        public default SysUserDO singleResultByStatus(Integer status,String... fieldNames){
             List<SysUserDO> list=this.listByStatus(status,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByStatus(Integer status, Function<SysUserDO, T> mapper, String... fieldNames){
             List<SysUserDO> list=this.listByStatus(status,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByStatus(SysUserDO updateDO, Integer status);

        public Integer updateAllFieldsByStatus(SysUserDO updateDO,  Integer status);

        public Integer deleteByStatus( Integer status);






        public List<SysUserDO> listByInStatus(Collection<Integer> statusList, String... fieldNames);

         public Map<Long,SysUserDO> mapByInStatus(Collection<Integer> statusList, String... fieldNames);

         public Integer countByInStatus(Collection<Integer> statusList);

         public default SysUserDO singleResultByInStatus(Collection<Integer> statusList,String... fieldNames){
              List<SysUserDO> list=this.listByInStatus(statusList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysUserDO>> groupingByInStatus(Collection<Integer> statusList, Function<SysUserDO, T> mapper, String... fieldNames){
              List<SysUserDO> list=this.listByInStatus(statusList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInStatus(SysUserDO updateDO, Collection<Integer> statusList);

         public Integer updateAllFieldsByInStatus(SysUserDO updateDO,  Collection<Integer> statusList);

         public Integer deleteByInStatus( Collection<Integer> statusList);


}

