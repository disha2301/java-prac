package com.gevernova.objectdesign.ShoppingApp;
import java.util.ArrayList;

// Class to represent a Product with its name and price
class Product {
    private String name;
    private double price;

    // Constructor to initialize the product's name and price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter method for product price
    public double getPrice() {
        return price;
    }

    // Getter method for product name
    public String getName() {
        return name;
    }
}