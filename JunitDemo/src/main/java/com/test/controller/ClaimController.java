package com.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.Claim;
import com.test.service.ClaimService;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class ClaimController {
	
	Logger logger = LoggerFactory.getLogger(ClaimController.class);
	
	@Autowired
	private ClaimService claimService;

	@GetMapping("/claims")
	public List<Claim> getAllClaims() {
	
		logger.info("I am calling API");
		return claimService.getAllClaims();
		

	}
	
	
}
