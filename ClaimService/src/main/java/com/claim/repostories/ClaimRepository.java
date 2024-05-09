package com.claim.repostories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claim.entities.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Integer> {

	// custom finder methods
	public Claim findByMbrId(int mbr_id);
	
}
