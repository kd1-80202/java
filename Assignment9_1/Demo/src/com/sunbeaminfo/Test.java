package com.sunbeaminfo;

import java.util.Comparator;

public class Test {
	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
		}
		}

	public static void main(String[] args) {
		
		class arrayComparator implements Comparator<Double> {

			@Override
			public int compare(Double d1, Double d2) {
				if(d1>d2)
					return 1;
				return 0;
			}
			
		}
		
		arrayComparator c1 = new arrayComparator();
		double[] arr2= {11.2,33.4,45.4,55.6};
		System.out.println("Before sort=");
		
		for (double d : arr2) {
			System.out.println(d);
		}
		
		System.out.println("After sort=");
		selectionSort(arr2, c1);
		
		for(double a:arr2) {
			System.out.println(a);
	
	}

}
