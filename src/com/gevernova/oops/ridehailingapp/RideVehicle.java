package com.gevernova.oops.ridehailingapp;

// Abstract class for common vehicle details
abstract class RideVehicle {
    private String rideId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String rideId, String driverName, double ratePerKm) {
        this.rideId = rideId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getRideId() {
        return rideId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Driver: " + driverName);
        System.out.println("Ride ID: " + rideId);
        System.out.println("Base Rate per KM: ₹" + ratePerKm);
    }
}