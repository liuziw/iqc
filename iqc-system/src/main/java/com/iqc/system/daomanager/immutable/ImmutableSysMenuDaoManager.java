package com.iqc.system.daomanager.immutable;

import com.iqc.system.dbo.SysMenuDO;
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
public interface ImmutableSysMenuDaoManager extends CommonDaoManager<SysMenuDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public SysMenuDO getById(Long id);

        public List<SysMenuDO> listById(Long id, String... fieldNames);

        public Map<Long,SysMenuDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default SysMenuDO singleResultById(Long id,String... fieldNames){
             List<SysMenuDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingById(Long id, Function<SysMenuDO, T> mapper, String... fieldNames){
             List<SysMenuDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(SysMenuDO updateDO, Long id);

        public Integer updateAllFieldsById(SysMenuDO updateDO,  Long id);

        public Integer deleteById( Long id);






        public List<SysMenuDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,SysMenuDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default SysMenuDO singleResultByInId(Collection<Long> idList,String... fieldNames){
              List<SysMenuDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysMenuDO>> groupingByInId(Collection<Long> idList, Function<SysMenuDO, T> mapper, String... fieldNames){
              List<SysMenuDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(SysMenuDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(SysMenuDO updateDO,  Collection<Long> idList);

         public Integer deleteByInId( Collection<Long> idList);
        public List<SysMenuDO> listByName(String name, String... fieldNames);

        public Map<Long,SysMenuDO> mapByName(String name, String... fieldNames);

        public Integer countByName(String name);

        public default SysMenuDO singleResultByName(String name,String... fieldNames){
             List<SysMenuDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByName(String name, Function<SysMenuDO, T> mapper, String... fieldNames){
             List<SysMenuDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(SysMenuDO updateDO, String name);

        public Integer updateAllFieldsByName(SysMenuDO updateDO,  String name);

        public Integer deleteByName( String name);






        public List<SysMenuDO> listByInName(Collection<String> nameList, String... fieldNames);

         public Map<Long,SysMenuDO> mapByInName(Collection<String> nameList, String... fieldNames);

         public Integer countByInName(Collection<String> nameList);

         public default SysMenuDO singleResultByInName(Collection<String> nameList,String... fieldNames){
              List<SysMenuDO> list=this.listByInName(nameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysMenuDO>> groupingByInName(Collection<String> nameList, Function<SysMenuDO, T> mapper, String... fieldNames){
              List<SysMenuDO> list=this.listByInName(nameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInName(SysMenuDO updateDO, Collection<String> nameList);

         public Integer updateAllFieldsByInName(SysMenuDO updateDO,  Collection<String> nameList);

         public Integer deleteByInName( Collection<String> nameList);
        public List<SysMenuDO> listByAlias(String alias, String... fieldNames);

        public Map<Long,SysMenuDO> mapByAlias(String alias, String... fieldNames);

        public Integer countByAlias(String alias);

        public default SysMenuDO singleResultByAlias(String alias,String... fieldNames){
             List<SysMenuDO> list=this.listByAlias(alias,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByAlias(String alias, Function<SysMenuDO, T> mapper, String... fieldNames){
             List<SysMenuDO> list=this.listByAlias(alias,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAlias(SysMenuDO updateDO, String alias);

        public Integer updateAllFieldsByAlias(SysMenuDO updateDO,  String alias);

        public Integer deleteByAlias( String alias);






        public List<SysMenuDO> listByInAlias(Collection<String> aliasList, String... fieldNames);

         public Map<Long,SysMenuDO> mapByInAlias(Collection<String> aliasList, String... fieldNames);

         public Integer countByInAlias(Collection<String> aliasList);

         public default SysMenuDO singleResultByInAlias(Collection<String> aliasList,String... fieldNames){
              List<SysMenuDO> list=this.listByInAlias(aliasList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysMenuDO>> groupingByInAlias(Collection<String> aliasList, Function<SysMenuDO, T> mapper, String... fieldNames){
              List<SysMenuDO> list=this.listByInAlias(aliasList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInAlias(SysMenuDO updateDO, Collection<String> aliasList);

         public Integer updateAllFieldsByInAlias(SysMenuDO updateDO,  Collection<String> aliasList);

         public Integer deleteByInAlias( Collection<String> aliasList);
        public List<SysMenuDO> listByDescription(String description, String... fieldNames);

        public Map<Long,SysMenuDO> mapByDescription(String description, String... fieldNames);

        public Integer countByDescription(String description);

        public default SysMenuDO singleResultByDescription(String description,String... fieldNames){
             List<SysMenuDO> list=this.listByDescription(description,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByDescription(String description, Function<SysMenuDO, T> mapper, String... fieldNames){
             List<SysMenuDO> list=this.listByDescription(description,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDescription(SysMenuDO updateDO, String description);

        public Integer updateAllFieldsByDescription(SysMenuDO updateDO,  String description);

        public Integer deleteByDescription( String description);






        public List<SysMenuDO> listByInDescription(Collection<String> descriptionList, String... fieldNames);

         public Map<Long,SysMenuDO> mapByInDescription(Collection<String> descriptionList, String... fieldNames);

         public Integer countByInDescription(Collection<String> descriptionList);

         public default SysMenuDO singleResultByInDescription(Collection<String> descriptionList,String... fieldNames){
              List<SysMenuDO> list=this.listByInDescription(descriptionList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysMenuDO>> groupingByInDescription(Collection<String> descriptionList, Function<SysMenuDO, T> mapper, String... fieldNames){
              List<SysMenuDO> list=this.listByInDescription(descriptionList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDescription(SysMenuDO updateDO, Collection<String> descriptionList);

         public Integer updateAllFieldsByInDescription(SysMenuDO updateDO,  Collection<String> descriptionList);

         public Integer deleteByInDescription( Collection<String> descriptionList);
        public List<SysMenuDO> listByPid(Long pid, String... fieldNames);

        public Map<Long,SysMenuDO> mapByPid(Long pid, String... fieldNames);

        public Integer countByPid(Long pid);

        public default SysMenuDO singleResultByPid(Long pid,String... fieldNames){
             List<SysMenuDO> list=this.listByPid(pid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByPid(Long pid, Function<SysMenuDO, T> mapper, String... fieldNames){
             List<SysMenuDO> list=this.listByPid(pid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPid(SysMenuDO updateDO, Long pid);

        public Integer updateAllFieldsByPid(SysMenuDO updateDO,  Long pid);

        public Integer deleteByPid( Long pid);






        public List<SysMenuDO> listByInPid(Collection<Long> pidList, String... fieldNames);

         public Map<Long,SysMenuDO> mapByInPid(Collection<Long> pidList, String... fieldNames);

         public Integer countByInPid(Collection<Long> pidList);

         public default SysMenuDO singleResultByInPid(Collection<Long> pidList,String... fieldNames){
              List<SysMenuDO> list=this.listByInPid(pidList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysMenuDO>> groupingByInPid(Collection<Long> pidList, Function<SysMenuDO, T> mapper, String... fieldNames){
              List<SysMenuDO> list=this.listByInPid(pidList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPid(SysMenuDO updateDO, Collection<Long> pidList);

         public Integer updateAllFieldsByInPid(SysMenuDO updateDO,  Collection<Long> pidList);

         public Integer deleteByInPid( Collection<Long> pidList);
        public List<SysMenuDO> listByType(Integer type, String... fieldNames);

        public Map<Long,SysMenuDO> mapByType(Integer type, String... fieldNames);

        public Integer countByType(Integer type);

        public default SysMenuDO singleResultByType(Integer type,String... fieldNames){
             List<SysMenuDO> list=this.listByType(type,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByType(Integer type, Function<SysMenuDO, T> mapper, String... fieldNames){
             List<SysMenuDO> list=this.listByType(type,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByType(SysMenuDO updateDO, Integer type);

        public Integer updateAllFieldsByType(SysMenuDO updateDO,  Integer type);

        public Integer deleteByType( Integer type);






        public List<SysMenuDO> listByInType(Collection<Integer> typeList, String... fieldNames);

         public Map<Long,SysMenuDO> mapByInType(Collection<Integer> typeList, String... fieldNames);

         public Integer countByInType(Collection<Integer> typeList);

         public default SysMenuDO singleResultByInType(Collection<Integer> typeList,String... fieldNames){
              List<SysMenuDO> list=this.listByInType(typeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysMenuDO>> groupingByInType(Collection<Integer> typeList, Function<SysMenuDO, T> mapper, String... fieldNames){
              List<SysMenuDO> list=this.listByInType(typeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInType(SysMenuDO updateDO, Collection<Integer> typeList);

         public Integer updateAllFieldsByInType(SysMenuDO updateDO,  Collection<Integer> typeList);

         public Integer deleteByInType( Collection<Integer> typeList);
        public List<SysMenuDO> listByOrdernum(Integer ordernum, String... fieldNames);

        public Map<Long,SysMenuDO> mapByOrdernum(Integer ordernum, String... fieldNames);

        public Integer countByOrdernum(Integer ordernum);

        public default SysMenuDO singleResultByOrdernum(Integer ordernum,String... fieldNames){
             List<SysMenuDO> list=this.listByOrdernum(ordernum,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByOrdernum(Integer ordernum, Function<SysMenuDO, T> mapper, String... fieldNames){
             List<SysMenuDO> list=this.listByOrdernum(ordernum,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByOrdernum(SysMenuDO updateDO, Integer ordernum);

        public Integer updateAllFieldsByOrdernum(SysMenuDO updateDO,  Integer ordernum);

        public Integer deleteByOrdernum( Integer ordernum);






        public List<SysMenuDO> listByInOrdernum(Collection<Integer> ordernumList, String... fieldNames);

         public Map<Long,SysMenuDO> mapByInOrdernum(Collection<Integer> ordernumList, String... fieldNames);

         public Integer countByInOrdernum(Collection<Integer> ordernumList);

         public default SysMenuDO singleResultByInOrdernum(Collection<Integer> ordernumList,String... fieldNames){
              List<SysMenuDO> list=this.listByInOrdernum(ordernumList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysMenuDO>> groupingByInOrdernum(Collection<Integer> ordernumList, Function<SysMenuDO, T> mapper, String... fieldNames){
              List<SysMenuDO> list=this.listByInOrdernum(ordernumList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInOrdernum(SysMenuDO updateDO, Collection<Integer> ordernumList);

         public Integer updateAllFieldsByInOrdernum(SysMenuDO updateDO,  Collection<Integer> ordernumList);

         public Integer deleteByInOrdernum( Collection<Integer> ordernumList);
        public List<SysMenuDO> listByIcon(String icon, String... fieldNames);

        public Map<Long,SysMenuDO> mapByIcon(String icon, String... fieldNames);

        public Integer countByIcon(String icon);

        public default SysMenuDO singleResultByIcon(String icon,String... fieldNames){
             List<SysMenuDO> list=this.listByIcon(icon,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByIcon(String icon, Function<SysMenuDO, T> mapper, String... fieldNames){
             List<SysMenuDO> list=this.listByIcon(icon,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByIcon(SysMenuDO updateDO, String icon);

        public Integer updateAllFieldsByIcon(SysMenuDO updateDO,  String icon);

        public Integer deleteByIcon( String icon);






        public List<SysMenuDO> listByInIcon(Collection<String> iconList, String... fieldNames);

         public Map<Long,SysMenuDO> mapByInIcon(Collection<String> iconList, String... fieldNames);

         public Integer countByInIcon(Collection<String> iconList);

         public default SysMenuDO singleResultByInIcon(Collection<String> iconList,String... fieldNames){
              List<SysMenuDO> list=this.listByInIcon(iconList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysMenuDO>> groupingByInIcon(Collection<String> iconList, Function<SysMenuDO, T> mapper, String... fieldNames){
              List<SysMenuDO> list=this.listByInIcon(iconList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInIcon(SysMenuDO updateDO, Collection<String> iconList);

         public Integer updateAllFieldsByInIcon(SysMenuDO updateDO,  Collection<String> iconList);

         public Integer deleteByInIcon( Collection<String> iconList);
        public List<SysMenuDO> listByPerms(String perms, String... fieldNames);

        public Map<Long,SysMenuDO> mapByPerms(String perms, String... fieldNames);

        public Integer countByPerms(String perms);

        public default SysMenuDO singleResultByPerms(String perms,String... fieldNames){
             List<SysMenuDO> list=this.listByPerms(perms,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByPerms(String perms, Function<SysMenuDO, T> mapper, String... fieldNames){
             List<SysMenuDO> list=this.listByPerms(perms,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPerms(SysMenuDO updateDO, String perms);

        public Integer updateAllFieldsByPerms(SysMenuDO updateDO,  String perms);

        public Integer deleteByPerms( String perms);






        public List<SysMenuDO> listByInPerms(Collection<String> permsList, String... fieldNames);

         public Map<Long,SysMenuDO> mapByInPerms(Collection<String> permsList, String... fieldNames);

         public Integer countByInPerms(Collection<String> permsList);

         public default SysMenuDO singleResultByInPerms(Collection<String> permsList,String... fieldNames){
              List<SysMenuDO> list=this.listByInPerms(permsList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysMenuDO>> groupingByInPerms(Collection<String> permsList, Function<SysMenuDO, T> mapper, String... fieldNames){
              List<SysMenuDO> list=this.listByInPerms(permsList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPerms(SysMenuDO updateDO, Collection<String> permsList);

         public Integer updateAllFieldsByInPerms(SysMenuDO updateDO,  Collection<String> permsList);

         public Integer deleteByInPerms( Collection<String> permsList);
        public List<SysMenuDO> listByUrl(String url, String... fieldNames);

        public Map<Long,SysMenuDO> mapByUrl(String url, String... fieldNames);

        public Integer countByUrl(String url);

        public default SysMenuDO singleResultByUrl(String url,String... fieldNames){
             List<SysMenuDO> list=this.listByUrl(url,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysMenuDO>> groupingByUrl(String url, Function<SysMenuDO, T> mapper, String... fieldNames){
             List<SysMenuDO> list=this.listByUrl(url,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUrl(SysMenuDO updateDO, String url);

        public Integer updateAllFieldsByUrl(SysMenuDO updateDO,  String url);

        public Integer deleteByUrl( String url);






        public List<SysMenuDO> listByInUrl(Collection<String> urlList, String... fieldNames);

         public Map<Long,SysMenuDO> mapByInUrl(Collection<String> urlList, String... fieldNames);

         public Integer countByInUrl(Collection<String> urlList);

         public default SysMenuDO singleResultByInUrl(Collection<String> urlList,String... fieldNames){
              List<SysMenuDO> list=this.listByInUrl(urlList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysMenuDO>> groupingByInUrl(Collection<String> urlList, Function<SysMenuDO, T> mapper, String... fieldNames){
              List<SysMenuDO> list=this.listByInUrl(urlList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUrl(SysMenuDO updateDO, Collection<String> urlList);

         public Integer updateAllFieldsByInUrl(SysMenuDO updateDO,  Collection<String> urlList);

         public Integer deleteByInUrl( Collection<String> urlList);


}

