<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="org.charlie.javabrains.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Correct</title>
</head>
<body>
Welcome 
<%
//User user = (User)request.getSession().getAttribute("user");
User user = (User)session.getAttribute("user");
out.println(user.getUserName());
%>!

<%= user.getUserId() %>
</body>
</html>