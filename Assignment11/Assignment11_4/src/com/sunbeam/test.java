package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



	public class test {

		public static void main (String[] args)
		{
			
			
			class PriceComparator implements Comparator<Book>
			{
			

			@Override
			public int compare(Book b1, Book b2) {
				int diff=Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
				
			}
			}
			PriceComparator price=new  PriceComparator();
            TreeSet<Book>set=new TreeSet<>(price);
			
			set.add(new Book("2B",10.20,"Arnav",2));
			set.add(new Book("1A",20.20,"John",4));
			set.add(new Book("3C",30.20,"Arnav",6));
			set.add(new Book("4D",40.20,"shyam",5));
			set.add(new Book("2B",50.20,"P.L.deshpande",8));
			
            Iterator<Book>itr=set.iterator();
            while(itr.hasNext()) {
            	Book b=itr.next();
            	System.out.println(b+",");
         	
            }
            
            System.out.println("Iterate in descending order:");
            Iterator<Book>itr1=set.descendingIterator();	
            while(itr1.hasNext())
            {
            	Book b1=itr1.next();
            			System.out.println(b1);
            }
            System.out.println();
            
            
            
			
		}
	}


