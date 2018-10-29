package com.shopping.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.shopping.db.DBConnection;

public class FeedbackService
{
	public  void feedback(String comm,String email) throws SQLException, ClassNotFoundException
	{
		
		DBConnection ca=new DBConnection();
		Connection conn = ca.CONN();
		
		if(conn==null)
		{
			System.out.println("not connected");
		}
		else
		{
			
			System.out.println("Getting the data");
		String query="insert into Feedback values(?,?)";
		PreparedStatement psmt= conn.prepareStatement(query);
		
		psmt.setString(1,email);
		psmt.setString(2,comm);
		
		
		int rec=psmt.executeUpdate();
		System.out.println(rec);
		}
		
			
}
	}
	


