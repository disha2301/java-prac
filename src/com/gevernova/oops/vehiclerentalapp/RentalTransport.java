package com.gevernova.oops.vehiclerentalapp;

// Abstract class renamed to RentalTransport
abstract class RentalTransport {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public RentalTransport(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calcRentalCost(int days);

    public void displayDetails(int days) {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Rent for " + days + " days is ₹" + calcRentalCost(days));
    }
}