package com.iqc.system.bo;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author liuziw
 * @date 2019/8/13 17:37
 */
@Data
public class IqcUserdetails  implements UserDetails, Serializable {
    private  static final long serialVersionUID = 1L;

    private final UserDetails userDetails;


    private final UserBO userBO;


    public IqcUserdetails (UserDetails userDetails, UserBO userBO){
        this.userDetails=userDetails;
        this.userBO = userBO;
    }

    @Override
    public boolean isAccountNonExpired() {
        return userDetails.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return userDetails.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return userDetails.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return userDetails.isEnabled();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.userDetails.getAuthorities();
    }

    @Override
    public String getPassword() {
        return this.userDetails.getPassword();
    }

    @Override
    public String getUsername() {
        return this.userDetails.getUsername();
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public UserBO getuserBO() {
        return userBO;
    }

}
