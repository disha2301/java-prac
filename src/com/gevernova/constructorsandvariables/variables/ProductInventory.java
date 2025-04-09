package com.gevernova.constructorsandvariables.variables;

public class ProductInventory {

    //instance variables
    String productName;
    double price;

    //class variable
    static int totalProducts = 0;

    // constructor to initialize product details and update the total amount
    public ProductInventory(String productName, double price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // instance method to display the product details
    public void printDetail(){
        System.out.println("Product Name: " + productName);
        System.out.println("Price       : ₹" + price);
    }

    // class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Creating two product objects
        ProductInventory obj1 = new ProductInventory("Laptop", 55000.0);
        ProductInventory obj2 = new ProductInventory("Mouse", 799.0);

        // Displaying details of each product
        System.out.println("\nProduct 1 Details:");
        obj1.printDetail();

        System.out.println("\nProduct 2 Details:");
        obj2.printDetail();

        // Displaying total number of products
        ProductInventory.displayTotalProducts();
    }

}
