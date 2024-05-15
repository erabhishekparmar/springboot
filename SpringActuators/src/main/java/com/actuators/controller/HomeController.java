package com.actuators.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/get-data")
	public Map<String, String> getDetails() {
		return Map.of("Name","Abhishek");
	}
	
}
