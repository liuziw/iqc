package com.iqc.system.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.iqc.common.core.util.CommonUtils;
import com.iqc.common.core.util.EncryptUtils;
import com.iqc.system.bo.IqcUserdetails;
import com.iqc.system.bo.UserBO;
import com.iqc.system.dbo.SysUserDO;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author liuziw
 * @date 2019/8/13 17:52
 */
@Service
public class UserDetailsImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        if(username == null){
            throw new UsernameNotFoundException(username);
//        }
        /*SysUserDO userDO = new SysUserDO();
        userDO = this.uapUserService.getUserDOByLoginAccountInfo(username);

        if (userDO==null){
            throw new UsernameNotFoundException(username);
        }

        UserBO userBO = this.uapUserService.getUserDetailByUserId(userDO.getId());

        //设置密码
        String password;
        password = userDO.getUserPassword();

        UserDetails userDetails =User.withUsername(userDO.getUserAccount())
                .password(password)
                //组成list
                .roles(rolesList.toArray(new String[rolesList.size()]))
                .authorities(permDOList.toArray(new String[permDOList.size()]))
                .accountLocked(LockedEnum.LOCKED==LockedEnum.valueOfByCode(userDO.getLocked()))
                .accountExpired(ExpiredEnum.EXPIRED_YES==ExpiredEnum.valueOfByCode(userDO.getExpired()))
                .build();*/

        /*UserDetails userDetails =User.withUsername("admin")
                .password("admin")
                //组成list
                .roles("aa")
                .authorities("aa")
                .accountLocked(false)
                .accountExpired(false)
                .build();

        UserBO userBO = new UserBO();*/

//       return new IqcUserdetails(userDetails,userBO);
    }
}
