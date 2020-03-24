package com.lsqingfeng.action.springcloud.consumer.controller;

import com.lsqingfeng.action.springcloud.provider.api.UserService;
import com.lsqingfeng.action.springcloud.provider.dto.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
@Slf4j
public class ConsumerController {

    @Autowired
    private UserService userService;

    /**
     * 集成hystrix: 调用失败，会执行fallback方法：
     * 要注意fallback指定的方法名中的方法参数必须和本方法参数一致。
     * @return
     */
    @GetMapping("/test")
    @HystrixCommand(fallbackMethod = "getDefaultValue")
    public String test(){
        User user = new User();
        user.setAge("13");
        user.setName("zhangsan");
        return userService.saveUser(user);
    }

    private String getDefaultValue() {
        return "call failed ,please wait for a moment";
    }


}
