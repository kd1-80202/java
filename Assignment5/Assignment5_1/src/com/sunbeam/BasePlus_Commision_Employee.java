package com.sunbeam;

import java.util.Scanner;

public class BasePlus_Commision_Employee extends Commision_Employee{
	double baseSalary;

	public BasePlus_Commision_Employee() {
		super();
		
	}

	public BasePlus_Commision_Employee(String firstname, String lastname, String SSN, int grossSales, int commisionRate,
			double baseSalary) {
		super(firstname, lastname, SSN, grossSales, commisionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	
	@Override
	public void accept() {
		Scanner sc=new Scanner(System.in);
		super.accept();
		System.out.println("Enter base salary=");
		this.baseSalary=sc.nextDouble();
		
	}
	@Override
	public void display() {
		super.display();
		System.out.println("base salary="+baseSalary);
		
	}
	@Override
	public String toString() {
		return "BasePlus_Commision_Employee [baseSalary=" + baseSalary + ", C=" + grossSales
				+ ", commisionRate=" + commisionRate + ", firstname=" + firstname + ", lastname=" + lastname + ", SSN="
				+ SSN + "]";
	}

@Override
public void calculatesalary() {
	System.out.println("calculate salary="+(commisionRate+commisionRate)+baseSalary);
	super.calculatesalary();
}
	
	
	
	
	

}
