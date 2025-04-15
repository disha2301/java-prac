package com.gevernova.objectdesign.ShoppingApp;

// Class to test the Customer and Product scenario
public class ShoppingApp {
    public static void main(String[] args) {
        // Creating a new customer object
        Customer customer = new Customer("Disha");

        // Creating products and adding them to the customer's purchase list
        customer.addProduct(new Product("Laptop", 999.99));
        customer.addProduct(new Product("Headphones", 199.49));
        customer.addProduct(new Product("Mouse", 25.75));

        // Generating and displaying the bill for the customer
        BillGenerator.generateBill(customer);
    }
}