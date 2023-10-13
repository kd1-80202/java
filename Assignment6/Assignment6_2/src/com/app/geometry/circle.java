package com.app.geometry;

import java.util.Scanner;

public class circle {
	private int Point2D;
	private int diameter;
	public circle() {
		
		Point2D point=new Point2D(0,0);
	    this.diameter=100;
	}
	@Override
	public String toString() {
		return "circle [Point2D=" + Point2D + ", diameter=" + diameter + "]";
	}
	
	
	public void accept() throws ExceptionNegativeDiameter {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dimeter= ");
		this.diameter=sc.nextInt();
		if(diameter<0)
		{
			throw new ExceptionNegativeDiameter("Diameter", diameter,"Diameter should be non negative");
		}
		
	}
	
}
