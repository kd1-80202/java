package com.app.geometry;

public class test {
	
	public static void main (String[]args) {
   circle c1=new circle();
   try
   {
	   c1.accept();
	   
   }
   catch(ExceptionNegativeDiameter e) 
   {
	  e.printStackTrace(); 
   }
System.out.println(c1);
}
}
