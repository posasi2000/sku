package net.hb.test;

import java.util.ArrayList;
import net.hb.common.DB;
import net.hb.common.Global;
import javax.naming.Context;
import javax.sql.DataSource;
import javax.naming.InitialContext;

public class TestSQL extends Global {
	
 public TestSQL() {
	 try {
     CN = DB.getConnection(); 
     Context initContext = new InitialContext();
 	 Context envContext = (Context)initContext.lookup("java:comp/env/");
 	 DataSource ds = (DataSource)envContext.lookup("jdbc/snow");
 	 CN  = ds.getConnection(); 
	 }catch (Exception e) {	}
 }//end
 
 public void dbInsert(String a, int b, String gen, String img) { 
	 try {
	   msg =" insert into test values(?, ?, ?, sysdate, test_seq.nextVal, ?) " ;
	   PST = CN.prepareStatement(msg);
	   			PST.setString(1, a);
	   			PST.setInt(2, b);
	   			PST.setString(3, gen);
	   			PST.setString(4, img);
	   PST.executeUpdate();
	   System.out.println("TestSQL.java dbInsert(1,2,3,4) OK");
	 }catch(Exception e){System.out.println("dbInsert Error" + e.toString());}
 }//end
 
 
 public void dbInsert(TestDTO dto) { 
	 try {
	   msg =" insert into test values(?, ?, ?, sysdate, test_seq.nextVal, ?) " ;
	 }catch(Exception e){System.out.println("Error " + e.toString());}
 }//end
 
 public void dbDelete(int data) {
	try {
		ST = CN.createStatement();
		msg = "delete from test where code = " + data ;
		ST.executeUpdate(msg);
	}catch(Exception e){System.out.println("Error " + e.toString());}
 }//end
 
 public void dbEdit(String a, int b, String gen,  int code) { 
	 try {
		 msg = "update test set title=?, pay=?, gender=?, wdate=sysdate where code=? ";
		 PST = CN.prepareStatement(msg);
		 	 PST.setString(1, a);
		 	 PST.setInt(2, b);
		 	 PST.setString(3, gen);
		 	 PST.setInt(4, code);
		 PST.executeUpdate();
	 }catch(Exception e){System.out.println("Error " + e.toString());}
 }//end
 
 public int dbCount( ){ 
   try{
	 msg="select count(*) as cnt from test ";
	 ST=CN.createStatement();
	 RS=ST.executeQuery(msg);
	 RS.next(); Gtotal = RS.getInt("cnt");
   }catch(Exception e){System.out.println("Error " + e.toString());}
  return Gtotal;
 }//end
 

 public ArrayList<TestDTO>  dbList( ){ 
	ArrayList<TestDTO> aList = new ArrayList<TestDTO>(); 
   try{
    ST = CN.createStatement();
    msg = "select * from test  order by title asc" ;  
    RS = ST.executeQuery( msg );  
 	   while(RS.next()==true){
 	  	 TestDTO dto = new TestDTO();
 	  	  dto.setTitle(RS.getString("title"));
 	  	  dto.setPay(RS.getInt("pay"));
 	  	  dto.setGender(RS.getString("gender"));
 	  	  dto.setWdate(RS.getDate("wdate"));
 	  	  dto.setCode(RS.getInt("code")); 
 	  	  dto.setImg_file_name(RS.getString("img_file_name"));
 	  	  aList.add(dto);
 	   }//while end
   }catch(Exception e){System.out.println("Error " + e.toString());}
   return aList;
 }//end	

 public  TestDTO  dbDetail(int data) { 
	TestDTO dto = new TestDTO(); 
	 try {
		 msg = "select * from test  where code = "  + data ;
		 System.out.println("TestSQL.java dbDetail " +  msg);
		 ST = CN.createStatement();
	   RS = ST.executeQuery( msg );
	   if(RS.next()==true){ 
 	  	  dto.setTitle(RS.getString("title"));
 	  	  dto.setPay(RS.getInt("pay"));
 	  	  dto.setGender(RS.getString("gender"));
 	  	  dto.setWdate(RS.getDate("wdate"));
 	  	  dto.setCode(RS.getInt("code")); 
 	  	  dto.setImg_file_name(RS.getString("img_file_name"));
 	   }//if end
	 }catch(Exception e){System.out.println("Error " + e.toString());}
	 return dto;
 }//end


 ////////////////////////////////////////////////////////////////////////////////////
 public void test( ) {
	 try {
		 
	 }catch(Exception e){System.out.println("Error " + e.toString());}
 }//end
	
}//TestSQL class END








