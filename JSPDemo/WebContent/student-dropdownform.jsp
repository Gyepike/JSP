<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <jsp:include page="my-header.html"></jsp:include>
     <form action="student-response-dropdown.jsp" method="GET">
       First name : <input type="text" name="firstName">
       <br/>
       Last name : <input type="text" name="lastName">
       <br/>
        
       
       <br/> <br/>
        <select name="country">
          <option>Brazil</option>
   	      <option>Germany</option>
   	      <option>Turkey</option>
   	      <option>UK</option>
   	    </select>
   	    
   	    <br/> <br/>
         Favorite language 
         <input type="radio" name="programming" value="JAVA"> JAVA
         <input type="radio" name="programming" value="C++"> C++
         <input type="radio" name="programming" value="C"> C
         <input type="radio" name="programming" value="PHP"> C
         <input type="radio" name="programming" value="Python"> Python
         
         <br/> <br/>
         Favorite Anime
         <br/> <br/>
         <input type="checkbox" name="anime" value="One Piece"> One Piece
         <input type="checkbox" name="anime" value="Naruto"> Naruto
         <input type="checkbox" name="anime" value="Dead Note"> Dead Note
         <input type="checkbox" name="anime" value="Suzumiya"> Suzumiya
         <input type="checkbox" name="anime" value="She-Ra"> She-RA
         <br/> <br/>
         <input type="submit" value="Submit"> 
     </form>
     <br/> <br/>
    <jsp:include page="my-footer.jsp"></jsp:include>
</body>
</html>