package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;


import com.sunbeam.Book;

public class teat {

	public static void main(String[] args) {
	

		List<Book> list = new ArrayList<>();
		ListIterator<Book>itr=list.listIterator();
		int choice;
		
		
		do {
			
			System.out.println("0.Exit");
			System.out.println("1.Add new book in list. ");
			System.out.println("2. Display all books in forward order using random access");
			System.out.println("3. Search a book with given isbn (hint - indexOf())");
			System.out.println("4. Delete a book at given index.");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6. Reverse the list ");
			System.out.println("7. Save books in file");
			System.out.println("8. Load books from file");
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
		   if(list.contains(b1)) {
			 System.out.println("book is not present");
			int index=list.indexOf(b1);
			b1= list.get(index);
			b1.setQuantity(b1.getQuantity()+1);
			

		   }
		   else
		   {
			   list.add(b1);
			   System.out.println("book is  added to the list");
		   }
			
			
			break;
			
        case 2:
        	System.out.println("Forward dispaly:");
            itr=list.listIterator();
            while(itr.hasNext()) {
            	b1=itr.next();
            	System.out.println(b1);
            }
        	
			break;
        
       case 3: 
		       Book b2=new Book();
		    	System.out.println("Enter isbn of of book to be search:");   
		       Book key=new Book();
			   String isbn=sc.next();
			   key.setIsbn(isbn);
			    int index=list.indexOf(key);
			    if(index==-1)
		
				     System.out.println("  Not Found");
				   else
				   {
					  System.out.println("Found");  
		            b1=list.get(index);
		            System.out.println(b2);
				}
       break;
    	   
       case 4:
	    	  System.out.println("Enter index at which element to be deleted=");
		      int index1=sc.nextInt();
		       list.remove(index1);
		       
       break;
    	  
       case 5:
	    		System.out.println("Enter isbn of of book to be deleted:");   
			       Book key1=new Book();
		    	   String isbn1=sc.next();
		    	   key1.setIsbn(isbn1);
		    	   if(list.remove(key1)) {
		              System.out.println(" Book is removed");
		    	    }
		    		   else
		    		   
		    			System.out.println("book is not found"); 
			           
				
	     break;
      case 6:
	    	  Collections.reverse(list);
	    	  System.out.println("Reverse list:"+list);
		   
	     
	    break;
	 
     
	  
	  case 7:
		  try(FileOutputStream fout=new FileOutputStream("Books.bin")){
			  try(DataOutputStream dout=new DataOutputStream(fout)){
				  for (Book b : list) {
					  dout.writeUTF(b.getIsbn());
					  dout.writeDouble(b.getPrice());
					  dout.writeUTF(b.getAuthorname());
					  dout.writeInt(b.getQuantity());
				  }
					
				}//dout.close();
			  }//fout.close();
			  catch(Exception e) {
				  e.printStackTrace();
			  }
			  System.out.println("Books saved");
			  
		
			      
		    break;
		   
		   
	 case 8:
		 
		 try(FileInputStream fin=new FileInputStream("Books.bin")){
			try(DataInputStream din=new DataInputStream(fin)){
				while(true) {
					Book b=new Book();
					b.setIsbn(din.readUTF());
					b.setPrice(din.readDouble());
					b.setAuthorname(din.readUTF());
					b.setQuantity(din.readInt());
					
					System.out.println(b);
					 break;
				}
				
			}
			 
			 
		 }
		 
		  catch (EOFException e)
		 {
			  
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }     
			   
			    
		}
		
		}while(choice!=0);
			
	}

}

	



