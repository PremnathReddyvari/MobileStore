package com.shopping.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.beans.Android;
import com.shopping.beans.Apple;
import com.shopping.beans.Os;
import com.shopping.beans.Products;
import com.shopping.beans.Symbian;
import com.shopping.db.DBConnection;

public class ProductService {

	private List<Apple> appleProducts = null;
	
	private List<Symbian> symbianProducts = null;



	// Method to get all Apple products available
	public List<Apple> getAllAppleProducts() throws SQLException, ClassNotFoundException {
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
		if(con==null){

			System.out.println("No Database Connected");
		}
		else{
			String query = "select * from apple";
			appleProducts = new ArrayList<Apple>();
			
				PreparedStatement pstmt=con.prepareStatement(query);
				ResultSet set=pstmt.executeQuery();

				while (set.next()) {
					Apple ap = new Apple();
					ap.setProductName(set.getString(2));
					ap.setProductCompany(set.getString(3));
					ap.setProductPrice(set.getInt(4));
					ap.setReferenceNumber(set.getInt(5));

						
					appleProducts.add(ap);
				}
				pstmt.close();
				set.close();
			}	
			return appleProducts;
			
		}
		
	// Method to get all Android products available
	public List<Products> getAllAndroidProducts(int id) throws SQLException, ClassNotFoundException {
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
	    List<Products> androidProducts = new ArrayList<>();
		if(con==null){

			System.out.println("No Database Connected");
		}
		else{
			System.out.println("In side productservice");
			/*String query = "select * from osTable where osId=?";
			androidProducts = new ArrayList<Products>();
			
				PreparedStatement pstmt=con.prepareStatement(query);
				pstmt.setInt(1,id);
				ResultSet set=pstmt.executeQuery();
				Os os=new Os();
				while (set.next()) {
					os.setOsId(set.getInt(1));
					os.setOsName(set.getString(2));
					System.out.println(os.getOsId());
					Android andr = new Android();
					andr.setProductName(set.getString(2));
					andr.setProductCompany(set.getString(3));
					andr.setProductPrice(set.getInt(4));
					andr.setReferenceNumber(set.getInt(5));
					androidProducts.add(andr);
				}*/
				 String query1 ="select * from products where osId=?";
				 
				 PreparedStatement pstmt1=con.prepareStatement(query1);
					pstmt1.setInt(1,id);
					ResultSet rs=pstmt1.executeQuery();
					Products p=null;
					while (rs.next()) {
						p=new Products();
						
						p.setProductId(rs.getInt(1));
						p.setOsId(rs.getInt(2));
						p.setProductName(rs.getString(3));
						p.setProductCompany(rs.getString(4));
						p.setProductPrice(rs.getInt(5));
						p.setReferenceNumber(rs.getInt(6));
						p.setQuantity(rs.getInt(7));
						System.out.println(p.getProductCompany()+" "+p.getOsId()+" "+p.getProductId());
						androidProducts.add(p);
					}
					rs.close();
				pstmt1.close();
				
			}	
			return androidProducts;
			
		}
	// Method to get all Symbian products available
	public List<Symbian> getAllSymbianProducts() throws SQLException, ClassNotFoundException {
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
		if(con==null){

			System.out.println("No Database Connected");
		}
		else{
			String query = "select * from symbian";
			symbianProducts = new ArrayList<Symbian>();
			
				PreparedStatement pstmt=con.prepareStatement(query);
				ResultSet set=pstmt.executeQuery();

				while (set.next()) {
					Symbian p = new Symbian();
					p.setProductName(set.getString(2));
					p.setProductCompany(set.getString(3));
					p.setProductPrice(set.getInt(4));
					p.setReferenceNumber(set.getInt(5));
					symbianProducts.add(p);
				}
				pstmt.close();
				set.close();
			}	
			return symbianProducts;
			
		}
	
	
	public Apple insertApple(Apple apple) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
		if(con==null){

			System.out.println("No Database Connected");
		}
		else{

			String query = "insert into apple values(?,?,?,?)";

			//System.out.println("Successfully connected to DB");
			//String insert = "insert into book(bookid,bookname,bookdesc,quantity,price,subid,authid) values(?,?,?,?,?,?,?)";

			PreparedStatement pstmt=con.prepareStatement(query);

			pstmt.setString(1,apple.getProductName());
			pstmt.setString(2,apple.getProductCompany());
			pstmt.setInt(3,apple.getProductPrice());
			pstmt.setInt(4,apple.getReferenceNumber());

			//psmt.setInt(8, 0);
			pstmt.executeUpdate();
			System.out.println("Inserted successfully");
			pstmt.close();
			con.close();
			
			return apple;
		} 
		return null;
	}


	public Android insertAndroid(Android android) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
		if(con==null){

			System.out.println("No Database Connected");
		}
		else{

			String query = "insert into android values(?,?,?,?)";

			//System.out.println("Successfully connected to DB");
			//String insert = "insert into book(bookid,bookname,bookdesc,quantity,price,subid,authid) values(?,?,?,?,?,?,?)";

			PreparedStatement pstmt=con.prepareStatement(query);

			pstmt.setString(1,android.getProductName());
			pstmt.setString(2,android.getProductCompany());
			pstmt.setInt(3,android.getProductPrice());
			pstmt.setInt(4,android.getReferenceNumber());

			//psmt.setInt(8, 0);
			pstmt.executeUpdate();
			System.out.println("Inserted successfully");
			pstmt.close();
			con.close();
			
			return android;
		} 
		return null;
	}
	
	
	public Products insertProduct(Products products) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
		if(con==null){

			System.out.println("No Database Connected");
		}
		else{

			String query = "insert into products values(?,?,?,?,?,?)";

			//System.out.println("Successfully connected to DB");
			//String insert = "insert into book(bookid,bookname,bookdesc,quantity,price,subid,authid) values(?,?,?,?,?,?,?)";

			PreparedStatement pstmt=con.prepareStatement(query);


			pstmt.setInt(1,products.getOsId());
			pstmt.setString(2,products.getProductName());
			pstmt.setString(3,products.getProductCompany());
			pstmt.setInt(4,products.getProductPrice());
			pstmt.setInt(5,products.getReferenceNumber());
			pstmt.setInt(6,products.getQuantity());
			

			//psmt.setInt(8, 0);
			pstmt.executeUpdate();
			System.out.println("Inserted successfully");
			pstmt.close();
			con.close();
			
			return products;
		} 
		return null;
	}

	public Symbian insertSymbian(Symbian symbian) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
		if(con==null){

			System.out.println("No Database Connected");
		}
		else{

			String query = "insert into symbian values(?,?,?,?)";

			//System.out.println("Successfully connected to DB");
			//String insert = "insert into book(bookid,bookname,bookdesc,quantity,price,subid,authid) values(?,?,?,?,?,?,?)";

			PreparedStatement pstmt=con.prepareStatement(query);

			pstmt.setString(1,symbian.getProductName());
			pstmt.setString(2,symbian.getProductCompany());
			pstmt.setInt(3,symbian.getProductPrice());
			pstmt.setInt(4,symbian.getReferenceNumber());

			//psmt.setInt(8, 0);
			pstmt.executeUpdate();
			System.out.println("Inserted successfully");
			pstmt.close();
			con.close();
			
			return symbian;
		} 
		return null;
	}
	
	
	public Android getAndroid(int referenceNumber) throws ClassNotFoundException, SQLException {
		Android android = new Android();
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();

		try {
			PreparedStatement preparedStatement = (PreparedStatement) con.
					prepareStatement("select * from android where referenceNumber=?");
			preparedStatement.setInt(1, referenceNumber);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				android.setProductCompany(rs.getString("productCompany"));
				android.setProductName(rs.getString("productName"));
				android.setProductPrice(rs.getInt("productPrice"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return android;
	}
	
	
	public List<Products> getAllProducts() throws SQLException, ClassNotFoundException {
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
		List<Products> products = new ArrayList<Products>();
		
		if(con==null){

			System.out.println("No Database Connected");
		}
		else{
			String query = "select * from products";
			
				PreparedStatement pstmt=con.prepareStatement(query);
				ResultSet set=pstmt.executeQuery();

				while (set.next()) {
					Products p = new Products();
					p.setProductId(set.getInt(1));
					p.setOsId(set.getInt(2));
					p.setProductName(set.getString(3));
					p.setProductCompany(set.getString(4));
					p.setProductPrice(set.getInt(5));
					p.setReferenceNumber(set.getInt(6));
					p.setQuantity(set.getInt(7));
					products.add(p);
				}
				pstmt.close();
				set.close();
				
	
		}	
		return products;
			
		}




}





