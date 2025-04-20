package com.gevernova.datastructure.linkedlist.singly.inventorymanagementsystem;

public class InventoryItem {
    String itemName;
    int itemId;
    int quantity;
    double price;
    InventoryItem next;

    // constructor
    public InventoryItem(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
