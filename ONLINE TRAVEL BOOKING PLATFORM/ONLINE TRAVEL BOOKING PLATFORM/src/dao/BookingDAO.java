package dao;

import model.Booking;
import java.sql.*;

public class BookingDAO {

    public int createBooking(Booking booking, Connection con) throws Exception {

        String sql = "INSERT INTO bookings(user_id, booking_type, reference_id, " +
                     "total_amount, booking_date, status) VALUES(?,?,?,?,?,?)";

        try (PreparedStatement ps =
                     con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, booking.getUserId());
            ps.setString(2, booking.getBookingType());
            ps.setInt(3, booking.getReferenceId());
            ps.setDouble(4, booking.getTotalAmount());
            ps.setString(5, booking.getBookingDate());
            ps.setString(6, booking.getStatus());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1); // booking_id
            }
        }
        return -1;
    }
}
