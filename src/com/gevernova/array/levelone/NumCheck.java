package com.gevernova.array.levelone;

import java.util.*;

class NumCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 integers
        int num[] = new int[5];

        // Get 5 numbers from user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }

        // Analyze each number in the array
        for (int i = 0; i < 5; i++) {
            if (num[i] > 0) { // Positive number
                if (num[i] % 2 == 0) {
                    System.out.println(num[i] + " is a positive even number.");
                } else {
                    System.out.println(num[i] + " is a positive odd number.");
                }
            } else if (num[i] < 0) { // Negative number
                System.out.println(num[i] + " is a negative number.");
            } else { // Zero
                System.out.println(num[i] + " is zero.");
            }
        }

        // Compare first and last elements
        if (num[0] > num[4]) {
            System.out.println("First element is greater than last element.");
        } else if (num[0] < num[4]) {
            System.out.println("First element is less than last element.");
        } else {
            System.out.println("First and last elements are equal.");
        }
    }
}
