package com.shopping.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.beans.Apple;
import com.shopping.beans.Os;
import com.shopping.db.DBConnection;

public class OsService {

	public List<Os> getAllOsProducts() throws SQLException, ClassNotFoundException {
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
		List<Os> osProducts=null;
		if(con==null){

			System.out.println("No Database Connected");
		}
		else{
			String query = "select * from osTable";
			osProducts = new ArrayList<Os>();
			
				PreparedStatement pstmt=con.prepareStatement(query);
				ResultSet set=pstmt.executeQuery();

				while (set.next()) {
					Os ap = new Os();
					ap.setOsId(set.getInt(1));
					ap.setOsName(set.getString(2));

						
					osProducts.add(ap);
				}
				pstmt.close();
				set.close();
			}	
			return osProducts;
			
		}
}
