package com.milon.sheikh.JavaJdbc;

import com.milon.sheikh.JavaJdbc.daos.CandidateDao;

/**
 * @author [MILON SHEIKH]
 */

public class App {
    public static void main( String[] args ){
    	
   	 CandidateDao cd=new CandidateDao();
 	 int updateResult=  cd.updateData(2,"Milon");
     System.out.println("updateResult===>> "+updateResult);    
  
    }
}
