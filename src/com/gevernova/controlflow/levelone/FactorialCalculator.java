package com.gevernova.controlflow.levelone;
import java.util.Scanner;

class FactorialCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int fact = 1;

        // Check for non-positive number
        if (n < 0) {
            System.out.println("Not a positive number");
        } else {
            // Calculate factorial using for loop
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        }
    }
}
