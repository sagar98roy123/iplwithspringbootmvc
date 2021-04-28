<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Details for ${season} for ${teamName}</title>
</head>
<body>
	<h1>Details for ${season} for ${teamName}</h1>
	<c:forEach var="data" items="${seasonData}">
		<h3>${data.team1} VS ${data.team2}</h3>
		<p>${data.date}</p>
		<p>${data.venue}</p>
		<a href="/${data.id}"><button>Get Details</button></a>
	</c:forEach>
</body>
</html>