package controller;

import dao.FlightDAO;
import dao.HotelDAO;
import model.Flight;
import model.Hotel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String type = req.getParameter("type"); // flight / hotel

        if ("flight".equalsIgnoreCase(type)) {
            FlightDAO dao = new FlightDAO();
            List<Flight> flights = dao.getAllFlights();
            req.setAttribute("results", flights);
        }
        else if ("hotel".equalsIgnoreCase(type)) {
            HotelDAO dao = new HotelDAO();
            List<Hotel> hotels = dao.getAllHotels();
            req.setAttribute("results", hotels);
        }

        req.getRequestDispatcher("searchResults.jsp").forward(req, resp);
    }
}
