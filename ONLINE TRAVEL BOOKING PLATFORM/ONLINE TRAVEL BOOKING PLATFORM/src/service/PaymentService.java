package service;

import dao.BookingDAO;
import dao.DBConnection;
import dao.PaymentDAO;
import model.Booking;
import model.Payment;

import java.sql.Connection;
import java.util.Date;

public class PaymentService {

    private BookingDAO bookingDAO;
    private PaymentDAO paymentDAO;

    public PaymentService() {
        bookingDAO = new BookingDAO();
        paymentDAO = new PaymentDAO();
    }

    // Multi-step transaction (Booking + Payment)
    public boolean processPayment(Booking booking, Payment payment) {

        Connection con = null;

        try {
            con = DBConnection.getConnection();
            con.setAutoCommit(false); // 🔒 START TRANSACTION

            // 1️⃣ Create Booking
            int bookingId = bookingDAO.createBooking(booking, con);
            if (bookingId <= 0) {
                con.rollback();
                return false;
            }

            // 2️⃣ Set bookingId + payment date
            payment.setBookingId(bookingId);
            payment.setPaymentDate(new Date()); // ✅ CORRECT (no String)

            // 3️⃣ Create Payment
            boolean paymentResult = paymentDAO.createPayment(payment, con);
            if (!paymentResult) {
                con.rollback();
                return false;
            }

            con.commit(); // ✅ SUCCESS
            return true;

        } catch (Exception e) {
            try {
                if (con != null) con.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
            return false;

        } finally {
            try {
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
