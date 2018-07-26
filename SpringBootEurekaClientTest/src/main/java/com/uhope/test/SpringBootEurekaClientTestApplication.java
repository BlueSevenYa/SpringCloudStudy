package com.uhope.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaClient
@SpringBootApplication
@RestController
public class SpringBootEurekaClientTestApplication {


	/**
	 * 作为client端
	 * @param args
     */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaClientTestApplication.class, args);
	}

	@Value("${server.port}")
	private String port;

	@GetMapping(value = "/index")
	public String index(){
		return "hello springcloud"+port;
	}

}
