<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Booking</title>
</head>
<body>

<h2>Booking Details</h2>

<form action="book" method="post">

    Booking Type:
    <select name="bookingType">
        <option value="FLIGHT">Flight</option>
        <option value="HOTEL">Hotel</option>
        <option value="CAR">Car</option>
    </select>
    <br><br>

    Reference ID:
    <input type="number" name="refId" required />
    <br><br>

    Amount:
    <input type="number" name="amount" step="0.01" required />
    <br><br>

    <button type="submit">Proceed to Payment</button>

</form>

</body>
</html>
