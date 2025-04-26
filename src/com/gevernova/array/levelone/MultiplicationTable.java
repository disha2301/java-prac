package com.gevernova.array.levelone;

import java.util.*;

public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Create an array to store the multiplication results from 1 to 10
        int table[] = new int[10];

        // Calculate and store multiplication results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
        }

        // Display the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " times " + i + " is " + table[i - 1]);
        }
    }
}
