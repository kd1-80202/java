package com.subeam;

import java.util.Scanner;


public class Commision_Employee  extends Employee{
 int grossSales;
 int commisionRate;
public Commision_Employee() {
	super();
	
}
public Commision_Employee(String firstname, String lastname, String SSN, int grossSales, int commisionRate) {
	super(firstname, lastname, SSN);
	this.grossSales = grossSales;
	this.commisionRate = commisionRate;
}
public int getGrossSales() {
	return grossSales;
}
public void setGrossSales(int grossSales) {
	this.grossSales = grossSales;
}
public int getCommisionRate() {
	return commisionRate;
}
public void setCommisionRate(int commisionRate) {
	this.commisionRate = commisionRate;
}
@Override
public String toString() {
	return "Commision_Employee [grossSales=" + grossSales + ", commisionRate=" + commisionRate + ", firstname="
			+ firstname + ", lastname=" + lastname + ", SSN=" + SSN + "]";
}

@Override
	public void accept() {
	   Scanner sc=new Scanner(System.in);
	   super.accept();
	   System.out.println("Enter gross sales=");
	   this.grossSales=sc.nextInt();
	   System.out.println("Enter commision Rate=");
	   this.commisionRate=sc.nextInt();
		
	}
@Override
	public void display() {
	     super.display();
		System.out.println("gross sales="+grossSales);
		System.out.println("commision Rate="+commisionRate);
		
	}

@Override
public double calculatesalary() {
	return commisionRate+grossSales*0.1+commisionRate+grossSales;
	
}
 

}