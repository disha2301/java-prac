package com.gevernova.inheritance.single.smarthomesystem;

// Superclass representing a generic smart home device
class Device {
    String deviceId;
    boolean status;  // true = ON, false = OFF

    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}