package com.gevernova.objectdesign.ShoppingApp;
import java.util.List;
import java.util.ArrayList;

class Customer {
    private String name;
    private List<Product> products;

    // Constructor to initialize the customer's name and their product list
    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Method to add a product to the customer's purchased items
    public void addProduct(Product p) {
        products.add(p);
    }

    // Getter method for the customer's purchased products
    public List<Product> getProducts() {
        return products;
    }

    // Getter method for customer's name
    public String getName() {
        return name;
    }
}
