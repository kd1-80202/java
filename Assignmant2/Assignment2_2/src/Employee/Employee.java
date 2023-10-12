package Employee;

import java.util.Scanner;

public class Employee {
	String Fname;
	String Lname;
	double Monthlysalary;
	

	

	public Employee(String fname, String lname, double monthlysalary) {
		super();
		Fname = fname;
		Lname = lname;
		Monthlysalary = monthlysalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public double getMonthlysalary() {
		return Monthlysalary;
	}
	public void setMonthlysalary(double monthlysalary) {
		Monthlysalary = monthlysalary;
	}
	void acceptEmployee()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter First name= ");
	    this.Fname=sc.nextLine();
	    System.out.println("Enter last name= ");
	    this.Lname=sc.nextLine();
	    System.out.println("Enter monthly Salary= ");
	    this.Monthlysalary=sc.nextDouble();
	
	}

	void displayEmployee()

	{
		System.out.println("First name="+Fname+","+"Last name="+Lname+","+"Salary="+salary);
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.acceptEmployee();
		if(e1.getMonthlysalary()<=0)
		{
			e1.setMonthlysalary(0);
		}
		double yearlySalary1=e1.Monthlysalary*12;
		System.out.println("Yearly Salary= "+yearlySalary1);
	    double inscreasedSalary=(yearlySalary1+(0.1*yearlySalary1));
        System.out.println("increasedSalary= "+inscreasedSalary);
        Employee e2=new Employee();
		e2.acceptEmployee();
		if(e2.getMonthlysalary()<=0)
		{
			e2.setMonthlysalary(0);
		}
		double yearlySalary2=e2.Monthlysalary*12;
		System.out.println("Yearly Salary= "+yearlySalary2);
	    double inscreasedSalarye2=(yearlySalary2+(0.1*yearlySalary2e));
        System.out.println("increasedSalary= "+inscreasedSalary);
        
	}

}
