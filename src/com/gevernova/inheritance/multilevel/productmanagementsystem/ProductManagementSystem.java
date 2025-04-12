package com.gevernova.inheritance.multilevel.productmanagementsystem;

// main class to demonstrate functionality
public class ProductManagementSystem {
    public static void main(String[] args) {
        Thermostat livingRoomThermostat = new Thermostat("THM001", true, 24);

        System.out.println("Device Info:");
        livingRoomThermostat.displayStatus();
    }
}