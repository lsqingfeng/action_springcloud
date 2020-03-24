package com.lsqingfeng.action.springcloud.provider.api;

import com.lsqingfeng.action.springcloud.provider.dto.User;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "action-springcloud-provider-impl")
public interface UserService {

    @PostMapping("/user/save")
    String saveUser(User user);

}
