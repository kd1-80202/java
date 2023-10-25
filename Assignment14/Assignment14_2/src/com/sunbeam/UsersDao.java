package com.sunbeam;

import java.sql.*;
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
	public List<Users> displayAll() throws SQLException {
		List<Users> list = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String passwd = rs.getString("password");
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					java.sql.Date sDate = rs.getDate("dob");
					java.util.Date uDate = new Date(sDate.getTime());
					Users a = new Users(id, fname, lname, email, passwd, uDate, status, role);
					list.add(a);

				}
				return list;
			}
		}
	}
	
	// Update user by id
	public int updateUser(Users a) throws SQLException {
		String sql = "UPDATE users set first_name=? ,last_name=?, password=? where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, a.getFirstName());
			stmt.setString(2, a.getLastName());
			stmt.setString(3, a.getPassword());
			stmt.setInt(4, a.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	
	}

