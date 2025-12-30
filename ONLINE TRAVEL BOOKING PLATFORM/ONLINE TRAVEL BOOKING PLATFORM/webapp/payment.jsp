<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Payment</title>
</head>
<body>

<h2>Payment</h2>

<form action="pay" method="post">
    Payment Method:
    <select name="paymentMethod">
        <option value="CARD">Card</option>
        <option value="UPI">UPI</option>
        <option value="NETBANKING">Net Banking</option>
    </select>
    <br><br>

    <button type="submit">Pay Now</button>
</form>

<% if (request.getAttribute("error") != null) { %>
    <p style="color:red;"><%= request.getAttribute("error") %></p>
<% } %>

</body>
</html>
