package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class JunitDemoApplication {

	 
	public static void main(String[] args) {
		SpringApplication.run(JunitDemoApplication.class, args);
	}

}
