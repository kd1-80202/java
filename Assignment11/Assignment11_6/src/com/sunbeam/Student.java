package com.sunbeam;
/*Store Students in LinkedHashMap<> so that, for given roll, Student can be searched in fastest possible time. Do we need to write equals() and
hashCode() in Student class? Follow menu-driven approach.

no equals and hashcode not required.
*/

import java.util.Scanner;

public class Student {

	private int roll;
	private String name;
	private String city;
	private double marks;
	public Student() {
		
	}
	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	 public void accept(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter roll=");
			this.roll=sc.nextInt();
			System.out.println("Enter name=");
			this.name=sc.next();
			System.out.println("Enter city=");
			this.city=sc.next();
			System.out.println("Enter quantity=");
			this.marks=sc.nextDouble();
		
		}
		
		public void display() {
			System.out.println("Enter roll="+roll);
			System.out.println("Enter name="+name);
			System.out.println("Enter city="+city);
			System.out.println("Enter marks="+marks);

		}
		
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}




	}


