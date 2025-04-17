package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);
    static int serialNumber;
    static String model;
    static String carrier;
    static String phoneNumber;
    static String owner;

    public static void main(String[] args) {
//        getCellPhoneData reads all the literals
        CellPhone cellPhone = getCellPhoneData();
//        And all the literals are been displayed
        displayCellPhoneInformation(cellPhone);
    }
//    function to display
    public static void display(String message){
      System.out.println(message);
    }
//    getting cell phone data
    public static CellPhone getCellPhoneData(){
        display("Please enter your Serial Number: ");
        serialNumber = scanner.nextInt();
        scanner.nextLine();
        display("Please enter your Model: ");
        model = scanner.nextLine();
        display("Please enter your Carrier Choice: ");
        carrier = scanner.nextLine().trim();
        display("Please enter your Phone: ");
        phoneNumber = scanner.nextLine();
        display("Please assign the owner: ");
        owner = scanner.nextLine().trim();
        //    invoking the MCellPhone class(model) to read all the literals entered
        CellPhone cellPhone = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);
        return cellPhone;
    }
//    Passing the CellPhone as parameter to access the literals
    public static void displayCellPhoneInformation(CellPhone cellPhone){
        serialNumber = cellPhone.getSerialNumber();
        display("Your Serial Number is: "+ serialNumber);
        model = cellPhone.getModel();
        display("Your model is: " + model);
        carrier = cellPhone.getCarrier();
        display("Your carrier is: " + carrier);
        phoneNumber = cellPhone.getPhoneNumber();
        display("Your phone number is: " + phoneNumber);
        owner = cellPhone.getOwner();
        display("The owner is: " + owner);
    }

}
