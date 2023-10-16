package com.sunbeam;

import java.util.Scanner;

public  class person implements displayable{
	String name;
	int age;
	
	
	public person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	
	public person() {
		
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
@Override
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name=");
	    this.name=sc.next();
	    System.out.println("Enter age=");
	    this.age=sc.nextInt();

     }
	
	@Override
	public void display() {
		System.out.println("name="+name);
		
		System.out.println("age="+age);

	}
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	
	

}
