package com.mycompany.mavenproject3;

public class Customer {
    private int id;
    private String name;
    private boolean gender;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public boolean getGender() { return gender; }
    public void setName(String name) { this.name = name; }

    public String getGenderString() {
        return gender ? "Male" : "Female";
    }
}
