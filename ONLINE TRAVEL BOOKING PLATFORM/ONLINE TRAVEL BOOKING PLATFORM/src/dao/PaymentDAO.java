package dao;

import model.Payment;
import java.sql.*;

public class PaymentDAO {

    // Insert payment (used inside transaction)
    public boolean createPayment(Payment payment, Connection con) throws Exception {

        String sql = "INSERT INTO payments " +
                     "(booking_id, amount, payment_method, payment_status, payment_date) " +
                     "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, payment.getBookingId());
            ps.setDouble(2, payment.getAmount());
            ps.setString(3, payment.getPaymentMethod());
            ps.setString(4, payment.getPaymentStatus());
            ps.setDate(5, new java.sql.Date(payment.getPaymentDate().getTime()));

            return ps.executeUpdate() > 0;
        }
    }

    // Update payment status (SUCCESS / FAILED / REFUNDED)
    public boolean updatePaymentStatus(int paymentId, String status) {

        String sql = "UPDATE payments SET payment_status=? WHERE payment_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, status);
            ps.setInt(2, paymentId);

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Get payment by booking ID
    public Payment getPaymentByBookingId(int bookingId) {

        Payment payment = null;
        String sql = "SELECT * FROM payments WHERE booking_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, bookingId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                payment = new Payment();
                payment.setPaymentId(rs.getInt("payment_id"));
                payment.setBookingId(rs.getInt("booking_id"));
                payment.setAmount(rs.getDouble("amount"));
                payment.setPaymentMethod(rs.getString("payment_method"));
                payment.setPaymentStatus(rs.getString("payment_status"));
                ps.setDate(5, new java.sql.Date(payment.getPaymentDate().getTime()));
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
        return payment;
    }
}
    
