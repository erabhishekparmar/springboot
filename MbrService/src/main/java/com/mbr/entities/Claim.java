package com.mbr.entities;

import java.sql.Date;

public class Claim {
	
	private int claim_id;
	
	private int div_cd;

	private String rec_src_cd;
	
	private Date valid_from_dtm;
	
	private Date valid_thru_dtm;

	private int actv_indc;
	
 

	public Claim(int claim_id, int div_cd, String rec_src_cd, Date valid_from_dtm, Date valid_thru_dtm, int actv_indc) {
		super();
		this.claim_id = claim_id;
		this.div_cd = div_cd;
		this.rec_src_cd = rec_src_cd;
		this.valid_from_dtm = valid_from_dtm;
		this.valid_thru_dtm = valid_thru_dtm;
		this.actv_indc = actv_indc;
	}

	public int getClaim_id() {
		return claim_id;
	}

	public void setClaim_id(int claim_id) {
		this.claim_id = claim_id;
	}

	public int getDiv_cd() {
		return div_cd;
	}

	public void setDiv_cd(int div_cd) {
		this.div_cd = div_cd;
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

	public int getActv_indc() {
		return actv_indc;
	}

	public void setActv_indc(int actv_indc) {
		this.actv_indc = actv_indc;
	}
	
	
	
}
