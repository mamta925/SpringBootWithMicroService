package com.web.webapp;

public class Login {

	private String password;
	private String username;
	public Login() {

	}
	
	
	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return username;
	}
	public boolean validate() {

		if(new String(this.username).equals(this.password)) {
			return true;
		}
		else {
			return false;
		}
	}


	public void setUsername(String username) {
		this.username = username;
	}

}