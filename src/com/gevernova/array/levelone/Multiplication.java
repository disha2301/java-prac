package com.gevernova.array.levelone;

import java.util.*;

public class Multiplication{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Array to store multiplication results from 6 to 9 (4 values)
        int res[] = new int[4];

        // Calculate and store results in the array
        for (int i = 6; i <= 9; i++) {
            res[i - 6] = num * i;
        }

        // Display the multiplication results
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " times " + i + " is " + res[i - 6]);
        }
    }
}
