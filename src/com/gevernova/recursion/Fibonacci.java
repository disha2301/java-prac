package com.gevernova.recursion;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int num) {
        if (num == 0) {
            return 0; // Base case
        } else if (num == 1) {
            return 1; // Base case
        }
        return fibonacci(num - 1) + fibonacci(num - 2); // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);

        scanner.close();
    }
}