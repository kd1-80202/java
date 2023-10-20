package com.sunbeam;

public class Elements {
	
		
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
			Double [] arr= {4.4,5.5,9.9,2.2,5.5,6.6};
			Double key=5.5;
			int count=CountIf(arr,key,(e,k)->e.equals(k));
			System.out.println("count="+count);

		}


		
	}



