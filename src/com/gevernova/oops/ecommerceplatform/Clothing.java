package com.gevernova.oops.ecommerceplatform;
// Clothing class (taxable)
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.25; // 25% discount
    }

    public double calculateTax() {
        return getPrice() * 0.12; // 12% tax
    }

    public String getTaxDetails() {
        return "Category: Clothing, Tax: 12% GST";
    }
}
