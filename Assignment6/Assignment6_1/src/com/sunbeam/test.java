package com.sunbeam;

public class test {

	public static void main(String[] args) 
	{
		stringLength s1= new stringLength();
		
		try 
		{
			s1.length();
		}
		catch(ExceptionLineTooLong e)
		{
			e.printStackTrace();
		
		}
		
		System.out.println(s1);
   
	}
}


