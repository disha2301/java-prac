package com.gevernova.oops.ridehailingapp;

// CityCab class
class CityCab extends RideVehicle implements LocationService {
    private String currentLocation;

    public CityCab(String rideId, String driverName, double ratePerKm) {
        super(rideId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // base charge
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}