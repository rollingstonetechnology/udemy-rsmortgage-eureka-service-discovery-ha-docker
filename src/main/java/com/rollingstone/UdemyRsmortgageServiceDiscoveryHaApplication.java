package com.rollingstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UdemyRsmortgageServiceDiscoveryHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyRsmortgageServiceDiscoveryHaApplication.class, args);
	}
}
