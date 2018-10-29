package com.shopping.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.beans.Order;
import com.shopping.db.DBConnection;

public class OrderService {
	
	
	
	
	public boolean addPerson(Order order,int referenceNumber) throws ClassNotFoundException, SQLException{
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
		boolean flag=false;

		if(con==null){

			System.out.println("No Database Connected");
		}
		else{
			
			System.out.println("GETTING THE DATA");
			System.out.println("insite update");
			String query1="select quantity from products where productName=?";
			PreparedStatement prepareStatement1 = con.prepareStatement(query1);
			prepareStatement1.setString(1,order.getProductName());
			ResultSet resultSet = prepareStatement1.executeQuery();
			int quantity=0;
			while(resultSet.next())
			{
			 quantity = resultSet.getInt(1);
				
			}
			if(quantity>0){
				
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
			flag=true;
			}
			

		}
    return flag;
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
			
			String query="update products  SET quantity= quantity-1 where productName=?";

			PreparedStatement prepareStatement = con.prepareStatement(query);
			prepareStatement.setString(1,productName);
			prepareStatement.executeUpdate();
			
	       }catch (Exception e) {
			e.printStackTrace();
		}
	}


}
