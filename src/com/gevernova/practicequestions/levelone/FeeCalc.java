package com.gevernova.practicequestions.levelone;

import java.util.Scanner;

class FeeCalc {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the student fee and discount percentage from the user
        System.out.print("Enter the student fee (INR): ");
        double fee = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double disPer = scanner.nextDouble();

        // Calculate the discount amount
        double disAmt = (fee * disPer) / 100;

        // Calculate the final fee after applying the discount
        double finalFee = fee - disAmt;

        // Display the discount amount and the final discounted fee
        System.out.printf(
            "The discount amount is INR %.2f and final discounted fee is INR %.2f%n",
            disAmt, finalFee
        );
    }
}
