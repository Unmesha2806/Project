<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="x" value="3"/>
	<c:choose>
	<c:when test="${x==1}">
		<c:out value="First Choice"/>
	</c:when>
	
	<c:when test="${x==2}">
		<c:out value="Second Choice"/>
	</c:when>
	<c:when test="${x==3}">
		<c:out value="Third Choice"/>
	</c:when>
	<c:when test="${x==4}">
		<c:out value="Fourth Choice"/>
	</c:when>
	</c:choose>
</body>
</html>