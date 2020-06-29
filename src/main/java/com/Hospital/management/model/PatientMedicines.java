package com.Hospital.management.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="patientmedicines")
public class PatientMedicines {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ws_pat_med_id;
	@Column(name="ws_pat_id")
    private long ws_pat_id;
	public PatientMedicines(long ws_pat_med_id, long ws_pat_id, String ws_med_name, String ws_med_rate,
			String ws_med_qty, String ws_med_amt) {
		super();
		this.ws_pat_med_id = ws_pat_med_id;
		this.ws_pat_id = ws_pat_id;
		this.ws_med_name = ws_med_name;
		this.ws_med_rate = ws_med_rate;
		this.ws_med_qty = ws_med_qty;
		this.ws_med_amt = ws_med_amt;
	}
	public long getWs_pat_med_id() {
		return ws_pat_med_id;
	}
	public void setWs_pat_med_id(long ws_pat_med_id) {
		this.ws_pat_med_id = ws_pat_med_id;
	}
	@Column(name="ws_med_name")
    private String ws_med_name;
	@Column(name="ws_med_rate")
	private String ws_med_rate;
	@Column(name="ws_med_qty")
	private String ws_med_qty;
	@Column(name="ws_med_amt")
	private String ws_med_amt;
	public PatientMedicines() {
		
	}
	@Override
	public String toString() {
		return "PatientMedicines [ws_pat_id=" + ws_pat_id + ", ws_med_name=" + ws_med_name + ", ws_med_rate="
				+ ws_med_rate + ", ws_med_qty=" + ws_med_qty + ", ws_med_amt=" + ws_med_amt + "]";
	}
	public PatientMedicines(long ws_pat_id, String ws_med_name, String ws_med_rate, String ws_med_qty,
			String ws_med_amt) {
		super();
		this.ws_pat_id = ws_pat_id;
		this.ws_med_name = ws_med_name;
		this.ws_med_rate = ws_med_rate;
		this.ws_med_qty = ws_med_qty;
		this.ws_med_amt = ws_med_amt;
	}
	public long getWs_pat_id() {
		return ws_pat_id;
	}
	public void setWs_pat_id(long ws_pat_id) {
		this.ws_pat_id = ws_pat_id;
	}
	public String getWs_med_name() {
		return ws_med_name;
	}
	public void setWs_med_name(String ws_med_name) {
		this.ws_med_name = ws_med_name;
	}
	public String getWs_med_rate() {
		return ws_med_rate;
	}
	public void setWs_med_rate(String ws_med_rate) {
		this.ws_med_rate = ws_med_rate;
	}
	public String getWs_med_qty() {
		return ws_med_qty;
	}
	public void setWs_med_qty(String ws_med_qty) {
		this.ws_med_qty = ws_med_qty;
	}
	public String getWs_med_amt() {
		return ws_med_amt;
	}
	public void setWs_med_amt(String ws_med_amt) {
		this.ws_med_amt = ws_med_amt;
	}

}
