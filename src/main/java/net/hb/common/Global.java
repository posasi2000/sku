package net.hb.common;

import java.sql.* ;
import java.util.Date ;
import com.oreilly.servlet.MultipartRequest ;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy ;


public class Global {
	 public Connection CN; 
	 public Statement ST; 
	 public PreparedStatement PST; 
	 public ResultSet RS; 
	 
	 public int Gsabun, Gpay, Gcode ;
	 public String Gname, Gtitle, Gemail, Ggender ;
	 public java.util.Date  Gwdate;
	 
	 public int Ghit, Gtotal, Stotal ;
	 public String msg ;  //msg="insert~/select~/update~/delete~"
	 public String data ;  //data=request.getParameter("idx");  
	 public String Gimage; //img_file_name
	 public MultipartRequest mr ;
	 public DefaultFileRenamePolicy dr;
	 public Date wdate ;
	 //public ArrayList aList;
	 //public ArrayList alist;
	 
}//Global class END


