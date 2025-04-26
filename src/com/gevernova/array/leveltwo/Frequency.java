package com.gevernova.array.leveltwo;
import java.util.*;
class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] freq = new int[10]; // Array to store frequency of digits (0-9)

        // Extract digits and update their frequency
        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }

        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }
    }
}
