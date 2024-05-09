package com.practice.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.entities.LoginData;

import jakarta.validation.Valid;


@Controller
public class MyController {

	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute(new LoginData());
		return "form";
		 
	}
	
	
	@PostMapping("/process")
	public String processHandler(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult bindingResult ) {
		System.out.println(loginData);
		
		if(bindingResult.hasErrors())
		{
			 System.out.println(bindingResult);
			 return "form";
		}
		return "success";
		 
	}
	 
	
}
