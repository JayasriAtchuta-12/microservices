package com.example.CommentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class CommentServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentServiceDemoApplication.class, args);
	}
}
