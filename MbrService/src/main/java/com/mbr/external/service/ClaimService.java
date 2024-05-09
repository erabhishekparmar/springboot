package com.mbr.external.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mbr.entities.Claim;

@FeignClient(name="CLAIM-SERVICE")
public interface ClaimService {

	@GetMapping("/claim/{claim_id}")
	Claim getClaim(@PathVariable("claim_id") int claim_id);
	
}
