package tester;

import com.sunbeam.*;

public class test {

	public static void main(String[] args) 
	{
		Salaried_Employee s=new Salaried_Employee();
		s.accept();
		s.display();
		s.calculatesalary();
		
		Hourly_Employee h=new Hourly_Employee();
		h.accept();
		h.display();
		h.calculatesalary();
		
		Commision_Employee c=new Commision_Employee();
		c.accept();
		c.display();
		c.calculatesalary();
		
		BasePlus_Commision_Employee b = new BasePlus_Commision_Employee();
		b.accept();
		b.display();
		b.calculatesalary();
        
	}

}
