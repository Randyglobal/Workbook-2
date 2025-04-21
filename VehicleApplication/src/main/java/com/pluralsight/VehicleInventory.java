package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    static Scanner scanner = new Scanner(System.in);
    static String[][] vehicles = {
            {"101121", "Ford Explorer", "Red", "45000", "13500"},
            {"101122", "Toyota Camry", "Blue", "60000", "11000"},
            {"101123", "Chevrolet Malibu", "Black", "50000", "9700"},
            {"101124", "Honda Civic", "White", "70000", "7500"},
            {"101125", "Subaru Outback", "Green", "55000", "14500"},
            {"101126", "Jeep Wrangler", "Yellow", "30000", "16000"},
    };
    public static void main(String[] args) {
        int counter = 0;

        counter = vehicles.length;
        display("" + counter);
        while ( true ){
            display("What do you want to do?");
            display(" 1 - List all vehicles");
            display(" 2 - Search by make/model");
            display(" 3 - Search by price range");
            display(" 4 - Search by color");
            display(" 5 - Add a vehicle");
            display(" 6 - Quit");
            display("Enter your command: ");
            int command = scanner.nextInt();
            switch(command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByPrice();
                    break;
                case 4:
                    findVehiclesByColor();
                    break;
                case 5:
                    addAVehicle();
                    break;
                case 6:
                    return;
            }
            }
        }
        public static String display(String message){
        System.out.println(message);
        return message;
        }
    public static void listAllVehicles(){
        display("-------------All Vehicles----------");
      for (String[] vehicle : vehicles){
          display("vehicles include: " + "\n" +
                  "VehicleId: " + vehicle[0] + "\n" +
                   "MarkModel: " + vehicle[1] + "\n" +
                    "Vehicle Color: " + vehicle[2] + "\n" +
                   "Odometer Reading: " + vehicle[3] + "\n" +
                    "Vehicle Price: " + vehicle[4] + "\n"
          );
      }
    }
    public static void findVehiclesByPrice(){
        display("Enter the Price to search for: ");
        int enteredPrice = scanner.nextInt();
        boolean found = false;
        display("-------------Available Vehicles----------");
        for (String[] vehicle : vehicles) {
            int price = Integer.parseInt(vehicle[4]);
            if (price >=enteredPrice){
                display("vehicles Prices  are: " + "\n" +
                        "VehicleId: " + vehicle[0] + "\n" +
                        "MarkModel: " + vehicle[1] + "\n" +
                        "Vehicle Color: " + vehicle[2] + "\n" +
                        "Odometer Reading: " + vehicle[3] + "\n" +
                        "Vehicle Price: " + vehicle[4] + "\n"
                );
                found = true;
            }
            if (!found){
               display("Vehicle not fount");
            }

        }
    }
    public static void findVehiclesByColor() {
        System.out.print("Enter Preferred Color: ");
        String enteredColor = scanner.nextLine().trim();
        boolean found = false;
        System.out.println("-------------Available Vehicles----------");
        for (String[] vehicle : vehicles) {
            String color = vehicle[2];
            if (color.equalsIgnoreCase(enteredColor)) {
                System.out.println("vehicles Prices  are: " +
                        "VehicleId: " + vehicle[0] + "\n" +
                        "MarkModel: " + vehicle[1] + "\n" +
                        "Vehicle Color: " + vehicle[2] + "\n" +
                        "Odometer Reading: " + vehicle[3] + "\n" +
                        "Vehicle Price: " + vehicle[4] + "\n");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles found with the color '" + enteredColor + "'.");
        }
    }
    public static void addAVehicle(){

    }
    }

