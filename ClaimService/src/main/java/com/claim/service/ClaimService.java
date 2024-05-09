package com.claim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entities.Claim;
import com.claim.repostories.ClaimRepository;

@Service
public class ClaimService {

	@Autowired
	ClaimRepository claimRepository;
	
	// add claim 
	public Claim addClaim(Claim claim) {
		 claimRepository.save(claim);
		 return claim;
	}
	
	// get claim by id
	public Claim getClaimbyID(int id) {
		 return claimRepository.findById(id).get();
	}
	
	// get all claim
	public List<Claim> getAllClaims() {
		return claimRepository.findAll();
	}

	// get claim by mbr id
	public Claim getClaimbyMbrID(int mbr_id) {
		return claimRepository.findByMbrId(mbr_id);
	}
	
	 
}
