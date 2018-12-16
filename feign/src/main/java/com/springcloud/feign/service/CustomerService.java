package com.springcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-12-16-21:08
 */
@FeignClient("customer-service")
public interface CustomerService {

    @GetMapping(value = "/add")
    Integer add(@RequestParam Integer a,@RequestParam Integer b);

}
