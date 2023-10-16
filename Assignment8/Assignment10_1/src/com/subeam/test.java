package com.subeam;
import com.subeam.Employee;
import com.subeam.Employee;
import com.subeam.Hourly_Employee;
import com.subeam.Salaried_Employee;
class Box<T extends Employee>
{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	public double getTotalSalary()
	{
		return obj.calculatesalary();
		
	}
	
	
}


public class test {
	public static void printAnyEmployee(Box<? extends Employee>E) {
		
	}
	
	public static void main(String[] args) 
	{
		Salaried_Employee s1=new Salaried_Employee();
		s1.accept();
		s1.display();
		
		Box<Salaried_Employee> e1=new Box<>();
		
		e1.setObj(s1);
		System.out.println("Salaried employee="+e1.getTotalSalary());
		
		
		Hourly_Employee s2=new Hourly_Employee();
		s2.accept();
		s2.display();
		
		Box<Hourly_Employee> e2=new Box<>();
		
		e2.setObj(s2);
		System.out.println("Hourly_Employee ="+e2.getTotalSalary());
		

		Commision_Employee s3=new Commision_Employee();
		s3.accept();
		s3.display();
		
		Box<Commision_Employee> e3=new Box<>();
		
		e3.setObj(s3);
		System.out.println("Commision_Employee ="+e3.getTotalSalary());
		
	}

}