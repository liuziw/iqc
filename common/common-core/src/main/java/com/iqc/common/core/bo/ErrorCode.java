package com.iqc.common.core.bo;

/**
 * @author liuziw
 * @date 2019/8/9 17:42
 */
public class ErrorCode {
    /**
     * 用户不存在
     */
    public static final int USER_NOT_FOUND = 10001;

    /**
     * 密码不正确
     */
    public static final int PASSWORD_NOT_RIGHT = 10002;

    /**
     * 找不到token信息
     */
    public static final int TOKEN_NOT_FOUND = 10003;

    /**
     * web端session失效码
     */
    public static final int SESSION_TIME_OUT = 403403;

}
