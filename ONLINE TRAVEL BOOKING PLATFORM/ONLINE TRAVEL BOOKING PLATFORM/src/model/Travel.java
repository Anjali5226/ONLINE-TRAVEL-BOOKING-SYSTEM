package model;

public class Travel {

    private int travelId;
    private String source;
    private String destination;
    private double price;

    public Travel() {}

    public Travel(int travelId, String source, String destination, double price) {
        this.travelId = travelId;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public int getTravelId() {
        return travelId;
    }

    public void setTravelId(int travelId) {
        this.travelId = travelId;
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
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
}
