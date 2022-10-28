<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save lead</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<h2> Lead | save lead</h2>
<hr>
<form action="savelead" method="post">
       
       <pre>
       			 
       			 FIRSTNAME:<input type="text" name="firstName"/>
       LASTNAME:<input type="text" name="lastName"/>
         email:<input type="email" name="email"/>
		    LEADSOURCE :<select name="leadSource" >
		  <option value="volvo">Volvo</option>
		  <option value="saab">Saab</option>
		  <option value="mercedes">Mercedes</option>
		  <option value="audi">Audi</option>
		  </select>
				mobile:<input type="mobile" name="mobile"/>
		 <input type="submit" value="save"/>
       
       
       </form>
       
       
       </pre>
       





</form>
</body>
</html>