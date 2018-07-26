package com.uhope.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class SpringBootEurekaConfigClientTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaConfigClientTestApplication.class, args);
	}


/*	@Value("${hello}")
	private String hello;

	@GetMapping(value = "/getHello")
	public String getHello(){
		return "Hello:"+hello;
	}*/


	@Value("${server.port}")
	private String port;

	@GetMapping(value = "/getPort")
	public String getPort(){
		return "Hello"+port;
	}
}
