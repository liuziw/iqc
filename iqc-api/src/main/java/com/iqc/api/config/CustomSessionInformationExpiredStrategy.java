package com.iqc.api.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iqc.common.core.bo.ErrorCode;
import com.iqc.common.core.vo.ResponseVO;
import org.springframework.security.web.session.SessionInformationExpiredEvent;
import org.springframework.security.web.session.SessionInformationExpiredStrategy;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author liuziw
 * @date 2019/8/13 17:49
 */
@Component
public class CustomSessionInformationExpiredStrategy implements SessionInformationExpiredStrategy {
    private ObjectMapper objectMapper=new ObjectMapper();

    @Override
    public void onExpiredSessionDetected(SessionInformationExpiredEvent event) throws IOException, ServletException {
        HttpServletResponse response = event.getResponse();
        response.setContentType("application/json;charset=UTF-8");
        ResponseVO<String> responseVO=new ResponseVO<>();
        responseVO.setCode(ErrorCode.SESSION_TIME_OUT);
        responseVO.setMsg("用户在其他地方登陆或被锁定");
        response.getWriter().print(objectMapper.writeValueAsString(responseVO));
    }
}
