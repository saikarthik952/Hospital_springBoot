package com.Hospital.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="Patient")
public class Patient {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long ws_pat_id;
	 
	 	@Column(name="ws_pat_name")
	 	private String ws_pat_name;
	 	@Column(name="ws_pat_ssn")
	 	private String ws_pat_ssn;
	 	@Column(name="ws_pat_adrs")
	 	private String ws_pat_adrs;
	 	@Column(name="ws_pat_age")
	 	private String ws_pat_age;
	 	@Column(name="ws_pat_dob")
	 	private String ws_pat_dob;
	 	@Column(name="ws_pat_type")
	 	private String ws_pat_type;
	 	public Patient() {
			
		}
		@Override
		public String toString() {
			return "Patient [ws_pat_id=" + ws_pat_id + ", ws_pat_name=" + ws_pat_name + ", ws_pat_ssn=" + ws_pat_ssn
					+ ", ws_pat_adrs=" + ws_pat_adrs + ", ws_pat_age=" + ws_pat_age + ", ws_pat_dob=" + ws_pat_dob
					+ ", ws_pat_type=" + ws_pat_type + ", ws_pat_city=" + ws_pat_city + ", ws_pat_state=" + ws_pat_state
					+ ", ws_pat_status=" + ws_pat_status + ", ws_pat_dod=" + ws_pat_dod +", ws_pat_nod=" + ws_pat_nod + "]";
		}
		public Patient(long ws_pat_id, String ws_pat_name, String ws_pat_ssn, String ws_pat_adrs, String ws_pat_age,
				String ws_pat_dob, String ws_pat_type, String ws_pat_city, String ws_pat_state, String ws_pat_status, String ws_pat_dod, long ws_pat_nod) {
			super();
			this.ws_pat_id = ws_pat_id;
			this.ws_pat_name = ws_pat_name;
			this.ws_pat_ssn = ws_pat_ssn;
			this.ws_pat_adrs = ws_pat_adrs;
			this.ws_pat_age = ws_pat_age;
			this.ws_pat_dob = ws_pat_dob;
			this.ws_pat_type = ws_pat_type;
			this.ws_pat_city = ws_pat_city;
			this.ws_pat_state = ws_pat_state;
			this.ws_pat_status = ws_pat_status;
			this.ws_pat_dod = ws_pat_dod;
			this.ws_pat_nod = ws_pat_nod;
		}
		public long getWs_pat_nod() {
			return ws_pat_nod;
		}
		public void setWs_pat_nod(long ws_pat_nod) {
			this.ws_pat_nod = ws_pat_nod;
		}
		public String getWs_pat_dod() {
			return ws_pat_dod;
		}
		public void setWs_pat_dod(String ws_pat_dod) {
			this.ws_pat_dod = ws_pat_dod;
		}
		public long getWs_pat_id() {
			return ws_pat_id;
		}
		public void setWs_pat_id(long ws_pat_id) {
			this.ws_pat_id = ws_pat_id;
		}
		public String getWs_pat_name() {
			return ws_pat_name;
		}
		public void setWs_pat_name(String ws_pat_name) {
			this.ws_pat_name = ws_pat_name;
		}
		public String getWs_pat_ssn() {
			return ws_pat_ssn;
		}
		public void setWs_pat_ssn(String ws_pat_ssn) {
			this.ws_pat_ssn = ws_pat_ssn;
		}
		public String getWs_pat_adrs() {
			return ws_pat_adrs;
		}
		public void setWs_pat_adrs(String ws_pat_adrs) {
			this.ws_pat_adrs = ws_pat_adrs;
		}
		public String getWs_pat_age() {
			return ws_pat_age;
		}
		public void setWs_pat_age(String ws_pat_age) {
			this.ws_pat_age = ws_pat_age;
		}
		public String getWs_pat_dob() {
			return ws_pat_dob;
		}
		public void setWs_pat_dob(String ws_pat_dob) {
			this.ws_pat_dob = ws_pat_dob;
		}
		public String getWs_pat_type() {
			return ws_pat_type;
		}
		public void setWs_pat_type(String ws_pat_type) {
			this.ws_pat_type = ws_pat_type;
		}
		public String getWs_pat_city() {
			return ws_pat_city;
		}
		public void setWs_pat_city(String ws_pat_city) {
			this.ws_pat_city = ws_pat_city;
		}
		public String getWs_pat_state() {
			return ws_pat_state;
		}
		public void setWs_pat_state(String ws_pat_state) {
			this.ws_pat_state = ws_pat_state;
		}
		public String getWs_pat_status() {
			return ws_pat_status;
		}
		public void setWs_pat_status(String ws_pat_status) {
			this.ws_pat_status = ws_pat_status;
		}
		@Column(name="ws_pat_city")
	 	private String ws_pat_city;
	 	@Column(name="ws_pat_state")
	 	private String ws_pat_state;
	 	@Column(name="ws_pat_status")
	 	private String ws_pat_status;
	 	@Column(name="ws_pat_dod")
	 	private String ws_pat_dod;
	 	@Column(name="ws_pat_nod")
	 	private long ws_pat_nod;

}
