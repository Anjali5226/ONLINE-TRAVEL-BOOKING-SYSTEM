<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h2>User Login</h2>

<form action="login" method="post">
    Email: <input type="email" name="email" required /><br><br>
    Password: <input type="password" name="password" required /><br><br>
    <button type="submit">Login</button>
</form>

<% if (request.getAttribute("error") != null) { %>
    <p style="color:red;"><%= request.getAttribute("error") %></p>
<% } %>

</body>
</html>
