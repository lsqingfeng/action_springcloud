package com.lsqingfeng.action.springcloud.provider.impl;

import com.lsqingfeng.action.springcloud.provider.ProviderApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderImplApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderImplApplication.class);
    }
}
