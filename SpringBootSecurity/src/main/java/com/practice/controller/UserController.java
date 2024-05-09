package com.practice.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

		@GetMapping("/user")
		public String user() {
			System.out.println("Inside User Handler Controller....");
		
			return "user";
	
		}
	
	
}
