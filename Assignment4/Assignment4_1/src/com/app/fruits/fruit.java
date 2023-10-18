package com.app.fruits;

import java.util.Scanner;

public class fruit {
String color;
double weight;
String name;
boolean isFresh;


public fruit() {
	super();
	// TODO Auto-generated constructor stub
}
public fruit( String name, boolean isFresh) {
	this.name = name;
	this.isFresh = isFresh;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isFresh() {
	return isFresh;
}
public void setFresh(boolean isFresh) {
	this.isFresh = isFresh;
}


@Override
public String toString() {
	return "fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
}
public void accept() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter name of fruit=");
this.color=sc.next();
System.out.println("Enter weight of fruit=");
this.weight=sc.nextDouble();

}
public  void display() {
	System.out.println(" Fruit color="+color);
	System.out.println("weight of fruit="+weight);
	System.out.println("name of fruit="+name);
	System.out.println("is fresh ="+isFresh);
}
public String FruitTaste() {
	// TODO Auto-generated method stub
	return null;
}




}
