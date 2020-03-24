package com.lsqingfeng.action.springcloud.provider.impl;

import com.lsqingfeng.action.springcloud.provider.dto.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProviderController {

    @PostMapping("/user/save")
    public String saveUser(User user) {
        log.info("已成功调用到实现类，获取到的参数为{}",user);
        log.info("可进行后续操作，如新增，修改。。。。");
        throw new RuntimeException("服务器异常");
//        return "success";
    }
}
