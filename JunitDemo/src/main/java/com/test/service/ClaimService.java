package com.test.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.controller.ClaimController;
import com.test.entities.Claim;
import com.test.repo.ClaimRepo;

@Service
public class ClaimService {

	
	Logger logger = LoggerFactory.getLogger(ClaimController.class);
	
	@Autowired
	private ClaimRepo claimRepo;
	
	public List<Claim> getAllClaims() {
		try {
			int a = 1/0;
			return claimRepo.findAll();
		}
		catch(Exception exception ) {
			logger.error("Value not found ");
		}
		Claim claim = new Claim();
		return List.of(claim);
	}
	
}
