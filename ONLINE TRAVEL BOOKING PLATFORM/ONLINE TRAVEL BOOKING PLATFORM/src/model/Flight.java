package model;

public class Flight {

    private int flightId;
    private String source;
    private String destination;
    private String departureTime;
    private double price;

    public Flight() {}

    public Flight(int flightId, String source, String destination, String departureTime, double price) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.price = price;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getSource() {
        return source;
    }
 
    public void setSource(String source) {
        this.source = source;
    }
 
    public String getDestination() {
        return destination;
    }
 
    public void setDestination(String destination) {
        this.destination = destination;
    }
 
    public String getDepartureTime() {
        return departureTime;
    }
 
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
}
