package com.gevernova.array.leveltwo;
import java.util.*;
class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int maxDigit = 10; // Maximum number of digits to store
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (num > 0) {
            if (index == maxDigit) {
                break; // Stop if maxDigit is reached
            }
            digits[index] = num % 10;
            num /= 10;
            index++;
        }

        // Initialize largest and second largest digits
        int largest = 0, secondLargest = 0;

        // Loop through the array to find the two largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
