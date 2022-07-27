package com.spr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@Column(name="slno")
	private int slno;
	
	@Column(name="sname")
	private String sname;
	
	@Column(name="age")
	private int age;
	
	@Column(name="mail")
	private String mail;
	
	public Student() {
		
	}

	
	public Student(int slno, String sname, int age, String mail) {
		this.slno = slno;
		this.sname = sname;
		this.age = age;
		this.mail = mail;
	}


	public int getSlno() {
		return slno;
	}

	public void setSlno(int slno) {
		this.slno = slno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
}
