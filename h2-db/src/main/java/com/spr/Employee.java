package com.spr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "Employee")
	public class Employee {
		@Id
		@Column(name="empid")
		private int empid;
		
		@Column(name="ename")
		private String ename;
		
		@Column(name="job")
		private String job;
		
		
		@Column(name="salary")
		private int salary;
		

		public Employee() {
			
		}

         
		public Employee(int empid, String ename, String job, int salary) {
			this.empid = empid;
			this.ename = ename;
			this.job = job;
			this.salary = salary;
		}


		public int getEmpid() {
			return empid;
		}


		public void setEmpid(int empid) {
			this.empid = empid;
		}


		public String getEname() {
			return ename;
		}


		public void setEname(String ename) {
			this.ename = ename;
		}


		public String getJob() {
			return job;
		}


		public void setJob(String job) {
			this.job = job;
		}


		public int getSalary() {
			return salary;
		}


		public void setSalary(int salary) {
			this.salary = salary;
		}

		
		
		

}

