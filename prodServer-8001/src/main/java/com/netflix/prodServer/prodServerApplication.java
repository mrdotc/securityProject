package com.netflix.prodServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
public class prodServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(prodServerApplication.class, args);
	}

}
