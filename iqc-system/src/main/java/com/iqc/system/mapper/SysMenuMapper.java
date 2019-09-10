package com.iqc.system.mapper;
import com.iqc.system.dbo.SysMenuDO;
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
public interface SysMenuMapper extends CommonMapper<SysMenuDO,Long>{


        public SysMenuDO getById(@Param("id") Long  id,@Param("fieldNames") String ... fieldNames);



        public List<SysMenuDO> listById(@Param("id") Long id,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapById(@Param("id") Long id,@Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default SysMenuDO singleResultById(Long id,String[] fieldNames){
             List<SysMenuDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingById(Long id, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") SysMenuDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") SysMenuDO updateDO, @Param("id") Long id);

        public Integer deleteById( @Param("id") Long id);




        public List<SysMenuDO> listByInId(@Param("idList") Collection<Long> idList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByInId(@Param("idList") Collection<Long> idList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default SysMenuDO singleResultByInId(Collection<Long> idList,String[] fieldNames){
             List<SysMenuDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByInId(Collection<Long> idList, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") SysMenuDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") SysMenuDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId( @Param("idList") Collection<Long> idList);

        public List<SysMenuDO> listByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        public Integer countByName(@Param("name") String name);

        public default SysMenuDO singleResultByName(String name,String[] fieldNames){
             List<SysMenuDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByName(String name, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(@Param("updateDO") SysMenuDO updateDO, @Param("name") String name);

        public Integer updateAllFieldsByName(@Param("updateDO") SysMenuDO updateDO, @Param("name") String name);

        public Integer deleteByName( @Param("name") String name);




        public List<SysMenuDO> listByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInName(@Param("nameList") Collection<String> nameList);

        public default SysMenuDO singleResultByInName(Collection<String> nameList,String[] fieldNames){
             List<SysMenuDO> list=this.listByInName(nameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByInName(Collection<String> nameList, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByInName(nameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInName(@Param("updateDO") SysMenuDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer updateAllFieldsByInName(@Param("updateDO") SysMenuDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer deleteByInName( @Param("nameList") Collection<String> nameList);

        public List<SysMenuDO> listByAlias(@Param("alias") String alias,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByAlias(@Param("alias") String alias,@Param("fieldNames") String[] fieldNames);

        public Integer countByAlias(@Param("alias") String alias);

        public default SysMenuDO singleResultByAlias(String alias,String[] fieldNames){
             List<SysMenuDO> list=this.listByAlias(alias,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByAlias(String alias, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByAlias(alias,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAlias(@Param("updateDO") SysMenuDO updateDO, @Param("alias") String alias);

        public Integer updateAllFieldsByAlias(@Param("updateDO") SysMenuDO updateDO, @Param("alias") String alias);

        public Integer deleteByAlias( @Param("alias") String alias);




        public List<SysMenuDO> listByInAlias(@Param("aliasList") Collection<String> aliasList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByInAlias(@Param("aliasList") Collection<String> aliasList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInAlias(@Param("aliasList") Collection<String> aliasList);

        public default SysMenuDO singleResultByInAlias(Collection<String> aliasList,String[] fieldNames){
             List<SysMenuDO> list=this.listByInAlias(aliasList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByInAlias(Collection<String> aliasList, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByInAlias(aliasList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInAlias(@Param("updateDO") SysMenuDO updateDO, @Param("aliasList") Collection<String> aliasList);

        public Integer updateAllFieldsByInAlias(@Param("updateDO") SysMenuDO updateDO, @Param("aliasList") Collection<String> aliasList);

        public Integer deleteByInAlias( @Param("aliasList") Collection<String> aliasList);

        public List<SysMenuDO> listByDescription(@Param("description") String description,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByDescription(@Param("description") String description,@Param("fieldNames") String[] fieldNames);

        public Integer countByDescription(@Param("description") String description);

        public default SysMenuDO singleResultByDescription(String description,String[] fieldNames){
             List<SysMenuDO> list=this.listByDescription(description,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByDescription(String description, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByDescription(description,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDescription(@Param("updateDO") SysMenuDO updateDO, @Param("description") String description);

        public Integer updateAllFieldsByDescription(@Param("updateDO") SysMenuDO updateDO, @Param("description") String description);

        public Integer deleteByDescription( @Param("description") String description);




        public List<SysMenuDO> listByInDescription(@Param("descriptionList") Collection<String> descriptionList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByInDescription(@Param("descriptionList") Collection<String> descriptionList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInDescription(@Param("descriptionList") Collection<String> descriptionList);

        public default SysMenuDO singleResultByInDescription(Collection<String> descriptionList,String[] fieldNames){
             List<SysMenuDO> list=this.listByInDescription(descriptionList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByInDescription(Collection<String> descriptionList, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByInDescription(descriptionList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDescription(@Param("updateDO") SysMenuDO updateDO, @Param("descriptionList") Collection<String> descriptionList);

        public Integer updateAllFieldsByInDescription(@Param("updateDO") SysMenuDO updateDO, @Param("descriptionList") Collection<String> descriptionList);

        public Integer deleteByInDescription( @Param("descriptionList") Collection<String> descriptionList);

        public List<SysMenuDO> listByPid(@Param("pid") Long pid,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByPid(@Param("pid") Long pid,@Param("fieldNames") String[] fieldNames);

        public Integer countByPid(@Param("pid") Long pid);

        public default SysMenuDO singleResultByPid(Long pid,String[] fieldNames){
             List<SysMenuDO> list=this.listByPid(pid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByPid(Long pid, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByPid(pid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPid(@Param("updateDO") SysMenuDO updateDO, @Param("pid") Long pid);

        public Integer updateAllFieldsByPid(@Param("updateDO") SysMenuDO updateDO, @Param("pid") Long pid);

        public Integer deleteByPid( @Param("pid") Long pid);




        public List<SysMenuDO> listByInPid(@Param("pidList") Collection<Long> pidList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByInPid(@Param("pidList") Collection<Long> pidList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInPid(@Param("pidList") Collection<Long> pidList);

        public default SysMenuDO singleResultByInPid(Collection<Long> pidList,String[] fieldNames){
             List<SysMenuDO> list=this.listByInPid(pidList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByInPid(Collection<Long> pidList, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByInPid(pidList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPid(@Param("updateDO") SysMenuDO updateDO, @Param("pidList") Collection<Long> pidList);

        public Integer updateAllFieldsByInPid(@Param("updateDO") SysMenuDO updateDO, @Param("pidList") Collection<Long> pidList);

        public Integer deleteByInPid( @Param("pidList") Collection<Long> pidList);

        public List<SysMenuDO> listByType(@Param("type") Integer type,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByType(@Param("type") Integer type,@Param("fieldNames") String[] fieldNames);

        public Integer countByType(@Param("type") Integer type);

        public default SysMenuDO singleResultByType(Integer type,String[] fieldNames){
             List<SysMenuDO> list=this.listByType(type,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByType(Integer type, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByType(type,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByType(@Param("updateDO") SysMenuDO updateDO, @Param("type") Integer type);

        public Integer updateAllFieldsByType(@Param("updateDO") SysMenuDO updateDO, @Param("type") Integer type);

        public Integer deleteByType( @Param("type") Integer type);




        public List<SysMenuDO> listByInType(@Param("typeList") Collection<Integer> typeList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByInType(@Param("typeList") Collection<Integer> typeList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInType(@Param("typeList") Collection<Integer> typeList);

        public default SysMenuDO singleResultByInType(Collection<Integer> typeList,String[] fieldNames){
             List<SysMenuDO> list=this.listByInType(typeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByInType(Collection<Integer> typeList, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByInType(typeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInType(@Param("updateDO") SysMenuDO updateDO, @Param("typeList") Collection<Integer> typeList);

        public Integer updateAllFieldsByInType(@Param("updateDO") SysMenuDO updateDO, @Param("typeList") Collection<Integer> typeList);

        public Integer deleteByInType( @Param("typeList") Collection<Integer> typeList);

        public List<SysMenuDO> listByOrdernum(@Param("ordernum") Integer ordernum,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByOrdernum(@Param("ordernum") Integer ordernum,@Param("fieldNames") String[] fieldNames);

        public Integer countByOrdernum(@Param("ordernum") Integer ordernum);

        public default SysMenuDO singleResultByOrdernum(Integer ordernum,String[] fieldNames){
             List<SysMenuDO> list=this.listByOrdernum(ordernum,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByOrdernum(Integer ordernum, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByOrdernum(ordernum,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByOrdernum(@Param("updateDO") SysMenuDO updateDO, @Param("ordernum") Integer ordernum);

        public Integer updateAllFieldsByOrdernum(@Param("updateDO") SysMenuDO updateDO, @Param("ordernum") Integer ordernum);

        public Integer deleteByOrdernum( @Param("ordernum") Integer ordernum);




        public List<SysMenuDO> listByInOrdernum(@Param("ordernumList") Collection<Integer> ordernumList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByInOrdernum(@Param("ordernumList") Collection<Integer> ordernumList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInOrdernum(@Param("ordernumList") Collection<Integer> ordernumList);

        public default SysMenuDO singleResultByInOrdernum(Collection<Integer> ordernumList,String[] fieldNames){
             List<SysMenuDO> list=this.listByInOrdernum(ordernumList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByInOrdernum(Collection<Integer> ordernumList, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByInOrdernum(ordernumList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInOrdernum(@Param("updateDO") SysMenuDO updateDO, @Param("ordernumList") Collection<Integer> ordernumList);

        public Integer updateAllFieldsByInOrdernum(@Param("updateDO") SysMenuDO updateDO, @Param("ordernumList") Collection<Integer> ordernumList);

        public Integer deleteByInOrdernum( @Param("ordernumList") Collection<Integer> ordernumList);

        public List<SysMenuDO> listByIcon(@Param("icon") String icon,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByIcon(@Param("icon") String icon,@Param("fieldNames") String[] fieldNames);

        public Integer countByIcon(@Param("icon") String icon);

        public default SysMenuDO singleResultByIcon(String icon,String[] fieldNames){
             List<SysMenuDO> list=this.listByIcon(icon,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByIcon(String icon, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByIcon(icon,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByIcon(@Param("updateDO") SysMenuDO updateDO, @Param("icon") String icon);

        public Integer updateAllFieldsByIcon(@Param("updateDO") SysMenuDO updateDO, @Param("icon") String icon);

        public Integer deleteByIcon( @Param("icon") String icon);




        public List<SysMenuDO> listByInIcon(@Param("iconList") Collection<String> iconList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByInIcon(@Param("iconList") Collection<String> iconList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInIcon(@Param("iconList") Collection<String> iconList);

        public default SysMenuDO singleResultByInIcon(Collection<String> iconList,String[] fieldNames){
             List<SysMenuDO> list=this.listByInIcon(iconList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByInIcon(Collection<String> iconList, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByInIcon(iconList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInIcon(@Param("updateDO") SysMenuDO updateDO, @Param("iconList") Collection<String> iconList);

        public Integer updateAllFieldsByInIcon(@Param("updateDO") SysMenuDO updateDO, @Param("iconList") Collection<String> iconList);

        public Integer deleteByInIcon( @Param("iconList") Collection<String> iconList);

        public List<SysMenuDO> listByPerms(@Param("perms") String perms,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByPerms(@Param("perms") String perms,@Param("fieldNames") String[] fieldNames);

        public Integer countByPerms(@Param("perms") String perms);

        public default SysMenuDO singleResultByPerms(String perms,String[] fieldNames){
             List<SysMenuDO> list=this.listByPerms(perms,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByPerms(String perms, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByPerms(perms,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPerms(@Param("updateDO") SysMenuDO updateDO, @Param("perms") String perms);

        public Integer updateAllFieldsByPerms(@Param("updateDO") SysMenuDO updateDO, @Param("perms") String perms);

        public Integer deleteByPerms( @Param("perms") String perms);




        public List<SysMenuDO> listByInPerms(@Param("permsList") Collection<String> permsList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByInPerms(@Param("permsList") Collection<String> permsList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInPerms(@Param("permsList") Collection<String> permsList);

        public default SysMenuDO singleResultByInPerms(Collection<String> permsList,String[] fieldNames){
             List<SysMenuDO> list=this.listByInPerms(permsList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByInPerms(Collection<String> permsList, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByInPerms(permsList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPerms(@Param("updateDO") SysMenuDO updateDO, @Param("permsList") Collection<String> permsList);

        public Integer updateAllFieldsByInPerms(@Param("updateDO") SysMenuDO updateDO, @Param("permsList") Collection<String> permsList);

        public Integer deleteByInPerms( @Param("permsList") Collection<String> permsList);

        public List<SysMenuDO> listByUrl(@Param("url") String url,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByUrl(@Param("url") String url,@Param("fieldNames") String[] fieldNames);

        public Integer countByUrl(@Param("url") String url);

        public default SysMenuDO singleResultByUrl(String url,String[] fieldNames){
             List<SysMenuDO> list=this.listByUrl(url,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByUrl(String url, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByUrl(url,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUrl(@Param("updateDO") SysMenuDO updateDO, @Param("url") String url);

        public Integer updateAllFieldsByUrl(@Param("updateDO") SysMenuDO updateDO, @Param("url") String url);

        public Integer deleteByUrl( @Param("url") String url);




        public List<SysMenuDO> listByInUrl(@Param("urlList") Collection<String> urlList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysMenuDO> mapByInUrl(@Param("urlList") Collection<String> urlList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInUrl(@Param("urlList") Collection<String> urlList);

        public default SysMenuDO singleResultByInUrl(Collection<String> urlList,String[] fieldNames){
             List<SysMenuDO> list=this.listByInUrl(urlList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByInUrl(Collection<String> urlList, Function<SysMenuDO, T> mapper, String[] fieldNames){
             List<SysMenuDO> list=this.listByInUrl(urlList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUrl(@Param("updateDO") SysMenuDO updateDO, @Param("urlList") Collection<String> urlList);

        public Integer updateAllFieldsByInUrl(@Param("updateDO") SysMenuDO updateDO, @Param("urlList") Collection<String> urlList);

        public Integer deleteByInUrl( @Param("urlList") Collection<String> urlList);


}
