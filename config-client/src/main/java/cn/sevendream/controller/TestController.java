package cn.sevendream.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @AUTHOR zhangxue9
 * @DATE 2021/2/23 13:55
 */
@RestController
@RefreshScope
public class TestController {
    @Value("${eureka.instance.hostname}")
    private String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
