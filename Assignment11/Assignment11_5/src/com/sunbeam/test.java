package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
   Map<String,Book>map=new HashMap<>();
   int choice;
   
   
   do {
	   System.out.println("0.Exit");
	   System.out.println("1.Accept Book");
	   System.out.println("2.Retrive book using isbn code");
	   System.out.println("Enter your choice");
	   Scanner sc=new Scanner(System.in);
	   choice=sc.nextInt();
	 
	   
	   switch (choice) {
	case 1:
		Book b1=new Book();
	    b1.accept();
	    map.put(b1.getIsbn(),b1);
	    System.out.println("Book added sucessfully");
		
		break;
     case 2:
    	 System.out.println("Enter isbn to search book");
    	 String isbn=sc.next();
    	 Book b=map.get(isbn);
    	 if(b!=null)
    	 {
    		 System.out.println("Book is present"+b.toString());
    		 
    	 }
    	 else
    		 System.out.println("Invalid isbn");
    	    
    		 
		
		break;

	default:
		System.out.println("Invalid index");
		break;
	}
   
	}while(choice!=0);
	}

}
