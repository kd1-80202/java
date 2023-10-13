package com.sunbeam;

import java.util.Scanner;



public class Hourly_Employee extends Employee{
	double hourlyWage;
	double hours;
    double hourlySalary;
	
	public Hourly_Employee() {
		super();
		
	}
	public Hourly_Employee(String firstname, String lastname, String SSN, double hourlyWage, double hours) {
		super(firstname, lastname, SSN);
		this.hourlyWage = hourlyWage;
		this.hours = hours;
	}
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	@Override
	public void accept() {
		Scanner sc=new Scanner(System.in);
		super.accept();
		System.out.println("Enter hourly Wage=");
		this.hourlyWage=sc.nextDouble();
		System.out.println("Enter hours worked=");
		this.hours=sc.nextDouble();
		
	}
	
	@Override
	public void display() {
		super.display();
	    System.out.println("hourly wage="+hourlyWage);
	    System.out.println("hours worked="+hours);
		
	}
	
	@Override
	public String toString() {
		return "Hourly_Employee [hourlyWage=" + hourlyWage + ", hours=" + hours + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", SSN=" + SSN + "]";
	}
	@Override
	public void calculatesalary() {

		  if(this.hours<=40)
			  System.out.println("calculate salary= "+this.hourlyWage*this.hours);
			  else if(this.hours>40)
			  {
			   System.out.println("calculate salary="+(40*this.hourlyWage)+(this.hours-40)*this.hourlyWage*1.5); 
			  }
		
	}

}
