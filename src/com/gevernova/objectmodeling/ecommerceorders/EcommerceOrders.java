package com.gevernova.objectmodeling.ecommerceorders;

// main method
public class EcommerceOrders {
    public static void main(String[] args) {
        // Create a buyer
        Buyer buyer1 = new Buyer("Disha");

        // Create some products
        Product p1 = new Product("Phone", 20000);
        Product p2 = new Product("Headphones", 1500);

        // Create an order and add products to it
        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);

        // Buyer places the order
        buyer1.placeOrder(order1);
    }
}
