<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 welcome jsp antika : <%=request.getParameter("username") + " " + "password: " + request.getParameter("password") + " " + request.getAttribute("k2")  %>

  
  The Student Name 
  <%
  
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma","no-cache");
    response.setHeader("Expires", "0");
   
  
     if(session.getAttribute("username")==null) {
    	 response.sendRedirect("login.jsp");
    	 
     }
     else {
    	    int k = 0;
    	 	if (request.getAttribute("k")!= null)
    	 	{
    	  		out.print(k); 
    	 	    k = (int) request.getAttribute("k");
    	 	}
     }
     
  %>
  
  welcome ${username}
  
  <%  request.getAttribute("k2"); %>
    <a href= "tutorials.jsp">Video open</a>
    
    
   <div class="bgr">
       <%=request.getContextPath()%>/nev
       <form action="<%=request.getContextPath()%>/Logout"  method="POST">
          <div class="container">
             <div class="row">
             	 <div class="col"> 
             	 </div>
              	<div class="col"> 
              		 <button type="submit">LogOut</button>
             	 </div> 
            </div>
          </div> 
       </form>
   </div>
</body>
</html>