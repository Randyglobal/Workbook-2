package com.pluralsight;

public class Vehicle {
    private int id;
    private String makeModel;

    public Vehicle(int id, String makeModel) {
        this.id = id;
        this.makeModel = makeModel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id: "+ id +
                ", Make Model: " + makeModel +
                "}";
    }
}
