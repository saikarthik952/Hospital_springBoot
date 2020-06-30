package com.Hospital.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Diagnostics")
public class Diagnostics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ws_diag_id;
    
    @Column(name="ws_diag_name")
    private String ws_diag_name;
    
	@Column(name="ws_diag_amt")
    private long ws_diag_amt;
	
	
	
	@Override
	public String toString() {
		return "Diagnostics [ws_diag_id=" + ws_diag_id + ", ws_diag_name=" + ws_diag_name + ", ws_diag_amt=" + ws_diag_amt
				+ "]";
	}
	public long getWs_diag_id() {
		return ws_diag_id;
	}
	public void setWs_diag_id(long ws_diag_id) {
		this.ws_diag_id = ws_diag_id;
	}
	public long getWs_diag_amt() {
		return ws_diag_amt;
	}
	public void setWs_diag_amt(long ws_diag_amt) {
		this.ws_diag_amt = ws_diag_amt;
	}
	public String getWs_diag_name() {
		return ws_diag_name;
	}
	public void setWs_diag_name(String ws_diag_name) {
		this.ws_diag_name = ws_diag_name;
	}
	
	public Diagnostics(long ws_diag_id, String ws_diag_name, long ws_diag_amt) {
		super();
		this.ws_diag_id = ws_diag_id;
		this.ws_diag_name = ws_diag_name;
		this.ws_diag_amt = ws_diag_amt;
	}
	public Diagnostics() {
		
	}

}