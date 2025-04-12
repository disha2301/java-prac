package com.gevernova.oops.vehiclerentalapp;

public class VehicleRentalApp {
    public static void main(String[] args) {
        RentalTransport[] vehicles = {
                new CityCar("CAR456", 1600, "POL123CAR"),
                new Scooter("SCOOT789", 500),
                new MiniTruck("TRUCK321", 4500, "POL456TRK")
        };

        for (RentalTransport v : vehicles) {
            v.displayDetails(3); // 3 days rental

            if (v instanceof InsurancePolicy) {
                InsurancePolicy ip = (InsurancePolicy) v;
                System.out.println("Insurance: ₹" + ip.calcInsurance());
                System.out.println(ip.getInsuranceDetails());
            }

            System.out.println("---------------------------");
        }
    }
}
