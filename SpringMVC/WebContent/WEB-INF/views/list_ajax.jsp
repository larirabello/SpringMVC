<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


				<tr>
				      <th>Name</th>
				      <th>Surname</th>
				</tr>
				 
				<c:forEach var="person" items="${listPerson}" varStatus="status">
				  <tr>
				    <td>${person.name}</td>
				    <td>${person.surname}</td>
				  </tr>
				</c:forEach>