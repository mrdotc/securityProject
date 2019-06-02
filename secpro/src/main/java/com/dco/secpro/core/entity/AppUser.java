package com.dco.secpro.core.entity;

import java.util.Date;

public class AppUser {

	private int id;

	private String useName;
	
	
	private Date hireday;

	
	
	public AppUser() {}
	
	public AppUser(int id, String useName,Date hireday) {
		super();
		this.id = id;
		this.useName = useName;
		this.hireday=hireday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUseName() {
		return useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
	}

	public Date getHireday() {
		return hireday;
	}

	public void setHireday(Date hireday) {
		this.hireday = hireday;
	}
	
	

}
