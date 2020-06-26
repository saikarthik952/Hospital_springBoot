package com.Hospital.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.management.model.UserStore;
@Repository
public interface UserStoreDao extends JpaRepository<UserStore,Long> {

	
	public UserStore findByemailId(String emailid); 
	
}
