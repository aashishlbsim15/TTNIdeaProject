<%--
  Created by IntelliJ IDEA.
  User: hackerfreak
  Date: 30/6/17
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
</head>
<body>

<%
    out.println("hellos");
    String s=request.getSession().getAttribute("newUser").toString();
    out.print(s);
%>

<form name="saveBlogForm" action="/saveuserblog" method="post" onsubmit="return callFunc()">
    <input type="text" name="title">
    <input type="textarea" name="blogContent">
    <input type="submit" name="save blog" value="save blog">
</form>
<%@include file="logout.jsp"%>

<script src="loggedInScreenJS.js"></script>
</body>
</html>
