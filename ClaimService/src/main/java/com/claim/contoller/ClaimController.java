package com.claim.contoller;

import org.springframework.web.bind.annotation.RestController;

import com.claim.entities.Claim;
import com.claim.repostories.ClaimRepository;
import com.claim.service.ClaimService;

import java.util.List;

import org.hibernate.boot.model.naming.ImplicitNameSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/claim")
public class ClaimController {

	@Autowired
	ClaimService claimService;
	 
	// add a claim 
	@PostMapping
	public ResponseEntity<Claim> addClaim(@RequestBody Claim claim){
		Claim resultClaim = claimService.addClaim(claim);
		return ResponseEntity.ok(resultClaim);
	}
	
	// get claim by claim id
	@GetMapping("/{id}")
	public ResponseEntity<Claim> getClaimbyID(@PathVariable("id") int id){
		Claim claim = claimService.getClaimbyID(id);
		return ResponseEntity.ok(claim);
	}
	
	// get claim by mbr id
	@GetMapping("/mbr/{id}")
	public ResponseEntity<Claim> getClaimbyMbrID(@PathVariable("id") int id){
		Claim claim = claimService.getClaimbyMbrID(id);
		return ResponseEntity.ok(claim);
	}
	
	// get all claims
	@GetMapping
	public ResponseEntity<List<Claim>> getAllClaim(){
		List<Claim> list = claimService.getAllClaims();
		return ResponseEntity.ok(list);
	}
	
	/*
	 * @GetMapping("/mbr/{id}") public ResponseEntity<Claim> getClaimsByMbrID(int
	 * mbr_id){ Claim claim = claimService.getClaimByMbrID(mbr_id); return
	 * ResponseEntity.ok(claim); }
	 */
	
}
