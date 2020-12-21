package com.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RibbonEurekaSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonEurekaSeverApplication.class, args);
	}

}
