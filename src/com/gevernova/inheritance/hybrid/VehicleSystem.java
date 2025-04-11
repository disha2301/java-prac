package com.gevernova.inheritance.hybrid;
// Interface for refuelable vehicles
interface Refuelable {
    void refuel(); // Method to be implemented by refuelable vehicles
}
// Superclass with common attributes
class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}
// Subclass representing electric vehicles
class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println(model + " is charging. Battery capacity: " + batteryCapacity + " kWh");
    }
}
// Subclass representing petrol vehicles, implements Refuelable interface
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity;

    PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling. Tank capacity: " + fuelTankCapacity + " liters");
    }
}
// main class
public class VehicleSystem {
    public static void main(String[] args) {
        // Create objects
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180, 40);

        // Display info and behaviors
        ev.displayInfo();
        ev.charge();

        System.out.println();

        pv.displayInfo();
        pv.refuel();
    }
}
