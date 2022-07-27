package com.spr;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String address;
	public Address () {
		this.address = "anukampa pplatina Jaipur Rajasthan";

	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
