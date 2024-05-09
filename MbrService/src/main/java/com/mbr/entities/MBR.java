package com.mbr.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="mbr")
public class MBR {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mbr_id")
	private int mbr_id;
	
	@Column(name="rec_src_cd")
	private String rec_src_cd;
	
	@Column(name="valid_from_dtm")
	private Date valid_from_dtm;
	
	@Column(name="valid_thru_dtm")
	private Date valid_thru_dtm;
	
	@Column(name="curr_indc")
	private int curr_indc;
	
	@Transient
	private List<Claim> claims = new ArrayList<>();
 
	public List<Claim> getClaims() {
		return claims;
	}

	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}

	public int getMbr_id() {
		return mbr_id;
	}

	public void setMbr_id(int mbr_id) {
		this.mbr_id = mbr_id;
	}

	public String getRec_src_cd() {
		return rec_src_cd;
	}

	public void setRec_src_cd(String rec_src_cd) {
		this.rec_src_cd = rec_src_cd;
	}

	public Date getValid_from_dtm() {
		return valid_from_dtm;
	}

	public void setValid_from_dtm(Date valid_from_dtm) {
		this.valid_from_dtm = valid_from_dtm;
	}

	public Date getValid_thru_dtm() {
		return valid_thru_dtm;
	}

	public void setValid_thru_dtm(Date valid_thru_dtm) {
		this.valid_thru_dtm = valid_thru_dtm;
	}

	public int getCurr_indc() {
		return curr_indc;
	}

	public void setCurr_indc(int curr_indc) {
		this.curr_indc = curr_indc;
	}

	@Override
	public String toString() {
		return "MBR [ mbr_id=" + mbr_id + ", rec_src_cd=" + rec_src_cd + ", valid_from_dtm="
				+ valid_from_dtm + ", valid_thru_dtm=" + valid_thru_dtm + ", curr_indc=" + curr_indc + ", claims="
				+ claims + "]";
	}

	public MBR(int mbr_id, String rec_src_cd, Date valid_from_dtm, Date valid_thru_dtm, int curr_indc) {
		super();
		this.mbr_id = mbr_id;
		this.rec_src_cd = rec_src_cd;
		this.valid_from_dtm = valid_from_dtm;
		this.valid_thru_dtm = valid_thru_dtm;
		this.curr_indc = curr_indc;
	}
	
	
	public MBR( ) {
 
	}
	
	
	
	
}
