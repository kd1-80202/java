package com.sunbeam;
import java.util.*;
import java.util.Objects;
import java.util.Scanner;




/*Store Books in HashMap<> so that for given isbn, book can be searched in fastest possible time. Do we need to write equals() and hashCode() in Book
class?

equals and hashmap are not required.
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
	
   
   public 	void accept(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter isbn=");
		this.isbn=sc.next();
		System.out.println("Enter price=");
		this.price=sc.nextDouble();
		System.out.println("Enter authorname=");
		this.authorname=sc.next();
		System.out.println("Enter quantity=");
		this.quantity=sc.nextInt();
	
	}
	
	public void display() {
		System.out.println("Enter isbn="+isbn);
		System.out.println("Enter price="+price);
		System.out.println("Enter authorname="+authorname);
		System.out.println("Enter quantity="+quantity);

	}
	
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorname=" + authorname + ", quantity=" + quantity
				+ "]";
	}
	@Override
	public int compareTo(Book other)
	   {
		   
		   int diff= this.isbn.compareTo( other.isbn);
		return diff;
		   
	   }

}
	
	












