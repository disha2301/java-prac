package com.gevernova.oops.ridehailingapp;

// Interface for location-based functionality
interface LocationService {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
