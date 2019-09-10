package com.iqc.system.mapper;
import com.iqc.system.dbo.SysOrganizationDO;
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
public interface SysOrganizationMapper extends CommonMapper<SysOrganizationDO,Long>{


        public SysOrganizationDO getById(@Param("id") Long  id,@Param("fieldNames") String ... fieldNames);



        public List<SysOrganizationDO> listById(@Param("id") Long id,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysOrganizationDO> mapById(@Param("id") Long id,@Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default SysOrganizationDO singleResultById(Long id,String[] fieldNames){
             List<SysOrganizationDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingById(Long id, Function<SysOrganizationDO, T> mapper, String[] fieldNames){
             List<SysOrganizationDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") SysOrganizationDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") SysOrganizationDO updateDO, @Param("id") Long id);

        public Integer deleteById( @Param("id") Long id);




        public List<SysOrganizationDO> listByInId(@Param("idList") Collection<Long> idList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysOrganizationDO> mapByInId(@Param("idList") Collection<Long> idList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default SysOrganizationDO singleResultByInId(Collection<Long> idList,String[] fieldNames){
             List<SysOrganizationDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingByInId(Collection<Long> idList, Function<SysOrganizationDO, T> mapper, String[] fieldNames){
             List<SysOrganizationDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") SysOrganizationDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") SysOrganizationDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId( @Param("idList") Collection<Long> idList);

        public List<SysOrganizationDO> listByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysOrganizationDO> mapByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        public Integer countByName(@Param("name") String name);

        public default SysOrganizationDO singleResultByName(String name,String[] fieldNames){
             List<SysOrganizationDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingByName(String name, Function<SysOrganizationDO, T> mapper, String[] fieldNames){
             List<SysOrganizationDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(@Param("updateDO") SysOrganizationDO updateDO, @Param("name") String name);

        public Integer updateAllFieldsByName(@Param("updateDO") SysOrganizationDO updateDO, @Param("name") String name);

        public Integer deleteByName( @Param("name") String name);




        public List<SysOrganizationDO> listByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysOrganizationDO> mapByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInName(@Param("nameList") Collection<String> nameList);

        public default SysOrganizationDO singleResultByInName(Collection<String> nameList,String[] fieldNames){
             List<SysOrganizationDO> list=this.listByInName(nameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingByInName(Collection<String> nameList, Function<SysOrganizationDO, T> mapper, String[] fieldNames){
             List<SysOrganizationDO> list=this.listByInName(nameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInName(@Param("updateDO") SysOrganizationDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer updateAllFieldsByInName(@Param("updateDO") SysOrganizationDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer deleteByInName( @Param("nameList") Collection<String> nameList);

        public List<SysOrganizationDO> listByDescription(@Param("description") String description,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysOrganizationDO> mapByDescription(@Param("description") String description,@Param("fieldNames") String[] fieldNames);

        public Integer countByDescription(@Param("description") String description);

        public default SysOrganizationDO singleResultByDescription(String description,String[] fieldNames){
             List<SysOrganizationDO> list=this.listByDescription(description,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingByDescription(String description, Function<SysOrganizationDO, T> mapper, String[] fieldNames){
             List<SysOrganizationDO> list=this.listByDescription(description,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDescription(@Param("updateDO") SysOrganizationDO updateDO, @Param("description") String description);

        public Integer updateAllFieldsByDescription(@Param("updateDO") SysOrganizationDO updateDO, @Param("description") String description);

        public Integer deleteByDescription( @Param("description") String description);




        public List<SysOrganizationDO> listByInDescription(@Param("descriptionList") Collection<String> descriptionList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysOrganizationDO> mapByInDescription(@Param("descriptionList") Collection<String> descriptionList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInDescription(@Param("descriptionList") Collection<String> descriptionList);

        public default SysOrganizationDO singleResultByInDescription(Collection<String> descriptionList,String[] fieldNames){
             List<SysOrganizationDO> list=this.listByInDescription(descriptionList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingByInDescription(Collection<String> descriptionList, Function<SysOrganizationDO, T> mapper, String[] fieldNames){
             List<SysOrganizationDO> list=this.listByInDescription(descriptionList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDescription(@Param("updateDO") SysOrganizationDO updateDO, @Param("descriptionList") Collection<String> descriptionList);

        public Integer updateAllFieldsByInDescription(@Param("updateDO") SysOrganizationDO updateDO, @Param("descriptionList") Collection<String> descriptionList);

        public Integer deleteByInDescription( @Param("descriptionList") Collection<String> descriptionList);

        public List<SysOrganizationDO> listByPid(@Param("pid") Long pid,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysOrganizationDO> mapByPid(@Param("pid") Long pid,@Param("fieldNames") String[] fieldNames);

        public Integer countByPid(@Param("pid") Long pid);

        public default SysOrganizationDO singleResultByPid(Long pid,String[] fieldNames){
             List<SysOrganizationDO> list=this.listByPid(pid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingByPid(Long pid, Function<SysOrganizationDO, T> mapper, String[] fieldNames){
             List<SysOrganizationDO> list=this.listByPid(pid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPid(@Param("updateDO") SysOrganizationDO updateDO, @Param("pid") Long pid);

        public Integer updateAllFieldsByPid(@Param("updateDO") SysOrganizationDO updateDO, @Param("pid") Long pid);

        public Integer deleteByPid( @Param("pid") Long pid);




        public List<SysOrganizationDO> listByInPid(@Param("pidList") Collection<Long> pidList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysOrganizationDO> mapByInPid(@Param("pidList") Collection<Long> pidList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInPid(@Param("pidList") Collection<Long> pidList);

        public default SysOrganizationDO singleResultByInPid(Collection<Long> pidList,String[] fieldNames){
             List<SysOrganizationDO> list=this.listByInPid(pidList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingByInPid(Collection<Long> pidList, Function<SysOrganizationDO, T> mapper, String[] fieldNames){
             List<SysOrganizationDO> list=this.listByInPid(pidList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPid(@Param("updateDO") SysOrganizationDO updateDO, @Param("pidList") Collection<Long> pidList);

        public Integer updateAllFieldsByInPid(@Param("updateDO") SysOrganizationDO updateDO, @Param("pidList") Collection<Long> pidList);

        public Integer deleteByInPid( @Param("pidList") Collection<Long> pidList);

        public List<SysOrganizationDO> listByPath(@Param("path") String path,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysOrganizationDO> mapByPath(@Param("path") String path,@Param("fieldNames") String[] fieldNames);

        public Integer countByPath(@Param("path") String path);

        public default SysOrganizationDO singleResultByPath(String path,String[] fieldNames){
             List<SysOrganizationDO> list=this.listByPath(path,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingByPath(String path, Function<SysOrganizationDO, T> mapper, String[] fieldNames){
             List<SysOrganizationDO> list=this.listByPath(path,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPath(@Param("updateDO") SysOrganizationDO updateDO, @Param("path") String path);

        public Integer updateAllFieldsByPath(@Param("updateDO") SysOrganizationDO updateDO, @Param("path") String path);

        public Integer deleteByPath( @Param("path") String path);




        public List<SysOrganizationDO> listByInPath(@Param("pathList") Collection<String> pathList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysOrganizationDO> mapByInPath(@Param("pathList") Collection<String> pathList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInPath(@Param("pathList") Collection<String> pathList);

        public default SysOrganizationDO singleResultByInPath(Collection<String> pathList,String[] fieldNames){
             List<SysOrganizationDO> list=this.listByInPath(pathList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysOrganizationDO>> groupingByInPath(Collection<String> pathList, Function<SysOrganizationDO, T> mapper, String[] fieldNames){
             List<SysOrganizationDO> list=this.listByInPath(pathList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPath(@Param("updateDO") SysOrganizationDO updateDO, @Param("pathList") Collection<String> pathList);

        public Integer updateAllFieldsByInPath(@Param("updateDO") SysOrganizationDO updateDO, @Param("pathList") Collection<String> pathList);

        public Integer deleteByInPath( @Param("pathList") Collection<String> pathList);


}
