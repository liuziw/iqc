package com.iqc.system.daomanager.immutable;

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


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public interface ImmutableSysOrganizationDaoManager extends CommonDaoManager<SysOrganizationDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public SysOrganizationDO getById(Long id);

        public List<SysOrganizationDO> listById(Long id, String... fieldNames);

        public Map<Long,SysOrganizationDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default SysOrganizationDO singleResultById(Long id,String... fieldNames){
             List<SysOrganizationDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingById(Long id, Function<SysOrganizationDO, T> mapper, String... fieldNames){
             List<SysOrganizationDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(SysOrganizationDO updateDO, Long id);

        public Integer updateAllFieldsById(SysOrganizationDO updateDO,  Long id);

        public Integer deleteById( Long id);






        public List<SysOrganizationDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,SysOrganizationDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default SysOrganizationDO singleResultByInId(Collection<Long> idList,String... fieldNames){
              List<SysOrganizationDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysOrganizationDO>> groupingByInId(Collection<Long> idList, Function<SysOrganizationDO, T> mapper, String... fieldNames){
              List<SysOrganizationDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(SysOrganizationDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(SysOrganizationDO updateDO,  Collection<Long> idList);

         public Integer deleteByInId( Collection<Long> idList);
        public List<SysOrganizationDO> listByName(String name, String... fieldNames);

        public Map<Long,SysOrganizationDO> mapByName(String name, String... fieldNames);

        public Integer countByName(String name);

        public default SysOrganizationDO singleResultByName(String name,String... fieldNames){
             List<SysOrganizationDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingByName(String name, Function<SysOrganizationDO, T> mapper, String... fieldNames){
             List<SysOrganizationDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(SysOrganizationDO updateDO, String name);

        public Integer updateAllFieldsByName(SysOrganizationDO updateDO,  String name);

        public Integer deleteByName( String name);






        public List<SysOrganizationDO> listByInName(Collection<String> nameList, String... fieldNames);

         public Map<Long,SysOrganizationDO> mapByInName(Collection<String> nameList, String... fieldNames);

         public Integer countByInName(Collection<String> nameList);

         public default SysOrganizationDO singleResultByInName(Collection<String> nameList,String... fieldNames){
              List<SysOrganizationDO> list=this.listByInName(nameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysOrganizationDO>> groupingByInName(Collection<String> nameList, Function<SysOrganizationDO, T> mapper, String... fieldNames){
              List<SysOrganizationDO> list=this.listByInName(nameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInName(SysOrganizationDO updateDO, Collection<String> nameList);

         public Integer updateAllFieldsByInName(SysOrganizationDO updateDO,  Collection<String> nameList);

         public Integer deleteByInName( Collection<String> nameList);
        public List<SysOrganizationDO> listByDescription(String description, String... fieldNames);

        public Map<Long,SysOrganizationDO> mapByDescription(String description, String... fieldNames);

        public Integer countByDescription(String description);

        public default SysOrganizationDO singleResultByDescription(String description,String... fieldNames){
             List<SysOrganizationDO> list=this.listByDescription(description,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingByDescription(String description, Function<SysOrganizationDO, T> mapper, String... fieldNames){
             List<SysOrganizationDO> list=this.listByDescription(description,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDescription(SysOrganizationDO updateDO, String description);

        public Integer updateAllFieldsByDescription(SysOrganizationDO updateDO,  String description);

        public Integer deleteByDescription( String description);






        public List<SysOrganizationDO> listByInDescription(Collection<String> descriptionList, String... fieldNames);

         public Map<Long,SysOrganizationDO> mapByInDescription(Collection<String> descriptionList, String... fieldNames);

         public Integer countByInDescription(Collection<String> descriptionList);

         public default SysOrganizationDO singleResultByInDescription(Collection<String> descriptionList,String... fieldNames){
              List<SysOrganizationDO> list=this.listByInDescription(descriptionList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysOrganizationDO>> groupingByInDescription(Collection<String> descriptionList, Function<SysOrganizationDO, T> mapper, String... fieldNames){
              List<SysOrganizationDO> list=this.listByInDescription(descriptionList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDescription(SysOrganizationDO updateDO, Collection<String> descriptionList);

         public Integer updateAllFieldsByInDescription(SysOrganizationDO updateDO,  Collection<String> descriptionList);

         public Integer deleteByInDescription( Collection<String> descriptionList);
        public List<SysOrganizationDO> listByPid(Long pid, String... fieldNames);

        public Map<Long,SysOrganizationDO> mapByPid(Long pid, String... fieldNames);

        public Integer countByPid(Long pid);

        public default SysOrganizationDO singleResultByPid(Long pid,String... fieldNames){
             List<SysOrganizationDO> list=this.listByPid(pid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingByPid(Long pid, Function<SysOrganizationDO, T> mapper, String... fieldNames){
             List<SysOrganizationDO> list=this.listByPid(pid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPid(SysOrganizationDO updateDO, Long pid);

        public Integer updateAllFieldsByPid(SysOrganizationDO updateDO,  Long pid);

        public Integer deleteByPid( Long pid);






        public List<SysOrganizationDO> listByInPid(Collection<Long> pidList, String... fieldNames);

         public Map<Long,SysOrganizationDO> mapByInPid(Collection<Long> pidList, String... fieldNames);

         public Integer countByInPid(Collection<Long> pidList);

         public default SysOrganizationDO singleResultByInPid(Collection<Long> pidList,String... fieldNames){
              List<SysOrganizationDO> list=this.listByInPid(pidList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysOrganizationDO>> groupingByInPid(Collection<Long> pidList, Function<SysOrganizationDO, T> mapper, String... fieldNames){
              List<SysOrganizationDO> list=this.listByInPid(pidList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPid(SysOrganizationDO updateDO, Collection<Long> pidList);

         public Integer updateAllFieldsByInPid(SysOrganizationDO updateDO,  Collection<Long> pidList);

         public Integer deleteByInPid( Collection<Long> pidList);
        public List<SysOrganizationDO> listByPath(String path, String... fieldNames);

        public Map<Long,SysOrganizationDO> mapByPath(String path, String... fieldNames);

        public Integer countByPath(String path);

        public default SysOrganizationDO singleResultByPath(String path,String... fieldNames){
             List<SysOrganizationDO> list=this.listByPath(path,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingByPath(String path, Function<SysOrganizationDO, T> mapper, String... fieldNames){
             List<SysOrganizationDO> list=this.listByPath(path,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPath(SysOrganizationDO updateDO, String path);

        public Integer updateAllFieldsByPath(SysOrganizationDO updateDO,  String path);

        public Integer deleteByPath( String path);






        public List<SysOrganizationDO> listByInPath(Collection<String> pathList, String... fieldNames);

         public Map<Long,SysOrganizationDO> mapByInPath(Collection<String> pathList, String... fieldNames);

         public Integer countByInPath(Collection<String> pathList);

         public default SysOrganizationDO singleResultByInPath(Collection<String> pathList,String... fieldNames){
              List<SysOrganizationDO> list=this.listByInPath(pathList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysOrganizationDO>> groupingByInPath(Collection<String> pathList, Function<SysOrganizationDO, T> mapper, String... fieldNames){
              List<SysOrganizationDO> list=this.listByInPath(pathList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPath(SysOrganizationDO updateDO, Collection<String> pathList);

         public Integer updateAllFieldsByInPath(SysOrganizationDO updateDO,  Collection<String> pathList);

         public Integer deleteByInPath( Collection<String> pathList);


}

