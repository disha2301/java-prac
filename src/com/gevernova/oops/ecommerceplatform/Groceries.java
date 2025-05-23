package com.gevernova.oops.ecommerceplatform;

// groceries class (non-taxable)
class Groceries extends Product{
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

