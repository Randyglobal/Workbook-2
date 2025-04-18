package com.pluralsight;

import java.util.Scanner;

public class UserAuthApplication {
    static Scanner scanner = new Scanner(System.in);
    static String firstName;
    static String lastName;
    static int age;
    static String email;
    static String password;
    static String address;
    static String newEmail;
    static String newPassword;
    public static void main(String[] args) {

        UserAuth userAuth = getUserInfo();
        displayUserAuth(userAuth);
        userSignIn();
        userValidation(userAuth);
        scanner.close();
    }
    public static String display(String message){
        System.out.println(message);
        return message;
    }
//    public static String displayResult(String message, String firstName, String lastName){
//        System.out.printf(message, firstName, lastName);
//        return message;
//    }
    public static UserAuth getUserInfo(){
        display("Please enter your First Name: ");
        firstName = scanner.nextLine().trim();
        display("Please enter your Last Name: ");
        lastName = scanner.nextLine().trim();
        display("Please enter your email: ");
        email = scanner.nextLine().trim();
        display("Please enter your password: ");
        password = scanner.nextLine().trim();
        display("Please enter your Address: ");
        address = scanner.nextLine().trim();
        display("Please enter your Age: ");
        age = scanner.nextInt();

        UserAuth userAuth = new UserAuth(firstName, lastName, age, email, password, address);
        return userAuth;
    }
    public static void displayUserAuth(UserAuth userAuth){
        firstName = userAuth.getFirstName(firstName);
        lastName = userAuth.getLastName(lastName);
        email = userAuth.getEmail(email);
        password = userAuth.getPassword(password);
        address = userAuth.getAddress(address);
        age = userAuth.getAge(age);
        display("Username: " + firstName + " " + lastName);
        display("Age: " + age);
        display("Email: " + email);
        display("Address: " + address);
    }

   public static UserAuth userSignIn(){
       display("Please enter your email: ");
       newEmail = scanner.nextLine().trim();
       scanner.nextLine();
       display("Please enter your password: ");
       newPassword = scanner.nextLine().trim();

       UserAuth userAuth = new UserAuth(firstName, lastName, age, email, password, address);
       return userAuth;
   }
   public static void userValidation(UserAuth userAuth){
        if (newEmail.equalsIgnoreCase(userAuth.getEmail(email)) && newPassword.equalsIgnoreCase(userAuth.getPassword(password))){
            display("Welcome back " + firstName + " " + lastName);
        }else{
            display("Invalid Credentials");
        }
   }
}
