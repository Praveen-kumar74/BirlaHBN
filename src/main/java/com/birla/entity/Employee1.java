package com.birla.entity;

public class Employee1 {

	 private int empId;
	 private String name;
	 private String gender;
	 private int salary;
	 
		public Employee1() {
			super();
		
		}

		public Employee1(int empId, String name, String gender, int salary) {
			super();
			this.empId = empId;
			this.name = name;
			this.gender = gender;
			this.salary = salary;
		
		}
	 
		public int getEmpId() {
		return empId;
	}
	
		public void setEmpId(int empId) {
		this.empId = empId;
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
		public int getSalary() {
		return salary;
	}
	
		public void setSalary(int salary) {
			this.salary = salary;
		}
	@Override
		public String toString() {
			return "Employee1 [empId=" + empId + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
		}

	
	
	
	


	 
	 
}