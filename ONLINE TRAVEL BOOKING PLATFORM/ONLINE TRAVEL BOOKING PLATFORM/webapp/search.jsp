<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Flight, model.Hotel" %>

<html>
<head>
    <title>Search</title>
</head>
<body>

<h2>Search Travel Options</h2>

<form action="search" method="get">
    Search Type:
    <select name="type">
        <option value="flight">Flight</option>
        <option value="hotel">Hotel</option>
    </select>
    <br><br>
    <button type="submit">Search</button>
</form>

<hr>

<%
    List<?> results = (List<?>) request.getAttribute("results");

    if (results != null && !results.isEmpty()) {
        Object first = results.get(0);

        if (first instanceof Flight) {
%>
            <h3>Available Flights</h3>
            <table border="1">
                <tr>
                    <th>ID</th>
                    <th>Source</th>
                    <th>Destination</th>
                    <th>Departure</th>
                    <th>Price</th>
                    <th>Action</th>
                </tr>
                <%
                    for (Object obj : results) {
                        Flight f = (Flight) obj;
                %>
                <tr>
                    <td><%= f.getFlightId() %></td>
                    <td><%= f.getSource() %></td>
                    <td><%= f.getDestination() %></td>
                    <td><%= f.getDepartureTime() %></td>
                    <td><%= f.getPrice() %></td>
                    <td>
                        <form action="booking.jsp" method="get">
                            <input type="hidden" name="bookingType" value="FLIGHT" />
                            <input type="hidden" name="refId" value="<%= f.getFlightId() %>" />
                            <input type="hidden" name="amount" value="<%= f.getPrice() %>" />
                            <button type="submit">Book</button>
                        </form>
                    </td>
                </tr>
                <% } %>
            </table>
<%
        } else if (first instanceof Hotel) {
%>
            <h3>Available Hotels</h3>
            <table border="1">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Location</th>
                    <th>Price / Night</th>
                    <th>Action</th>
                </tr>
                <%
                    for (Object obj : results) {
                        Hotel h = (Hotel) obj;
                %>
                <tr>
                    <td><%= h.getHotelId() %></td>
                    <td><%= h.getName() %></td>
                    <td><%= h.getLocation() %></td>
                    <td><%= h.getPricePerNight() %></td>
                    <td>
                        <form action="booking.jsp" method="get">
                            <input type="hidden" name="bookingType" value="HOTEL" />
                            <input type="hidden" name="refId" value="<%= h.getHotelId() %>" />
                            <input type="hidden" name="amount" value="<%= h.getPricePerNight() %>" />
                            <button type="submit">Book</button>
                        </form>
                    </td>
                </tr>
                <% } %>
            </table>
<%
        }
    } else if (request.getParameter("type") != null) {
%>
        <p>No results found.</p>
<%
    }
%>

<br>
<a href="dashboard.jsp">⬅ Back to Dashboard</a>

</body>
</html>
