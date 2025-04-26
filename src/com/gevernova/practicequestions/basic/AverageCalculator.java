package com.gevernova.practicequestions.basic;

import java.util.Scanner;

class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double thirdNumber = scanner.nextDouble();

        // Calculate the average
        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        // Display the average
        System.out.println("The average of the three numbers is: " + average);
    }
}
