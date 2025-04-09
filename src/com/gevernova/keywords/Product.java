package com.gevernova.keywords;

class Product {
    // Static variable shared across all products
    static double discount = 10.0; // in percent

    // Final variable to ensure unique, immutable product ID
    final int productID;

    // Instance variables
    String productName;
    double price;
    int quantity;

    // Constructor using 'this' to initialize variables
    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost after discount
    double calculateTotalPrice() {
        double total = price * quantity;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }

    // Method to display product details
    void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total Price after Discount: ₹" + calculateTotalPrice());
    }

    // Static method to update discount for all products
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated discount: " + discount + "%");
    }
}

// Main class to test the system
class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product(1001, "Wireless Mouse", 799.0, 2);
        Product p2 = new Product(1002, "Keyboard", 1299.0, 1);

        // Validate instance before processing
        if (p1 instanceof Product) {
            p1.displayDetails();
        }

        System.out.println();

        if (p2 instanceof Product) {
            p2.displayDetails();
        }

        System.out.println();

        // Update discount using static method
        Product.updateDiscount(15.0);

        System.out.println("\nAfter updating discount:\n");

        if (p1 instanceof Product) {
            p1.displayDetails();
        }

        System.out.println();

        if (p2 instanceof Product) {
            p2.displayDetails();
        }
    }
}