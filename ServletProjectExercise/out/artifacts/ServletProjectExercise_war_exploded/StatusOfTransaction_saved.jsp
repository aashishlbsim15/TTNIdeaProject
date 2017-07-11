<%--
  Created by IntelliJ IDEA.
  User: hackerfreak
  Date: 4/7/17
  Time: 10:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    window.alert("data saved successfully");
</script>
<%
    RequestDispatcher dispatcher=request.getRequestDispatcher("loggedInScreen.jsp");
    dispatcher.include(request,response);
%>
</body>
</html>
