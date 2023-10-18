package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	int Empid;
	String Fname;
	String Lname;
	double Monthlysalary;
	

	

	public Employee() {
		
	}
	

	public Employee(int empid, String fname, String lname, double monthlysalary) {
		super();
		Empid = empid;
		Fname = fname;
		Lname = lname;
		Monthlysalary = monthlysalary;
	}


	public int getEmpid() {
		return Empid;
	}


	public void setEmpid(int empid) {
		Empid = empid;
	}


	public String getFname() {
		return Fname;
	}


	public void setFname(String fname) {
		Fname = fname;
	}


	public String getLname() {
		return Lname;
	}


	public void setLname(String lname) {
		Lname = lname;
	}


	public double getMonthlysalary() {
		return Monthlysalary;
	}


	public void setMonthlysalary(double monthlysalary) {
		Monthlysalary = monthlysalary;
	}
	


	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Fname=" + Fname + ", Lname=" + Lname + ", Monthlysalary=" + Monthlysalary
				+ "]";
	}


	void acceptEmployee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id= ");
	    this.Empid=sc.nextInt();
	    System.out.println("Enter First name= ");
	    this.Fname=sc.next();
	    System.out.println("Enter last name= ");
	    this.Lname=sc.next();
	    System.out.println("Enter monthly Salary= ");
	    this.Monthlysalary=sc.nextDouble();
	
	}

	void displayEmployee()

	{
		System.out.println("Empid="+Empid+","+"First name="+Fname+","+"Last name="+Lname+","+"Salary="+Monthlysalary);
	}


	@Override
	public int hashCode() {
		return Objects.hash(Empid);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Empid == other.Empid;
	}


}
