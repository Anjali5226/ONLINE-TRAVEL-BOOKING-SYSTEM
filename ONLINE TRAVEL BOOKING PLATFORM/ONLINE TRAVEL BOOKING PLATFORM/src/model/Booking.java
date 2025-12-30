package model;

public class Booking {

    private int bookingId;
    private int userId;
    private String bookingType;   // FLIGHT / HOTEL / CAR
    private int referenceId;      // flightId / hotelId / carId
    private double totalAmount;
    private String bookingDate;
    private String status;

    public Booking() {}

    public Booking(int bookingId, int userId, String bookingType,
                   int referenceId, double totalAmount,
                   String bookingDate, String status) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.bookingType = bookingType;
        this.referenceId = referenceId;
        this.totalAmount = totalAmount;
        this.bookingDate = bookingDate;
        this.status = status;
    }

    public int getBookingId() {
        return bookingId;
    }
 
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
 
    public int getUserId() {
        return userId;
    }
 
    public void setUserId(int userId) {
        this.userId = userId;
    }
 
    public String getBookingType() {
        return bookingType;
    }
 
    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }
 
    public int getReferenceId() {
        return referenceId;
    }
 
    public void setReferenceId(int referenceId) {
        this.referenceId = referenceId;
    }
 
    public double getTotalAmount() {
        return totalAmount;
    }
 
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
 
    public String getBookingDate() {
        return bookingDate;
    }
 
    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }
 
    public String getStatus() {
        return status;
    }
 
    public void setStatus(String status) {
        this.status = status;
    }
}
