package com.mbr.external.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mbr.entities.Claim;

@FeignClient(name="CLAIM-SERVICE")
public interface ClaimService {

	@GetMapping("/claim/{mbr_id}")
	Claim getClaimExternal(@PathVariable("mbr_id") int mbr_id);
	
	@PostMapping("/claim")
	Claim addClaimExternal(Claim claim);
	
}
