package com.uhope.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableConfigServer
@EnableDiscoveryClient
public class SpringBootEurekaConfigTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaConfigTestApplication.class, args);
	}
}
