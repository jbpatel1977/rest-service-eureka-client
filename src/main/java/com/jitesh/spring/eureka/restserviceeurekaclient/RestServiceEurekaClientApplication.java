package com.jitesh.spring.eureka.restserviceeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestServiceEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceEurekaClientApplication.class, args);
	}

}
