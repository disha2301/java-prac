package com.gevernova.objectmodeling;

import java.util.*;

// Represents a product with a name and price
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// Class to represent an Order which contains multiple products
class Order {
    int orderId;
    List<Product> productList;

    Order(int orderId) {
        this.orderId = orderId;
        this.productList = new ArrayList<>();
    }

    // Method to add a product to the order
    void addProduct(Product product) {
        productList.add(product);
    }

    // Method to display order details including total price
    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;
        for (Product p : productList) {
            System.out.println("- " + p.name + ": ₹" + p.price);
            total += p.price;
        }
        System.out.println("Total: ₹" + total);
    }
}

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

// main method
public class EcommerceOrders {
    public static void main(String[] args) {
        // Create a buyer
        Buyer buyer1 = new Buyer("Disha");

        // Create some products
        Product p1 = new Product("Phone", 20000);
        Product p2 = new Product("Headphones", 1500);

        // Create an order and add products to it
        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);

        // Buyer places the order
        buyer1.placeOrder(order1);
    }
}
