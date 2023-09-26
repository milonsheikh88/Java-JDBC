package com.milon.sheikh.JavaJdbc.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.milon.sheikh.JavaJdbc.db_connection.MySQLJDBCUtil;

/**
 * @author [MILON SHEIKH]
 */
public class CandidateDao {
	public int insertData(String firstName,String lastName,Date dob, String email, String phone) {
		 ResultSet rs = null;
		int candidateId  = 0;
        try (Connection conn = MySQLJDBCUtil.getConnection()) {
            System.out.println(String.format("Connected to database %s " + "successfully.", conn.getCatalog()));
            
            /// Using Statement
//            String insertSQL = "insert into candidates "
//					+"(first_name,last_name,dob,phone,email) "
//					+"values ('" + firstName + "','" + lastName + "','" + dob + "','" + phone + "','" + email + "')";
//            Statement stmt  = conn.createStatement();
//            int rowAffected  = stmt.executeUpdate(insertSQL,Statement.RETURN_GENERATED_KEYS);
 
            
            /// Using PreparedStatement
            String insertSQL = "INSERT INTO candidates(first_name,last_name,dob,phone,email) "
                    + "VALUES(?,?,?,?,?)";
            
            PreparedStatement pstmt = conn.prepareStatement(insertSQL,Statement.RETURN_GENERATED_KEYS);
            // set parameters for statement
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setDate(3, dob);
            pstmt.setString(4, phone);
            pstmt.setString(5, email);

            int rowAffected = pstmt.executeUpdate();
            
            if(rowAffected == 1){
                // get candidate id
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                candidateId = rs.getInt(1);
            }
                  
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return candidateId;
	}

}
