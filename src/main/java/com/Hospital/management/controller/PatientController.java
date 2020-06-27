package com.Hospital.management.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.Hospital.management.model.Patient;
import com.Hospital.management.service.PatientService;
import com.Hospital.management.dao.PatientDao;
import com.Hospital.management.execptions.ResourceNotFoundException;
@CrossOrigin("http://localhost:4200")
@RestController
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@PostMapping(value="/patient/add")
	public ResponseEntity<String> addpatient(@RequestBody() Patient patient)
	{
	
		String result=patientService.addpatient(patient);
		return ResponseEntity.ok().body(result);
		
		
	}

}
