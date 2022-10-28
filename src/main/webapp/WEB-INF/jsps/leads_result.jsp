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
<th>LeadSource</th>th
<th>mobile</th>


 </tr>
 
<c:forEach var="leads" items="${leads}">

    <tr>
    
<td>${leads.id}</td>
<td><a href="getLeadById?id=${leads.id}"> ${leads.firstName}</a></td>
<td>${leads.lastName}</td>
<td>${leads.leadSource}</td>

<td>${leads.mobile}</td>
<td><a href="Delete?id=${leads.id}">delete</a></td>
<td><a href="getLeadInfo?id=${leads.id}">edit</a></td>

     </tr>
    
      
</c:forEach>


 
</table>


</body>
</html>