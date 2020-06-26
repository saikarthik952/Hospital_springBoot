package com.Hospital.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.management.execptions.ResourceNotFoundException;
import com.Hospital.management.model.UserStore;
import com.Hospital.management.service.UserService;
@CrossOrigin("http://localhost:4200")
@RestController
public class UserController {
	@Autowired
	UserService userservice;
	
	
	
	
	
	
	
	@PostMapping(value="/login" , consumes="application/json")
    public ResponseEntity<String> login(@RequestBody() UserStore user) throws ResourceNotFoundException {
		
		return ResponseEntity.ok().body(userservice.login(user));
		
        
		
		
		
	
		
    }
}
