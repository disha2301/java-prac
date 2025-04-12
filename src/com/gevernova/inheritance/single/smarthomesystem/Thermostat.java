package com.gevernova.inheritance.single.smarthomesystem;

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
