package com.gevernova.practicequestions.levelone;

import java.util.Scanner;

class SquareSideLength {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the perimeter of the square from the user
        System.out.print("Enter the perimeter of the square: ");
        double peri = scanner.nextDouble();

        // Calculate the length of one side of the square
        double s = peri / 4;

        // Display the length of the side and perimeter
        System.out.println("The length of the side is " + s + " whose perimeter is " + peri);
    }
}
