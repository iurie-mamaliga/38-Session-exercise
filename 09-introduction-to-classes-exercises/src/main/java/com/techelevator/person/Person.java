package com.techelevator.person;

public class Person {

	String firstName;
	String lastName;
	int age;
	
	
	// Method
	
	public String getFullName() {
		return (lastName + "," + " " + firstName);
	}
	public boolean isAdult() {
		if (this.age>=18) {
		return true;
	} else {
		return false;
	}
	}
	
		
		
	
	
public Person() {
		
	}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

	
}
