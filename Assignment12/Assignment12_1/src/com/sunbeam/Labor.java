package com.sunbeam;

public class Labor extends Manager
{

		private int hours;
		private double rate;
		
		Labor()
		{
			
		}

		public Labor(int hours, double rate) {
			
			this.hours = hours;
			this.rate = rate;
		}

		

		@Override
		public double getSal() {
			
			return this.hours*this.rate;
		}
		
		@Override
		public double calcIncentives() 
		{
			if(this.hours>300)
			return 0.05*this.getSal();
			else 
				return 0.0;
		}

	}


