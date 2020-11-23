<%@ page language="java" contentType="text/html "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Alien</title>
        <style type="text/css">
            label{ margin-right:20px;}
            input{ margin-top:5px;}
        </style>
</head>
  <body>
    <jsp:include page="my-header.html"></jsp:include>
     <form action="nev" method="GET">
        <fieldset>
		       Stdent id: <input type="text" name="id">
		       <br/>
		       First name : <input type="text" name="firstName">
		       <br/>
		       Last name : <input type="text" name="lastName">
		       <br/>
		       <input type="submit" value="Nyomd Meg"> 
	     </fieldset>   
     </form>
     <jsp:include page="my-footer.jsp"></jsp:include>
  </body>
<html> 