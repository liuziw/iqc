package com.iqc.system.mapper;
import com.iqc.system.dbo.SysUserRoleDO;
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
public interface SysUserRoleMapper extends CommonMapper<SysUserRoleDO,Long>{


        public SysUserRoleDO getById(@Param("id") Long  id,@Param("fieldNames") String ... fieldNames);



        public List<SysUserRoleDO> listById(@Param("id") Long id,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserRoleDO> mapById(@Param("id") Long id,@Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default SysUserRoleDO singleResultById(Long id,String[] fieldNames){
             List<SysUserRoleDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserRoleDO>> groupingById(Long id, Function<SysUserRoleDO, T> mapper, String[] fieldNames){
             List<SysUserRoleDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") SysUserRoleDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") SysUserRoleDO updateDO, @Param("id") Long id);

        public Integer deleteById( @Param("id") Long id);




        public List<SysUserRoleDO> listByInId(@Param("idList") Collection<Long> idList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserRoleDO> mapByInId(@Param("idList") Collection<Long> idList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default SysUserRoleDO singleResultByInId(Collection<Long> idList,String[] fieldNames){
             List<SysUserRoleDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserRoleDO>> groupingByInId(Collection<Long> idList, Function<SysUserRoleDO, T> mapper, String[] fieldNames){
             List<SysUserRoleDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") SysUserRoleDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") SysUserRoleDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId( @Param("idList") Collection<Long> idList);

        public List<SysUserRoleDO> listByUserid(@Param("userid") Long userid,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserRoleDO> mapByUserid(@Param("userid") Long userid,@Param("fieldNames") String[] fieldNames);

        public Integer countByUserid(@Param("userid") Long userid);

        public default SysUserRoleDO singleResultByUserid(Long userid,String[] fieldNames){
             List<SysUserRoleDO> list=this.listByUserid(userid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserRoleDO>> groupingByUserid(Long userid, Function<SysUserRoleDO, T> mapper, String[] fieldNames){
             List<SysUserRoleDO> list=this.listByUserid(userid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserid(@Param("updateDO") SysUserRoleDO updateDO, @Param("userid") Long userid);

        public Integer updateAllFieldsByUserid(@Param("updateDO") SysUserRoleDO updateDO, @Param("userid") Long userid);

        public Integer deleteByUserid( @Param("userid") Long userid);




        public List<SysUserRoleDO> listByInUserid(@Param("useridList") Collection<Long> useridList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserRoleDO> mapByInUserid(@Param("useridList") Collection<Long> useridList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInUserid(@Param("useridList") Collection<Long> useridList);

        public default SysUserRoleDO singleResultByInUserid(Collection<Long> useridList,String[] fieldNames){
             List<SysUserRoleDO> list=this.listByInUserid(useridList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserRoleDO>> groupingByInUserid(Collection<Long> useridList, Function<SysUserRoleDO, T> mapper, String[] fieldNames){
             List<SysUserRoleDO> list=this.listByInUserid(useridList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserid(@Param("updateDO") SysUserRoleDO updateDO, @Param("useridList") Collection<Long> useridList);

        public Integer updateAllFieldsByInUserid(@Param("updateDO") SysUserRoleDO updateDO, @Param("useridList") Collection<Long> useridList);

        public Integer deleteByInUserid( @Param("useridList") Collection<Long> useridList);

        public List<SysUserRoleDO> listByRoleid(@Param("roleid") Long roleid,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserRoleDO> mapByRoleid(@Param("roleid") Long roleid,@Param("fieldNames") String[] fieldNames);

        public Integer countByRoleid(@Param("roleid") Long roleid);

        public default SysUserRoleDO singleResultByRoleid(Long roleid,String[] fieldNames){
             List<SysUserRoleDO> list=this.listByRoleid(roleid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserRoleDO>> groupingByRoleid(Long roleid, Function<SysUserRoleDO, T> mapper, String[] fieldNames){
             List<SysUserRoleDO> list=this.listByRoleid(roleid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleid(@Param("updateDO") SysUserRoleDO updateDO, @Param("roleid") Long roleid);

        public Integer updateAllFieldsByRoleid(@Param("updateDO") SysUserRoleDO updateDO, @Param("roleid") Long roleid);

        public Integer deleteByRoleid( @Param("roleid") Long roleid);




        public List<SysUserRoleDO> listByInRoleid(@Param("roleidList") Collection<Long> roleidList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserRoleDO> mapByInRoleid(@Param("roleidList") Collection<Long> roleidList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInRoleid(@Param("roleidList") Collection<Long> roleidList);

        public default SysUserRoleDO singleResultByInRoleid(Collection<Long> roleidList,String[] fieldNames){
             List<SysUserRoleDO> list=this.listByInRoleid(roleidList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserRoleDO>> groupingByInRoleid(Collection<Long> roleidList, Function<SysUserRoleDO, T> mapper, String[] fieldNames){
             List<SysUserRoleDO> list=this.listByInRoleid(roleidList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRoleid(@Param("updateDO") SysUserRoleDO updateDO, @Param("roleidList") Collection<Long> roleidList);

        public Integer updateAllFieldsByInRoleid(@Param("updateDO") SysUserRoleDO updateDO, @Param("roleidList") Collection<Long> roleidList);

        public Integer deleteByInRoleid( @Param("roleidList") Collection<Long> roleidList);

        public List<SysUserRoleDO> listByCreatetime(@Param("createtime") java.util.Date createtime,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserRoleDO> mapByCreatetime(@Param("createtime") java.util.Date createtime,@Param("fieldNames") String[] fieldNames);

        public Integer countByCreatetime(@Param("createtime") java.util.Date createtime);

        public default SysUserRoleDO singleResultByCreatetime(java.util.Date createtime,String[] fieldNames){
             List<SysUserRoleDO> list=this.listByCreatetime(createtime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserRoleDO>> groupingByCreatetime(java.util.Date createtime, Function<SysUserRoleDO, T> mapper, String[] fieldNames){
             List<SysUserRoleDO> list=this.listByCreatetime(createtime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByCreatetime(@Param("updateDO") SysUserRoleDO updateDO, @Param("createtime") java.util.Date createtime);

        public Integer updateAllFieldsByCreatetime(@Param("updateDO") SysUserRoleDO updateDO, @Param("createtime") java.util.Date createtime);

        public Integer deleteByCreatetime( @Param("createtime") java.util.Date createtime);




        public List<SysUserRoleDO> listByInCreatetime(@Param("createtimeList") Collection<java.util.Date> createtimeList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserRoleDO> mapByInCreatetime(@Param("createtimeList") Collection<java.util.Date> createtimeList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInCreatetime(@Param("createtimeList") Collection<java.util.Date> createtimeList);

        public default SysUserRoleDO singleResultByInCreatetime(Collection<java.util.Date> createtimeList,String[] fieldNames){
             List<SysUserRoleDO> list=this.listByInCreatetime(createtimeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserRoleDO>> groupingByInCreatetime(Collection<java.util.Date> createtimeList, Function<SysUserRoleDO, T> mapper, String[] fieldNames){
             List<SysUserRoleDO> list=this.listByInCreatetime(createtimeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInCreatetime(@Param("updateDO") SysUserRoleDO updateDO, @Param("createtimeList") Collection<java.util.Date> createtimeList);

        public Integer updateAllFieldsByInCreatetime(@Param("updateDO") SysUserRoleDO updateDO, @Param("createtimeList") Collection<java.util.Date> createtimeList);

        public Integer deleteByInCreatetime( @Param("createtimeList") Collection<java.util.Date> createtimeList);


}
