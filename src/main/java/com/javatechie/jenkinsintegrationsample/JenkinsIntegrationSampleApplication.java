package com.javatechie.jenkinsintegrationsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class JenkinsIntegrationSampleApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "Welcome to main?";
	}
	public static void main(String[] args) {
		System.out.println("Hello Jenkins");
		SpringApplication.run(JenkinsIntegrationSampleApplication.class, args);
	}

}
