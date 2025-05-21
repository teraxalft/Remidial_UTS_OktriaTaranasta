package com.mycompany.mavenproject3;
//Blm fix ygy 
public class Customer {
    private int id;
    private String username;
    private String email;
    private String address;
    private int phoneNumber;
    private boolean gender;

    public Customer(int id, String username, String email, String address, int phoneNumber) {
    }

    public int getId() { return id; }
    public String getName() { return username; }
    public String getEmail() {return email; }
    public String getAddress() {return address; }
    public int getPhoneNumber() { return phoneNumber; }
    public boolean getGender() { return gender; }
    public void setName(String name) { this.username = name; }
    public void setEmail(String email) { this.email = email; }
    public void setAddress(String address) { this.address = address; }
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getGenderString() {
        return gender ? "Male" : "Female";
    }
}