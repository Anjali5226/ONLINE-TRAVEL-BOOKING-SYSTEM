package controller;

import model.Booking;
import model.Payment;
import service.PaymentService;
import service.EmailNotificationThread;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/pay")
public class PaymentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        Booking booking = (Booking) session.getAttribute("booking");

        if (booking == null) {
            resp.sendRedirect("dashboard.jsp");
            return;
        }

        Payment payment = new Payment();
        payment.setAmount(booking.getTotalAmount());
        payment.setPaymentMethod(req.getParameter("paymentMethod"));
        payment.setPaymentStatus("SUCCESS");

        PaymentService service = new PaymentService();
        boolean result = service.processPayment(booking, payment);

        if (result) {
            // Send email asynchronously
            EmailNotificationThread email =
                    new EmailNotificationThread(
                            "user@email.com",
                            "Your booking is confirmed!"
                    );
            email.start();

            session.removeAttribute("booking");
            resp.sendRedirect("success.jsp");
        } else {
            req.setAttribute("error", "Payment Failed");
            req.getRequestDispatcher("payment.jsp").forward(req, resp);
        }
    }
}
