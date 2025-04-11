package com.gevernova.inheritance.generalquestions;

// Base class representing a general Vehicle
class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display general vehicle info
    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}
// Subclass Car with additional attribute: seatCapacity
class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
// Subclass Truck with additional attribute: loadCapacity
class Truck extends Vehicle {
    int loadCapacity; // in tons

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
// Subclass Motorcycle with additional attribute: hasCarrier
class Motorcycle extends Vehicle {
    boolean hasCarrier;

    Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}
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
