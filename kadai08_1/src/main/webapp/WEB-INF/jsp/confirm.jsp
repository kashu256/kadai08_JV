<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.List" %>
<%@ page import = "jp.ac.hal.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>確認画面</h1>
<%
Product product = (Product)request.getAttribute("product");
List<String> cb = (List<String>)request.getAttribute("cb");
List<String> err = (List<String>)request.getAttribute("err");
%>
<label>ID:<%= product.getId() %></label><br>
<label>Name:<%= product.getName() %></label><br>
<label>Price:<%= product.getPrice() %></label><br>
<label>Type:<% for(String checkbox : cb){%>
	<%= checkbox%>
<%} %></label><br>
<label><font color="red"><% for(String errs :err){ %>
	<%= errs %><br>
<%} %></font></label>
<p><a href="index.html">index</a></p>
</body>
</html>