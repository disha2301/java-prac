package com.gevernova.practicequestions.levelone;

import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Get the base of the triangle from the user
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = sc.nextDouble();

        // Get the height of the triangle from the user
        System.out.print("Enter the height of the triangle (in cm): ");
        double height = sc.nextDouble();

        // Conversion factor from cm² to in² (1 cm² = 0.1550 in²)
        double cmToInches = 0.1550;

        // Calculate the area of the triangle in square cm
        double areaCm = 0.5 * base * height;

        // Convert the area from square cm to square inches
        double areaIn = areaCm * cmToInches;

        // Display the area in both cm² and in²
        System.out.printf("The area of the triangle is %.2f cm² and %.2f in²%n", areaCm, areaIn);
    }
}
