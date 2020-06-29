package com.Hospital.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Medicines")
public class Medicines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ws_med_id;
	public long getWs_med_id() {
		return ws_med_id;
	}
	public void setWs_med_id(long ws_med_id) {
		this.ws_med_id = ws_med_id;
	}
	public String getWs_med_avail() {
		return ws_med_avail;
	}
	public void setWs_med_avail(String ws_med_avail) {
		this.ws_med_avail = ws_med_avail;
	}
	@Column(name="ws_med_name")
    private String ws_med_name;
	@Column(name="ws_med_qty")
	private String ws_med_qty;
	@Column(name="ws_med_rate")
	private String ws_med_rate;
	@Column(name="ws_med_avail")
	private String ws_med_avail;
	
	
	@Override
	public String toString() {
		return "Medicines [ws_med_id=" + ws_med_id + ", ws_med_name=" + ws_med_name + ", ws_med_qty=" + ws_med_qty
				+ ", ws_med_rate=" + ws_med_rate + "]";
	}
	public String getWs_med_name() {
		return ws_med_name;
	}
	public void setWs_med_name(String ws_med_name) {
		this.ws_med_name = ws_med_name;
	}
	public String getWs_med_qty() {
		return ws_med_qty;
	}
	public void setWs_med_qty(String ws_med_qty) {
		this.ws_med_qty = ws_med_qty;
	}
	public String getWs_med_rate() {
		return ws_med_rate;
	}
	public void setWs_med_rate(String ws_med_rate) {
		this.ws_med_rate = ws_med_rate;
	}

	public Medicines(long ws_med_id, String ws_med_name, String ws_med_qty, String ws_med_rate, String ws_med_avail) {
		super();
		this.ws_med_id = ws_med_id;
		this.ws_med_name = ws_med_name;
		this.ws_med_qty = ws_med_qty;
		this.ws_med_rate = ws_med_rate;
		this.ws_med_avail = ws_med_avail;
	}
	public Medicines() {
		
	}

}