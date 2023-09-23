package com.milon.sheikh.JavaJdbc;
import java.util.List;

import com.milon.sheikh.JavaJdbc.beans.Candidates;
import com.milon.sheikh.JavaJdbc.daos.CandidateDao;

/**
 * @author [MILON SHEIKH]
 */

public class App {
    public static void main( String[] args ){
    	
    	 CandidateDao cd=new CandidateDao();
//    	 List<Candidates> candidateList =	cd.showAllCandidate();
//    	  for (Candidates candidate : candidateList) {
//    	        System.out.println(candidate.getCandidateId() + "\t" +
//    	                candidate.getCandidateFirstName() + "\t" +
//    	                candidate.getCandidateLastName() + "\t" +
//    	                candidate.getCandidatePhone() + "\t" +
//    	                candidate.getCandidateEmail());
//    	    }
    	  
    	  
    	int updateResult=  cd.updateData();
        System.out.println("updateResult===>> "+updateResult);  
    	  
    }
}
