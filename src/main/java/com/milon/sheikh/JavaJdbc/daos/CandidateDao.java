package com.milon.sheikh.JavaJdbc.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import com.milon.sheikh.JavaJdbc.db_connection.MySQLJDBCUtil;

/**
 * @author [MILON SHEIKH]
 */
public class CandidateDao {
	public int insertData(String firstName,String lastName,Date dob, String email, String phone) {
		int idinsertId = 0;
        try (Connection conn = MySQLJDBCUtil.getConnection()) {
            System.out.println(String.format("Connected to database %s " + "successfully.", conn.getCatalog()));
            
            /// Using Statement
            String insertSQL = "insert into candidates "
					+"(first_name,last_name,dob,phone,email) "
					+"values ('" + firstName + "','" + lastName + "','" + dob + "','" + phone + "','" + email + "')";
            Statement stmt  = conn.createStatement();
            idinsertId = stmt.executeUpdate(insertSQL);
                  
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return idinsertId;
	}

}
