package net.hb.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext; //application����
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest ;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import net.hb.test.TestSQL;


@WebServlet("/awsInsert.do") 
public class TestInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doUser(request, response);
		System.out.println("\nTestInsertController.java doGet ");
	}//end

	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doUser(request, response);
		System.out.println("\nTestInsertController.java doPost");
	}//end
	
	public  void doUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		  
		 ServletContext  ct  = this.getServletContext(); 
		 String path  = ct.getRealPath("storage");  
		 System.out.println( path);
		 
		 int size = 1024*1024*7; 
		 MultipartRequest mr = new MultipartRequest(request,path,size,"UTF-8");
		
		 
	    String dtitle = mr.getParameter("title");
	    int dpay = Integer.parseInt(mr.getParameter("pay"));
	    String dgender = mr.getParameter("gender");
	    String dfile= mr.getFilesystemName("file1"); 
	    
	    System.out.println("TestInsertContrller.java dtitle = "+ dtitle);
	    System.out.println("TestInsertContrller.java dpay= "+ dpay);
	    System.out.println("TestInsertContrller.java dgender = "+ dgender);
	    System.out.println("TestInsertContrller.java dfile= "+ dfile);
	    
	    TestSQL ts = new TestSQL();
	    ts.dbInsert(dtitle, dpay, dgender, dfile);
	    response.sendRedirect("testList.jsp");
	    
		out.println("<hr><h2>");
		out.println("<a href='testList.jsp'>[testList]</a>");
		out.println("<a href='testWrite.jsp'>[Write]</a>");
		out.println("<a href='#'>[test]</a>");
		out.println("</h2>");
	}//end

}//TestInsertController class END




