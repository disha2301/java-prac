package com.gevernova.datastructure.linkedlist.circular.ticketreservationsystem;

public class TicketSystem {
    private TicketNode head = null;

    // Add new ticket at the end
    public void addTicket(int id, String customer, String movie, String seat, String time) {
        TicketNode newTicket = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = newTicket;
            newTicket.next = head;
        } else {
            TicketNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }

        System.out.println("Ticket added successfully for " + customer);
    }

    // Remove a ticket by ID
    public void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode curr = head, prev = null;

        do {
            if (curr.ticketID == id) {
                if (curr == head && curr.next == head) {
                    head = null; // Only one ticket
                } else if (curr == head) {
                    // Remove head, find last node to fix circular link
                    TicketNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Ticket with ID " + id + " removed.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket with ID " + id + " not found.");
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        System.out.println("\nBooked Tickets:");
        do {
            System.out.println("Ticket ID: " + temp.ticketID +
                    ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName +
                    ", Seat: " + temp.seatNumber +
                    ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search ticket by customer name or movie name
    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Found Ticket - ID: " + temp.ticketID +
                        ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName +
                        ", Seat: " + temp.seatNumber +
                        ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No matching ticket found for '" + keyword + "'");
        }
    }

    // Count total tickets
    public int countTickets() {
        if (head == null) return 0;

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}
