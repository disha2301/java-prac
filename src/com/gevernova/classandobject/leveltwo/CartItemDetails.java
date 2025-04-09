package com.gevernova.classandobject.leveltwo;

public class CartItemDetails {
    String itemName;
    double price;
    int quantity;

    public CartItemDetails(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate cost
    public double getTotalCost() {
        return price * quantity;
    }

    public static void main(String[] args) {
        // Add items
        CartItemDetails item1 = new CartItemDetails("Book", 100.0, 2);
        CartItemDetails item2 = new CartItemDetails("Pen", 20.0, 3);

        // Show added items
        System.out.println("Items in Cart:");
        System.out.println(item1.itemName + " x" + item1.quantity + " = ₹" + item1.getTotalCost());
        System.out.println(item2.itemName + " x" + item2.quantity + " = ₹" + item2.getTotalCost());

        // Calculate total cost
        double totalCost = item1.getTotalCost() + item2.getTotalCost();
        System.out.println("Total Cost: ₹" + totalCost);

        // Remove item2 (Pen)
        item2 = null;
        System.out.println("\nRemoved: Pen");

        // Recalculate total
        totalCost = item1.getTotalCost();
        System.out.println("Updated Total Cost: ₹" + totalCost);
    }
}
