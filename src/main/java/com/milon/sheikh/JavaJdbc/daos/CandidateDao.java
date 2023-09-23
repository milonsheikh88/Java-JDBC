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
	
	 private  String selsetSQL = "SELECT * FROM candidates";
	 private  String updateSQL = "UPDATE candidates "
             + "SET last_name = ? "
             + "WHERE id = ?";
	

	public List<Candidates>  showAllCandidate() {
		List<Candidates> candidateList = new ArrayList<>();
		
        try (Connection conn = MySQLJDBCUtil.getConnection()) {
            System.out.println(String.format("Connected to database %s " + "successfully.", conn.getCatalog()));
            
            /// Using Statement
//            Statement stmt  = conn.createStatement();
//            ResultSet rs    = stmt.executeQuery(selsetSQL);
            
          /// Using PreparedStatement
            PreparedStatement ps=conn.prepareStatement(selsetSQL);
            ResultSet rs =ps.executeQuery();
            
           while (rs.next()) {
        	   
        	   Candidates candidate = new Candidates();
               candidate.setCandidateId(rs.getInt(1));
               candidate.setCandidateFirstName(rs.getString(2));
               candidate.setCandidateLastName(rs.getString(3));
               candidate.setCandidateDOB(rs.getString(4));
               candidate.setCandidatePhone(rs.getString(5));
               candidate.setCandidateEmail(rs.getString(6));

               candidateList.add(candidate);     
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return candidateList;
		
	}


	public int updateData() {
		int rowAffected = 0;
        try (Connection conn = MySQLJDBCUtil.getConnection()) {
            System.out.println(String.format("Connected to database %s " + "successfully.", conn.getCatalog()));
            
            /// Using Statement
            String sqlUpdate = "UPDATE candidates SET last_name = 'Sheikh' WHERE id = 2";
            Statement stmt  = conn.createStatement();
            rowAffected = stmt.executeUpdate(sqlUpdate);
                  
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return rowAffected;
	}

}
