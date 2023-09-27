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
	public int deleteData(int id) {
		 ResultSet rs = null;
		int rowCount  = 0;
        try (Connection conn = MySQLJDBCUtil.getConnection()) {
            System.out.println(String.format("Connected to database %s " + "successfully.", conn.getCatalog()));
            
            /// Using Statement
            String deleteSQL = "DELETE FROM candidates WHERE id = '" + id + "'";
            Statement stmt  = conn.createStatement();
            rowCount = stmt.executeUpdate(deleteSQL);
  
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return rowCount;
	}

}
