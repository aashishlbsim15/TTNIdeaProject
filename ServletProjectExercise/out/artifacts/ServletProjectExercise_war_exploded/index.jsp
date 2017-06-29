<%--
  Created by IntelliJ IDEA.
  User: hackerfreak
  Date: 27/6/17
  Time: 10:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Login Form</title>

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
  <link rel="stylesheet" href="mycss.css">





</head>

<body>
<div class="login">
  <h1>Login</h1>
  <form method="post">
    <input type="text" name="u" placeholder="Username" required="required" />
    <input type="password" name="p" placeholder="Password" required="required" />
    <button type="submit" class="btn btn-primary btn-block btn-large">Let me in.</button>
  </form>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>
<script src="js/index.js"></script>

</body>
</html>

