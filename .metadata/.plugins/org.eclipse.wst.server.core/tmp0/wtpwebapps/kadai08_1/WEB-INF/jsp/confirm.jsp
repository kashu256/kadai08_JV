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
//データの引っこ抜き
String id = request.getAttribute("id").toString();
String name = request.getAttribute("name").toString();
String price = request.getAttribute("price").toString();
List<String> cb = (List<String>)request.getAttribute("cb");
List<String> err = (List<String>)request.getAttribute("err");
%>
<label>ID:<%= id %></label><br>
<label>Name:<%= name %></label><br>
<label>Price:<%= price %></label><br>
<label>Type:<% for(String checkbox : cb){%>
	<%= checkbox%>
<%} %></label><br>
<label><font color="red"><% for(String errs :err){ %>
	<%= errs %><br>
<%} %></font></label>
<p><a href="index.html">index</a></p>
</body>
</html>