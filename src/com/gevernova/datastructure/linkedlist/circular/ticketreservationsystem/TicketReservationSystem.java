package com.gevernova.datastructure.linkedlist.circular.ticketreservationsystem;

public class TicketReservationSystem {
    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();

        // Add tickets
        system.addTicket(101, "Alice", "Inception", "A1", "10:00 AM");
        system.addTicket(102, "Bob", "Avengers", "B2", "1:00 PM");
        system.addTicket(103, "Charlie", "Inception", "A2", "10:00 AM");

        // Display all
        system.displayTickets();

        // Search
        system.searchTicket("Alice");
        system.searchTicket("Inception");

        // Count
        System.out.println("Total tickets booked: " + system.countTickets());

        // Remove a ticket
        system.removeTicket(102);
        system.displayTickets();

        // Try removing a non-existing ticket
        system.removeTicket(    999);
    }
}
