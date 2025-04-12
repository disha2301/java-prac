package com.gevernova.oops.ecommerceplatform;

// electronics class (taxable)
class Electronics extends Product implements Taxable{
    public Electronics(int productId, String name, double price){
        super(productId, name, price);
    }
    public double calculateDiscount(){
        return getPrice() * 0.15;
    }
    public double calculateTax(){
        return getPrice() * 0.18;
    }
    public String getTaxDetails(){
        return "Category: Electronics, Tax: 18% GST";
    }
}
