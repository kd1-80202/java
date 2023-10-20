package com.sunbeam;

public class Cleark implements Emp{

	
		private double salary;
		

		public Cleark(double salary) {
			super();
			this.salary = salary;
		}

		@Override
		public double getSal() 
		{
			return this.salary;
		}

	}

