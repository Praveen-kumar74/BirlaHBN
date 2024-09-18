package com.birla.entity;

public class Employeey {

	private int empid;
	private String name;
	private String gender;
	private int salary;
	
	
	
	
	
	public Employeey() {
		super();
			}

	public Employeey(int empid, String name, String gender, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
 int getSalary() {
		return salary;
	}
		public void setSalary(int salary) {
		this.salary = salary;
	}

		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
		}

	
	
}
