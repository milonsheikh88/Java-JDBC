package com.milon.sheikh.JavaJdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.milon.sheikh.JavaJdbc.db_connection.MySQLJDBCUtil;

/**
 * @author [MILON SHEIKH]
 */

public class App {
    public static void main( String[] args ){
        try (Connection conn = MySQLJDBCUtil.getConnection()) {
            System.out.println(String.format("Connected to database %s " + "successfully.", conn.getCatalog()));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }   	  
    }
}
