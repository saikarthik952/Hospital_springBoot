package com.Hospital.management.service;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hospital.management.dao.*;
import com.Hospital.management.model.*;

import com.Hospital.management.execptions.*;
@Service
public class PatientService {
	
	
	@Autowired
	PatientDao patientdao;
	PatientMedicineDao patientmedicinedao;
	PatientDiagnosticDao patientdiagnosticdao;
	
	
	public void setpsdao(PatientDao patientdao) { this.patientdao=patientdao;}
	
	
	
	public String addpatient(Patient p)
	{
		p.setWs_pat_status("Active");
		p.setWs_pat_nod(0);
		p.setWs_pat_dod("");
		Patient s=patientdao.save(p);
	
		System.out.println(s);
		
		if(s!=null)
			return "Patient Created Successfully";
		else
			return "Patient not Created Successfully";
			
		
		
		
		
	}
	public String updatepatient(Patient p)
	{
		System.out.println(p.toString());
		Patient s=patientdao.findById(p.getWs_pat_id()).get();
		if(s==null)
			return "Patient not Updated Successfully";
		s.setWs_pat_adrs(p.getWs_pat_adrs());
		s.setWs_pat_age(p.getWs_pat_age());
		s.setWs_pat_city(p.getWs_pat_city());
		s.setWs_pat_dob(p.getWs_pat_dob());
		s.setWs_pat_name(p.getWs_pat_name());
		s.setWs_pat_ssn(p.getWs_pat_ssn());
		s.setWs_pat_state(p.getWs_pat_state());
		s.setWs_pat_status(p.getWs_pat_status());
		s.setWs_pat_type(p.getWs_pat_type());
		s.setWs_pat_dod(p.getWs_pat_dod());
		LocalDate start=LocalDate.parse(s.getWs_pat_dob());
		LocalDate end=LocalDate.parse(s.getWs_pat_dod());
		long days=ChronoUnit.DAYS.between(start, end);
		s.setWs_pat_nod(days);
		patientdao.save(s);
		System.out.println(s);
		
	
		
			return "Patient Updated Successfully";
			
		
		
		
		
	}
	public String deletepatient(Patient p)
	{
		System.out.println(p.toString());
		Patient s=patientdao.findById(p.getWs_pat_id()).get();
		if(s==null)
			return "Patient not Deleted Successfully";
		
		patientdao.delete(p);
	
		
			return "Patient Deleted Successfully";
			
		
		
	}
	public String deletepatientById(long id)
	{
		
		//long myid = id;
		Patient s=patientdao.findById(id).get();
		if(s==null)
			return "Patient not Deleted Successfully";
		
		patientdao.delete(s);
	
		
			return "Patient Deleted Successfully";
			
		
		
	}
	public Patient getpatient(Patient p) throws com.Hospital.management.execptions.ResourceNotFoundException
	{
		
		
		Patient s=patientdao.findById(p.getWs_pat_id()).get();
		if(s==null)
		{
			
			return s;
		}
		return s;
		
		
	}
	public List<Patient> getallpatients()
	{
		return patientdao.findAll();
		
	}
	
	public List<PatientMedicines> getpatientmedicine(Patient p) throws com.Hospital.management.execptions.ResourceNotFoundException
	{
		
		
		List <PatientMedicines> s=patientmedicinedao.findByws_Pat_Id(p.getWs_pat_id());
		for(PatientMedicines q : s)
			System.out.println(q);
		if(s==null)
		{
			
			return s;
		}
		return s;
		
		
	}
	
	public List<PatientDiagnostics> getpatientdiagnostics(Patient p) throws com.Hospital.management.execptions.ResourceNotFoundException
	{
		
		
		List <PatientDiagnostics> s=patientdiagnosticdao.findByws_Pat_Id(p.getWs_pat_id());
		for(PatientDiagnostics q : s)
			System.out.println(q);
		if(s==null)
		{
			
			return s;
		}
		return s;
		
		
	}
	
}
 