package com.pluralsight;

public class Vehicle {
    private long vehicleId = 0L;
    private String makeModel = "";
    private String color = "";
    private int odometerReading = 0;
    private float price = 0;

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

//    Getters
    public long getVehicleId() {
        return vehicleId;
    }

    public String getColor() {
        return color;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public float getPrice() {
        return price;
    }

//    setters

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
