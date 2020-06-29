package com.Hospital.management.controller;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.Hospital.management.model.*;
import com.Hospital.management.service.*;

import com.Hospital.management.execptions.ResourceNotFoundException;
@RestController @CrossOrigin(origins = "http://localhost:4200")
public class PatientMedicineController {
	
	
	@Autowired
	PatientMedicineService pmService;
	
	@PutMapping(value="pharmacist/getpatientmedicines")
	public ResponseEntity<List<PatientMedicines>> getpmedcinines(@RequestBody() Patient p)
	{
		return ResponseEntity.ok().body(pmService.getmedicines(p));
	}
	
	@PostMapping(value="pharmacist/addmedcine")
	public ResponseEntity<String> addmedicine(@RequestBody() PatientMedicines p)
	{
		return ResponseEntity.ok().body(pmService.addpatientmedicine(p));
	}
	
	
	@PutMapping(value="pharmcist/getmedicine")
	public ResponseEntity<Medicines> getmedicine(@RequestBody() Medicines m) throws ResourceNotFoundException
	{
		if(pmService.getMedicine(m.getWs_med_name())==null)
		{
			m.setWs_med_avail("Medicine is invalid");
			return ResponseEntity.ok().body(m);
		}
		return ResponseEntity.ok().body(pmService.getMedicine(m.getWs_med_name()));
	}
	
	

}
