
<%@ taglib prefix="c"  uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <br/>
   <c:out value="JSTL Tag "/> 
    <br/>
         ${str}
      <c:set var="str" value="Munyi manó gombahazban lakik"></c:set>
      <c:out value="${str}"></c:out>
      <c:out value="${fn:length(str)}"></c:out>
      
      <c:forEach items="${fn:split(str,' ')}" var = "s">
          <c:out value="${s}"></c:out>
           <br/>
      </c:forEach>  
          <br/>
       index : A nó lokációja  ${fn:indexOf(str,"nó")}    
       <c:if test="${fn:contains(str,'nó')}">
          nó present
       </c:if>
</body>
</html>