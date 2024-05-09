package com.mbr_claim.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mbr_claim.entities.MBR;
import com.mbr_claim.service.MBRService;

@RestController
public class MBRController {

	@Autowired
	private MBRService mbrService;
	
	@GetMapping("/member")
	public ResponseEntity<List<MBR>> getMember() {
		List<MBR> list = null;
		// call service method
		
		list = mbrService.getMBRInService();
		
		if(list.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping("/member")
	public ResponseEntity<MBR> addMember(@RequestBody MBR member){
		 
		try {
			MBR result = mbrService.addMBRInService(member);
			return ResponseEntity.of(Optional.of(result));
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
}
