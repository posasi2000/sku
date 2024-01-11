package net.hb.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PhotoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		System.out.println("<h2>PhotoController.java  doGet(1,2) </h2>");
		out.println("<img src=images/main_4.jpg> <p>");
		
		
		out.println("<h4>");
		out.println("<a href='Input1.html'>[Input1]</a>");
		out.println("<a href='testWrite.jsp'>[testWrite]</a>");
		out.println("<a href='testList.jsp'>[testList]</a>");
		out.println("<a href='lineage.do'>[lineage.do]</a>");
		out.println("</h4>");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("<h2>PhotoController.java  doPost(1,2) </h2>");
	}
	  
}//class END
