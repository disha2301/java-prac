package com.gevernova.objectmodeling.ecommerceorders;

// Class to represent a Buyer who can place an order
class Buyer {
    String name;

    Buyer(String name) {
        this.name = name;
    }

    // Method for the buyer to place an order
    void placeOrder(Order order) {
        System.out.println(name + " placed an order:");
        order.showOrderDetails();  // Delegate display to the order
    }
}