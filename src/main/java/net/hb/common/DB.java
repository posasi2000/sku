package net.hb.common;

import java.sql.*;  

public class DB {

  public static Connection getConnection( ){ 
  	  Connection CN = null;
	    try {
		       //step1
			    Class.forName("oracle.jdbc.driver.OracleDriver");
			    System.out.println("DB.java success ");
			    
			    //step2
			    String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
			    CN=DriverManager.getConnection(url ,"system","1234");
			    //System.out.println("DB.java  success");
	    }catch (Exception e){	System.out.println("DB.java error " + e);		}
	    return CN;
  }//end
	
	public static double getPoint(){ 
		double dd=7.8;
		return dd;
	}//end
	
	public String  getBook( ){ 
		String title="rain";
		return title;
	}//end
	
}//class END
