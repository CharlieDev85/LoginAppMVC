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

//version using session
//User user = (User)session.getAttribute("user");

//version using Dispatcher
//User user =(User) request.getAttribute("user");
//out.println(user.getUserName());
%>!

<%--version using JSTL--%>
<%--It does the same than Dispatcher--%>
<jsp:useBean id="user" class="org.charlie.javabrains.dto.User" scope="request">
	<jsp:setProperty property="userName" name="user" value="NewUserOrGuest"/>
</jsp:useBean>

<br>
<%= user.getUserId() %>

<br>

Hello <jsp:getProperty property="userName" name="user" ></jsp:getProperty>
</body>
</html>