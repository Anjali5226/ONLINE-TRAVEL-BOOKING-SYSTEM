package dao;

import model.Travel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TravelDAO {

    public List<Travel> getAllTravels() {
        List<Travel> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT * FROM travel";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Travel t = new Travel();
                t.setTravelId(rs.getInt("travel_id"));
                t.setSource(rs.getString("source"));
                t.setDestination(rs.getString("destination"));
                t.setPrice(rs.getDouble("price"));
                list.add(t);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
