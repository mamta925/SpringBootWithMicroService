package com.spr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	public int empid, salary, total_salary;
	public String ename;
	@Autowired private Department dpt;
	@Autowired private Allowances all;
	
	public Employee () {
		this.empid = 101;
		this.ename = "Jayan";
		this.salary = 2000;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public Department getDpt() {
		return dpt;
	}
	public void setDpt(Department dpt) {
		this.dpt = dpt;
	}
	public Allowances getAll() {
		return all;
	}
	public void setAll(Allowances all) {
		this.all = all;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void show() {
		System.out.println("ID="+ this.getEmpid());
		System.out.println("Name="+ this.getEname());
		System.out.println("Salary="+ this.getSalary());
		System.out.println("Department="+ this.getDpt().getDname());
		System.out.println("Department Location="+ this.getDpt().getLocation());
		System.out.println("HRA="+ this.getAll().getHra());
		System.out.println("TA"+ this.getAll().getTa());
		this.total_salary = this.getAll().getTa()+ this.getAll().getHra() + this.getSalary();
		System.out.println("Total Salary="+ this.total_salary);
	}

}
