package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Writer {

	public static void main(String[] args) {
	
		
		try(FileWriter fwr=new FileWriter("Write.bin")){
			try(BufferedWriter bwr= new BufferedWriter(fwr)) 
			{
			Scanner sc=new Scanner(System.in);
			for(int i=1;i<=4;i++)
			{
				System.out.println("Enter a line:");
				String line=sc.nextLine();
				bwr.write(line);
				bwr.newLine();	
			}
			System.out.println("Lines are written into file");
				
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

	}
