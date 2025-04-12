package com.gevernova.oops.fooddeliverysystem;

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
