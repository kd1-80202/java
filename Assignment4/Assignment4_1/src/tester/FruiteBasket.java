package tester;

import java.util.Scanner;


import com.app.fruits.*;


public class FruiteBasket 
{

	public static void main(String[] args)
	{
	int choice;
	int counter=0;
	int Basket_Size;
	System.out.println("Enter basket size=");
	Scanner sc=new Scanner(System.in);
	Basket_Size=sc.nextInt();
	fruit Basket[]=new fruit[Basket_Size];
	
		do
		{
		
		
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits in the basket.");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale (optional)");
		System.out.println("Enter your choice= ");
		choice=sc.nextInt();
		
		switch (choice) 
		{
		case 1:if(counter<Basket_Size)
		{
			Basket[counter]=new Mango();
			Basket[counter].accept();
			Basket[counter].display();
			counter++;
			
		}
			break;
       case 2:
			if(counter<Basket_Size)
			{
				Basket[counter]=new Orange();
				Basket[counter].accept();
				Basket[counter].display();
				counter++;
			}
			
			break;
        case 3:
        	if(counter<Basket_Size)
        	{
        		Basket[counter]=new Apple();
        		Basket[counter].accept();
        		Basket[counter].display();
        	}
			
			break;
        case 4:
        	System.out.println("*******Names of all fruits*********");
        	 for(int i=0;i< Basket_Size;i++)
        	 {
        	    System.out.println(Basket[i].getName());
        	 }
	        break;
        case 5:for (fruit f:Basket)
        	if(f!=null)
        	{
        		System.out.println("Fruits:"+f);
        	    System.out.println("Taste of fruit:"+f.FruitTaste());
        	    System.out.println("is fruit Fresh="+f.isFresh());
        	}
	
	        break;
        case 6:
        	for(fruit f : Basket)
			{
		    if(f.isFresh() == false )
		    	{
		    		System.out.println("Taste of stale fruit is "+f.FruitTaste());
		    	}
			}
		    System.out.println("No stale fruit present in the basket");
		  break;
        case 7:int index;
		 System.out.println("Which fruit do you want to mark as stale?");
		 index = sc.nextInt();
		 if(index < counter)
		 {	
			Basket[index].setFresh(false);				
		 }
		 break;
        case 8:for(int i=0;i<counter;i++)
		{
			if(Basket[i].FruitTaste()=="sour")
				Basket[i].setFresh(false);
		}
//		for(Fruit f : basket)
//			{			
//			if(f.taste() == "Sour")
//				{
//					f.setFresh(false);
//				}
//			}

	       break;
		default:System.out.println("Wrong choice!!!!");
			break;
		}
		
		}while(choice!=0);
	}
}