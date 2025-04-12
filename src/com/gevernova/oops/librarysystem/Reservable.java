package com.gevernova.oops.librarysystem;

// interface for reservable items
interface Reservable{
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}