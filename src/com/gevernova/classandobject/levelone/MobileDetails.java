package com.gevernova.classandobject.levelone;

public class MobileDetails {

    // Attributes
    String brand;
    String model;
    double price;

    // Constructor to initialize MobilePhone object
    public MobileDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayPhoneDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : $" + price);
    }

    // Main method to test the MobilePhone class
    public static void main(String[] args) {
        // Creating a mobile phone object
        MobileDetails obj = new MobileDetails("Samsung", "Galaxy S23", 79999.00);

        // Displaying the phone details
        obj.displayPhoneDetails();
    }


}
