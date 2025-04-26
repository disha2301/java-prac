package com.gevernova.practicequestions.levelone;

import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        // Create scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Take two numbers as input from the user
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        // Perform the calculations
        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number2 != 0 ? number1 / number2 : Double.NaN; // Avoid division by zero

        // Output the results
        System.out.printf(
            "The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %s%n",
            number1, number2, add, sub, mul, 
            number2 != 0 ? String.format("%.2f", div) : "undefined (division by zero)"
        );
    }
}
