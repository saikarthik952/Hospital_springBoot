package com.Hospital.management.service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hospital.management.dao.UserStoreDao;
import com.Hospital.management.dao.*;
import com.Hospital.management.model.*;

import com.Hospital.management.execptions.*;
@Service
public class PatientDiagnosticService {
	
	@Autowired
	DiagnosticDao diagnosticdao;
	
	@Autowired
	PatientDiagnosticDao patientdiagnosticdao;
	
	
	@Autowired
	PatientDao patientDao;
	public Diagnostics getDiagnostic(String name) throws com.Hospital.management.execptions.ResourceNotFoundException
	{
		Diagnostics pm=diagnosticdao.findByws_Diag_Name(name);
		return pm;
	}
	
	public List<PatientDiagnostics> getdiagnostics(Patient p)
	{
		
		
		List<PatientDiagnostics> getall=patientdiagnosticdao.findByws_Pat_Id(p.getWs_pat_id());
		
		
		
		return getall;
		
	}
	
	
	
	public String addpatientdiagnostic(PatientDiagnostics p)
	{
		
	
	Diagnostics m=diagnosticdao.findByws_Diag_Name(p.getWs_diag_name());
	
	
	long amount=m.getWs_diag_amt();
	p.setWs_diag_amt(amount);
	
	
	
	
	
	diagnosticdao.save(m);
	PatientDiagnostics pm=patientdiagnosticdao.save(p);
	if(pm==null)
		return "Diagnostics Not Saved";
	
	
	return "Diagnostic Stored Successfully";
	
	}
	
	

}
