package com.springcloud.feign.controller;

import com.springcloud.feign.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-12-16-21:10
 */
@RestController
public class FeignController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/add")
    public Integer add(){
        return customerService.add(10,20);
    }

}
