package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entities.Claim;

public interface ClaimRepo extends JpaRepository<Claim, Integer> {

	/*
	 * @Query("SELECT CASE WHEN COUNT(C)>0 TRUE ELSE FALSE END FROM CLAIM C WHERE C.claim_id:=?1"
	 * ) public boolean isClaimExist( Integer claim_id);
	 */
	 
	
}
