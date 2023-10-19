package com.sunbeam;
/*1. Store few books (hardcoded values with the Book class in previous assignment) in a HashSet and display them using iterator. If any book with duplicate
isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.
 * 
 * if any book with duplicate isbn added then it will prints duplicate also.
 * 
 * books are stored in random order.
 * 
 * for sorting we will use hashcode method.
 * To solve duplicate isbn use euals() method.
 * 
 * 
 */


	import java.util.*;
	import java.util.Objects;
	import java.util.Scanner;

	public class Book {
		private String isbn;
		private double price;
		private String authorname;
		private int quantity;
		public Book() {
			
		}
		public Book(String isbn, double price, String authorname, int quantity) {
			
			this.isbn = isbn;
			this.price = price;
			this.authorname = authorname;
			this.quantity = quantity;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getAuthorname() {
			return authorname;
		}
		public void setAuthorname(String authorname) {
			this.authorname = authorname;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public int hashCode() {
			int hash=Objects.hash(this.isbn);
			return hash;
			
		}
		public boolean equals(Object obj) {
			if(obj==null)
				return false;
			if(this==obj)
				return false;
			if(obj instanceof Book) {
				Book other=(Book)obj;
				if(this.isbn==other.isbn)
			   return true;
			}
			return false;
			
		}

		
		
		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", price=" + price + ", authorname=" + authorname + ", quantity=" + quantity
					+ "]";
		}
		
		public static void main (String[] args)
		{
			Set<Book>set=new HashSet<>();
			
			set.add(new Book("2B",10.20,"Arnav",2));
			set.add(new Book("1",20.20,"John",4));
			set.add(new Book("3C",30.20,"Arnav",6));
			set.add(new Book("4D",40.20,"shyam",5));
			set.add(new Book("2B",50.20,"P.L.deshpande",8));
			
			Iterator<Book>itr=set.iterator();
			while(itr.hasNext()) {
				Book e=itr.next();
				System.out.println(e+",");
			}
			
		}

	}




