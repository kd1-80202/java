package com.sunbeam;

import java.util.*;

import com.sunbeam.Book;

public class test {

	public static void main(String[] args) {
		
		List<Book> list = new ArrayList<>();
		
		int choice;
		
		
		do {
			
			System.out.println("0.Exit");
			System.out.println("1.Add new book in list. ");
			System.out.println("2. Display all books in forward order.");
			System.out.println("3. Delete at book given index -- list.remove(index);");
			System.out.println("4. Check if book with given isbn is in list or not");
			System.out.println("5. Delete all books in list");
			System.out.println("6. Display number of books in list");
			System.out.println("Enter your choice=");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			
			
		
		switch (choice) {
		case 0:
			System.out.println("Thank you");
			break;
		
		case 1:
		 Book b1=new Book();
		   b1.accept();
		   list.add(b1);
			
			break;
			
        case 2:
        	System.out.println("----------");
        	for(Book bk : list)
        	{
        		System.out.println(bk); 
        	}
			break;
        
       case 3:
    	   System.out.println("Enter index at which element to be deleted=");
    	   int index=sc.nextInt();
    	   list.remove(index);
	       break;
       case 4:
    	   Book key=new Book();
    	   String isbn=sc.next();
    	   key.setIsbn(isbn);
    	   if(list.contains(key))
   
    		     System.out.println("Found");
    		   else
    			  System.out.println("Not Found");  
	
	       break;
       case 5:
    	   list.clear();
    	   System.out.println(list);
	 
	     break;
      case 6:
	     System.out.println("Size:"+list.size());
	     
	    break;
      case 7:
    	  class BookPriceComparator implements Comparator<Book>{

			@Override
			public int compare(Book b1, Book b2) {
				int diff=-Double.compare(b1.getPrice(),b2.getPrice());
				return diff;
			
			}
    	  }  
    	  BookPriceComparator comparator =new BookPriceComparator();
    	  list.sort(comparator);
    	  break;

		}
	
		
		}while(choice!=0);
			
	}
}
		
