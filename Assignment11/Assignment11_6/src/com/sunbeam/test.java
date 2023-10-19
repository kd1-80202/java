package com.sunbeam;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class test {

		public static void main(String[] args) {
			
			
	   Map<Integer,Student>map=new LinkedHashMap<>();
	   int choice;
	   
	   
	   do {
		   System.out.println("0.Exit");
		   System.out.println("1.Add Student");
		   System.out.println("2.Search student using  rollno");
		   System.out.println("Enter your choice");
		   Scanner sc=new Scanner(System.in);
		   choice=sc.nextInt();
		 
		   
		   switch (choice) {
		case 1:
			Student b1=new Student();
		    b1.accept();
		    map.put(b1.getRoll(), b1);
		    System.out.println("Student added sucessfully");
			
			break;
	     case 2:
	    	 System.out.println("Enter rollno to search Student");
	    	  int roll=sc.nextInt();
	    	  Student s=map.get(roll);
	    	 if(s!=null)
	    	 {
	    		 System.out.println("Student is present    " + s.toString());
	    		 
	    	 }
	    	 else
	    		 System.out.println("Invalid roll");
	    	    
	    		 
			
			break;

		default:
			System.out.println("Invalid index");
			break;
		}
	   
		}while(choice!=0);
		}


	}


