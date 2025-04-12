package com.gevernova.oops.vehiclerentalapp;

// Class Scooter
class Scooter extends RentalTransport {
    public Scooter(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Scooter", rentalRate);
    }

    @Override
    public double calcRentalCost(int days) {
        return getRentalRate() * days;
    }
}
