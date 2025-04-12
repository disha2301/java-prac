package com.gevernova.oops.ridehailingapp;

// TwoWheeler class
class TwoWheeler extends RideVehicle {
    public TwoWheeler(String rideId, String driverName, double ratePerKm) {
        super(rideId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // no base fee
    }
}
