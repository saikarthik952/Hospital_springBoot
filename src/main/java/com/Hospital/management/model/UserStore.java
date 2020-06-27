package com.Hospital.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "UserStore")
public class UserStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column(name="password")
    private String password;
	@Column(name="role")
	private String role;
	@Column(name="emailId")
	private String emailId;

    public UserStore() {

    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public UserStore(long id, String password, String role, String emailId) {
		super();
		this.id = id;
		this.password = password;
		this.role = role;
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "UserStore [id=" + id + ", password=" + password + ", role=" + role + ", emailId=" + emailId + "]";
	}

}