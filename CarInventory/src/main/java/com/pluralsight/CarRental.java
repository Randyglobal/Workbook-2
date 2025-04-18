package com.pluralsight;

public class CarRental {
    public static void main(String[] args) {
     Vehicle vehicle = new Vehicle(12, "BMW2009");
      display(vehicle.toString());
    }
    public static String display(String message){
       System.out.println(message);
       return message;
    }
}
