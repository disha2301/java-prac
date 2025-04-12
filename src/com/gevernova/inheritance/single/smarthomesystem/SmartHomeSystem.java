package com.gevernova.inheritance.single.smarthomesystem;

// main method to demonstrate inheritance
public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat livingRoomThermostat = new Thermostat("THM001", true, 24);

        System.out.println("Device Info:");
        livingRoomThermostat.displayStatus();
    }
}