package com.gevernova.practicequestions.basic;
import java.util.Scanner;
class TemperatureConversion {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter temperature in Celsius
        System.out.println("Enter temperature in Celsius:");
        double c = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula: F = (C × 9/5) + 32
        double f = (c * 9 / 5) + 32;

        // Display the result
        System.out.println("Temperature in Fahrenheit is " + f);
    }
}
