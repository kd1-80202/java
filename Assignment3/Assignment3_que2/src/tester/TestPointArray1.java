package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of points to plote: ");
		Point2D[] point=new Point2D[sc.nextInt()];
		
		for(int i=0;i<point.length;i++)
		{
			point[i]=new Point2D();
		}
		
		for(int i=0;i<point.length;i++)
		{
			point[i].accept();
		}
		
		
		int choice;
		do
		{
			System.out.println("****************************");
			System.out.println("1.Display details of specific points");
			System.out.println("2.Display detail of all point");
			System.out.println("3.Dispaly distance of two pints");
			System.out.println("4.Exit");
			System.out.println("Enter your choice= ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: int c; 
				System.out.println("Enter index to view details of specific points: ");
				c=sc.nextInt();
				point[c].display();
				break;
			
			case 2:
				System.out.println("*****All points******");
				for(int i=0;i<point.length;i++)
				{
					point[i].display();
					
				}
				break;
				
		    case 3:
				System.out.println("Enter two indexes to find difference between two points");
			    int a=sc.nextInt();
			    int b=sc.nextInt();
			    if(a<point.length && b<point.length)
			    {
			    if(point[a].isEqual(point[b]))
			    {
			    	
			    	System.out.println("Both the points at same position");
			    	
			    }
			    else
			    {
			    	point[a].calculateDistance(point[b]);
			    		
			    }
			    }
			    else
			    {
			    	System.out.println("Invalid Indexes");
			    }
			    break;
			}
		}while(choice!=0);

	}

}



