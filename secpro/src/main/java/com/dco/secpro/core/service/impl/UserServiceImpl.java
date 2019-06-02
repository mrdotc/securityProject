package com.dco.secpro.core.service.impl;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dco.secpro.core.entity.AppUser;
import com.dco.secpro.core.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Value("${server.port}")
	private String serverPort;
	
	@Override
	public List<AppUser> getUsers() {
		// TODO Auto-generated method stub
		
	    List<AppUser> list =new ArrayList<AppUser>();
	    int i=0;
	    do {
	    	AppUser user =new AppUser(100+i,"James Li"+serverPort,new Date());
	    	list.add(user);
	    	i++;
	    }
	    while(i<100);
	    
	    return list;
	}

}
