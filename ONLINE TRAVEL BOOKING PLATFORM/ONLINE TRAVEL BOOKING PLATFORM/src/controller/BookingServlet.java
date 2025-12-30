package controller;

import model.Booking;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Date;

@WebServlet("/book")
public class BookingServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        User user = (User) session.getAttribute("user");

        if (user == null) {
            resp.sendRedirect("login.jsp");
            return;
        }

        Booking booking = new Booking();
        booking.setUserId(user.getUserId());
        booking.setBookingType(req.getParameter("bookingType"));
        booking.setReferenceId(Integer.parseInt(req.getParameter("refId")));
        booking.setTotalAmount(Double.parseDouble(req.getParameter("amount")));
        booking.setBookingDate(new Date().toString());
        booking.setStatus("PENDING");

        session.setAttribute("booking", booking);
        resp.sendRedirect("payment.jsp");
    }
}
