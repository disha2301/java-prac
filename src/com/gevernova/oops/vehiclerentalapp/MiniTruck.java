package com.gevernova.oops.vehiclerentalapp;

// Class MiniTruck
class MiniTruck extends RentalTransport implements InsurancePolicy {
    private String policyNo;

    public MiniTruck(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "MiniTruck", rentalRate);
        this.policyNo = policyNo;
    }

    @Override
    public double calcRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calcInsurance() {
        return 1800;
    }

    @Override
    public String getInsuranceDetails() {
        return "MiniTruck Insurance Policy: " + policyNo;
    }
}
