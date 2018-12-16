package com.shiqi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaClient
@SpringBootApplication
@RestController
public class SpringcloudstudyeurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudstudyeurekaclientApplication.class, args);
	}


	@Value("${server.port}")
	String port;

	@GetMapping(value = "/index")
	public String indexTest(){
		return "hello spring cloud "+port;
	}
}
