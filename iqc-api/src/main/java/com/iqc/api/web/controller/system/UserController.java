package com.iqc.api.web.controller.system;

import com.iqc.api.annotation.SysLog;
import com.iqc.common.core.web.controller.BaseController;
import com.iqc.system.dto.TestDTO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuziw
 * @date 2019/8/9 18:21
 */
@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserController extends BaseController {

    @SysLog("测试接口")
    @ApiOperation("测试接口")
    @RequestMapping(value = "test", method = RequestMethod.POST )
    public void test(@RequestBody TestDTO dto){
        log.info("测试日志：{}",dto.getId());
    }

}
