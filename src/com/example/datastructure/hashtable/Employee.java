package com.example.datastructure.hashtable;

public class Employee {

	String firstName;
	String lastName;

	public Employee(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String toString() {
		return this.firstName + " : " + this.lastName;
	}

}
