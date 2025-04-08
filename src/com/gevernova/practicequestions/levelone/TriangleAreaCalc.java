package com.gevernova.practicequestions.levelone;

import java.util.Scanner;

class TriangleAreaCalc {
    public static void main(String[] args) {
        // Scanner object for taking user input
        Scanner sc = new Scanner(System.in);

        // Get the base of the triangle from the user
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = sc.nextDouble();

        // Get the height of the triangle from the user
        System.out.print("Enter the height of the triangle (in cm): ");
        double height = sc.nextDouble();

        // Calculate the area in square cm
        double areaCm = 0.5 * base * height;

        // Convert area from square cm to square inches (1 inch = 2.54 cm)
        double areaIn = areaCm / (2.54 * 2.54);

        // Display the results
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaIn, areaCm);
    }
}
