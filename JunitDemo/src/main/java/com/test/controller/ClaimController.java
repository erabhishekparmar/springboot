package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.Claim;
import com.test.service.ClaimService;


@RestController
public class ClaimController {
	
	@Autowired
	private ClaimService claimService;

	@GetMapping("/claims")
	public List<Claim> getAllClaims() {
	
		return claimService.getAllClaims();
		

	}
	
	
}
