package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	int choice;
	Candidate c=new Candidate();
	do{
		
		System.out.println("1.Add  new candidate");
		System.out.println("2.get all candidates");
		System.out.println("3.delete candidate of given id");
		System.out.println("4.increment candidate vote where id=?");
		System.out.println("5.get all candidates of given party");
		System.out.println("6.modify name and party for the id");
		System.out.println("7.get partywise total votes");
		
		System.out.println("Enter your choice=");
		Scanner sc=new Scanner (System.in);
		 choice=sc.nextInt();
		 
		 switch (choice) {
		case 1://Add  new candidate
			try(CandidateDao dao=new CandidateDao() ){
				System.out.println("Enter cadidate name=");
				String name=sc.next();
				System.out.println("Enter cadidate party=");
				String party=sc.next();
				System.out.println("Enter cadidate votes=");
			    int votes=sc.nextInt();
				c.setName(name);
				c.setParty(party);
				c.setVotes(votes);
				int cnt=dao.addCandidate(c);
				System.out.println("candidate added"+cnt);
					
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			break;
		case 2://2.get all candidates
			try(CandidateDao dao=new CandidateDao()){
				List<Candidate>list=dao.findAll();
				list.forEach(e->System.out.println(e));
			
		
			
			}catch (Exception e) {
			e.printStackTrace();
			}		
					break;
		case 3://3.delete candidate of given id
			try(CandidateDao dao=new CandidateDao()){
				System.out.println("Enter id of candidates to be deleted=");
				int id=sc.nextInt();
				int cnt=dao.deleteById( id);
				System.out.println("row deleted"+cnt);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			break;
		case 4://4.increment candidate vote where id=?
			try(CandidateDao dao=new CandidateDao()){
				System.out.println("Enter id of candidates to increment candidate vote");
				int id=sc.nextInt();
				int cnt=dao.incrementVote( id);
				System.out.println("vote incremeneted"+cnt);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		 
			break;
		case 5://5.get all candidates of a given party
		    try (CandidateDao dao = new CandidateDao()) {
		        System.out.println("Enter the name of the party for which you want to retrieve candidates:");
		        String party = sc.next();
		        List<Candidate> list = dao.findByParty(party);
		        list.forEach(f -> System.out.println(f));
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    break;

			
		case 6://6.modify name and party for the id
			try(CandidateDao dao=new CandidateDao()){
				System.out.println("candidate id to update:");
				int id=sc.nextInt();
				System.out.println("Enter the name:");
				String name=sc.next();
				System.out.println("Enter party:");
				String party=sc.next();
				System.out.println("Enter the votes:");
				String votes=sc.next();
				c.setName(name);
				c.setParty(party);
				c.setVotes(id);
				c.setId(id);
				int cnt=dao.update(c);
				System.out.println("modified name and party for given id:"+cnt);
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			break;
         case 7://7.get partywise total votes
        	 try(PartyVotesDao dao=new PartyVotesDao()){
        		 List<PartyVotes> list=dao.getPartywiseVotes();
        		 list.forEach(p->System.out.println(p));
        	 }catch (Exception e) {
				e.printStackTrace();
			}
			
			break;
	
	

		default:System.out.println("Invalid choice");
			break;
		}
	
		
	
	}while(choice!=0);

}
}