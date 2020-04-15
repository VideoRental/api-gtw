package com.apigtw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class ApiGtwApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGtwApplication.class, args);
	}

}
