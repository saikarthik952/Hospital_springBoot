package com.Hospital.management.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hospital.management.dao.UserStoreDao;
import com.Hospital.management.model.UserStore;

import com.Hospital.management.execptions.*;


@Service
public class UserService {
	
	@Autowired
	UserStoreDao userDao;
	
	
	public void setpsdao(UserStoreDao userDao) { this.userDao=userDao;}
	
@Transactional
public String login(UserStore user) throws com.Hospital.management.execptions.ResourceNotFoundException
{
	UserStore getuser=userDao.findByemailId(user.getEmailId());
	if(getuser==null)
		return "user not found";
	else if(!getuser.getPassword().equals(user.getPassword()))
		return "password incorrect";
	
	
	return getuser.getRole();
	
	
	
	
	

	}
}
