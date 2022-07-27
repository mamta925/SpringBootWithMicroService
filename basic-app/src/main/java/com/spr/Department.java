package com.spr;


import org.springframework.stereotype.Component;

@Component
public class Department {
	private String dname;
	private String location;
	public Department () {
		this.dname = "EC";
		this.location = "Alwar";
	}
	
	
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


}
