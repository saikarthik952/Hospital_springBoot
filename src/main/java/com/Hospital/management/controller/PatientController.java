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
import com.Hospital.management.model.Patient;
import com.Hospital.management.model.PatientDiagnostics;
import com.Hospital.management.model.PatientMedicines;
import com.Hospital.management.service.PatientService;
import com.Hospital.management.dao.PatientDao;
import com.Hospital.management.dao.PatientDiagnosticDao;
import com.Hospital.management.dao.PatientMedicineDao;
import com.Hospital.management.execptions.ResourceNotFoundException;
@RestController @CrossOrigin(origins = "http://localhost:4200")

public class PatientController {
	
	@Autowired
	PatientService patientService;
	PatientDao patientdao;
	PatientMedicineDao patientmedicinedao;
	PatientDiagnosticDao patientdiagnosticdao;
	
	@PostMapping(value="/patient/add")
	public ResponseEntity<String> addpatient(@RequestBody() Patient patient)
	{
	
		String result=patientService.addpatient(patient);
		return ResponseEntity.ok().body(result);
		
		
	}
	
	@PutMapping(value="/patient/getpatient")
	public ResponseEntity<Patient> getpatient(@RequestBody() Patient patient) throws ResourceNotFoundException
	{
	
		Patient result=patientService.getpatient(patient);
		return ResponseEntity.ok().body(result);
		
		
	}
	
	@PutMapping(value="/patient/getpatientmedicines")
	public ResponseEntity<List<PatientMedicines>> getpatientmedicine(@RequestBody() Patient patient) throws ResourceNotFoundException
	{
	
		List <PatientMedicines> result=patientService.getpatientmedicine(patient);
		return ResponseEntity.ok().body(result);
		
		
	}
	
	@PutMapping(value="/patient/getpatientdiagnostics")
	public ResponseEntity <List<PatientDiagnostics>> getpatientdiagnostics(@RequestBody() Patient patient) throws ResourceNotFoundException
	{
	
		List <PatientDiagnostics> result=patientService.getpatientdiagnostics(patient);
		return ResponseEntity.ok().body(result);
		
		
	}
	@PutMapping(value="/patient/deletepatient")
	public ResponseEntity<String> deletepatient(@RequestBody() Patient patient)
	{
	
		String result=patientService.deletepatient(patient);
		return ResponseEntity.ok().body(result);
		
		
	}
	@PutMapping(value="/patient/updatepatient")
	public ResponseEntity<String> updatepatient(@RequestBody() Patient patient)
	{
	
		String result=patientService.updatepatient(patient);
		return ResponseEntity.ok().body(result);
		
		
	}
	@GetMapping(value="/patient/viewpatients")
    public ResponseEntity<List<Patient>> viewpatients()throws ResourceNotFoundException {
		System.out.println("hi");
		List<Patient> result=patientService.getallpatients();
		
		return ResponseEntity.ok().body(result);
    }
	
	/*@DeleteMapping("/patient/{ws_pat_id}")
    public Map<String, Boolean> deletePatient(@PathVariable(value = "ws_pat_id") Long patientId)
         throws ResourceNotFoundException {
		System.out.println(patientId);
        Patient patient = patientdao.findById(patientId)
       .orElseThrow(() -> new ResourceNotFoundException("Patient not found for this id :: " + patientId));
        
        System.out.println(patient.getWs_pat_name());
        patientdao.delete(patient);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }*/
	@DeleteMapping("/patient/{ws_pat_id}")
    public ResponseEntity<String> deletePatient(@PathVariable(value = "ws_pat_id") Long patientId)
         throws ResourceNotFoundException {
		System.out.println(patientId);
		String result = patientService.deletepatientById(patientId);
		return ResponseEntity.ok().body(result); 
        
    }
	
}
