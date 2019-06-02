package com.dco.secpro.core.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dco.secpro.core.entity.AppUser;
public interface UserService {
	
	public List<AppUser> getUsers();

}
