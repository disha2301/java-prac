package com.gevernova.datastructure.linkedlist.singly.inventorymanagementsystem;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryOperations inventory = new InventoryOperations();

        // Add items
        inventory.addLast(new InventoryItem("Mouse", 101, 50, 299.99));
        inventory.addLast(new InventoryItem("Keyboard", 102, 30, 699.49));
        inventory.addFirst(new InventoryItem("Monitor", 103, 20, 7999.00));
        inventory.addAtPosition(new InventoryItem("USB Cable", 104, 100, 99.99), 2);

        // Display inventory
        System.out.println("\n--- Inventory ---");
        inventory.displayInventory();

        // Update quantity
        System.out.println("\n--- Update Quantity (ID 102 to 40) ---");
        inventory.updateQuantity(102, 40);
        inventory.displayInventory();

        // Search
        System.out.println("\n--- Search by ID: 104 ---");
        inventory.searchById(104);

        System.out.println("\n--- Search by Name: Monitor ---");
        inventory.searchByName("Monitor");

        // Total value
        System.out.println("\n--- Total Inventory Value ---");
        inventory.calculateTotalValue();

        // Sort by price ascending
        System.out.println("\n--- Sorted by Price (Ascending) ---");
        inventory.sortInventory("price", true);
        inventory.displayInventory();

        // Remove item
        System.out.println("\n--- Remove Item ID 101 ---");
        inventory.removeById(101);
        inventory.displayInventory();
    }
}
