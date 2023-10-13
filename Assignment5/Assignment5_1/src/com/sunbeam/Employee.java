package com.sunbeam;

import java.util.Scanner;


public abstract class Employee {
	String firstname;
	String lastname;
	String SSN;
	
	abstract public void calculatesalary();

	public Employee(String firstname, String lastname, String SSN) {
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.SSN = SSN;
	}
	public Employee() {
		
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String SSN) {
		this.SSN = SSN;
	}
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First name= ");
		this.firstname=sc.next();
		System.out.println("Enter Last name= ");
		this.lastname=sc.next();
		System.out.println("Enter Social security no= ");
         this.SSN=sc.next();
	}
	public void display() {
		System.out.println("Firstname="+firstname);
		System.out.println("Lastname="+lastname);
		System.out.println("Social security no="+SSN);

	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", SSN=" + SSN + "]";
	}
	

}
