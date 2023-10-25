package com.sunbeam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	int choice;
	Users a=new Users();
	do {
		System.out.println("1.Add  new user");
		System.out.println("2.delete given user");
		System.out.println("3.get all user");
		System.out.println("4.increment candidate vote where id=?");
		System.out.println("5.update user by id");
	
		
		System.out.println("Enter your choice=");
		Scanner sc=new Scanner (System.in);
		 choice=sc.nextInt();
		switch (choice) {
		case 1://Add  new user
			try(UsersDao dao=new UsersDao()){
				System.out.println("Enter cadidate  first name=");
				String firstname=sc.next();
				System.out.println("Enter cadidate  last name=");
				String lastname=sc.next();
				System.out.println("Enter cadidate email=");
				String email=sc.next();
				System.out.println("Enter cadidate password=");
			   String password=sc.next();
			    System.out.println("Enter cadidate BirthDate=");
			    String date1=sc.next();
			   SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			   Date dob=sdf.parse(date1);
			    a.setFirstName(firstname);
			    a.setLastName(lastname);
			    a.setEmail(email);
			    a.setPassword(password);
			    a.setDob(dob);
			    int cnt=dao.addUser(a);
			    System.out.println("user added"+cnt);
		}catch (Exception e) {
			e.printStackTrace();
		}
			
			break;
	case 2://delete given users
				try(UsersDao dao=new UsersDao()){
					System.out.println("Enter id of user to be deleted");
					int id=sc.nextInt();
					int cnt=dao.deleteById(id);
					System.out.println("row deleted"+cnt);
				}catch (Exception e) {
					e.printStackTrace();
				}
				break;
	
	case 3://get all user
		

		try (UsersDao dao=new UsersDao()){
			List<Users> list=dao.displayAll();
			list.forEach(e -> System.out.println(e));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		break;
	
	case 4://update user
		try (UsersDao dao = new UsersDao()) {

			System.out.println("Enter Id to be updated");
			int id = sc.nextInt();
			System.out.println("Enter First name");
			String firstname = sc.next();
			System.out.println("Enter last name");
			String lastname = sc.next();
			System.out.println("Enter Password");
			String password = sc.next();
			 a.setFirstName(firstname);
			    a.setLastName(lastname);
			    a.setPassword(password);
			a.setId(id);
			int cnt = dao.updateUser(a);
			System.out.println("User Updated :" + cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		break;
		
		
		
	
	
		
	}while(choice!=0);
	}

}

