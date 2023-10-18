package com.sunbeam;

public class Array {

	static < T extends Number>T findMin(T[] arr){
		T min=arr[0];
		
		for(T ele:arr){
			if(ele.doubleValue()<min.doubleValue())
			{
				min=ele;
			}
		}
		
		
		return min;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Integer[] arr1= {11,22,33,2,55};
		Integer min1=findMin(arr1);
		System.out.println("min value of array="+min1);
		Double[] arr2= {11.2,34.4,35.5,76.7};
		Double min2=findMin(arr2);
		System.out.println("min value of double array="+min2);
	
	}
}