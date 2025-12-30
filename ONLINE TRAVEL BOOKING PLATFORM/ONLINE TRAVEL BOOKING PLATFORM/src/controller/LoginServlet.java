package controller;

import dao.UserDAO;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        UserDAO userDAO = new UserDAO();
        User user = userDAO.login(email, password);

        if (user != null) {
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            resp.sendRedirect("dashboard.jsp");
        } else {
            req.setAttribute("error", "Invalid Email or Password");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
