package service;

import dao.UserDAO;
import model.User;
import util.Validator;

public class AuthService {

    private UserDAO userDAO;

    public AuthService() {
        userDAO = new UserDAO();
    }

    // LOGIN logic
    public User login(String email, String password) {

        // Validation (business rule)
        if (!Validator.isValidEmail(email) || password == null || password.isEmpty()) {
            return null;
        }

        // DAO call
        return userDAO.login(email, password);
    }
}
