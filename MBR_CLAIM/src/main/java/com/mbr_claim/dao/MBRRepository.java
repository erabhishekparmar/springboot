package com.mbr_claim.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbr_claim.entities.MBR;

public interface MBRRepository extends JpaRepository<MBR,Integer> {

}
