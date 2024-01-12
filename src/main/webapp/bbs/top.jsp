<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title> </title>
  <link rel="stylesheet" type="text/css" href="../css/style.css">
</head>

<div>
 <img src='../images/carousel1.jpg' width='100%' height='200px'  id='topIMG'>  
 <nav id="topMenu">
   <ul>
      <li><a class='menuLink' href='index.jsp'>index</a></li>
      <li><a class='menuLink' href='bbsList.jsp'>bbsList</a></li>
      <li><a class='menuLink' href='input.html'>input</a></li>
      <li><a class='menuLink' href='bbsImgList.jsp'>bbsImage</a></li> 
      <li><a class='menuLink' href='login.jsp'>login</a></li> 
      <%
        String data = (String)session.getAttribute("naver");
        if (data==null || data==""){ }
        else{
           //out.print( "<font color=yellow><b>" +data +" welcome</b></font>");
       %>
        <li> <span><%=data %>님접속</span> </li> 
        	 
      <% } %>
       
   </ul>	  
 </nav>
</div>
