package com.example.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWordDemoApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(HelloWordDemoApplication.class);
		SpringApplication.run(HelloWordDemoApplication.class, args);
		logger.error("Sprint container created");
		
	}

}
