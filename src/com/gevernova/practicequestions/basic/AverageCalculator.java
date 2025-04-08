package com.gevernova.practicequestions.basic;

import java.util.Scanner;
class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter third number: ");
        double c = sc.nextDouble();

        // Calculate average
        double average = (a + b + c) / 3;

        // Display the average
        System.out.println("The average of the three numbers is: " + average);
    }
}
