package com.example.democonfigtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAutoConfiguration
@SpringBootApplication
public class DemoConfigTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoConfigTestApplication.class, args);
	}
}
