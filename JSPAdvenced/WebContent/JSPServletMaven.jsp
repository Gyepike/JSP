<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <head>
        <title>Szulets </title>
        <style type="text/css">
            label{ margin-right:20px;}
            input{ margin-top:5px;}
        </style>
    </head>
    <body>
    
      <form action="getAlien" method="get">
            <fieldset>
                <legend>FelHasznalo Aid</legend>
                <input type="text" name="aid" /> <br/>
                <input type="submit" value="submit">
            </fieldset>
        </form>
       
        
     Time on the server <%= new java.util.Date() %>	
    </body>
</html>