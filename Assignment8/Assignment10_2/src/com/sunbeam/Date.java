package com.sunbeam;

import java.util.Scanner;

public class Date implements displayable{
	int day;
	int month;
	int year;
	
	
	public Date() {
		
	}


	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	


	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}


	@Override
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day=");
	    this.day=sc.nextInt();
	    System.out.println("Enter month=");
	    this.month=sc.nextInt();
	    System.out.println("Enter year=");
	    this.year=sc.nextInt();
	}

	@Override
	public void display() {
		System.out.println("date="+day+"/"+month+"/"+year);
		
	}


	

}
