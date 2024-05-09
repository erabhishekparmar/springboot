package com.mbr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbr.entities.MBR;

public interface MbrRepository extends JpaRepository<MBR, Integer> {

}
