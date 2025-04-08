package com.gevernova.string.generalquestions;

import java.util.Scanner;
class BasicCalc {

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

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
