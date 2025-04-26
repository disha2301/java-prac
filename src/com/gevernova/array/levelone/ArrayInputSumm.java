package com.gevernova.array.levelone;

import java.util.*;

class ArrayInputSumm {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store up to 10 double values
        double number[] = new double[10];

        // Variable to hold the sum of numbers
        double total = 0.0;

        // Counter to track how many valid numbers have been entered
        int i = 0;

        // Loop to read user input until 0/negative number is entered or array is full
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble();

            // Stop if number is 0 or negative, or array is full
            if (num <= 0 || i == 10) {
                break;
            }

            // Store the number in array and increment the index
            number[i] = num;
            i++;
        }

        // Display the numbers entered by the user
        System.out.println("\nNumbers entered:");
        for (int j = 0; j < i; j++) {
            System.out.print(number[j] + " ");
            total += number[j]; // Add each number to the total
        }

        // Display the total sum of entered numbers
        System.out.println("\nSum of all numbers: " + total);
    }
}
