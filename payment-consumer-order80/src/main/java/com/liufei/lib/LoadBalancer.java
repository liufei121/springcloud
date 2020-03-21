package com.liufei.lib;

import com.netflix.loadbalancer.Server;
import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {

    ServiceInstance instances (List<ServiceInstance> serviceInstances);
}
