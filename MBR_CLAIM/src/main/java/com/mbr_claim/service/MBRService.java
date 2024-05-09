package com.mbr_claim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbr_claim.dao.MBRRepository;
import com.mbr_claim.entities.MBR;

@Service
public class MBRService {

	@Autowired
	private MBRRepository mbrRepository;
	
	public List<MBR>  getMBRInService() {
		List<MBR> list = null;
		list = mbrRepository.findAll();
		return list;
	}
	
	public MBR addMBRInService(MBR member) {
		MBR result = null;
		result = mbrRepository.save(member);
		return result;
	}
	
}
