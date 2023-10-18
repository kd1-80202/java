package com.sunbeam;
import java.util.*;
import com.sunbeam.Employee;
import com.sunbeam.test.*;
public class test {

	public static void main(String[] args) {
		List <Employee>list=new LinkedList<>();
        int choice;
        do {

			System.out.println("0.Exit");
			System.out.println("1.Add new Employee in list. ");
			System.out.println("2. Delete employee in list");
			System.out.println("3. Find employee in list");
			System.out.println("4. sort Employeelist");
			System.out.println("5. Enter emp id to be modified:");
			System.out.println("Enter your choice=");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
      switch (choice) {
	case 1:
		Employee e1=new Employee();
	    e1.acceptEmployee();
	    list.add(e1);
		break;
    case 2:
    	System.out.println("Enter index at which element to be deleted");
    	int index=sc.nextInt();
    	list.remove(index);
    	System.out.println("Employee removed");
    	System.out.println("size"+list.size());
		
		break;
    case 3:
    	Employee e2=new Employee();
    	System.out.println("Enter empid in the list to find Employee");
    	int empid=sc.nextInt();
    	e2.setEmpid(empid);
    	int index1=list.indexOf(e2);
    	if(index1==-1)
    		System.out.println("not found");
    	else
    	{
    		System.out.println("found");
    		e2=list.get(index1);
    		System.out.println(e2);
    		
    	}
    	
	
	   break;
    case 4:    	Employee e3=new Employee();

    	class EmployeeComparator implements Comparator<Employee>{

			@Override
			public int compare(Employee e1, Employee e2) {
				int diff=Integer.compare(e1.getEmpid(),e2.getEmpid());
				return diff;
				
			}
    		
    	}
    	EmployeeComparator Comparator=new EmployeeComparator();
    	list.sort(Comparator);
    	System.out.println("Sorted list:");
    	for (Employee employee : list) {
    		employee.displayEmployee();
			
		}
	
	   break;
    case 5:
    	System.out.println("Enter empid tobe modified:");
        int id=sc.nextInt();
        Employee key=new Employee();
        key.setEmpid(id);
        int index2=list.indexOf(key);
        if(index2==-1)
        	System.out.println("Employee not found:");
        else
        {
        	Employee oldEmp=list.get(index2);
        	System.out.println("Employee found:"+oldEmp);
        	System.out.println("Enter new information for the employee:");
        	Employee Emp=new Employee();
        	Emp.acceptEmployee();
        	list.set(index2, Emp);
        	
        }
        
        
	   break;

	}
     
        
	}while(choice!=0);

}
}
