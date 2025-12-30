<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="model.User" %>

<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<html>
<head>
    <title>Dashboard</title>
</head>
<body>

<h2>Welcome, <%= user.getName() %></h2>

<ul>
    <li><a href="search?type=flight">Search Flights</a></li>
    <li><a href="search?type=hotel">Search Hotels</a></li>
</ul>

<a href="booking.jsp">Go to Booking</a>

</body>
</html>
