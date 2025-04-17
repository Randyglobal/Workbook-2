package com.pluralsight;
import java.util.Scanner;
public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);
    static String firstName;
    static String middleName;
    static String lastName;
    static String suffix;
    static String fullName;
    public static void main(String[] args) {
       getUserInformation();
       displayUserInformation();
       scanner.close();
    }
    public static void getUserInformation() {
        System.out.println("Please enter your First name: ");
        firstName = scanner.nextLine().trim();
        System.out.println("Please enter your Middle name: ");
        middleName = scanner.nextLine().trim();
        System.out.println("Please enter your Last name: ");
        lastName = scanner.nextLine().trim();
        System.out.println("Please enter your Suffix: ");
        suffix = scanner.nextLine().trim();
    }
    public static void displayUserInformation() {
        if(firstName.isEmpty() || lastName.isEmpty()) {
            System.out.println("Please fill all required fields....");
        }else if (firstName.length() > 2 && lastName.length() > 2 || middleName.length() > 2  || suffix.length() > 2) {
                fullName = firstName + " " + middleName + " " + lastName + " " + "," + suffix;
                System.out.println("Full Name is: " + fullName);
        }
    }

}
