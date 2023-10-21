package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;

public class Read {

	public static void main(String[] args) {
		try (FileReader fr=new FileReader("/home/gauri/java/self Assignment/java/Assignment13/Assignment12_3/Write.bin")){
			try(BufferedReader br= new BufferedReader(fr)){
				String line;
				while((line=br.readLine())!=null){
					System.out.println(line);
					
				}
			}
		}

	
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
}