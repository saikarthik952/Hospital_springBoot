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
public class PatientMedicineService {
	
	@Autowired
	MedicineDao medicinedao;
	
	@Autowired
	PatientMedicineDao patientMedicineDao;
	
	
	@Autowired
	PatientDao patientDao;
	public Medicines getMedicine(String name) throws com.Hospital.management.execptions.ResourceNotFoundException
	{
		Medicines pm=medicinedao.findByws_Med_Name(name);
		return pm;
	}
	
	public List<PatientMedicines> getmedicines(Patient p)
	{
		
		
		List<PatientMedicines> getall=patientMedicineDao.findByws_Pat_Id(p.getWs_pat_id());
		
		
		
		return getall;
		
	}
	
	
	
	public String addpatientmedicine(PatientMedicines p)
	{
		
	
	Medicines m=medicinedao.findByws_Med_Name(p.getWs_med_name());
	
	int reqquantity=Integer.parseInt(p.getWs_med_qty());
	int amount=reqquantity*Integer.parseInt(m.getWs_med_rate());
	p.setWs_med_amt(Integer.toString(amount));
	
	int medquantity=Integer.parseInt(m.getWs_med_qty());
	
	int remq=medquantity-reqquantity;
	if(remq<0)
		return "Medicines Quantity Exceeded";
	m.setWs_med_qty(Integer.toString(remq));
	if(remq==0)
	{
		
		m.setWs_med_avail("Not available");
		
	}
	
	
	
	medicinedao.save(m);
	PatientMedicines pm=patientMedicineDao.save(p);
	if(pm==null)
		return "Medicines Not Saved";
	
	
	return "Medicine Stored Successfully";
	
	}
	
	

}
