package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication

public class HrServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrServiceMsApplication.class, args);
	}

}

