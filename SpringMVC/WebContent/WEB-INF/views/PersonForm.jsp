<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>New/Edit Contact</title>
	<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>
	<link rel="Stylesheet" href="${pageContext.request.contextPath}/layout/styles/contactStyle.css">
</head>
<body>
	<div align="center">
		<h1 id="editContact">New Contact</h1>
		<form:form action="savePerson" method="post" modelAttribute="Person">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Surname:</td>
				<td><form:input path="surname" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Save" class="btn"></td>
			</tr>
		</table>
		</form:form>
		<a class="blueLink" id="backLink" href="person">Voltar</a>
	</div>
</body>
</html>