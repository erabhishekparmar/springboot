package com.mbr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbr.entities.MBR;
import com.mbr.service.MbrServiceImpl;

@RestController
@RequestMapping("/mbr")
public class MbrContoller {
	
	@Autowired
	MbrServiceImpl mbrServiceImpl;

	// create
	@PostMapping 
	public ResponseEntity<MBR> addMBR(@RequestBody MBR member){
		MBR resultMbr =	mbrServiceImpl.addMember(member);
		return ResponseEntity.ok(resultMbr);
	}
	
	// get user by id
	@GetMapping("/{id}")
	public ResponseEntity<MBR> getMBR(@PathVariable("id") int id){
		MBR resultMbr =	mbrServiceImpl.getMemberById(id);
		return ResponseEntity.ok(resultMbr);
	}
	
	
	// get all user
	@GetMapping 
	public ResponseEntity<List<MBR>> getAllMBR(){
		List<MBR> list =mbrServiceImpl.getAllMembers();
		return ResponseEntity.ok(list);
	
	}
	
}
