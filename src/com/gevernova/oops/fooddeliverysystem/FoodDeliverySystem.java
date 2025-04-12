package com.gevernova.oops.fooddeliverysystem;

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