package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.Claim;
import com.test.repo.ClaimRepo;

@Service
public class ClaimService {

	@Autowired
	private ClaimRepo claimRepo;
	
	public List<Claim> getAllClaims() {
		return claimRepo.findAll();
	}
	
}
