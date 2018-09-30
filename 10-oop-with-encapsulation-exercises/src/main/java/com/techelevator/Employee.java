package com.techelevator;

public class Employee {
	
	private int employeeId; //no set, get
    private String firstName; //no set, get
    private String lastName;  //needs set and get
    private String fullName; //no set, get
    private String department; //needs set and get
    private double annualSalary; //no set, get
	
	
	//Constructor
	
	public Employee(int employeeId, String firstName, String lastName, double salary) {
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.annualSalary = salary;
	}
	
	
	// Method
	

	public void raiseSalary(double percent) {
		 this.annualSalary = (this.annualSalary * percent/100) + this.annualSalary;
		  
	 }
	public String fullName() {
		return this.lastName + ", " + this.firstName;
	}
	
	 public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public String getFirstName() {
		return firstName;
	}



	public String getFullName() {
		return this.fullName();
	}


	public double getAnnualSalary() {
		return annualSalary;
	}


	 
	 

}
