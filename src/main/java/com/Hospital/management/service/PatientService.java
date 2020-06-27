package com.Hospital.management.service;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hospital.management.dao.UserStoreDao;
import com.Hospital.management.dao.*;
import com.Hospital.management.model.*;
import com.Hospital.management.execptions.*;
@Service
public class PatientService {
	
	
	@Autowired
	PatientDao patientdao;
	
	
	public void setpsdao(PatientDao patientdao) { this.patientdao=patientdao;}
	
	
	
	public String addpatient(Patient p)
	{
		p.setWs_pat_status("Active");
		Patient s=patientdao.save(p);
		
		System.out.println(s);
		
		if(s!=null)
			return "Patient Created Successfully";
		else
			return "Patient not Created Successfully";
			
		
		
		
		
	}
}
