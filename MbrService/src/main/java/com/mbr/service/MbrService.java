package com.mbr.service;

import java.util.List;

import com.mbr.entities.MBR;

public interface MbrService {

	// add member
	MBR addMember(MBR member) ;
	
	// get member by id
	MBR getMemberById(int id); 
	
	// get all members
	List<MBR> getAllMembers();
	
}
