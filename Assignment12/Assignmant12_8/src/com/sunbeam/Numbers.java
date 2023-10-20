package com.sunbeam;

import java.util.stream.IntStream;

public class Numbers {

	public static void main(String[] args) {
	IntStream strm=IntStream.range(1,10);
	int total=strm.sum();
	System.out.println(total);
	IntStream strm2=IntStream.range(1, 10);
	System.out.println(strm2.summaryStatistics());
	
	

	}

}
