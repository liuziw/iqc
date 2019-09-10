package com.iqc.system.mapper;
import com.iqc.system.dbo.SysLogDO;
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
public interface SysLogMapper extends CommonMapper<SysLogDO,Long>{


        public SysLogDO getById(@Param("id") Long  id,@Param("fieldNames") String ... fieldNames);



        public List<SysLogDO> listById(@Param("id") Long id,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysLogDO> mapById(@Param("id") Long id,@Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default SysLogDO singleResultById(Long id,String[] fieldNames){
             List<SysLogDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingById(Long id, Function<SysLogDO, T> mapper, String[] fieldNames){
             List<SysLogDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") SysLogDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") SysLogDO updateDO, @Param("id") Long id);

        public Integer deleteById( @Param("id") Long id);




        public List<SysLogDO> listByInId(@Param("idList") Collection<Long> idList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysLogDO> mapByInId(@Param("idList") Collection<Long> idList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default SysLogDO singleResultByInId(Collection<Long> idList,String[] fieldNames){
             List<SysLogDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByInId(Collection<Long> idList, Function<SysLogDO, T> mapper, String[] fieldNames){
             List<SysLogDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") SysLogDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") SysLogDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId( @Param("idList") Collection<Long> idList);

        public List<SysLogDO> listByUsername(@Param("username") String username,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysLogDO> mapByUsername(@Param("username") String username,@Param("fieldNames") String[] fieldNames);

        public Integer countByUsername(@Param("username") String username);

        public default SysLogDO singleResultByUsername(String username,String[] fieldNames){
             List<SysLogDO> list=this.listByUsername(username,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByUsername(String username, Function<SysLogDO, T> mapper, String[] fieldNames){
             List<SysLogDO> list=this.listByUsername(username,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUsername(@Param("updateDO") SysLogDO updateDO, @Param("username") String username);

        public Integer updateAllFieldsByUsername(@Param("updateDO") SysLogDO updateDO, @Param("username") String username);

        public Integer deleteByUsername( @Param("username") String username);




        public List<SysLogDO> listByInUsername(@Param("usernameList") Collection<String> usernameList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysLogDO> mapByInUsername(@Param("usernameList") Collection<String> usernameList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInUsername(@Param("usernameList") Collection<String> usernameList);

        public default SysLogDO singleResultByInUsername(Collection<String> usernameList,String[] fieldNames){
             List<SysLogDO> list=this.listByInUsername(usernameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByInUsername(Collection<String> usernameList, Function<SysLogDO, T> mapper, String[] fieldNames){
             List<SysLogDO> list=this.listByInUsername(usernameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUsername(@Param("updateDO") SysLogDO updateDO, @Param("usernameList") Collection<String> usernameList);

        public Integer updateAllFieldsByInUsername(@Param("updateDO") SysLogDO updateDO, @Param("usernameList") Collection<String> usernameList);

        public Integer deleteByInUsername( @Param("usernameList") Collection<String> usernameList);

        public List<SysLogDO> listByOperation(@Param("operation") String operation,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysLogDO> mapByOperation(@Param("operation") String operation,@Param("fieldNames") String[] fieldNames);

        public Integer countByOperation(@Param("operation") String operation);

        public default SysLogDO singleResultByOperation(String operation,String[] fieldNames){
             List<SysLogDO> list=this.listByOperation(operation,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByOperation(String operation, Function<SysLogDO, T> mapper, String[] fieldNames){
             List<SysLogDO> list=this.listByOperation(operation,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByOperation(@Param("updateDO") SysLogDO updateDO, @Param("operation") String operation);

        public Integer updateAllFieldsByOperation(@Param("updateDO") SysLogDO updateDO, @Param("operation") String operation);

        public Integer deleteByOperation( @Param("operation") String operation);




        public List<SysLogDO> listByInOperation(@Param("operationList") Collection<String> operationList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysLogDO> mapByInOperation(@Param("operationList") Collection<String> operationList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInOperation(@Param("operationList") Collection<String> operationList);

        public default SysLogDO singleResultByInOperation(Collection<String> operationList,String[] fieldNames){
             List<SysLogDO> list=this.listByInOperation(operationList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByInOperation(Collection<String> operationList, Function<SysLogDO, T> mapper, String[] fieldNames){
             List<SysLogDO> list=this.listByInOperation(operationList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInOperation(@Param("updateDO") SysLogDO updateDO, @Param("operationList") Collection<String> operationList);

        public Integer updateAllFieldsByInOperation(@Param("updateDO") SysLogDO updateDO, @Param("operationList") Collection<String> operationList);

        public Integer deleteByInOperation( @Param("operationList") Collection<String> operationList);

        public List<SysLogDO> listByMethod(@Param("method") String method,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysLogDO> mapByMethod(@Param("method") String method,@Param("fieldNames") String[] fieldNames);

        public Integer countByMethod(@Param("method") String method);

        public default SysLogDO singleResultByMethod(String method,String[] fieldNames){
             List<SysLogDO> list=this.listByMethod(method,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByMethod(String method, Function<SysLogDO, T> mapper, String[] fieldNames){
             List<SysLogDO> list=this.listByMethod(method,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByMethod(@Param("updateDO") SysLogDO updateDO, @Param("method") String method);

        public Integer updateAllFieldsByMethod(@Param("updateDO") SysLogDO updateDO, @Param("method") String method);

        public Integer deleteByMethod( @Param("method") String method);




        public List<SysLogDO> listByInMethod(@Param("methodList") Collection<String> methodList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysLogDO> mapByInMethod(@Param("methodList") Collection<String> methodList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInMethod(@Param("methodList") Collection<String> methodList);

        public default SysLogDO singleResultByInMethod(Collection<String> methodList,String[] fieldNames){
             List<SysLogDO> list=this.listByInMethod(methodList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByInMethod(Collection<String> methodList, Function<SysLogDO, T> mapper, String[] fieldNames){
             List<SysLogDO> list=this.listByInMethod(methodList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInMethod(@Param("updateDO") SysLogDO updateDO, @Param("methodList") Collection<String> methodList);

        public Integer updateAllFieldsByInMethod(@Param("updateDO") SysLogDO updateDO, @Param("methodList") Collection<String> methodList);

        public Integer deleteByInMethod( @Param("methodList") Collection<String> methodList);

        public List<SysLogDO> listByParams(@Param("params") String params,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysLogDO> mapByParams(@Param("params") String params,@Param("fieldNames") String[] fieldNames);

        public Integer countByParams(@Param("params") String params);

        public default SysLogDO singleResultByParams(String params,String[] fieldNames){
             List<SysLogDO> list=this.listByParams(params,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByParams(String params, Function<SysLogDO, T> mapper, String[] fieldNames){
             List<SysLogDO> list=this.listByParams(params,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByParams(@Param("updateDO") SysLogDO updateDO, @Param("params") String params);

        public Integer updateAllFieldsByParams(@Param("updateDO") SysLogDO updateDO, @Param("params") String params);

        public Integer deleteByParams( @Param("params") String params);




        public List<SysLogDO> listByInParams(@Param("paramsList") Collection<String> paramsList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysLogDO> mapByInParams(@Param("paramsList") Collection<String> paramsList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInParams(@Param("paramsList") Collection<String> paramsList);

        public default SysLogDO singleResultByInParams(Collection<String> paramsList,String[] fieldNames){
             List<SysLogDO> list=this.listByInParams(paramsList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByInParams(Collection<String> paramsList, Function<SysLogDO, T> mapper, String[] fieldNames){
             List<SysLogDO> list=this.listByInParams(paramsList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInParams(@Param("updateDO") SysLogDO updateDO, @Param("paramsList") Collection<String> paramsList);

        public Integer updateAllFieldsByInParams(@Param("updateDO") SysLogDO updateDO, @Param("paramsList") Collection<String> paramsList);

        public Integer deleteByInParams( @Param("paramsList") Collection<String> paramsList);

        public List<SysLogDO> listByTime(@Param("time") Long time,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysLogDO> mapByTime(@Param("time") Long time,@Param("fieldNames") String[] fieldNames);

        public Integer countByTime(@Param("time") Long time);

        public default SysLogDO singleResultByTime(Long time,String[] fieldNames){
             List<SysLogDO> list=this.listByTime(time,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByTime(Long time, Function<SysLogDO, T> mapper, String[] fieldNames){
             List<SysLogDO> list=this.listByTime(time,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTime(@Param("updateDO") SysLogDO updateDO, @Param("time") Long time);

        public Integer updateAllFieldsByTime(@Param("updateDO") SysLogDO updateDO, @Param("time") Long time);

        public Integer deleteByTime( @Param("time") Long time);




        public List<SysLogDO> listByInTime(@Param("timeList") Collection<Long> timeList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysLogDO> mapByInTime(@Param("timeList") Collection<Long> timeList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInTime(@Param("timeList") Collection<Long> timeList);

        public default SysLogDO singleResultByInTime(Collection<Long> timeList,String[] fieldNames){
             List<SysLogDO> list=this.listByInTime(timeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByInTime(Collection<Long> timeList, Function<SysLogDO, T> mapper, String[] fieldNames){
             List<SysLogDO> list=this.listByInTime(timeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInTime(@Param("updateDO") SysLogDO updateDO, @Param("timeList") Collection<Long> timeList);

        public Integer updateAllFieldsByInTime(@Param("updateDO") SysLogDO updateDO, @Param("timeList") Collection<Long> timeList);

        public Integer deleteByInTime( @Param("timeList") Collection<Long> timeList);

        public List<SysLogDO> listByIp(@Param("ip") String ip,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysLogDO> mapByIp(@Param("ip") String ip,@Param("fieldNames") String[] fieldNames);

        public Integer countByIp(@Param("ip") String ip);

        public default SysLogDO singleResultByIp(String ip,String[] fieldNames){
             List<SysLogDO> list=this.listByIp(ip,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByIp(String ip, Function<SysLogDO, T> mapper, String[] fieldNames){
             List<SysLogDO> list=this.listByIp(ip,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByIp(@Param("updateDO") SysLogDO updateDO, @Param("ip") String ip);

        public Integer updateAllFieldsByIp(@Param("updateDO") SysLogDO updateDO, @Param("ip") String ip);

        public Integer deleteByIp( @Param("ip") String ip);




        public List<SysLogDO> listByInIp(@Param("ipList") Collection<String> ipList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysLogDO> mapByInIp(@Param("ipList") Collection<String> ipList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInIp(@Param("ipList") Collection<String> ipList);

        public default SysLogDO singleResultByInIp(Collection<String> ipList,String[] fieldNames){
             List<SysLogDO> list=this.listByInIp(ipList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysLogDO>> groupingByInIp(Collection<String> ipList, Function<SysLogDO, T> mapper, String[] fieldNames){
             List<SysLogDO> list=this.listByInIp(ipList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInIp(@Param("updateDO") SysLogDO updateDO, @Param("ipList") Collection<String> ipList);

        public Integer updateAllFieldsByInIp(@Param("updateDO") SysLogDO updateDO, @Param("ipList") Collection<String> ipList);

        public Integer deleteByInIp( @Param("ipList") Collection<String> ipList);


}
