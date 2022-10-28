<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing lead</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<h2> Billing| Billing lead</h2>
<hr>
<form action="GenearteBilling" method="post">
       
       <pre>
       			 
       			 FIRSTNAME:<input type="text" name="firstName" value=${contacts.firstName} >
       LASTNAME:<input type="text" name="lastName" value=${contacts.lastName} >
         email:<input type="email" name="email" value=${contacts.email} >
		  mobile:<input type="mobile" name="mobile" value=${contacts.mobile} >
		  product<input type="text" name="product"/>
		  Ammount<input type="number" name="ammount"/>
		  Mode of Payment:
		  Cash<input type="radio"  name="mode" value="cash"/>
		  Online<input type="radio"  name="mode" value="online"/>
		  
		 <input type="submit" value="generate"/>
       
       
       </form>
       
       
       </pre>
       





</form>
</body>
</html>