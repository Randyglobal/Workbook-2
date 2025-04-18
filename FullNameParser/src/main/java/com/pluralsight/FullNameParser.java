package com.pluralsight;
import java.util.Scanner;
public class FullNameParser {
    static String firstName;
    static String middleName;
    static String lastName;
    static String fullName;
    static int partName;
    public static void main(String[] args) {
        getUserFullName();
        getUserFirstName();
        getUserMiddleName();
    }

    public static void display(String message) {
        System.out.println(message);
    }

    public static void getUserFullName() {
        System.out.println("Please enter Full Name: ");
        Scanner scanner = new Scanner(System.in);
        fullName = scanner.nextLine();
        display("Full Name: " + fullName);
        scanner.close();
    }
    public static void getUserFirstName() {
        partName = fullName.indexOf(" ");
        firstName = fullName.substring(0, partName);
        display("First Name: " + firstName);
    }

    public static void getUserMiddleName() {
//        in case of a last name
        int middleNameIndex = fullName.lastIndexOf(" ");
        display("Middle Name Index: " + middleNameIndex);
        if( partName != middleNameIndex){
            middleName = fullName.substring(partName + 1, middleNameIndex);
            lastName = fullName.substring(middleNameIndex + 1);
            display("Middle Name: " + middleName);
        }
//        end
//        setting the lastName
        lastName = fullName.substring(middleNameIndex + 1);
        display("Last Name: " + lastName);

//        middle name condition

    }
}
