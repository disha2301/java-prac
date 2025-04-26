package com.gevernova.practicequestions.basic;
import java.util.Scanner;

class PowerCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and exponent values
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate power using Math.pow
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}
