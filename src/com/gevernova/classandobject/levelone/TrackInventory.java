package com.gevernova.classandobject.levelone;

public class TrackInventory {
    //attributes
    int itemCode;
    String itemName;
    double price;

    //constructor to initialize item object
    public TrackInventory(int itemCode, String itemName, double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    //method to calculate total cost based on quantity
    public double calcCost(int quantity){
        return price * quantity;
    }
    //method to display item details
    public void printDetails(){
        System.out.println("Item code is "+itemCode+"\nItem name is "+itemName+"\nPrice is $"+price);
    }
    //main method to test the Item class
    public static void main(String[] args){
        //object creation
        TrackInventory obj = new TrackInventory(200, "Electronic", 599.99);
        //display the details
        obj.printDetails();

        // Calculate and display total cost for quantity 3
        int quantity = 3;
        double totalCost = obj.calcCost(quantity);
        System.out.println("Total cost for " + quantity + " units: $" + totalCost);
    }
}
