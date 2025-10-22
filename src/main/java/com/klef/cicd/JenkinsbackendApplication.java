package com.klef.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsbackendApplication.class, args);
		System.out.println("Project is running...");
	}

}
