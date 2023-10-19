package com.sunbeam;

import java.util.*;

public class test {

	public static void main (String[] args)
	{
		Set<Book>set=new TreeSet<>();
		
		set.add(new Book("2B",10.20,"Arnav",2));
		set.add(new Book("1A",20.20,"John",4));
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

