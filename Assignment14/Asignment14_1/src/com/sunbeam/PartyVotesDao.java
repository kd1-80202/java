package com.sunbeam;

import java.sql.*;
import java.sql.SQLException;
import java.util.*;

public class PartyVotesDao implements AutoCloseable{
private Connection con;
public  PartyVotesDao() throws SQLException{
	con=Dbutil.getConncetion();
}

@Override
public void close() throws Exception {
	try {
		if(con!=null)
			con.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
public List<PartyVotes>getPartywiseVotes() throws SQLException{
	List<PartyVotes>list=new ArrayList<>();
	String sql="SELECT party,SUM(votes) As total_votes From  candidates GROUP BY party";
	try(PreparedStatement stmt= con.prepareStatement(sql)){
		try(ResultSet rs=stmt.executeQuery()){
			while(rs.next())
			{
				String party=rs.getString("party");
				int votes=rs.getInt("total_votes");
				PartyVotes p=new PartyVotes(party,votes);
				list.add(p);
				
			}//rs.close();
			
		}//stmt.close();
	}
	
	return list;
	
}


}