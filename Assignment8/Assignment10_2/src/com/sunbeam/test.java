package com.sunbeam;

class Box<T>
{
	private T obj;

	public T get() {
		return obj;
	}

	public void set(T obj) {
		this.obj = obj;
	}
		
}



public class test {
	
	public static  void printDisplayableBox(Box<?extends displayable>b) {
	b.get().display();
	}
	public static void printBox(Box<?>b) {
	System.out.println(b.get().toString());	
	}
	

	public static void main(String[] args) {
	Box<person>b1=new Box< >();
	b1.set(new person("Gauri",20));
	printDisplayableBox(b1);
	
	Box<Date>b2=new Box< >();
	b2.set(new Date(1,2,2023));
	printBox(b2);
	
	

	}

}
