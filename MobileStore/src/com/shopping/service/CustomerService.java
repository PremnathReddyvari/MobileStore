package com.shopping.service;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.shopping.beans.User;
import com.shopping.db.DBConnection;
import com.sun.istack.internal.logging.Logger;

public class CustomerService {

	private static final Logger LOGGER = Logger.getLogger(CustomerService.class);



	public void addPerson(User s) throws ClassNotFoundException, SQLException{
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();

		if(con==null){

			System.out.println("No Database Connected");
		}
		else{
			System.out.println("GETTING THE DATA");
			String query="INSERT INTO Person VALUES(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1,s.getName());
			pstmt.setString(2,s.getEmail());
			pstmt.setString(3,s.getPassword());

			int rec=pstmt.executeUpdate();
			System.out.println(rec);

		}

	}	





	// This method is used to verify if the customer is registered
	// or not
	public boolean verifyUser(String email, String password) throws ClassNotFoundException, SQLException {
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
		PreparedStatement ps = null;
		String sql = "select userId from Person where email=? AND password=?";

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				if (rs.getString("userId") != null) {
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public User getUserByEmail(String email) throws ClassNotFoundException, SQLException {
		User user = new User();
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();

		try {
			PreparedStatement preparedStatement = (PreparedStatement) con.
					prepareStatement("select * from Person where email=?");
			preparedStatement.setString(1, email);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));


			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}



}
