package com.sunbeam;

import java.util.Random;
import java.util.stream.Stream;

public class Addition {

	public static void main(String[] args) {
		Random r=new Random();
		Stream <Integer>strm1=Stream.generate(()->r.nextInt(100)).limit(10);
		int result=strm1.reduce(0, (a,e)->a+e);
		System.out.println(result);
		
	}

}
