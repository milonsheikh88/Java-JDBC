package com.milon.sheikh.JavaJdbc.db_connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author [MILON SHEIKH]
 */

public class MySQLJDBCUtil {

	private static  String DB_URL = "";
	private static  String DB_USERNAME = "";
	private static  String DB_PASSWORD = "";

	public static Connection getConnection() throws SQLException {
		Connection conn = null;
	
		try (FileInputStream file = new FileInputStream("db.properties")) {

			// load the properties file
			Properties pros = new Properties();
			pros.load(file);

			 // assign db parameters
			 DB_URL = pros.getProperty("url");
			 DB_USERNAME = pros.getProperty("user");
			 DB_PASSWORD = pros.getProperty("password");

			// create a connection to the database
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		} catch (IOException e) {
			System.out.println("MYSQLJDBC Class " + e.getMessage());
		}
		return conn;
	}

}
