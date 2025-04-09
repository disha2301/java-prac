package com.gevernova.constructorsandvariables.variables;

public class Vehicle {

    // Instance variables (unique for each vehicle)
    String ownerName;
    String vehicleType;

    // Class variable (shared among all vehicles)
    static double registrationFee = 100.0;

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name      : " + ownerName);
        System.out.println("Vehicle Type    : " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create two vehicle objects
        Vehicle v1 = new Vehicle("Disha Yadav", "Car");
        Vehicle v2 = new Vehicle("Abdul Ahad", "Scooter");

        // Display vehicle details before updating fee
        System.out.println("Before Fee Update:\n");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        // Update the registration fee
        Vehicle.updateRegistrationFee(2000.0);

        // Display vehicle details after updating fee
        System.out.println("\nAfter Fee Update:\n");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}

