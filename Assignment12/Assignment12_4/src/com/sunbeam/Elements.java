package com.sunbeam;

public class Elements 
{
	
	public static <T> int CountIf(T[] arr,T key,Check<T>c) {
		int count=0;
		for(T ele:arr)
		{
	     if(c.compare(ele,key))
			count++;
				
		}
		return count;
		
	}
	

	public static void main(String[] args) {
		Integer [] arr= {44,55,99,22,55,66};
		Integer key=55;
		int count=CountIf(arr,key,(x,y)->x>y);
		System.out.println("count="+count);

	}


	
}
