package com.sunbeam;


import java.util.*;
import java.util.Objects;
import java.util.Scanner;
/*3. In above assignment use TreeSet instead of LinkedHashSet. Use natural ordering for the Book. If any book with duplicate isbn is added, what will happen?
Books are stored in which order?
*Duplicate values are not taken by TreeSet.
*Books are sorted in ascending order.
*/

public class Book implements Comparable<Book>{
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
   public int compareTo(Book other)
   {
	   
	   int diff= this.isbn.compareTo( other.isbn);
	return diff;
	   
   }
	
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorname=" + authorname + ", quantity=" + quantity
				+ "]";
	}

}
	
	








