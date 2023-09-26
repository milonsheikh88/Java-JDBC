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
	  Candidates candidate= new Candidates();
	
	 private  String selsetSQL = "SELECT * FROM candidates";
	
	public List<Candidates>  showAllCandidate() {
		List<Candidates> candidateList = new ArrayList<>();
		
        try (Connection conn = MySQLJDBCUtil.getConnection()) {
            System.out.println(String.format("Connected to database %s " + "successfully.", conn.getCatalog()));
            
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

}
