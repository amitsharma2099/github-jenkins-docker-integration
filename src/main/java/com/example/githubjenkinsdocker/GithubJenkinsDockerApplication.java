package com.example.githubjenkinsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Integration test to verify:
 * Code is checked-in to Github which is automatically pulled-in by Jenkins upon each commit and build it.
 * Then docker image is created during Jenkins build, which is pushed to Docker-Hub
 */

@SpringBootApplication
@RestController
public class GithubJenkinsDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubJenkinsDockerApplication.class, args);
	}

	
	@GetMapping
	public String testMethod() {
		return "Integration test of Github-Jenkins-Docker..!"; 
	}
}
