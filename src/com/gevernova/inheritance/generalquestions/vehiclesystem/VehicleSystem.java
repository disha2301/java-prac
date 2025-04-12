package com.gevernova.inheritance.generalquestions.vehiclesystem;

// Main class to demonstrate polymorphism
public class VehicleSystem {
    public static void main(String[] args) {
        // Create different types of vehicles
        Vehicle v1 = new Car(180, "Petrol", 5);
        Vehicle v2 = new Truck(120, "Diesel", 10);
        Vehicle v3 = new Motorcycle(100, "Petrol", true);

        // Store them in a Vehicle array (polymorphism)
        Vehicle[] vehicles = {v1, v2, v3};

        // Display information of each vehicle using polymorphism
        for (Vehicle v : vehicles) {
            System.out.println("\nVehicle Details:");
            v.displayInfo();
        }
    }
}