package com.gevernova.oops.ecommerceplatform;

// abstract product class
abstract class Product{
    private int productId;
    private String name;
    private double price;

    //constructor
    public Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    // getter and setter methods for encapsulation
    public int getProductId(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    // abstract method
    public abstract double calculateDiscount();
    // common method to print final price
    public void printFinalPrice(){
        double discount = calculateDiscount();
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        double finalPrice = price + tax - discount;
        System.out.print("Product: "+name+"\nPrice: "+price+"\nDiscount: "+discount+"\nTax: "+tax+"\nFinal Price: "+finalPrice);
        if (this instanceof Taxable) {
            System.out.println(((Taxable) this).getTaxDetails());
        }
    }
}
