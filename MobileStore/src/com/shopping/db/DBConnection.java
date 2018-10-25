package com.shopping.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	String ip="204.246.56.24";
	String driverClass="net.sourceforge.jtds.jdbc.Driver";
	String db="mobilestore";
	String un="mobilestore";
	String pass="tspl@123";



	public Connection CONN()  throws SQLException, ClassNotFoundException{

		Connection conn = null;
		String ConnURL = null;

		try {

			Class.forName(driverClass);
			ConnURL = "jdbc:jtds:sqlserver://" + ip + ";"
					+ "databaseName=" + db + ";user=" + un + ";password="
					+ pass+ ";";
			conn = DriverManager.getConnection(ConnURL);
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (ClassNotFoundException se) {
			System.out.println(se.getMessage());
		} catch (Exception se) {
			System.out.println(se.getMessage());
		}
		return conn;
	}



}


