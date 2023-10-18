package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringLength {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Gauri");
		list.add("Anisha");
		list.add("Swaroopa");
		list.add("Tina");
		list.add("Rahul");
		
		class stringComparator implements Comparator<String>{

			@Override
			public int compare(String S1, String S2) {
				int diff=S1.length()-S2.length();
				return diff;
			}
		
		}
		stringComparator comparator=new stringComparator();
		Collections.max(list);
		System.out.println("String with highest length:"+Collections.max(list,comparator));

}
}