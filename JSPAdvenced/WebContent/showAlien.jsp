<%@page import="com.anti.JSPAdvenced.web.Alien"%>
<%@page  import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  pageContext.setAttribute("mano1", "Munyi", PageContext.APPLICATION_SCOPE); 
	pageContext.setAttribute("mano2", "Munyo", PageContext.PAGE_SCOPE);

%>
<jsp:include page="my-header.html"></jsp:include>
 
   <%
   
      Alien a1 =(Alien) request.getAttribute("alien");
      out.println(a1.toString());
      out.println(application.getAttribute("mano1"));
      out.println(pageContext.getAttribute("mano2"));
   %>
   
<jsp:include page="my-footer.jsp"></jsp:include>
</body>
</html>