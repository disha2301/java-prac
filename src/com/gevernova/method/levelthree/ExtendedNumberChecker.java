package com.gevernova.method.levelthree;

import java.util.Scanner;

public class ExtendedNumberChecker {

    // Method to count the number of digits
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        int digitSum = sumOfDigits(digits);
        return digitSum != 0 && number % digitSum == 0;
    }

    // Method to find frequency of each digit (0-9)
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 0 to 9

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        for (int d : digits) {
            frequency[d][1]++;
        }

        return frequency;
    }

    // Main method to test everything
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = getDigits(number, count);

        int sum = sumOfDigits(digits);
        int squareSum = sumOfSquares(digits);
        boolean isHarshadNumber = isHarshad(number, digits);
        int[][] freq = digitFrequency(digits);

        // Display results
        System.out.println("Total Digits: " + count);
        System.out.println("Sum of Digits: " + sum);
        System.out.println("Sum of Squares of Digits: " + squareSum);
        System.out.println("Is Harshad Number: " + (isHarshadNumber ? "Yes" : "No"));

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + ": " + freq[i][1] + " time(s)");
            }
        }
    }
}
