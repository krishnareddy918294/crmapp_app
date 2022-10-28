
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leads</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<a href="viewleading">Create new Lead</a>
<h2>All Leads</h2>


       <table>
           
           
     <tr>
     
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>email</th>
<th>LeadSource</th>
<th>mobile</th>
<th>Billings</th>


 </tr>
 
<c:forEach var="contact" items="${contact}">

    <tr>
    
<td>${contact.id}</td>
<td><a href="getcontactId?id=${contact.id}"> ${contact.firstName}</a></td>
<td>${contact.lastName}</td>
<td>${contact.leadSource}</td>

<td>${contact.mobile}</td>
<td><a href="Delete?id=${contact.id}">delete</a></td>
<td><a href="getLeadInfo?id=${contact.id}">edit</a></td>
<td><a href="getidByBillings?id=${contact.id}"> BILLINGS</a></td>

     </tr>
    
      
</c:forEach>


 
</table>


</body>
</html>