package com.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {

	@GetMapping("/about")
	public String about(Model model) {
		System.out.println("Inside About Handler in Controller....");
		
		model.addAttribute("name","abhishek parmar");
		model.addAttribute("date",new Date().toLocaleString());
		return "about";
		// about.html
	}
	
	@GetMapping("/example-loop")
	public String iteratorExample(Model model) {
		System.out.println("Inside iteratorExample Handler in Controller....");
		
		List<String> list = List.of("Abhishek","Satish","Rajiv","Suneel");
				
		model.addAttribute("names",list);

		return "iterator";
		// iterator.html
	}
	
	@GetMapping("/condition")
	public String conditionExample(Model model) {
		System.out.println("Inside condition Handler in Controller....");
		
		model.addAttribute("isActive",false);
		
		model.addAttribute("gender","F");
		
		List<Integer> myList = List.of(1,3,5,10);
				
		model.addAttribute("myList",myList);

		return "condition";
		// condition.html
	}
	
	@GetMapping("/service")
	public String service(Model model) {
		System.out.println("Inside service Handler in Controller....");

		model.addAttribute("title", "This is my title");
		model.addAttribute("subtitle", "This is my subtitle");
		
		return "service";
		// service.html
	}
	
	@GetMapping("/about-us")
	public String newAbout() {
		return "about-us";
		// about-us.html
	}
	
	@GetMapping("/privacy-policy")
	public String privacy() {
		return "privacy-policy";
		// privacy-policy.html
	}
	
}
