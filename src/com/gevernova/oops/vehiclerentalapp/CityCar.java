package com.gevernova.oops.vehiclerentalapp;

// Class CityCar
class CityCar extends RentalTransport implements InsurancePolicy {
    private String policyNo;

    public CityCar(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "CityCar", rentalRate);
        this.policyNo = policyNo;
    }

    @Override
    public double calcRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calcInsurance() {
        return 600;
    }

    @Override
    public String getInsuranceDetails() {
        return "CityCar Insurance Policy: " + policyNo;
    }
}