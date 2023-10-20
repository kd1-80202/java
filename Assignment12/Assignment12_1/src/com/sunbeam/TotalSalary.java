package com.sunbeam;

public class TotalSalary {


	public static void main(String[] args) 
	{
		Manager manager = new Manager(1000,200);
		Labor labor = new Labor(400,100);
		Cleark clerk = new Cleark(4000);
		
		Emp[] e = {manager,labor,clerk};
		double totalSalary = Emp.calcTotalIncome(e);
			System.out.print("Total salary of all workers : "+totalSalary);
		
	}

}





