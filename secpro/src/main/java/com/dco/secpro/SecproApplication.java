package com.dco.secpro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SecproApplication {
	private final static Logger logger = LoggerFactory.getLogger(SecproApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SecproApplication.class, args);
		/*
		 * int i=0; while(true) {
		 * 
		 * 
		 * Runnable r=()->logger.info("new thread is running"); new Thread(r).start();
		 * 
		 * logger.info("infoMsg"+i); logger.warn("warnMsg"+i);
		 * logger.debug("debugMsg"+i);
		 * 
		 * i++; }
		 */
	}

}
