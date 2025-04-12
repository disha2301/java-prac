package com.gevernova.oops.ridehailingapp;
// AutoRickshaw class
class AutoRickshaw extends RideVehicle implements LocationService {
    private String currentLocation;

    public AutoRickshaw(String rideId, String driverName, double ratePerKm) {
        super(rideId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20;
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

