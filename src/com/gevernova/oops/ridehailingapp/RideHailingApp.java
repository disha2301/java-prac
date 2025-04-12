package com.gevernova.oops.ridehailingapp;
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
