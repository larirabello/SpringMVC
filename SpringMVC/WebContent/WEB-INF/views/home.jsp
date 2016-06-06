<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Manager Home</title>
		<link rel="Stylesheet" href="${pageContext.request.contextPath}/layout/styles/contactStyle.css">
    </head>
    <body>
    	<div align="center">
	        <h1>Contact List</h1>
	        <h3><a  href="newContact">New Contact</a></h3>
	        <span id="myButton">texto</span>
	        <table  border="1">
	        	<th>No</th>
	        	<th>Name</th>
	        	<th>Email</th>
	        	<th>Address</th>
	        	<th>Telephone</th>
	        	<th>Action</th>
	        	
				<c:forEach var="contact" items="${listContact}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${contact.name}</td>
					<td>${contact.email}</td>
					<td>${contact.address}</td>
					<td>${contact.telephone}</td>
					<td>
						<a href="editContact?id=${contact.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="deleteContact?id=${contact.id}">Delete</a>
					</td>
							
	        	</tr>
				</c:forEach>	        	
			</table>
			
			
			<!-- MODAL -->
			
			<div class="remodal" data-remodal-id="modal" role="dialog" aria-labelledby="modal1Title" aria-describedby="modal1Desc">
			  <button data-remodal-action="close" class="remodal-close" aria-label="Close"></button>
			  <div>
			    <h2 id="modal1Title">Remodal</h2>
			    <p id="modal1Desc">
			      Are you sure?
			    </p>
			  </div>
			  <br>
			  <button data-remodal-action="cancel" class="remodal-cancel"><a href="editContact?id=${contact.id}">Edit</a></button>
			  <button data-remodal-action="confirm" class="remodal-confirm"><a href="deleteContact?id=${contact.id}">Delete</a></button>
			</div>
    </body>

</html>
