package com.gevernova.oops.ecommerceplatform;
import java.util.*;

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
