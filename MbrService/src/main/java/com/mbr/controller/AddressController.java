package com.mbr.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
	 
	@GetMapping
	public ResponseEntity<List<String>> getAddress(){
		
		List<String> list = List.of("Pune","Bhopal");
		return ResponseEntity.ok(list);
		
	}
	
	
}
