package com.milon.sheikh.JavaJdbc.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.milon.sheikh.JavaJdbc.beans.Candidates;
import com.milon.sheikh.JavaJdbc.db_connection.MySQLJDBCUtil;

/**
 * @author [MILON SHEIKH]
 */
public class CandidateDao {
	public int updateData(int id, String fName) {
		int rowAffected = 0;
        try (Connection conn = MySQLJDBCUtil.getConnection()) {
            System.out.println(String.format("Connected to database %s " + "successfully.", conn.getCatalog()));
            
            /// Using Statement
//            String updateSQL = "UPDATE candidates SET last_name = '" + fName + "' WHERE id = '" + id + "'";
//            System.out.println(updateSQL);
//            Statement stmt  = conn.createStatement();
//            rowAffected = stmt.executeUpdate(sqlUpdate);
            
       	  String updateSQL = "UPDATE candidates SET last_name = ? WHERE id = ?";
       	  
          /// Using PreparedStatement
          PreparedStatement ps=conn.prepareStatement(updateSQL);
          ps.setString(1, fName);
          ps.setInt(2, id);
          rowAffected =ps.executeUpdate();

                  
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return rowAffected;
	}

}
