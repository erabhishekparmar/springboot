package com.test.repo;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Date;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.entities.Claim;

@SpringBootTest
public class ClaimRepoTest {
	
	@Autowired
	ClaimRepo claimRepo;

	@Test
	void isClaimExist() {
		Optional<Claim> claimOptional = claimRepo.findById(1);
		
		Claim claim = claimOptional.get();
		boolean claimExist = false;
		
		if(claim!=null)
		{
			claimExist = true;
		}
		
		assertThat(claimExist).isTrue();
		
	}
	
	@Test
	void isInserted() {
		
		Claim newClaim = new Claim(1000,113,"TEST", null, null, 1,1);
		
		claimRepo.save(newClaim);
		
		Optional<Claim> claimOptional = claimRepo.findById(1000);
		
		Claim claim = claimOptional.get();
		boolean claimExist = false;
		
		if(claim!=null)
		{
			claimExist = true;
		}
		
		assertThat(claimExist).isTrue();
		
	}


	
	@AfterEach
	void tearDown() {
		System.out.println("here i can delete the data stored for testing");
		
		//claimRepo.deleteAllById(1000);
		
		//System.out.println("claim deleted with claim_id : 1000");
	}
	
	
	@BeforeEach
	void setUp() {
		System.out.println("here i can insert the data for testing");
	}
	
	

}
