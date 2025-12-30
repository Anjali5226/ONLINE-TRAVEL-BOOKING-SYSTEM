package dao;

import model.Flight;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightDAO {

    public List<Flight> getAllFlights() {
        List<Flight> flights = new ArrayList<>();
        String sql = "SELECT * FROM flights";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Flight f = new Flight();
                f.setFlightId(rs.getInt("flight_id"));
                f.setSource(rs.getString("source"));
                f.setDestination(rs.getString("destination"));
                f.setDepartureTime(rs.getString("departure_time"));
                f.setPrice(rs.getDouble("price"));
                flights.add(f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flights;
    }

    public Flight getFlightById(int id) {
        Flight f = null;
        String sql = "SELECT * FROM flights WHERE flight_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                f = new Flight();
                f.setFlightId(rs.getInt("flight_id"));
                f.setSource(rs.getString("source"));
                f.setDestination(rs.getString("destination"));
                f.setDepartureTime(rs.getString("departure_time"));
                f.setPrice(rs.getDouble("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
