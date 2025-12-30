package util;

import java.util.regex.Pattern;

public class Validator {

    // Validate email
    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(regex, email);
    }

    // Validate password (min 6 chars, at least one number)
    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[0-9]).{6,}$";
        return Pattern.matches(regex, password);
    }

    // Validate name (letters + space only)
    public static boolean isValidName(String name) {
        String regex = "^[A-Za-z ]+$";
        return Pattern.matches(regex, name);
    }

    // Validate amount > 0
    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }
}
