<%@page import="com.java.employ.EmployDAOImpl"%>
<%@page import="com.java.employ.EmployDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int empno = Integer.parseInt(request.getParameter("empno"));
	EmployDAO dao = new EmployDAOImpl();
	out.println(dao.deleteEmployDao(empno));
%>
<jsp:forward page="ShowEmployDetails.jsp"/>
</body>
</html>