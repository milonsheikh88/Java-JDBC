package com.milon.sheikh.JavaJdbc;

import java.sql.Date;

import com.milon.sheikh.JavaJdbc.daos.CandidateDao;

/**
 * @author [MILON SHEIKH]
 */

public class App {
    public static void main( String[] args ){
    	  
   	 CandidateDao cd=new CandidateDao();
     int count = cd.deleteData(136);

     System.out.println(String.format("A new candidate with id %d has been deleted.",count));
  
    }
}
