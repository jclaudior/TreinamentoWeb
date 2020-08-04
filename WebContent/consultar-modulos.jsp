<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  prefix="fmt"  uri = "http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="br.com.rdevs.model.Modulo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<title>Consulta Modulos</title>
</head>
<body>
	<table class="table">
		<tr>
			<th>Nome Modulo</th>
			<th>Instrutor Titular</th>
			<th>Instrutor Auxiliar</th>
			<th>Data Inicio</th>
		</tr>
		<c:forEach var="modulo" items="${modulos}"> 
		<tr>
			<td><c:out value="${modulo.getDsNome()}"></c:out></td>
			<td><c:out value="${modulo.getDsInstrutorTitular()}"></c:out></td>
			<td><c:out value="${modulo.getDsInstrutorAuxiliar()}"></c:out></td>
			<td><fmt:formatDate  value="${modulo.getDtInicio()}"  pattern="dd/MM/yyyy"/></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>