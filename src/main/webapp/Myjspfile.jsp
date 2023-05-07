

<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> This is HTML code</h1>
<%-- This is comment--%>
<% System.out.print("This is java\n");%>
<% int a=5;
System.out.println(a);
%>


<%! int a=8; %>
<%System.out.println(this.a); %>

<% List<Integer> list=Arrays.asList(4,7,7,8,9);
System.out.println(list);
%>
<%response.getWriter().print("<h1>"+list+"</h1>"); %>
<% out.print("<h1>"+list+"</h1>"); %>
<h1><%=list %></h1>
<%@ include file="index.jsp" %>
</body>
</html>