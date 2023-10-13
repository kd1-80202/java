package com.sunbeam;

import java.util.Scanner;

public class stringLength {

	private String  s;

	public void length() throws ExceptionLineTooLong
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string length= ");
		this.s=sc.next();
		if(s.length()>80)
		{
			throw new ExceptionLineTooLong();
			
		}
		
}

	@Override
	public String toString() {
		return "stringLength [s=" + s + "]";
	}
	
}
