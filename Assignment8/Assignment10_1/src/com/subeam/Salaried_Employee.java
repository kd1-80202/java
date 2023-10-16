package com.subeam;



import java.util.Scanner;

public class Salaried_Employee extends Employee
{
double weeklySalary;




public Salaried_Employee() {
	super();

}


public Salaried_Employee(String firstname, String lastname, String SSN, double weeklySalary) {
	super(firstname, lastname, SSN);
	this.weeklySalary = weeklySalary;
}


public double getWeeklySalary() {
	return weeklySalary;
}


public void setWeeklySalary(double weeklySalary) {
	this.weeklySalary = weeklySalary;
}

@Override
	public void accept() {
		Scanner sc=new Scanner(System.in);
		super.accept();
		System.out.println("Enter weeklySalary=");
		this.weeklySalary=sc.nextDouble();
		
	}
@Override
	public void display() {
	    super.display();
		System.out.println("weeklySalary="+weeklySalary);
		
	}


@Override
public String toString() {
	return "Salaried_Employee [weeklySalary=" + weeklySalary + ", firstname=" + firstname + ", lastname=" + lastname
			+ ", SSN=" + SSN + "]";
}


@Override
public double calculatesalary() {
	System.out.println("weekly Salary="+(weeklySalary+(0.1*weeklySalary)));
	return this.weeklySalary;
	
}


}
