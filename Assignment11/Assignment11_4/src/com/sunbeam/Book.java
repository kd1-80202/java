package com.sunbeam;


import java.util.*;
import java.util.Objects;
import java.util.Scanner;
/*4. Use TreeSet to store all books in descending order of price. Natural ordering for the Book should be isbn (do not change it). Display them using iterator()
and descendingIterator().

*/

public  class Book{
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
   
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorname=" + authorname + ", quantity=" + quantity
				+ "]";
	}

}
	
	










