package model;

public class Car {

    private int carId;
    private String model;
    private String location;
    private double pricePerDay;

    public Car() {}

    public Car(int carId, String model, String location, double pricePerDay) {
        this.carId = carId;
        this.model = model;
        this.location = location;
        this.pricePerDay = pricePerDay;
    }

    public int getCarId() {
        return carId;
    }
 
    public void setCarId(int carId) {
        this.carId = carId;
    }
 
    public String getModel() {
        return model;
    }
 
    public void setModel(String model) {
        this.model = model;
    }
 
    public String getLocation() {
        return location;
    }
 
    public void setLocation(String location) {
        this.location = location;
    }
 
    public double getPricePerDay() {
        return pricePerDay;
    }
 
    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
