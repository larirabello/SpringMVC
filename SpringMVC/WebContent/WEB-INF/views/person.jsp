<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Manager Home</title>
		<link rel="Stylesheet" href="${pageContext.request.contextPath}/layout/styles/contactStyle.css">
    </head>
    <body>
    	<div align="center">
	        <h1>Person List</h1>
	        <h3><a  href="newPerson">New Person</a></h3>
	        <form:form action="searchPerson" method="get" modelAttribute="person">
			    <form:label path="name">First name</form:label>
			    <form:input path="name" />
			    <br />
			
    			<input type="submit" value="Submit" />
			</form:form>

	        <table  border="1">
	        	<tr>
		        	<th>Name</th>
		        	<th>Surname</th>
	        	</tr>
				<c:forEach var="person" items="${listPerson}">
	        	<tr>
					<td>${person.name}</td>
					<td>${person.surname}</td>							
	        	</tr>
				</c:forEach>	        	
			</table>
		</div>
    </body>

</html>
