package com.gevernova.objectmodeling.ecommerceorders;
import java.util.*;
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
