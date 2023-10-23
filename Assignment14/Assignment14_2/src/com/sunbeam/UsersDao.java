package com.sunbeam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersDao implements AutoCloseable {
	private Connection con;
	public UsersDao() throws SQLException{
		con=Dbutil.getConncetion();
		
	}
	@Override
	public void close() throws Exception {
		try {
			if(con!=null)
				con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//add users
	public int addUser(Users a)throws SQLException{
		String sql= "INSERT INTO users VALUES(default,?,?,?,?,?,false,'voter')";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
		stmt.setString(1,a.getFirstName());
		stmt.setString(2, a.getLastName());
		stmt.setString(3,a.getEmail());
		stmt.setString(4, a.getPassword());
		java.sql.Date sdate=new java.sql.Date(a.getDob().getTime());
	    stmt.setDate(5,sdate);
		int cnt=stmt.executeUpdate();
		return cnt;
				
		}
	}
	//delete given user
	public int deleteById(int id)throws SQLException{
		String sql="delete from users where id=?";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setInt(1, id);
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	
		
	}
	
	//get all users
	public List<Users> findAll() throws SQLException{
		List<Users>list=new ArrayList<>();
		String sql="SELECT * FROM users";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
		try(ResultSet rs=stmt.executeQuery()){
			while(rs.next()) {
				int id=rs.getInt("id");
				String firstName=rs.getString("first_Name");
				String lastName=rs.getString("last_Name");
				String email=rs.getString("email");
				String password=rs.getString("password");
				java.sql.Date sdate=rs.getDate("dob");
			   Date bdate=new Date(sdate.getTime());
			   boolean status=rs.getBoolean("status");
			   String role=rs.getString("role");
		Users a=new Users(id,firstName,lastName,email,password,sdate,status,role);
		list.add(a);
		return list;
			}
		}
		}
	
		// Update user by id
	  public  int updateUser(Users a) throws SQLException {
	        String sql = "UPDATE users SET first_name=?, last_name=?, email=?, password=?, dob=?, status=?, role=? WHERE id=?";
	        try (PreparedStatement stmt = con.prepareStatement(sql)) {
	            stmt.setString(1, user.getFirstName());
	            stmt.setString(2, user.getLastName());
	            stmt.setString(3, user.getEmail());
	            stmt.setString(4, user.getPassword());
	            java.sql.Date sdate=new java.sql.Date(a.getDob().getTime());
	            stmt.setDate(5, dob);
	            stmt.setBoolean(6, user.getStatus());
	            stmt.setString(7, user.getRole());
	            stmt.setInt(8, user.getId());
	            int cnt = stmt.executeUpdate();
	            return cnt;
	        }
	    }
	}
}
