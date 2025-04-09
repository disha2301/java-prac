package com.gevernova.keywords;

class Vehicle {
    // Static variable shared by all vehicles
    static double registrationFee = 5000.0;

    // Final variable for unique registration number
    final String registrationNumber;

    // Instance variables
    String ownerName;
    String vehicleType;

    // Constructor using 'this' to initialize values
    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display vehicle registration details
    void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // Static method to update the registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: ₹" + registrationFee);
    }
}

// Main class to test Vehicle registration
class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("TN10AB1234", "Sahana", "Car");
        Vehicle v2 = new Vehicle("KA05XY9876", "Arjun", "Bike");

        // Use instanceof to check before displaying details
        if (v1 instanceof Vehicle) {
            v1.displayDetails();
        }

        System.out.println();

        if (v2 instanceof Vehicle) {
            v2.displayDetails();
        }

        System.out.println();

        // Update the registration fee
        Vehicle.updateRegistrationFee(6000.0);
    }
}
