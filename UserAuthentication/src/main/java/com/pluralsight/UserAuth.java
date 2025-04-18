package com.pluralsight;

public class UserAuth {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String password;
    private String address;

    public UserAuth(String firstName, String lastName, int age, String email, String password, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.password = password;
        this.address = address;
    }

//    getting all users
    public String getFirstName(String firstName) {
        return firstName;
    }
    public String getLastName(String lastName) {
        return lastName;
    }
    public String getEmail(String email) {
        return email;
    }
    public String getPassword(String password) {
        return password;
    }
    public String getAddress(String address) {
        return address;
    }
    public int getAge(int age) {
        return age;
    }

//    setting users
}
