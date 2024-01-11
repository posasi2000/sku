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


//https://kr.ncsoft.com/kr/whatWeCreate/lineage.do
//https://kr.ncsoft.com/kr/index.do

@WebServlet("/rain.do") 
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doUser(request, response);
		System.out.println("TestController.java doGet(1,2)");
	}//end

	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doUser(request, response);  
		System.out.println("TestController.java doPost(1,2)");
	}//end
	
	public  void doUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<img src=images/bar.gif><p>");
		out.println("<img src=images/bar.gif><p>");
		
	    
	    out.println("<h2>");
		out.println("<a href='./bbs/index.jsp'>[index]</a>");
		out.println("<a href='testWrite.jsp'>[Write]</a>");
		out.println("<a href='book.jsp'>[book]</a>");
		out.println("</h2>");
		System.out.println("TestController.java doUser(1,2)");
	}//end

}//TestController class END




