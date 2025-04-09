package com.gevernova.classandobject.leveltwo;

public class BookMovieTickets {

    // Attributes
    String movieName;
    String seatNumber;
    double price;

    // Constructor (movie name provided, others set through booking)
    public BookMovieTickets(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Booked";
        this.price = 0.0;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void printDetails() {
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price      : ₹" + price);
    }

    // Main method to test the MovieTicket class
    public static void main(String[] args) {
        // Creating a ticket for a movie
        BookMovieTickets obj = new BookMovieTickets("Inception");

        // Booking the ticket
        obj.bookTicket("A10", 250.00);

        // Displaying ticket details
        obj.printDetails();
    }
}
