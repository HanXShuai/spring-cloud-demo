package com.hans.cloud.order.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: hans
 * @Date: 2021/3/17 22:44
 */
public interface LoadBalance {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
