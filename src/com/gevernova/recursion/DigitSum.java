package com.gevernova.recursion;

import java.util.Scanner;

public class DigitSum {

    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumOfDigits(num / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = sumOfDigits(Math.abs(number)); // Handle negative numbers if needed
        System.out.println("Sum of digits of " + number + " is: " + result);

        scanner.close();
    }
}
