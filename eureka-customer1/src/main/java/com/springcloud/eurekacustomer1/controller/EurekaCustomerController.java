package com.springcloud.eurekacustomer1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-12-16-20:26
 */
@RestController
public class EurekaCustomerController {

    private static final Logger LOG = LoggerFactory.getLogger(EurekaCustomerController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/add")
    public Integer add(@RequestParam Integer a,@RequestParam Integer b){
        LOG.info("a=" + a + ",b=" + b);
        List<ServiceInstance> list = discoveryClient.getInstances("customer-service");
        list.forEach(serviceInstance -> LOG.info("host:" + serviceInstance.getHost()
        + ", instanceId" + serviceInstance.getInstanceId()
        + ", serviceId" + serviceInstance.getServiceId()));
        Integer r = a + b;

        return r;
    }

}
