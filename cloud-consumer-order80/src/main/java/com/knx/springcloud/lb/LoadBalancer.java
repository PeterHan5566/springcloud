package com.knx.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {
    //获取eureka上的活着的机器总数
    ServiceInstance instances(List<ServiceInstance> serviceInstanceList);

}
