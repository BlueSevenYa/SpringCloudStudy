package com.uhope.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author seven
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringBootEurekaServerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServerTestApplication.class, args);
	}
}
