package com.gevernova.oops;

// Abstract class renamed to RentalTransport
abstract class RentalTransport {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public RentalTransport(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calcRentalCost(int days);

    public void displayDetails(int days) {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Rent for " + days + " days is ₹" + calcRentalCost(days));
    }
}

// Renamed interface from Insurable to InsurancePolicy
interface InsurancePolicy {
    double calcInsurance();
    String getInsuranceDetails();
}

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
