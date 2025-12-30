package dao;

import model.Hotel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HotelDAO {

    public List<Hotel> getAllHotels() {
        List<Hotel> hotels = new ArrayList<>();
        String sql = "SELECT * FROM hotels";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Hotel h = new Hotel();
                h.setHotelId(rs.getInt("hotel_id"));
                h.setName(rs.getString("name"));
                h.setLocation(rs.getString("location"));
                h.setPricePerNight(rs.getDouble("price_per_night"));
                hotels.add(h);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hotels;
    }

    public Hotel getHotelById(int id) {
        Hotel h = null;
        String sql = "SELECT * FROM hotels WHERE hotel_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                h = new Hotel();
                h.setHotelId(rs.getInt("hotel_id"));
                h.setName(rs.getString("name"));
                h.setLocation(rs.getString("location"));
                h.setPricePerNight(rs.getDouble("price_per_night"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return h;
    }
}
