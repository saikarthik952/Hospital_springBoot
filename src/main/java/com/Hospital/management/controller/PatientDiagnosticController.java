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
public class PatientDiagnosticController {
	
	
	@Autowired
	PatientDiagnosticService pdService;
	
	@PutMapping(value="diagnosticcenter/getpatientdiagnostics")
	public ResponseEntity<List<PatientDiagnostics>> getpmedcinines(@RequestBody() Patient p)
	{
		return ResponseEntity.ok().body(pdService.getdiagnostics(p));
	}
	
	@PostMapping(value="diagnosticcenter/adddiagnostic")
	public ResponseEntity<String> addmedicine(@RequestBody() PatientDiagnostics p)
	{
		return ResponseEntity.ok().body(pdService.addpatientdiagnostic(p));
	}
	
	
	@PutMapping(value="diagnosticcenter/getdiagnostic")
	public ResponseEntity<Diagnostics> getmedicine(@RequestBody() Diagnostics m) throws ResourceNotFoundException
	{
		if(pdService.getDiagnostic(m.getWs_diag_name())==null)
		{
			
			return ResponseEntity.ok().body(m);
		}
		return ResponseEntity.ok().body(pdService.getDiagnostic(m.getWs_diag_name()));
	}
	
	

}
