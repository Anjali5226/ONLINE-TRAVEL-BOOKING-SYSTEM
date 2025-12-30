package model;

import java.util.Date;

public class Payment {
    private int paymentId;
    private int bookingId;
    private double amount;
    private String paymentMethod;
    private String cardNumber;
    private String paymentStatus;
    private Date paymentDate;

    public Payment() {}

    public Payment(int paymentId, int bookingId, double amount,
                   String paymentMethod, String cardNumber,
                   String paymentStatus, Date paymentDate) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.cardNumber = cardNumber;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
