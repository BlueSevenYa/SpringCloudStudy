package com.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-12-16-21:00
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/add")
    public Integer add(){
        return restTemplate.getForEntity("http://customer-service/add?a=10&b=20",Integer.class).getBody();
    }

}
