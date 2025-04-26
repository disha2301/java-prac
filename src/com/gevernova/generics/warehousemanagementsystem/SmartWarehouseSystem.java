package com.gevernova.generics.warehousemanagementsystem;

public class SmartWarehouseSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Apple"));
        groceryStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Electronics:");
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        WarehouseUtils.displayItems(groceryStorage.getItems());

        System.out.println("\nFurniture:");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}
