package com.dco.secpro.web.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dco.secpro.core.entity.AppUser;
import com.dco.secpro.core.service.UserService;

@RestController
public class LoginController {

	private final static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	
    @Autowired
    private UserService userservice;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {

		logger.info("Calling LoginController.login method....");

		return new ModelAndView("index");

	}

	@RequestMapping(value = "getuser", method = RequestMethod.GET)
	public AppUser getUser() {

		AppUser user = new AppUser();
		user.setId(100);
		user.setUseName("James Li");
		user.setHireday(new Date());

		return user;
	}

	@RequestMapping(value = "getuserlist", method = RequestMethod.GET)
	public List<AppUser> getUserList() {


		return userservice.getUsers();
	}

}
