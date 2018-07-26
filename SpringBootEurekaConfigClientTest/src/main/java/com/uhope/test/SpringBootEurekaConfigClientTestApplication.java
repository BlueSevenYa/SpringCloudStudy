package com.uhope.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootEurekaConfigClientTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaConfigClientTestApplication.class, args);
	}


	@Value("${hello}")
	private String hello;

	@GetMapping(value = "/getHello")
	public String getHello(){
		return "Hello:"+hello;
	}
}
