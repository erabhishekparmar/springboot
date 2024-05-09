package com.mbr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mbr.entities.Claim;
import com.mbr.entities.MBR;
import com.mbr.external.service.ClaimService;
import com.mbr.repositories.MbrRepository;

@Service
public class MbrServiceImpl implements MbrService {

	@Autowired
	MbrRepository mbrRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ClaimService claimService;

	@Override
	public MBR addMember(MBR member) {
		mbrRepository.save(member);
		return member;
	}

	@Override
	public MBR getMemberById(int id) {
		
		MBR member = mbrRepository.findById(id).get();	
		
		// fetch claims 
		
		// API calling : method 1 
		// Claim claim =  restTemplate.getForObject("http://localhost:8282/claim/mbr/"+member.getMbr_id(), Claim.class);
		// Claim claim =  restTemplate.getForObject("http://CLAIM-SERVICE/claim/mbr/"+member.getMbr_id(), Claim.class);

		// API calling : method 2 - feign client
		Claim claim =  claimService.getClaim(member.getMbr_id());

		System.out.println(claim);
		List<Claim> list = List.of(claim);
		member.setClaims(list);
		
		return member;
				 
	}

	@Override
	public List<MBR> getAllMembers() {
		return mbrRepository.findAll();
	}
	 
	
}
