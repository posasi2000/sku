package net.hb.mvc;

import java.io.IOException;
import java.io.PrintWriter; //�߰���

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//https://kr.ncsoft.com/kr/whatWeCreate/lineage.do
//https://kr.ncsoft.com/kr/index.do
@WebServlet("/lineage.do")
public class GameController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   doUser(request,response); 
	}//end

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doUser(request,response); 
	}//end

	public void doUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<h2>GameController.java</h2>");
		out.println("<img src=images/aaa.gif>");  
		out.println("<img src=images/aaa.gif>");
		out.println("<img src=images/aaa.gif> <p>");
		
		//String mytitle =  request.getParameter("title");
		//String mypay =  request.getParameter("pay");
		
		out.println("<h3>");
		out.println("<a href='Input1.html'>[Input1.html]</a>");
		out.println("<a href='testWrite.jsp'>[testWrite.jsp]</a>");
		out.println("<a href='testList.jsp'>[testList.jsp]</a>");
		out.println("</h3>");
	}//end

}//class END









