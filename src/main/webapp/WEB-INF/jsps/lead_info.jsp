<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead info</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<h2> Lead Info</h2>
<hr>
		<pre>
		
		FirstName:${lead.firstName}<br/>
	LastName:${lead.lastName}<br/>
	Email:${lead.email}<br/>
	LeadSource:${lead.leadSource}<br/>
	mobile:${lead.mobile}<br/>
	
	<form action ="sendEmail"  method="post">
	 <input type="hidden" name="email"  value="${lead.email}"/> 
	  <input type="submit" value="send email"/> 
	</form>
		
		<form action ="contacttocontact"  method="post">
	 <input type="hidden" name="id"  value="${lead.id}"/> 
	  <input type="submit" value="convert"/> 
	</form>
		
		
		
		</pre>


</hr>
</body>
</html>