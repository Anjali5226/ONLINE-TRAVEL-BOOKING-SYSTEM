package model;

public class Hotel {

    private int hotelId;
    private String name;
    private String location;
    private double pricePerNight;

    public Hotel() {}

    public Hotel(int hotelId, String name, String location, double pricePerNight) {
        this.hotelId = hotelId;
        this.name = name;
        this.location = location;
        this.pricePerNight = pricePerNight;
    }

    public int getHotelId() {
        return hotelId;
    }
 
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getLocation() {
        return location;
    }
 
    public void setLocation(String location) {
        this.location = location;
    }
 
    public double getPricePerNight() {
        return pricePerNight;
    }
 
    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}
