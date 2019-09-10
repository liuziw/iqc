package com.iqc.system.daomanager.immutable;

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


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public interface ImmutableSysUserRoleDaoManager extends CommonDaoManager<SysUserRoleDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public SysUserRoleDO getById(Long id);

        public List<SysUserRoleDO> listById(Long id, String... fieldNames);

        public Map<Long,SysUserRoleDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default SysUserRoleDO singleResultById(Long id,String... fieldNames){
             List<SysUserRoleDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserRoleDO>> groupingById(Long id, Function<SysUserRoleDO, T> mapper, String... fieldNames){
             List<SysUserRoleDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(SysUserRoleDO updateDO, Long id);

        public Integer updateAllFieldsById(SysUserRoleDO updateDO,  Long id);

        public Integer deleteById( Long id);






        public List<SysUserRoleDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,SysUserRoleDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default SysUserRoleDO singleResultByInId(Collection<Long> idList,String... fieldNames){
              List<SysUserRoleDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysUserRoleDO>> groupingByInId(Collection<Long> idList, Function<SysUserRoleDO, T> mapper, String... fieldNames){
              List<SysUserRoleDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(SysUserRoleDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(SysUserRoleDO updateDO,  Collection<Long> idList);

         public Integer deleteByInId( Collection<Long> idList);
        public List<SysUserRoleDO> listByUserid(Long userid, String... fieldNames);

        public Map<Long,SysUserRoleDO> mapByUserid(Long userid, String... fieldNames);

        public Integer countByUserid(Long userid);

        public default SysUserRoleDO singleResultByUserid(Long userid,String... fieldNames){
             List<SysUserRoleDO> list=this.listByUserid(userid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserRoleDO>> groupingByUserid(Long userid, Function<SysUserRoleDO, T> mapper, String... fieldNames){
             List<SysUserRoleDO> list=this.listByUserid(userid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserid(SysUserRoleDO updateDO, Long userid);

        public Integer updateAllFieldsByUserid(SysUserRoleDO updateDO,  Long userid);

        public Integer deleteByUserid( Long userid);






        public List<SysUserRoleDO> listByInUserid(Collection<Long> useridList, String... fieldNames);

         public Map<Long,SysUserRoleDO> mapByInUserid(Collection<Long> useridList, String... fieldNames);

         public Integer countByInUserid(Collection<Long> useridList);

         public default SysUserRoleDO singleResultByInUserid(Collection<Long> useridList,String... fieldNames){
              List<SysUserRoleDO> list=this.listByInUserid(useridList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysUserRoleDO>> groupingByInUserid(Collection<Long> useridList, Function<SysUserRoleDO, T> mapper, String... fieldNames){
              List<SysUserRoleDO> list=this.listByInUserid(useridList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserid(SysUserRoleDO updateDO, Collection<Long> useridList);

         public Integer updateAllFieldsByInUserid(SysUserRoleDO updateDO,  Collection<Long> useridList);

         public Integer deleteByInUserid( Collection<Long> useridList);
        public List<SysUserRoleDO> listByRoleid(Long roleid, String... fieldNames);

        public Map<Long,SysUserRoleDO> mapByRoleid(Long roleid, String... fieldNames);

        public Integer countByRoleid(Long roleid);

        public default SysUserRoleDO singleResultByRoleid(Long roleid,String... fieldNames){
             List<SysUserRoleDO> list=this.listByRoleid(roleid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserRoleDO>> groupingByRoleid(Long roleid, Function<SysUserRoleDO, T> mapper, String... fieldNames){
             List<SysUserRoleDO> list=this.listByRoleid(roleid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleid(SysUserRoleDO updateDO, Long roleid);

        public Integer updateAllFieldsByRoleid(SysUserRoleDO updateDO,  Long roleid);

        public Integer deleteByRoleid( Long roleid);






        public List<SysUserRoleDO> listByInRoleid(Collection<Long> roleidList, String... fieldNames);

         public Map<Long,SysUserRoleDO> mapByInRoleid(Collection<Long> roleidList, String... fieldNames);

         public Integer countByInRoleid(Collection<Long> roleidList);

         public default SysUserRoleDO singleResultByInRoleid(Collection<Long> roleidList,String... fieldNames){
              List<SysUserRoleDO> list=this.listByInRoleid(roleidList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysUserRoleDO>> groupingByInRoleid(Collection<Long> roleidList, Function<SysUserRoleDO, T> mapper, String... fieldNames){
              List<SysUserRoleDO> list=this.listByInRoleid(roleidList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInRoleid(SysUserRoleDO updateDO, Collection<Long> roleidList);

         public Integer updateAllFieldsByInRoleid(SysUserRoleDO updateDO,  Collection<Long> roleidList);

         public Integer deleteByInRoleid( Collection<Long> roleidList);
        public List<SysUserRoleDO> listByCreatetime(java.util.Date createtime, String... fieldNames);

        public Map<Long,SysUserRoleDO> mapByCreatetime(java.util.Date createtime, String... fieldNames);

        public Integer countByCreatetime(java.util.Date createtime);

        public default SysUserRoleDO singleResultByCreatetime(java.util.Date createtime,String... fieldNames){
             List<SysUserRoleDO> list=this.listByCreatetime(createtime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserRoleDO>> groupingByCreatetime(java.util.Date createtime, Function<SysUserRoleDO, T> mapper, String... fieldNames){
             List<SysUserRoleDO> list=this.listByCreatetime(createtime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByCreatetime(SysUserRoleDO updateDO, java.util.Date createtime);

        public Integer updateAllFieldsByCreatetime(SysUserRoleDO updateDO,  java.util.Date createtime);

        public Integer deleteByCreatetime( java.util.Date createtime);






        public List<SysUserRoleDO> listByInCreatetime(Collection<java.util.Date> createtimeList, String... fieldNames);

         public Map<Long,SysUserRoleDO> mapByInCreatetime(Collection<java.util.Date> createtimeList, String... fieldNames);

         public Integer countByInCreatetime(Collection<java.util.Date> createtimeList);

         public default SysUserRoleDO singleResultByInCreatetime(Collection<java.util.Date> createtimeList,String... fieldNames){
              List<SysUserRoleDO> list=this.listByInCreatetime(createtimeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysUserRoleDO>> groupingByInCreatetime(Collection<java.util.Date> createtimeList, Function<SysUserRoleDO, T> mapper, String... fieldNames){
              List<SysUserRoleDO> list=this.listByInCreatetime(createtimeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInCreatetime(SysUserRoleDO updateDO, Collection<java.util.Date> createtimeList);

         public Integer updateAllFieldsByInCreatetime(SysUserRoleDO updateDO,  Collection<java.util.Date> createtimeList);

         public Integer deleteByInCreatetime( Collection<java.util.Date> createtimeList);


}

