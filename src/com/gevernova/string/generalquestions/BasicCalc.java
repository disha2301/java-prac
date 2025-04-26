package com.gevernova.string.generalquestions;

import java.util.Scanner;

class BasicCalc {

    // Addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return num1 / num2;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        if (choice == 1)
            result = add(num1, num2);
        else if (choice == 2)
            result = subtract(num1, num2);
        else if (choice == 3)
            result = multiply(num1, num2);
        else if (choice == 4)
            result = divide(num1, num2);
        else
            System.out.println("Invalid choice");

        if (choice >= 1 && choice <= 4)
            System.out.println("Result: " + result);
    }
}
