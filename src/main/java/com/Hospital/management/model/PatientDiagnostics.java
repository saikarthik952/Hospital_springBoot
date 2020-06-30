package com.Hospital.management.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="patientdiagnostics")
public class PatientDiagnostics {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ws_pat_diag_id;
	
	@Column(name="ws_pat_id")
    private long ws_pat_id;
	
	@Column(name="ws_diag_name")
    private String ws_diag_name;
	
	@Column(name="ws_diag_amt")
	private long ws_diag_amt;
	
	
	public PatientDiagnostics(long ws_pat_diag_id, long ws_pat_id, String ws_diag_name, long ws_diag_amt
			) {
		super();
		this.ws_pat_diag_id = ws_pat_diag_id;
		this.ws_pat_id = ws_pat_id;
		this.ws_diag_name = ws_diag_name;
		this.ws_diag_amt = ws_diag_amt;
	}
	public long getWs_pat_diag_id() {
		return ws_pat_diag_id;
	}
	public void setWs_pat_diag_id(long ws_pat_diag_id) {
		this.ws_pat_diag_id = ws_pat_diag_id;
	}
	
	public PatientDiagnostics() {
		
	}
	@Override
	public String toString() {
		return "PatientMedicines [ws_pat_id=" + ws_pat_id + ", ws_diag_name=" + ws_diag_name + ", ws_diag_amt="
				+ ws_diag_amt + "]";
	}
	public PatientDiagnostics(long ws_pat_id, String ws_diag_name, long ws_diag_amt) {
		super();
		this.ws_pat_id = ws_pat_id;
		this.ws_diag_name = ws_diag_name;
		this.ws_diag_amt = ws_diag_amt;
	}
	public long getWs_pat_id() {
		return ws_pat_id;
	}
	public void setWs_pat_id(long ws_pat_id) {
		this.ws_pat_id = ws_pat_id;
	}
	public String getWs_diag_name() {
		return ws_diag_name;
	}
	public void setWs_diag_name(String ws_diag_name) {
		this.ws_diag_name = ws_diag_name;
	}
	public long getWs_diag_amt() {
		return ws_diag_amt;
	}
	public void setWs_diag_amt(long ws_diag_amt) {
		this.ws_diag_amt = ws_diag_amt;
	}
	

}
