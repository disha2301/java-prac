package com.gevernova.recursion;

import java.util.Scanner;

public class PowerCalculator {

    public static long power(int num, int power) {
        if (power == 0) {
            return 1; // Base case: any number to the power 0 is 1
        }
        return num * power(num, power - 1); // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter exponent (b): ");
        int b = scanner.nextInt();

        long result = power(a, b);
        System.out.println(a + " raised to the power " + b + " is: " + result);

        scanner.close();
    }
}
