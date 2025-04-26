package com.gevernova.practicequestions.levelone;

import java.util.Scanner;

class TotalPriceCalc {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get unit price from the user
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = scanner.nextDouble();

        // Get quantity from the user
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.printf(
            "The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f%n",
            totalPrice, quantity, unitPrice
        );
    }
}
