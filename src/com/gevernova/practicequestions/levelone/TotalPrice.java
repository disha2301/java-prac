package com.gevernova.practicequestions.levelone;

import java.util.Scanner;

class TotalPrice {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the unit price from the user
        System.out.print("Enter the unit price (INR): ");
        double up = scanner.nextDouble();

        // Get the quantity from the user
        System.out.print("Enter the quantity to be bought: ");
        int q = scanner.nextInt();

        // Calculate the total price
        double totalPrice = up * q;

        // Display the total price along with the quantity and unit price
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + q + " and unit price is INR " + up);
    }
}
