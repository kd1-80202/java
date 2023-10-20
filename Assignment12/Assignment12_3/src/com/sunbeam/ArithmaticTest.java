package com.sunbeam;

import java.util.Scanner;

public class ArithmaticTest {
	static void calculate (double num1,double num2,Arithmatic op)
	{
		double result=op.calc(num1,num2);
		System.out.println("Result="+result);
	}


	public static void main(String[] args)
	{
     int choice;
     double num1,num2;
     do 
     {
    	 
    	 System.out.println("1.Addition");
    	 System.out.println("2.Subtraction");
    	 System.out.println("3.Multiplication");
    	 System.out.println("4.Division");
    	 System.out.println("Enter your choice");
    	 Scanner sc=new Scanner (System.in);
    	 choice=sc.nextInt();

     switch (choice)
     {
	case 1:
		num1=sc.nextDouble();
	    num2=sc.nextDouble();
	    calculate(num1,num2,(x,y)->x+y);
	    break;
		
    case 2:
    	num1=sc.nextDouble();
	    num2=sc.nextDouble();
	    calculate(num1,num2,(x,y)->x-y);
		break;
		
    case 3:
    	num1=sc.nextDouble();
	    num2=sc.nextDouble();
	    calculate(num1,num2,(x,y)->x*y);
	    break;
	    
    case 4:
    	num1=sc.nextDouble();
	    num2=sc.nextDouble();
	    calculate(num1,num2,(x,y)->x/y);
	    break;

	default:
		break;
	}
     

	}while(choice!=0);

}
}
