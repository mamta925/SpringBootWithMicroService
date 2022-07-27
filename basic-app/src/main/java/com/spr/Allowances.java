package com.spr;

import org.springframework.stereotype.Component;

@Component
public class Allowances {
	private int hra, ta;
	
	public Allowances () {
		this.hra = 1000;
		this.ta = 2000;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getTa() {
		return ta;
	}

	public void setTa(int ta) {
		this.ta = ta;
	}

}
