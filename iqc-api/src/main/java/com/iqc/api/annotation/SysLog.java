package com.iqc.api.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 * <pre>
 *     在controller的方法上使用此注解即可记录日志
 * </pre>
 * @author liuziw
 * @date 2019/8/12 11:23
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {
    String value() default "";
}
