package com.gevernova.array.leveltwo;
import java.util.*;
class LargestDigitFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int size = 10;         // Initial size of the array
        int idx = 0;           // Current index in the array
        int max = 0;           // Largest digit
        int secondMax = 0;     // Second largest digit
        int[] d = new int[size]; // Array to store digits

        // Extract digits and store them in the array
        while (num > 0) {
            if (idx == size) {
                // Increase array size by 10
                size += 10;
                int[] temp = new int[size];
                for (int i = 0; i < d.length; i++) {
                    temp[i] = d[i];
                }
                d = temp; // Point d to the new larger array
            }
            d[idx++] = num % 10;
            num /= 10;
        }

        // Find the largest and second largest digits
        for (int i = 0; i < idx; i++) {
            if (d[i] > max) {
                secondMax = max;
                max = d[i];
            } else if (d[i] > secondMax && d[i] != max) {
                secondMax = d[i];
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + secondMax);
        scanner.close();
    }
}
