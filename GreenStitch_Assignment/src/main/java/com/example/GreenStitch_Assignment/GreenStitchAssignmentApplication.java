package com.example.GreenStitch_Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class GreenStitchAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenStitchAssignmentApplication.class, args);
	}

}
