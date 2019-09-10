package com.iqc.system.mapper;
import com.iqc.system.dbo.SysUserDO;
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
public interface SysUserMapper extends CommonMapper<SysUserDO,Long>{


        public SysUserDO getById(@Param("id") Long  id,@Param("fieldNames") String ... fieldNames);



        public List<SysUserDO> listById(@Param("id") Long id,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserDO> mapById(@Param("id") Long id,@Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default SysUserDO singleResultById(Long id,String[] fieldNames){
             List<SysUserDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingById(Long id, Function<SysUserDO, T> mapper, String[] fieldNames){
             List<SysUserDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") SysUserDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") SysUserDO updateDO, @Param("id") Long id);

        public Integer deleteById( @Param("id") Long id);




        public List<SysUserDO> listByInId(@Param("idList") Collection<Long> idList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserDO> mapByInId(@Param("idList") Collection<Long> idList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default SysUserDO singleResultByInId(Collection<Long> idList,String[] fieldNames){
             List<SysUserDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByInId(Collection<Long> idList, Function<SysUserDO, T> mapper, String[] fieldNames){
             List<SysUserDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") SysUserDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") SysUserDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId( @Param("idList") Collection<Long> idList);

        public List<SysUserDO> listByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserDO> mapByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        public Integer countByName(@Param("name") String name);

        public default SysUserDO singleResultByName(String name,String[] fieldNames){
             List<SysUserDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByName(String name, Function<SysUserDO, T> mapper, String[] fieldNames){
             List<SysUserDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(@Param("updateDO") SysUserDO updateDO, @Param("name") String name);

        public Integer updateAllFieldsByName(@Param("updateDO") SysUserDO updateDO, @Param("name") String name);

        public Integer deleteByName( @Param("name") String name);




        public List<SysUserDO> listByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserDO> mapByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInName(@Param("nameList") Collection<String> nameList);

        public default SysUserDO singleResultByInName(Collection<String> nameList,String[] fieldNames){
             List<SysUserDO> list=this.listByInName(nameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByInName(Collection<String> nameList, Function<SysUserDO, T> mapper, String[] fieldNames){
             List<SysUserDO> list=this.listByInName(nameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInName(@Param("updateDO") SysUserDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer updateAllFieldsByInName(@Param("updateDO") SysUserDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer deleteByInName( @Param("nameList") Collection<String> nameList);

        public List<SysUserDO> listByUsername(@Param("username") String username,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserDO> mapByUsername(@Param("username") String username,@Param("fieldNames") String[] fieldNames);

        public Integer countByUsername(@Param("username") String username);

        public default SysUserDO singleResultByUsername(String username,String[] fieldNames){
             List<SysUserDO> list=this.listByUsername(username,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByUsername(String username, Function<SysUserDO, T> mapper, String[] fieldNames){
             List<SysUserDO> list=this.listByUsername(username,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUsername(@Param("updateDO") SysUserDO updateDO, @Param("username") String username);

        public Integer updateAllFieldsByUsername(@Param("updateDO") SysUserDO updateDO, @Param("username") String username);

        public Integer deleteByUsername( @Param("username") String username);




        public List<SysUserDO> listByInUsername(@Param("usernameList") Collection<String> usernameList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserDO> mapByInUsername(@Param("usernameList") Collection<String> usernameList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInUsername(@Param("usernameList") Collection<String> usernameList);

        public default SysUserDO singleResultByInUsername(Collection<String> usernameList,String[] fieldNames){
             List<SysUserDO> list=this.listByInUsername(usernameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByInUsername(Collection<String> usernameList, Function<SysUserDO, T> mapper, String[] fieldNames){
             List<SysUserDO> list=this.listByInUsername(usernameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUsername(@Param("updateDO") SysUserDO updateDO, @Param("usernameList") Collection<String> usernameList);

        public Integer updateAllFieldsByInUsername(@Param("updateDO") SysUserDO updateDO, @Param("usernameList") Collection<String> usernameList);

        public Integer deleteByInUsername( @Param("usernameList") Collection<String> usernameList);

        public List<SysUserDO> listByPassword(@Param("password") String password,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserDO> mapByPassword(@Param("password") String password,@Param("fieldNames") String[] fieldNames);

        public Integer countByPassword(@Param("password") String password);

        public default SysUserDO singleResultByPassword(String password,String[] fieldNames){
             List<SysUserDO> list=this.listByPassword(password,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByPassword(String password, Function<SysUserDO, T> mapper, String[] fieldNames){
             List<SysUserDO> list=this.listByPassword(password,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPassword(@Param("updateDO") SysUserDO updateDO, @Param("password") String password);

        public Integer updateAllFieldsByPassword(@Param("updateDO") SysUserDO updateDO, @Param("password") String password);

        public Integer deleteByPassword( @Param("password") String password);




        public List<SysUserDO> listByInPassword(@Param("passwordList") Collection<String> passwordList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserDO> mapByInPassword(@Param("passwordList") Collection<String> passwordList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInPassword(@Param("passwordList") Collection<String> passwordList);

        public default SysUserDO singleResultByInPassword(Collection<String> passwordList,String[] fieldNames){
             List<SysUserDO> list=this.listByInPassword(passwordList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByInPassword(Collection<String> passwordList, Function<SysUserDO, T> mapper, String[] fieldNames){
             List<SysUserDO> list=this.listByInPassword(passwordList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPassword(@Param("updateDO") SysUserDO updateDO, @Param("passwordList") Collection<String> passwordList);

        public Integer updateAllFieldsByInPassword(@Param("updateDO") SysUserDO updateDO, @Param("passwordList") Collection<String> passwordList);

        public Integer deleteByInPassword( @Param("passwordList") Collection<String> passwordList);

        public List<SysUserDO> listByOrgid(@Param("orgid") Long orgid,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserDO> mapByOrgid(@Param("orgid") Long orgid,@Param("fieldNames") String[] fieldNames);

        public Integer countByOrgid(@Param("orgid") Long orgid);

        public default SysUserDO singleResultByOrgid(Long orgid,String[] fieldNames){
             List<SysUserDO> list=this.listByOrgid(orgid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByOrgid(Long orgid, Function<SysUserDO, T> mapper, String[] fieldNames){
             List<SysUserDO> list=this.listByOrgid(orgid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByOrgid(@Param("updateDO") SysUserDO updateDO, @Param("orgid") Long orgid);

        public Integer updateAllFieldsByOrgid(@Param("updateDO") SysUserDO updateDO, @Param("orgid") Long orgid);

        public Integer deleteByOrgid( @Param("orgid") Long orgid);




        public List<SysUserDO> listByInOrgid(@Param("orgidList") Collection<Long> orgidList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserDO> mapByInOrgid(@Param("orgidList") Collection<Long> orgidList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInOrgid(@Param("orgidList") Collection<Long> orgidList);

        public default SysUserDO singleResultByInOrgid(Collection<Long> orgidList,String[] fieldNames){
             List<SysUserDO> list=this.listByInOrgid(orgidList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByInOrgid(Collection<Long> orgidList, Function<SysUserDO, T> mapper, String[] fieldNames){
             List<SysUserDO> list=this.listByInOrgid(orgidList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInOrgid(@Param("updateDO") SysUserDO updateDO, @Param("orgidList") Collection<Long> orgidList);

        public Integer updateAllFieldsByInOrgid(@Param("updateDO") SysUserDO updateDO, @Param("orgidList") Collection<Long> orgidList);

        public Integer deleteByInOrgid( @Param("orgidList") Collection<Long> orgidList);

        public List<SysUserDO> listByStatus(@Param("status") Integer status,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserDO> mapByStatus(@Param("status") Integer status,@Param("fieldNames") String[] fieldNames);

        public Integer countByStatus(@Param("status") Integer status);

        public default SysUserDO singleResultByStatus(Integer status,String[] fieldNames){
             List<SysUserDO> list=this.listByStatus(status,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByStatus(Integer status, Function<SysUserDO, T> mapper, String[] fieldNames){
             List<SysUserDO> list=this.listByStatus(status,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByStatus(@Param("updateDO") SysUserDO updateDO, @Param("status") Integer status);

        public Integer updateAllFieldsByStatus(@Param("updateDO") SysUserDO updateDO, @Param("status") Integer status);

        public Integer deleteByStatus( @Param("status") Integer status);




        public List<SysUserDO> listByInStatus(@Param("statusList") Collection<Integer> statusList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysUserDO> mapByInStatus(@Param("statusList") Collection<Integer> statusList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInStatus(@Param("statusList") Collection<Integer> statusList);

        public default SysUserDO singleResultByInStatus(Collection<Integer> statusList,String[] fieldNames){
             List<SysUserDO> list=this.listByInStatus(statusList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysUserDO>> groupingByInStatus(Collection<Integer> statusList, Function<SysUserDO, T> mapper, String[] fieldNames){
             List<SysUserDO> list=this.listByInStatus(statusList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInStatus(@Param("updateDO") SysUserDO updateDO, @Param("statusList") Collection<Integer> statusList);

        public Integer updateAllFieldsByInStatus(@Param("updateDO") SysUserDO updateDO, @Param("statusList") Collection<Integer> statusList);

        public Integer deleteByInStatus( @Param("statusList") Collection<Integer> statusList);


}
