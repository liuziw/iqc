package com.iqc.system.daomanager.immutable;

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


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public interface ImmutableSysRoleMenuDaoManager extends CommonDaoManager<SysRoleMenuDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public SysRoleMenuDO getById(Long id);

        public List<SysRoleMenuDO> listById(Long id, String... fieldNames);

        public Map<Long,SysRoleMenuDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default SysRoleMenuDO singleResultById(Long id,String... fieldNames){
             List<SysRoleMenuDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleMenuDO>> groupingById(Long id, Function<SysRoleMenuDO, T> mapper, String... fieldNames){
             List<SysRoleMenuDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(SysRoleMenuDO updateDO, Long id);

        public Integer updateAllFieldsById(SysRoleMenuDO updateDO,  Long id);

        public Integer deleteById( Long id);






        public List<SysRoleMenuDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,SysRoleMenuDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default SysRoleMenuDO singleResultByInId(Collection<Long> idList,String... fieldNames){
              List<SysRoleMenuDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysRoleMenuDO>> groupingByInId(Collection<Long> idList, Function<SysRoleMenuDO, T> mapper, String... fieldNames){
              List<SysRoleMenuDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(SysRoleMenuDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(SysRoleMenuDO updateDO,  Collection<Long> idList);

         public Integer deleteByInId( Collection<Long> idList);
        public List<SysRoleMenuDO> listByRoleid(Long roleid, String... fieldNames);

        public Map<Long,SysRoleMenuDO> mapByRoleid(Long roleid, String... fieldNames);

        public Integer countByRoleid(Long roleid);

        public default SysRoleMenuDO singleResultByRoleid(Long roleid,String... fieldNames){
             List<SysRoleMenuDO> list=this.listByRoleid(roleid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleMenuDO>> groupingByRoleid(Long roleid, Function<SysRoleMenuDO, T> mapper, String... fieldNames){
             List<SysRoleMenuDO> list=this.listByRoleid(roleid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleid(SysRoleMenuDO updateDO, Long roleid);

        public Integer updateAllFieldsByRoleid(SysRoleMenuDO updateDO,  Long roleid);

        public Integer deleteByRoleid( Long roleid);






        public List<SysRoleMenuDO> listByInRoleid(Collection<Long> roleidList, String... fieldNames);

         public Map<Long,SysRoleMenuDO> mapByInRoleid(Collection<Long> roleidList, String... fieldNames);

         public Integer countByInRoleid(Collection<Long> roleidList);

         public default SysRoleMenuDO singleResultByInRoleid(Collection<Long> roleidList,String... fieldNames){
              List<SysRoleMenuDO> list=this.listByInRoleid(roleidList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysRoleMenuDO>> groupingByInRoleid(Collection<Long> roleidList, Function<SysRoleMenuDO, T> mapper, String... fieldNames){
              List<SysRoleMenuDO> list=this.listByInRoleid(roleidList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInRoleid(SysRoleMenuDO updateDO, Collection<Long> roleidList);

         public Integer updateAllFieldsByInRoleid(SysRoleMenuDO updateDO,  Collection<Long> roleidList);

         public Integer deleteByInRoleid( Collection<Long> roleidList);
        public List<SysRoleMenuDO> listByMenuid(Long menuid, String... fieldNames);

        public Map<Long,SysRoleMenuDO> mapByMenuid(Long menuid, String... fieldNames);

        public Integer countByMenuid(Long menuid);

        public default SysRoleMenuDO singleResultByMenuid(Long menuid,String... fieldNames){
             List<SysRoleMenuDO> list=this.listByMenuid(menuid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleMenuDO>> groupingByMenuid(Long menuid, Function<SysRoleMenuDO, T> mapper, String... fieldNames){
             List<SysRoleMenuDO> list=this.listByMenuid(menuid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByMenuid(SysRoleMenuDO updateDO, Long menuid);

        public Integer updateAllFieldsByMenuid(SysRoleMenuDO updateDO,  Long menuid);

        public Integer deleteByMenuid( Long menuid);






        public List<SysRoleMenuDO> listByInMenuid(Collection<Long> menuidList, String... fieldNames);

         public Map<Long,SysRoleMenuDO> mapByInMenuid(Collection<Long> menuidList, String... fieldNames);

         public Integer countByInMenuid(Collection<Long> menuidList);

         public default SysRoleMenuDO singleResultByInMenuid(Collection<Long> menuidList,String... fieldNames){
              List<SysRoleMenuDO> list=this.listByInMenuid(menuidList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysRoleMenuDO>> groupingByInMenuid(Collection<Long> menuidList, Function<SysRoleMenuDO, T> mapper, String... fieldNames){
              List<SysRoleMenuDO> list=this.listByInMenuid(menuidList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInMenuid(SysRoleMenuDO updateDO, Collection<Long> menuidList);

         public Integer updateAllFieldsByInMenuid(SysRoleMenuDO updateDO,  Collection<Long> menuidList);

         public Integer deleteByInMenuid( Collection<Long> menuidList);
        public List<SysRoleMenuDO> listByCreatetime(java.util.Date createtime, String... fieldNames);

        public Map<Long,SysRoleMenuDO> mapByCreatetime(java.util.Date createtime, String... fieldNames);

        public Integer countByCreatetime(java.util.Date createtime);

        public default SysRoleMenuDO singleResultByCreatetime(java.util.Date createtime,String... fieldNames){
             List<SysRoleMenuDO> list=this.listByCreatetime(createtime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleMenuDO>> groupingByCreatetime(java.util.Date createtime, Function<SysRoleMenuDO, T> mapper, String... fieldNames){
             List<SysRoleMenuDO> list=this.listByCreatetime(createtime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByCreatetime(SysRoleMenuDO updateDO, java.util.Date createtime);

        public Integer updateAllFieldsByCreatetime(SysRoleMenuDO updateDO,  java.util.Date createtime);

        public Integer deleteByCreatetime( java.util.Date createtime);






        public List<SysRoleMenuDO> listByInCreatetime(Collection<java.util.Date> createtimeList, String... fieldNames);

         public Map<Long,SysRoleMenuDO> mapByInCreatetime(Collection<java.util.Date> createtimeList, String... fieldNames);

         public Integer countByInCreatetime(Collection<java.util.Date> createtimeList);

         public default SysRoleMenuDO singleResultByInCreatetime(Collection<java.util.Date> createtimeList,String... fieldNames){
              List<SysRoleMenuDO> list=this.listByInCreatetime(createtimeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysRoleMenuDO>> groupingByInCreatetime(Collection<java.util.Date> createtimeList, Function<SysRoleMenuDO, T> mapper, String... fieldNames){
              List<SysRoleMenuDO> list=this.listByInCreatetime(createtimeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInCreatetime(SysRoleMenuDO updateDO, Collection<java.util.Date> createtimeList);

         public Integer updateAllFieldsByInCreatetime(SysRoleMenuDO updateDO,  Collection<java.util.Date> createtimeList);

         public Integer deleteByInCreatetime( Collection<java.util.Date> createtimeList);


}

