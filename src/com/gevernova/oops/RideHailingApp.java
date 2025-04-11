package com.gevernova.oops;

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

// Interface for location-based functionality
interface LocationService {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

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

// Main class
public class RideHailingApp {
    public static void main(String[] args) {
        RideVehicle[] rides = {
                new CityCab("CAB101", "Ravi", 18.5),
                new TwoWheeler("BIKE202", "Anu", 12.0),
                new AutoRickshaw("AUTO303", "Kumar", 14.5)
        };

        double distanceToTravel = 10.0; // in km

        for (RideVehicle ride : rides) {
            ride.getVehicleDetails();
            System.out.println("Fare for " + distanceToTravel + " km: ₹" + ride.calculateFare(distanceToTravel));

            if (ride instanceof LocationService) {
                LocationService gps = (LocationService) ride;
                gps.updateLocation("Downtown");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }

            System.out.println("----------------------------");
        }
    }
}
