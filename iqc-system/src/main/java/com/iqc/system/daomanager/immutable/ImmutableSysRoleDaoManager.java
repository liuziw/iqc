package com.iqc.system.daomanager.immutable;

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


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public interface ImmutableSysRoleDaoManager extends CommonDaoManager<SysRoleDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public SysRoleDO getById(Long id);

        public List<SysRoleDO> listById(Long id, String... fieldNames);

        public Map<Long,SysRoleDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default SysRoleDO singleResultById(Long id,String... fieldNames){
             List<SysRoleDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleDO>> groupingById(Long id, Function<SysRoleDO, T> mapper, String... fieldNames){
             List<SysRoleDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(SysRoleDO updateDO, Long id);

        public Integer updateAllFieldsById(SysRoleDO updateDO,  Long id);

        public Integer deleteById( Long id);






        public List<SysRoleDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,SysRoleDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default SysRoleDO singleResultByInId(Collection<Long> idList,String... fieldNames){
              List<SysRoleDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysRoleDO>> groupingByInId(Collection<Long> idList, Function<SysRoleDO, T> mapper, String... fieldNames){
              List<SysRoleDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(SysRoleDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(SysRoleDO updateDO,  Collection<Long> idList);

         public Integer deleteByInId( Collection<Long> idList);
        public List<SysRoleDO> listByName(String name, String... fieldNames);

        public Map<Long,SysRoleDO> mapByName(String name, String... fieldNames);

        public Integer countByName(String name);

        public default SysRoleDO singleResultByName(String name,String... fieldNames){
             List<SysRoleDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleDO>> groupingByName(String name, Function<SysRoleDO, T> mapper, String... fieldNames){
             List<SysRoleDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(SysRoleDO updateDO, String name);

        public Integer updateAllFieldsByName(SysRoleDO updateDO,  String name);

        public Integer deleteByName( String name);






        public List<SysRoleDO> listByInName(Collection<String> nameList, String... fieldNames);

         public Map<Long,SysRoleDO> mapByInName(Collection<String> nameList, String... fieldNames);

         public Integer countByInName(Collection<String> nameList);

         public default SysRoleDO singleResultByInName(Collection<String> nameList,String... fieldNames){
              List<SysRoleDO> list=this.listByInName(nameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysRoleDO>> groupingByInName(Collection<String> nameList, Function<SysRoleDO, T> mapper, String... fieldNames){
              List<SysRoleDO> list=this.listByInName(nameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInName(SysRoleDO updateDO, Collection<String> nameList);

         public Integer updateAllFieldsByInName(SysRoleDO updateDO,  Collection<String> nameList);

         public Integer deleteByInName( Collection<String> nameList);
        public List<SysRoleDO> listByDescription(String description, String... fieldNames);

        public Map<Long,SysRoleDO> mapByDescription(String description, String... fieldNames);

        public Integer countByDescription(String description);

        public default SysRoleDO singleResultByDescription(String description,String... fieldNames){
             List<SysRoleDO> list=this.listByDescription(description,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleDO>> groupingByDescription(String description, Function<SysRoleDO, T> mapper, String... fieldNames){
             List<SysRoleDO> list=this.listByDescription(description,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDescription(SysRoleDO updateDO, String description);

        public Integer updateAllFieldsByDescription(SysRoleDO updateDO,  String description);

        public Integer deleteByDescription( String description);






        public List<SysRoleDO> listByInDescription(Collection<String> descriptionList, String... fieldNames);

         public Map<Long,SysRoleDO> mapByInDescription(Collection<String> descriptionList, String... fieldNames);

         public Integer countByInDescription(Collection<String> descriptionList);

         public default SysRoleDO singleResultByInDescription(Collection<String> descriptionList,String... fieldNames){
              List<SysRoleDO> list=this.listByInDescription(descriptionList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysRoleDO>> groupingByInDescription(Collection<String> descriptionList, Function<SysRoleDO, T> mapper, String... fieldNames){
              List<SysRoleDO> list=this.listByInDescription(descriptionList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDescription(SysRoleDO updateDO, Collection<String> descriptionList);

         public Integer updateAllFieldsByInDescription(SysRoleDO updateDO,  Collection<String> descriptionList);

         public Integer deleteByInDescription( Collection<String> descriptionList);
        public List<SysRoleDO> listByRolekey(String rolekey, String... fieldNames);

        public Map<Long,SysRoleDO> mapByRolekey(String rolekey, String... fieldNames);

        public Integer countByRolekey(String rolekey);

        public default SysRoleDO singleResultByRolekey(String rolekey,String... fieldNames){
             List<SysRoleDO> list=this.listByRolekey(rolekey,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleDO>> groupingByRolekey(String rolekey, Function<SysRoleDO, T> mapper, String... fieldNames){
             List<SysRoleDO> list=this.listByRolekey(rolekey,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRolekey(SysRoleDO updateDO, String rolekey);

        public Integer updateAllFieldsByRolekey(SysRoleDO updateDO,  String rolekey);

        public Integer deleteByRolekey( String rolekey);






        public List<SysRoleDO> listByInRolekey(Collection<String> rolekeyList, String... fieldNames);

         public Map<Long,SysRoleDO> mapByInRolekey(Collection<String> rolekeyList, String... fieldNames);

         public Integer countByInRolekey(Collection<String> rolekeyList);

         public default SysRoleDO singleResultByInRolekey(Collection<String> rolekeyList,String... fieldNames){
              List<SysRoleDO> list=this.listByInRolekey(rolekeyList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysRoleDO>> groupingByInRolekey(Collection<String> rolekeyList, Function<SysRoleDO, T> mapper, String... fieldNames){
              List<SysRoleDO> list=this.listByInRolekey(rolekeyList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInRolekey(SysRoleDO updateDO, Collection<String> rolekeyList);

         public Integer updateAllFieldsByInRolekey(SysRoleDO updateDO,  Collection<String> rolekeyList);

         public Integer deleteByInRolekey( Collection<String> rolekeyList);


}

