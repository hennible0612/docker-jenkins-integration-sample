package com.javatechie.jenkinsintegrationsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsIntegrationSampleApplication {

	public static void main(String[] args) {
		System.out.println("Hello Jenkins");
		SpringApplication.run(JenkinsIntegrationSampleApplication.class, args);
	}

}
