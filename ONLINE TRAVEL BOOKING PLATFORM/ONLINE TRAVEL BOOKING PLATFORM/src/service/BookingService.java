package service;

import dao.BookingDAO;
import model.Booking;

import java.sql.Connection;

public class BookingService {

    private BookingDAO bookingDAO;

    public BookingService() {
        bookingDAO = new BookingDAO();
    }

    // Used inside transaction
    public int createBooking(Booking booking, Connection con) throws Exception {
        return bookingDAO.createBooking(booking, con);
    }
}
