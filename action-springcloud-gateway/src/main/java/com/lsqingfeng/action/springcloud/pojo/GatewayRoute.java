package com.lsqingfeng.action.springcloud.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @className: GatewayRoute
 * @description: 从数据库中查询出来的实体
 * @author: sh.Liu
 * @create: 2020-04-09 22:33
 */
@Data
public class GatewayRoute {
    private Long id;

    private String serviceId;

    private String uri;

    private String predicates;

    private String filters;

    private String order;

    private String creatorId;

    private Date createDate;

    private String updateId;

    private Date updateDate;

    private String remarks;

    private String delFlag;
}
