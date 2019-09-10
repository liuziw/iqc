package com.iqc.system.manager.impl;

import com.iqc.common.core.util.EncryptUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author liuziw
 * @date 2019/8/13 18:17
 */
@Component
public class PasswordManagerImpl implements  PasswordManager, PasswordEncoder {
    /**
     * 密码加密
     * @param password
     * @return 加密后密码
     */
    @Override
    public String encrypt(String password) {
        return EncryptUtils.encryptBySha256(password);
    }


    /**
     *  PasswordEncoder 密码加密
     * @param rawPassword
     * @return 加密后密码
     */
    @Override
    public String encode(CharSequence rawPassword) {
        return this.encrypt(rawPassword.toString());
    }

    /**
     * 密码校验
     * @param rawPassword
     * @param encodedPassword
     * @return
     */
    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return StringUtils.equals(this.encode(rawPassword),encodedPassword);
    }
}
