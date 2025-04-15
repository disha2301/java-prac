package com.gevernova.objectdesign.ShoppingApp;
import java.util.ArrayList;
import java.util.List;


// Class to calculate the total price for a customer's purchases
class BillGenerator {
    // Method to generate and calculate the total bill for a customer
    public static void generateBill(Customer customer) {
        List<Product> products = customer.getProducts();
        double total = 0;

        // Summing up the price of all products purchased by the customer
        for (Product p : products) {
            total += p.getPrice();
        }

        // Displaying the result
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products purchased:");
        for (Product p : products) {
            System.out.println("- " + p.getName() + ": $" + p.getPrice());
        }
        System.out.printf("Total Bill: $%.2f\n", total);
    }
}
