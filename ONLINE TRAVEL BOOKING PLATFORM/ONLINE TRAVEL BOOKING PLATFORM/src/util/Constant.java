package util;

public class Constant {

    // DB Constants
    public static final String DB_URL = "jdbc:mysql://localhost:3306/onlinetravelbooking?useSSL=false&serverTimezone=UTC";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "root";

    // Status Constants
    public static final String STATUS_PENDING = "PENDING";
    public static final String STATUS_SUCCESS = "SUCCESS";
    public static final String STATUS_FAILED = "FAILED";

    // Roles
    public static final String ROLE_USER = "USER";
    public static final String ROLE_ADMIN = "ADMIN";

    // Messages
    public static final String MSG_LOGIN_FAILED = "Invalid email or password";
    public static final String MSG_PAYMENT_FAILED = "Payment Failed!";
    public static final String MSG_BOOKING_SUCCESS = "Booking Successful!";
}
