<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact info</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<h2>contact Info</h2>
<hr>
		<pre>
		
	FirstName:${contacts.firstName}<br/>
	LastName:${contacts.lastName}<br/>
	Email:${contacts.email}<br/>
	LeadSource:${contacts.leadSource}<br/>
	mobile:${contacts.mobile}<br/>
	
	<form action ="sendEmail"  method="post">
	 <input type="hidden" name="email"  value="${contacts.email}"/> 
	  <input type="submit" value="send email"/> 
	</form>
		
		
		
		
		</pre>


</hr>
</body>
</html>