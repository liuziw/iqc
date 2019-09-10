package com.iqc.system.mapper;
import com.iqc.system.dbo.SysRoleMenuDO;
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
public interface SysRoleMenuMapper extends CommonMapper<SysRoleMenuDO,Long>{


        public SysRoleMenuDO getById(@Param("id") Long  id,@Param("fieldNames") String ... fieldNames);



        public List<SysRoleMenuDO> listById(@Param("id") Long id,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleMenuDO> mapById(@Param("id") Long id,@Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default SysRoleMenuDO singleResultById(Long id,String[] fieldNames){
             List<SysRoleMenuDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleMenuDO>> groupingById(Long id, Function<SysRoleMenuDO, T> mapper, String[] fieldNames){
             List<SysRoleMenuDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") SysRoleMenuDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") SysRoleMenuDO updateDO, @Param("id") Long id);

        public Integer deleteById( @Param("id") Long id);




        public List<SysRoleMenuDO> listByInId(@Param("idList") Collection<Long> idList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleMenuDO> mapByInId(@Param("idList") Collection<Long> idList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default SysRoleMenuDO singleResultByInId(Collection<Long> idList,String[] fieldNames){
             List<SysRoleMenuDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleMenuDO>> groupingByInId(Collection<Long> idList, Function<SysRoleMenuDO, T> mapper, String[] fieldNames){
             List<SysRoleMenuDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") SysRoleMenuDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") SysRoleMenuDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId( @Param("idList") Collection<Long> idList);

        public List<SysRoleMenuDO> listByRoleid(@Param("roleid") Long roleid,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleMenuDO> mapByRoleid(@Param("roleid") Long roleid,@Param("fieldNames") String[] fieldNames);

        public Integer countByRoleid(@Param("roleid") Long roleid);

        public default SysRoleMenuDO singleResultByRoleid(Long roleid,String[] fieldNames){
             List<SysRoleMenuDO> list=this.listByRoleid(roleid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleMenuDO>> groupingByRoleid(Long roleid, Function<SysRoleMenuDO, T> mapper, String[] fieldNames){
             List<SysRoleMenuDO> list=this.listByRoleid(roleid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleid(@Param("updateDO") SysRoleMenuDO updateDO, @Param("roleid") Long roleid);

        public Integer updateAllFieldsByRoleid(@Param("updateDO") SysRoleMenuDO updateDO, @Param("roleid") Long roleid);

        public Integer deleteByRoleid( @Param("roleid") Long roleid);




        public List<SysRoleMenuDO> listByInRoleid(@Param("roleidList") Collection<Long> roleidList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleMenuDO> mapByInRoleid(@Param("roleidList") Collection<Long> roleidList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInRoleid(@Param("roleidList") Collection<Long> roleidList);

        public default SysRoleMenuDO singleResultByInRoleid(Collection<Long> roleidList,String[] fieldNames){
             List<SysRoleMenuDO> list=this.listByInRoleid(roleidList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleMenuDO>> groupingByInRoleid(Collection<Long> roleidList, Function<SysRoleMenuDO, T> mapper, String[] fieldNames){
             List<SysRoleMenuDO> list=this.listByInRoleid(roleidList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRoleid(@Param("updateDO") SysRoleMenuDO updateDO, @Param("roleidList") Collection<Long> roleidList);

        public Integer updateAllFieldsByInRoleid(@Param("updateDO") SysRoleMenuDO updateDO, @Param("roleidList") Collection<Long> roleidList);

        public Integer deleteByInRoleid( @Param("roleidList") Collection<Long> roleidList);

        public List<SysRoleMenuDO> listByMenuid(@Param("menuid") Long menuid,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleMenuDO> mapByMenuid(@Param("menuid") Long menuid,@Param("fieldNames") String[] fieldNames);

        public Integer countByMenuid(@Param("menuid") Long menuid);

        public default SysRoleMenuDO singleResultByMenuid(Long menuid,String[] fieldNames){
             List<SysRoleMenuDO> list=this.listByMenuid(menuid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleMenuDO>> groupingByMenuid(Long menuid, Function<SysRoleMenuDO, T> mapper, String[] fieldNames){
             List<SysRoleMenuDO> list=this.listByMenuid(menuid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByMenuid(@Param("updateDO") SysRoleMenuDO updateDO, @Param("menuid") Long menuid);

        public Integer updateAllFieldsByMenuid(@Param("updateDO") SysRoleMenuDO updateDO, @Param("menuid") Long menuid);

        public Integer deleteByMenuid( @Param("menuid") Long menuid);




        public List<SysRoleMenuDO> listByInMenuid(@Param("menuidList") Collection<Long> menuidList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleMenuDO> mapByInMenuid(@Param("menuidList") Collection<Long> menuidList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInMenuid(@Param("menuidList") Collection<Long> menuidList);

        public default SysRoleMenuDO singleResultByInMenuid(Collection<Long> menuidList,String[] fieldNames){
             List<SysRoleMenuDO> list=this.listByInMenuid(menuidList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleMenuDO>> groupingByInMenuid(Collection<Long> menuidList, Function<SysRoleMenuDO, T> mapper, String[] fieldNames){
             List<SysRoleMenuDO> list=this.listByInMenuid(menuidList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInMenuid(@Param("updateDO") SysRoleMenuDO updateDO, @Param("menuidList") Collection<Long> menuidList);

        public Integer updateAllFieldsByInMenuid(@Param("updateDO") SysRoleMenuDO updateDO, @Param("menuidList") Collection<Long> menuidList);

        public Integer deleteByInMenuid( @Param("menuidList") Collection<Long> menuidList);

        public List<SysRoleMenuDO> listByCreatetime(@Param("createtime") java.util.Date createtime,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleMenuDO> mapByCreatetime(@Param("createtime") java.util.Date createtime,@Param("fieldNames") String[] fieldNames);

        public Integer countByCreatetime(@Param("createtime") java.util.Date createtime);

        public default SysRoleMenuDO singleResultByCreatetime(java.util.Date createtime,String[] fieldNames){
             List<SysRoleMenuDO> list=this.listByCreatetime(createtime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleMenuDO>> groupingByCreatetime(java.util.Date createtime, Function<SysRoleMenuDO, T> mapper, String[] fieldNames){
             List<SysRoleMenuDO> list=this.listByCreatetime(createtime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByCreatetime(@Param("updateDO") SysRoleMenuDO updateDO, @Param("createtime") java.util.Date createtime);

        public Integer updateAllFieldsByCreatetime(@Param("updateDO") SysRoleMenuDO updateDO, @Param("createtime") java.util.Date createtime);

        public Integer deleteByCreatetime( @Param("createtime") java.util.Date createtime);




        public List<SysRoleMenuDO> listByInCreatetime(@Param("createtimeList") Collection<java.util.Date> createtimeList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysRoleMenuDO> mapByInCreatetime(@Param("createtimeList") Collection<java.util.Date> createtimeList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInCreatetime(@Param("createtimeList") Collection<java.util.Date> createtimeList);

        public default SysRoleMenuDO singleResultByInCreatetime(Collection<java.util.Date> createtimeList,String[] fieldNames){
             List<SysRoleMenuDO> list=this.listByInCreatetime(createtimeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysRoleMenuDO>> groupingByInCreatetime(Collection<java.util.Date> createtimeList, Function<SysRoleMenuDO, T> mapper, String[] fieldNames){
             List<SysRoleMenuDO> list=this.listByInCreatetime(createtimeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInCreatetime(@Param("updateDO") SysRoleMenuDO updateDO, @Param("createtimeList") Collection<java.util.Date> createtimeList);

        public Integer updateAllFieldsByInCreatetime(@Param("updateDO") SysRoleMenuDO updateDO, @Param("createtimeList") Collection<java.util.Date> createtimeList);

        public Integer deleteByInCreatetime( @Param("createtimeList") Collection<java.util.Date> createtimeList);


}
