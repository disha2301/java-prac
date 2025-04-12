package com.gevernova.oops.librarysystem;

// Main class to demonstrate polymorphism
public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
                new Book("B001", "The Alchemist", "Paulo Coelho"),
                new Magazine("M001", "National Geographic", "Editorial"),
                new DVD("D001", "Interstellar", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem("Disha");
                System.out.println("Available after reservation: " + r.checkAvailability());
            }

            System.out.println("-----------------------------");
        }
    }
}
