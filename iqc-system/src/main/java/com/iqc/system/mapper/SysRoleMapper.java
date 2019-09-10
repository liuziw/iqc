package com.iqc.system.mapper;
import com.iqc.system.dbo.SysRoleDO;
import com.iqc.common.dao.mapper.CommonMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Date;
import java.util.HashMap;
import org.springframework.util.CollectionUtils;
import org.apache.ibatis.annotations.Param;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.ibatis.annotations.MapKey;
import com.iqc.common.dao.dto.QueryItemDTO;



/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Mapper
public interface SysRoleMapper extends CommonMapper<SysRoleDO,Long>{


        public SysRoleDO getById(@Param("id") Long  id,@Param("fieldNames") String ... fieldNames);



        public List<SysRoleDO> listById(@Param("id") Long id,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleDO> mapById(@Param("id") Long id,@Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default SysRoleDO singleResultById(Long id,String[] fieldNames){
             List<SysRoleDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleDO>> groupingById(Long id, Function<SysRoleDO, T> mapper, String[] fieldNames){
             List<SysRoleDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") SysRoleDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") SysRoleDO updateDO, @Param("id") Long id);

        public Integer deleteById( @Param("id") Long id);




        public List<SysRoleDO> listByInId(@Param("idList") Collection<Long> idList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleDO> mapByInId(@Param("idList") Collection<Long> idList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default SysRoleDO singleResultByInId(Collection<Long> idList,String[] fieldNames){
             List<SysRoleDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleDO>> groupingByInId(Collection<Long> idList, Function<SysRoleDO, T> mapper, String[] fieldNames){
             List<SysRoleDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") SysRoleDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") SysRoleDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId( @Param("idList") Collection<Long> idList);

        public List<SysRoleDO> listByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleDO> mapByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        public Integer countByName(@Param("name") String name);

        public default SysRoleDO singleResultByName(String name,String[] fieldNames){
             List<SysRoleDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleDO>> groupingByName(String name, Function<SysRoleDO, T> mapper, String[] fieldNames){
             List<SysRoleDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(@Param("updateDO") SysRoleDO updateDO, @Param("name") String name);

        public Integer updateAllFieldsByName(@Param("updateDO") SysRoleDO updateDO, @Param("name") String name);

        public Integer deleteByName( @Param("name") String name);




        public List<SysRoleDO> listByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleDO> mapByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInName(@Param("nameList") Collection<String> nameList);

        public default SysRoleDO singleResultByInName(Collection<String> nameList,String[] fieldNames){
             List<SysRoleDO> list=this.listByInName(nameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleDO>> groupingByInName(Collection<String> nameList, Function<SysRoleDO, T> mapper, String[] fieldNames){
             List<SysRoleDO> list=this.listByInName(nameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInName(@Param("updateDO") SysRoleDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer updateAllFieldsByInName(@Param("updateDO") SysRoleDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer deleteByInName( @Param("nameList") Collection<String> nameList);

        public List<SysRoleDO> listByDescription(@Param("description") String description,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleDO> mapByDescription(@Param("description") String description,@Param("fieldNames") String[] fieldNames);

        public Integer countByDescription(@Param("description") String description);

        public default SysRoleDO singleResultByDescription(String description,String[] fieldNames){
             List<SysRoleDO> list=this.listByDescription(description,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleDO>> groupingByDescription(String description, Function<SysRoleDO, T> mapper, String[] fieldNames){
             List<SysRoleDO> list=this.listByDescription(description,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDescription(@Param("updateDO") SysRoleDO updateDO, @Param("description") String description);

        public Integer updateAllFieldsByDescription(@Param("updateDO") SysRoleDO updateDO, @Param("description") String description);

        public Integer deleteByDescription( @Param("description") String description);




        public List<SysRoleDO> listByInDescription(@Param("descriptionList") Collection<String> descriptionList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleDO> mapByInDescription(@Param("descriptionList") Collection<String> descriptionList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInDescription(@Param("descriptionList") Collection<String> descriptionList);

        public default SysRoleDO singleResultByInDescription(Collection<String> descriptionList,String[] fieldNames){
             List<SysRoleDO> list=this.listByInDescription(descriptionList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleDO>> groupingByInDescription(Collection<String> descriptionList, Function<SysRoleDO, T> mapper, String[] fieldNames){
             List<SysRoleDO> list=this.listByInDescription(descriptionList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDescription(@Param("updateDO") SysRoleDO updateDO, @Param("descriptionList") Collection<String> descriptionList);

        public Integer updateAllFieldsByInDescription(@Param("updateDO") SysRoleDO updateDO, @Param("descriptionList") Collection<String> descriptionList);

        public Integer deleteByInDescription( @Param("descriptionList") Collection<String> descriptionList);

        public List<SysRoleDO> listByRolekey(@Param("rolekey") String rolekey,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleDO> mapByRolekey(@Param("rolekey") String rolekey,@Param("fieldNames") String[] fieldNames);

        public Integer countByRolekey(@Param("rolekey") String rolekey);

        public default SysRoleDO singleResultByRolekey(String rolekey,String[] fieldNames){
             List<SysRoleDO> list=this.listByRolekey(rolekey,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleDO>> groupingByRolekey(String rolekey, Function<SysRoleDO, T> mapper, String[] fieldNames){
             List<SysRoleDO> list=this.listByRolekey(rolekey,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRolekey(@Param("updateDO") SysRoleDO updateDO, @Param("rolekey") String rolekey);

        public Integer updateAllFieldsByRolekey(@Param("updateDO") SysRoleDO updateDO, @Param("rolekey") String rolekey);

        public Integer deleteByRolekey( @Param("rolekey") String rolekey);




        public List<SysRoleDO> listByInRolekey(@Param("rolekeyList") Collection<String> rolekeyList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleDO> mapByInRolekey(@Param("rolekeyList") Collection<String> rolekeyList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInRolekey(@Param("rolekeyList") Collection<String> rolekeyList);

        public default SysRoleDO singleResultByInRolekey(Collection<String> rolekeyList,String[] fieldNames){
             List<SysRoleDO> list=this.listByInRolekey(rolekeyList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleDO>> groupingByInRolekey(Collection<String> rolekeyList, Function<SysRoleDO, T> mapper, String[] fieldNames){
             List<SysRoleDO> list=this.listByInRolekey(rolekeyList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRolekey(@Param("updateDO") SysRoleDO updateDO, @Param("rolekeyList") Collection<String> rolekeyList);

        public Integer updateAllFieldsByInRolekey(@Param("updateDO") SysRoleDO updateDO, @Param("rolekeyList") Collection<String> rolekeyList);

        public Integer deleteByInRolekey( @Param("rolekeyList") Collection<String> rolekeyList);


}
