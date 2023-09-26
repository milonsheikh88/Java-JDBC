package com.milon.sheikh.JavaJdbc;

import java.sql.Date;

import com.milon.sheikh.JavaJdbc.daos.CandidateDao;

/**
 * @author [MILON SHEIKH]
 */

public class App {
    public static void main( String[] args ){
    	  
   	 CandidateDao cd=new CandidateDao();
     int id = cd.insertData("Bush", "Lily", Date.valueOf("1980-01-04"),"bush.l@yahoo.com", "(408) 898-6666");

     System.out.println(String.format("A new candidate with id %d has been inserted.",id));
  
    }
}
