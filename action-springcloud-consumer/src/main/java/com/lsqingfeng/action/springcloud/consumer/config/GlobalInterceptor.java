package com.lsqingfeng.action.springcloud.consumer.config;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class GlobalInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //如果请求头中的header不是from=gateway, 代表不是从网关发过来的，直接拒绝
        String secretKey = request.getHeader("from");
        if(StringUtils.isBlank(secretKey) || !secretKey.equals("gateway")){
            response.setContentType("application/json; charset=utf-8");
            PrintWriter writer = response.getWriter();
            writer.write("error");
            return false;
        }
        return true;
    }

}
