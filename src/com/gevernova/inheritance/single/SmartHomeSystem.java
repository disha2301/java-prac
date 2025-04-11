package com.gevernova.inheritance.single;

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
// Subclass representing a Thermostat device with additional attributes
class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Override to display thermostat-specific info
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting are at: " + temperatureSetting + "°C");
    }
}
// main method to demonstrate inheritance
public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat livingRoomThermostat = new Thermostat("THM001", true, 24);

        System.out.println("Device Info:");
        livingRoomThermostat.displayStatus();
    }
}
