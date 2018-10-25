package com.shopping.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shopping.beans.Admin;
import com.shopping.beans.Feedback;
import com.shopping.db.DBConnection;

public class FeedbackService
{
	public  void feedback(Feedback f) throws SQLException, ClassNotFoundException
	{
		
		DBConnection ca=new DBConnection();
		Connection conn = ca.CONN();
		PreparedStatement pstmt=null;
		if(conn==null)
		{
			System.out.println("not connected");
		}
		else
		{
			
			System.out.println("Getting the data");
		String query="insert into Feedback values(?,?,?)";
		PreparedStatement psmt= conn.prepareStatement(query);
		
		pstmt.setString(1,f.getName());
		pstmt.setString(2, f.getEmail());
		pstmt.setString(3, f.getComment());	
		
		
		int rec=pstmt.executeUpdate();
		System.out.println(rec);
		}
		
			
}
	}
	


