<%@page import="com.chris.web.model.Maven" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% 
	
	Maven m = (Maven) request.getAttribute("maven");
	
	
	out.println(m);
	
	
	
	
	%>
</body>
</html>