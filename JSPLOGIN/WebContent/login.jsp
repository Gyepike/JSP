<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="CSS/style.css">
  
<body>
  

   <div class="bgr">
       <%=request.getContextPath()%>/nev
       <form action="<%=request.getContextPath()%>/nev" method="POST">
          <div class="container">
            <div class="row">
             	 <div class="col" style="witdh: 100px;">
                	   <b>User Name</b>
             	 </div>
              	<div class="col"> 
              		<input type="text"  placeholder="Enter your userame" name="username" required>
             	 </div> 
            </div>
            
             <div class="row">
             	 <div class="col">
                	   <b>Password </b>
             	 </div>
              	<div class="col"> 
              		<input type="password"  placeholder="Enter your password" name="password" required>
             	 </div> 
            </div>
         
              <div class="row">
             	 <div class="col"> 
             	 </div>
              	<div class="col"> 
             	 </div> 
            </div>
         
             <div class="row">
             	 <div class="col"> 
             	 </div>
              	<div class="col"> 
              		 <button type="submit">Login</button>
             	 </div> 
            </div>
          </div> 
       </form>
   </div>
   </body>
</body>
</html>