package com.lsqingfeng.action.springcloud.provider.api;

import com.lsqingfeng.action.springcloud.provider.dto.User;
import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements UserService {
    @Override
    public String saveUser(User user) {
        return  "hello" + user +", this message send failed";
    }
}
