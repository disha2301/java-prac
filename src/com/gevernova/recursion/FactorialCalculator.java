package com.gevernova.recursion;

public class FactorialCalculator {

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1; // Base case
        }
        return num * factorial(num - 1); // Recursive case
    }

    public static void main(String[] args) {
        int number = 5;
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
