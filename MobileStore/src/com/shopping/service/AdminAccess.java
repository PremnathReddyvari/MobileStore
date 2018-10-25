package com.shopping.service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shopping.beans.Admin;
import com.shopping.db.DBConnection;

public class AdminAccess {

	public Admin getAdminDetails(String email) throws ClassNotFoundException, SQLException{
		DBConnection ca=new DBConnection();
		Connection conn = ca.CONN();
		if (conn == null) {
			System.out.println("It is not connected to data base");
			return null;
		} else {
			try {
				System.out.println("get admin details");
				PreparedStatement prepareStatement = conn.prepareStatement("select * from Admin where email=?");
				prepareStatement.setString(1,email);
				ResultSet resultSet = prepareStatement.executeQuery();
				Admin admin =null;
		
				while (resultSet.next()) {
				admin = new Admin();
			
					
					
					admin.setEmail(resultSet.getString(1));
					admin.setPassword(resultSet.getString(2));
					

				}
				resultSet.close();
				prepareStatement.close();
				conn.close();

				return  admin ;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    return null;
	}
}
