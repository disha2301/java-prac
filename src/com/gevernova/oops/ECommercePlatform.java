package com.gevernova.oops;
import java.util.*;

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

// taxable interface
interface Taxable{
    double calculateTax();
    String getTaxDetails();
}

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
// groceries class (non-taxable)
class Groceries extends Product{
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

// main class
public class ECommercePlatform{
    public static void main(String[] args){
        List<Product> productList = new ArrayList<>();
        productList.add(new Electronics(201, "Laptop", 70000));
        productList.add(new Clothing(202, "Jeans", 2000));
        productList.add(new Groceries(203, "Apples (1kg)", 180));
        for(Product p : productList){
            p.printFinalPrice();
        }
    }
}
