package com.gevernova.oops;

import sun.misc.FpUtils;

//abstract class
abstract class FoodItem{
    private String itemName;
    private double price;
    private int quantity;

    // constructor
    public FoodItem(String itemName, double price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // encapsulated getters
    public String getItemName(){
        return itemName;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    // abstract method
    public abstract double calculateTotalPrice();

    // concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }
}
// interface for applying discount
interface  Discountable{
    void applyDiscount(double percent);
    String getDiscountDetails();
}

// veg item class
class VegItem extends FoodItem implements Discountable{
    private double discountPercent = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discountPercent / 100);
    }
    @Override
    public void applyDiscount(double percent) {
        this.discountPercent = percent;
    }
    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discountPercent + "%";
    }
}
// Non-Veg Item class
class NonVegItem extends FoodItem implements Discountable {
    private double discountPercent = 0;
    private final double nonVegCharge = 20; // Fixed additional charge
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double base = getPrice() * getQuantity();
        double total = base + nonVegCharge;
        return total - (total * discountPercent / 100);
    }

    @Override
    public void applyDiscount(double percent) {
        this.discountPercent = percent;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discountPercent + "% + ₹" + nonVegCharge + " Non-Veg Charge";
    }
}
// Main class to process orders
public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] orderItems = {
                new VegItem("Paneer Butter Masala", 200, 2),
                new NonVegItem("Chicken Biryani", 250, 1)
        };

        // Apply discounts and process
        for (FoodItem item : orderItems) {
            item.getItemDetails();

            if (item instanceof Discountable) {
                ((Discountable) item).applyDiscount(10); // flat 10% discount
                System.out.println(((Discountable) item).getDiscountDetails());
            }

            System.out.println("Total Price: ₹" + item.calculateTotalPrice());
            System.out.println("-------------------------");
        }
    }
}
