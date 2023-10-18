package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class test {

	public static void main(String[] args) {
		Student[]arr=new Student[5];
    
    arr[0]=new Student(1,"Anjali","karad",95);
    arr[1]=new Student(2,"Akansha","satara",98);
    arr[2]=new Student(3,"Raj","satara",97);
    arr[3]=new Student(4,"Manisha","solapur",98);
    arr[4]=new Student(5,"Vighnesh","sangli",92);
    
    System.out.println("Before sort: ");
    for(Student s:arr)
    	System.out.println(s);
    
    class customcomparator implements Comparator<Student>{
 
		@Override
		public int compare(Student s1, Student s2) {
			int diff=-(s1.getCity().compareTo(s2.getCity()));
	    if(diff==0)
	    	diff=-(Double.compare(s1.getMarks(),s2.getMarks()));
	    if(diff==0)
	    	diff= s1.getName().compareTo(s2.getName());
	   return diff;

	}
    }
    customcomparator comparator=new customcomparator();
    Arrays.sort(arr,comparator);
    System.out.println("After sort: ");
    for(Student s:arr)
    System.out.println(s);
    
   
}
}


