package com.iqc.system.daomanager.immutable;

import com.iqc.system.dbo.SysLogDO;
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
public interface ImmutableSysLogDaoManager extends CommonDaoManager<SysLogDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public SysLogDO getById(Long id);

        public List<SysLogDO> listById(Long id, String... fieldNames);

        public Map<Long,SysLogDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default SysLogDO singleResultById(Long id,String... fieldNames){
             List<SysLogDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingById(Long id, Function<SysLogDO, T> mapper, String... fieldNames){
             List<SysLogDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(SysLogDO updateDO, Long id);

        public Integer updateAllFieldsById(SysLogDO updateDO,  Long id);

        public Integer deleteById( Long id);






        public List<SysLogDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,SysLogDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default SysLogDO singleResultByInId(Collection<Long> idList,String... fieldNames){
              List<SysLogDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysLogDO>> groupingByInId(Collection<Long> idList, Function<SysLogDO, T> mapper, String... fieldNames){
              List<SysLogDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(SysLogDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(SysLogDO updateDO,  Collection<Long> idList);

         public Integer deleteByInId( Collection<Long> idList);
        public List<SysLogDO> listByUsername(String username, String... fieldNames);

        public Map<Long,SysLogDO> mapByUsername(String username, String... fieldNames);

        public Integer countByUsername(String username);

        public default SysLogDO singleResultByUsername(String username,String... fieldNames){
             List<SysLogDO> list=this.listByUsername(username,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByUsername(String username, Function<SysLogDO, T> mapper, String... fieldNames){
             List<SysLogDO> list=this.listByUsername(username,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUsername(SysLogDO updateDO, String username);

        public Integer updateAllFieldsByUsername(SysLogDO updateDO,  String username);

        public Integer deleteByUsername( String username);






        public List<SysLogDO> listByInUsername(Collection<String> usernameList, String... fieldNames);

         public Map<Long,SysLogDO> mapByInUsername(Collection<String> usernameList, String... fieldNames);

         public Integer countByInUsername(Collection<String> usernameList);

         public default SysLogDO singleResultByInUsername(Collection<String> usernameList,String... fieldNames){
              List<SysLogDO> list=this.listByInUsername(usernameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysLogDO>> groupingByInUsername(Collection<String> usernameList, Function<SysLogDO, T> mapper, String... fieldNames){
              List<SysLogDO> list=this.listByInUsername(usernameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUsername(SysLogDO updateDO, Collection<String> usernameList);

         public Integer updateAllFieldsByInUsername(SysLogDO updateDO,  Collection<String> usernameList);

         public Integer deleteByInUsername( Collection<String> usernameList);
        public List<SysLogDO> listByOperation(String operation, String... fieldNames);

        public Map<Long,SysLogDO> mapByOperation(String operation, String... fieldNames);

        public Integer countByOperation(String operation);

        public default SysLogDO singleResultByOperation(String operation,String... fieldNames){
             List<SysLogDO> list=this.listByOperation(operation,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByOperation(String operation, Function<SysLogDO, T> mapper, String... fieldNames){
             List<SysLogDO> list=this.listByOperation(operation,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByOperation(SysLogDO updateDO, String operation);

        public Integer updateAllFieldsByOperation(SysLogDO updateDO,  String operation);

        public Integer deleteByOperation( String operation);






        public List<SysLogDO> listByInOperation(Collection<String> operationList, String... fieldNames);

         public Map<Long,SysLogDO> mapByInOperation(Collection<String> operationList, String... fieldNames);

         public Integer countByInOperation(Collection<String> operationList);

         public default SysLogDO singleResultByInOperation(Collection<String> operationList,String... fieldNames){
              List<SysLogDO> list=this.listByInOperation(operationList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysLogDO>> groupingByInOperation(Collection<String> operationList, Function<SysLogDO, T> mapper, String... fieldNames){
              List<SysLogDO> list=this.listByInOperation(operationList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInOperation(SysLogDO updateDO, Collection<String> operationList);

         public Integer updateAllFieldsByInOperation(SysLogDO updateDO,  Collection<String> operationList);

         public Integer deleteByInOperation( Collection<String> operationList);
        public List<SysLogDO> listByMethod(String method, String... fieldNames);

        public Map<Long,SysLogDO> mapByMethod(String method, String... fieldNames);

        public Integer countByMethod(String method);

        public default SysLogDO singleResultByMethod(String method,String... fieldNames){
             List<SysLogDO> list=this.listByMethod(method,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByMethod(String method, Function<SysLogDO, T> mapper, String... fieldNames){
             List<SysLogDO> list=this.listByMethod(method,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByMethod(SysLogDO updateDO, String method);

        public Integer updateAllFieldsByMethod(SysLogDO updateDO,  String method);

        public Integer deleteByMethod( String method);






        public List<SysLogDO> listByInMethod(Collection<String> methodList, String... fieldNames);

         public Map<Long,SysLogDO> mapByInMethod(Collection<String> methodList, String... fieldNames);

         public Integer countByInMethod(Collection<String> methodList);

         public default SysLogDO singleResultByInMethod(Collection<String> methodList,String... fieldNames){
              List<SysLogDO> list=this.listByInMethod(methodList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysLogDO>> groupingByInMethod(Collection<String> methodList, Function<SysLogDO, T> mapper, String... fieldNames){
              List<SysLogDO> list=this.listByInMethod(methodList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInMethod(SysLogDO updateDO, Collection<String> methodList);

         public Integer updateAllFieldsByInMethod(SysLogDO updateDO,  Collection<String> methodList);

         public Integer deleteByInMethod( Collection<String> methodList);
        public List<SysLogDO> listByParams(String params, String... fieldNames);

        public Map<Long,SysLogDO> mapByParams(String params, String... fieldNames);

        public Integer countByParams(String params);

        public default SysLogDO singleResultByParams(String params,String... fieldNames){
             List<SysLogDO> list=this.listByParams(params,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByParams(String params, Function<SysLogDO, T> mapper, String... fieldNames){
             List<SysLogDO> list=this.listByParams(params,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByParams(SysLogDO updateDO, String params);

        public Integer updateAllFieldsByParams(SysLogDO updateDO,  String params);

        public Integer deleteByParams( String params);






        public List<SysLogDO> listByInParams(Collection<String> paramsList, String... fieldNames);

         public Map<Long,SysLogDO> mapByInParams(Collection<String> paramsList, String... fieldNames);

         public Integer countByInParams(Collection<String> paramsList);

         public default SysLogDO singleResultByInParams(Collection<String> paramsList,String... fieldNames){
              List<SysLogDO> list=this.listByInParams(paramsList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysLogDO>> groupingByInParams(Collection<String> paramsList, Function<SysLogDO, T> mapper, String... fieldNames){
              List<SysLogDO> list=this.listByInParams(paramsList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInParams(SysLogDO updateDO, Collection<String> paramsList);

         public Integer updateAllFieldsByInParams(SysLogDO updateDO,  Collection<String> paramsList);

         public Integer deleteByInParams( Collection<String> paramsList);
        public List<SysLogDO> listByTime(Long time, String... fieldNames);

        public Map<Long,SysLogDO> mapByTime(Long time, String... fieldNames);

        public Integer countByTime(Long time);

        public default SysLogDO singleResultByTime(Long time,String... fieldNames){
             List<SysLogDO> list=this.listByTime(time,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByTime(Long time, Function<SysLogDO, T> mapper, String... fieldNames){
             List<SysLogDO> list=this.listByTime(time,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTime(SysLogDO updateDO, Long time);

        public Integer updateAllFieldsByTime(SysLogDO updateDO,  Long time);

        public Integer deleteByTime( Long time);






        public List<SysLogDO> listByInTime(Collection<Long> timeList, String... fieldNames);

         public Map<Long,SysLogDO> mapByInTime(Collection<Long> timeList, String... fieldNames);

         public Integer countByInTime(Collection<Long> timeList);

         public default SysLogDO singleResultByInTime(Collection<Long> timeList,String... fieldNames){
              List<SysLogDO> list=this.listByInTime(timeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysLogDO>> groupingByInTime(Collection<Long> timeList, Function<SysLogDO, T> mapper, String... fieldNames){
              List<SysLogDO> list=this.listByInTime(timeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInTime(SysLogDO updateDO, Collection<Long> timeList);

         public Integer updateAllFieldsByInTime(SysLogDO updateDO,  Collection<Long> timeList);

         public Integer deleteByInTime( Collection<Long> timeList);
        public List<SysLogDO> listByIp(String ip, String... fieldNames);

        public Map<Long,SysLogDO> mapByIp(String ip, String... fieldNames);

        public Integer countByIp(String ip);

        public default SysLogDO singleResultByIp(String ip,String... fieldNames){
             List<SysLogDO> list=this.listByIp(ip,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByIp(String ip, Function<SysLogDO, T> mapper, String... fieldNames){
             List<SysLogDO> list=this.listByIp(ip,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByIp(SysLogDO updateDO, String ip);

        public Integer updateAllFieldsByIp(SysLogDO updateDO,  String ip);

        public Integer deleteByIp( String ip);






        public List<SysLogDO> listByInIp(Collection<String> ipList, String... fieldNames);

         public Map<Long,SysLogDO> mapByInIp(Collection<String> ipList, String... fieldNames);

         public Integer countByInIp(Collection<String> ipList);

         public default SysLogDO singleResultByInIp(Collection<String> ipList,String... fieldNames){
              List<SysLogDO> list=this.listByInIp(ipList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysLogDO>> groupingByInIp(Collection<String> ipList, Function<SysLogDO, T> mapper, String... fieldNames){
              List<SysLogDO> list=this.listByInIp(ipList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInIp(SysLogDO updateDO, Collection<String> ipList);

         public Integer updateAllFieldsByInIp(SysLogDO updateDO,  Collection<String> ipList);

         public Integer deleteByInIp( Collection<String> ipList);


}

