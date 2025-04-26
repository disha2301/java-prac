package com.gevernova.array.levelone;

import java.util.*;

class DynamicFactorFinder {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int maxFactor = 10;                    // Initial size of the factors array
        int factors[] = new int[maxFactor];    // Array to store the factors
        int index = 0;                         // Keeps track of the number of factors found

        // Loop to find all factors of the given number
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) { // Check if 'i' is a factor
                // If array is full, double its size dynamically
                if (index == maxFactor) {
                    maxFactor *= 2;            // Double the array size
                    int temp[] = new int[maxFactor];
                    // Copy existing values to the new array
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // Replace old array with the larger one
                }
                // Store the factor
                factors[index++] = i;
            }
        }

        // Print all stored factors
        System.out.print("Factors of " + num + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
