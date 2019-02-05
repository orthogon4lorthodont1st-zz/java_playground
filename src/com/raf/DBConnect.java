package com.raf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static void connect() throws SQLException {
		String host = "127.0.0.1";
		String username = "root";
		String password = "";
		
		try {
			Connection conn = DriverManager.getConnection(host, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}