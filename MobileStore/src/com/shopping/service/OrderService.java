package com.shopping.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.shopping.beans.Order;
import com.shopping.beans.User;
import com.shopping.db.DBConnection;

public class OrderService {
	
	
	
	
	public void addPerson(Order order,int referenceNumber) throws ClassNotFoundException, SQLException{
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();

		if(con==null){

			System.out.println("No Database Connected");
		}
		else{
			System.out.println("GETTING THE DATA");
			String query="INSERT INTO orderItem VALUES(?,?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1,order.getName());
			pstmt.setString(2,order.getEmail());
			pstmt.setString(3,order.getProductName());
			pstmt.setString(4,order.getProductCompany());
			pstmt.setInt(5,order.getProductPrice());
			pstmt.setString(6,order.getAddress());
			
			int rec=pstmt.executeUpdate();
			
	
			System.out.println(rec);

		}

	}
	public List<Order> getOrderByEmail(String email) throws ClassNotFoundException, SQLException {
		List<Order> list=new ArrayList<Order>();
		
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
		ResultSet rs=null;
		PreparedStatement preparedStatement = null;
		try {
		preparedStatement = (PreparedStatement) con.
					prepareStatement("select * from orderItem where email=?");
			preparedStatement.setString(1, email);
			rs = preparedStatement.executeQuery();

			while(rs.next()){
				Order order = new Order();
				order.setName(rs.getString("name"));
				order.setEmail(rs.getString("email"));
				order.setProductName(rs.getString("productName"));
				order.setProductCompany(rs.getString("productCompany"));
				order.setProductPrice(rs.getInt("productPrice"));
				order.setAddress(rs.getString("address"));
				
				list.add(order);

			}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	rs.close();
	preparedStatement.close();
		
		return list;
	}

	public void updateProducts(String productName) throws ClassNotFoundException, SQLException{
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();

		try {
			System.out.println("insite update");
			String query="update products  SET quantity= quantity-1 where productName=?";

			PreparedStatement prepareStatement = con.prepareStatement(query);
			prepareStatement.setString(1,productName);
			prepareStatement.executeUpdate();

	       }catch (Exception e) {
			e.printStackTrace();
		}
	}


}
