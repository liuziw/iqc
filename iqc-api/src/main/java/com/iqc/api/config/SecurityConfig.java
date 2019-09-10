package com.iqc.api.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iqc.api.vo.LoginVO;
import com.iqc.common.core.exception.CommonException;
import com.iqc.common.core.util.CommonUtils;
import com.iqc.common.core.vo.ResponseVO;
import com.iqc.system.bo.IqcUserdetails;
import com.iqc.system.service.SysLogService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.*;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenBasedRememberMeServices;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.io.IOException;

import static org.springframework.security.config.Elements.REMEMBER_ME;

/**
 * @author liuziw
 * @date 2019/8/13 17:28
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private static final String OAUTH2_CAPTCHA_KEY="OAUTH2_CAPTCHA_KEY";
    private static final ObjectMapper objectMapper=new ObjectMapper();
    private static final Integer VCODE_NOT_FOUND_ERROR_CODE=40001;
    private static final Integer VCODE_ERR_ERROR_CODE=40002;
    private static final Integer USER_NOT_FOUND_ERROR_CODE=40003;
    private static final Integer PASSWORD_ERROR_CODE=40004;
    private static final Integer ACCOUNT_LOCKED=40005;
    private static final Integer ACCOUNT_EXPIRED=40006;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private SysLogService optrLogService;
    @Autowired
    private DataSource dataSource;
    @Autowired
    private SessionRegistry sessionRegistry;
    @Autowired
    private CustomSessionInformationExpiredStrategy customSessionInformationExpiredStrategy;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

        //验证码过滤器
        /*http.addFilterBefore(new Filter() {
            @Override
            public void init(FilterConfig filterConfig) throws ServletException {
                filterConfig.getFilterName();
            }
            @Override
            public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                HttpServletRequest httpServletRequest = (HttpServletRequest) request;
                String requestURI = httpServletRequest.getRequestURI();
                String method=httpServletRequest.getMethod();
                if(!(StringUtils.equals("/login",requestURI)&&StringUtils.equalsIgnoreCase(method,"post")))
                {
                    chain.doFilter(request,response);
                    return;
                }
                //设置admin用户和包含test的用户不需进行验证码验证
                String username = httpServletRequest.getParameter("username");
                if(username != null && (username.toUpperCase().contains("TEST") || StringUtils.equals(username,"admin") || username.toUpperCase().contains("TOKEN:"))){
                    chain.doFilter(request,response);
                    return;
                }

                String vcode=httpServletRequest.getParameter("vcode");
                HttpSession session = httpServletRequest.getSession();
                //获取验证码
                String sessionCaptcha = (String) session.getAttribute(OAUTH2_CAPTCHA_KEY);

                //session中的验证码不存在
                if (StringUtils.isBlank(sessionCaptcha)) {
                    response.setContentType("application/json;charset=UTF-8");
                    ResponseVO<String> rv=new ResponseVO<>();
                    rv.setCode(VCODE_NOT_FOUND_ERROR_CODE);
                    rv.setMsg("验证码异常");
                    response.getWriter().print(objectMapper.writeValueAsString(rv));
                    return;

                }
                //清除session中验证码
                session.removeAttribute(OAUTH2_CAPTCHA_KEY);

                //验证码错误
                if(!StringUtils.equalsAnyIgnoreCase(sessionCaptcha,vcode)){
                    response.setContentType("application/json;charset=UTF-8");
                    ResponseVO<String> rv=new ResponseVO<>();
                    rv.setCode(VCODE_ERR_ERROR_CODE);
                    rv.setMsg("验证码错误");
                    response.getWriter().print(objectMapper.writeValueAsString(rv));
                    return;
                }
                chain.doFilter(request,response);
            }
            @Override
            public void destroy() {

            }
        }, UsernamePasswordAuthenticationFilter.class);*/
        http.objectPostProcessor(new ObjectPostProcessor<Object>(){
            @Override
            public Object postProcess(Object obj) {
                if(obj instanceof LoginUrlAuthenticationEntryPoint){
                    LoginUrlAuthenticationEntryPoint loginUrlAuthenticationEntryPoint=(LoginUrlAuthenticationEntryPoint)obj;
                    loginUrlAuthenticationEntryPoint.setUseForward(true);
                }
                return obj;
            }
        });
        http.formLogin().loginPage("/to_login.html").loginProcessingUrl("/login")
                .successHandler(new AuthenticationSuccessHandler() {

                    //登录成功之发送json
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {

                        IqcUserdetails iqcUserdetails = (IqcUserdetails)authentication.getPrincipal();
                        //插入登录日志
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("[");
                        stringBuilder.append(iqcUserdetails.getUsername());
                        stringBuilder.append("]");
                        stringBuilder.append("登录了系统");
                        optrLogService.insertOptrLog(1L,"登录模块","登录系统"
                                ,stringBuilder.toString(),"");
                        LoginVO loginVO=new LoginVO();
                        loginVO.setUserInfo(iqcUserdetails.getuserBO());
                        httpServletResponse.setContentType("application/json;charset=UTF-8");
                        //后面返回的
                        String redirectUri=httpServletRequest.getParameter("redirect_uri");
                        if(StringUtils.isBlank(redirectUri)){
                            loginVO.setRedirectUri(null);
                        }
                        else{
                            loginVO.setRedirectUri(redirectUri);
                        }
                        httpServletResponse.getWriter().print(objectMapper.writeValueAsString(CommonUtils.okResponseVO(loginVO)));
                    }
                })
                .failureHandler(new AuthenticationFailureHandler() {

                    //验证失败
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
                        ResponseVO<String> rv=new ResponseVO<>();
                        if(e instanceof UsernameNotFoundException){
                            rv.setCode(USER_NOT_FOUND_ERROR_CODE);
//                           rv.setMsg("用户不存在");
                            rv.setMsg("用户名或密码错误");
                        }else if (e instanceof BadCredentialsException){
                            rv.setCode(PASSWORD_ERROR_CODE);
//                           rv.setMsg("密码错误");
                            rv.setMsg("用户名或密码错误");
                        }
                        else if (e instanceof InternalAuthenticationServiceException){
                            rv.setCode(USER_NOT_FOUND_ERROR_CODE);
//                           rv.setMsg(e.getMessage());
                            rv.setMsg("用户名或密码错误");
                        } else if (e instanceof LockedException) {
                            rv.setCode(ACCOUNT_LOCKED);
                            rv.setMsg(e.getMessage());
                        } else if (e instanceof AccountExpiredException) {
                            rv.setCode(ACCOUNT_EXPIRED);
                            rv.setMsg(e.getMessage());
                        } else {
                            rv.setCode(CommonException.DEFAULT_CODE);
                            rv.setMsg(e.getMessage());
                        }
                        httpServletResponse.setContentType("application/json;charset=UTF-8");
                        httpServletResponse.getWriter().print(objectMapper.writeValueAsString(rv));
                    }
                })
                .and()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/#/login?logout").addLogoutHandler(new LogoutHandler() {
            @Override
            public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
                if(authentication != null && authentication.getPrincipal() != null){
                    IqcUserdetails iqcUserdetails = (IqcUserdetails)authentication.getPrincipal();
                    if(iqcUserdetails != null && iqcUserdetails.getuserBO() != null){
                        //插入登录日志
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("[");
                        stringBuilder.append(iqcUserdetails.getUsername());
                        stringBuilder.append("]");
                        stringBuilder.append("登出了系统");
                        optrLogService.insertOptrLog(iqcUserdetails.getuserBO().getId(),1L,"登录模块","登出系统",
                                stringBuilder.toString(),"");
                    }
                }
            }
        }).and()
                .userDetailsService(this.userDetailsService)
                .authorizeRequests().antMatchers("/oauth/**").permitAll().and()
                .rememberMe()
                //记住14天
                .tokenValiditySeconds(1209600)
                //指定记住登录信息所使用的数据源
                .rememberMeServices(rememberMeServices())
                .key("INTERNAL_SECRET_KEY")
                .and();
        //限制登录人数
        http.sessionManagement().maximumSessions(10).sessionRegistry(sessionRegistry)
                .expiredSessionStrategy(customSessionInformationExpiredStrategy)
                .expiredUrl("/login");

    }

    @Bean
    public RememberMeServices rememberMeServices() {
        JdbcTokenRepositoryImpl rememberMeTokenRepository = new JdbcTokenRepositoryImpl();
        rememberMeTokenRepository.setDataSource(dataSource);

        // 这里也注入了 UserDetailsSerice 实例
        PersistentTokenBasedRememberMeServices rememberMeServices =
                new PersistentTokenBasedRememberMeServices("INTERNAL_SECRET_KEY", userDetailsService, rememberMeTokenRepository);

        rememberMeServices.setParameter(REMEMBER_ME);
        return rememberMeServices;
    }

    @Bean
    public SessionRegistry sessionRegistry(){
        return new SessionRegistryImpl();
    }
}
